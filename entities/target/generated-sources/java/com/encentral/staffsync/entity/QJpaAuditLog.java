package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaAuditLog is a Querydsl query type for JpaAuditLog
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaAuditLog extends EntityPathBase<JpaAuditLog> {

    private static final long serialVersionUID = -655800549L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaAuditLog jpaAuditLog = new QJpaAuditLog("jpaAuditLog");

    public final EnumPath<com.encentral.staffsync.entity.enums.Action> actionType = createEnum("actionType", com.encentral.staffsync.entity.enums.Action.class);

    public final StringPath auditLogId = createString("auditLogId");

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final QJpaEmployee employee;

    public final StringPath fieldName = createString("fieldName");

    public final StringPath initialValue = createString("initialValue");

    public final StringPath newValue = createString("newValue");

    public final StringPath rowId = createString("rowId");

    public final StringPath tableName = createString("tableName");

    public QJpaAuditLog(String variable) {
        this(JpaAuditLog.class, forVariable(variable), INITS);
    }

    public QJpaAuditLog(Path<? extends JpaAuditLog> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaAuditLog(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaAuditLog(PathMetadata metadata, PathInits inits) {
        this(JpaAuditLog.class, metadata, inits);
    }

    public QJpaAuditLog(Class<? extends JpaAuditLog> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employee = inits.isInitialized("employee") ? new QJpaEmployee(forProperty("employee"), inits.get("employee")) : null;
    }

}

