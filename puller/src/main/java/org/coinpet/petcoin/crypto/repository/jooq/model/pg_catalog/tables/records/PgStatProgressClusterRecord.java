/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgStatProgressCluster;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatProgressClusterRecord extends TableRecordImpl<PgStatProgressClusterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.pid</code>.
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.datid</code>.
     */
    public void setDatid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.datid</code>.
     */
    public Long getDatid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.datname</code>.
     */
    public void setDatname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.datname</code>.
     */
    public String getDatname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.relid</code>.
     */
    public void setRelid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.command</code>.
     */
    public void setCommand(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.command</code>.
     */
    public String getCommand() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_cluster.phase</code>.
     */
    public void setPhase(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_cluster.phase</code>.
     */
    public String getPhase() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.cluster_index_relid</code>.
     */
    public void setClusterIndexRelid(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.cluster_index_relid</code>.
     */
    public Long getClusterIndexRelid() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_tuples_scanned</code>.
     */
    public void setHeapTuplesScanned(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_tuples_scanned</code>.
     */
    public Long getHeapTuplesScanned() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_tuples_written</code>.
     */
    public void setHeapTuplesWritten(Long value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_tuples_written</code>.
     */
    public Long getHeapTuplesWritten() {
        return (Long) get(8);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_blks_total</code>.
     */
    public void setHeapBlksTotal(Long value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_blks_total</code>.
     */
    public Long getHeapBlksTotal() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_blks_scanned</code>.
     */
    public void setHeapBlksScanned(Long value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.heap_blks_scanned</code>.
     */
    public Long getHeapBlksScanned() {
        return (Long) get(10);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_cluster.index_rebuild_count</code>.
     */
    public void setIndexRebuildCount(Long value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_cluster.index_rebuild_count</code>.
     */
    public Long getIndexRebuildCount() {
        return (Long) get(11);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatProgressClusterRecord
     */
    public PgStatProgressClusterRecord() {
        super(PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER);
    }

    /**
     * Create a detached, initialised PgStatProgressClusterRecord
     */
    public PgStatProgressClusterRecord(Integer pid, Long datid, String datname, Long relid, String command, String phase, Long clusterIndexRelid, Long heapTuplesScanned, Long heapTuplesWritten, Long heapBlksTotal, Long heapBlksScanned, Long indexRebuildCount) {
        super(PgStatProgressCluster.PG_STAT_PROGRESS_CLUSTER);

        setPid(pid);
        setDatid(datid);
        setDatname(datname);
        setRelid(relid);
        setCommand(command);
        setPhase(phase);
        setClusterIndexRelid(clusterIndexRelid);
        setHeapTuplesScanned(heapTuplesScanned);
        setHeapTuplesWritten(heapTuplesWritten);
        setHeapBlksTotal(heapBlksTotal);
        setHeapBlksScanned(heapBlksScanned);
        setIndexRebuildCount(indexRebuildCount);
        resetChangedOnNotNull();
    }
}
