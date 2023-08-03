package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaAnnouncement is a Querydsl query type for JpaAnnouncement
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaAnnouncement extends EntityPathBase<JpaAnnouncement> {

    private static final long serialVersionUID = 1924410873L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaAnnouncement jpaAnnouncement = new QJpaAnnouncement("jpaAnnouncement");

    public final StringPath announcementId = createString("announcementId");

    public final StringPath announcementMessage = createString("announcementMessage");

    public final SetPath<JpaAnnouncementRecipient, QJpaAnnouncementRecipient> announcementRecipients = this.<JpaAnnouncementRecipient, QJpaAnnouncementRecipient>createSet("announcementRecipients", JpaAnnouncementRecipient.class, QJpaAnnouncementRecipient.class, PathInits.DIRECT2);

    public final StringPath announcementTitle = createString("announcementTitle");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final DatePath<java.util.Date> deliveryDate = createDate("deliveryDate", java.util.Date.class);

    public final QJpaEmployee employee;

    public final StringPath modifiedBy = createString("modifiedBy");

    public final EnumPath<com.encentral.staffsync.entity.enums.NotificationPriority> priority = createEnum("priority", com.encentral.staffsync.entity.enums.NotificationPriority.class);

    public QJpaAnnouncement(String variable) {
        this(JpaAnnouncement.class, forVariable(variable), INITS);
    }

    public QJpaAnnouncement(Path<? extends JpaAnnouncement> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaAnnouncement(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaAnnouncement(PathMetadata metadata, PathInits inits) {
        this(JpaAnnouncement.class, metadata, inits);
    }

    public QJpaAnnouncement(Class<? extends JpaAnnouncement> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employee = inits.isInitialized("employee") ? new QJpaEmployee(forProperty("employee"), inits.get("employee")) : null;
    }

}

