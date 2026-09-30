package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1327h3 implements InterfaceC1322g3 {
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
        jVar.yankee("measurement.rb.attribution.ad_campaign_info", true);
        jVar.yankee("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        alpha = jVar.yankee("measurement.rb.attribution.client2", true);
        jVar.yankee("measurement.rb.attribution.dma_fix", true);
        bravo = jVar.yankee("measurement.rb.attribution.followup1.service", false);
        jVar.yankee("measurement.rb.attribution.client.get_trigger_uris_async", true);
        charlie = jVar.yankee("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        jVar.yankee("measurement.rb.attribution.index_out_of_bounds_fix", true);
        delta = jVar.yankee("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        echo = jVar.yankee("measurement.rb.attribution.retry_disposition", false);
        foxtrot = jVar.yankee("measurement.rb.attribution.service", true);
        golf = jVar.yankee("measurement.rb.attribution.enable_trigger_redaction", true);
        hotel = jVar.yankee("measurement.rb.attribution.uuid_generation", true);
        jVar.victor(0L, "measurement.id.rb.attribution.retry_disposition");
        jVar.yankee("measurement.rb.attribution.improved_retry", true);
    }
}
