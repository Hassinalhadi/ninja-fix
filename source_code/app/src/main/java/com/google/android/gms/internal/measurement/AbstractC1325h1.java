package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1325h1 {
    public static final bv.e alpha = new bv.aw(0);

    public static synchronized void alpha() {
        synchronized (AbstractC1325h1.class) {
            bv.e eVar = alpha;
            Iterator it = ((bv.d) eVar.values()).iterator();
            if (!it.hasNext()) {
                eVar.clear();
            } else {
                ((AbstractC1325h1) it.next()).getClass();
                throw null;
            }
        }
    }
}
