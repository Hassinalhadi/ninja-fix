package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class s extends w {
    public final /* synthetic */ Method bravo;
    public final /* synthetic */ Object charlie;

    public s(Method method, Object obj) {
        this.bravo = method;
        this.charlie = obj;
    }

    @Override // com.google.gson.internal.w
    public final Object alpha(Class cls) {
        String alpha = b.alpha(cls);
        if (alpha == null) {
            return this.bravo.invoke(this.charlie, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(alpha));
    }
}
