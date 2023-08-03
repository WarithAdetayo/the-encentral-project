package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaAttendance is a Querydsl query type for JpaAttendance
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaAttendance extends EntityPathBase<JpaAttendance> {

    private static final long serialVersionUID = 1358448667L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaAttendance jpaAttendance = new QJpaAttendance("jpaAttendance");

    public final DatePath<java.util.Date> attendanceDate = createDate("attendanceDate", java.util.Date.class);

    public final StringPath attendanceId = createString("attendanceId");

    public final TimePath<java.sql.Time> checkInTime = createTime("checkInTime", java.sql.Time.class);

    public final TimePath<java.sql.Time> checkOutTime = createTime("checkOutTime", java.sql.Time.class);

    public final QJpaEmployee employee;

    public QJpaAttendance(String variable) {
        this(JpaAttendance.class, forVariable(variable), INITS);
    }

    public QJpaAttendance(Path<? extends JpaAttendance> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaAttendance(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaAttendance(PathMetadata metadata, PathInits inits) {
        this(JpaAttendance.class, metadata, inits);
    }

    public QJpaAttendance(Class<? extends JpaAttendance> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employee = inits.isInitialized("employee") ? new QJpaEmployee(forProperty("employee"), inits.get("employee")) : null;
    }

}

