/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables;


import java.util.Collection;

import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.Domains;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.InformationSchema;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records.ViewsRecord;
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
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Views extends TableImpl<ViewsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.views</code>
     */
    public static final Views VIEWS = new Views();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewsRecord> getRecordType() {
        return ViewsRecord.class;
    }

    /**
     * The column <code>information_schema.views.table_catalog</code>.
     */
    public final TableField<ViewsRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.views.table_schema</code>.
     */
    public final TableField<ViewsRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.views.table_name</code>.
     */
    public final TableField<ViewsRecord, String> TABLE_NAME = createField(DSL.name("table_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.views.view_definition</code>.
     */
    public final TableField<ViewsRecord, String> VIEW_DEFINITION = createField(DSL.name("view_definition"), Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.views.check_option</code>.
     */
    public final TableField<ViewsRecord, String> CHECK_OPTION = createField(DSL.name("check_option"), Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.views.is_updatable</code>.
     */
    public final TableField<ViewsRecord, String> IS_UPDATABLE = createField(DSL.name("is_updatable"), Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.views.is_insertable_into</code>.
     */
    public final TableField<ViewsRecord, String> IS_INSERTABLE_INTO = createField(DSL.name("is_insertable_into"), Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.views.is_trigger_updatable</code>.
     */
    public final TableField<ViewsRecord, String> IS_TRIGGER_UPDATABLE = createField(DSL.name("is_trigger_updatable"), Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.views.is_trigger_deletable</code>.
     */
    public final TableField<ViewsRecord, String> IS_TRIGGER_DELETABLE = createField(DSL.name("is_trigger_deletable"), Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.views.is_trigger_insertable_into</code>.
     */
    public final TableField<ViewsRecord, String> IS_TRIGGER_INSERTABLE_INTO = createField(DSL.name("is_trigger_insertable_into"), Domains.YES_OR_NO.getDataType(), this, "");

    private Views(Name alias, Table<ViewsRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Views(Name alias, Table<ViewsRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "views" as  SELECT (current_database())::information_schema.sql_identifier AS table_catalog,
          (nc.nspname)::information_schema.sql_identifier AS table_schema,
          (c.relname)::information_schema.sql_identifier AS table_name,
          (
              CASE
                  WHEN pg_has_role(c.relowner, 'USAGE'::text) THEN pg_get_viewdef(c.oid)
                  ELSE NULL::text
              END)::information_schema.character_data AS view_definition,
          (
              CASE
                  WHEN ('check_option=cascaded'::text = ANY (c.reloptions)) THEN 'CASCADED'::text
                  WHEN ('check_option=local'::text = ANY (c.reloptions)) THEN 'LOCAL'::text
                  ELSE 'NONE'::text
              END)::information_schema.character_data AS check_option,
          (
              CASE
                  WHEN ((pg_relation_is_updatable((c.oid)::regclass, false) & 20) = 20) THEN 'YES'::text
                  ELSE 'NO'::text
              END)::information_schema.yes_or_no AS is_updatable,
          (
              CASE
                  WHEN ((pg_relation_is_updatable((c.oid)::regclass, false) & 8) = 8) THEN 'YES'::text
                  ELSE 'NO'::text
              END)::information_schema.yes_or_no AS is_insertable_into,
          (
              CASE
                  WHEN (EXISTS ( SELECT 1
                     FROM pg_trigger
                    WHERE ((pg_trigger.tgrelid = c.oid) AND (((pg_trigger.tgtype)::integer & 81) = 81)))) THEN 'YES'::text
                  ELSE 'NO'::text
              END)::information_schema.yes_or_no AS is_trigger_updatable,
          (
              CASE
                  WHEN (EXISTS ( SELECT 1
                     FROM pg_trigger
                    WHERE ((pg_trigger.tgrelid = c.oid) AND (((pg_trigger.tgtype)::integer & 73) = 73)))) THEN 'YES'::text
                  ELSE 'NO'::text
              END)::information_schema.yes_or_no AS is_trigger_deletable,
          (
              CASE
                  WHEN (EXISTS ( SELECT 1
                     FROM pg_trigger
                    WHERE ((pg_trigger.tgrelid = c.oid) AND (((pg_trigger.tgtype)::integer & 69) = 69)))) THEN 'YES'::text
                  ELSE 'NO'::text
              END)::information_schema.yes_or_no AS is_trigger_insertable_into
         FROM pg_namespace nc,
          pg_class c
        WHERE ((c.relnamespace = nc.oid) AND (c.relkind = 'v'::"char") AND (NOT pg_is_other_temp_schema(nc.oid)) AND (pg_has_role(c.relowner, 'USAGE'::text) OR has_table_privilege(c.oid, 'SELECT, INSERT, UPDATE, DELETE, TRUNCATE, REFERENCES, TRIGGER'::text) OR has_any_column_privilege(c.oid, 'SELECT, INSERT, UPDATE, REFERENCES'::text)));
        """), where);
    }

    /**
     * Create an aliased <code>information_schema.views</code> table reference
     */
    public Views(String alias) {
        this(DSL.name(alias), VIEWS);
    }

    /**
     * Create an aliased <code>information_schema.views</code> table reference
     */
    public Views(Name alias) {
        this(alias, VIEWS);
    }

    /**
     * Create a <code>information_schema.views</code> table reference
     */
    public Views() {
        this(DSL.name("views"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Views as(String alias) {
        return new Views(DSL.name(alias), this);
    }

    @Override
    public Views as(Name alias) {
        return new Views(alias, this);
    }

    @Override
    public Views as(Table<?> alias) {
        return new Views(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Views rename(String name) {
        return new Views(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Views rename(Name name) {
        return new Views(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Views rename(Table<?> name) {
        return new Views(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Views where(Condition condition) {
        return new Views(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Views where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Views where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Views where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Views where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Views where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Views where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Views where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Views whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Views whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
