package com.encentral.staffsync.configuration.RoleHasPermission.model;

import com.encentral.staffsync.configuration.permission.model.PermissionMapper;
import com.encentral.staffsync.configuration.role.model.RoleMapper;
import com.encentral.staffsync.entity.JpaRoleHasPermission;

public class RoleHasPermissionMapper {
    public static RoleHasPermission jpaRoleHasPermissionToRoleHasPermission(JpaRoleHasPermission jpaRoleHasPermission) {
        if ( jpaRoleHasPermission == null ) {
            return null;
        }

        RoleHasPermission roleHasPermission = new RoleHasPermission();

        roleHasPermission.setRoleHasPermissionId( jpaRoleHasPermission.getRoleHasPermissionId() );
        roleHasPermission.setCreatedBy( jpaRoleHasPermission.getCreatedBy() );
        roleHasPermission.setDateCreated( jpaRoleHasPermission.getDateCreated() );
        roleHasPermission.setPermission(PermissionMapper.jpaPermissionToPermission( jpaRoleHasPermission.getPermission() ) );
        roleHasPermission.setRole(RoleMapper.jpaRoleToRole( jpaRoleHasPermission.getRole() ) );

        return roleHasPermission;
    }

    public static JpaRoleHasPermission roleHasPermissionToJpaRoleHasPermission(RoleHasPermission roleHasPermission) {
        if ( roleHasPermission == null ) {
            return null;
        }

        JpaRoleHasPermission jpaRoleHasPermission = new JpaRoleHasPermission();

        jpaRoleHasPermission.setRoleHasPermissionId( roleHasPermission.getRoleHasPermissionId() );
        jpaRoleHasPermission.setCreatedBy( roleHasPermission.getCreatedBy() );
        jpaRoleHasPermission.setDateCreated( roleHasPermission.getDateCreated() );
        jpaRoleHasPermission.setPermission( PermissionMapper.permissionToJpaPermission( roleHasPermission.getPermission() ) );
        jpaRoleHasPermission.setRole( RoleMapper.roleToJpaRole( roleHasPermission.getRole() ) );

        return jpaRoleHasPermission;
    }


}
