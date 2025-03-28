/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.routines;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgInputErrorInfo extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.pg_input_error_info.value</code>.
     */
    public static final Parameter<String> VALUE = Internal.createParameter("value", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_input_error_info.type_name</code>.
     */
    public static final Parameter<String> TYPE_NAME = Internal.createParameter("type_name", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_input_error_info.message</code>.
     */
    public static final Parameter<String> MESSAGE = Internal.createParameter("message", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_input_error_info.detail</code>.
     */
    public static final Parameter<String> DETAIL = Internal.createParameter("detail", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_input_error_info.hint</code>.
     */
    public static final Parameter<String> HINT = Internal.createParameter("hint", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_input_error_info.sql_error_code</code>.
     */
    public static final Parameter<String> SQL_ERROR_CODE = Internal.createParameter("sql_error_code", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public PgInputErrorInfo() {
        super("pg_input_error_info", PgCatalog.PG_CATALOG);

        addInParameter(VALUE);
        addInParameter(TYPE_NAME);
        addOutParameter(MESSAGE);
        addOutParameter(DETAIL);
        addOutParameter(HINT);
        addOutParameter(SQL_ERROR_CODE);
    }

    /**
     * Set the <code>value</code> parameter IN value to the routine
     */
    public void setValue(String value) {
        setValue(VALUE, value);
    }

    /**
     * Set the <code>type_name</code> parameter IN value to the routine
     */
    public void setTypeName(String value) {
        setValue(TYPE_NAME, value);
    }

    /**
     * Get the <code>message</code> parameter OUT value from the routine
     */
    public String getMessage() {
        return get(MESSAGE);
    }

    /**
     * Get the <code>detail</code> parameter OUT value from the routine
     */
    public String getDetail() {
        return get(DETAIL);
    }

    /**
     * Get the <code>hint</code> parameter OUT value from the routine
     */
    public String getHint() {
        return get(HINT);
    }

    /**
     * Get the <code>sql_error_code</code> parameter OUT value from the routine
     */
    public String getSqlErrorCode() {
        return get(SQL_ERROR_CODE);
    }
}
