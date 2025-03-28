/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgOptionsToTable;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgOptionsToTableRecord extends TableRecordImpl<PgOptionsToTableRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_options_to_table.option_name</code>.
     */
    public void setOptionName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_options_to_table.option_name</code>.
     */
    public String getOptionName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_options_to_table.option_value</code>.
     */
    public void setOptionValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_options_to_table.option_value</code>.
     */
    public String getOptionValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgOptionsToTableRecord
     */
    public PgOptionsToTableRecord() {
        super(PgOptionsToTable.PG_OPTIONS_TO_TABLE);
    }

    /**
     * Create a detached, initialised PgOptionsToTableRecord
     */
    public PgOptionsToTableRecord(String optionName, String optionValue) {
        super(PgOptionsToTable.PG_OPTIONS_TO_TABLE);

        setOptionName(optionName);
        setOptionValue(optionValue);
        resetChangedOnNotNull();
    }
}
