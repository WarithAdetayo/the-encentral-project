package com.encentral.staffsync.configuration.role.impl;

import com.encentral.staffsync.configuration.permission.model.Permission;
import com.encentral.staffsync.configuration.permission.model.PermissionMapper;
import com.encentral.staffsync.configuration.role.api.IRole;
import com.encentral.staffsync.configuration.role.model.Role;
import com.encentral.staffsync.configuration.role.model.RoleMapper;
import com.encentral.staffsync.entity.*;
import com.google.inject.Inject;
import com.querydsl.jpa.impl.JPAQueryFactory;
import play.db.jpa.JPAApi;

import java.util.*;
import java.util.stream.Collectors;

public class DefaultRoleImpl implements IRole {

    private final JPAApi jpaApi;

    @Inject
    public DefaultRoleImpl(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Add a new Role into the database;
     * @param role Role model filled with the required data
     * @return Optional.of(Role)
     */
    @Override
    public Optional<Role> createRole(Role role) {
        if (role == null || role.getRoleId() == null)
            return Optional.empty();
        role.setRoleId(UUID.randomUUID().toString());
        JpaRole jpaRole = RoleMapper.roleToJpaRole(role);

        jpaApi.em().persist(jpaRole);

        return Optional.of(role);
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Get role by ID from the database
     * @param roleId Role ID
     * @return Optional.of(Role)
     */
    @Override
    public Optional<Role> getRoleById(String roleId) {
        JpaRole jpaRole = getJpaRoleById(roleId);
        return Optional.ofNullable(RoleMapper.jpaRoleToRole(jpaRole));
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Get role by Name from the database
     * @param roleName Role Name
     * @return Optional.of(Role)
     */
    @Override
    public Optional<Role> getRoleByName(String roleName) {
        JpaRole jpaRole = getJpaRoleByName(roleName);
        return Optional.ofNullable(RoleMapper.jpaRoleToRole(jpaRole));
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Get all roles
     * @return Set<Role>
     */
    @Override
    public Set<Role> getAllRoles() {
        QJpaRole qJpaRole = QJpaRole.jpaRole;

        JPAQueryFactory queryFactory = new JPAQueryFactory(this.jpaApi.em());

        return queryFactory.selectFrom(qJpaRole)
                .fetch()
                .stream()
                .map(RoleMapper::jpaRoleToRole)
                .collect(Collectors.toSet());
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Get all roles tied to the permission ID
     * @param permissionId Permission ID
     * @return Set<Role>
     */
    @Override
    public Set<Role> getRolesForPermission(String permissionId) {
        QJpaRoleHasPermission qJpaRoleHasPermission = QJpaRoleHasPermission.jpaRoleHasPermission;

        JPAQueryFactory queryFactory = new JPAQueryFactory(this.jpaApi.em());

        return queryFactory.selectFrom(qJpaRoleHasPermission)
                .select(qJpaRoleHasPermission.role)
                .where(qJpaRoleHasPermission.permission.permissionId.eq(permissionId))
                .fetch()
                .stream()
                .map(RoleMapper::jpaRoleToRole)
                .collect(Collectors.toSet());
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Get all permissions tied to the role ID
     * @param roleId Permission ID
     * @return Set<Permission>
     */
    @Override
    public Set<Permission> getPermissions(String roleId) {
        QJpaRole qJpaRole = QJpaRole.jpaRole;

        JPAQueryFactory queryFactory = new JPAQueryFactory(this.jpaApi.em());

        Set<JpaPermission> permissions = queryFactory.selectFrom(qJpaRole)
                .select(qJpaRole.permissions)
                .fetchOne();

        if (permissions == null)
            return new HashSet<>();

        return permissions.stream()
                .map(PermissionMapper::jpaPermissionToPermission)
                .collect(Collectors.toSet());
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Updates a role
     * @param role Role model containing the data update
     * @return Optional.ofNullable(Role)
     */
    @Override
    public Optional<Role> updateRole(Role role) {
        if (role == null || role.getRoleId() == null)
            return Optional.empty();
        JpaRole jpaRole = RoleMapper.roleToJpaRole(role);

        if (getJpaRoleById(jpaRole.getRoleId()) == null)
            return Optional.empty();

        jpaRole = jpaApi.em().merge(jpaRole);
        jpaApi.em().getTransaction().commit();
        return Optional.of(RoleMapper.jpaRoleToRole(jpaRole));
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Deletes a permission
     * @param roleId ID of the Role model to delete
     */
    @Override
    public void deleteRole(String roleId) {
        JpaRole jpaRole = getJpaRoleById(roleId);
        if (jpaRole != null) {
            jpaApi.em().remove(jpaRole);
        }
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/23
     * @description Add Permission to role
     * @param roleId ID of the role to be granted permission
     * @param permissionId ID of the permission to be granted
     */
    @Override
    public void grantPermissionToRole(String roleId, String permissionId) {

    }

    /**
     * @author WARITH
     * @dateCreated 01/08/23
     * @description Remove Permission from role
     * @param roleId ID of the role to be revoked of permission
     * @param permissionId ID of the permission to be revoked
     */
    @Override
    public void revokePermissionFromRole(String roleId, String permissionId) {

    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Gets a JpaRole by ID (a private method)
     * @param roleId Permission model ID
     * @return JpaRole
     */
    private JpaRole getJpaRoleById(String roleId) {
        QJpaRole qJpaRole = QJpaRole.jpaRole;

        JPAQueryFactory queryFactory = new JPAQueryFactory(this.jpaApi.em());

        return queryFactory.selectFrom(qJpaRole)
                .where(qJpaRole.roleId.eq(roleId))
                .fetchOne();
    }

    /**
     * @author WARITH
     * @dateCreated 01/08/2023
     * @description Gets a JpaRole by Name (a private method)
     * @param name Permission model name
     * @return JpaRole
     */
    private JpaRole getJpaRoleByName(String name) {
        QJpaRole qJpaRole = QJpaRole.jpaRole;

        JPAQueryFactory queryFactory = new JPAQueryFactory(this.jpaApi.em());

        return queryFactory.selectFrom(qJpaRole)
                .where(qJpaRole.roleName.eq(name))
                .fetchOne();
    }
}
