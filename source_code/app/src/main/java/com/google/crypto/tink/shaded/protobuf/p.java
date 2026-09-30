package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class p {
    public static volatile p alpha;
    public static final p bravo;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.p, java.lang.Object] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        bravo = obj;
    }

    public static p alpha() {
        p pVar;
        p pVar2 = alpha;
        if (pVar2 == null) {
            synchronized (p.class) {
                try {
                    pVar = alpha;
                    if (pVar == null) {
                        Class cls = AbstractC1497o.alpha;
                        p pVar3 = null;
                        if (cls != null) {
                            try {
                                pVar3 = (p) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (pVar3 != null) {
                            pVar = pVar3;
                        } else {
                            pVar = bravo;
                        }
                        alpha = pVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return pVar;
        }
        return pVar2;
    }
}
