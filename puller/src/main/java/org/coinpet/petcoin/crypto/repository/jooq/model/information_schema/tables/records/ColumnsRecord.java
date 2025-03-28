/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.Columns;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ColumnsRecord extends TableRecordImpl<ColumnsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.columns.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.columns.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.columns.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.columns.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.columns.table_name</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.columns.table_name</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.columns.column_name</code>.
     */
    public void setColumnName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.columns.column_name</code>.
     */
    public String getColumnName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.columns.ordinal_position</code>.
     */
    public void setOrdinalPosition(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.columns.ordinal_position</code>.
     */
    public Integer getOrdinalPosition() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>information_schema.columns.column_default</code>.
     */
    public void setColumnDefault(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.columns.column_default</code>.
     */
    public String getColumnDefault() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.columns.is_nullable</code>.
     */
    public void setIsNullable(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.columns.is_nullable</code>.
     */
    public String getIsNullable() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.columns.data_type</code>.
     */
    public void setDataType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.columns.data_type</code>.
     */
    public String getDataType() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.columns.character_maximum_length</code>.
     */
    public void setCharacterMaximumLength(Integer value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.columns.character_maximum_length</code>.
     */
    public Integer getCharacterMaximumLength() {
        return (Integer) get(8);
    }

    /**
     * Setter for
     * <code>information_schema.columns.character_octet_length</code>.
     */
    public void setCharacterOctetLength(Integer value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>information_schema.columns.character_octet_length</code>.
     */
    public Integer getCharacterOctetLength() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>information_schema.columns.numeric_precision</code>.
     */
    public void setNumericPrecision(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.columns.numeric_precision</code>.
     */
    public Integer getNumericPrecision() {
        return (Integer) get(10);
    }

    /**
     * Setter for
     * <code>information_schema.columns.numeric_precision_radix</code>.
     */
    public void setNumericPrecisionRadix(Integer value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>information_schema.columns.numeric_precision_radix</code>.
     */
    public Integer getNumericPrecisionRadix() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>information_schema.columns.numeric_scale</code>.
     */
    public void setNumericScale(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.columns.numeric_scale</code>.
     */
    public Integer getNumericScale() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>information_schema.columns.datetime_precision</code>.
     */
    public void setDatetimePrecision(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.columns.datetime_precision</code>.
     */
    public Integer getDatetimePrecision() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>information_schema.columns.interval_type</code>.
     */
    public void setIntervalType(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.columns.interval_type</code>.
     */
    public String getIntervalType() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.columns.interval_precision</code>.
     */
    public void setIntervalPrecision(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.columns.interval_precision</code>.
     */
    public Integer getIntervalPrecision() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>information_schema.columns.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.columns.character_set_catalog</code>.
     */
    public String getCharacterSetCatalog() {
        return (String) get(16);
    }

    /**
     * Setter for <code>information_schema.columns.character_set_schema</code>.
     */
    public void setCharacterSetSchema(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.columns.character_set_schema</code>.
     */
    public String getCharacterSetSchema() {
        return (String) get(17);
    }

    /**
     * Setter for <code>information_schema.columns.character_set_name</code>.
     */
    public void setCharacterSetName(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.columns.character_set_name</code>.
     */
    public String getCharacterSetName() {
        return (String) get(18);
    }

    /**
     * Setter for <code>information_schema.columns.collation_catalog</code>.
     */
    public void setCollationCatalog(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.columns.collation_catalog</code>.
     */
    public String getCollationCatalog() {
        return (String) get(19);
    }

    /**
     * Setter for <code>information_schema.columns.collation_schema</code>.
     */
    public void setCollationSchema(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.columns.collation_schema</code>.
     */
    public String getCollationSchema() {
        return (String) get(20);
    }

    /**
     * Setter for <code>information_schema.columns.collation_name</code>.
     */
    public void setCollationName(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.columns.collation_name</code>.
     */
    public String getCollationName() {
        return (String) get(21);
    }

    /**
     * Setter for <code>information_schema.columns.domain_catalog</code>.
     */
    public void setDomainCatalog(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>information_schema.columns.domain_catalog</code>.
     */
    public String getDomainCatalog() {
        return (String) get(22);
    }

    /**
     * Setter for <code>information_schema.columns.domain_schema</code>.
     */
    public void setDomainSchema(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>information_schema.columns.domain_schema</code>.
     */
    public String getDomainSchema() {
        return (String) get(23);
    }

    /**
     * Setter for <code>information_schema.columns.domain_name</code>.
     */
    public void setDomainName(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>information_schema.columns.domain_name</code>.
     */
    public String getDomainName() {
        return (String) get(24);
    }

    /**
     * Setter for <code>information_schema.columns.udt_catalog</code>.
     */
    public void setUdtCatalog(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>information_schema.columns.udt_catalog</code>.
     */
    public String getUdtCatalog() {
        return (String) get(25);
    }

    /**
     * Setter for <code>information_schema.columns.udt_schema</code>.
     */
    public void setUdtSchema(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>information_schema.columns.udt_schema</code>.
     */
    public String getUdtSchema() {
        return (String) get(26);
    }

    /**
     * Setter for <code>information_schema.columns.udt_name</code>.
     */
    public void setUdtName(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>information_schema.columns.udt_name</code>.
     */
    public String getUdtName() {
        return (String) get(27);
    }

    /**
     * Setter for <code>information_schema.columns.scope_catalog</code>.
     */
    public void setScopeCatalog(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>information_schema.columns.scope_catalog</code>.
     */
    public String getScopeCatalog() {
        return (String) get(28);
    }

    /**
     * Setter for <code>information_schema.columns.scope_schema</code>.
     */
    public void setScopeSchema(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>information_schema.columns.scope_schema</code>.
     */
    public String getScopeSchema() {
        return (String) get(29);
    }

    /**
     * Setter for <code>information_schema.columns.scope_name</code>.
     */
    public void setScopeName(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>information_schema.columns.scope_name</code>.
     */
    public String getScopeName() {
        return (String) get(30);
    }

    /**
     * Setter for <code>information_schema.columns.maximum_cardinality</code>.
     */
    public void setMaximumCardinality(Integer value) {
        set(31, value);
    }

    /**
     * Getter for <code>information_schema.columns.maximum_cardinality</code>.
     */
    public Integer getMaximumCardinality() {
        return (Integer) get(31);
    }

    /**
     * Setter for <code>information_schema.columns.dtd_identifier</code>.
     */
    public void setDtdIdentifier(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>information_schema.columns.dtd_identifier</code>.
     */
    public String getDtdIdentifier() {
        return (String) get(32);
    }

    /**
     * Setter for <code>information_schema.columns.is_self_referencing</code>.
     */
    public void setIsSelfReferencing(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>information_schema.columns.is_self_referencing</code>.
     */
    public String getIsSelfReferencing() {
        return (String) get(33);
    }

    /**
     * Setter for <code>information_schema.columns.is_identity</code>.
     */
    public void setIsIdentity(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>information_schema.columns.is_identity</code>.
     */
    public String getIsIdentity() {
        return (String) get(34);
    }

    /**
     * Setter for <code>information_schema.columns.identity_generation</code>.
     */
    public void setIdentityGeneration(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>information_schema.columns.identity_generation</code>.
     */
    public String getIdentityGeneration() {
        return (String) get(35);
    }

    /**
     * Setter for <code>information_schema.columns.identity_start</code>.
     */
    public void setIdentityStart(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>information_schema.columns.identity_start</code>.
     */
    public String getIdentityStart() {
        return (String) get(36);
    }

    /**
     * Setter for <code>information_schema.columns.identity_increment</code>.
     */
    public void setIdentityIncrement(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>information_schema.columns.identity_increment</code>.
     */
    public String getIdentityIncrement() {
        return (String) get(37);
    }

    /**
     * Setter for <code>information_schema.columns.identity_maximum</code>.
     */
    public void setIdentityMaximum(String value) {
        set(38, value);
    }

    /**
     * Getter for <code>information_schema.columns.identity_maximum</code>.
     */
    public String getIdentityMaximum() {
        return (String) get(38);
    }

    /**
     * Setter for <code>information_schema.columns.identity_minimum</code>.
     */
    public void setIdentityMinimum(String value) {
        set(39, value);
    }

    /**
     * Getter for <code>information_schema.columns.identity_minimum</code>.
     */
    public String getIdentityMinimum() {
        return (String) get(39);
    }

    /**
     * Setter for <code>information_schema.columns.identity_cycle</code>.
     */
    public void setIdentityCycle(String value) {
        set(40, value);
    }

    /**
     * Getter for <code>information_schema.columns.identity_cycle</code>.
     */
    public String getIdentityCycle() {
        return (String) get(40);
    }

    /**
     * Setter for <code>information_schema.columns.is_generated</code>.
     */
    public void setIsGenerated(String value) {
        set(41, value);
    }

    /**
     * Getter for <code>information_schema.columns.is_generated</code>.
     */
    public String getIsGenerated() {
        return (String) get(41);
    }

    /**
     * Setter for <code>information_schema.columns.generation_expression</code>.
     */
    public void setGenerationExpression(String value) {
        set(42, value);
    }

    /**
     * Getter for <code>information_schema.columns.generation_expression</code>.
     */
    public String getGenerationExpression() {
        return (String) get(42);
    }

    /**
     * Setter for <code>information_schema.columns.is_updatable</code>.
     */
    public void setIsUpdatable(String value) {
        set(43, value);
    }

    /**
     * Getter for <code>information_schema.columns.is_updatable</code>.
     */
    public String getIsUpdatable() {
        return (String) get(43);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ColumnsRecord
     */
    public ColumnsRecord() {
        super(Columns.COLUMNS);
    }

    /**
     * Create a detached, initialised ColumnsRecord
     */
    public ColumnsRecord(String tableCatalog, String tableSchema, String tableName, String columnName, Integer ordinalPosition, String columnDefault, String isNullable, String dataType, Integer characterMaximumLength, Integer characterOctetLength, Integer numericPrecision, Integer numericPrecisionRadix, Integer numericScale, Integer datetimePrecision, String intervalType, Integer intervalPrecision, String characterSetCatalog, String characterSetSchema, String characterSetName, String collationCatalog, String collationSchema, String collationName, String domainCatalog, String domainSchema, String domainName, String udtCatalog, String udtSchema, String udtName, String scopeCatalog, String scopeSchema, String scopeName, Integer maximumCardinality, String dtdIdentifier, String isSelfReferencing, String isIdentity, String identityGeneration, String identityStart, String identityIncrement, String identityMaximum, String identityMinimum, String identityCycle, String isGenerated, String generationExpression, String isUpdatable) {
        super(Columns.COLUMNS);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        setOrdinalPosition(ordinalPosition);
        setColumnDefault(columnDefault);
        setIsNullable(isNullable);
        setDataType(dataType);
        setCharacterMaximumLength(characterMaximumLength);
        setCharacterOctetLength(characterOctetLength);
        setNumericPrecision(numericPrecision);
        setNumericPrecisionRadix(numericPrecisionRadix);
        setNumericScale(numericScale);
        setDatetimePrecision(datetimePrecision);
        setIntervalType(intervalType);
        setIntervalPrecision(intervalPrecision);
        setCharacterSetCatalog(characterSetCatalog);
        setCharacterSetSchema(characterSetSchema);
        setCharacterSetName(characterSetName);
        setCollationCatalog(collationCatalog);
        setCollationSchema(collationSchema);
        setCollationName(collationName);
        setDomainCatalog(domainCatalog);
        setDomainSchema(domainSchema);
        setDomainName(domainName);
        setUdtCatalog(udtCatalog);
        setUdtSchema(udtSchema);
        setUdtName(udtName);
        setScopeCatalog(scopeCatalog);
        setScopeSchema(scopeSchema);
        setScopeName(scopeName);
        setMaximumCardinality(maximumCardinality);
        setDtdIdentifier(dtdIdentifier);
        setIsSelfReferencing(isSelfReferencing);
        setIsIdentity(isIdentity);
        setIdentityGeneration(identityGeneration);
        setIdentityStart(identityStart);
        setIdentityIncrement(identityIncrement);
        setIdentityMaximum(identityMaximum);
        setIdentityMinimum(identityMinimum);
        setIdentityCycle(identityCycle);
        setIsGenerated(isGenerated);
        setGenerationExpression(generationExpression);
        setIsUpdatable(isUpdatable);
        resetChangedOnNotNull();
    }
}
