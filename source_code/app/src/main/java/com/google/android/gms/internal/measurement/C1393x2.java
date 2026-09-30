package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1393x2 implements InterfaceC1389w2 {
    public static final C1320g1 alpha;
    public static final C1320g1 bravo;
    public static final C1320g1 charlie;

    static {
        Pf.j jVar = new Pf.j(AbstractC1305d1.alpha(), true, true);
        jVar.yankee("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        jVar.yankee("measurement.set_default_event_parameters_with_backfill.service", true);
        jVar.victor(0L, "measurement.id.set_default_event_parameters.fix_service_request_ordering");
        alpha = jVar.yankee("measurement.set_default_event_parameters.fix_app_update_logging", true);
        bravo = jVar.yankee("measurement.set_default_event_parameters.fix_deferred_analytics_collection", true);
        charlie = jVar.yankee("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        jVar.yankee("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
