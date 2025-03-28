/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.CharacterSets;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class CharacterSetsRecord extends TableRecordImpl<CharacterSetsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.character_sets.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.character_set_catalog</code>.
     */
    public String getCharacterSetCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.character_set_schema</code>.
     */
    public void setCharacterSetSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.character_set_schema</code>.
     */
    public String getCharacterSetSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.character_set_name</code>.
     */
    public void setCharacterSetName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.character_set_name</code>.
     */
    public String getCharacterSetName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.character_repertoire</code>.
     */
    public void setCharacterRepertoire(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.character_repertoire</code>.
     */
    public String getCharacterRepertoire() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.character_sets.form_of_use</code>.
     */
    public void setFormOfUse(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.character_sets.form_of_use</code>.
     */
    public String getFormOfUse() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.default_collate_catalog</code>.
     */
    public void setDefaultCollateCatalog(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.default_collate_catalog</code>.
     */
    public String getDefaultCollateCatalog() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.default_collate_schema</code>.
     */
    public void setDefaultCollateSchema(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.default_collate_schema</code>.
     */
    public String getDefaultCollateSchema() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.default_collate_name</code>.
     */
    public void setDefaultCollateName(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.default_collate_name</code>.
     */
    public String getDefaultCollateName() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CharacterSetsRecord
     */
    public CharacterSetsRecord() {
        super(CharacterSets.CHARACTER_SETS);
    }

    /**
     * Create a detached, initialised CharacterSetsRecord
     */
    public CharacterSetsRecord(String characterSetCatalog, String characterSetSchema, String characterSetName, String characterRepertoire, String formOfUse, String defaultCollateCatalog, String defaultCollateSchema, String defaultCollateName) {
        super(CharacterSets.CHARACTER_SETS);

        setCharacterSetCatalog(characterSetCatalog);
        setCharacterSetSchema(characterSetSchema);
        setCharacterSetName(characterSetName);
        setCharacterRepertoire(characterRepertoire);
        setFormOfUse(formOfUse);
        setDefaultCollateCatalog(defaultCollateCatalog);
        setDefaultCollateSchema(defaultCollateSchema);
        setDefaultCollateName(defaultCollateName);
        resetChangedOnNotNull();
    }
}
