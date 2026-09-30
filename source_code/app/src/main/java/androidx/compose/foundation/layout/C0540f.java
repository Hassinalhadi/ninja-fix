package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.foundation.layout.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0540f implements InterfaceC0539e, InterfaceC0541g {
    public final float alpha;
    public final boolean bravo;
    public final Xd.l charlie;
    public final float delta;

    public C0540f(float f5, boolean z2, Xd.l lVar) {
        this.alpha = f5;
        this.bravo = z2;
        this.charlie = lVar;
        this.delta = f5;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0539e, androidx.compose.foundation.layout.InterfaceC0541g
    public final float alpha() {
        return this.delta;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0541g
    public final void bravo(Q0.d dVar, int i4, int[] iArr, int[] iArr2) {
        charlie(dVar, i4, iArr, Q0.n.alpha, iArr2);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0539e
    public final void charlie(Q0.d dVar, int i4, int[] iArr, Q0.n nVar, int[] iArr2) {
        boolean z2;
        int i5;
        int i10;
        if (iArr.length != 0) {
            int ochre = dVar.ochre(this.alpha);
            if (this.bravo && nVar == Q0.n.purple) {
                z2 = true;
            } else {
                z2 = false;
            }
            C0537c c0537c = AbstractC0542h.alpha;
            if (!z2) {
                int length = iArr.length;
                int i11 = 0;
                i5 = 0;
                i10 = 0;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = iArr[i11];
                    int min = Math.min(i5, i4 - i13);
                    iArr2[i12] = min;
                    int min2 = Math.min(ochre, (i4 - min) - i13);
                    int i14 = iArr2[i12] + i13 + min2;
                    i11++;
                    i10 = min2;
                    i5 = i14;
                    i12++;
                }
            } else {
                int length2 = iArr.length - 1;
                i5 = 0;
                i10 = 0;
                while (-1 < length2) {
                    int i15 = iArr[length2];
                    int min3 = Math.min(i5, i4 - i15);
                    iArr2[length2] = min3;
                    int min4 = Math.min(ochre, (i4 - min3) - i15);
                    int i16 = iArr2[length2] + i15 + min4;
                    length2--;
                    i10 = min4;
                    i5 = i16;
                }
            }
            int i17 = i5 - i10;
            Xd.l lVar = this.charlie;
            if (i17 < i4) {
                int intValue = ((Number) lVar.invoke(Integer.valueOf(i4 - i17), nVar)).intValue();
                int length3 = iArr2.length;
                for (int i18 = 0; i18 < length3; i18++) {
                    iArr2[i18] = iArr2[i18] + intValue;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0540f)) {
            return false;
        }
        C0540f c0540f = (C0540f) obj;
        return Q0.g.alpha(this.alpha, c0540f.alpha) && this.bravo == c0540f.bravo && Intrinsics.areEqual(this.charlie, c0540f.charlie);
    }

    public final int hashCode() {
        int i4;
        int floatToIntBits = Float.floatToIntBits(this.alpha) * 31;
        if (this.bravo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return this.charlie.hashCode() + ((floatToIntBits + i4) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.bravo) {
            str = "";
        } else {
            str = "Absolute";
        }
        sb2.append(str);
        sb2.append("Arrangement#spacedAligned(");
        sb2.append((Object) Q0.g.bravo(this.alpha));
        sb2.append(", ");
        sb2.append(this.charlie);
        sb2.append(')');
        return sb2.toString();
    }
}
