/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.ForeignDataWrapperOptions;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ForeignDataWrapperOptionsRecord extends TableRecordImpl<ForeignDataWrapperOptionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.foreign_data_wrapper_options.foreign_data_wrapper_catalog</code>.
     */
    public void setForeignDataWrapperCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_data_wrapper_options.foreign_data_wrapper_catalog</code>.
     */
    public String getForeignDataWrapperCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_data_wrapper_options.foreign_data_wrapper_name</code>.
     */
    public void setForeignDataWrapperName(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_data_wrapper_options.foreign_data_wrapper_name</code>.
     */
    public String getForeignDataWrapperName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_data_wrapper_options.option_name</code>.
     */
    public void setOptionName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_data_wrapper_options.option_name</code>.
     */
    public String getOptionName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_data_wrapper_options.option_value</code>.
     */
    public void setOptionValue(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_data_wrapper_options.option_value</code>.
     */
    public String getOptionValue() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ForeignDataWrapperOptionsRecord
     */
    public ForeignDataWrapperOptionsRecord() {
        super(ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS);
    }

    /**
     * Create a detached, initialised ForeignDataWrapperOptionsRecord
     */
    public ForeignDataWrapperOptionsRecord(String foreignDataWrapperCatalog, String foreignDataWrapperName, String optionName, String optionValue) {
        super(ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS);

        setForeignDataWrapperCatalog(foreignDataWrapperCatalog);
        setForeignDataWrapperName(foreignDataWrapperName);
        setOptionName(optionName);
        setOptionValue(optionValue);
        resetChangedOnNotNull();
    }
}
