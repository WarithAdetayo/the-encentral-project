package com.encentral.staffsync.configuration.RoleHasPermission.api;

import com.encentral.staffsync.configuration.RoleHasPermission.model.RoleHasPermission;
import com.encentral.staffsync.entity.JpaRoleHasPermission;
import org.mapstruct.Mapper;

@Mapper
public interface IRoleHasPermissionMapper {
    public RoleHasPermission jpaRoleHasPermissionToRoleHasPermission(JpaRoleHasPermission jpaRoleHasPermission);
    public JpaRoleHasPermission roleHasPermissionToJpaRoleHasPermission(RoleHasPermission roleHasPermission);
}
