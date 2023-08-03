package com.encentral.staffsync.commons.util;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.lang.reflect.Field;


/**
 * @author WARITH
 * @dateCreated 31/07/2023
 * @description A quick object mapper, that can be used to copy
 * the fields in a DTO to an Entity.
 * Implementation is by java reflection. This should be used
 * strictly for testing purpose as it has some runtime cost.
 */
public class Mapper {
    private Object sourceObject;
    private Object destinationObject;
    private boolean copyNulls;

    private final Logger logger = (Logger) LogManager.getLogger(Mapper.class);

    public Mapper() {
        this.copyNulls = true;
    }

    public Mapper(boolean copyNulls) {
        this.copyNulls = copyNulls;
    }

    /**
     * @author WARITH
     * @dateCreated 31/07/2023
     * @description Sets the source object to copy attributes values from
     * @param source the source object
     * @return Mapper
     */
    public  Mapper copyAttributeFrom(Object source) {
        this.sourceObject = source;
        return this;
    }

    /**
     * @author WARITH
     * @dateCreated 31/07/2023
     * @description Sets the destination object to copy attributes values to
     * @param destination the source object
     * @return Mapper
     */
    public Mapper to(Object destination) {
        this.destinationObject = destination;
        return this;
    }

    /**
     * @author WARITH
     * @dateCreated 31/07/2023
     * @description Sets the mapper to skip null values when copying attributes
     * @return Mapper
     */
    public Mapper skippNullValues() {
        this.copyNulls = false;
        return this;
    }

    /**
     * @author WARITH
     * @dateCreated 31/07/2023
     * @description To be called after setting the required fields
     * for the mapper object to commence mapping
     */
    public void map() {
        this.mapObjects(sourceObject, destinationObject);
    }

    /**
     * @author WARITH
     * @dateCreated 31/07/2023
     * @description Performs the actual mapping of attribute values
     * implemented using java reflection (private)
     * @param from The source object
     * @param to The destination object to copy to
     */
    private void mapObjects(Object from, Object to) {
        logger.setLevel(Level.WARN);
        for (Field f : from.getClass().getDeclaredFields()) {
            f.setAccessible(true);

            try {
                Field other = to.getClass().getDeclaredField(f.getName());
                other.setAccessible(true);
                Object value = f.get(from);
                if (value == null && !this.copyNulls)
                    continue;
                other.set(to, value);
            } catch (NoSuchFieldException e) {
                logger.warn("Field doesn't exist: " + f.getName());
            } catch (IllegalAccessException e) {
                logger.warn("Cannot set field: " + f.getName() + " in object: " + to);
            }

        }
    }

    /**
     * @author WARITH
     * @dateCreated 31/07/2023
     * @description Performs the mapping of attribute values from a source
     * object to a destination object implemented using java reflection
     * @param source The source object
     * @param destination The destination object to copy to
     */
    public void objectMapper(Object source, Object destination) {
        this.mapObjects(source, destination);
    }
}
