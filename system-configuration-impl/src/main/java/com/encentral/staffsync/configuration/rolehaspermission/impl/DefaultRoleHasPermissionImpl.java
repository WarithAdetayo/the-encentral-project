package com.encentral.staffsync.configuration.rolehaspermission.impl;

import com.encentral.staffsync.configuration.RoleHasPermission.api.IRoleHasPermission;
import com.encentral.staffsync.configuration.permission.model.Permission;
import com.encentral.staffsync.configuration.permission.model.PermissionMapper;
import com.encentral.staffsync.configuration.role.model.Role;
import com.encentral.staffsync.configuration.role.model.RoleMapper;
import com.encentral.staffsync.entity.QJpaRoleHasPermission;
import com.google.inject.Inject;
import com.querydsl.jpa.impl.JPAQueryFactory;
import play.db.jpa.JPAApi;

import java.util.Set;
import java.util.stream.Collectors;

public class DefaultRoleHasPermissionImpl implements IRoleHasPermission {
    private final JPAApi jpaApi;

    @Inject
    public DefaultRoleHasPermissionImpl(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }

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
}
