/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgShowReplicationOriginStatusRecord;
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
public class PgShowReplicationOriginStatus extends TableImpl<PgShowReplicationOriginStatusRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_show_replication_origin_status</code>
     */
    public static final PgShowReplicationOriginStatus PG_SHOW_REPLICATION_ORIGIN_STATUS = new PgShowReplicationOriginStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgShowReplicationOriginStatusRecord> getRecordType() {
        return PgShowReplicationOriginStatusRecord.class;
    }

    /**
     * The column
     * <code>pg_catalog.pg_show_replication_origin_status.local_id</code>.
     */
    public final TableField<PgShowReplicationOriginStatusRecord, Long> LOCAL_ID = createField(DSL.name("local_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_show_replication_origin_status.external_id</code>.
     */
    public final TableField<PgShowReplicationOriginStatusRecord, String> EXTERNAL_ID = createField(DSL.name("external_id"), SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgShowReplicationOriginStatusRecord, Object> REMOTE_LSN = createField(DSL.name("remote_lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgShowReplicationOriginStatusRecord, Object> LOCAL_LSN = createField(DSL.name("local_lsn"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    private PgShowReplicationOriginStatus(Name alias, Table<PgShowReplicationOriginStatusRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgShowReplicationOriginStatus(Name alias, Table<PgShowReplicationOriginStatusRecord> aliased, Field<?>[] parameters) {
        this(alias, aliased, parameters, null);
    }

    private PgShowReplicationOriginStatus(Name alias, Table<PgShowReplicationOriginStatusRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function(), where);
    }

    /**
     * Create an aliased
     * <code>pg_catalog.pg_show_replication_origin_status</code> table reference
     */
    public PgShowReplicationOriginStatus(String alias) {
        this(DSL.name(alias), PG_SHOW_REPLICATION_ORIGIN_STATUS);
    }

    /**
     * Create an aliased
     * <code>pg_catalog.pg_show_replication_origin_status</code> table reference
     */
    public PgShowReplicationOriginStatus(Name alias) {
        this(alias, PG_SHOW_REPLICATION_ORIGIN_STATUS);
    }

    /**
     * Create a <code>pg_catalog.pg_show_replication_origin_status</code> table
     * reference
     */
    public PgShowReplicationOriginStatus() {
        this(DSL.name("pg_show_replication_origin_status"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgShowReplicationOriginStatus as(String alias) {
        return new PgShowReplicationOriginStatus(DSL.name(alias), this, parameters);
    }

    @Override
    public PgShowReplicationOriginStatus as(Name alias) {
        return new PgShowReplicationOriginStatus(alias, this, parameters);
    }

    @Override
    public PgShowReplicationOriginStatus as(Table<?> alias) {
        return new PgShowReplicationOriginStatus(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShowReplicationOriginStatus rename(String name) {
        return new PgShowReplicationOriginStatus(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShowReplicationOriginStatus rename(Name name) {
        return new PgShowReplicationOriginStatus(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShowReplicationOriginStatus rename(Table<?> name) {
        return new PgShowReplicationOriginStatus(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgShowReplicationOriginStatus call() {
        PgShowReplicationOriginStatus result = new PgShowReplicationOriginStatus(DSL.name("pg_show_replication_origin_status"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
