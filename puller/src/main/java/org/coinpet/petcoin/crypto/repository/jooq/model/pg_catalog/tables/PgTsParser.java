/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.Keys;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgTsParserRecord;
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
public class PgTsParser extends TableImpl<PgTsParserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_ts_parser</code>
     */
    public static final PgTsParser PG_TS_PARSER = new PgTsParser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTsParserRecord> getRecordType() {
        return PgTsParserRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ts_parser.oid</code>.
     */
    public final TableField<PgTsParserRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prsname</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSNAME = createField(DSL.name("prsname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prsnamespace</code>.
     */
    public final TableField<PgTsParserRecord, Long> PRSNAMESPACE = createField(DSL.name("prsnamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prsstart</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSSTART = createField(DSL.name("prsstart"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prstoken</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSTOKEN = createField(DSL.name("prstoken"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prsend</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSEND = createField(DSL.name("prsend"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prsheadline</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSHEADLINE = createField(DSL.name("prsheadline"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prslextype</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSLEXTYPE = createField(DSL.name("prslextype"), SQLDataType.VARCHAR.nullable(false), this, "");

    private PgTsParser(Name alias, Table<PgTsParserRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PgTsParser(Name alias, Table<PgTsParserRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_parser</code> table reference
     */
    public PgTsParser(String alias) {
        this(DSL.name(alias), PG_TS_PARSER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_parser</code> table reference
     */
    public PgTsParser(Name alias) {
        this(alias, PG_TS_PARSER);
    }

    /**
     * Create a <code>pg_catalog.pg_ts_parser</code> table reference
     */
    public PgTsParser() {
        this(DSL.name("pg_ts_parser"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgTsParserRecord> getPrimaryKey() {
        return Keys.PG_TS_PARSER_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgTsParserRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_TS_PARSER_PRSNAME_INDEX);
    }

    @Override
    public PgTsParser as(String alias) {
        return new PgTsParser(DSL.name(alias), this);
    }

    @Override
    public PgTsParser as(Name alias) {
        return new PgTsParser(alias, this);
    }

    @Override
    public PgTsParser as(Table<?> alias) {
        return new PgTsParser(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsParser rename(String name) {
        return new PgTsParser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsParser rename(Name name) {
        return new PgTsParser(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsParser rename(Table<?> name) {
        return new PgTsParser(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgTsParser where(Condition condition) {
        return new PgTsParser(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgTsParser where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgTsParser where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgTsParser where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgTsParser where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgTsParser where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgTsParser where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PgTsParser where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgTsParser whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PgTsParser whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
