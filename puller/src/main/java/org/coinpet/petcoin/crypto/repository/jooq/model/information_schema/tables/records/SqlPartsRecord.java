/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.SqlParts;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class SqlPartsRecord extends TableRecordImpl<SqlPartsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.sql_parts.feature_id</code>.
     */
    public void setFeatureId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.sql_parts.feature_id</code>.
     */
    public String getFeatureId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.sql_parts.feature_name</code>.
     */
    public void setFeatureName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.sql_parts.feature_name</code>.
     */
    public String getFeatureName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.sql_parts.is_supported</code>.
     */
    public void setIsSupported(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.sql_parts.is_supported</code>.
     */
    public String getIsSupported() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.sql_parts.is_verified_by</code>.
     */
    public void setIsVerifiedBy(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.sql_parts.is_verified_by</code>.
     */
    public String getIsVerifiedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.sql_parts.comments</code>.
     */
    public void setComments(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.sql_parts.comments</code>.
     */
    public String getComments() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SqlPartsRecord
     */
    public SqlPartsRecord() {
        super(SqlParts.SQL_PARTS);
    }

    /**
     * Create a detached, initialised SqlPartsRecord
     */
    public SqlPartsRecord(String featureId, String featureName, String isSupported, String isVerifiedBy, String comments) {
        super(SqlParts.SQL_PARTS);

        setFeatureId(featureId);
        setFeatureName(featureName);
        setIsSupported(isSupported);
        setIsVerifiedBy(isVerifiedBy);
        setComments(comments);
        resetChangedOnNotNull();
    }
}
