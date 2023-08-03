package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaEmployeeHasDocument is a Querydsl query type for JpaEmployeeHasDocument
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaEmployeeHasDocument extends EntityPathBase<JpaEmployeeHasDocument> {

    private static final long serialVersionUID = 321145173L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaEmployeeHasDocument jpaEmployeeHasDocument = new QJpaEmployeeHasDocument("jpaEmployeeHasDocument");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final QJpaDocument document;

    public final StringPath documentId = createString("documentId");

    public final QJpaOption documentType;

    public final QJpaEmployee employee;

    public final StringPath employeeHasDocumentId = createString("employeeHasDocumentId");

    public QJpaEmployeeHasDocument(String variable) {
        this(JpaEmployeeHasDocument.class, forVariable(variable), INITS);
    }

    public QJpaEmployeeHasDocument(Path<? extends JpaEmployeeHasDocument> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaEmployeeHasDocument(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaEmployeeHasDocument(PathMetadata metadata, PathInits inits) {
        this(JpaEmployeeHasDocument.class, metadata, inits);
    }

    public QJpaEmployeeHasDocument(Class<? extends JpaEmployeeHasDocument> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.document = inits.isInitialized("document") ? new QJpaDocument(forProperty("document"), inits.get("document")) : null;
        this.documentType = inits.isInitialized("documentType") ? new QJpaOption(forProperty("documentType"), inits.get("documentType")) : null;
        this.employee = inits.isInitialized("employee") ? new QJpaEmployee(forProperty("employee"), inits.get("employee")) : null;
    }

}

