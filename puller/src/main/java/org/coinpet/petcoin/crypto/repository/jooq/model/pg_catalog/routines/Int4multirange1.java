/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.routines;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.DefaultDataType;
import org.jooq.impl.Internal;



/**
 * @deprecated Unknown data type. If this is a qualified, user-defined type, it
 * may have been excluded from code generation. If this is a built-in type, you
 * can define an explicit {@link org.jooq.Binding} to specify how this type
 * should be handled. Deprecation can be turned off using {@literal
 * <deprecationOnUnknownTypes/>} in your code generator configuration.
 */
@Deprecated
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Int4multirange1 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1L;

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"int4multirange\""), false, false);

    /**
     * Create a new routine call instance
     */
    public Int4multirange1() {
        super("int4multirange", PgCatalog.PG_CATALOG, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"int4multirange\""));

        setReturnParameter(RETURN_VALUE);
        setOverloaded(true);
    }
}
