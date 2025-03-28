/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.Schemata;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class SchemataRecord extends TableRecordImpl<SchemataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.schemata.catalog_name</code>.
     */
    public void setCatalogName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.schemata.catalog_name</code>.
     */
    public String getCatalogName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.schemata.schema_name</code>.
     */
    public void setSchemaName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.schemata.schema_name</code>.
     */
    public String getSchemaName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.schemata.schema_owner</code>.
     */
    public void setSchemaOwner(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.schemata.schema_owner</code>.
     */
    public String getSchemaOwner() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.schemata.default_character_set_catalog</code>.
     */
    public void setDefaultCharacterSetCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.schemata.default_character_set_catalog</code>.
     */
    public String getDefaultCharacterSetCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.schemata.default_character_set_schema</code>.
     */
    public void setDefaultCharacterSetSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.schemata.default_character_set_schema</code>.
     */
    public String getDefaultCharacterSetSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.schemata.default_character_set_name</code>.
     */
    public void setDefaultCharacterSetName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.schemata.default_character_set_name</code>.
     */
    public String getDefaultCharacterSetName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.schemata.sql_path</code>.
     */
    public void setSqlPath(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.schemata.sql_path</code>.
     */
    public String getSqlPath() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SchemataRecord
     */
    public SchemataRecord() {
        super(Schemata.SCHEMATA);
    }

    /**
     * Create a detached, initialised SchemataRecord
     */
    public SchemataRecord(String catalogName, String schemaName, String schemaOwner, String defaultCharacterSetCatalog, String defaultCharacterSetSchema, String defaultCharacterSetName, String sqlPath) {
        super(Schemata.SCHEMATA);

        setCatalogName(catalogName);
        setSchemaName(schemaName);
        setSchemaOwner(schemaOwner);
        setDefaultCharacterSetCatalog(defaultCharacterSetCatalog);
        setDefaultCharacterSetSchema(defaultCharacterSetSchema);
        setDefaultCharacterSetName(defaultCharacterSetName);
        setSqlPath(sqlPath);
        resetChangedOnNotNull();
    }
}
