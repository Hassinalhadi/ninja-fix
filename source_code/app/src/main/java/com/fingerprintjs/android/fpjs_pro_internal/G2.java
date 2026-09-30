package com.fingerprintjs.android.fpjs_pro_internal;

/* loaded from: classes3.dex */
public final class G2 {
    public static int oscar;
    public static int papa;
    public final boolean alpha;
    public final long bravo;
    public final int charlie;
    public final int delta;
    public final boolean echo;
    public final long foxtrot;
    public final int golf;
    public final int hotel;
    public final boolean india;
    public final boolean juliet;
    public final long kilo;
    public final int lima;
    public final boolean mike;
    public final boolean november;

    public G2(boolean z2, long j5, int i4, int i5, boolean z10, long j6, int i10, int i11, boolean z11, boolean z12, long j7, int i12, boolean z13, boolean z14) {
        this.alpha = z2;
        this.bravo = j5;
        this.charlie = i4;
        this.delta = i5;
        this.echo = z10;
        this.foxtrot = j6;
        this.golf = i10;
        this.hotel = i11;
        this.india = z11;
        this.juliet = z12;
        this.kilo = j7;
        this.lima = i12;
        this.mike = z13;
        this.november = z14;
    }

    public static int alpha() {
        int i4 = oscar;
        int i5 = i4 % 6354475;
        oscar = i4 + 1;
        if (i5 != 0) {
            return papa;
        }
        int i10 = (int) Runtime.getRuntime().totalMemory();
        papa = i10;
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2)) {
            return false;
        }
        G2 g2 = (G2) obj;
        if (this.alpha == g2.alpha && this.bravo == g2.bravo && this.charlie == g2.charlie && this.delta == g2.delta && this.echo == g2.echo && this.foxtrot == g2.foxtrot && this.golf == g2.golf && this.hotel == g2.hotel && this.india == g2.india && this.juliet == g2.juliet && this.kilo == g2.kilo && this.lima == g2.lima && this.mike == g2.mike && this.november == g2.november) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13 = 1237;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        long j5 = this.bravo;
        int i14 = ((((((i4 * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.charlie) * 31) + this.delta) * 31;
        if (this.echo) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i15 = (i14 + i5) * 31;
        long j6 = this.foxtrot;
        int i16 = (((((i15 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.golf) * 31) + this.hotel) * 31;
        if (this.india) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i17 = (i16 + i10) * 31;
        if (this.juliet) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i18 = (i17 + i11) * 31;
        long j7 = this.kilo;
        int i19 = (((i18 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.lima) * 31;
        if (this.mike) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i20 = (i19 + i12) * 31;
        if (this.november) {
            i13 = 1231;
        }
        return i20 + i13;
    }

    public final String toString() {
        return "";
    }
}
