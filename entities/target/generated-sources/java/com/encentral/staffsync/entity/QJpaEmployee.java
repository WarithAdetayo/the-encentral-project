package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaEmployee is a Querydsl query type for JpaEmployee
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaEmployee extends EntityPathBase<JpaEmployee> {

    private static final long serialVersionUID = -438374304L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaEmployee jpaEmployee = new QJpaEmployee("jpaEmployee");

    public final StringPath address = createString("address");

    public final SetPath<JpaAnnouncement, QJpaAnnouncement> announcements = this.<JpaAnnouncement, QJpaAnnouncement>createSet("announcements", JpaAnnouncement.class, QJpaAnnouncement.class, PathInits.DIRECT2);

    public final SetPath<JpaAnnouncementRecipient, QJpaAnnouncementRecipient> announcementsReceived = this.<JpaAnnouncementRecipient, QJpaAnnouncementRecipient>createSet("announcementsReceived", JpaAnnouncementRecipient.class, QJpaAnnouncementRecipient.class, PathInits.DIRECT2);

    public final SetPath<JpaAttendance, QJpaAttendance> attendances = this.<JpaAttendance, QJpaAttendance>createSet("attendances", JpaAttendance.class, QJpaAttendance.class, PathInits.DIRECT2);

    public final SetPath<JpaAuditLog, QJpaAuditLog> auditLogs = this.<JpaAuditLog, QJpaAuditLog>createSet("auditLogs", JpaAuditLog.class, QJpaAuditLog.class, PathInits.DIRECT2);

    public final QJpaOption countryOfOrigin;

    public final StringPath createdBy = createString("createdBy");

    public final StringPath currentStatus = createString("currentStatus");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DatePath<java.util.Date> dateHired = createDate("dateHired", java.util.Date.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final DatePath<java.util.Date> dateOfBirth = createDate("dateOfBirth", java.util.Date.class);

    public final QJpaDepartment department;

    public final SetPath<JpaDepartmentHead, QJpaDepartmentHead> departmentHeads = this.<JpaDepartmentHead, QJpaDepartmentHead>createSet("departmentHeads", JpaDepartmentHead.class, QJpaDepartmentHead.class, PathInits.DIRECT2);

    public final SetPath<JpaEmergencyContact, QJpaEmergencyContact> emergencyContacts = this.<JpaEmergencyContact, QJpaEmergencyContact>createSet("emergencyContacts", JpaEmergencyContact.class, QJpaEmergencyContact.class, PathInits.DIRECT2);

    public final BooleanPath employeeActive = createBoolean("employeeActive");

    public final StringPath employeeEmail = createString("employeeEmail");

    public final QJpaOption employeeGender;

    public final SetPath<JpaEmployeeHasDocument, QJpaEmployeeHasDocument> employeeHasDocuments = this.<JpaEmployeeHasDocument, QJpaEmployeeHasDocument>createSet("employeeHasDocuments", JpaEmployeeHasDocument.class, QJpaEmployeeHasDocument.class, PathInits.DIRECT2);

    public final StringPath employeeId = createString("employeeId");

    public final QJpaOption employeeMaritalStatus;

    public final SetPath<JpaEmployeeUpdateRequest, QJpaEmployeeUpdateRequest> employeeUpdateRequests = this.<JpaEmployeeUpdateRequest, QJpaEmployeeUpdateRequest>createSet("employeeUpdateRequests", JpaEmployeeUpdateRequest.class, QJpaEmployeeUpdateRequest.class, PathInits.DIRECT2);

    public final SetPath<JpaEmployeeUpdateRequest, QJpaEmployeeUpdateRequest> employeeUpdateRequestsApprovedByMe = this.<JpaEmployeeUpdateRequest, QJpaEmployeeUpdateRequest>createSet("employeeUpdateRequestsApprovedByMe", JpaEmployeeUpdateRequest.class, QJpaEmployeeUpdateRequest.class, PathInits.DIRECT2);

    public final StringPath firstName = createString("firstName");

    public final QJpaOption highestCertification;

    public final StringPath jobTitle = createString("jobTitle");

    public final DateTimePath<java.sql.Timestamp> lastLogin = createDateTime("lastLogin", java.sql.Timestamp.class);

    public final StringPath lastName = createString("lastName");

    public final NumberPath<Integer> leaveDays = createNumber("leaveDays", Integer.class);

    public final SetPath<JpaLeaveRequest, QJpaLeaveRequest> leaveRequests = this.<JpaLeaveRequest, QJpaLeaveRequest>createSet("leaveRequests", JpaLeaveRequest.class, QJpaLeaveRequest.class, PathInits.DIRECT2);

    public final SetPath<JpaLeaveRequest, QJpaLeaveRequest> leaveRequestsApprovedByMe = this.<JpaLeaveRequest, QJpaLeaveRequest>createSet("leaveRequestsApprovedByMe", JpaLeaveRequest.class, QJpaLeaveRequest.class, PathInits.DIRECT2);

    public final NumberPath<Integer> loginAttempts = createNumber("loginAttempts", Integer.class);

    public final StringPath modifiedBy = createString("modifiedBy");

    public final StringPath password = createString("password");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath profilePictureUrl = createString("profilePictureUrl");

    public final SetPath<JpaNotification, QJpaNotification> receivedNotifications = this.<JpaNotification, QJpaNotification>createSet("receivedNotifications", JpaNotification.class, QJpaNotification.class, PathInits.DIRECT2);

    public final QJpaRole role;

    public final SetPath<JpaNotification, QJpaNotification> sentNotifications = this.<JpaNotification, QJpaNotification>createSet("sentNotifications", JpaNotification.class, QJpaNotification.class, PathInits.DIRECT2);

    public final QJpaOption stateOfOrigin;

    public QJpaEmployee(String variable) {
        this(JpaEmployee.class, forVariable(variable), INITS);
    }

    public QJpaEmployee(Path<? extends JpaEmployee> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaEmployee(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaEmployee(PathMetadata metadata, PathInits inits) {
        this(JpaEmployee.class, metadata, inits);
    }

    public QJpaEmployee(Class<? extends JpaEmployee> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.countryOfOrigin = inits.isInitialized("countryOfOrigin") ? new QJpaOption(forProperty("countryOfOrigin"), inits.get("countryOfOrigin")) : null;
        this.department = inits.isInitialized("department") ? new QJpaDepartment(forProperty("department"), inits.get("department")) : null;
        this.employeeGender = inits.isInitialized("employeeGender") ? new QJpaOption(forProperty("employeeGender"), inits.get("employeeGender")) : null;
        this.employeeMaritalStatus = inits.isInitialized("employeeMaritalStatus") ? new QJpaOption(forProperty("employeeMaritalStatus"), inits.get("employeeMaritalStatus")) : null;
        this.highestCertification = inits.isInitialized("highestCertification") ? new QJpaOption(forProperty("highestCertification"), inits.get("highestCertification")) : null;
        this.role = inits.isInitialized("role") ? new QJpaRole(forProperty("role")) : null;
        this.stateOfOrigin = inits.isInitialized("stateOfOrigin") ? new QJpaOption(forProperty("stateOfOrigin"), inits.get("stateOfOrigin")) : null;
    }

}

