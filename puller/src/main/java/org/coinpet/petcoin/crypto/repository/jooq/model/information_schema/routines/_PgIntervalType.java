/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.routines;


import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.InformationSchema;
import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class _PgIntervalType extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>information_schema._pg_interval_type.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>information_schema._pg_interval_type.typid</code>.
     */
    public static final Parameter<Long> TYPID = Internal.createParameter("typid", SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>information_schema._pg_interval_type.mod</code>.
     */
    public static final Parameter<Integer> MOD = Internal.createParameter("mod", SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public _PgIntervalType() {
        super("_pg_interval_type", InformationSchema.INFORMATION_SCHEMA, SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(TYPID);
        addInParameter(MOD);
    }

    /**
     * Set the <code>typid</code> parameter IN value to the routine
     */
    public void setTypid(Long value) {
        setValue(TYPID, value);
    }

    /**
     * Set the <code>typid</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setTypid(Field<Long> field) {
        setField(TYPID, field);
    }

    /**
     * Set the <code>mod</code> parameter IN value to the routine
     */
    public void setMod(Integer value) {
        setValue(MOD, value);
    }

    /**
     * Set the <code>mod</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setMod(Field<Integer> field) {
        setField(MOD, field);
    }
}
