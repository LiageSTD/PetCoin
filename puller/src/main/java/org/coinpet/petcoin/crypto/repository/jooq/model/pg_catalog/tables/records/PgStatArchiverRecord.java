/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import java.time.OffsetDateTime;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgStatArchiver;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatArchiverRecord extends TableRecordImpl<PgStatArchiverRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_archiver.archived_count</code>.
     */
    public void setArchivedCount(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_archiver.archived_count</code>.
     */
    public Long getArchivedCount() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_archiver.last_archived_wal</code>.
     */
    public void setLastArchivedWal(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_archiver.last_archived_wal</code>.
     */
    public String getLastArchivedWal() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_archiver.last_archived_time</code>.
     */
    public void setLastArchivedTime(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_archiver.last_archived_time</code>.
     */
    public OffsetDateTime getLastArchivedTime() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_archiver.failed_count</code>.
     */
    public void setFailedCount(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_archiver.failed_count</code>.
     */
    public Long getFailedCount() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_archiver.last_failed_wal</code>.
     */
    public void setLastFailedWal(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_archiver.last_failed_wal</code>.
     */
    public String getLastFailedWal() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_archiver.last_failed_time</code>.
     */
    public void setLastFailedTime(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_archiver.last_failed_time</code>.
     */
    public OffsetDateTime getLastFailedTime() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_archiver.stats_reset</code>.
     */
    public void setStatsReset(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_archiver.stats_reset</code>.
     */
    public OffsetDateTime getStatsReset() {
        return (OffsetDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatArchiverRecord
     */
    public PgStatArchiverRecord() {
        super(PgStatArchiver.PG_STAT_ARCHIVER);
    }

    /**
     * Create a detached, initialised PgStatArchiverRecord
     */
    public PgStatArchiverRecord(Long archivedCount, String lastArchivedWal, OffsetDateTime lastArchivedTime, Long failedCount, String lastFailedWal, OffsetDateTime lastFailedTime, OffsetDateTime statsReset) {
        super(PgStatArchiver.PG_STAT_ARCHIVER);

        setArchivedCount(archivedCount);
        setLastArchivedWal(lastArchivedWal);
        setLastArchivedTime(lastArchivedTime);
        setFailedCount(failedCount);
        setLastFailedWal(lastFailedWal);
        setLastFailedTime(lastFailedTime);
        setStatsReset(statsReset);
        resetChangedOnNotNull();
    }
}
