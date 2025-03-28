/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgSnapshotXipRecord;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgSnapshotXip extends TableImpl<PgSnapshotXipRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_snapshot_xip</code>
     */
    public static final PgSnapshotXip PG_SNAPSHOT_XIP = new PgSnapshotXip();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgSnapshotXipRecord> getRecordType() {
        return PgSnapshotXipRecord.class;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgSnapshotXipRecord, Object> PG_SNAPSHOT_XIP_ = createField(DSL.name("pg_snapshot_xip"), DefaultDataType.getDefaultDataType("\"xid8\""), this, "");

    private PgSnapshotXip(Name alias, Table<PgSnapshotXipRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_snapshot\""))
        });
    }

    private PgSnapshotXip(Name alias, Table<PgSnapshotXipRecord> aliased, Field<?>[] parameters) {
        this(alias, aliased, parameters, null);
    }

    private PgSnapshotXip(Name alias, Table<PgSnapshotXipRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_snapshot_xip</code> table reference
     */
    public PgSnapshotXip(String alias) {
        this(DSL.name(alias), PG_SNAPSHOT_XIP);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_snapshot_xip</code> table reference
     */
    public PgSnapshotXip(Name alias) {
        this(alias, PG_SNAPSHOT_XIP);
    }

    /**
     * Create a <code>pg_catalog.pg_snapshot_xip</code> table reference
     */
    public PgSnapshotXip() {
        this(DSL.name("pg_snapshot_xip"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgSnapshotXip as(String alias) {
        return new PgSnapshotXip(DSL.name(alias), this, parameters);
    }

    @Override
    public PgSnapshotXip as(Name alias) {
        return new PgSnapshotXip(alias, this, parameters);
    }

    @Override
    public PgSnapshotXip as(Table<?> alias) {
        return new PgSnapshotXip(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSnapshotXip rename(String name) {
        return new PgSnapshotXip(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSnapshotXip rename(Name name) {
        return new PgSnapshotXip(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSnapshotXip rename(Table<?> name) {
        return new PgSnapshotXip(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgSnapshotXip call(
          Object __1
    ) {
        PgSnapshotXip result = new PgSnapshotXip(DSL.name("pg_snapshot_xip"), null, new Field[] {
            DSL.val(__1, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_snapshot\""))
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgSnapshotXip call(
          Field<Object> __1
    ) {
        PgSnapshotXip result = new PgSnapshotXip(DSL.name("pg_snapshot_xip"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
