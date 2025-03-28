/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records;


import java.math.BigDecimal;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.PgStatSsl;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatSslRecord extends TableRecordImpl<PgStatSslRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.pid</code>.
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.ssl</code>.
     */
    public void setSsl(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.ssl</code>.
     */
    public Boolean getSsl() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.version</code>.
     */
    public void setVersion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.version</code>.
     */
    public String getVersion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.cipher</code>.
     */
    public void setCipher(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.cipher</code>.
     */
    public String getCipher() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.bits</code>.
     */
    public void setBits(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.bits</code>.
     */
    public Integer getBits() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.client_dn</code>.
     */
    public void setClientDn(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.client_dn</code>.
     */
    public String getClientDn() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.client_serial</code>.
     */
    public void setClientSerial(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.client_serial</code>.
     */
    public BigDecimal getClientSerial() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_ssl.issuer_dn</code>.
     */
    public void setIssuerDn(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_ssl.issuer_dn</code>.
     */
    public String getIssuerDn() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatSslRecord
     */
    public PgStatSslRecord() {
        super(PgStatSsl.PG_STAT_SSL);
    }

    /**
     * Create a detached, initialised PgStatSslRecord
     */
    public PgStatSslRecord(Integer pid, Boolean ssl, String version, String cipher, Integer bits, String clientDn, BigDecimal clientSerial, String issuerDn) {
        super(PgStatSsl.PG_STAT_SSL);

        setPid(pid);
        setSsl(ssl);
        setVersion(version);
        setCipher(cipher);
        setBits(bits);
        setClientDn(clientDn);
        setClientSerial(clientSerial);
        setIssuerDn(issuerDn);
        resetChangedOnNotNull();
    }
}
