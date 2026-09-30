package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.runtime.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0571e0 {
    public final InterfaceC0581m alpha;

    public final boolean equals(Object obj) {
        if (obj instanceof C0571e0) {
            if (!Intrinsics.areEqual(this.alpha, ((C0571e0) obj).alpha)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.alpha + ')';
    }
}
