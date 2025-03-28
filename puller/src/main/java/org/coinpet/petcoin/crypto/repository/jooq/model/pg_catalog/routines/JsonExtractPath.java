/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.routines;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JsonExtractPath extends AbstractRoutine<JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.json_extract_path.RETURN_VALUE</code>.
     */
    public static final Parameter<JSON> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.JSON, false, false);

    /**
     * The parameter <code>pg_catalog.json_extract_path.from_json</code>.
     */
    public static final Parameter<JSON> FROM_JSON = Internal.createParameter("from_json", SQLDataType.JSON, false, false);

    /**
     * The parameter <code>pg_catalog.json_extract_path.path_elems</code>.
     */
    public static final Parameter<String[]> PATH_ELEMS = Internal.createParameter("path_elems", SQLDataType.CLOB.array(), false, false);

    /**
     * Create a new routine call instance
     */
    public JsonExtractPath() {
        super("json_extract_path", PgCatalog.PG_CATALOG, SQLDataType.JSON);

        setReturnParameter(RETURN_VALUE);
        addInParameter(FROM_JSON);
        addInParameter(PATH_ELEMS);
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    public void setFromJson(JSON value) {
        setValue(FROM_JSON, value);
    }

    /**
     * Set the <code>from_json</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setFromJson(Field<JSON> field) {
        setField(FROM_JSON, field);
    }

    /**
     * Set the <code>path_elems</code> parameter IN value to the routine
     */
    public void setPathElems(String[] value) {
        setValue(PATH_ELEMS, value);
    }

    /**
     * Set the <code>path_elems</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setPathElems(Field<String[]> field) {
        setField(PATH_ELEMS, field);
    }
}
