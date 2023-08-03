package com.encentral.staffsync.configuration.RoleHasPermission.api;

import com.encentral.staffsync.configuration.RoleHasPermission.model.RoleHasPermission;
import com.encentral.staffsync.configuration.permission.model.Permission;
import com.encentral.staffsync.configuration.role.model.Role;
import com.encentral.staffsync.entity.JpaPermission;
import com.encentral.staffsync.entity.JpaRole;
import com.encentral.staffsync.entity.JpaRoleHasPermission;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-03T08:52:54+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.17 (Debian)"
)
public class IRoleHasPermissionMapperImpl implements IRoleHasPermissionMapper {

    @Override
    public RoleHasPermission jpaRoleHasPermissionToRoleHasPermission(JpaRoleHasPermission jpaRoleHasPermission) {
        if ( jpaRoleHasPermission == null ) {
            return null;
        }

        RoleHasPermission roleHasPermission = new RoleHasPermission();

        roleHasPermission.setRoleHasPermissionId( jpaRoleHasPermission.getRoleHasPermissionId() );
        roleHasPermission.setCreatedBy( jpaRoleHasPermission.getCreatedBy() );
        roleHasPermission.setDateCreated( jpaRoleHasPermission.getDateCreated() );
        roleHasPermission.setPermission( jpaPermissionToPermission( jpaRoleHasPermission.getPermission() ) );
        roleHasPermission.setRole( jpaRoleToRole( jpaRoleHasPermission.getRole() ) );

        return roleHasPermission;
    }

    @Override
    public JpaRoleHasPermission roleHasPermissionToJpaRoleHasPermission(RoleHasPermission roleHasPermission) {
        if ( roleHasPermission == null ) {
            return null;
        }

        JpaRoleHasPermission jpaRoleHasPermission = new JpaRoleHasPermission();

        jpaRoleHasPermission.setRoleHasPermissionId( roleHasPermission.getRoleHasPermissionId() );
        jpaRoleHasPermission.setCreatedBy( roleHasPermission.getCreatedBy() );
        jpaRoleHasPermission.setDateCreated( roleHasPermission.getDateCreated() );
        jpaRoleHasPermission.setPermission( permissionToJpaPermission( roleHasPermission.getPermission() ) );
        jpaRoleHasPermission.setRole( roleToJpaRole( roleHasPermission.getRole() ) );

        return jpaRoleHasPermission;
    }

    protected Permission jpaPermissionToPermission(JpaPermission jpaPermission) {
        if ( jpaPermission == null ) {
            return null;
        }

        Permission permission = new Permission();

        permission.setPermissionId( jpaPermission.getPermissionId() );
        permission.setCreatedBy( jpaPermission.getCreatedBy() );
        permission.setDateCreated( jpaPermission.getDateCreated() );
        permission.setDateModified( jpaPermission.getDateModified() );
        permission.setModifiedBy( jpaPermission.getModifiedBy() );
        permission.setPermissionAction( jpaPermission.getPermissionAction() );
        permission.setPermissionDescription( jpaPermission.getPermissionDescription() );
        permission.setPermissionName( jpaPermission.getPermissionName() );

        return permission;
    }

    protected Role jpaRoleToRole(JpaRole jpaRole) {
        if ( jpaRole == null ) {
            return null;
        }

        Role role = new Role();

        role.setRoleId( jpaRole.getRoleId() );
        role.setCreatedBy( jpaRole.getCreatedBy() );
        role.setDateCreated( jpaRole.getDateCreated() );
        role.setDateModified( jpaRole.getDateModified() );
        role.setModifiedBy( jpaRole.getModifiedBy() );
        role.setRoleDescription( jpaRole.getRoleDescription() );
        role.setRoleName( jpaRole.getRoleName() );

        return role;
    }

    protected JpaPermission permissionToJpaPermission(Permission permission) {
        if ( permission == null ) {
            return null;
        }

        JpaPermission jpaPermission = new JpaPermission();

        jpaPermission.setPermissionId( permission.getPermissionId() );
        jpaPermission.setCreatedBy( permission.getCreatedBy() );
        jpaPermission.setDateCreated( permission.getDateCreated() );
        jpaPermission.setDateModified( permission.getDateModified() );
        jpaPermission.setModifiedBy( permission.getModifiedBy() );
        jpaPermission.setPermissionAction( permission.getPermissionAction() );
        jpaPermission.setPermissionDescription( permission.getPermissionDescription() );
        jpaPermission.setPermissionName( permission.getPermissionName() );

        return jpaPermission;
    }

    protected JpaRole roleToJpaRole(Role role) {
        if ( role == null ) {
            return null;
        }

        JpaRole jpaRole = new JpaRole();

        jpaRole.setRoleId( role.getRoleId() );
        jpaRole.setCreatedBy( role.getCreatedBy() );
        jpaRole.setDateCreated( role.getDateCreated() );
        jpaRole.setDateModified( role.getDateModified() );
        jpaRole.setModifiedBy( role.getModifiedBy() );
        jpaRole.setRoleDescription( role.getRoleDescription() );
        jpaRole.setRoleName( role.getRoleName() );

        return jpaRole;
    }
}
