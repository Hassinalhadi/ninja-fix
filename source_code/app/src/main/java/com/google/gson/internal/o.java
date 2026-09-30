package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class o extends q {
    public final /* synthetic */ Method bravo;

    public o(Method method) {
        this.bravo = method;
    }

    @Override // com.google.gson.internal.q
    public final boolean alpha(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.bravo.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}
