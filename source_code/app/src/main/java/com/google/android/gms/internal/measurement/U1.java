package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class U1 {
    public static final U1 charlie = new U1();
    public final ConcurrentHashMap bravo = new ConcurrentHashMap();
    public final J1 alpha = new J1(0);

    public final X1 alpha(Class cls) {
        C1384v1 c1384v1;
        X1 uniform;
        Charset charset = E1.alpha;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.bravo;
            X1 x12 = (X1) concurrentHashMap.get(cls);
            if (x12 == null) {
                J1 j12 = this.alpha;
                j12.getClass();
                C1384v1 c1384v12 = Y1.alpha;
                AbstractC1392x1.class.isAssignableFrom(cls);
                W1 alpha = ((J1) j12.alpha).alpha(cls);
                if ((alpha.delta & 2) == 2) {
                    C1384v1 c1384v13 = Y1.alpha;
                    C1384v1 c1384v14 = AbstractC1372s1.alpha;
                    uniform = new R1(c1384v13, alpha.alpha);
                } else {
                    int i4 = S1.alpha;
                    int i5 = H1.alpha;
                    C1384v1 c1384v15 = Y1.alpha;
                    if (alpha.alpha() - 1 != 1) {
                        c1384v1 = AbstractC1372s1.alpha;
                    } else {
                        c1384v1 = null;
                    }
                    int i10 = M1.alpha;
                    uniform = Q1.uniform(alpha, c1384v15, c1384v1);
                }
                X1 x13 = (X1) concurrentHashMap.putIfAbsent(cls, uniform);
                if (x13 != null) {
                    return x13;
                }
                return uniform;
            }
            return x12;
        }
        throw new NullPointerException("messageType");
    }
}
