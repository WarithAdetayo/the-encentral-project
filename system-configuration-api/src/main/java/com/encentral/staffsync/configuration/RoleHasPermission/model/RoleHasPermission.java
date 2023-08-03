package com.encentral.staffsync.configuration.RoleHasPermission.model;

import com.encentral.staffsync.configuration.permission.model.Permission;
import com.encentral.staffsync.configuration.role.model.Role;
import com.google.common.base.MoreObjects;

import java.sql.Timestamp;

public class RoleHasPermission {
    private String roleHasPermissionId;
    private String createdBy;
    private Timestamp dateCreated;
    private Permission permission;
    private Role role;

    public RoleHasPermission() {

    }

    public String getRoleHasPermissionId() {
        return roleHasPermissionId;
    }

    public void setRoleHasPermissionId(String roleHasPermissionId) {
        this.roleHasPermissionId = roleHasPermissionId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this.getClass())
                .add("Role", this.getRole())
                .add("Permission", this.getPermission())
                .toString();
    }
}
