package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaOption is a Querydsl query type for JpaOption
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaOption extends EntityPathBase<JpaOption> {

    private static final long serialVersionUID = -721332569L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaOption jpaOption = new QJpaOption("jpaOption");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final StringPath modifiedBy = createString("modifiedBy");

    public final StringPath optionId = createString("optionId");

    public final QJpaOptionType optionType;

    public final StringPath optionValue = createString("optionValue");

    public QJpaOption(String variable) {
        this(JpaOption.class, forVariable(variable), INITS);
    }

    public QJpaOption(Path<? extends JpaOption> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaOption(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaOption(PathMetadata metadata, PathInits inits) {
        this(JpaOption.class, metadata, inits);
    }

    public QJpaOption(Class<? extends JpaOption> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.optionType = inits.isInitialized("optionType") ? new QJpaOptionType(forProperty("optionType")) : null;
    }

}

