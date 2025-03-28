/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import java.time.OffsetDateTime;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgStatActivity;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatActivityRecord extends TableRecordImpl<PgStatActivityRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.datid</code>.
     */
    public void setDatid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.datid</code>.
     */
    public Long getDatid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.datname</code>.
     */
    public void setDatname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.datname</code>.
     */
    public String getDatname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.pid</code>.
     */
    public void setPid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.leader_pid</code>.
     */
    public void setLeaderPid(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.leader_pid</code>.
     */
    public Integer getLeaderPid() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.usesysid</code>.
     */
    public void setUsesysid(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.usesysid</code>.
     */
    public Long getUsesysid() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.usename</code>.
     */
    public void setUsename(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.usename</code>.
     */
    public String getUsename() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.application_name</code>.
     */
    public void setApplicationName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.application_name</code>.
     */
    public String getApplicationName() {
        return (String) get(6);
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
        set(7, value);
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
        return get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.client_hostname</code>.
     */
    public void setClientHostname(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.client_hostname</code>.
     */
    public String getClientHostname() {
        return (String) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.client_port</code>.
     */
    public void setClientPort(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.client_port</code>.
     */
    public Integer getClientPort() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.backend_start</code>.
     */
    public void setBackendStart(OffsetDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.backend_start</code>.
     */
    public OffsetDateTime getBackendStart() {
        return (OffsetDateTime) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.xact_start</code>.
     */
    public void setXactStart(OffsetDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.xact_start</code>.
     */
    public OffsetDateTime getXactStart() {
        return (OffsetDateTime) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.query_start</code>.
     */
    public void setQueryStart(OffsetDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.query_start</code>.
     */
    public OffsetDateTime getQueryStart() {
        return (OffsetDateTime) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.state_change</code>.
     */
    public void setStateChange(OffsetDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.state_change</code>.
     */
    public OffsetDateTime getStateChange() {
        return (OffsetDateTime) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.wait_event_type</code>.
     */
    public void setWaitEventType(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.wait_event_type</code>.
     */
    public String getWaitEventType() {
        return (String) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.wait_event</code>.
     */
    public void setWaitEvent(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.wait_event</code>.
     */
    public String getWaitEvent() {
        return (String) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.state</code>.
     */
    public void setState(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.state</code>.
     */
    public String getState() {
        return (String) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.backend_xid</code>.
     */
    public void setBackendXid(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.backend_xid</code>.
     */
    public Long getBackendXid() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.backend_xmin</code>.
     */
    public void setBackendXmin(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.backend_xmin</code>.
     */
    public Long getBackendXmin() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.query_id</code>.
     */
    public void setQueryId(Long value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.query_id</code>.
     */
    public Long getQueryId() {
        return (Long) get(19);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.query</code>.
     */
    public void setQuery(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.query</code>.
     */
    public String getQuery() {
        return (String) get(20);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.backend_type</code>.
     */
    public void setBackendType(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.backend_type</code>.
     */
    public String getBackendType() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatActivityRecord
     */
    public PgStatActivityRecord() {
        super(PgStatActivity.PG_STAT_ACTIVITY);
    }

    /**
     * Create a detached, initialised PgStatActivityRecord
     */
    public PgStatActivityRecord(Long datid, String datname, Integer pid, Integer leaderPid, Long usesysid, String usename, String applicationName, Object clientAddr, String clientHostname, Integer clientPort, OffsetDateTime backendStart, OffsetDateTime xactStart, OffsetDateTime queryStart, OffsetDateTime stateChange, String waitEventType, String waitEvent, String state, Long backendXid, Long backendXmin, Long queryId, String query, String backendType) {
        super(PgStatActivity.PG_STAT_ACTIVITY);

        setDatid(datid);
        setDatname(datname);
        setPid(pid);
        setLeaderPid(leaderPid);
        setUsesysid(usesysid);
        setUsename(usename);
        setApplicationName(applicationName);
        setClientAddr(clientAddr);
        setClientHostname(clientHostname);
        setClientPort(clientPort);
        setBackendStart(backendStart);
        setXactStart(xactStart);
        setQueryStart(queryStart);
        setStateChange(stateChange);
        setWaitEventType(waitEventType);
        setWaitEvent(waitEvent);
        setState(state);
        setBackendXid(backendXid);
        setBackendXmin(backendXmin);
        setQueryId(queryId);
        setQuery(query);
        setBackendType(backendType);
        resetChangedOnNotNull();
    }
}
