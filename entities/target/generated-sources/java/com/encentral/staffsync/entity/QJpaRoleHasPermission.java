package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaRoleHasPermission is a Querydsl query type for JpaRoleHasPermission
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaRoleHasPermission extends EntityPathBase<JpaRoleHasPermission> {

    private static final long serialVersionUID = -1650353727L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaRoleHasPermission jpaRoleHasPermission = new QJpaRoleHasPermission("jpaRoleHasPermission");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final QJpaPermission permission;

    public final QJpaRole role;

    public final StringPath roleHasPermissionId = createString("roleHasPermissionId");

    public QJpaRoleHasPermission(String variable) {
        this(JpaRoleHasPermission.class, forVariable(variable), INITS);
    }

    public QJpaRoleHasPermission(Path<? extends JpaRoleHasPermission> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaRoleHasPermission(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaRoleHasPermission(PathMetadata metadata, PathInits inits) {
        this(JpaRoleHasPermission.class, metadata, inits);
    }

    public QJpaRoleHasPermission(Class<? extends JpaRoleHasPermission> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.permission = inits.isInitialized("permission") ? new QJpaPermission(forProperty("permission")) : null;
        this.role = inits.isInitialized("role") ? new QJpaRole(forProperty("role")) : null;
    }

}

