package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaOptionType is a Querydsl query type for JpaOptionType
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaOptionType extends EntityPathBase<JpaOptionType> {

    private static final long serialVersionUID = 834645633L;

    public static final QJpaOptionType jpaOptionType = new QJpaOptionType("jpaOptionType");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final StringPath modifiedBy = createString("modifiedBy");

    public final StringPath optionDescription = createString("optionDescription");

    public final SetPath<JpaOption, QJpaOption> options = this.<JpaOption, QJpaOption>createSet("options", JpaOption.class, QJpaOption.class, PathInits.DIRECT2);

    public final StringPath optionType = createString("optionType");

    public final StringPath optionTypeId = createString("optionTypeId");

    public QJpaOptionType(String variable) {
        super(JpaOptionType.class, forVariable(variable));
    }

    public QJpaOptionType(Path<? extends JpaOptionType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJpaOptionType(PathMetadata metadata) {
        super(JpaOptionType.class, metadata);
    }

}

