/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.Keys;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgRewriteRecord;
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
public class PgRewrite extends TableImpl<PgRewriteRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_rewrite</code>
     */
    public static final PgRewrite PG_REWRITE = new PgRewrite();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgRewriteRecord> getRecordType() {
        return PgRewriteRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_rewrite.oid</code>.
     */
    public final TableField<PgRewriteRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_rewrite.rulename</code>.
     */
    public final TableField<PgRewriteRecord, String> RULENAME = createField(DSL.name("rulename"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_rewrite.ev_class</code>.
     */
    public final TableField<PgRewriteRecord, Long> EV_CLASS = createField(DSL.name("ev_class"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_rewrite.ev_type</code>.
     */
    public final TableField<PgRewriteRecord, String> EV_TYPE = createField(DSL.name("ev_type"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_rewrite.ev_enabled</code>.
     */
    public final TableField<PgRewriteRecord, String> EV_ENABLED = createField(DSL.name("ev_enabled"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_rewrite.is_instead</code>.
     */
    public final TableField<PgRewriteRecord, Boolean> IS_INSTEAD = createField(DSL.name("is_instead"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgRewriteRecord, Object> EV_QUAL = createField(DSL.name("ev_qual"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\"").nullable(false), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgRewriteRecord, Object> EV_ACTION = createField(DSL.name("ev_action"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\"").nullable(false), this, "");

    private PgRewrite(Name alias, Table<PgRewriteRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PgRewrite(Name alias, Table<PgRewriteRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_rewrite</code> table reference
     */
    public PgRewrite(String alias) {
        this(DSL.name(alias), PG_REWRITE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_rewrite</code> table reference
     */
    public PgRewrite(Name alias) {
        this(alias, PG_REWRITE);
    }

    /**
     * Create a <code>pg_catalog.pg_rewrite</code> table reference
     */
    public PgRewrite() {
        this(DSL.name("pg_rewrite"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgRewriteRecord> getPrimaryKey() {
        return Keys.PG_REWRITE_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgRewriteRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_REWRITE_REL_RULENAME_INDEX);
    }

    @Override
    public PgRewrite as(String alias) {
        return new PgRewrite(DSL.name(alias), this);
    }

    @Override
    public PgRewrite as(Name alias) {
        return new PgRewrite(alias, this);
    }

    @Override
    public PgRewrite as(Table<?> alias) {
        return new PgRewrite(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRewrite rename(String name) {
        return new PgRewrite(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRewrite rename(Name name) {
        return new PgRewrite(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgRewrite rename(Table<?> name) {
        return new PgRewrite(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgRewrite where(Condition condition) {
        return new PgRewrite(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgRewrite where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgRewrite where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgRewrite where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgRewrite where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgRewrite where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgRewrite where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgRewrite where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgRewrite whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgRewrite whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
