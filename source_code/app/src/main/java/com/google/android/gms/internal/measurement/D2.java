package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class D2 implements C2 {
    public static final C1320g1 alpha;
    public static final C1320g1 bravo;

    static {
        Pf.j jVar = new Pf.j(AbstractC1305d1.alpha(), true, true);
        jVar.yankee("measurement.collection.event_safelist", true);
        alpha = jVar.yankee("measurement.service.store_null_safelist", true);
        bravo = jVar.yankee("measurement.service.store_safelist", true);
    }
}
