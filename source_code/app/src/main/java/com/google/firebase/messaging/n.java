package com.google.firebase.messaging;

import com.google.android.gms.internal.measurement.C1298c;
import d8.C1592a;
import e8.AbstractC1639g;
import java.util.HashMap;
import p8.C2293d;
import p8.C2294e;

/* loaded from: classes2.dex */
public abstract class n {
    public static final C1298c alpha;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C1592a c1592a = AbstractC1639g.alpha;
        hashMap.put(n.class, c.alpha);
        hashMap2.remove(n.class);
        hashMap.put(C2294e.class, b.alpha);
        hashMap2.remove(C2294e.class);
        hashMap.put(C2293d.class, a.alpha);
        hashMap2.remove(C2293d.class);
        alpha = new C1298c(new HashMap(hashMap), new HashMap(hashMap2), c1592a, 4);
    }
}
