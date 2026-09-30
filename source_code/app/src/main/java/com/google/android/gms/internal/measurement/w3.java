package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class w3 implements v3 {
    public static final C1320g1 alpha;

    static {
        Pf.j jVar = new Pf.j(AbstractC1305d1.alpha(), true, true);
        jVar.yankee("measurement.client.sessions.background_sessions_enabled", true);
        alpha = jVar.yankee("measurement.client.sessions.enable_fix_background_engagement", false);
        jVar.yankee("measurement.client.sessions.immediate_start_enabled_foreground", true);
        jVar.yankee("measurement.client.sessions.enable_pause_engagement_in_background", true);
        jVar.yankee("measurement.client.sessions.session_id_enabled", true);
        jVar.victor(0L, "measurement.id.client.sessions.enable_fix_background_engagement");
    }
}
