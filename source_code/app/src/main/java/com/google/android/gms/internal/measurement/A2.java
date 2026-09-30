package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class A2 implements InterfaceC1401z2 {
    public static final C1320g1 alpha;
    public static final C1320g1 bravo;

    static {
        Pf.j jVar = new Pf.j(AbstractC1305d1.alpha(), true, true);
        alpha = jVar.yankee("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        bravo = jVar.yankee("measurement.set_default_event_parameters_propagate_clear.service", false);
        jVar.victor(0L, "measurement.id.set_default_event_parameters_propagate_clear.experiment_id");
    }
}
