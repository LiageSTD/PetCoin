/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables;


import java.util.Collection;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgUserMappingsRecord;
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
public class PgUserMappings extends TableImpl<PgUserMappingsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_user_mappings</code>
     */
    public static final PgUserMappings PG_USER_MAPPINGS = new PgUserMappings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgUserMappingsRecord> getRecordType() {
        return PgUserMappingsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_user_mappings.umid</code>.
     */
    public final TableField<PgUserMappingsRecord, Long> UMID = createField(DSL.name("umid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_user_mappings.srvid</code>.
     */
    public final TableField<PgUserMappingsRecord, Long> SRVID = createField(DSL.name("srvid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_user_mappings.srvname</code>.
     */
    public final TableField<PgUserMappingsRecord, String> SRVNAME = createField(DSL.name("srvname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_user_mappings.umuser</code>.
     */
    public final TableField<PgUserMappingsRecord, Long> UMUSER = createField(DSL.name("umuser"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_user_mappings.usename</code>.
     */
    public final TableField<PgUserMappingsRecord, String> USENAME = createField(DSL.name("usename"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_user_mappings.umoptions</code>.
     */
    public final TableField<PgUserMappingsRecord, String[]> UMOPTIONS = createField(DSL.name("umoptions"), SQLDataType.CLOB.array(), this, "");

    private PgUserMappings(Name alias, Table<PgUserMappingsRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PgUserMappings(Name alias, Table<PgUserMappingsRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_user_mappings" as  SELECT u.oid AS umid,
         s.oid AS srvid,
         s.srvname,
         u.umuser,
             CASE
                 WHEN (u.umuser = (0)::oid) THEN 'public'::name
                 ELSE a.rolname
             END AS usename,
             CASE
                 WHEN (((u.umuser <> (0)::oid) AND (a.rolname = CURRENT_USER) AND (pg_has_role(s.srvowner, 'USAGE'::text) OR has_server_privilege(s.oid, 'USAGE'::text))) OR ((u.umuser = (0)::oid) AND pg_has_role(s.srvowner, 'USAGE'::text)) OR ( SELECT pg_authid.rolsuper
                    FROM pg_authid
                   WHERE (pg_authid.rolname = CURRENT_USER))) THEN u.umoptions
                 ELSE NULL::text[]
             END AS umoptions
        FROM ((pg_user_mapping u
          JOIN pg_foreign_server s ON ((u.umserver = s.oid)))
          LEFT JOIN pg_authid a ON ((a.oid = u.umuser)));
        """), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_user_mappings</code> table
     * reference
     */
    public PgUserMappings(String alias) {
        this(DSL.name(alias), PG_USER_MAPPINGS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_user_mappings</code> table
     * reference
     */
    public PgUserMappings(Name alias) {
        this(alias, PG_USER_MAPPINGS);
    }

    /**
     * Create a <code>pg_catalog.pg_user_mappings</code> table reference
     */
    public PgUserMappings() {
        this(DSL.name("pg_user_mappings"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgUserMappings as(String alias) {
        return new PgUserMappings(DSL.name(alias), this);
    }

    @Override
    public PgUserMappings as(Name alias) {
        return new PgUserMappings(alias, this);
    }

    @Override
    public PgUserMappings as(Table<?> alias) {
        return new PgUserMappings(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgUserMappings rename(String name) {
        return new PgUserMappings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgUserMappings rename(Name name) {
        return new PgUserMappings(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgUserMappings rename(Table<?> name) {
        return new PgUserMappings(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgUserMappings where(Condition condition) {
        return new PgUserMappings(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgUserMappings where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgUserMappings where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgUserMappings where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgUserMappings where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgUserMappings where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgUserMappings where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgUserMappings where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgUserMappings whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgUserMappings whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
