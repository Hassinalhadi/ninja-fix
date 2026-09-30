package I0;

/* loaded from: classes3.dex */
public final class e implements g {
    public final int alpha;
    public final int bravo;

    public e(int i4, int i5) {
        boolean z2;
        this.alpha = i4;
        this.bravo = i5;
        if (i4 >= 0 && i5 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            J0.a.alpha("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i4 + " and " + i5 + " respectively.");
        }
    }

    @Override // I0.g
    public final void alpha(i iVar) {
        int i4 = iVar.red;
        int i5 = this.bravo;
        int i10 = i4 + i5;
        int i11 = (i4 ^ i10) & (i5 ^ i10);
        F0.e eVar = (F0.e) iVar.white;
        if (i11 < 0) {
            i10 = eVar.kilo();
        }
        iVar.alpha(iVar.red, Math.min(i10, eVar.kilo()));
        int i12 = iVar.purple;
        int i13 = this.alpha;
        int i14 = i12 - i13;
        if (((i12 ^ i14) & (i13 ^ i12)) < 0) {
            i14 = 0;
        }
        iVar.alpha(Math.max(0, i14), iVar.purple);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.alpha == eVar.alpha && this.bravo == eVar.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.alpha * 31) + this.bravo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.alpha);
        sb2.append(", lengthAfterCursor=");
        return Q0.c.quebec(sb2, this.bravo, ')');
    }
}
