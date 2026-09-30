package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class G2 implements F2 {
    public static final C1320g1 alpha;
    public static final C1320g1 bravo;
    public static final C1320g1 charlie;

    static {
        Pf.j jVar = new Pf.j(AbstractC1305d1.alpha(), true, true);
        jVar.yankee("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        alpha = jVar.yankee("measurement.audience.refresh_event_count_filters_timestamp", false);
        bravo = jVar.yankee("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        charlie = jVar.yankee("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
