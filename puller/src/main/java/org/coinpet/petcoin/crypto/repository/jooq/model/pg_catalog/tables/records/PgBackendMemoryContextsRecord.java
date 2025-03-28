/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgBackendMemoryContexts;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgBackendMemoryContextsRecord extends TableRecordImpl<PgBackendMemoryContextsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_backend_memory_contexts.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_backend_memory_contexts.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_backend_memory_contexts.ident</code>.
     */
    public void setIdent(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_backend_memory_contexts.ident</code>.
     */
    public String getIdent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_backend_memory_contexts.parent</code>.
     */
    public void setParent(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_backend_memory_contexts.parent</code>.
     */
    public String getParent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_backend_memory_contexts.level</code>.
     */
    public void setLevel(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_backend_memory_contexts.level</code>.
     */
    public Integer getLevel() {
        return (Integer) get(3);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_backend_memory_contexts.total_bytes</code>.
     */
    public void setTotalBytes(Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_backend_memory_contexts.total_bytes</code>.
     */
    public Long getTotalBytes() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_backend_memory_contexts.total_nblocks</code>.
     */
    public void setTotalNblocks(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_backend_memory_contexts.total_nblocks</code>.
     */
    public Long getTotalNblocks() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_backend_memory_contexts.free_bytes</code>.
     */
    public void setFreeBytes(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_backend_memory_contexts.free_bytes</code>.
     */
    public Long getFreeBytes() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_backend_memory_contexts.free_chunks</code>.
     */
    public void setFreeChunks(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_backend_memory_contexts.free_chunks</code>.
     */
    public Long getFreeChunks() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_backend_memory_contexts.used_bytes</code>.
     */
    public void setUsedBytes(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_backend_memory_contexts.used_bytes</code>.
     */
    public Long getUsedBytes() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgBackendMemoryContextsRecord
     */
    public PgBackendMemoryContextsRecord() {
        super(PgBackendMemoryContexts.PG_BACKEND_MEMORY_CONTEXTS);
    }

    /**
     * Create a detached, initialised PgBackendMemoryContextsRecord
     */
    public PgBackendMemoryContextsRecord(String name, String ident, String parent, Integer level, Long totalBytes, Long totalNblocks, Long freeBytes, Long freeChunks, Long usedBytes) {
        super(PgBackendMemoryContexts.PG_BACKEND_MEMORY_CONTEXTS);

        setName(name);
        setIdent(ident);
        setParent(parent);
        setLevel(level);
        setTotalBytes(totalBytes);
        setTotalNblocks(totalNblocks);
        setFreeBytes(freeBytes);
        setFreeChunks(freeChunks);
        setUsedBytes(usedBytes);
        resetChangedOnNotNull();
    }
}
