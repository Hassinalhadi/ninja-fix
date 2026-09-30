package kotlin.jvm.internal;

import java.util.Collections;
import je.W;

/* loaded from: classes2.dex */
public abstract class u {
    public static final v alpha;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.v] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    static {
        ?? r02 = 0;
        try {
            r02 = (v) W.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r02 == 0) {
            r02 = new Object();
        }
        alpha = r02;
    }

    public static ge.w alpha(Class cls) {
        v vVar = alpha;
        return vVar.lima(vVar.bravo(cls), Collections.EMPTY_LIST, false);
    }

    public static ge.w bravo(Class cls, ge.z zVar) {
        v vVar = alpha;
        return vVar.lima(vVar.bravo(cls), Collections.singletonList(zVar), false);
    }
}
