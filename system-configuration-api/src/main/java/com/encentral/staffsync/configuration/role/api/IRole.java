package com.encentral.staffsync.configuration.role.api;

import com.encentral.staffsync.configuration.permission.model.Permission;
import com.encentral.staffsync.configuration.role.model.Role;

import java.util.Optional;
import java.util.Set;

public interface IRole {
    Optional<Role> createRole(Role role);
    Optional<Role> getRoleById(String roleId);
    Optional<Role> getRoleByName(String roleName);
    Set<Role> getAllRoles();
    Set<Role> getRolesForPermission(String permissionId);
    Set<Permission> getPermissions(String roleId);
    Optional<Role> updateRole(Role role);
    void deleteRole(String roleId);
    void grantPermissionToRole(String roleId, String permissionId);
    void revokePermissionFromRole(String roleId, String permissionId);
}
