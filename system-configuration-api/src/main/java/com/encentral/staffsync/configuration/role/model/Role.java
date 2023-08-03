package com.encentral.staffsync.configuration.role.model;

import com.google.common.base.MoreObjects;

import java.sql.Timestamp;

public class Role {

    private String roleId;
    private String createdBy;
    private Timestamp dateCreated;
    private Timestamp dateModified;
    private String modifiedBy;
    private String roleDescription;
    private String roleName;
//    private Set<Employee> employees;
//    private Set<RoleHasPermission> roleHasPermissions;
//    private Set<Permission> permissions;


    public Role() {
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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

    public Timestamp getDateModified() {
        return dateModified;
    }

    public void setDateModified(Timestamp dateModified) {
        this.dateModified = dateModified;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this.getClass())
                .add("Id", this.getRoleId())
                .add("Name", this.getRoleName())
                .toString();
    }
}
