package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaAnnouncementRecipient is a Querydsl query type for JpaAnnouncementRecipient
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaAnnouncementRecipient extends EntityPathBase<JpaAnnouncementRecipient> {

    private static final long serialVersionUID = -2072966112L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaAnnouncementRecipient jpaAnnouncementRecipient = new QJpaAnnouncementRecipient("jpaAnnouncementRecipient");

    public final QJpaAnnouncement announcement;

    public final StringPath announcementRecipientId = createString("announcementRecipientId");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateRead = createDateTime("dateRead", java.sql.Timestamp.class);

    public final StringPath deliveryStatus = createString("deliveryStatus");

    public final QJpaEmployee employee;

    public QJpaAnnouncementRecipient(String variable) {
        this(JpaAnnouncementRecipient.class, forVariable(variable), INITS);
    }

    public QJpaAnnouncementRecipient(Path<? extends JpaAnnouncementRecipient> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaAnnouncementRecipient(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaAnnouncementRecipient(PathMetadata metadata, PathInits inits) {
        this(JpaAnnouncementRecipient.class, metadata, inits);
    }

    public QJpaAnnouncementRecipient(Class<? extends JpaAnnouncementRecipient> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.announcement = inits.isInitialized("announcement") ? new QJpaAnnouncement(forProperty("announcement"), inits.get("announcement")) : null;
        this.employee = inits.isInitialized("employee") ? new QJpaEmployee(forProperty("employee"), inits.get("employee")) : null;
    }

}

