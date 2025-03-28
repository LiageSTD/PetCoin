/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgShowAllFileSettings;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgShowAllFileSettingsRecord extends TableRecordImpl<PgShowAllFileSettingsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.sourcefile</code>.
     */
    public void setSourcefile(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.sourcefile</code>.
     */
    public String getSourcefile() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.sourceline</code>.
     */
    public void setSourceline(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.sourceline</code>.
     */
    public Integer getSourceline() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.seqno</code>.
     */
    public void setSeqno(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.seqno</code>.
     */
    public Integer getSeqno() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.setting</code>.
     */
    public void setSetting(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.setting</code>.
     */
    public String getSetting() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.applied</code>.
     */
    public void setApplied(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.applied</code>.
     */
    public Boolean getApplied() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_file_settings.error</code>.
     */
    public void setError(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_file_settings.error</code>.
     */
    public String getError() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgShowAllFileSettingsRecord
     */
    public PgShowAllFileSettingsRecord() {
        super(PgShowAllFileSettings.PG_SHOW_ALL_FILE_SETTINGS);
    }

    /**
     * Create a detached, initialised PgShowAllFileSettingsRecord
     */
    public PgShowAllFileSettingsRecord(String sourcefile, Integer sourceline, Integer seqno, String name, String setting, Boolean applied, String error) {
        super(PgShowAllFileSettings.PG_SHOW_ALL_FILE_SETTINGS);

        setSourcefile(sourcefile);
        setSourceline(sourceline);
        setSeqno(seqno);
        setName(name);
        setSetting(setting);
        setApplied(applied);
        setError(error);
        resetChangedOnNotNull();
    }
}
