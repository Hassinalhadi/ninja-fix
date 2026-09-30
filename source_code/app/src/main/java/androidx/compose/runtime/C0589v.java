package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.runtime.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0589v {
    public final InterfaceC0586s alpha;

    public C0589v(InterfaceC0586s interfaceC0586s) {
        this.alpha = interfaceC0586s;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0589v) {
            if (Intrinsics.areEqual(this.alpha, ((C0589v) obj).alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode() * 31;
    }
}
