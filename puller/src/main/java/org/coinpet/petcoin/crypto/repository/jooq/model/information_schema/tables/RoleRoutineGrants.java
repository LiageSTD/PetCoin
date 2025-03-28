/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables;


import java.util.Collection;

import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.Domains;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.InformationSchema;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records.RoleRoutineGrantsRecord;
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
public class RoleRoutineGrants extends TableImpl<RoleRoutineGrantsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.role_routine_grants</code>
     */
    public static final RoleRoutineGrants ROLE_ROUTINE_GRANTS = new RoleRoutineGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleRoutineGrantsRecord> getRecordType() {
        return RoleRoutineGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.role_routine_grants.grantor</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> GRANTOR = createField(DSL.name("grantor"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_routine_grants.grantee</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> GRANTEE = createField(DSL.name("grantee"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.specific_catalog</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.specific_schema</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.specific_name</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.routine_catalog</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> ROUTINE_CATALOG = createField(DSL.name("routine_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.routine_schema</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> ROUTINE_SCHEMA = createField(DSL.name("routine_schema"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.routine_name</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> ROUTINE_NAME = createField(DSL.name("routine_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.privilege_type</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.is_grantable</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), Domains.YES_OR_NO.getDataType(), this, "");

    private RoleRoutineGrants(Name alias, Table<RoleRoutineGrantsRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private RoleRoutineGrants(Name alias, Table<RoleRoutineGrantsRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "role_routine_grants" as  SELECT grantor,
          grantee,
          specific_catalog,
          specific_schema,
          specific_name,
          routine_catalog,
          routine_schema,
          routine_name,
          privilege_type,
          is_grantable
         FROM information_schema.routine_privileges
        WHERE (((grantor)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)) OR ((grantee)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)));
        """), where);
    }

    /**
     * Create an aliased <code>information_schema.role_routine_grants</code>
     * table reference
     */
    public RoleRoutineGrants(String alias) {
        this(DSL.name(alias), ROLE_ROUTINE_GRANTS);
    }

    /**
     * Create an aliased <code>information_schema.role_routine_grants</code>
     * table reference
     */
    public RoleRoutineGrants(Name alias) {
        this(alias, ROLE_ROUTINE_GRANTS);
    }

    /**
     * Create a <code>information_schema.role_routine_grants</code> table
     * reference
     */
    public RoleRoutineGrants() {
        this(DSL.name("role_routine_grants"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoleRoutineGrants as(String alias) {
        return new RoleRoutineGrants(DSL.name(alias), this);
    }

    @Override
    public RoleRoutineGrants as(Name alias) {
        return new RoleRoutineGrants(alias, this);
    }

    @Override
    public RoleRoutineGrants as(Table<?> alias) {
        return new RoleRoutineGrants(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleRoutineGrants rename(String name) {
        return new RoleRoutineGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleRoutineGrants rename(Name name) {
        return new RoleRoutineGrants(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleRoutineGrants rename(Table<?> name) {
        return new RoleRoutineGrants(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RoleRoutineGrants where(Condition condition) {
        return new RoleRoutineGrants(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RoleRoutineGrants where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RoleRoutineGrants where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RoleRoutineGrants where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public RoleRoutineGrants where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public RoleRoutineGrants where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public RoleRoutineGrants where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public RoleRoutineGrants where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RoleRoutineGrants whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RoleRoutineGrants whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
