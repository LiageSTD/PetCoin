/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables;


import java.util.Collection;

import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.Domains;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.InformationSchema;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records.InformationSchemaCatalogNameRecord;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class InformationSchemaCatalogName extends TableImpl<InformationSchemaCatalogNameRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.information_schema_catalog_name</code>
     */
    public static final InformationSchemaCatalogName INFORMATION_SCHEMA_CATALOG_NAME = new InformationSchemaCatalogName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InformationSchemaCatalogNameRecord> getRecordType() {
        return InformationSchemaCatalogNameRecord.class;
    }

    /**
     * The column
     * <code>information_schema.information_schema_catalog_name.catalog_name</code>.
     */
    public final TableField<InformationSchemaCatalogNameRecord, String> CATALOG_NAME = createField(DSL.name("catalog_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private InformationSchemaCatalogName(Name alias, Table<InformationSchemaCatalogNameRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private InformationSchemaCatalogName(Name alias, Table<InformationSchemaCatalogNameRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "information_schema_catalog_name" as  SELECT (current_database())::information_schema.sql_identifier AS catalog_name;
        """), where);
    }

    /**
     * Create an aliased
     * <code>information_schema.information_schema_catalog_name</code> table
     * reference
     */
    public InformationSchemaCatalogName(String alias) {
        this(DSL.name(alias), INFORMATION_SCHEMA_CATALOG_NAME);
    }

    /**
     * Create an aliased
     * <code>information_schema.information_schema_catalog_name</code> table
     * reference
     */
    public InformationSchemaCatalogName(Name alias) {
        this(alias, INFORMATION_SCHEMA_CATALOG_NAME);
    }

    /**
     * Create a <code>information_schema.information_schema_catalog_name</code>
     * table reference
     */
    public InformationSchemaCatalogName() {
        this(DSL.name("information_schema_catalog_name"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InformationSchemaCatalogName as(String alias) {
        return new InformationSchemaCatalogName(DSL.name(alias), this);
    }

    @Override
    public InformationSchemaCatalogName as(Name alias) {
        return new InformationSchemaCatalogName(alias, this);
    }

    @Override
    public InformationSchemaCatalogName as(Table<?> alias) {
        return new InformationSchemaCatalogName(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InformationSchemaCatalogName rename(String name) {
        return new InformationSchemaCatalogName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InformationSchemaCatalogName rename(Name name) {
        return new InformationSchemaCatalogName(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InformationSchemaCatalogName rename(Table<?> name) {
        return new InformationSchemaCatalogName(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public InformationSchemaCatalogName where(Condition condition) {
        return new InformationSchemaCatalogName(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public InformationSchemaCatalogName where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public InformationSchemaCatalogName where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public InformationSchemaCatalogName where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public InformationSchemaCatalogName where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public InformationSchemaCatalogName where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public InformationSchemaCatalogName where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public InformationSchemaCatalogName where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public InformationSchemaCatalogName whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public InformationSchemaCatalogName whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
