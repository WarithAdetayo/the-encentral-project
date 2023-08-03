package com.encentral.staffsync.configuration.permission.impl;

import com.encentral.staffsync.configuration.permission.api.IPermission;
import com.encentral.staffsync.configuration.permission.model.Permission;
import com.encentral.staffsync.configuration.permission.model.PermissionMapper;
import com.encentral.staffsync.configuration.role.model.Role;
import com.encentral.staffsync.configuration.role.model.RoleMapper;
import com.encentral.staffsync.entity.*;
import com.encentral.staffsync.entity.enums.Action;
import com.google.inject.Inject;
import com.querydsl.jpa.impl.JPAQueryFactory;
import play.db.jpa.JPAApi;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class DefaultPermissionImpl implements IPermission {

    private final JPAApi jpaApi;

    @Inject
    public DefaultPermissionImpl(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Add a new Permission into the database;
     * @param permission Permission model filled with the required data
     * @return Optional.of(Permission)
     */
    @Override
    public Optional<Permission> addPermission(Permission permission) {

        System.out.println("I got inside this method");

        permission.setPermissionId(UUID.randomUUID().toString());
        JpaPermission jpaPermission = PermissionMapper.permissionToJpaPermission(permission);

        System.out.println("Trying to persist");
        jpaApi.em().persist(jpaPermission);
        System.out.println("Persistence done");


        System.out.println("I'm exiting this method");

        return Optional.of(PermissionMapper.jpaPermissionToPermission(jpaPermission));
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Get permission by ID
     * @param permissionId ID of the permission for the fetch
     * @return Optional.ofNullable(Permission)
     */
    @Override
    public Optional<Permission> getPermissionById(String permissionId) {
        JpaPermission jpaPermission = getJpaPermissionById(permissionId);
        return Optional.ofNullable(PermissionMapper.jpaPermissionToPermission(jpaPermission));
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Get permission by Name
     * @param permissionName Name of the permission to fetch
     * @return Optional.ofNullable(Permission)
     */
    @Override
    public Optional<Permission> getPermissionByName(String permissionName) {
        JpaPermission jpaPermission = getJpaPermissionByName(permissionName);
        return Optional.ofNullable(PermissionMapper.jpaPermissionToPermission(jpaPermission));
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Get all permissions
     * @return Set<Permission>
     */
    @Override
    public Set<Permission> getAllPermissions() {
        QJpaPermission qJpaPermission = QJpaPermission.jpaPermission;

        JPAQueryFactory queryFactory = new JPAQueryFactory(this.jpaApi.em());

        return queryFactory.selectFrom(qJpaPermission)
                .fetch()
                .stream()
                .map(PermissionMapper::jpaPermissionToPermission)
                .collect(Collectors.toSet());
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Get all permissions tied to the role ID
     * @param roleId Role Id
     * @return Set<Permission>
     */
    @Override
    public Set<Permission> getPermissionsForRole(String roleId) {
        QJpaRoleHasPermission qJpaRoleHasPermission = QJpaRoleHasPermission.jpaRoleHasPermission;

        JPAQueryFactory queryFactory = new JPAQueryFactory(this.jpaApi.em());

        return queryFactory.selectFrom(qJpaRoleHasPermission)
                .select(qJpaRoleHasPermission.permission)
                .where(qJpaRoleHasPermission.role.roleId.eq(roleId))
                .fetch()
                .stream()
                .map(PermissionMapper::jpaPermissionToPermission)
                .collect(Collectors.toSet());
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Get all roles tied to permissionId
     * @param permissionId Permission ID
     * @return Set<Role>
     */
    @Override
    public Set<Role> getRoles(String permissionId) {
        QJpaPermission qJpaPermission = QJpaPermission.jpaPermission;

        JPAQueryFactory queryFactory = new JPAQueryFactory(this.jpaApi.em());

        Set<JpaRole> roleSet = queryFactory.selectFrom(qJpaPermission)
                .select(qJpaPermission.roles)
                .fetchOne();

        if (roleSet == null)
            return new HashSet<>();

        return roleSet.stream()
                .map(RoleMapper::jpaRoleToRole)
                .collect(Collectors.toSet());
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Get all permissions having the specified action type
     * @param action Action type (Action.CREATE, Action.READ, Action.UPDATE, Action.Delete)
     * @return Set<Permission>
     */
    @Override
    public Set<Permission> getPermissionsByActionType(Action action) {
        QJpaPermission qJpaPermission = QJpaPermission.jpaPermission;

        JPAQueryFactory queryFactory = new JPAQueryFactory(this.jpaApi.em());

        return queryFactory.selectFrom(qJpaPermission)
                .where(qJpaPermission.permissionAction.eq(action))
                .fetch()
                .stream()
                .map(PermissionMapper::jpaPermissionToPermission)
                .collect(Collectors.toSet());
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Gets permissions by the description
     * @param keywords Keyword to search for in the permission description
     * @return Set<Permission>
     */
    @Override
    public Set<Permission> searchPermissionsByDescription(String keywords) {
        QJpaPermission qJpaPermission = QJpaPermission.jpaPermission;

        JPAQueryFactory queryFactory = new JPAQueryFactory(this.jpaApi.em());

        return queryFactory.selectFrom(qJpaPermission)
                .where(qJpaPermission.permissionDescription.contains(keywords))
                .fetch()
                .stream()
                .map(PermissionMapper::jpaPermissionToPermission)
                .collect(Collectors.toSet());
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Updates a permission
     * @param permission Permission model containing the data update
     * @return Optional.ofNullable(Permission)
     */
    @Override
    public Optional<Permission> updatePermission(Permission permission) {
        if (permission == null || permission.getPermissionId() == null)
            return Optional.empty();
        JpaPermission jpaPermission = PermissionMapper.permissionToJpaPermission(permission);

        if (getJpaPermissionById(jpaPermission.getPermissionId()) == null)
            return Optional.empty();

        jpaPermission = jpaApi.em().merge(jpaPermission);
        jpaApi.em().getTransaction().commit();
        return Optional.of(PermissionMapper.jpaPermissionToPermission(jpaPermission));

    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Deletes a permission
     * @param permissionId Permission model to delete
     */
    @Override
    public void deletePermission(String permissionId) {
        JpaPermission jpaPermission = getJpaPermissionById(permissionId);
        if (jpaPermission != null) {
            jpaApi.em().remove(jpaPermission);
        }
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Gets a JpaPermission by ID (a private method)
     * @param permissionId Permission model ID
     * @return JpaPermission
     */
    private JpaPermission getJpaPermissionById(String permissionId) {
        QJpaPermission qJpaPermission = QJpaPermission.jpaPermission;

        JPAQueryFactory queryFactory = new JPAQueryFactory(this.jpaApi.em());

        return queryFactory.selectFrom(qJpaPermission)
                .where(qJpaPermission.permissionId.eq(permissionId))
                .fetchOne();
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Gets a JpaPermission by Name (a private method)
     * @param permissionName Permission model Name
     * @return JpaPermission
     */
    private JpaPermission getJpaPermissionByName(String permissionName) {
        QJpaPermission qJpaPermission = QJpaPermission.jpaPermission;

        JPAQueryFactory queryFactory = new JPAQueryFactory(this.jpaApi.em());

        return queryFactory.selectFrom(qJpaPermission)
                .where(qJpaPermission.permissionName.eq(permissionName))
                .fetchOne();
    }

}
