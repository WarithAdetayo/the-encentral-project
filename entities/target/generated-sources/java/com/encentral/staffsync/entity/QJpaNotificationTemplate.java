package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaNotificationTemplate is a Querydsl query type for JpaNotificationTemplate
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaNotificationTemplate extends EntityPathBase<JpaNotificationTemplate> {

    private static final long serialVersionUID = 191540535L;

    public static final QJpaNotificationTemplate jpaNotificationTemplate = new QJpaNotificationTemplate("jpaNotificationTemplate");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final StringPath modifiedBy = createString("modifiedBy");

    public final StringPath notificationDescription = createString("notificationDescription");

    public final SetPath<JpaNotification, QJpaNotification> notifications = this.<JpaNotification, QJpaNotification>createSet("notifications", JpaNotification.class, QJpaNotification.class, PathInits.DIRECT2);

    public final StringPath notificationTemplateContent = createString("notificationTemplateContent");

    public final StringPath notificationTemplateId = createString("notificationTemplateId");

    public final StringPath notificationTemplateName = createString("notificationTemplateName");

    public QJpaNotificationTemplate(String variable) {
        super(JpaNotificationTemplate.class, forVariable(variable));
    }

    public QJpaNotificationTemplate(Path<? extends JpaNotificationTemplate> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJpaNotificationTemplate(PathMetadata metadata) {
        super(JpaNotificationTemplate.class, metadata);
    }

}

