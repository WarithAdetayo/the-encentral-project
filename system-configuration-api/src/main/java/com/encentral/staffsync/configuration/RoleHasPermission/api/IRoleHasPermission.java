package com.encentral.staffsync.configuration.RoleHasPermission.api;

import com.encentral.staffsync.configuration.permission.model.Permission;
import com.encentral.staffsync.configuration.role.model.Role;

import java.util.Set;

public interface IRoleHasPermission {
    public Set<Role> getRolesForPermission(String PermissionId);
    public Set<Permission> getPermissionsForRole(String roleId);
}
