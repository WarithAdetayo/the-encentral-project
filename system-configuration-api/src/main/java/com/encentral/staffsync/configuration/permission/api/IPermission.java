package com.encentral.staffsync.configuration.permission.api;

import com.encentral.staffsync.configuration.permission.model.Permission;
import com.encentral.staffsync.configuration.role.model.Role;
import com.encentral.staffsync.entity.enums.Action;

import java.util.Optional;
import java.util.Set;

public interface IPermission {
    Optional<Permission> addPermission(Permission permission);
    Optional<Permission> getPermissionById(String permissionId);
    Optional<Permission> getPermissionByName(String permissionName);
    Set<Permission> getAllPermissions();
    Set<Permission> getPermissionsForRole(String roleId);
    Set<Role> getRoles(String permissionId);
    Set<Permission> getPermissionsByActionType(Action action);
    Set<Permission> searchPermissionsByDescription(String keywords);
    Optional<Permission> updatePermission(Permission permission);
    void deletePermission(String permissionId);
}
