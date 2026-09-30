package androidx.recyclerview.widget;

/* loaded from: classes3.dex */
public final class q0 {
    public int alpha;
    public int bravo;
    public int charlie;
    public int delta;
    public int echo;

    public final boolean alpha() {
        int i4;
        int i5;
        int i10;
        int i11 = this.alpha;
        int i12 = 2;
        if ((i11 & 7) != 0) {
            int i13 = this.delta;
            int i14 = this.bravo;
            if (i13 > i14) {
                i10 = 1;
            } else if (i13 == i14) {
                i10 = 2;
            } else {
                i10 = 4;
            }
            if ((i10 & i11) == 0) {
                return false;
            }
        }
        if ((i11 & 112) != 0) {
            int i15 = this.delta;
            int i16 = this.charlie;
            if (i15 > i16) {
                i5 = 1;
            } else if (i15 == i16) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            if (((i5 << 4) & i11) == 0) {
                return false;
            }
        }
        if ((i11 & 1792) != 0) {
            int i17 = this.echo;
            int i18 = this.bravo;
            if (i17 > i18) {
                i4 = 1;
            } else if (i17 == i18) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            if (((i4 << 8) & i11) == 0) {
                return false;
            }
        }
        if ((i11 & 28672) != 0) {
            int i19 = this.echo;
            int i20 = this.charlie;
            if (i19 > i20) {
                i12 = 1;
            } else if (i19 != i20) {
                i12 = 4;
            }
            if ((i11 & (i12 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
