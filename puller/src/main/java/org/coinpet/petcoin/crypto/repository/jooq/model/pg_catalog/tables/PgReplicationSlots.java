/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables;


import java.util.Collection;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgReplicationSlotsRecord;
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
public class PgReplicationSlots extends TableImpl<PgReplicationSlotsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_replication_slots</code>
     */
    public static final PgReplicationSlots PG_REPLICATION_SLOTS = new PgReplicationSlots();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgReplicationSlotsRecord> getRecordType() {
        return PgReplicationSlotsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_replication_slots.slot_name</code>.
     */
    public final TableField<PgReplicationSlotsRecord, String> SLOT_NAME = createField(DSL.name("slot_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.plugin</code>.
     */
    public final TableField<PgReplicationSlotsRecord, String> PLUGIN = createField(DSL.name("plugin"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.slot_type</code>.
     */
    public final TableField<PgReplicationSlotsRecord, String> SLOT_TYPE = createField(DSL.name("slot_type"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.datoid</code>.
     */
    public final TableField<PgReplicationSlotsRecord, Long> DATOID = createField(DSL.name("datoid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.database</code>.
     */
    public final TableField<PgReplicationSlotsRecord, String> DATABASE = createField(DSL.name("database"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.temporary</code>.
     */
    public final TableField<PgReplicationSlotsRecord, Boolean> TEMPORARY = createField(DSL.name("temporary"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.active</code>.
     */
    public final TableField<PgReplicationSlotsRecord, Boolean> ACTIVE = createField(DSL.name("active"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.active_pid</code>.
     */
    public final TableField<PgReplicationSlotsRecord, Integer> ACTIVE_PID = createField(DSL.name("active_pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.xmin</code>.
     */
    public final TableField<PgReplicationSlotsRecord, Long> XMIN = createField(DSL.name("xmin"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.catalog_xmin</code>.
     */
    public final TableField<PgReplicationSlotsRecord, Long> CATALOG_XMIN = createField(DSL.name("catalog_xmin"), SQLDataType.BIGINT, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgReplicationSlotsRecord, Object> RESTART_LSN = createField(DSL.name("restart_lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgReplicationSlotsRecord, Object> CONFIRMED_FLUSH_LSN = createField(DSL.name("confirmed_flush_lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.wal_status</code>.
     */
    public final TableField<PgReplicationSlotsRecord, String> WAL_STATUS = createField(DSL.name("wal_status"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.safe_wal_size</code>.
     */
    public final TableField<PgReplicationSlotsRecord, Long> SAFE_WAL_SIZE = createField(DSL.name("safe_wal_size"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.two_phase</code>.
     */
    public final TableField<PgReplicationSlotsRecord, Boolean> TWO_PHASE = createField(DSL.name("two_phase"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_replication_slots.conflicting</code>.
     */
    public final TableField<PgReplicationSlotsRecord, Boolean> CONFLICTING = createField(DSL.name("conflicting"), SQLDataType.BOOLEAN, this, "");

    private PgReplicationSlots(Name alias, Table<PgReplicationSlotsRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PgReplicationSlots(Name alias, Table<PgReplicationSlotsRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_replication_slots" as  SELECT l.slot_name,
         l.plugin,
         l.slot_type,
         l.datoid,
         d.datname AS database,
         l.temporary,
         l.active,
         l.active_pid,
         l.xmin,
         l.catalog_xmin,
         l.restart_lsn,
         l.confirmed_flush_lsn,
         l.wal_status,
         l.safe_wal_size,
         l.two_phase,
         l.conflicting
        FROM (pg_get_replication_slots() l(slot_name, plugin, slot_type, datoid, temporary, active, active_pid, xmin, catalog_xmin, restart_lsn, confirmed_flush_lsn, wal_status, safe_wal_size, two_phase, conflicting)
          LEFT JOIN pg_database d ON ((l.datoid = d.oid)));
        """), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_replication_slots</code> table
     * reference
     */
    public PgReplicationSlots(String alias) {
        this(DSL.name(alias), PG_REPLICATION_SLOTS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_replication_slots</code> table
     * reference
     */
    public PgReplicationSlots(Name alias) {
        this(alias, PG_REPLICATION_SLOTS);
    }

    /**
     * Create a <code>pg_catalog.pg_replication_slots</code> table reference
     */
    public PgReplicationSlots() {
        this(DSL.name("pg_replication_slots"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgReplicationSlots as(String alias) {
        return new PgReplicationSlots(DSL.name(alias), this);
    }

    @Override
    public PgReplicationSlots as(Name alias) {
        return new PgReplicationSlots(alias, this);
    }

    @Override
    public PgReplicationSlots as(Table<?> alias) {
        return new PgReplicationSlots(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgReplicationSlots rename(String name) {
        return new PgReplicationSlots(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgReplicationSlots rename(Name name) {
        return new PgReplicationSlots(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgReplicationSlots rename(Table<?> name) {
        return new PgReplicationSlots(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgReplicationSlots where(Condition condition) {
        return new PgReplicationSlots(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgReplicationSlots where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgReplicationSlots where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgReplicationSlots where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgReplicationSlots where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgReplicationSlots where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgReplicationSlots where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgReplicationSlots where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgReplicationSlots whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgReplicationSlots whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
