/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import java.time.OffsetDateTime;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgStatReplication;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.YearToSecond;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatReplicationRecord extends TableRecordImpl<PgStatReplicationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.pid</code>.
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.usesysid</code>.
     */
    public void setUsesysid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.usesysid</code>.
     */
    public Long getUsesysid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.usename</code>.
     */
    public void setUsename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.usename</code>.
     */
    public String getUsename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.application_name</code>.
     */
    public void setApplicationName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.application_name</code>.
     */
    public String getApplicationName() {
        return (String) get(3);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setClientAddr(Object value) {
        set(4, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getClientAddr() {
        return get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.client_hostname</code>.
     */
    public void setClientHostname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.client_hostname</code>.
     */
    public String getClientHostname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.client_port</code>.
     */
    public void setClientPort(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.client_port</code>.
     */
    public Integer getClientPort() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.backend_start</code>.
     */
    public void setBackendStart(OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.backend_start</code>.
     */
    public OffsetDateTime getBackendStart() {
        return (OffsetDateTime) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.backend_xmin</code>.
     */
    public void setBackendXmin(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.backend_xmin</code>.
     */
    public Long getBackendXmin() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.state</code>.
     */
    public void setState(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.state</code>.
     */
    public String getState() {
        return (String) get(9);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setSentLsn(Object value) {
        set(10, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getSentLsn() {
        return get(10);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setWriteLsn(Object value) {
        set(11, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getWriteLsn() {
        return get(11);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setFlushLsn(Object value) {
        set(12, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getFlushLsn() {
        return get(12);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setReplayLsn(Object value) {
        set(13, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getReplayLsn() {
        return get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.write_lag</code>.
     */
    public void setWriteLag(YearToSecond value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.write_lag</code>.
     */
    public YearToSecond getWriteLag() {
        return (YearToSecond) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.flush_lag</code>.
     */
    public void setFlushLag(YearToSecond value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.flush_lag</code>.
     */
    public YearToSecond getFlushLag() {
        return (YearToSecond) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.replay_lag</code>.
     */
    public void setReplayLag(YearToSecond value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.replay_lag</code>.
     */
    public YearToSecond getReplayLag() {
        return (YearToSecond) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.sync_priority</code>.
     */
    public void setSyncPriority(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.sync_priority</code>.
     */
    public Integer getSyncPriority() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.sync_state</code>.
     */
    public void setSyncState(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.sync_state</code>.
     */
    public String getSyncState() {
        return (String) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_replication.reply_time</code>.
     */
    public void setReplyTime(OffsetDateTime value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_replication.reply_time</code>.
     */
    public OffsetDateTime getReplyTime() {
        return (OffsetDateTime) get(19);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatReplicationRecord
     */
    public PgStatReplicationRecord() {
        super(PgStatReplication.PG_STAT_REPLICATION);
    }

    /**
     * Create a detached, initialised PgStatReplicationRecord
     */
    public PgStatReplicationRecord(Integer pid, Long usesysid, String usename, String applicationName, Object clientAddr, String clientHostname, Integer clientPort, OffsetDateTime backendStart, Long backendXmin, String state, Object sentLsn, Object writeLsn, Object flushLsn, Object replayLsn, YearToSecond writeLag, YearToSecond flushLag, YearToSecond replayLag, Integer syncPriority, String syncState, OffsetDateTime replyTime) {
        super(PgStatReplication.PG_STAT_REPLICATION);

        setPid(pid);
        setUsesysid(usesysid);
        setUsename(usename);
        setApplicationName(applicationName);
        setClientAddr(clientAddr);
        setClientHostname(clientHostname);
        setClientPort(clientPort);
        setBackendStart(backendStart);
        setBackendXmin(backendXmin);
        setState(state);
        setSentLsn(sentLsn);
        setWriteLsn(writeLsn);
        setFlushLsn(flushLsn);
        setReplayLsn(replayLsn);
        setWriteLag(writeLag);
        setFlushLag(flushLag);
        setReplayLag(replayLag);
        setSyncPriority(syncPriority);
        setSyncState(syncState);
        setReplyTime(replyTime);
        resetChangedOnNotNull();
    }
}
