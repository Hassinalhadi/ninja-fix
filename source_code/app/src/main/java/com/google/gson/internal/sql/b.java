package com.google.gson.internal.sql;

import com.google.gson.ae;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes2.dex */
public abstract class b {
    public static final boolean alpha;
    public static final a bravo;
    public static final a charlie;
    public static final ae delta;
    public static final ae echo;
    public static final ae foxtrot;

    static {
        boolean z2;
        try {
            Class.forName("java.sql.Date");
            z2 = true;
        } catch (ClassNotFoundException unused) {
            z2 = false;
        }
        alpha = z2;
        if (z2) {
            bravo = new a(0, Date.class);
            charlie = new a(1, Timestamp.class);
            delta = SqlDateTypeAdapter.FACTORY;
            echo = SqlTimeTypeAdapter.FACTORY;
            foxtrot = SqlTimestampTypeAdapter.FACTORY;
            return;
        }
        bravo = null;
        charlie = null;
        delta = null;
        echo = null;
        foxtrot = null;
    }
}
