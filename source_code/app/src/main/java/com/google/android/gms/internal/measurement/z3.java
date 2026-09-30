package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class z3 implements y3 {
    public static final C1320g1 alpha;
    public static final C1320g1 bravo;
    public static final C1320g1 charlie;
    public static final C1320g1 delta;
    public static final C1320g1 echo;
    public static final C1320g1 foxtrot;
    public static final C1320g1 golf;
    public static final C1320g1 hotel;

    static {
        Pf.j jVar = new Pf.j(AbstractC1305d1.alpha(), true, true);
        alpha = jVar.yankee("measurement.sgtm.client.scion_upload_action", true);
        bravo = jVar.yankee("measurement.sgtm.client.upload_on_backgrounded.dev", false);
        charlie = jVar.yankee("measurement.sgtm.google_signal.enable", true);
        jVar.yankee("measurement.sgtm.no_proxy.client", true);
        delta = jVar.yankee("measurement.sgtm.no_proxy.client2", false);
        echo = jVar.yankee("measurement.sgtm.no_proxy.service", false);
        jVar.yankee("measurement.sgtm.preview_mode_enabled", true);
        jVar.yankee("measurement.sgtm.rollout_percentage_fix", true);
        jVar.yankee("measurement.sgtm.service", true);
        foxtrot = jVar.yankee("measurement.sgtm.service.batching_on_backgrounded", false);
        golf = jVar.yankee("measurement.sgtm.upload_queue", true);
        hotel = jVar.yankee("measurement.sgtm.upload_on_uninstall", true);
        jVar.victor(0L, "measurement.id.sgtm");
        jVar.victor(0L, "measurement.id.sgtm_noproxy");
    }
}
