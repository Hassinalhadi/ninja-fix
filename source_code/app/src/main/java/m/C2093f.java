package m;

import Q0.n;
import a0.ai;
import a0.aj;
import a0.ao;
import kotlin.jvm.internal.Intrinsics;
import t6.I2;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2093f extends AbstractC2088a {
    @Override // m.AbstractC2088a
    public final AbstractC2088a bravo(InterfaceC2089b interfaceC2089b, InterfaceC2089b interfaceC2089b2, InterfaceC2089b interfaceC2089b3, InterfaceC2089b interfaceC2089b4) {
        return new AbstractC2088a(interfaceC2089b, interfaceC2089b2, interfaceC2089b3, interfaceC2089b4);
    }

    @Override // m.AbstractC2088a
    public final ao delta(long j5, float f5, float f10, float f11, float f12, n nVar) {
        float f13;
        float f14;
        float f15;
        float f16;
        if (f5 + f10 + f11 + f12 == 0.0f) {
            return new ai(I2.alpha(0L, j5));
        }
        Z.c alpha = I2.alpha(0L, j5);
        n nVar2 = n.alpha;
        if (nVar == nVar2) {
            f13 = f5;
        } else {
            f13 = f10;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L);
        if (nVar == nVar2) {
            f14 = f10;
        } else {
            f14 = f5;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
        if (nVar == nVar2) {
            f15 = f11;
        } else {
            f15 = f12;
        }
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L);
        if (nVar == nVar2) {
            f16 = f12;
        } else {
            f16 = f11;
        }
        return new aj(new Z.d(alpha.alpha, alpha.bravo, alpha.charlie, alpha.delta, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(f16) << 32) | (Float.floatToRawIntBits(f16) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2093f)) {
            return false;
        }
        C2093f c2093f = (C2093f) obj;
        if (!Intrinsics.areEqual(this.alpha, c2093f.alpha)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.bravo, c2093f.bravo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.charlie, c2093f.charlie)) {
            return false;
        }
        if (Intrinsics.areEqual(this.delta, c2093f.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.delta.hashCode() + ((this.charlie.hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.alpha + ", topEnd = " + this.bravo + ", bottomEnd = " + this.charlie + ", bottomStart = " + this.delta + ')';
    }
}
