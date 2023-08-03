package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaNotification is a Querydsl query type for JpaNotification
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaNotification extends EntityPathBase<JpaNotification> {

    private static final long serialVersionUID = -1932105315L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaNotification jpaNotification = new QJpaNotification("jpaNotification");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateRead = createDateTime("dateRead", java.sql.Timestamp.class);

    public final StringPath deliveryStatus = createString("deliveryStatus");

    public final StringPath modifiedBy = createString("modifiedBy");

    public final StringPath notificationId = createString("notificationId");

    public final StringPath notificationMessage = createString("notificationMessage");

    public final QJpaNotificationTemplate notificationTemplateBean;

    public final StringPath notificationTitle = createString("notificationTitle");

    public final EnumPath<com.encentral.staffsync.entity.enums.NotificationPriority> priority = createEnum("priority", com.encentral.staffsync.entity.enums.NotificationPriority.class);

    public final QJpaEmployee receiver;

    public final QJpaEmployee sender;

    public QJpaNotification(String variable) {
        this(JpaNotification.class, forVariable(variable), INITS);
    }

    public QJpaNotification(Path<? extends JpaNotification> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaNotification(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaNotification(PathMetadata metadata, PathInits inits) {
        this(JpaNotification.class, metadata, inits);
    }

    public QJpaNotification(Class<? extends JpaNotification> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.notificationTemplateBean = inits.isInitialized("notificationTemplateBean") ? new QJpaNotificationTemplate(forProperty("notificationTemplateBean")) : null;
        this.receiver = inits.isInitialized("receiver") ? new QJpaEmployee(forProperty("receiver"), inits.get("receiver")) : null;
        this.sender = inits.isInitialized("sender") ? new QJpaEmployee(forProperty("sender"), inits.get("sender")) : null;
    }

}

