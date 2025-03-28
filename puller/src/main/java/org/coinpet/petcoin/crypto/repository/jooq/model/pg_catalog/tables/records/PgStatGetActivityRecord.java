/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import java.math.BigDecimal;
import java.time.OffsetDateTime;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgStatGetActivity;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatGetActivityRecord extends TableRecordImpl<PgStatGetActivityRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.datid</code>.
     */
    public void setDatid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.datid</code>.
     */
    public Long getDatid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.pid</code>.
     */
    public void setPid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.usesysid</code>.
     */
    public void setUsesysid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.usesysid</code>.
     */
    public Long getUsesysid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.application_name</code>.
     */
    public void setApplicationName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.application_name</code>.
     */
    public String getApplicationName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.state</code>.
     */
    public void setState(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.state</code>.
     */
    public String getState() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.query</code>.
     */
    public void setQuery(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.query</code>.
     */
    public String getQuery() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.wait_event_type</code>.
     */
    public void setWaitEventType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.wait_event_type</code>.
     */
    public String getWaitEventType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.wait_event</code>.
     */
    public void setWaitEvent(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.wait_event</code>.
     */
    public String getWaitEvent() {
        return (String) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.xact_start</code>.
     */
    public void setXactStart(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.xact_start</code>.
     */
    public OffsetDateTime getXactStart() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.query_start</code>.
     */
    public void setQueryStart(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.query_start</code>.
     */
    public OffsetDateTime getQueryStart() {
        return (OffsetDateTime) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.backend_start</code>.
     */
    public void setBackendStart(OffsetDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.backend_start</code>.
     */
    public OffsetDateTime getBackendStart() {
        return (OffsetDateTime) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.state_change</code>.
     */
    public void setStateChange(OffsetDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.state_change</code>.
     */
    public OffsetDateTime getStateChange() {
        return (OffsetDateTime) get(11);
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
    public Object getClientAddr() {
        return get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.client_hostname</code>.
     */
    public void setClientHostname(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.client_hostname</code>.
     */
    public String getClientHostname() {
        return (String) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.client_port</code>.
     */
    public void setClientPort(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.client_port</code>.
     */
    public Integer getClientPort() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.backend_xid</code>.
     */
    public void setBackendXid(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.backend_xid</code>.
     */
    public Long getBackendXid() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.backend_xmin</code>.
     */
    public void setBackendXmin(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.backend_xmin</code>.
     */
    public Long getBackendXmin() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.backend_type</code>.
     */
    public void setBackendType(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.backend_type</code>.
     */
    public String getBackendType() {
        return (String) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.ssl</code>.
     */
    public void setSsl(Boolean value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.ssl</code>.
     */
    public Boolean getSsl() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.sslversion</code>.
     */
    public void setSslversion(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.sslversion</code>.
     */
    public String getSslversion() {
        return (String) get(19);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.sslcipher</code>.
     */
    public void setSslcipher(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.sslcipher</code>.
     */
    public String getSslcipher() {
        return (String) get(20);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.sslbits</code>.
     */
    public void setSslbits(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.sslbits</code>.
     */
    public Integer getSslbits() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.ssl_client_dn</code>.
     */
    public void setSslClientDn(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.ssl_client_dn</code>.
     */
    public String getSslClientDn() {
        return (String) get(22);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_get_activity.ssl_client_serial</code>.
     */
    public void setSslClientSerial(BigDecimal value) {
        set(23, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_get_activity.ssl_client_serial</code>.
     */
    public BigDecimal getSslClientSerial() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.ssl_issuer_dn</code>.
     */
    public void setSslIssuerDn(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.ssl_issuer_dn</code>.
     */
    public String getSslIssuerDn() {
        return (String) get(24);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.gss_auth</code>.
     */
    public void setGssAuth(Boolean value) {
        set(25, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.gss_auth</code>.
     */
    public Boolean getGssAuth() {
        return (Boolean) get(25);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.gss_princ</code>.
     */
    public void setGssPrinc(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.gss_princ</code>.
     */
    public String getGssPrinc() {
        return (String) get(26);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.gss_enc</code>.
     */
    public void setGssEnc(Boolean value) {
        set(27, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.gss_enc</code>.
     */
    public Boolean getGssEnc() {
        return (Boolean) get(27);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.gss_delegation</code>.
     */
    public void setGssDelegation(Boolean value) {
        set(28, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.gss_delegation</code>.
     */
    public Boolean getGssDelegation() {
        return (Boolean) get(28);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.leader_pid</code>.
     */
    public void setLeaderPid(Integer value) {
        set(29, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.leader_pid</code>.
     */
    public Integer getLeaderPid() {
        return (Integer) get(29);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.query_id</code>.
     */
    public void setQueryId(Long value) {
        set(30, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.query_id</code>.
     */
    public Long getQueryId() {
        return (Long) get(30);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatGetActivityRecord
     */
    public PgStatGetActivityRecord() {
        super(PgStatGetActivity.PG_STAT_GET_ACTIVITY);
    }

    /**
     * Create a detached, initialised PgStatGetActivityRecord
     */
    public PgStatGetActivityRecord(Long datid, Integer pid, Long usesysid, String applicationName, String state, String query, String waitEventType, String waitEvent, OffsetDateTime xactStart, OffsetDateTime queryStart, OffsetDateTime backendStart, OffsetDateTime stateChange, Object clientAddr, String clientHostname, Integer clientPort, Long backendXid, Long backendXmin, String backendType, Boolean ssl, String sslversion, String sslcipher, Integer sslbits, String sslClientDn, BigDecimal sslClientSerial, String sslIssuerDn, Boolean gssAuth, String gssPrinc, Boolean gssEnc, Boolean gssDelegation, Integer leaderPid, Long queryId) {
        super(PgStatGetActivity.PG_STAT_GET_ACTIVITY);

        setDatid(datid);
        setPid(pid);
        setUsesysid(usesysid);
        setApplicationName(applicationName);
        setState(state);
        setQuery(query);
        setWaitEventType(waitEventType);
        setWaitEvent(waitEvent);
        setXactStart(xactStart);
        setQueryStart(queryStart);
        setBackendStart(backendStart);
        setStateChange(stateChange);
        setClientAddr(clientAddr);
        setClientHostname(clientHostname);
        setClientPort(clientPort);
        setBackendXid(backendXid);
        setBackendXmin(backendXmin);
        setBackendType(backendType);
        setSsl(ssl);
        setSslversion(sslversion);
        setSslcipher(sslcipher);
        setSslbits(sslbits);
        setSslClientDn(sslClientDn);
        setSslClientSerial(sslClientSerial);
        setSslIssuerDn(sslIssuerDn);
        setGssAuth(gssAuth);
        setGssPrinc(gssPrinc);
        setGssEnc(gssEnc);
        setGssDelegation(gssDelegation);
        setLeaderPid(leaderPid);
        setQueryId(queryId);
        resetChangedOnNotNull();
    }
}
