package com.encentral.staffsync.configuration.permission.api;

import com.encentral.staffsync.configuration.permission.model.Permission;
import com.encentral.staffsync.entity.JpaPermission;
import org.mapstruct.Mapper;


@Mapper
public interface IPermissionMapper {
    public Permission jpaPermissionToPermission(JpaPermission jpaPermission);
    public JpaPermission permissionToJpaPermission(Permission permission);
}
