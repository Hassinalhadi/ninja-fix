package m6;

import com.google.android.gms.common.Feature;

/* renamed from: m6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2104e {
    public static final Feature alpha;
    public static final Feature[] bravo;
    public static final Feature charlie;
    public static final Feature[] delta;

    static {
        Feature feature = new Feature("CLIENT_TELEMETRY", 1L);
        alpha = feature;
        bravo = new Feature[]{feature};
        Feature feature2 = new Feature("moduleinstall", 7L);
        charlie = feature2;
        delta = new Feature[]{feature2};
    }
}
