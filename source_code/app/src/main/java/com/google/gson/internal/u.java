package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class u extends w {
    public final /* synthetic */ Method bravo;

    public u(Method method) {
        this.bravo = method;
    }

    @Override // com.google.gson.internal.w
    public final Object alpha(Class cls) {
        String alpha = b.alpha(cls);
        if (alpha == null) {
            return this.bravo.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(alpha));
    }
}
