/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgStatUserFunctions;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatUserFunctionsRecord extends TableRecordImpl<PgStatUserFunctionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_user_functions.funcid</code>.
     */
    public void setFuncid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_functions.funcid</code>.
     */
    public Long getFuncid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_functions.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_functions.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_functions.funcname</code>.
     */
    public void setFuncname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_functions.funcname</code>.
     */
    public String getFuncname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_functions.calls</code>.
     */
    public void setCalls(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_functions.calls</code>.
     */
    public Long getCalls() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_functions.total_time</code>.
     */
    public void setTotalTime(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_functions.total_time</code>.
     */
    public Double getTotalTime() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_functions.self_time</code>.
     */
    public void setSelfTime(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_functions.self_time</code>.
     */
    public Double getSelfTime() {
        return (Double) get(5);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatUserFunctionsRecord
     */
    public PgStatUserFunctionsRecord() {
        super(PgStatUserFunctions.PG_STAT_USER_FUNCTIONS);
    }

    /**
     * Create a detached, initialised PgStatUserFunctionsRecord
     */
    public PgStatUserFunctionsRecord(Long funcid, String schemaname, String funcname, Long calls, Double totalTime, Double selfTime) {
        super(PgStatUserFunctions.PG_STAT_USER_FUNCTIONS);

        setFuncid(funcid);
        setSchemaname(schemaname);
        setFuncname(funcname);
        setCalls(calls);
        setTotalTime(totalTime);
        setSelfTime(selfTime);
        resetChangedOnNotNull();
    }
}
