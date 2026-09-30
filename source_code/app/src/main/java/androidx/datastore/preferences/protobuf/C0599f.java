package androidx.datastore.preferences.protobuf;

import androidx.appcompat.widget.P0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import t6.C3;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0599f implements Iterable, Serializable {
    public static final C0599f red = new C0599f(u.bravo);
    public static final C0597d silver;
    public int alpha = 0;
    public final byte[] purple;

    static {
        C0597d c0597d;
        if (AbstractC0596c.alpha()) {
            c0597d = new C0597d(1);
        } else {
            c0597d = new C0597d(0);
        }
        silver = c0597d;
    }

    public C0599f(byte[] bArr) {
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

    public static C0599f delta(byte[] bArr, int i4, int i5) {
        byte[] copyOfRange;
        bravo(i4, i4 + i5, bArr.length);
        switch (silver.alpha) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i4, i5 + i4);
                break;
            default:
                copyOfRange = new byte[i5];
                System.arraycopy(bArr, i4, copyOfRange, 0, i5);
                break;
        }
        return new C0599f(copyOfRange);
    }

    public byte alpha(int i4) {
        return this.purple[i4];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof C0599f) && size() == ((C0599f) obj).size()) {
                if (size() != 0) {
                    if (obj instanceof C0599f) {
                        C0599f c0599f = (C0599f) obj;
                        int i4 = this.alpha;
                        int i5 = c0599f.alpha;
                        if (i4 == 0 || i5 == 0 || i4 == i5) {
                            int size = size();
                            if (size <= c0599f.size()) {
                                if (size <= c0599f.size()) {
                                    int india = india() + size;
                                    int india2 = india();
                                    int india3 = c0599f.india();
                                    while (india2 < india) {
                                        if (this.purple[india2] != c0599f.purple[india3]) {
                                            return false;
                                        }
                                        india2++;
                                        india3++;
                                    }
                                    return true;
                                }
                                StringBuilder sierra = Q0.c.sierra(size, "Ran off end of other: 0, ", ", ");
                                sierra.append(c0599f.size());
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
            int india = india();
            int i5 = size;
            for (int i10 = india; i10 < india + size; i10++) {
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

    public void hotel(int i4, byte[] bArr) {
        System.arraycopy(this.purple, 0, bArr, 0, i4);
    }

    public int india() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new Oe.t(this);
    }

    public byte kilo(int i4) {
        return this.purple[i4];
    }

    public int size() {
        return this.purple.length;
    }

    public final String toString() {
        C0599f c0598e;
        String sb2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb2 = C3.alpha(this);
        } else {
            StringBuilder sb3 = new StringBuilder();
            int bravo = bravo(0, 47, size());
            if (bravo == 0) {
                c0598e = red;
            } else {
                c0598e = new C0598e(this.purple, india(), bravo);
            }
            sb3.append(C3.alpha(c0598e));
            sb3.append("...");
            sb2 = sb3.toString();
        }
        return P0.gold(P0.green("<ByteString@", hexString, " size=", " contents=\"", size), sb2, "\">");
    }
}
