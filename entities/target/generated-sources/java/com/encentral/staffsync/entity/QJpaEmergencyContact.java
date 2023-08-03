package com.encentral.staffsync.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaEmergencyContact is a Querydsl query type for JpaEmergencyContact
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaEmergencyContact extends EntityPathBase<JpaEmergencyContact> {

    private static final long serialVersionUID = 270661889L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaEmergencyContact jpaEmergencyContact = new QJpaEmergencyContact("jpaEmergencyContact");

    public final StringPath address = createString("address");

    public final QJpaOption contactGender;

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.sql.Timestamp> dateCreated = createDateTime("dateCreated", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModified = createDateTime("dateModified", java.sql.Timestamp.class);

    public final StringPath email = createString("email");

    public final StringPath emergencyContactId = createString("emergencyContactId");

    public final QJpaEmployee employee;

    public final StringPath firstName = createString("firstName");

    public final StringPath lastName = createString("lastName");

    public final StringPath modifiedBy = createString("modifiedBy");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath relationship = createString("relationship");

    public QJpaEmergencyContact(String variable) {
        this(JpaEmergencyContact.class, forVariable(variable), INITS);
    }

    public QJpaEmergencyContact(Path<? extends JpaEmergencyContact> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaEmergencyContact(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaEmergencyContact(PathMetadata metadata, PathInits inits) {
        this(JpaEmergencyContact.class, metadata, inits);
    }

    public QJpaEmergencyContact(Class<? extends JpaEmergencyContact> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.contactGender = inits.isInitialized("contactGender") ? new QJpaOption(forProperty("contactGender"), inits.get("contactGender")) : null;
        this.employee = inits.isInitialized("employee") ? new QJpaEmployee(forProperty("employee"), inits.get("employee")) : null;
    }

}

