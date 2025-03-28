/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgTsParser;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgTsParserRecord extends UpdatableRecordImpl<PgTsParserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_ts_parser.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_parser.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_parser.prsname</code>.
     */
    public void setPrsname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_parser.prsname</code>.
     */
    public String getPrsname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_parser.prsnamespace</code>.
     */
    public void setPrsnamespace(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_parser.prsnamespace</code>.
     */
    public Long getPrsnamespace() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_parser.prsstart</code>.
     */
    public void setPrsstart(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_parser.prsstart</code>.
     */
    public String getPrsstart() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_parser.prstoken</code>.
     */
    public void setPrstoken(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_parser.prstoken</code>.
     */
    public String getPrstoken() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_parser.prsend</code>.
     */
    public void setPrsend(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_parser.prsend</code>.
     */
    public String getPrsend() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_parser.prsheadline</code>.
     */
    public void setPrsheadline(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_parser.prsheadline</code>.
     */
    public String getPrsheadline() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_parser.prslextype</code>.
     */
    public void setPrslextype(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_parser.prslextype</code>.
     */
    public String getPrslextype() {
        return (String) get(7);
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
     * Create a detached PgTsParserRecord
     */
    public PgTsParserRecord() {
        super(PgTsParser.PG_TS_PARSER);
    }

    /**
     * Create a detached, initialised PgTsParserRecord
     */
    public PgTsParserRecord(Long oid, String prsname, Long prsnamespace, String prsstart, String prstoken, String prsend, String prsheadline, String prslextype) {
        super(PgTsParser.PG_TS_PARSER);

        setOid(oid);
        setPrsname(prsname);
        setPrsnamespace(prsnamespace);
        setPrsstart(prsstart);
        setPrstoken(prstoken);
        setPrsend(prsend);
        setPrsheadline(prsheadline);
        setPrslextype(prslextype);
        resetChangedOnNotNull();
    }
}
