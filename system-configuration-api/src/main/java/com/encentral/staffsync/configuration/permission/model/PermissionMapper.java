package com.encentral.staffsync.configuration.permission.model;

import com.encentral.staffsync.configuration.permission.api.IPermissionMapper;
import com.encentral.staffsync.entity.JpaPermission;

public class PermissionMapper {
    public static Permission jpaPermissionToPermission(JpaPermission jpaPermission) {
        if (jpaPermission == null)
            return null;
        Permission permission = new Permission();

        permission.setPermissionId(jpaPermission.getPermissionId());
        permission.setPermissionName(jpaPermission.getPermissionName());
        permission.setPermissionDescription(jpaPermission.getPermissionDescription());
        permission.setPermissionAction(jpaPermission.getPermissionAction());
        permission.setCreatedBy(jpaPermission.getCreatedBy());
        permission.setModifiedBy(jpaPermission.getModifiedBy());
        permission.setDateCreated(jpaPermission.getDateCreated());
        permission.setDateModified(jpaPermission.getDateModified());

        return permission;
    }

    public static JpaPermission permissionToJpaPermission(Permission permission) {
        if (permission == null)
            return null;
        JpaPermission jpaPermission = new JpaPermission();

        jpaPermission.setPermissionId(permission.getPermissionId());
        jpaPermission.setPermissionName(permission.getPermissionName());
        jpaPermission.setPermissionDescription(permission.getPermissionDescription());
        jpaPermission.setPermissionAction(permission.getPermissionAction());
        jpaPermission.setCreatedBy(permission.getCreatedBy());
        jpaPermission.setModifiedBy(permission.getModifiedBy());
        jpaPermission.setDateCreated(permission.getDateCreated());
        jpaPermission.setDateModified(permission.getDateModified());

        return jpaPermission;

    }

    /**
     * @author WARITH
     * @dateCreated 02/08/23
     * @description Maps the values in Permission to JpaPermission
     * avoiding attributes that have null value to used in updating
     * JpaPermission
     * @param permission Permission Model instance to map from
     * @param jpaPermission JpaPermission instance to map to
     */
    public static void mapAttributesAvoidNull(Permission permission, JpaPermission jpaPermission) {
//        if (permission.getPermissionId() != null)
//            jpaPermission.setPermissionId(permission.getPermissionId());

        if (permission.getPermissionName() != null)
            jpaPermission.setPermissionName(permission.getPermissionName());

        if (permission.getPermissionDescription() != null)
            jpaPermission.setPermissionDescription(permission.getPermissionDescription());

        if (permission.getPermissionAction() != null)
            jpaPermission.setPermissionAction(permission.getPermissionAction());

//        if (permission.getCreatedBy() != null)
//            jpaPermission.setCreatedBy(permission.getCreatedBy());

        if (permission.getModifiedBy() != null)
            jpaPermission.setModifiedBy(permission.getModifiedBy());

//        if (permission.getDateCreated() != null)
//            jpaPermission.setDateCreated(permission.getDateCreated());

        if (permission.getDateCreated() != null)
            jpaPermission.setDateModified(permission.getDateModified());

    }
}
