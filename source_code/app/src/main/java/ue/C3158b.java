package ue;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;

/* renamed from: ue.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3158b {
    public final Class alpha;
    public final He.b bravo;

    public C3158b(Class cls, He.b bVar) {
        this.alpha = cls;
        this.bravo = bVar;
    }

    public final String alpha() {
        return r.november(this.alpha.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3158b) {
            if (Intrinsics.areEqual(this.alpha, ((C3158b) obj).alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return C3158b.class.getName() + ": " + this.alpha;
    }
}
