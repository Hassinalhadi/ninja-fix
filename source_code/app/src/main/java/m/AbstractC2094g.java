package m;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2094g {
    public static final C2093f alpha = alpha(50);

    /* JADX WARN: Type inference failed for: r1v2, types: [m.a, m.f] */
    public static final C2093f alpha(int i4) {
        C2092e c2092e = new C2092e(i4);
        return new AbstractC2088a(c2092e, c2092e, c2092e, c2092e);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [m.a, m.f] */
    public static final C2093f bravo(float f5) {
        C2091d c2091d = new C2091d(f5);
        return new AbstractC2088a(c2091d, c2091d, c2091d, c2091d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m.a, m.f] */
    public static final C2093f charlie(float f5, float f10, float f11, float f12) {
        return new AbstractC2088a(new C2091d(f5), new C2091d(f10), new C2091d(f11), new C2091d(f12));
    }

    public static C2093f delta(float f5, float f10) {
        return charlie(f5, f10, 0, 0);
    }
}
