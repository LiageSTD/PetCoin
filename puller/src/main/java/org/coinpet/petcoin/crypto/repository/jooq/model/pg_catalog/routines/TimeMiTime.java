/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.routines;


import java.time.LocalTime;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.types.YearToSecond;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class TimeMiTime extends AbstractRoutine<YearToSecond> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.time_mi_time.RETURN_VALUE</code>.
     */
    public static final Parameter<YearToSecond> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTERVAL, false, false);

    /**
     * The parameter <code>pg_catalog.time_mi_time._1</code>.
     */
    public static final Parameter<LocalTime> _1 = Internal.createParameter("_1", SQLDataType.LOCALTIME(6), false, true);

    /**
     * The parameter <code>pg_catalog.time_mi_time._2</code>.
     */
    public static final Parameter<LocalTime> _2 = Internal.createParameter("_2", SQLDataType.LOCALTIME(6), false, true);

    /**
     * Create a new routine call instance
     */
    public TimeMiTime() {
        super("time_mi_time", PgCatalog.PG_CATALOG, SQLDataType.INTERVAL);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(LocalTime value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<LocalTime> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(LocalTime value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<LocalTime> field) {
        setField(_2, field);
    }
}
