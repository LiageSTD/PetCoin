/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgForeignServer;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgForeignServerRecord extends UpdatableRecordImpl<PgForeignServerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvname</code>.
     */
    public void setSrvname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvname</code>.
     */
    public String getSrvname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvowner</code>.
     */
    public void setSrvowner(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvowner</code>.
     */
    public Long getSrvowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvfdw</code>.
     */
    public void setSrvfdw(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvfdw</code>.
     */
    public Long getSrvfdw() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvtype</code>.
     */
    public void setSrvtype(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvtype</code>.
     */
    public String getSrvtype() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvversion</code>.
     */
    public void setSrvversion(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvversion</code>.
     */
    public String getSrvversion() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvacl</code>.
     */
    public void setSrvacl(String[] value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvacl</code>.
     */
    public String[] getSrvacl() {
        return (String[]) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvoptions</code>.
     */
    public void setSrvoptions(String[] value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvoptions</code>.
     */
    public String[] getSrvoptions() {
        return (String[]) get(7);
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
     * Create a detached PgForeignServerRecord
     */
    public PgForeignServerRecord() {
        super(PgForeignServer.PG_FOREIGN_SERVER);
    }

    /**
     * Create a detached, initialised PgForeignServerRecord
     */
    public PgForeignServerRecord(Long oid, String srvname, Long srvowner, Long srvfdw, String srvtype, String srvversion, String[] srvacl, String[] srvoptions) {
        super(PgForeignServer.PG_FOREIGN_SERVER);

        setOid(oid);
        setSrvname(srvname);
        setSrvowner(srvowner);
        setSrvfdw(srvfdw);
        setSrvtype(srvtype);
        setSrvversion(srvversion);
        setSrvacl(srvacl);
        setSrvoptions(srvoptions);
        resetChangedOnNotNull();
    }
}
