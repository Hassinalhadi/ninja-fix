package I0;

/* loaded from: classes3.dex */
public final class f implements g {
    public final int alpha;
    public final int bravo;

    public f(int i4, int i5) {
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
        int i4 = 0;
        int i5 = 0;
        int i10 = 0;
        while (true) {
            if (i5 < this.alpha) {
                int i11 = i10 + 1;
                int i12 = iVar.purple;
                if (i12 > i11) {
                    char bravo = iVar.bravo((i12 - i11) - 1);
                    char bravo2 = iVar.bravo(iVar.purple - i11);
                    if (Character.isHighSurrogate(bravo) && Character.isLowSurrogate(bravo2)) {
                        i10 += 2;
                    } else {
                        i10 = i11;
                    }
                    i5++;
                } else {
                    i10 = i12;
                    break;
                }
            } else {
                break;
            }
        }
        int i13 = 0;
        while (true) {
            if (i4 >= this.bravo) {
                break;
            }
            int i14 = i13 + 1;
            int i15 = iVar.red + i14;
            F0.e eVar = (F0.e) iVar.white;
            if (i15 < eVar.kilo()) {
                char bravo3 = iVar.bravo((iVar.red + i14) - 1);
                char bravo4 = iVar.bravo(iVar.red + i14);
                if (Character.isHighSurrogate(bravo3) && Character.isLowSurrogate(bravo4)) {
                    i13 += 2;
                } else {
                    i13 = i14;
                }
                i4++;
            } else {
                i13 = eVar.kilo() - iVar.red;
                break;
            }
        }
        int i16 = iVar.red;
        iVar.alpha(i16, i13 + i16);
        int i17 = iVar.purple;
        iVar.alpha(i17 - i10, i17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.alpha == fVar.alpha && this.bravo == fVar.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.alpha * 31) + this.bravo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.alpha);
        sb2.append(", lengthAfterCursor=");
        return Q0.c.quebec(sb2, this.bravo, ')');
    }
}
