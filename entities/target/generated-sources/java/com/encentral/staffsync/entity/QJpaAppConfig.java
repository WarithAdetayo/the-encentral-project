package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QJpaAppConfig is a Querydsl query type for JpaAppConfig
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaAppConfig extends EntityPathBase<JpaAppConfig> {

    private static final long serialVersionUID = 1989491025L;

    public static final QJpaAppConfig jpaAppConfig = new QJpaAppConfig("jpaAppConfig");

    public final StringPath appConfigId = createString("appConfigId");

    public final StringPath configurationKey = createString("configurationKey");

    public final StringPath configurationValue = createString("configurationValue");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final StringPath modifiedBy = createString("modifiedBy");

    public QJpaAppConfig(String variable) {
        super(JpaAppConfig.class, forVariable(variable));
    }

    public QJpaAppConfig(Path<? extends JpaAppConfig> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJpaAppConfig(PathMetadata metadata) {
        super(JpaAppConfig.class, metadata);
    }

}

