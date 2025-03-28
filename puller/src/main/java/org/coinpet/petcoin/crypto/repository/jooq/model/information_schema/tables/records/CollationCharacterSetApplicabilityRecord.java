/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.CollationCharacterSetApplicability;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class CollationCharacterSetApplicabilityRecord extends TableRecordImpl<CollationCharacterSetApplicabilityRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.collation_catalog</code>.
     */
    public void setCollationCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.collation_catalog</code>.
     */
    public String getCollationCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.collation_schema</code>.
     */
    public void setCollationSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.collation_schema</code>.
     */
    public String getCollationSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.collation_name</code>.
     */
    public void setCollationName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.collation_name</code>.
     */
    public String getCollationName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.character_set_catalog</code>.
     */
    public String getCharacterSetCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.character_set_schema</code>.
     */
    public void setCharacterSetSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.character_set_schema</code>.
     */
    public String getCharacterSetSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.character_set_name</code>.
     */
    public void setCharacterSetName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.character_set_name</code>.
     */
    public String getCharacterSetName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CollationCharacterSetApplicabilityRecord
     */
    public CollationCharacterSetApplicabilityRecord() {
        super(CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);
    }

    /**
     * Create a detached, initialised CollationCharacterSetApplicabilityRecord
     */
    public CollationCharacterSetApplicabilityRecord(String collationCatalog, String collationSchema, String collationName, String characterSetCatalog, String characterSetSchema, String characterSetName) {
        super(CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);

        setCollationCatalog(collationCatalog);
        setCollationSchema(collationSchema);
        setCollationName(collationName);
        setCharacterSetCatalog(characterSetCatalog);
        setCharacterSetSchema(characterSetSchema);
        setCharacterSetName(characterSetName);
        resetChangedOnNotNull();
    }
}
