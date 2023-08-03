package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaPermission is a Querydsl query type for JpaPermission
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaPermission extends EntityPathBase<JpaPermission> {

    private static final long serialVersionUID = -1056560383L;

    public static final QJpaPermission jpaPermission = new QJpaPermission("jpaPermission");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final StringPath modifiedBy = createString("modifiedBy");

    public final EnumPath<com.encentral.staffsync.entity.enums.Action> permissionAction = createEnum("permissionAction", com.encentral.staffsync.entity.enums.Action.class);

    public final StringPath permissionDescription = createString("permissionDescription");

    public final StringPath permissionId = createString("permissionId");

    public final StringPath permissionName = createString("permissionName");

    public final SetPath<JpaRoleHasPermission, QJpaRoleHasPermission> roleHasPermissions = this.<JpaRoleHasPermission, QJpaRoleHasPermission>createSet("roleHasPermissions", JpaRoleHasPermission.class, QJpaRoleHasPermission.class, PathInits.DIRECT2);

    public final SetPath<JpaRole, QJpaRole> roles = this.<JpaRole, QJpaRole>createSet("roles", JpaRole.class, QJpaRole.class, PathInits.DIRECT2);

    public QJpaPermission(String variable) {
        super(JpaPermission.class, forVariable(variable));
    }

    public QJpaPermission(Path<? extends JpaPermission> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJpaPermission(PathMetadata metadata) {
        super(JpaPermission.class, metadata);
    }

}

