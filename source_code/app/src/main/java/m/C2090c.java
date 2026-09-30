package m;

import Q0.n;
import a0.AbstractC0358l;
import a0.C0354h;
import a0.ah;
import a0.ai;
import a0.ao;
import android.graphics.Path;
import kotlin.jvm.internal.Intrinsics;
import t6.I2;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2090c extends AbstractC2088a {
    @Override // m.AbstractC2088a
    public final AbstractC2088a bravo(InterfaceC2089b interfaceC2089b, InterfaceC2089b interfaceC2089b2, InterfaceC2089b interfaceC2089b3, InterfaceC2089b interfaceC2089b4) {
        return new AbstractC2088a(interfaceC2089b, interfaceC2089b2, interfaceC2089b3, interfaceC2089b4);
    }

    @Override // m.AbstractC2088a
    public final ao delta(long j5, float f5, float f10, float f11, float f12, n nVar) {
        float f13;
        float f14;
        if (f5 + f10 + f12 + f11 == 0.0f) {
            return new ai(I2.alpha(0L, j5));
        }
        C0354h alpha = AbstractC0358l.alpha();
        n nVar2 = n.alpha;
        if (nVar == nVar2) {
            f13 = f5;
        } else {
            f13 = f10;
        }
        Path path = alpha.alpha;
        path.moveTo(0.0f, f13);
        alpha.bravo(f13, 0.0f);
        if (nVar == nVar2) {
            f5 = f10;
        }
        int i4 = (int) (j5 >> 32);
        alpha.bravo(Float.intBitsToFloat(i4) - f5, 0.0f);
        alpha.bravo(Float.intBitsToFloat(i4), f5);
        if (nVar == nVar2) {
            f14 = f11;
        } else {
            f14 = f12;
        }
        int i5 = (int) (j5 & 4294967295L);
        alpha.bravo(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5) - f14);
        alpha.bravo(Float.intBitsToFloat(i4) - f14, Float.intBitsToFloat(i5));
        if (nVar == nVar2) {
            f11 = f12;
        }
        alpha.bravo(f11, Float.intBitsToFloat(i5));
        alpha.bravo(0.0f, Float.intBitsToFloat(i5) - f11);
        path.close();
        return new ah(alpha);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2090c)) {
            return false;
        }
        C2090c c2090c = (C2090c) obj;
        if (!Intrinsics.areEqual(this.alpha, c2090c.alpha)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.bravo, c2090c.bravo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.charlie, c2090c.charlie)) {
            return false;
        }
        if (Intrinsics.areEqual(this.delta, c2090c.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.delta.hashCode() + ((this.charlie.hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CutCornerShape(topStart = " + this.alpha + ", topEnd = " + this.bravo + ", bottomEnd = " + this.charlie + ", bottomStart = " + this.delta + ')';
    }
}
