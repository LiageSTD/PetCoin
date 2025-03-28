/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgGetReplicationSlotsRecord;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
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
public class PgGetReplicationSlots extends TableImpl<PgGetReplicationSlotsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_get_replication_slots</code>
     */
    public static final PgGetReplicationSlots PG_GET_REPLICATION_SLOTS = new PgGetReplicationSlots();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgGetReplicationSlotsRecord> getRecordType() {
        return PgGetReplicationSlotsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.slot_name</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, String> SLOT_NAME = createField(DSL.name("slot_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.plugin</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, String> PLUGIN = createField(DSL.name("plugin"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.slot_type</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, String> SLOT_TYPE = createField(DSL.name("slot_type"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.datoid</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, Long> DATOID = createField(DSL.name("datoid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.temporary</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, Boolean> TEMPORARY = createField(DSL.name("temporary"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.active</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, Boolean> ACTIVE = createField(DSL.name("active"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.active_pid</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, Integer> ACTIVE_PID = createField(DSL.name("active_pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.xmin</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, Long> XMIN = createField(DSL.name("xmin"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.catalog_xmin</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, Long> CATALOG_XMIN = createField(DSL.name("catalog_xmin"), SQLDataType.BIGINT, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgGetReplicationSlotsRecord, Object> RESTART_LSN = createField(DSL.name("restart_lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgGetReplicationSlotsRecord, Object> CONFIRMED_FLUSH_LSN = createField(DSL.name("confirmed_flush_lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.wal_status</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, String> WAL_STATUS = createField(DSL.name("wal_status"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_get_replication_slots.safe_wal_size</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, Long> SAFE_WAL_SIZE = createField(DSL.name("safe_wal_size"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.two_phase</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, Boolean> TWO_PHASE = createField(DSL.name("two_phase"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.conflicting</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, Boolean> CONFLICTING = createField(DSL.name("conflicting"), SQLDataType.BOOLEAN, this, "");

    private PgGetReplicationSlots(Name alias, Table<PgGetReplicationSlotsRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgGetReplicationSlots(Name alias, Table<PgGetReplicationSlotsRecord> aliased, Field<?>[] parameters) {
        this(alias, aliased, parameters, null);
    }

    private PgGetReplicationSlots(Name alias, Table<PgGetReplicationSlotsRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_replication_slots</code> table
     * reference
     */
    public PgGetReplicationSlots(String alias) {
        this(DSL.name(alias), PG_GET_REPLICATION_SLOTS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_replication_slots</code> table
     * reference
     */
    public PgGetReplicationSlots(Name alias) {
        this(alias, PG_GET_REPLICATION_SLOTS);
    }

    /**
     * Create a <code>pg_catalog.pg_get_replication_slots</code> table reference
     */
    public PgGetReplicationSlots() {
        this(DSL.name("pg_get_replication_slots"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgGetReplicationSlots as(String alias) {
        return new PgGetReplicationSlots(DSL.name(alias), this, parameters);
    }

    @Override
    public PgGetReplicationSlots as(Name alias) {
        return new PgGetReplicationSlots(alias, this, parameters);
    }

    @Override
    public PgGetReplicationSlots as(Table<?> alias) {
        return new PgGetReplicationSlots(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetReplicationSlots rename(String name) {
        return new PgGetReplicationSlots(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetReplicationSlots rename(Name name) {
        return new PgGetReplicationSlots(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetReplicationSlots rename(Table<?> name) {
        return new PgGetReplicationSlots(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgGetReplicationSlots call() {
        PgGetReplicationSlots result = new PgGetReplicationSlots(DSL.name("pg_get_replication_slots"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
