/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables;


import java.time.OffsetDateTime;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgLockStatusRecord;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
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
public class PgLockStatus extends TableImpl<PgLockStatusRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_lock_status</code>
     */
    public static final PgLockStatus PG_LOCK_STATUS = new PgLockStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgLockStatusRecord> getRecordType() {
        return PgLockStatusRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_lock_status.locktype</code>.
     */
    public final TableField<PgLockStatusRecord, String> LOCKTYPE = createField(DSL.name("locktype"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.database</code>.
     */
    public final TableField<PgLockStatusRecord, Long> DATABASE = createField(DSL.name("database"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.relation</code>.
     */
    public final TableField<PgLockStatusRecord, Long> RELATION = createField(DSL.name("relation"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.page</code>.
     */
    public final TableField<PgLockStatusRecord, Integer> PAGE = createField(DSL.name("page"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.tuple</code>.
     */
    public final TableField<PgLockStatusRecord, Short> TUPLE = createField(DSL.name("tuple"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.virtualxid</code>.
     */
    public final TableField<PgLockStatusRecord, String> VIRTUALXID = createField(DSL.name("virtualxid"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.transactionid</code>.
     */
    public final TableField<PgLockStatusRecord, Long> TRANSACTIONID = createField(DSL.name("transactionid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.classid</code>.
     */
    public final TableField<PgLockStatusRecord, Long> CLASSID = createField(DSL.name("classid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.objid</code>.
     */
    public final TableField<PgLockStatusRecord, Long> OBJID = createField(DSL.name("objid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.objsubid</code>.
     */
    public final TableField<PgLockStatusRecord, Short> OBJSUBID = createField(DSL.name("objsubid"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.virtualtransaction</code>.
     */
    public final TableField<PgLockStatusRecord, String> VIRTUALTRANSACTION = createField(DSL.name("virtualtransaction"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.pid</code>.
     */
    public final TableField<PgLockStatusRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.mode</code>.
     */
    public final TableField<PgLockStatusRecord, String> MODE = createField(DSL.name("mode"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.granted</code>.
     */
    public final TableField<PgLockStatusRecord, Boolean> GRANTED = createField(DSL.name("granted"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.fastpath</code>.
     */
    public final TableField<PgLockStatusRecord, Boolean> FASTPATH = createField(DSL.name("fastpath"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_lock_status.waitstart</code>.
     */
    public final TableField<PgLockStatusRecord, OffsetDateTime> WAITSTART = createField(DSL.name("waitstart"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgLockStatus(Name alias, Table<PgLockStatusRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgLockStatus(Name alias, Table<PgLockStatusRecord> aliased, Field<?>[] parameters) {
        this(alias, aliased, parameters, null);
    }

    private PgLockStatus(Name alias, Table<PgLockStatusRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_lock_status</code> table reference
     */
    public PgLockStatus(String alias) {
        this(DSL.name(alias), PG_LOCK_STATUS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_lock_status</code> table reference
     */
    public PgLockStatus(Name alias) {
        this(alias, PG_LOCK_STATUS);
    }

    /**
     * Create a <code>pg_catalog.pg_lock_status</code> table reference
     */
    public PgLockStatus() {
        this(DSL.name("pg_lock_status"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgLockStatus as(String alias) {
        return new PgLockStatus(DSL.name(alias), this, parameters);
    }

    @Override
    public PgLockStatus as(Name alias) {
        return new PgLockStatus(alias, this, parameters);
    }

    @Override
    public PgLockStatus as(Table<?> alias) {
        return new PgLockStatus(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLockStatus rename(String name) {
        return new PgLockStatus(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLockStatus rename(Name name) {
        return new PgLockStatus(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLockStatus rename(Table<?> name) {
        return new PgLockStatus(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgLockStatus call() {
        PgLockStatus result = new PgLockStatus(DSL.name("pg_lock_status"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
