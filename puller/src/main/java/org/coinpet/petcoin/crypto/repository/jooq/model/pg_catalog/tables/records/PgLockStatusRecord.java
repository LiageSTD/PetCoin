/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import java.time.OffsetDateTime;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgLockStatus;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgLockStatusRecord extends TableRecordImpl<PgLockStatusRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_lock_status.locktype</code>.
     */
    public void setLocktype(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.locktype</code>.
     */
    public String getLocktype() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.database</code>.
     */
    public void setDatabase(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.database</code>.
     */
    public Long getDatabase() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.relation</code>.
     */
    public void setRelation(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.relation</code>.
     */
    public Long getRelation() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.page</code>.
     */
    public void setPage(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.page</code>.
     */
    public Integer getPage() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.tuple</code>.
     */
    public void setTuple(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.tuple</code>.
     */
    public Short getTuple() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.virtualxid</code>.
     */
    public void setVirtualxid(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.virtualxid</code>.
     */
    public String getVirtualxid() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.transactionid</code>.
     */
    public void setTransactionid(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.transactionid</code>.
     */
    public Long getTransactionid() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.classid</code>.
     */
    public void setClassid(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.classid</code>.
     */
    public Long getClassid() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.objid</code>.
     */
    public void setObjid(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.objid</code>.
     */
    public Long getObjid() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.objsubid</code>.
     */
    public void setObjsubid(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.objsubid</code>.
     */
    public Short getObjsubid() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.virtualtransaction</code>.
     */
    public void setVirtualtransaction(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.virtualtransaction</code>.
     */
    public String getVirtualtransaction() {
        return (String) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.pid</code>.
     */
    public void setPid(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.mode</code>.
     */
    public void setMode(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.mode</code>.
     */
    public String getMode() {
        return (String) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.granted</code>.
     */
    public void setGranted(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.granted</code>.
     */
    public Boolean getGranted() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.fastpath</code>.
     */
    public void setFastpath(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.fastpath</code>.
     */
    public Boolean getFastpath() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_lock_status.waitstart</code>.
     */
    public void setWaitstart(OffsetDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_lock_status.waitstart</code>.
     */
    public OffsetDateTime getWaitstart() {
        return (OffsetDateTime) get(15);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLockStatusRecord
     */
    public PgLockStatusRecord() {
        super(PgLockStatus.PG_LOCK_STATUS);
    }

    /**
     * Create a detached, initialised PgLockStatusRecord
     */
    public PgLockStatusRecord(String locktype, Long database, Long relation, Integer page, Short tuple, String virtualxid, Long transactionid, Long classid, Long objid, Short objsubid, String virtualtransaction, Integer pid, String mode, Boolean granted, Boolean fastpath, OffsetDateTime waitstart) {
        super(PgLockStatus.PG_LOCK_STATUS);

        setLocktype(locktype);
        setDatabase(database);
        setRelation(relation);
        setPage(page);
        setTuple(tuple);
        setVirtualxid(virtualxid);
        setTransactionid(transactionid);
        setClassid(classid);
        setObjid(objid);
        setObjsubid(objsubid);
        setVirtualtransaction(virtualtransaction);
        setPid(pid);
        setMode(mode);
        setGranted(granted);
        setFastpath(fastpath);
        setWaitstart(waitstart);
        resetChangedOnNotNull();
    }
}
