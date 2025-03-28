/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables;


import java.util.Collection;

import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.Domains;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.InformationSchema;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records._PgForeignTablesRecord;
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
public class _PgForeignTables extends TableImpl<_PgForeignTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema._pg_foreign_tables</code>
     */
    public static final _PgForeignTables _PG_FOREIGN_TABLES = new _PgForeignTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_PgForeignTablesRecord> getRecordType() {
        return _PgForeignTablesRecord.class;
    }

    /**
     * The column
     * <code>information_schema._pg_foreign_tables.foreign_table_catalog</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> FOREIGN_TABLE_CATALOG = createField(DSL.name("foreign_table_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_tables.foreign_table_schema</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> FOREIGN_TABLE_SCHEMA = createField(DSL.name("foreign_table_schema"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_tables.foreign_table_name</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> FOREIGN_TABLE_NAME = createField(DSL.name("foreign_table_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema._pg_foreign_tables.ftoptions</code>.
     */
    public final TableField<_PgForeignTablesRecord, String[]> FTOPTIONS = createField(DSL.name("ftoptions"), SQLDataType.CLOB.array(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_tables.foreign_server_catalog</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> FOREIGN_SERVER_CATALOG = createField(DSL.name("foreign_server_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_tables.foreign_server_name</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> FOREIGN_SERVER_NAME = createField(DSL.name("foreign_server_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_tables.authorization_identifier</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> AUTHORIZATION_IDENTIFIER = createField(DSL.name("authorization_identifier"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private _PgForeignTables(Name alias, Table<_PgForeignTablesRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private _PgForeignTables(Name alias, Table<_PgForeignTablesRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "_pg_foreign_tables" as  SELECT (current_database())::information_schema.sql_identifier AS foreign_table_catalog,
          (n.nspname)::information_schema.sql_identifier AS foreign_table_schema,
          (c.relname)::information_schema.sql_identifier AS foreign_table_name,
          t.ftoptions,
          (current_database())::information_schema.sql_identifier AS foreign_server_catalog,
          (s.srvname)::information_schema.sql_identifier AS foreign_server_name,
          (u.rolname)::information_schema.sql_identifier AS authorization_identifier
         FROM pg_foreign_table t,
          pg_foreign_server s,
          pg_foreign_data_wrapper w,
          pg_authid u,
          pg_namespace n,
          pg_class c
        WHERE ((w.oid = s.srvfdw) AND (u.oid = c.relowner) AND (pg_has_role(c.relowner, 'USAGE'::text) OR has_table_privilege(c.oid, 'SELECT, INSERT, UPDATE, DELETE, TRUNCATE, REFERENCES, TRIGGER'::text) OR has_any_column_privilege(c.oid, 'SELECT, INSERT, UPDATE, REFERENCES'::text)) AND (n.oid = c.relnamespace) AND (c.oid = t.ftrelid) AND (c.relkind = 'f'::"char") AND (s.oid = t.ftserver));
        """), where);
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_tables</code>
     * table reference
     */
    public _PgForeignTables(String alias) {
        this(DSL.name(alias), _PG_FOREIGN_TABLES);
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_tables</code>
     * table reference
     */
    public _PgForeignTables(Name alias) {
        this(alias, _PG_FOREIGN_TABLES);
    }

    /**
     * Create a <code>information_schema._pg_foreign_tables</code> table
     * reference
     */
    public _PgForeignTables() {
        this(DSL.name("_pg_foreign_tables"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public _PgForeignTables as(String alias) {
        return new _PgForeignTables(DSL.name(alias), this);
    }

    @Override
    public _PgForeignTables as(Name alias) {
        return new _PgForeignTables(alias, this);
    }

    @Override
    public _PgForeignTables as(Table<?> alias) {
        return new _PgForeignTables(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignTables rename(String name) {
        return new _PgForeignTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignTables rename(Name name) {
        return new _PgForeignTables(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignTables rename(Table<?> name) {
        return new _PgForeignTables(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PgForeignTables where(Condition condition) {
        return new _PgForeignTables(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PgForeignTables where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PgForeignTables where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PgForeignTables where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public _PgForeignTables where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public _PgForeignTables where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public _PgForeignTables where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public _PgForeignTables where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PgForeignTables whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PgForeignTables whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
