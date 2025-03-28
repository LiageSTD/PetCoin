/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables;


import java.util.Collection;

import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.Domains;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.InformationSchema;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records.CollationCharacterSetApplicabilityRecord;
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
public class CollationCharacterSetApplicability extends TableImpl<CollationCharacterSetApplicabilityRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.collation_character_set_applicability</code>
     */
    public static final CollationCharacterSetApplicability COLLATION_CHARACTER_SET_APPLICABILITY = new CollationCharacterSetApplicability();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CollationCharacterSetApplicabilityRecord> getRecordType() {
        return CollationCharacterSetApplicabilityRecord.class;
    }

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.collation_catalog</code>.
     */
    public final TableField<CollationCharacterSetApplicabilityRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.collation_schema</code>.
     */
    public final TableField<CollationCharacterSetApplicabilityRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.collation_name</code>.
     */
    public final TableField<CollationCharacterSetApplicabilityRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.character_set_catalog</code>.
     */
    public final TableField<CollationCharacterSetApplicabilityRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.character_set_schema</code>.
     */
    public final TableField<CollationCharacterSetApplicabilityRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.collation_character_set_applicability.character_set_name</code>.
     */
    public final TableField<CollationCharacterSetApplicabilityRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private CollationCharacterSetApplicability(Name alias, Table<CollationCharacterSetApplicabilityRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private CollationCharacterSetApplicability(Name alias, Table<CollationCharacterSetApplicabilityRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "collation_character_set_applicability" as  SELECT (current_database())::information_schema.sql_identifier AS collation_catalog,
          (nc.nspname)::information_schema.sql_identifier AS collation_schema,
          (c.collname)::information_schema.sql_identifier AS collation_name,
          (NULL::name)::information_schema.sql_identifier AS character_set_catalog,
          (NULL::name)::information_schema.sql_identifier AS character_set_schema,
          (getdatabaseencoding())::information_schema.sql_identifier AS character_set_name
         FROM pg_collation c,
          pg_namespace nc
        WHERE ((c.collnamespace = nc.oid) AND (c.collencoding = ANY (ARRAY['-1'::integer, ( SELECT pg_database.encoding
                 FROM pg_database
                WHERE (pg_database.datname = current_database()))])));
        """), where);
    }

    /**
     * Create an aliased
     * <code>information_schema.collation_character_set_applicability</code>
     * table reference
     */
    public CollationCharacterSetApplicability(String alias) {
        this(DSL.name(alias), COLLATION_CHARACTER_SET_APPLICABILITY);
    }

    /**
     * Create an aliased
     * <code>information_schema.collation_character_set_applicability</code>
     * table reference
     */
    public CollationCharacterSetApplicability(Name alias) {
        this(alias, COLLATION_CHARACTER_SET_APPLICABILITY);
    }

    /**
     * Create a
     * <code>information_schema.collation_character_set_applicability</code>
     * table reference
     */
    public CollationCharacterSetApplicability() {
        this(DSL.name("collation_character_set_applicability"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public CollationCharacterSetApplicability as(String alias) {
        return new CollationCharacterSetApplicability(DSL.name(alias), this);
    }

    @Override
    public CollationCharacterSetApplicability as(Name alias) {
        return new CollationCharacterSetApplicability(alias, this);
    }

    @Override
    public CollationCharacterSetApplicability as(Table<?> alias) {
        return new CollationCharacterSetApplicability(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CollationCharacterSetApplicability rename(String name) {
        return new CollationCharacterSetApplicability(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CollationCharacterSetApplicability rename(Name name) {
        return new CollationCharacterSetApplicability(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CollationCharacterSetApplicability rename(Table<?> name) {
        return new CollationCharacterSetApplicability(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CollationCharacterSetApplicability where(Condition condition) {
        return new CollationCharacterSetApplicability(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CollationCharacterSetApplicability where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CollationCharacterSetApplicability where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CollationCharacterSetApplicability where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CollationCharacterSetApplicability where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CollationCharacterSetApplicability where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CollationCharacterSetApplicability where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CollationCharacterSetApplicability where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CollationCharacterSetApplicability whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CollationCharacterSetApplicability whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
