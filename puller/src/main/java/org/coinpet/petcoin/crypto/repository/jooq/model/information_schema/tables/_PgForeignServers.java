/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables;


import java.util.Collection;

import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.Domains;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.InformationSchema;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records._PgForeignServersRecord;
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
public class _PgForeignServers extends TableImpl<_PgForeignServersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema._pg_foreign_servers</code>
     */
    public static final _PgForeignServers _PG_FOREIGN_SERVERS = new _PgForeignServers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_PgForeignServersRecord> getRecordType() {
        return _PgForeignServersRecord.class;
    }

    /**
     * The column <code>information_schema._pg_foreign_servers.oid</code>.
     */
    public final TableField<_PgForeignServersRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.srvoptions</code>.
     */
    public final TableField<_PgForeignServersRecord, String[]> SRVOPTIONS = createField(DSL.name("srvoptions"), SQLDataType.CLOB.array(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_server_catalog</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_CATALOG = createField(DSL.name("foreign_server_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_server_name</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_NAME = createField(DSL.name("foreign_server_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_data_wrapper_catalog</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_DATA_WRAPPER_CATALOG = createField(DSL.name("foreign_data_wrapper_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_data_wrapper_name</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_DATA_WRAPPER_NAME = createField(DSL.name("foreign_data_wrapper_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_server_type</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_TYPE = createField(DSL.name("foreign_server_type"), Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.foreign_server_version</code>.
     */
    public final TableField<_PgForeignServersRecord, String> FOREIGN_SERVER_VERSION = createField(DSL.name("foreign_server_version"), Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_servers.authorization_identifier</code>.
     */
    public final TableField<_PgForeignServersRecord, String> AUTHORIZATION_IDENTIFIER = createField(DSL.name("authorization_identifier"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private _PgForeignServers(Name alias, Table<_PgForeignServersRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private _PgForeignServers(Name alias, Table<_PgForeignServersRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "_pg_foreign_servers" as  SELECT s.oid,
          s.srvoptions,
          (current_database())::information_schema.sql_identifier AS foreign_server_catalog,
          (s.srvname)::information_schema.sql_identifier AS foreign_server_name,
          (current_database())::information_schema.sql_identifier AS foreign_data_wrapper_catalog,
          (w.fdwname)::information_schema.sql_identifier AS foreign_data_wrapper_name,
          (s.srvtype)::information_schema.character_data AS foreign_server_type,
          (s.srvversion)::information_schema.character_data AS foreign_server_version,
          (u.rolname)::information_schema.sql_identifier AS authorization_identifier
         FROM pg_foreign_server s,
          pg_foreign_data_wrapper w,
          pg_authid u
        WHERE ((w.oid = s.srvfdw) AND (u.oid = s.srvowner) AND (pg_has_role(s.srvowner, 'USAGE'::text) OR has_server_privilege(s.oid, 'USAGE'::text)));
        """), where);
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_servers</code>
     * table reference
     */
    public _PgForeignServers(String alias) {
        this(DSL.name(alias), _PG_FOREIGN_SERVERS);
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_servers</code>
     * table reference
     */
    public _PgForeignServers(Name alias) {
        this(alias, _PG_FOREIGN_SERVERS);
    }

    /**
     * Create a <code>information_schema._pg_foreign_servers</code> table
     * reference
     */
    public _PgForeignServers() {
        this(DSL.name("_pg_foreign_servers"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public _PgForeignServers as(String alias) {
        return new _PgForeignServers(DSL.name(alias), this);
    }

    @Override
    public _PgForeignServers as(Name alias) {
        return new _PgForeignServers(alias, this);
    }

    @Override
    public _PgForeignServers as(Table<?> alias) {
        return new _PgForeignServers(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignServers rename(String name) {
        return new _PgForeignServers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignServers rename(Name name) {
        return new _PgForeignServers(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignServers rename(Table<?> name) {
        return new _PgForeignServers(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PgForeignServers where(Condition condition) {
        return new _PgForeignServers(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PgForeignServers where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PgForeignServers where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PgForeignServers where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public _PgForeignServers where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public _PgForeignServers where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public _PgForeignServers where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public _PgForeignServers where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PgForeignServers whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public _PgForeignServers whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
