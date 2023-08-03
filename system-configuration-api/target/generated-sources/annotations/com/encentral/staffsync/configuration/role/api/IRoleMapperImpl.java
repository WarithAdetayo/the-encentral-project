package com.encentral.staffsync.configuration.role.api;

import com.encentral.staffsync.configuration.role.model.Role;
import com.encentral.staffsync.entity.JpaRole;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-03T08:52:53+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.17 (Debian)"
)
public class IRoleMapperImpl implements IRoleMapper {

    @Override
    public JpaRole roleToJpaRole(Role role) {
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

    @Override
    public Role jpaRoleToRole(JpaRole jpaRole) {
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
}
