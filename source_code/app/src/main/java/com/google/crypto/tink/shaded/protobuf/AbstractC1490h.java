package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.widget.P0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1490h implements Iterable, Serializable {
    public static final C1489g purple = new C1489g(ab.bravo);
    public static final C1487e red;
    public int alpha;

    static {
        C1487e c1487e;
        if (AbstractC1485c.alpha()) {
            c1487e = new C1487e(1);
        } else {
            c1487e = new C1487e(0);
        }
        red = c1487e;
    }

    public static int bravo(int i4, int i5, int i10) {
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

    public static C1489g delta(byte[] bArr, int i4, int i5) {
        byte[] copyOfRange;
        bravo(i4, i4 + i5, bArr.length);
        switch (red.alpha) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i4, i5 + i4);
                break;
            default:
                copyOfRange = new byte[i5];
                System.arraycopy(bArr, i4, copyOfRange, 0, i5);
                break;
        }
        return new C1489g(copyOfRange);
    }

    public abstract byte alpha(int i4);

    public final int hashCode() {
        int i4 = this.alpha;
        if (i4 == 0) {
            int size = size();
            C1489g c1489g = (C1489g) this;
            int lima = c1489g.lima();
            int i5 = size;
            for (int i10 = lima; i10 < lima + size; i10++) {
                i5 = (i5 * 31) + c1489g.silver[i10];
            }
            if (i5 == 0) {
                i5 = 1;
            }
            this.alpha = i5;
            return i5;
        }
        return i4;
    }

    public abstract void hotel(int i4, byte[] bArr);

    public abstract byte india(int i4);

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new Oe.t(this);
    }

    public final byte[] kilo() {
        int size = size();
        if (size == 0) {
            return ab.bravo;
        }
        byte[] bArr = new byte[size];
        hotel(size, bArr);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        C1489g c1488f;
        String sb2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb2 = ap.tango(this);
        } else {
            StringBuilder sb3 = new StringBuilder();
            C1489g c1489g = (C1489g) this;
            int bravo = bravo(0, 47, c1489g.size());
            if (bravo == 0) {
                c1488f = purple;
            } else {
                c1488f = new C1488f(c1489g.silver, c1489g.lima(), bravo);
            }
            sb3.append(ap.tango(c1488f));
            sb3.append("...");
            sb2 = sb3.toString();
        }
        return P0.gold(P0.green("<ByteString@", hexString, " size=", " contents=\"", size), sb2, "\">");
    }
}
