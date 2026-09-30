package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class t extends w {
    public final /* synthetic */ Method bravo;
    public final /* synthetic */ int charlie;

    public t(Method method, int i4) {
        this.bravo = method;
        this.charlie = i4;
    }

    @Override // com.google.gson.internal.w
    public final Object alpha(Class cls) {
        String alpha = b.alpha(cls);
        if (alpha == null) {
            return this.bravo.invoke(null, cls, Integer.valueOf(this.charlie));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(alpha));
    }
}
