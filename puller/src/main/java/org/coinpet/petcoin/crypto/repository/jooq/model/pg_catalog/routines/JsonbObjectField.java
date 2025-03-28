/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.routines;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JsonbObjectField extends AbstractRoutine<JSONB> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.jsonb_object_field.RETURN_VALUE</code>.
     */
    public static final Parameter<JSONB> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.JSONB, false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_object_field.from_json</code>.
     */
    public static final Parameter<JSONB> FROM_JSON = Internal.createParameter("from_json", SQLDataType.JSONB, false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_object_field.field_name</code>.
     */
    public static final Parameter<String> FIELD_NAME = Internal.createParameter("field_name", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public JsonbObjectField() {
        super("jsonb_object_field", PgCatalog.PG_CATALOG, SQLDataType.JSONB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(FROM_JSON);
        addInParameter(FIELD_NAME);
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    public void setFromJson(JSONB value) {
        setValue(FROM_JSON, value);
    }

    /**
     * Set the <code>from_json</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setFromJson(Field<JSONB> field) {
        setField(FROM_JSON, field);
    }

    /**
     * Set the <code>field_name</code> parameter IN value to the routine
     */
    public void setFieldName(String value) {
        setValue(FIELD_NAME, value);
    }

    /**
     * Set the <code>field_name</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setFieldName(Field<String> field) {
        setField(FIELD_NAME, field);
    }
}
