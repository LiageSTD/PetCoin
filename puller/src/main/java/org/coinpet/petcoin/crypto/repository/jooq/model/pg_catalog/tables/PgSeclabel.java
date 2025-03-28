/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables;


import java.util.Collection;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.Keys;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgSeclabelRecord;
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
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgSeclabel extends TableImpl<PgSeclabelRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_seclabel</code>
     */
    public static final PgSeclabel PG_SECLABEL = new PgSeclabel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgSeclabelRecord> getRecordType() {
        return PgSeclabelRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_seclabel.objoid</code>.
     */
    public final TableField<PgSeclabelRecord, Long> OBJOID = createField(DSL.name("objoid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_seclabel.classoid</code>.
     */
    public final TableField<PgSeclabelRecord, Long> CLASSOID = createField(DSL.name("classoid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_seclabel.objsubid</code>.
     */
    public final TableField<PgSeclabelRecord, Integer> OBJSUBID = createField(DSL.name("objsubid"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_seclabel.provider</code>.
     */
    public final TableField<PgSeclabelRecord, String> PROVIDER = createField(DSL.name("provider"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_seclabel.label</code>.
     */
    public final TableField<PgSeclabelRecord, String> LABEL = createField(DSL.name("label"), SQLDataType.CLOB.nullable(false), this, "");

    private PgSeclabel(Name alias, Table<PgSeclabelRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PgSeclabel(Name alias, Table<PgSeclabelRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_seclabel</code> table reference
     */
    public PgSeclabel(String alias) {
        this(DSL.name(alias), PG_SECLABEL);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_seclabel</code> table reference
     */
    public PgSeclabel(Name alias) {
        this(alias, PG_SECLABEL);
    }

    /**
     * Create a <code>pg_catalog.pg_seclabel</code> table reference
     */
    public PgSeclabel() {
        this(DSL.name("pg_seclabel"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgSeclabelRecord> getPrimaryKey() {
        return Keys.PG_SECLABEL_OBJECT_INDEX;
    }

    @Override
    public PgSeclabel as(String alias) {
        return new PgSeclabel(DSL.name(alias), this);
    }

    @Override
    public PgSeclabel as(Name alias) {
        return new PgSeclabel(alias, this);
    }

    @Override
    public PgSeclabel as(Table<?> alias) {
        return new PgSeclabel(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSeclabel rename(String name) {
        return new PgSeclabel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSeclabel rename(Name name) {
        return new PgSeclabel(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSeclabel rename(Table<?> name) {
        return new PgSeclabel(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgSeclabel where(Condition condition) {
        return new PgSeclabel(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgSeclabel where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgSeclabel where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgSeclabel where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgSeclabel where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgSeclabel where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgSeclabel where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgSeclabel where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgSeclabel whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgSeclabel whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
