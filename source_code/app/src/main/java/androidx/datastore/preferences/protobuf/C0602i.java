package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import t6.B3;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0602i extends B3 {
    public static final Logger foxtrot = Logger.getLogger(C0602i.class.getName());
    public static final boolean golf = D.echo;
    public aa alpha;
    public final byte[] bravo;
    public final int charlie;
    public int delta;
    public final OutputStream echo;

    public C0602i(OutputStream outputStream, int i4) {
        if (i4 >= 0) {
            int max = Math.max(i4, 20);
            this.bravo = new byte[max];
            this.charlie = max;
            if (outputStream != null) {
                this.echo = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public static int hotel(int i4, C0599f c0599f) {
        int juliet = juliet(i4);
        int size = c0599f.size();
        return kilo(size) + size + juliet;
    }

    public static int india(String str) {
        int length;
        try {
            length = F.alpha(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(u.alpha).length;
        }
        return kilo(length) + length;
    }

    public static int juliet(int i4) {
        return kilo(i4 << 3);
    }

    public static int kilo(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public static int lima(long j5) {
        return (640 - (Long.numberOfLeadingZeros(j5) * 9)) >>> 6;
    }

    public final void amber(int i4, String str) {
        beige(i4, 2);
        azure(str);
    }

    public final void azure(String str) {
        try {
            int length = str.length() * 3;
            int kilo = kilo(length);
            int i4 = kilo + length;
            int i5 = this.charlie;
            if (i4 > i5) {
                byte[] bArr = new byte[length];
                int bravo = F.alpha.bravo(str, bArr, 0, length);
                blue(bravo);
                papa(bArr, 0, bravo);
                return;
            }
            if (i4 > i5 - this.delta) {
                mike();
            }
            int kilo2 = kilo(str.length());
            int i10 = this.delta;
            byte[] bArr2 = this.bravo;
            try {
                try {
                    if (kilo2 == kilo) {
                        int i11 = i10 + kilo2;
                        this.delta = i11;
                        int bravo2 = F.alpha.bravo(str, bArr2, i11, i5 - i11);
                        this.delta = i10;
                        foxtrot((bravo2 - i10) - kilo2);
                        this.delta = bravo2;
                    } else {
                        int alpha = F.alpha(str);
                        foxtrot(alpha);
                        this.delta = F.alpha.bravo(str, bArr2, this.delta, alpha);
                    }
                } catch (Utf8$UnpairedSurrogateException e) {
                    this.delta = i10;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e4) {
                throw new CodedOutputStream$OutOfSpaceException(e4);
            }
        } catch (Utf8$UnpairedSurrogateException e5) {
            foxtrot.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
            byte[] bytes = str.getBytes(u.alpha);
            try {
                blue(bytes.length);
                bravo(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e10) {
                throw new CodedOutputStream$OutOfSpaceException(e10);
            }
        }
    }

    public final void beige(int i4, int i5) {
        blue((i4 << 3) | i5);
    }

    public final void black(int i4, int i5) {
        november(20);
        echo(i4, 0);
        foxtrot(i5);
    }

    public final void blue(int i4) {
        november(5);
        foxtrot(i4);
    }

    @Override // t6.B3
    public final void bravo(byte[] bArr, int i4, int i5) {
        papa(bArr, i4, i5);
    }

    public final void bronze(int i4, long j5) {
        november(20);
        echo(i4, 0);
        golf(j5);
    }

    public final void charlie(int i4) {
        int i5 = this.delta;
        int i10 = i5 + 1;
        this.delta = i10;
        byte[] bArr = this.bravo;
        bArr[i5] = (byte) (i4 & 255);
        int i11 = i5 + 2;
        this.delta = i11;
        bArr[i10] = (byte) ((i4 >> 8) & 255);
        int i12 = i5 + 3;
        this.delta = i12;
        bArr[i11] = (byte) ((i4 >> 16) & 255);
        this.delta = i5 + 4;
        bArr[i12] = (byte) ((i4 >> 24) & 255);
    }

    public final void coral(long j5) {
        november(10);
        golf(j5);
    }

    public final void delta(long j5) {
        int i4 = this.delta;
        int i5 = i4 + 1;
        this.delta = i5;
        byte[] bArr = this.bravo;
        bArr[i4] = (byte) (j5 & 255);
        int i10 = i4 + 2;
        this.delta = i10;
        bArr[i5] = (byte) ((j5 >> 8) & 255);
        int i11 = i4 + 3;
        this.delta = i11;
        bArr[i10] = (byte) ((j5 >> 16) & 255);
        int i12 = i4 + 4;
        this.delta = i12;
        bArr[i11] = (byte) (255 & (j5 >> 24));
        int i13 = i4 + 5;
        this.delta = i13;
        bArr[i12] = (byte) (((int) (j5 >> 32)) & 255);
        int i14 = i4 + 6;
        this.delta = i14;
        bArr[i13] = (byte) (((int) (j5 >> 40)) & 255);
        int i15 = i4 + 7;
        this.delta = i15;
        bArr[i14] = (byte) (((int) (j5 >> 48)) & 255);
        this.delta = i4 + 8;
        bArr[i15] = (byte) (((int) (j5 >> 56)) & 255);
    }

    public final void echo(int i4, int i5) {
        foxtrot((i4 << 3) | i5);
    }

    public final void foxtrot(int i4) {
        boolean z2 = golf;
        byte[] bArr = this.bravo;
        if (z2) {
            while ((i4 & (-128)) != 0) {
                int i5 = this.delta;
                this.delta = i5 + 1;
                D.juliet(bArr, i5, (byte) ((i4 | 128) & 255));
                i4 >>>= 7;
            }
            int i10 = this.delta;
            this.delta = i10 + 1;
            D.juliet(bArr, i10, (byte) i4);
            return;
        }
        while ((i4 & (-128)) != 0) {
            int i11 = this.delta;
            this.delta = i11 + 1;
            bArr[i11] = (byte) ((i4 | 128) & 255);
            i4 >>>= 7;
        }
        int i12 = this.delta;
        this.delta = i12 + 1;
        bArr[i12] = (byte) i4;
    }

    public final void golf(long j5) {
        boolean z2 = golf;
        byte[] bArr = this.bravo;
        if (z2) {
            while ((j5 & (-128)) != 0) {
                int i4 = this.delta;
                this.delta = i4 + 1;
                D.juliet(bArr, i4, (byte) ((((int) j5) | 128) & 255));
                j5 >>>= 7;
            }
            int i5 = this.delta;
            this.delta = i5 + 1;
            D.juliet(bArr, i5, (byte) j5);
            return;
        }
        while ((j5 & (-128)) != 0) {
            int i10 = this.delta;
            this.delta = i10 + 1;
            bArr[i10] = (byte) ((((int) j5) | 128) & 255);
            j5 >>>= 7;
        }
        int i11 = this.delta;
        this.delta = i11 + 1;
        bArr[i11] = (byte) j5;
    }

    public final void mike() {
        this.echo.write(this.bravo, 0, this.delta);
        this.delta = 0;
    }

    public final void november(int i4) {
        if (this.charlie - this.delta < i4) {
            mike();
        }
    }

    public final void oscar(byte b2) {
        if (this.delta == this.charlie) {
            mike();
        }
        int i4 = this.delta;
        this.delta = i4 + 1;
        this.bravo[i4] = b2;
    }

    public final void papa(byte[] bArr, int i4, int i5) {
        int i10 = this.delta;
        int i11 = this.charlie;
        int i12 = i11 - i10;
        byte[] bArr2 = this.bravo;
        if (i12 >= i5) {
            System.arraycopy(bArr, i4, bArr2, i10, i5);
            this.delta += i5;
            return;
        }
        System.arraycopy(bArr, i4, bArr2, i10, i12);
        int i13 = i4 + i12;
        int i14 = i5 - i12;
        this.delta = i11;
        mike();
        if (i14 <= i11) {
            System.arraycopy(bArr, i13, bArr2, 0, i14);
            this.delta = i14;
        } else {
            this.echo.write(bArr, i13, i14);
        }
    }

    public final void quebec(int i4, boolean z2) {
        november(11);
        echo(i4, 0);
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        int i5 = this.delta;
        this.delta = i5 + 1;
        this.bravo[i5] = b2;
    }

    public final void romeo(int i4, C0599f c0599f) {
        beige(i4, 2);
        sierra(c0599f);
    }

    public final void sierra(C0599f c0599f) {
        blue(c0599f.size());
        bravo(c0599f.purple, c0599f.india(), c0599f.size());
    }

    public final void tango(int i4, int i5) {
        november(14);
        echo(i4, 5);
        charlie(i5);
    }

    public final void uniform(int i4) {
        november(4);
        charlie(i4);
    }

    public final void victor(int i4, long j5) {
        november(18);
        echo(i4, 1);
        delta(j5);
    }

    public final void whiskey(long j5) {
        november(8);
        delta(j5);
    }

    public final void xray(int i4, int i5) {
        november(20);
        echo(i4, 0);
        if (i5 >= 0) {
            foxtrot(i5);
        } else {
            golf(i5);
        }
    }

    public final void yankee(int i4) {
        if (i4 >= 0) {
            blue(i4);
        } else {
            coral(i4);
        }
    }

    public final void zulu(int i4, ah ahVar, as asVar) {
        beige(i4, 2);
        blue(((AbstractC0594a) ahVar).alpha(asVar));
        asVar.echo(ahVar, this.alpha);
    }
}
