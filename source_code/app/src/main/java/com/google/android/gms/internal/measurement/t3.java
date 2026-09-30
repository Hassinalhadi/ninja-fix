package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class t3 implements s3 {
    public static final C1320g1 alpha;

    static {
        Pf.j jVar = new Pf.j(AbstractC1305d1.alpha(), true, true);
        jVar.yankee("measurement.collection.enable_session_stitching_token.client.dev", true);
        alpha = jVar.yankee("measurement.session_stitching_token_enabled", false);
        jVar.yankee("measurement.link_sst_to_sid", true);
    }
}
