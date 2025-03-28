/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgTsDict;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgTsDictRecord extends UpdatableRecordImpl<PgTsDictRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_ts_dict.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_dict.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_dict.dictname</code>.
     */
    public void setDictname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_dict.dictname</code>.
     */
    public String getDictname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_dict.dictnamespace</code>.
     */
    public void setDictnamespace(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_dict.dictnamespace</code>.
     */
    public Long getDictnamespace() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_dict.dictowner</code>.
     */
    public void setDictowner(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_dict.dictowner</code>.
     */
    public Long getDictowner() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_dict.dicttemplate</code>.
     */
    public void setDicttemplate(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_dict.dicttemplate</code>.
     */
    public Long getDicttemplate() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_dict.dictinitoption</code>.
     */
    public void setDictinitoption(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_dict.dictinitoption</code>.
     */
    public String getDictinitoption() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgTsDictRecord
     */
    public PgTsDictRecord() {
        super(PgTsDict.PG_TS_DICT);
    }

    /**
     * Create a detached, initialised PgTsDictRecord
     */
    public PgTsDictRecord(Long oid, String dictname, Long dictnamespace, Long dictowner, Long dicttemplate, String dictinitoption) {
        super(PgTsDict.PG_TS_DICT);

        setOid(oid);
        setDictname(dictname);
        setDictnamespace(dictnamespace);
        setDictowner(dictowner);
        setDicttemplate(dicttemplate);
        setDictinitoption(dictinitoption);
        resetChangedOnNotNull();
    }
}
