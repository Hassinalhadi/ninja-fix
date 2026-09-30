package com.google.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1503f extends az {
    public static final Logger golf = Logger.getLogger(C1503f.class.getName());
    public static final boolean hotel = L.echo;
    public ac charlie;
    public final byte[] delta;
    public final int echo;
    public int foxtrot;

    public C1503f(int i4, byte[] bArr) {
        if (((bArr.length - i4) | i4) >= 0) {
            this.delta = bArr;
            this.foxtrot = 0;
            this.echo = i4;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i4)));
    }

    public static int delta(int i4, C1502e c1502e) {
        return echo(c1502e) + hotel(i4);
    }

    public static int echo(C1502e c1502e) {
        int size = c1502e.size();
        return india(size) + size;
    }

    public static int foxtrot(int i4) {
        if (i4 >= 0) {
            return india(i4);
        }
        return 10;
    }

    public static int golf(String str) {
        int length;
        try {
            length = N.bravo(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(AbstractC1517u.alpha).length;
        }
        return india(length) + length;
    }

    public static int hotel(int i4) {
        return india(i4 << 3);
    }

    public static int india(int i4) {
        if ((i4 & (-128)) == 0) {
            return 1;
        }
        if ((i4 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i4) == 0) {
            return 3;
        }
        if ((i4 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int juliet(long j5) {
        int i4;
        if (((-128) & j5) == 0) {
            return 1;
        }
        if (j5 < 0) {
            return 10;
        }
        if (((-34359738368L) & j5) != 0) {
            j5 >>>= 28;
            i4 = 6;
        } else {
            i4 = 2;
        }
        if (((-2097152) & j5) != 0) {
            i4 += 2;
            j5 >>>= 14;
        }
        if ((j5 & (-16384)) != 0) {
            return i4 + 1;
        }
        return i4;
    }

    public final void kilo(byte b2) {
        try {
            byte[] bArr = this.delta;
            int i4 = this.foxtrot;
            this.foxtrot = i4 + 1;
            bArr[i4] = b2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.foxtrot), Integer.valueOf(this.echo), 1), e);
        }
    }

    public final void lima(byte[] bArr, int i4, int i5) {
        try {
            System.arraycopy(bArr, i4, this.delta, this.foxtrot, i5);
            this.foxtrot += i5;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.foxtrot), Integer.valueOf(this.echo), Integer.valueOf(i5)), e);
        }
    }

    public final void mike(C1502e c1502e) {
        uniform(c1502e.size());
        lima(c1502e.purple, c1502e.delta(), c1502e.size());
    }

    public final void november(int i4, int i5) {
        tango(i4, 5);
        oscar(i5);
    }

    public final void oscar(int i4) {
        try {
            byte[] bArr = this.delta;
            int i5 = this.foxtrot;
            int i10 = i5 + 1;
            this.foxtrot = i10;
            bArr[i5] = (byte) (i4 & 255);
            int i11 = i5 + 2;
            this.foxtrot = i11;
            bArr[i10] = (byte) ((i4 >> 8) & 255);
            int i12 = i5 + 3;
            this.foxtrot = i12;
            bArr[i11] = (byte) ((i4 >> 16) & 255);
            this.foxtrot = i5 + 4;
            bArr[i12] = (byte) ((i4 >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.foxtrot), Integer.valueOf(this.echo), 1), e);
        }
    }

    public final void papa(int i4, long j5) {
        tango(i4, 1);
        quebec(j5);
    }

    public final void quebec(long j5) {
        try {
            byte[] bArr = this.delta;
            int i4 = this.foxtrot;
            int i5 = i4 + 1;
            this.foxtrot = i5;
            bArr[i4] = (byte) (((int) j5) & 255);
            int i10 = i4 + 2;
            this.foxtrot = i10;
            bArr[i5] = (byte) (((int) (j5 >> 8)) & 255);
            int i11 = i4 + 3;
            this.foxtrot = i11;
            bArr[i10] = (byte) (((int) (j5 >> 16)) & 255);
            int i12 = i4 + 4;
            this.foxtrot = i12;
            bArr[i11] = (byte) (((int) (j5 >> 24)) & 255);
            int i13 = i4 + 5;
            this.foxtrot = i13;
            bArr[i12] = (byte) (((int) (j5 >> 32)) & 255);
            int i14 = i4 + 6;
            this.foxtrot = i14;
            bArr[i13] = (byte) (((int) (j5 >> 40)) & 255);
            int i15 = i4 + 7;
            this.foxtrot = i15;
            bArr[i14] = (byte) (((int) (j5 >> 48)) & 255);
            this.foxtrot = i4 + 8;
            bArr[i15] = (byte) (((int) (j5 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.foxtrot), Integer.valueOf(this.echo), 1), e);
        }
    }

    public final void romeo(int i4) {
        if (i4 >= 0) {
            uniform(i4);
        } else {
            whiskey(i4);
        }
    }

    public final void sierra(String str) {
        int i4 = this.foxtrot;
        try {
            int india = india(str.length() * 3);
            int india2 = india(str.length());
            byte[] bArr = this.delta;
            int i5 = this.echo;
            if (india2 == india) {
                int i10 = i4 + india2;
                this.foxtrot = i10;
                int alpha = N.alpha.alpha(str, bArr, i10, i5 - i10);
                this.foxtrot = i4;
                uniform((alpha - i4) - india2);
                this.foxtrot = alpha;
                return;
            }
            uniform(N.bravo(str));
            int i11 = this.foxtrot;
            this.foxtrot = N.alpha.alpha(str, bArr, i11, i5 - i11);
        } catch (Utf8$UnpairedSurrogateException e) {
            this.foxtrot = i4;
            golf.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(AbstractC1517u.alpha);
            try {
                uniform(bytes.length);
                lima(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new CodedOutputStream$OutOfSpaceException(e4);
            }
        } catch (IndexOutOfBoundsException e5) {
            throw new CodedOutputStream$OutOfSpaceException(e5);
        }
    }

    public final void tango(int i4, int i5) {
        uniform((i4 << 3) | i5);
    }

    public final void uniform(int i4) {
        while (true) {
            int i5 = i4 & (-128);
            byte[] bArr = this.delta;
            if (i5 == 0) {
                int i10 = this.foxtrot;
                this.foxtrot = i10 + 1;
                bArr[i10] = (byte) i4;
                return;
            } else {
                try {
                    int i11 = this.foxtrot;
                    this.foxtrot = i11 + 1;
                    bArr[i11] = (byte) ((i4 & 127) | 128);
                    i4 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.foxtrot), Integer.valueOf(this.echo), 1), e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.foxtrot), Integer.valueOf(this.echo), 1), e);
        }
    }

    public final void victor(int i4, long j5) {
        tango(i4, 0);
        whiskey(j5);
    }

    public final void whiskey(long j5) {
        byte[] bArr = this.delta;
        boolean z2 = hotel;
        int i4 = this.echo;
        if (z2 && i4 - this.foxtrot >= 10) {
            while ((j5 & (-128)) != 0) {
                int i5 = this.foxtrot;
                this.foxtrot = i5 + 1;
                L.kilo(bArr, i5, (byte) ((((int) j5) & 127) | 128));
                j5 >>>= 7;
            }
            int i10 = this.foxtrot;
            this.foxtrot = 1 + i10;
            L.kilo(bArr, i10, (byte) j5);
            return;
        }
        while ((j5 & (-128)) != 0) {
            try {
                int i11 = this.foxtrot;
                this.foxtrot = i11 + 1;
                bArr[i11] = (byte) ((((int) j5) & 127) | 128);
                j5 >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.foxtrot), Integer.valueOf(i4), 1), e);
            }
        }
        int i12 = this.foxtrot;
        this.foxtrot = i12 + 1;
        bArr[i12] = (byte) j5;
    }
}
