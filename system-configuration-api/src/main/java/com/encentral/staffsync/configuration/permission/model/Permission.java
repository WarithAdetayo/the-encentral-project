package com.encentral.staffsync.configuration.permission.model;

import com.encentral.staffsync.entity.enums.Action;

import java.sql.Timestamp;

public class Permission {
    private String permissionId;
    private String createdBy;
    private Timestamp dateCreated;
    private Timestamp dateModified;
    private String modifiedBy;
    private Action permissionAction;
    private String permissionDescription;
    private String permissionName;
//    private Set<RoleHasPermission> roleHasPermissions;
//    private Set<Role> roles;


    public Permission() {
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
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

    public Action getPermissionAction() {
        return permissionAction;
    }

    public void setPermissionAction(Action permissionAction) {
        this.permissionAction = permissionAction;
    }

    public String getPermissionDescription() {
        return permissionDescription;
    }

    public void setPermissionDescription(String permissionDescription) {
        this.permissionDescription = permissionDescription;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permissionId='" + permissionId + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", dateCreated=" + dateCreated +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", permissionAction=" + permissionAction +
                ", permissionDescription='" + permissionDescription + '\'' +
                ", permissionName='" + permissionName + '\'' +
                '}';
    }
}
