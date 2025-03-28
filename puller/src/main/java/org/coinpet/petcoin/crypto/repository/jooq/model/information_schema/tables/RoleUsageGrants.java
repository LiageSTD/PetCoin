/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables;


import java.util.Collection;

import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.Domains;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.InformationSchema;
import org.coinpet.petcoin.crypto.repository.jooq.model.information_schema.tables.records.RoleUsageGrantsRecord;
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
public class RoleUsageGrants extends TableImpl<RoleUsageGrantsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.role_usage_grants</code>
     */
    public static final RoleUsageGrants ROLE_USAGE_GRANTS = new RoleUsageGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleUsageGrantsRecord> getRecordType() {
        return RoleUsageGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.role_usage_grants.grantor</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> GRANTOR = createField(DSL.name("grantor"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_usage_grants.grantee</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> GRANTEE = createField(DSL.name("grantee"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_usage_grants.object_catalog</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_CATALOG = createField(DSL.name("object_catalog"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_usage_grants.object_schema</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_SCHEMA = createField(DSL.name("object_schema"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_usage_grants.object_name</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_NAME = createField(DSL.name("object_name"), Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_usage_grants.object_type</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_TYPE = createField(DSL.name("object_type"), Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_usage_grants.privilege_type</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_usage_grants.is_grantable</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), Domains.YES_OR_NO.getDataType(), this, "");

    private RoleUsageGrants(Name alias, Table<RoleUsageGrantsRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private RoleUsageGrants(Name alias, Table<RoleUsageGrantsRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "role_usage_grants" as  SELECT grantor,
          grantee,
          object_catalog,
          object_schema,
          object_name,
          object_type,
          privilege_type,
          is_grantable
         FROM information_schema.usage_privileges
        WHERE (((grantor)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)) OR ((grantee)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)));
        """), where);
    }

    /**
     * Create an aliased <code>information_schema.role_usage_grants</code> table
     * reference
     */
    public RoleUsageGrants(String alias) {
        this(DSL.name(alias), ROLE_USAGE_GRANTS);
    }

    /**
     * Create an aliased <code>information_schema.role_usage_grants</code> table
     * reference
     */
    public RoleUsageGrants(Name alias) {
        this(alias, ROLE_USAGE_GRANTS);
    }

    /**
     * Create a <code>information_schema.role_usage_grants</code> table
     * reference
     */
    public RoleUsageGrants() {
        this(DSL.name("role_usage_grants"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoleUsageGrants as(String alias) {
        return new RoleUsageGrants(DSL.name(alias), this);
    }

    @Override
    public RoleUsageGrants as(Name alias) {
        return new RoleUsageGrants(alias, this);
    }

    @Override
    public RoleUsageGrants as(Table<?> alias) {
        return new RoleUsageGrants(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleUsageGrants rename(String name) {
        return new RoleUsageGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleUsageGrants rename(Name name) {
        return new RoleUsageGrants(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleUsageGrants rename(Table<?> name) {
        return new RoleUsageGrants(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RoleUsageGrants where(Condition condition) {
        return new RoleUsageGrants(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RoleUsageGrants where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RoleUsageGrants where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RoleUsageGrants where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public RoleUsageGrants where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public RoleUsageGrants where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public RoleUsageGrants where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public RoleUsageGrants where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RoleUsageGrants whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public RoleUsageGrants whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
