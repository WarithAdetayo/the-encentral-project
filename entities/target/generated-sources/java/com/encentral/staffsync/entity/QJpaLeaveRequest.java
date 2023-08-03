package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaLeaveRequest is a Querydsl query type for JpaLeaveRequest
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaLeaveRequest extends EntityPathBase<JpaLeaveRequest> {

    private static final long serialVersionUID = -297439094L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaLeaveRequest jpaLeaveRequest = new QJpaLeaveRequest("jpaLeaveRequest");

    public final EnumPath<com.encentral.staffsync.entity.enums.LeaveRequestStatus> approvalStatus = createEnum("approvalStatus", com.encentral.staffsync.entity.enums.LeaveRequestStatus.class);

    public final QJpaEmployee approver;

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final NumberPath<Integer> duration = createNumber("duration", Integer.class);

    public final QJpaEmployee employee;

    public final StringPath leaveRequestId = createString("leaveRequestId");

    public final QJpaOption leaveType;

    public final StringPath reason = createString("reason");

    public final StringPath remarks = createString("remarks");

    public final DatePath<java.util.Date> startDate = createDate("startDate", java.util.Date.class);

    public QJpaLeaveRequest(String variable) {
        this(JpaLeaveRequest.class, forVariable(variable), INITS);
    }

    public QJpaLeaveRequest(Path<? extends JpaLeaveRequest> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaLeaveRequest(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaLeaveRequest(PathMetadata metadata, PathInits inits) {
        this(JpaLeaveRequest.class, metadata, inits);
    }

    public QJpaLeaveRequest(Class<? extends JpaLeaveRequest> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.approver = inits.isInitialized("approver") ? new QJpaEmployee(forProperty("approver"), inits.get("approver")) : null;
        this.employee = inits.isInitialized("employee") ? new QJpaEmployee(forProperty("employee"), inits.get("employee")) : null;
        this.leaveType = inits.isInitialized("leaveType") ? new QJpaOption(forProperty("leaveType"), inits.get("leaveType")) : null;
    }

}

