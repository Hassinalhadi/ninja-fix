package kotlin.time;

/* loaded from: classes2.dex */
public abstract class f {
    public static final a alpha;

    static {
        boolean z2;
        a fVar;
        Integer num = Td.a.alpha;
        if (num != null && num.intValue() < 26) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            fVar = new com.google.mlkit.common.sdkinternal.b(10);
        } else {
            fVar = new g7.f(10);
        }
        alpha = fVar;
    }
}
