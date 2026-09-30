package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class H {
    public static final H charlie = new H();
    public final ConcurrentHashMap bravo = new ConcurrentHashMap();
    public final ax alpha = new ax(0);

    public final M alpha(Class cls) {
        ah ahVar;
        M victor;
        Charset charset = at.alpha;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.bravo;
            M m4 = (M) concurrentHashMap.get(cls);
            if (m4 == null) {
                ax axVar = this.alpha;
                axVar.getClass();
                ah ahVar2 = N.alpha;
                am.class.isAssignableFrom(cls);
                J alpha = ((ax) axVar.alpha).alpha(cls);
                if ((alpha.delta & 2) == 2) {
                    ah ahVar3 = N.alpha;
                    ah ahVar4 = ad.alpha;
                    victor = new F(ahVar3, alpha.alpha);
                } else {
                    int i4 = G.alpha;
                    int i5 = aw.alpha;
                    ah ahVar5 = N.alpha;
                    if (alpha.alpha() - 1 != 1) {
                        ahVar = ad.alpha;
                    } else {
                        ahVar = null;
                    }
                    int i10 = az.alpha;
                    victor = E.victor(alpha, ahVar5, ahVar);
                }
                M m5 = (M) concurrentHashMap.putIfAbsent(cls, victor);
                if (m5 == null) {
                    return victor;
                }
                return m5;
            }
            return m4;
        }
        throw new NullPointerException("messageType");
    }
}
