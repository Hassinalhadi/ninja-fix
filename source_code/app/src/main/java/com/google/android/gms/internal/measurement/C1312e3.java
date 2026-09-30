package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1312e3 implements InterfaceC1307d3 {
    public static final C1320g1 alpha;
    public static final C1320g1 bravo;
    public static final C1320g1 charlie;
    public static final C1320g1 delta;
    public static final C1320g1 echo;
    public static final C1320g1 foxtrot;

    static {
        Pf.j jVar = new Pf.j(AbstractC1305d1.alpha(), true, true);
        alpha = jVar.yankee("measurement.test.boolean_flag", false);
        bravo = jVar.victor(-1L, "measurement.test.cached_long_flag");
        Double valueOf = Double.valueOf(-3.0d);
        Object obj = C1320g1.golf;
        charlie = new C1320g1(jVar, "measurement.test.double_flag", valueOf, 2);
        delta = jVar.victor(-2L, "measurement.test.int_flag");
        echo = jVar.victor(-1L, "measurement.test.long_flag");
        foxtrot = jVar.whiskey("measurement.test.string_flag", "---");
    }
}
