package com.google.protobuf;

import androidx.appcompat.widget.P0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1502e implements Iterable, Serializable {
    public static final C1502e red = new C1502e(AbstractC1517u.bravo);
    public int alpha = 0;
    public final byte[] purple;

    static {
        Class cls = AbstractC1500c.alpha;
    }

    public C1502e(byte[] bArr) {
        bArr.getClass();
        this.purple = bArr;
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

    public byte alpha(int i4) {
        return this.purple[i4];
    }

    public int delta() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof C1502e) && size() == ((C1502e) obj).size()) {
                if (size() != 0) {
                    if (obj instanceof C1502e) {
                        C1502e c1502e = (C1502e) obj;
                        int i4 = this.alpha;
                        int i5 = c1502e.alpha;
                        if (i4 == 0 || i5 == 0 || i4 == i5) {
                            int size = size();
                            if (size <= c1502e.size()) {
                                if (size <= c1502e.size()) {
                                    int delta = delta() + size;
                                    int delta2 = delta();
                                    int delta3 = c1502e.delta();
                                    while (delta2 < delta) {
                                        if (this.purple[delta2] != c1502e.purple[delta3]) {
                                            return false;
                                        }
                                        delta2++;
                                        delta3++;
                                    }
                                    return true;
                                }
                                StringBuilder sierra = Q0.c.sierra(size, "Ran off end of other: 0, ", ", ");
                                sierra.append(c1502e.size());
                                throw new IllegalArgumentException(sierra.toString());
                            }
                            throw new IllegalArgumentException("Length too large: " + size + size());
                        }
                        return false;
                    }
                    return obj.equals(this);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4 = this.alpha;
        if (i4 == 0) {
            int size = size();
            int delta = delta();
            int i5 = size;
            for (int i10 = delta; i10 < delta + size; i10++) {
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

    public byte hotel(int i4) {
        return this.purple[i4];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new Oe.t(this);
    }

    public int size() {
        return this.purple.length;
    }

    public final String toString() {
        C1502e c1501d;
        String sb2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb2 = az.bravo(this);
        } else {
            StringBuilder sb3 = new StringBuilder();
            int bravo = bravo(0, 47, size());
            if (bravo == 0) {
                c1501d = red;
            } else {
                c1501d = new C1501d(this.purple, delta(), bravo);
            }
            sb3.append(az.bravo(c1501d));
            sb3.append("...");
            sb2 = sb3.toString();
        }
        return P0.gold(P0.green("<ByteString@", hexString, " size=", " contents=\"", size), sb2, "\">");
    }
}
