/*
 * This file is generated by jOOQ.
 */
package org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.routines;


import java.time.OffsetDateTime;

import org.coinpet.petcoin.crypto.repository.jooq.model.pg_catalog.PgCatalog;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgLastCommittedXact extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.pg_last_committed_xact.xid</code>.
     */
    public static final Parameter<Long> XID = Internal.createParameter("xid", SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_last_committed_xact.timestamp</code>.
     */
    public static final Parameter<OffsetDateTime> TIMESTAMP = Internal.createParameter("timestamp", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false);

    /**
     * The parameter <code>pg_catalog.pg_last_committed_xact.roident</code>.
     */
    public static final Parameter<Long> ROIDENT = Internal.createParameter("roident", SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PgLastCommittedXact() {
        super("pg_last_committed_xact", PgCatalog.PG_CATALOG);

        addOutParameter(XID);
        addOutParameter(TIMESTAMP);
        addOutParameter(ROIDENT);
    }

    /**
     * Get the <code>xid</code> parameter OUT value from the routine
     */
    public Long getXid() {
        return get(XID);
    }

    /**
     * Get the <code>timestamp</code> parameter OUT value from the routine
     */
    public OffsetDateTime getTimestamp() {
        return get(TIMESTAMP);
    }

    /**
     * Get the <code>roident</code> parameter OUT value from the routine
     */
    public Long getRoident() {
        return get(ROIDENT);
    }
}
