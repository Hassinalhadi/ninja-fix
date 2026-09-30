package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0635e {
    public final int alpha;
    public final Method bravo;

    public C0635e(Method method, int i4) {
        this.alpha = i4;
        this.bravo = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0635e)) {
            return false;
        }
        C0635e c0635e = (C0635e) obj;
        if (this.alpha == c0635e.alpha && this.bravo.getName().equals(c0635e.bravo.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.getName().hashCode() + (this.alpha * 31);
    }
}
