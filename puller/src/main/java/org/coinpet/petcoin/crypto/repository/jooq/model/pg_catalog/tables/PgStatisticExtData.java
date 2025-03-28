/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables;


import java.util.Collection;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.Keys;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgStatisticExtDataRecord;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgStatisticRecord;
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
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultDataType;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgStatisticExtData extends TableImpl<PgStatisticExtDataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_statistic_ext_data</code>
     */
    public static final PgStatisticExtData PG_STATISTIC_EXT_DATA = new PgStatisticExtData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatisticExtDataRecord> getRecordType() {
        return PgStatisticExtDataRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statistic_ext_data.stxoid</code>.
     */
    public final TableField<PgStatisticExtDataRecord, Long> STXOID = createField(DSL.name("stxoid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext_data.stxdinherit</code>.
     */
    public final TableField<PgStatisticExtDataRecord, Boolean> STXDINHERIT = createField(DSL.name("stxdinherit"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatisticExtDataRecord, Object> STXDNDISTINCT = createField(DSL.name("stxdndistinct"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_ndistinct\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatisticExtDataRecord, Object> STXDDEPENDENCIES = createField(DSL.name("stxddependencies"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_dependencies\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatisticExtDataRecord, Object> STXDMCV = createField(DSL.name("stxdmcv"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_mcv_list\""), this, "");

    /**
     * The column <code>pg_catalog.pg_statistic_ext_data.stxdexpr</code>.
     */
    public final TableField<PgStatisticExtDataRecord, PgStatisticRecord[]> STXDEXPR = createField(DSL.name("stxdexpr"), PgStatistic.PG_STATISTIC.getDataType().array(), this, "");

    private PgStatisticExtData(Name alias, Table<PgStatisticExtDataRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PgStatisticExtData(Name alias, Table<PgStatisticExtDataRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statistic_ext_data</code> table
     * reference
     */
    public PgStatisticExtData(String alias) {
        this(DSL.name(alias), PG_STATISTIC_EXT_DATA);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statistic_ext_data</code> table
     * reference
     */
    public PgStatisticExtData(Name alias) {
        this(alias, PG_STATISTIC_EXT_DATA);
    }

    /**
     * Create a <code>pg_catalog.pg_statistic_ext_data</code> table reference
     */
    public PgStatisticExtData() {
        this(DSL.name("pg_statistic_ext_data"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgStatisticExtDataRecord> getPrimaryKey() {
        return Keys.PG_STATISTIC_EXT_DATA_STXOID_INH_INDEX;
    }

    @Override
    public PgStatisticExtData as(String alias) {
        return new PgStatisticExtData(DSL.name(alias), this);
    }

    @Override
    public PgStatisticExtData as(Name alias) {
        return new PgStatisticExtData(alias, this);
    }

    @Override
    public PgStatisticExtData as(Table<?> alias) {
        return new PgStatisticExtData(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatisticExtData rename(String name) {
        return new PgStatisticExtData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatisticExtData rename(Name name) {
        return new PgStatisticExtData(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatisticExtData rename(Table<?> name) {
        return new PgStatisticExtData(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgStatisticExtData where(Condition condition) {
        return new PgStatisticExtData(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgStatisticExtData where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgStatisticExtData where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgStatisticExtData where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgStatisticExtData where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgStatisticExtData where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgStatisticExtData where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgStatisticExtData where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgStatisticExtData whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgStatisticExtData whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
