package com.encentral.staffsync.configuration.role.model;

import com.encentral.staffsync.entity.JpaRole;

public class RoleMapper {
    public static Role jpaRoleToRole(JpaRole jpaRole) {
        if (jpaRole == null)
            return null;

        Role role = new Role();

        role.setRoleId(jpaRole.getRoleId());
        role.setRoleName(jpaRole.getRoleName());
        role.setRoleDescription(jpaRole.getRoleDescription());
        role.setCreatedBy(jpaRole.getCreatedBy());
        role.setDateCreated(jpaRole.getDateCreated());
        role.setModifiedBy(jpaRole.getModifiedBy());
        role.setDateModified(jpaRole.getDateModified());

        return role;
    }

    public static  JpaRole roleToJpaRole(Role role) {
        if (role == null)
            return null;

        JpaRole jpaRole = new JpaRole();

        jpaRole.setRoleId(role.getRoleId());
        jpaRole.setRoleName(role.getRoleName());
        jpaRole.setRoleDescription(role.getRoleDescription());
        jpaRole.setCreatedBy(role.getCreatedBy());
        jpaRole.setDateCreated(role.getDateCreated());
        jpaRole.setModifiedBy(role.getModifiedBy());
        jpaRole.setDateModified(role.getDateModified());

        return jpaRole;
    }

    /**
     * @author WARITH
     * @dateCreated 02/08/23
     * @description Maps the values in Role to JpaRole
     * avoiding attributes that have null value to used in updating
     * JpaRole
     * @param role Role Model instance to map from
     * @param jpaRole JpaRole instance to map to
     */
    public static void mapAttributesAvoidNull(Role role, JpaRole jpaRole) {
//        if (role.getRoleId() != null)
//            jpaRole.setRoleId(role.getRoleId());

        if (role.getRoleName() != null)
            jpaRole.setRoleName(role.getRoleName());

        if (role.getRoleDescription() != null)
            jpaRole.setRoleDescription(role.getRoleDescription());

//        if (role.getCreatedBy() != null)
//            jpaRole.setCreatedBy(role.getCreatedBy());
//
//        if (role.getDateCreated() != null)
//            jpaRole.setDateCreated(role.getDateCreated());

        if (role.getModifiedBy() != null)
            jpaRole.setModifiedBy(role.getModifiedBy());

        if (role.getDateModified() != null)
            jpaRole.setDateModified(role.getDateModified());
    }

}
