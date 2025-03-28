/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables;


import java.util.Collection;

import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.Domains;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.InformationSchema;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records.ConstraintColumnUsageRecord;
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
public class ConstraintColumnUsage extends TableImpl<ConstraintColumnUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.constraint_column_usage</code>
     */
    public static final ConstraintColumnUsage CONSTRAINT_COLUMN_USAGE = new ConstraintColumnUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConstraintColumnUsageRecord> getRecordType() {
        return ConstraintColumnUsageRecord.class;
    }

    /**
     * The column
     * <code>information_schema.constraint_column_usage.table_catalog</code>.
     */
    public final TableField<ConstraintColumnUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.table_schema</code>.
     */
    public final TableField<ConstraintColumnUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.table_name</code>.
     */
    public final TableField<ConstraintColumnUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.column_name</code>.
     */
    public final TableField<ConstraintColumnUsageRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.constraint_catalog</code>.
     */
    public final TableField<ConstraintColumnUsageRecord, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.constraint_schema</code>.
     */
    public final TableField<ConstraintColumnUsageRecord, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.constraint_name</code>.
     */
    public final TableField<ConstraintColumnUsageRecord, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ConstraintColumnUsage(Name alias, Table<ConstraintColumnUsageRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private ConstraintColumnUsage(Name alias, Table<ConstraintColumnUsageRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "constraint_column_usage" as  SELECT (current_database())::information_schema.sql_identifier AS table_catalog,
          (tblschema)::information_schema.sql_identifier AS table_schema,
          (tblname)::information_schema.sql_identifier AS table_name,
          (colname)::information_schema.sql_identifier AS column_name,
          (current_database())::information_schema.sql_identifier AS constraint_catalog,
          (cstrschema)::information_schema.sql_identifier AS constraint_schema,
          (cstrname)::information_schema.sql_identifier AS constraint_name
         FROM ( SELECT DISTINCT nr.nspname,
                  r.relname,
                  r.relowner,
                  a.attname,
                  nc.nspname,
                  c.conname
                 FROM pg_namespace nr,
                  pg_class r,
                  pg_attribute a,
                  pg_depend d,
                  pg_namespace nc,
                  pg_constraint c
                WHERE ((nr.oid = r.relnamespace) AND (r.oid = a.attrelid) AND (d.refclassid = ('pg_class'::regclass)::oid) AND (d.refobjid = r.oid) AND (d.refobjsubid = a.attnum) AND (d.classid = ('pg_constraint'::regclass)::oid) AND (d.objid = c.oid) AND (c.connamespace = nc.oid) AND (c.contype = 'c'::"char") AND (r.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])) AND (NOT a.attisdropped))
              UNION ALL
               SELECT nr.nspname,
                  r.relname,
                  r.relowner,
                  a.attname,
                  nc.nspname,
                  c.conname
                 FROM pg_namespace nr,
                  pg_class r,
                  pg_attribute a,
                  pg_namespace nc,
                  pg_constraint c
                WHERE ((nr.oid = r.relnamespace) AND (r.oid = a.attrelid) AND (nc.oid = c.connamespace) AND (r.oid =
                      CASE c.contype
                          WHEN 'f'::"char" THEN c.confrelid
                          ELSE c.conrelid
                      END) AND (a.attnum = ANY (
                      CASE c.contype
                          WHEN 'f'::"char" THEN c.confkey
                          ELSE c.conkey
                      END)) AND (NOT a.attisdropped) AND (c.contype = ANY (ARRAY['p'::"char", 'u'::"char", 'f'::"char"])) AND (r.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])))) x(tblschema, tblname, tblowner, colname, cstrschema, cstrname)
        WHERE pg_has_role(tblowner, 'USAGE'::text);
        """), where);
    }

    /**
     * Create an aliased <code>information_schema.constraint_column_usage</code>
     * table reference
     */
    public ConstraintColumnUsage(String alias) {
        this(DSL.name(alias), CONSTRAINT_COLUMN_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.constraint_column_usage</code>
     * table reference
     */
    public ConstraintColumnUsage(Name alias) {
        this(alias, CONSTRAINT_COLUMN_USAGE);
    }

    /**
     * Create a <code>information_schema.constraint_column_usage</code> table
     * reference
     */
    public ConstraintColumnUsage() {
        this(DSL.name("constraint_column_usage"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ConstraintColumnUsage as(String alias) {
        return new ConstraintColumnUsage(DSL.name(alias), this);
    }

    @Override
    public ConstraintColumnUsage as(Name alias) {
        return new ConstraintColumnUsage(alias, this);
    }

    @Override
    public ConstraintColumnUsage as(Table<?> alias) {
        return new ConstraintColumnUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConstraintColumnUsage rename(String name) {
        return new ConstraintColumnUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConstraintColumnUsage rename(Name name) {
        return new ConstraintColumnUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConstraintColumnUsage rename(Table<?> name) {
        return new ConstraintColumnUsage(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ConstraintColumnUsage where(Condition condition) {
        return new ConstraintColumnUsage(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ConstraintColumnUsage where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ConstraintColumnUsage where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ConstraintColumnUsage where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ConstraintColumnUsage where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ConstraintColumnUsage where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ConstraintColumnUsage where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ConstraintColumnUsage where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ConstraintColumnUsage whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ConstraintColumnUsage whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
