/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables;


import java.util.Collection;

import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.Domains;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.InformationSchema;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records.ColumnColumnUsageRecord;
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
public class ColumnColumnUsage extends TableImpl<ColumnColumnUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.column_column_usage</code>
     */
    public static final ColumnColumnUsage COLUMN_COLUMN_USAGE = new ColumnColumnUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ColumnColumnUsageRecord> getRecordType() {
        return ColumnColumnUsageRecord.class;
    }

    /**
     * The column
     * <code>information_schema.column_column_usage.table_catalog</code>.
     */
    public final TableField<ColumnColumnUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_column_usage.table_schema</code>.
     */
    public final TableField<ColumnColumnUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_column_usage.table_name</code>.
     */
    public final TableField<ColumnColumnUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_column_usage.column_name</code>.
     */
    public final TableField<ColumnColumnUsageRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_column_usage.dependent_column</code>.
     */
    public final TableField<ColumnColumnUsageRecord, String> DEPENDENT_COLUMN = createField(DSL.name("dependent_column"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ColumnColumnUsage(Name alias, Table<ColumnColumnUsageRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private ColumnColumnUsage(Name alias, Table<ColumnColumnUsageRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "column_column_usage" as  SELECT DISTINCT (current_database())::information_schema.sql_identifier AS table_catalog,
          (n.nspname)::information_schema.sql_identifier AS table_schema,
          (c.relname)::information_schema.sql_identifier AS table_name,
          (ac.attname)::information_schema.sql_identifier AS column_name,
          (ad.attname)::information_schema.sql_identifier AS dependent_column
         FROM pg_namespace n,
          pg_class c,
          pg_depend d,
          pg_attribute ac,
          pg_attribute ad,
          pg_attrdef atd
        WHERE ((n.oid = c.relnamespace) AND (c.oid = ac.attrelid) AND (c.oid = ad.attrelid) AND (ac.attnum <> ad.attnum) AND (ad.attrelid = atd.adrelid) AND (ad.attnum = atd.adnum) AND (d.classid = ('pg_attrdef'::regclass)::oid) AND (d.refclassid = ('pg_class'::regclass)::oid) AND (d.objid = atd.oid) AND (d.refobjid = ac.attrelid) AND (d.refobjsubid = ac.attnum) AND (ad.attgenerated <> ''::"char") AND pg_has_role(c.relowner, 'USAGE'::text));
        """), where);
    }

    /**
     * Create an aliased <code>information_schema.column_column_usage</code>
     * table reference
     */
    public ColumnColumnUsage(String alias) {
        this(DSL.name(alias), COLUMN_COLUMN_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.column_column_usage</code>
     * table reference
     */
    public ColumnColumnUsage(Name alias) {
        this(alias, COLUMN_COLUMN_USAGE);
    }

    /**
     * Create a <code>information_schema.column_column_usage</code> table
     * reference
     */
    public ColumnColumnUsage() {
        this(DSL.name("column_column_usage"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ColumnColumnUsage as(String alias) {
        return new ColumnColumnUsage(DSL.name(alias), this);
    }

    @Override
    public ColumnColumnUsage as(Name alias) {
        return new ColumnColumnUsage(alias, this);
    }

    @Override
    public ColumnColumnUsage as(Table<?> alias) {
        return new ColumnColumnUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnColumnUsage rename(String name) {
        return new ColumnColumnUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnColumnUsage rename(Name name) {
        return new ColumnColumnUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnColumnUsage rename(Table<?> name) {
        return new ColumnColumnUsage(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnColumnUsage where(Condition condition) {
        return new ColumnColumnUsage(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnColumnUsage where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnColumnUsage where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnColumnUsage where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ColumnColumnUsage where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ColumnColumnUsage where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ColumnColumnUsage where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ColumnColumnUsage where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnColumnUsage whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ColumnColumnUsage whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
