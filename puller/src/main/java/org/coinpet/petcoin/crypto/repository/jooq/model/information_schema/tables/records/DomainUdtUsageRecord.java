/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.DomainUdtUsage;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class DomainUdtUsageRecord extends TableRecordImpl<DomainUdtUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.domain_udt_usage.udt_catalog</code>.
     */
    public void setUdtCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.domain_udt_usage.udt_catalog</code>.
     */
    public String getUdtCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.domain_udt_usage.udt_schema</code>.
     */
    public void setUdtSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.domain_udt_usage.udt_schema</code>.
     */
    public String getUdtSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.domain_udt_usage.udt_name</code>.
     */
    public void setUdtName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.domain_udt_usage.udt_name</code>.
     */
    public String getUdtName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.domain_udt_usage.domain_catalog</code>.
     */
    public void setDomainCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.domain_udt_usage.domain_catalog</code>.
     */
    public String getDomainCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.domain_udt_usage.domain_schema</code>.
     */
    public void setDomainSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.domain_udt_usage.domain_schema</code>.
     */
    public String getDomainSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.domain_udt_usage.domain_name</code>.
     */
    public void setDomainName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.domain_udt_usage.domain_name</code>.
     */
    public String getDomainName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DomainUdtUsageRecord
     */
    public DomainUdtUsageRecord() {
        super(DomainUdtUsage.DOMAIN_UDT_USAGE);
    }

    /**
     * Create a detached, initialised DomainUdtUsageRecord
     */
    public DomainUdtUsageRecord(String udtCatalog, String udtSchema, String udtName, String domainCatalog, String domainSchema, String domainName) {
        super(DomainUdtUsage.DOMAIN_UDT_USAGE);

        setUdtCatalog(udtCatalog);
        setUdtSchema(udtSchema);
        setUdtName(udtName);
        setDomainCatalog(domainCatalog);
        setDomainSchema(domainSchema);
        setDomainName(domainName);
        resetChangedOnNotNull();
    }
}
