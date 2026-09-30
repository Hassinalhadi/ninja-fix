package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class Y2 implements X2 {
    public static final C1320g1 alpha;

    static {
        Pf.j jVar = new Pf.j(AbstractC1305d1.alpha(), true, true);
        jVar.yankee("measurement.gmscore_feature_tracking", true);
        alpha = jVar.yankee("measurement.gmscore_client_telemetry", false);
    }
}
