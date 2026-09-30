package com.incognia.internal;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class DDS {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f8521b = new AtomicReference(f0.f10395b);

    /* renamed from: W, reason: collision with root package name */
    public static final CopyOnWriteArraySet f8520W = new CopyOnWriteArraySet();

    public static void b(ow owVar) {
        f8521b.set(owVar);
        Iterator it = f8520W.iterator();
        while (it.hasNext()) {
            ((fX) it.next()).b(owVar);
        }
    }
}
