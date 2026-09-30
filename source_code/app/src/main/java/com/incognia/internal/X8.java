package com.incognia.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class X8 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f9893b = new AtomicReference();

    public static eu W() {
        eu euVar = (eu) f9893b.get();
        if (euVar != null) {
            return euVar;
        }
        throw new NullPointerException("No Dependency Container found");
    }

    public static zC b() {
        return ((Q6I) W()).f9462E;
    }
}
