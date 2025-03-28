/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.routines;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultDataType;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JsonbPathExistsTz extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.jsonb_path_exists_tz.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_path_exists_tz.target</code>.
     */
    public static final Parameter<JSONB> TARGET = Internal.createParameter("target", SQLDataType.JSONB, false, false);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> PATH = Internal.createParameter("path", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonpath\""), false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_path_exists_tz.vars</code>.
     */
    public static final Parameter<JSONB> VARS = Internal.createParameter("vars", SQLDataType.JSONB.defaultValue(DSL.field(DSL.raw("'{}'::jsonb"), SQLDataType.JSONB)), true, false);

    /**
     * The parameter <code>pg_catalog.jsonb_path_exists_tz.silent</code>.
     */
    public static final Parameter<Boolean> SILENT = Internal.createParameter("silent", SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public JsonbPathExistsTz() {
        super("jsonb_path_exists_tz", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(TARGET);
        addInParameter(PATH);
        addInParameter(VARS);
        addInParameter(SILENT);
    }

    /**
     * Set the <code>target</code> parameter IN value to the routine
     */
    public void setTarget(JSONB value) {
        setValue(TARGET, value);
    }

    /**
     * Set the <code>target</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setTarget(Field<JSONB> field) {
        setField(TARGET, field);
    }

    /**
     * Set the <code>path</code> parameter IN value to the routine
     */
    public void setPath(Object value) {
        setValue(PATH, value);
    }

    /**
     * Set the <code>path</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setPath(Field<Object> field) {
        setField(PATH, field);
    }

    /**
     * Set the <code>vars</code> parameter IN value to the routine
     */
    public void setVars(JSONB value) {
        setValue(VARS, value);
    }

    /**
     * Set the <code>vars</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setVars(Field<JSONB> field) {
        setField(VARS, field);
    }

    /**
     * Set the <code>silent</code> parameter IN value to the routine
     */
    public void setSilent(Boolean value) {
        setValue(SILENT, value);
    }

    /**
     * Set the <code>silent</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setSilent(Field<Boolean> field) {
        setField(SILENT, field);
    }
}
