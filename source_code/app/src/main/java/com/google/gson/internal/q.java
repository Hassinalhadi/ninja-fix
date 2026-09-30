package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;

/* loaded from: classes2.dex */
public abstract class q {
    public static final q alpha;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001f  */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.gson.internal.q] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    static {
        ?? r12;
        if (g.alpha >= 9) {
            try {
                r12 = new o(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
            if (r12 == 0) {
                r12 = new Object();
            }
            alpha = r12;
        }
        r12 = 0;
        if (r12 == 0) {
        }
        alpha = r12;
    }

    public abstract boolean alpha(Object obj, AccessibleObject accessibleObject);
}
