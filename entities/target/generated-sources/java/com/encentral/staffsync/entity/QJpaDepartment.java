package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaDepartment is a Querydsl query type for JpaDepartment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaDepartment extends EntityPathBase<JpaDepartment> {

    private static final long serialVersionUID = 309241988L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaDepartment jpaDepartment = new QJpaDepartment("jpaDepartment");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final QJpaDepartmentHead departmentHead;

    public final StringPath departmentId = createString("departmentId");

    public final StringPath departmentName = createString("departmentName");

    public final StringPath description = createString("description");

    public final SetPath<JpaEmployee, QJpaEmployee> employees = this.<JpaEmployee, QJpaEmployee>createSet("employees", JpaEmployee.class, QJpaEmployee.class, PathInits.DIRECT2);

    public final StringPath modifiedBy = createString("modifiedBy");

    public final NumberPath<Integer> workingHours = createNumber("workingHours", Integer.class);

    public QJpaDepartment(String variable) {
        this(JpaDepartment.class, forVariable(variable), INITS);
    }

    public QJpaDepartment(Path<? extends JpaDepartment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaDepartment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaDepartment(PathMetadata metadata, PathInits inits) {
        this(JpaDepartment.class, metadata, inits);
    }

    public QJpaDepartment(Class<? extends JpaDepartment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.departmentHead = inits.isInitialized("departmentHead") ? new QJpaDepartmentHead(forProperty("departmentHead"), inits.get("departmentHead")) : null;
    }

}

