package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaEmployeeUpdateRequest is a Querydsl query type for JpaEmployeeUpdateRequest
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaEmployeeUpdateRequest extends EntityPathBase<JpaEmployeeUpdateRequest> {

    private static final long serialVersionUID = -891918074L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaEmployeeUpdateRequest jpaEmployeeUpdateRequest = new QJpaEmployeeUpdateRequest("jpaEmployeeUpdateRequest");

    public final EnumPath<com.encentral.staffsync.entity.enums.EmployeeRequestStatus> approvalStatus = createEnum("approvalStatus", com.encentral.staffsync.entity.enums.EmployeeRequestStatus.class);

    public final QJpaEmployee approver;

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final QJpaEmployee employee;

    public final StringPath employeeUpdateRequestId = createString("employeeUpdateRequestId");

    public final StringPath oldValue = createString("oldValue");

    public final StringPath reason = createString("reason");

    public final StringPath remarks = createString("remarks");

    public final StringPath updateFieldName = createString("updateFieldName");

    public final StringPath updateNewValue = createString("updateNewValue");

    public QJpaEmployeeUpdateRequest(String variable) {
        this(JpaEmployeeUpdateRequest.class, forVariable(variable), INITS);
    }

    public QJpaEmployeeUpdateRequest(Path<? extends JpaEmployeeUpdateRequest> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaEmployeeUpdateRequest(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaEmployeeUpdateRequest(PathMetadata metadata, PathInits inits) {
        this(JpaEmployeeUpdateRequest.class, metadata, inits);
    }

    public QJpaEmployeeUpdateRequest(Class<? extends JpaEmployeeUpdateRequest> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.approver = inits.isInitialized("approver") ? new QJpaEmployee(forProperty("approver"), inits.get("approver")) : null;
        this.employee = inits.isInitialized("employee") ? new QJpaEmployee(forProperty("employee"), inits.get("employee")) : null;
    }

}

