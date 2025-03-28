/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables;


import java.util.Collection;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgReplicationOriginStatusRecord;
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
import org.jooq.impl.DefaultDataType;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgReplicationOriginStatus extends TableImpl<PgReplicationOriginStatusRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_replication_origin_status</code>
     */
    public static final PgReplicationOriginStatus PG_REPLICATION_ORIGIN_STATUS = new PgReplicationOriginStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgReplicationOriginStatusRecord> getRecordType() {
        return PgReplicationOriginStatusRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_replication_origin_status.local_id</code>.
     */
    public final TableField<PgReplicationOriginStatusRecord, Long> LOCAL_ID = createField(DSL.name("local_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_replication_origin_status.external_id</code>.
     */
    public final TableField<PgReplicationOriginStatusRecord, String> EXTERNAL_ID = createField(DSL.name("external_id"), SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgReplicationOriginStatusRecord, Object> REMOTE_LSN = createField(DSL.name("remote_lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgReplicationOriginStatusRecord, Object> LOCAL_LSN = createField(DSL.name("local_lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    private PgReplicationOriginStatus(Name alias, Table<PgReplicationOriginStatusRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PgReplicationOriginStatus(Name alias, Table<PgReplicationOriginStatusRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_replication_origin_status" as  SELECT local_id,
         external_id,
         remote_lsn,
         local_lsn
        FROM pg_show_replication_origin_status() pg_show_replication_origin_status(local_id, external_id, remote_lsn, local_lsn);
        """), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_replication_origin_status</code>
     * table reference
     */
    public PgReplicationOriginStatus(String alias) {
        this(DSL.name(alias), PG_REPLICATION_ORIGIN_STATUS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_replication_origin_status</code>
     * table reference
     */
    public PgReplicationOriginStatus(Name alias) {
        this(alias, PG_REPLICATION_ORIGIN_STATUS);
    }

    /**
     * Create a <code>pg_catalog.pg_replication_origin_status</code> table
     * reference
     */
    public PgReplicationOriginStatus() {
        this(DSL.name("pg_replication_origin_status"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgReplicationOriginStatus as(String alias) {
        return new PgReplicationOriginStatus(DSL.name(alias), this);
    }

    @Override
    public PgReplicationOriginStatus as(Name alias) {
        return new PgReplicationOriginStatus(alias, this);
    }

    @Override
    public PgReplicationOriginStatus as(Table<?> alias) {
        return new PgReplicationOriginStatus(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgReplicationOriginStatus rename(String name) {
        return new PgReplicationOriginStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgReplicationOriginStatus rename(Name name) {
        return new PgReplicationOriginStatus(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgReplicationOriginStatus rename(Table<?> name) {
        return new PgReplicationOriginStatus(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgReplicationOriginStatus where(Condition condition) {
        return new PgReplicationOriginStatus(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgReplicationOriginStatus where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgReplicationOriginStatus where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgReplicationOriginStatus where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgReplicationOriginStatus where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgReplicationOriginStatus where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgReplicationOriginStatus where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgReplicationOriginStatus where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgReplicationOriginStatus whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgReplicationOriginStatus whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
