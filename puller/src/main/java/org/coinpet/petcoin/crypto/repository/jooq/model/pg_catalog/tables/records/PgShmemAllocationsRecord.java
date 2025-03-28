/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgShmemAllocations;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgShmemAllocationsRecord extends TableRecordImpl<PgShmemAllocationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_shmem_allocations.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shmem_allocations.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_shmem_allocations.off</code>.
     */
    public void setOff(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shmem_allocations.off</code>.
     */
    public Long getOff() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_shmem_allocations.size</code>.
     */
    public void setSize(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shmem_allocations.size</code>.
     */
    public Long getSize() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_shmem_allocations.allocated_size</code>.
     */
    public void setAllocatedSize(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shmem_allocations.allocated_size</code>.
     */
    public Long getAllocatedSize() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgShmemAllocationsRecord
     */
    public PgShmemAllocationsRecord() {
        super(PgShmemAllocations.PG_SHMEM_ALLOCATIONS);
    }

    /**
     * Create a detached, initialised PgShmemAllocationsRecord
     */
    public PgShmemAllocationsRecord(String name, Long off, Long size, Long allocatedSize) {
        super(PgShmemAllocations.PG_SHMEM_ALLOCATIONS);

        setName(name);
        setOff(off);
        setSize(size);
        setAllocatedSize(allocatedSize);
        resetChangedOnNotNull();
    }
}
