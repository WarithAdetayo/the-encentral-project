package com.encentral.staffsync.configuration.permission.api;

import com.encentral.staffsync.configuration.permission.model.Permission;
import com.encentral.staffsync.entity.JpaPermission;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-03T08:52:51+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.17 (Debian)"
)
public class IPermissionMapperImpl implements IPermissionMapper {

    @Override
    public Permission jpaPermissionToPermission(JpaPermission jpaPermission) {
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

    @Override
    public JpaPermission permissionToJpaPermission(Permission permission) {
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
}
