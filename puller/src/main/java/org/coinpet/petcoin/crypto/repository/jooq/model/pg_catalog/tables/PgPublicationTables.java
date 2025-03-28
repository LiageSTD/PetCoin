/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables;


import java.util.Collection;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgPublicationTablesRecord;
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
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgPublicationTables extends TableImpl<PgPublicationTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_publication_tables</code>
     */
    public static final PgPublicationTables PG_PUBLICATION_TABLES = new PgPublicationTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPublicationTablesRecord> getRecordType() {
        return PgPublicationTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_publication_tables.pubname</code>.
     */
    public final TableField<PgPublicationTablesRecord, String> PUBNAME = createField(DSL.name("pubname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_publication_tables.schemaname</code>.
     */
    public final TableField<PgPublicationTablesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_publication_tables.tablename</code>.
     */
    public final TableField<PgPublicationTablesRecord, String> TABLENAME = createField(DSL.name("tablename"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_publication_tables.attnames</code>.
     */
    public final TableField<PgPublicationTablesRecord, String[]> ATTNAMES = createField(DSL.name("attnames"), SQLDataType.VARCHAR.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_publication_tables.rowfilter</code>.
     */
    public final TableField<PgPublicationTablesRecord, String> ROWFILTER = createField(DSL.name("rowfilter"), SQLDataType.CLOB, this, "");

    private PgPublicationTables(Name alias, Table<PgPublicationTablesRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PgPublicationTables(Name alias, Table<PgPublicationTablesRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_publication_tables" as  SELECT p.pubname,
          n.nspname AS schemaname,
          c.relname AS tablename,
          ( SELECT array_agg(a.attname ORDER BY a.attnum) AS array_agg
                 FROM pg_attribute a
                WHERE ((a.attrelid = gpt.relid) AND (a.attnum = ANY ((gpt.attrs)::smallint[])))) AS attnames,
          pg_get_expr(gpt.qual, gpt.relid) AS rowfilter
         FROM pg_publication p,
          LATERAL pg_get_publication_tables(VARIADIC ARRAY[(p.pubname)::text]) gpt(pubid, relid, attrs, qual),
          (pg_class c
           JOIN pg_namespace n ON ((n.oid = c.relnamespace)))
        WHERE (c.oid = gpt.relid);
        """), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_publication_tables</code> table
     * reference
     */
    public PgPublicationTables(String alias) {
        this(DSL.name(alias), PG_PUBLICATION_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_publication_tables</code> table
     * reference
     */
    public PgPublicationTables(Name alias) {
        this(alias, PG_PUBLICATION_TABLES);
    }

    /**
     * Create a <code>pg_catalog.pg_publication_tables</code> table reference
     */
    public PgPublicationTables() {
        this(DSL.name("pg_publication_tables"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgPublicationTables as(String alias) {
        return new PgPublicationTables(DSL.name(alias), this);
    }

    @Override
    public PgPublicationTables as(Name alias) {
        return new PgPublicationTables(alias, this);
    }

    @Override
    public PgPublicationTables as(Table<?> alias) {
        return new PgPublicationTables(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPublicationTables rename(String name) {
        return new PgPublicationTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPublicationTables rename(Name name) {
        return new PgPublicationTables(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPublicationTables rename(Table<?> name) {
        return new PgPublicationTables(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgPublicationTables where(Condition condition) {
        return new PgPublicationTables(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgPublicationTables where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgPublicationTables where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgPublicationTables where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgPublicationTables where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgPublicationTables where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgPublicationTables where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgPublicationTables where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgPublicationTables whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgPublicationTables whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
