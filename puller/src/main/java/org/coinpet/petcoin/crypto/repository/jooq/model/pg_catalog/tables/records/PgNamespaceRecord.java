/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgNamespace;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgNamespaceRecord extends UpdatableRecordImpl<PgNamespaceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_namespace.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_namespace.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_namespace.nspname</code>.
     */
    public void setNspname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_namespace.nspname</code>.
     */
    public String getNspname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_namespace.nspowner</code>.
     */
    public void setNspowner(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_namespace.nspowner</code>.
     */
    public Long getNspowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_namespace.nspacl</code>.
     */
    public void setNspacl(String[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_namespace.nspacl</code>.
     */
    public String[] getNspacl() {
        return (String[]) get(3);
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
     * Create a detached PgNamespaceRecord
     */
    public PgNamespaceRecord() {
        super(PgNamespace.PG_NAMESPACE);
    }

    /**
     * Create a detached, initialised PgNamespaceRecord
     */
    public PgNamespaceRecord(Long oid, String nspname, Long nspowner, String[] nspacl) {
        super(PgNamespace.PG_NAMESPACE);

        setOid(oid);
        setNspname(nspname);
        setNspowner(nspowner);
        setNspacl(nspacl);
        resetChangedOnNotNull();
    }
}
