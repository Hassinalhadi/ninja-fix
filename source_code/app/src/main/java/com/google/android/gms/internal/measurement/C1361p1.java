package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1361p1 implements Iterable, Serializable {
    public static final C1361p1 red = new C1361p1(E1.bravo);
    public int alpha = 0;
    public final byte[] purple;

    static {
        int i4 = AbstractC1349m1.alpha;
    }

    public C1361p1(byte[] bArr) {
        bArr.getClass();
        this.purple = bArr;
    }

    public static int hotel(int i4, int i5, int i10) {
        int i11 = i5 - i4;
        if ((i4 | i5 | i11 | (i10 - i5)) < 0) {
            if (i4 >= 0) {
                if (i5 < i4) {
                    throw new IndexOutOfBoundsException(A0.z.juliet("Beginning index larger than ending index: ", i4, i5, ", "));
                }
                throw new IndexOutOfBoundsException(A0.z.juliet("End index: ", i5, i10, " >= "));
            }
            throw new IndexOutOfBoundsException(av.q.delta(i4, "Beginning index: ", " < 0"));
        }
        return i11;
    }

    public static C1361p1 india(byte[] bArr, int i4, int i5) {
        hotel(i4, i4 + i5, bArr.length);
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        return new C1361p1(bArr2);
    }

    public byte alpha(int i4) {
        return this.purple[i4];
    }

    public byte bravo(int i4) {
        return this.purple[i4];
    }

    public int delta() {
        return this.purple.length;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof C1361p1) && delta() == ((C1361p1) obj).delta()) {
                if (delta() != 0) {
                    if (obj instanceof C1361p1) {
                        C1361p1 c1361p1 = (C1361p1) obj;
                        int i4 = this.alpha;
                        int i5 = c1361p1.alpha;
                        if (i4 == 0 || i5 == 0 || i4 == i5) {
                            int delta = delta();
                            if (delta <= c1361p1.delta()) {
                                if (delta <= c1361p1.delta()) {
                                    int i10 = 0;
                                    int i11 = 0;
                                    while (i10 < delta) {
                                        if (this.purple[i10] == c1361p1.purple[i11]) {
                                            i10++;
                                            i11++;
                                        }
                                    }
                                    return true;
                                }
                                throw new IllegalArgumentException(A0.z.juliet("Ran off end of other: 0, ", delta, c1361p1.delta(), ", "));
                            }
                            throw new IllegalArgumentException("Length too large: " + delta + delta());
                        }
                    } else {
                        return obj.equals(this);
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4 = this.alpha;
        if (i4 == 0) {
            int delta = delta();
            int i5 = delta;
            for (int i10 = 0; i10 < delta; i10++) {
                i5 = (i5 * 31) + this.purple[i10];
            }
            if (i5 == 0) {
                i5 = 1;
            }
            this.alpha = i5;
            return i5;
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new Oe.t(this);
    }

    public final String toString() {
        C1361p1 c1353n1;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int delta = delta();
        if (delta() <= 50) {
            concat = hg.c.bravo(this);
        } else {
            int hotel = hotel(0, 47, delta());
            if (hotel == 0) {
                c1353n1 = red;
            } else {
                c1353n1 = new C1353n1(hotel, this.purple);
            }
            concat = hg.c.bravo(c1353n1).concat("...");
        }
        return androidx.appcompat.widget.P0.gold(androidx.appcompat.widget.P0.green("<ByteString@", hexString, " size=", " contents=\"", delta), concat, "\">");
    }
}
