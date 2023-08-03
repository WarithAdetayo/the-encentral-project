package com.encentral.staffsync.configuration.role.api;

import com.encentral.staffsync.configuration.role.model.Role;
import com.encentral.staffsync.entity.JpaRole;
import org.mapstruct.Mapper;


@Mapper
public interface IRoleMapper {
    public JpaRole roleToJpaRole(Role role);
    public Role jpaRoleToRole(JpaRole jpaRole);

}
