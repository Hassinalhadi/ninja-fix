package androidx.compose.runtime;

import java.util.ArrayList;

/* renamed from: androidx.compose.runtime.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0573f0 {
    public final C0575g0 alpha;
    public final int[] bravo;
    public final int charlie;
    public Object[] delta;
    public final int echo;
    public boolean foxtrot;
    public int golf;
    public int hotel;
    public int india;
    public final al juliet;
    public int kilo;
    public int lima;
    public int mike;
    public boolean november;

    public C0573f0(C0575g0 c0575g0) {
        this.alpha = c0575g0;
        this.bravo = c0575g0.alpha;
        int i4 = c0575g0.purple;
        this.charlie = i4;
        this.delta = c0575g0.red;
        this.echo = c0575g0.silver;
        this.hotel = i4;
        this.india = -1;
        this.juliet = new al();
    }

    public final C0562a alpha(int i4) {
        ArrayList arrayList = this.alpha.f3004b;
        int echo = i0.echo(arrayList, i4, this.charlie);
        if (echo < 0) {
            C0562a c0562a = new C0562a(i4);
            arrayList.add(-(echo + 1), c0562a);
            return c0562a;
        }
        return (C0562a) arrayList.get(echo);
    }

    public final Object bravo(int i4, int[] iArr) {
        int bitCount;
        int i5 = i4 * 5;
        int i10 = iArr[i5 + 1];
        if ((268435456 & i10) != 0) {
            Object[] objArr = this.delta;
            if (i5 >= iArr.length) {
                bitCount = iArr.length;
            } else {
                bitCount = iArr[i5 + 4] + Integer.bitCount(i10 >> 29);
            }
            return objArr[bitCount];
        }
        return C0580l.alpha;
    }

    public final void charlie() {
        this.foxtrot = true;
        C0575g0 c0575g0 = this.alpha;
        c0575g0.getClass();
        if (this.alpha != c0575g0 || c0575g0.teal <= 0) {
            r.charlie("Unexpected reader close()");
        }
        c0575g0.teal--;
        this.delta = new Object[0];
    }

    public final boolean delta(int i4) {
        if ((this.bravo[(i4 * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public final void echo() {
        boolean z2;
        int alpha;
        int i4;
        if (this.kilo == 0) {
            if (this.golf == this.hotel) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                r.charlie("endGroup() not called at the end of a group");
            }
            int i5 = (this.india * 5) + 2;
            int[] iArr = this.bravo;
            int i10 = iArr[i5];
            this.india = i10;
            int i11 = this.charlie;
            if (i10 < 0) {
                alpha = i11;
            } else {
                alpha = i0.alpha(i10, iArr) + i10;
            }
            this.hotel = alpha;
            int bravo = this.juliet.bravo();
            if (bravo < 0) {
                this.lima = 0;
                this.mike = 0;
                return;
            }
            this.lima = bravo;
            if (i10 >= i11 - 1) {
                i4 = this.echo;
            } else {
                i4 = iArr[((i10 + 1) * 5) + 4];
            }
            this.mike = i4;
        }
    }

    public final Object foxtrot() {
        int i4 = this.golf;
        if (i4 < this.hotel) {
            return bravo(i4, this.bravo);
        }
        return 0;
    }

    public final int golf() {
        int i4 = this.golf;
        if (i4 < this.hotel) {
            return this.bravo[i4 * 5];
        }
        return 0;
    }

    public final Object hotel(int i4, int i5) {
        int i10;
        int[] iArr = this.bravo;
        int charlie = i0.charlie(i4, iArr);
        int i11 = i4 + 1;
        if (i11 < this.charlie) {
            i10 = iArr[(i11 * 5) + 4];
        } else {
            i10 = this.echo;
        }
        int i12 = charlie + i5;
        if (i12 < i10) {
            return this.delta[i12];
        }
        return C0580l.alpha;
    }

    public final int india(int i4) {
        return this.bravo[i4 * 5];
    }

    public final boolean juliet(int i4) {
        if ((this.bravo[(i4 * 5) + 1] & 134217728) != 0) {
            return true;
        }
        return false;
    }

    public final boolean kilo(int i4) {
        if ((this.bravo[(i4 * 5) + 1] & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public final boolean lima(int i4) {
        if ((this.bravo[(i4 * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public final Object mike() {
        int i4;
        if (this.kilo <= 0 && (i4 = this.lima) < this.mike) {
            this.november = true;
            Object[] objArr = this.delta;
            this.lima = i4 + 1;
            return objArr[i4];
        }
        this.november = false;
        return C0580l.alpha;
    }

    public final Object november(int i4) {
        int i5 = i4 * 5;
        int[] iArr = this.bravo;
        int i10 = iArr[i5 + 1] & 1073741824;
        if (i10 != 0) {
            if (i10 != 0) {
                return this.delta[iArr[i5 + 4]];
            }
            return C0580l.alpha;
        }
        return null;
    }

    public final int oscar(int i4) {
        return this.bravo[(i4 * 5) + 1] & 67108863;
    }

    public final Object papa(int i4, int[] iArr) {
        int i5 = i4 * 5;
        int i10 = iArr[i5 + 1];
        if ((536870912 & i10) != 0) {
            return this.delta[Integer.bitCount(i10 >> 30) + iArr[i5 + 4]];
        }
        return null;
    }

    public final int quebec(int i4) {
        return this.bravo[(i4 * 5) + 2];
    }

    public final void romeo(int i4) {
        boolean z2;
        int i5;
        if (this.kilo == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            r.charlie("Cannot reposition while in an empty region");
        }
        this.golf = i4;
        int[] iArr = this.bravo;
        int i10 = this.charlie;
        if (i4 < i10) {
            i5 = iArr[(i4 * 5) + 2];
        } else {
            i5 = -1;
        }
        if (i5 != this.india) {
            this.india = i5;
            if (i5 < 0) {
                this.hotel = i10;
            } else {
                this.hotel = i0.alpha(i5, iArr) + i5;
            }
            this.lima = 0;
            this.mike = 0;
        }
    }

    public final int sierra() {
        boolean z2;
        int i4 = 1;
        if (this.kilo == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            r.charlie("Cannot skip while in an empty region");
        }
        int i5 = this.golf;
        int[] iArr = this.bravo;
        if ((iArr[(i5 * 5) + 1] & 1073741824) == 0) {
            i4 = iArr[(i5 * 5) + 1] & 67108863;
        }
        this.golf = i0.alpha(i5, iArr) + i5;
        return i4;
    }

    public final void tango() {
        boolean z2;
        if (this.kilo == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            r.charlie("Cannot skip the enclosing group while in an empty region");
        }
        this.golf = this.hotel;
        this.lima = 0;
        this.mike = 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.golf);
        sb2.append(", key=");
        sb2.append(golf());
        sb2.append(", parent=");
        sb2.append(this.india);
        sb2.append(", end=");
        return Q0.c.quebec(sb2, this.hotel, ')');
    }

    public final void uniform() {
        boolean z2;
        int i4;
        if (this.kilo <= 0) {
            int i5 = this.india;
            int i10 = this.golf;
            int[] iArr = this.bravo;
            if (iArr[(i10 * 5) + 2] == i5) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                J.alpha("Invalid slot table detected");
            }
            int i11 = this.lima;
            int i12 = this.mike;
            al alVar = this.juliet;
            if (i11 == 0 && i12 == 0) {
                alVar.charlie(-1);
            } else {
                alVar.charlie(i11);
            }
            this.india = i10;
            this.hotel = i0.alpha(i10, iArr) + i10;
            int i13 = i10 + 1;
            this.golf = i13;
            this.lima = i0.charlie(i10, iArr);
            if (i10 >= this.charlie - 1) {
                i4 = this.echo;
            } else {
                i4 = iArr[(i13 * 5) + 4];
            }
            this.mike = i4;
        }
    }
}
