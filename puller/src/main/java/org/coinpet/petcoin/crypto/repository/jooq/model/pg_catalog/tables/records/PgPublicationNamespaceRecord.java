/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgPublicationNamespace;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgPublicationNamespaceRecord extends UpdatableRecordImpl<PgPublicationNamespaceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_publication_namespace.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_namespace.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_namespace.pnpubid</code>.
     */
    public void setPnpubid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_namespace.pnpubid</code>.
     */
    public Long getPnpubid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_namespace.pnnspid</code>.
     */
    public void setPnnspid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_namespace.pnnspid</code>.
     */
    public Long getPnnspid() {
        return (Long) get(2);
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
     * Create a detached PgPublicationNamespaceRecord
     */
    public PgPublicationNamespaceRecord() {
        super(PgPublicationNamespace.PG_PUBLICATION_NAMESPACE);
    }

    /**
     * Create a detached, initialised PgPublicationNamespaceRecord
     */
    public PgPublicationNamespaceRecord(Long oid, Long pnpubid, Long pnnspid) {
        super(PgPublicationNamespace.PG_PUBLICATION_NAMESPACE);

        setOid(oid);
        setPnpubid(pnpubid);
        setPnnspid(pnnspid);
        resetChangedOnNotNull();
    }
}
