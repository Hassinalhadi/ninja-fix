package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0604k {
    public static volatile C0604k alpha;
    public static final C0604k bravo;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.k, java.lang.Object] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        bravo = obj;
    }

    public static C0604k alpha() {
        C0604k c0604k;
        ap apVar = ap.charlie;
        C0604k c0604k2 = alpha;
        if (c0604k2 == null) {
            synchronized (C0604k.class) {
                try {
                    c0604k = alpha;
                    if (c0604k == null) {
                        Class cls = AbstractC0603j.alpha;
                        C0604k c0604k3 = null;
                        if (cls != null) {
                            try {
                                c0604k3 = (C0604k) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0604k3 != null) {
                            c0604k = c0604k3;
                        } else {
                            c0604k = bravo;
                        }
                        alpha = c0604k;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0604k;
        }
        return c0604k2;
    }
}
