package n;

import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public abstract class P {
    public static final String alpha = kotlin.text.r.mike(10, "H");

    public static final long alpha(D0.an anVar, Q0.d dVar, H0.j jVar, String str, int i4) {
        D0.a alpha2 = D0.ae.alpha(str, anVar, Q0.b.bravo(0, 0, 15), dVar, jVar, CollectionsKt.emptyList(), i4, 64);
        return (at.oscar(alpha2.alpha.november()) << 32) | (at.oscar(alpha2.bravo()) & 4294967295L);
    }

    public static /* synthetic */ long bravo(D0.an anVar, Q0.d dVar, H0.j jVar) {
        return alpha(anVar, dVar, jVar, alpha, 1);
    }
}
