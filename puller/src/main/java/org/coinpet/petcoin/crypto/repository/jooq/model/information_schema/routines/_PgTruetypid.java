/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.routines;


import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.InformationSchema;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgAttribute;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgType;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgAttributeRecord;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgTypeRecord;
import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class _PgTruetypid extends AbstractRoutine<Long> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>information_schema._pg_truetypid.RETURN_VALUE</code>.
     */
    public static final Parameter<Long> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>information_schema._pg_truetypid._1</code>.
     */
    public static final Parameter<PgAttributeRecord> _1 = Internal.createParameter("_1", PgAttribute.PG_ATTRIBUTE.getDataType(), false, true);

    /**
     * The parameter <code>information_schema._pg_truetypid._2</code>.
     */
    public static final Parameter<PgTypeRecord> _2 = Internal.createParameter("_2", PgType.PG_TYPE.getDataType(), false, true);

    /**
     * Create a new routine call instance
     */
    public _PgTruetypid() {
        super("_pg_truetypid", InformationSchema.INFORMATION_SCHEMA, SQLDataType.BIGINT);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(PgAttributeRecord value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<PgAttributeRecord> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(PgTypeRecord value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<PgTypeRecord> field) {
        setField(_2, field);
    }
}
