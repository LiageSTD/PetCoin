/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records;


import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.ReferentialConstraints;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ReferentialConstraintsRecord extends TableRecordImpl<ReferentialConstraintsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.referential_constraints.constraint_catalog</code>.
     */
    public void setConstraintCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.referential_constraints.constraint_catalog</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.referential_constraints.constraint_schema</code>.
     */
    public void setConstraintSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.referential_constraints.constraint_schema</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.referential_constraints.constraint_name</code>.
     */
    public void setConstraintName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.referential_constraints.constraint_name</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.referential_constraints.unique_constraint_catalog</code>.
     */
    public void setUniqueConstraintCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.referential_constraints.unique_constraint_catalog</code>.
     */
    public String getUniqueConstraintCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.referential_constraints.unique_constraint_schema</code>.
     */
    public void setUniqueConstraintSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.referential_constraints.unique_constraint_schema</code>.
     */
    public String getUniqueConstraintSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.referential_constraints.unique_constraint_name</code>.
     */
    public void setUniqueConstraintName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.referential_constraints.unique_constraint_name</code>.
     */
    public String getUniqueConstraintName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.referential_constraints.match_option</code>.
     */
    public void setMatchOption(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.referential_constraints.match_option</code>.
     */
    public String getMatchOption() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.referential_constraints.update_rule</code>.
     */
    public void setUpdateRule(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.referential_constraints.update_rule</code>.
     */
    public String getUpdateRule() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.referential_constraints.delete_rule</code>.
     */
    public void setDeleteRule(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.referential_constraints.delete_rule</code>.
     */
    public String getDeleteRule() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReferentialConstraintsRecord
     */
    public ReferentialConstraintsRecord() {
        super(ReferentialConstraints.REFERENTIAL_CONSTRAINTS);
    }

    /**
     * Create a detached, initialised ReferentialConstraintsRecord
     */
    public ReferentialConstraintsRecord(String constraintCatalog, String constraintSchema, String constraintName, String uniqueConstraintCatalog, String uniqueConstraintSchema, String uniqueConstraintName, String matchOption, String updateRule, String deleteRule) {
        super(ReferentialConstraints.REFERENTIAL_CONSTRAINTS);

        setConstraintCatalog(constraintCatalog);
        setConstraintSchema(constraintSchema);
        setConstraintName(constraintName);
        setUniqueConstraintCatalog(uniqueConstraintCatalog);
        setUniqueConstraintSchema(uniqueConstraintSchema);
        setUniqueConstraintName(uniqueConstraintName);
        setMatchOption(matchOption);
        setUpdateRule(updateRule);
        setDeleteRule(deleteRule);
        resetChangedOnNotNull();
    }
}
