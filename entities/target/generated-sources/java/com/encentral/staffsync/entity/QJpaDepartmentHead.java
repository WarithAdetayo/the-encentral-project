package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaDepartmentHead is a Querydsl query type for JpaDepartmentHead
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaDepartmentHead extends EntityPathBase<JpaDepartmentHead> {

    private static final long serialVersionUID = 1916864644L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaDepartmentHead jpaDepartmentHead = new QJpaDepartmentHead("jpaDepartmentHead");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final QJpaDepartment department;

    public final StringPath departmentHeadId = createString("departmentHeadId");

    public final QJpaEmployee employee;

    public final StringPath modifiedBy = createString("modifiedBy");

    public QJpaDepartmentHead(String variable) {
        this(JpaDepartmentHead.class, forVariable(variable), INITS);
    }

    public QJpaDepartmentHead(Path<? extends JpaDepartmentHead> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaDepartmentHead(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaDepartmentHead(PathMetadata metadata, PathInits inits) {
        this(JpaDepartmentHead.class, metadata, inits);
    }

    public QJpaDepartmentHead(Class<? extends JpaDepartmentHead> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.department = inits.isInitialized("department") ? new QJpaDepartment(forProperty("department"), inits.get("department")) : null;
        this.employee = inits.isInitialized("employee") ? new QJpaEmployee(forProperty("employee"), inits.get("employee")) : null;
    }

}

