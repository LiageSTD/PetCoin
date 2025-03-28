/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgStatDatabaseConflicts;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatDatabaseConflictsRecord extends TableRecordImpl<PgStatDatabaseConflictsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_database_conflicts.datid</code>.
     */
    public void setDatid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database_conflicts.datid</code>.
     */
    public Long getDatid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database_conflicts.datname</code>.
     */
    public void setDatname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database_conflicts.datname</code>.
     */
    public String getDatname() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_tablespace</code>.
     */
    public void setConflTablespace(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_tablespace</code>.
     */
    public Long getConflTablespace() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database_conflicts.confl_lock</code>.
     */
    public void setConflLock(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database_conflicts.confl_lock</code>.
     */
    public Long getConflLock() {
        return (Long) get(3);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_snapshot</code>.
     */
    public void setConflSnapshot(Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_snapshot</code>.
     */
    public Long getConflSnapshot() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_bufferpin</code>.
     */
    public void setConflBufferpin(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_bufferpin</code>.
     */
    public Long getConflBufferpin() {
        return (Long) get(5);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_deadlock</code>.
     */
    public void setConflDeadlock(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_deadlock</code>.
     */
    public Long getConflDeadlock() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_active_logicalslot</code>.
     */
    public void setConflActiveLogicalslot(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_active_logicalslot</code>.
     */
    public Long getConflActiveLogicalslot() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatDatabaseConflictsRecord
     */
    public PgStatDatabaseConflictsRecord() {
        super(PgStatDatabaseConflicts.PG_STAT_DATABASE_CONFLICTS);
    }

    /**
     * Create a detached, initialised PgStatDatabaseConflictsRecord
     */
    public PgStatDatabaseConflictsRecord(Long datid, String datname, Long conflTablespace, Long conflLock, Long conflSnapshot, Long conflBufferpin, Long conflDeadlock, Long conflActiveLogicalslot) {
        super(PgStatDatabaseConflicts.PG_STAT_DATABASE_CONFLICTS);

        setDatid(datid);
        setDatname(datname);
        setConflTablespace(conflTablespace);
        setConflLock(conflLock);
        setConflSnapshot(conflSnapshot);
        setConflBufferpin(conflBufferpin);
        setConflDeadlock(conflDeadlock);
        setConflActiveLogicalslot(conflActiveLogicalslot);
        resetChangedOnNotNull();
    }
}
