package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import q0.InterfaceC2380P;
import t0.AbstractC2911e0;

/* renamed from: androidx.compose.foundation.layout.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0552s implements InterfaceC0550p {
    public final InterfaceC2380P alpha;
    public final long bravo;

    public C0552s(InterfaceC2380P interfaceC2380P, long j5) {
        this.alpha = interfaceC2380P;
        this.bravo = j5;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0550p
    public final T.s alpha(T.s sVar, T.k kVar) {
        return sVar.then(new BoxChildDataElement(kVar, false, AbstractC2911e0.alpha));
    }

    public final float bravo() {
        long j5 = this.bravo;
        if (Q0.a.charlie(j5)) {
            return this.alpha.crimson(Q0.a.golf(j5));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final float charlie() {
        long j5 = this.bravo;
        if (Q0.a.delta(j5)) {
            return this.alpha.crimson(Q0.a.hotel(j5));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0552s)) {
            return false;
        }
        C0552s c0552s = (C0552s) obj;
        return Intrinsics.areEqual(this.alpha, c0552s.alpha) && Q0.a.bravo(this.bravo, c0552s.bravo);
    }

    public final int hashCode() {
        int hashCode = this.alpha.hashCode() * 31;
        long j5 = this.bravo;
        return ((int) (j5 ^ (j5 >>> 32))) + hashCode;
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.alpha + ", constraints=" + ((Object) Q0.a.kilo(this.bravo)) + ')';
    }
}
