/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables;


import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.tables.records.PgConfigRecord;
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
public class PgConfig extends TableImpl<PgConfigRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_config</code>
     */
    public static final PgConfig PG_CONFIG = new PgConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgConfigRecord> getRecordType() {
        return PgConfigRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_config.name</code>.
     */
    public final TableField<PgConfigRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_config.setting</code>.
     */
    public final TableField<PgConfigRecord, String> SETTING = createField(DSL.name("setting"), SQLDataType.CLOB, this, "");

    private PgConfig(Name alias, Table<PgConfigRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgConfig(Name alias, Table<PgConfigRecord> aliased, Field<?>[] parameters) {
        this(alias, aliased, parameters, null);
    }

    private PgConfig(Name alias, Table<PgConfigRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_config</code> table reference
     */
    public PgConfig(String alias) {
        this(DSL.name(alias), PG_CONFIG);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_config</code> table reference
     */
    public PgConfig(Name alias) {
        this(alias, PG_CONFIG);
    }

    /**
     * Create a <code>pg_catalog.pg_config</code> table reference
     */
    public PgConfig() {
        this(DSL.name("pg_config"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgConfig as(String alias) {
        return new PgConfig(DSL.name(alias), this, parameters);
    }

    @Override
    public PgConfig as(Name alias) {
        return new PgConfig(alias, this, parameters);
    }

    @Override
    public PgConfig as(Table<?> alias) {
        return new PgConfig(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgConfig rename(String name) {
        return new PgConfig(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgConfig rename(Name name) {
        return new PgConfig(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgConfig rename(Table<?> name) {
        return new PgConfig(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgConfig call() {
        PgConfig result = new PgConfig(DSL.name("pg_config"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
