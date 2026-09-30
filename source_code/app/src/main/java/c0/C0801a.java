package c0;

import Q0.n;
import a0.InterfaceC0364r;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0801a {
    public Q0.d alpha;
    public n bravo;
    public InterfaceC0364r charlie;
    public long delta;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0801a) {
                C0801a c0801a = (C0801a) obj;
                if (!Intrinsics.areEqual(this.alpha, c0801a.alpha) || this.bravo != c0801a.bravo || !Intrinsics.areEqual(this.charlie, c0801a.charlie) || !Z.e.alpha(this.delta, c0801a.delta)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.charlie.hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31)) * 31;
        long j5 = this.delta;
        return ((int) (j5 ^ (j5 >>> 32))) + hashCode;
    }

    public final String toString() {
        return "DrawParams(density=" + this.alpha + ", layoutDirection=" + this.bravo + ", canvas=" + this.charlie + ", size=" + ((Object) Z.e.foxtrot(this.delta)) + ')';
    }
}
