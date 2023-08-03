package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaRole is a Querydsl query type for JpaRole
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaRole extends EntityPathBase<JpaRole> {

    private static final long serialVersionUID = -724683992L;

    public static final QJpaRole jpaRole = new QJpaRole("jpaRole");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final SetPath<JpaEmployee, QJpaEmployee> employees = this.<JpaEmployee, QJpaEmployee>createSet("employees", JpaEmployee.class, QJpaEmployee.class, PathInits.DIRECT2);

    public final StringPath modifiedBy = createString("modifiedBy");

    public final SetPath<JpaPermission, QJpaPermission> permissions = this.<JpaPermission, QJpaPermission>createSet("permissions", JpaPermission.class, QJpaPermission.class, PathInits.DIRECT2);

    public final StringPath roleDescription = createString("roleDescription");

    public final SetPath<JpaRoleHasPermission, QJpaRoleHasPermission> roleHasPermissions = this.<JpaRoleHasPermission, QJpaRoleHasPermission>createSet("roleHasPermissions", JpaRoleHasPermission.class, QJpaRoleHasPermission.class, PathInits.DIRECT2);

    public final StringPath roleId = createString("roleId");

    public final StringPath roleName = createString("roleName");

    public QJpaRole(String variable) {
        super(JpaRole.class, forVariable(variable));
    }

    public QJpaRole(Path<? extends JpaRole> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJpaRole(PathMetadata metadata) {
        super(JpaRole.class, metadata);
    }

}

