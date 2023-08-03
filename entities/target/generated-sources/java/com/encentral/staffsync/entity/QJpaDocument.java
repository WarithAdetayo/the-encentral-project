package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaDocument is a Querydsl query type for JpaDocument
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaDocument extends EntityPathBase<JpaDocument> {

    private static final long serialVersionUID = -770123059L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaDocument jpaDocument = new QJpaDocument("jpaDocument");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final StringPath documentDescription = createString("documentDescription");

    public final StringPath documentId = createString("documentId");

    public final StringPath documentName = createString("documentName");

    public final StringPath documentUploadPath = createString("documentUploadPath");

    public final QJpaEmployeeHasDocument employeeHasDocument;

    public final StringPath modifiedBy = createString("modifiedBy");

    public QJpaDocument(String variable) {
        this(JpaDocument.class, forVariable(variable), INITS);
    }

    public QJpaDocument(Path<? extends JpaDocument> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaDocument(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaDocument(PathMetadata metadata, PathInits inits) {
        this(JpaDocument.class, metadata, inits);
    }

    public QJpaDocument(Class<? extends JpaDocument> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employeeHasDocument = inits.isInitialized("employeeHasDocument") ? new QJpaEmployeeHasDocument(forProperty("employeeHasDocument"), inits.get("employeeHasDocument")) : null;
    }

}

