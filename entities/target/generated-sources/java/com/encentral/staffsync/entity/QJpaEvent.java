package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaEvent is a Querydsl query type for JpaEvent
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaEvent extends EntityPathBase<JpaEvent> {

    private static final long serialVersionUID = -1002170840L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaEvent jpaEvent = new QJpaEvent("jpaEvent");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final DatePath<java.util.Date> endDate = createDate("endDate", java.util.Date.class);

    public final StringPath eventDescription = createString("eventDescription");

    public final StringPath eventId = createString("eventId");

    public final EnumPath<com.encentral.staffsync.entity.enums.EventStatus> eventStatus = createEnum("eventStatus", com.encentral.staffsync.entity.enums.EventStatus.class);

    public final StringPath eventTitle = createString("eventTitle");

    public final QJpaOption eventType;

    public final StringPath modifiedBy = createString("modifiedBy");

    public final DatePath<java.util.Date> startDate = createDate("startDate", java.util.Date.class);

    public QJpaEvent(String variable) {
        this(JpaEvent.class, forVariable(variable), INITS);
    }

    public QJpaEvent(Path<? extends JpaEvent> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaEvent(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaEvent(PathMetadata metadata, PathInits inits) {
        this(JpaEvent.class, metadata, inits);
    }

    public QJpaEvent(Class<? extends JpaEvent> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.eventType = inits.isInitialized("eventType") ? new QJpaOption(forProperty("eventType"), inits.get("eventType")) : null;
    }

}

