/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgLogicalSlotPeekBinaryChangesRecord;
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
public class PgLogicalSlotPeekBinaryChanges extends TableImpl<PgLogicalSlotPeekBinaryChangesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes</code>
     */
    public static final PgLogicalSlotPeekBinaryChanges PG_LOGICAL_SLOT_PEEK_BINARY_CHANGES = new PgLogicalSlotPeekBinaryChanges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgLogicalSlotPeekBinaryChangesRecord> getRecordType() {
        return PgLogicalSlotPeekBinaryChangesRecord.class;
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
    public final TableField<PgLogicalSlotPeekBinaryChangesRecord, Object> LSN = createField(DSL.name("lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes.xid</code>.
     */
    public final TableField<PgLogicalSlotPeekBinaryChangesRecord, Long> XID = createField(DSL.name("xid"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes.data</code>.
     */
    public final TableField<PgLogicalSlotPeekBinaryChangesRecord, byte[]> DATA = createField(DSL.name("data"), SQLDataType.BLOB, this, "");

    private PgLogicalSlotPeekBinaryChanges(Name alias, Table<PgLogicalSlotPeekBinaryChangesRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.VARCHAR),
            DSL.val(null, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
            DSL.val(null, SQLDataType.INTEGER),
            DSL.val(null, SQLDataType.CLOB.array().defaultValue(DSL.field(DSL.raw("'{}'::text[]"), SQLDataType.CLOB.array())))
        });
    }

    private PgLogicalSlotPeekBinaryChanges(Name alias, Table<PgLogicalSlotPeekBinaryChangesRecord> aliased, Field<?>[] parameters) {
        this(alias, aliased, parameters, null);
    }

    private PgLogicalSlotPeekBinaryChanges(Name alias, Table<PgLogicalSlotPeekBinaryChangesRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function(), where);
    }

    /**
     * Create an aliased
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes</code> table
     * reference
     */
    public PgLogicalSlotPeekBinaryChanges(String alias) {
        this(DSL.name(alias), PG_LOGICAL_SLOT_PEEK_BINARY_CHANGES);
    }

    /**
     * Create an aliased
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes</code> table
     * reference
     */
    public PgLogicalSlotPeekBinaryChanges(Name alias) {
        this(alias, PG_LOGICAL_SLOT_PEEK_BINARY_CHANGES);
    }

    /**
     * Create a <code>pg_catalog.pg_logical_slot_peek_binary_changes</code>
     * table reference
     */
    public PgLogicalSlotPeekBinaryChanges() {
        this(DSL.name("pg_logical_slot_peek_binary_changes"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgLogicalSlotPeekBinaryChanges as(String alias) {
        return new PgLogicalSlotPeekBinaryChanges(DSL.name(alias), this, parameters);
    }

    @Override
    public PgLogicalSlotPeekBinaryChanges as(Name alias) {
        return new PgLogicalSlotPeekBinaryChanges(alias, this, parameters);
    }

    @Override
    public PgLogicalSlotPeekBinaryChanges as(Table<?> alias) {
        return new PgLogicalSlotPeekBinaryChanges(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLogicalSlotPeekBinaryChanges rename(String name) {
        return new PgLogicalSlotPeekBinaryChanges(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLogicalSlotPeekBinaryChanges rename(Name name) {
        return new PgLogicalSlotPeekBinaryChanges(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLogicalSlotPeekBinaryChanges rename(Table<?> name) {
        return new PgLogicalSlotPeekBinaryChanges(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgLogicalSlotPeekBinaryChanges call(
          String slotName
        , Object uptoLsn
        , Integer uptoNchanges
        , String[] options
    ) {
        PgLogicalSlotPeekBinaryChanges result = new PgLogicalSlotPeekBinaryChanges(DSL.name("pg_logical_slot_peek_binary_changes"), null, new Field[] {
            DSL.val(slotName, SQLDataType.VARCHAR),
            DSL.val(uptoLsn, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
            DSL.val(uptoNchanges, SQLDataType.INTEGER),
            DSL.val(options, SQLDataType.CLOB.array().defaultValue(DSL.field(DSL.raw("'{}'::text[]"), SQLDataType.CLOB.array())))
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgLogicalSlotPeekBinaryChanges call(
          Field<String> slotName
        , Field<Object> uptoLsn
        , Field<Integer> uptoNchanges
        , Field<String[]> options
    ) {
        PgLogicalSlotPeekBinaryChanges result = new PgLogicalSlotPeekBinaryChanges(DSL.name("pg_logical_slot_peek_binary_changes"), null, new Field[] {
            slotName,
            uptoLsn,
            uptoNchanges,
            options
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
