package com.google.crypto.tink.shaded.protobuf;

import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1494l extends ap {
    public static final Logger echo = Logger.getLogger(C1494l.class.getName());
    public static final boolean foxtrot = M.foxtrot;
    public C1495m alpha;
    public final byte[] bravo;
    public final int charlie;
    public int delta;

    public C1494l(int i4, byte[] bArr) {
        if (((bArr.length - i4) | i4) >= 0) {
            this.bravo = bArr;
            this.delta = 0;
            this.charlie = i4;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i4)));
    }

    public static int amber(AbstractC1490h abstractC1490h) {
        int size = abstractC1490h.size();
        return crimson(size) + size;
    }

    public static int azure(int i4) {
        return coral(i4) + 4;
    }

    public static int beige(int i4) {
        return coral(i4) + 8;
    }

    public static int black(int i4, ao aoVar, A a6) {
        int coral = coral(i4) * 2;
        AbstractC1483a abstractC1483a = (AbstractC1483a) aoVar;
        abstractC1483a.getClass();
        x xVar = (x) abstractC1483a;
        int i5 = xVar.memoizedSerializedSize;
        if (i5 == -1) {
            i5 = a6.india(abstractC1483a);
            xVar.memoizedSerializedSize = i5;
        }
        return i5 + coral;
    }

    public static int blue(int i4) {
        if (i4 >= 0) {
            return crimson(i4);
        }
        return 10;
    }

    public static int bronze(String str) {
        int length;
        try {
            length = O.bravo(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(ab.alpha).length;
        }
        return crimson(length) + length;
    }

    public static int coral(int i4) {
        return crimson(i4 << 3);
    }

    public static int crimson(int i4) {
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

    public static int cyan(long j5) {
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

    public static int zulu(int i4, AbstractC1490h abstractC1490h) {
        return amber(abstractC1490h) + coral(i4);
    }

    public final void emerald(byte b2) {
        try {
            byte[] bArr = this.bravo;
            int i4 = this.delta;
            this.delta = i4 + 1;
            bArr[i4] = b2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.delta), Integer.valueOf(this.charlie), 1), e);
        }
    }

    public final void fuchsia(byte[] bArr, int i4, int i5) {
        try {
            System.arraycopy(bArr, i4, this.bravo, this.delta, i5);
            this.delta += i5;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.delta), Integer.valueOf(this.charlie), Integer.valueOf(i5)), e);
        }
    }

    public final void gold(int i4, int i5) {
        jade(i4, 5);
        gray(i5);
    }

    public final void gray(int i4) {
        try {
            byte[] bArr = this.bravo;
            int i5 = this.delta;
            int i10 = i5 + 1;
            this.delta = i10;
            bArr[i5] = (byte) (i4 & 255);
            int i11 = i5 + 2;
            this.delta = i11;
            bArr[i10] = (byte) ((i4 >> 8) & 255);
            int i12 = i5 + 3;
            this.delta = i12;
            bArr[i11] = (byte) ((i4 >> 16) & 255);
            this.delta = i5 + 4;
            bArr[i12] = (byte) ((i4 >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.delta), Integer.valueOf(this.charlie), 1), e);
        }
    }

    public final void green(int i4, long j5) {
        jade(i4, 1);
        indigo(j5);
    }

    public final void indigo(long j5) {
        try {
            byte[] bArr = this.bravo;
            int i4 = this.delta;
            int i5 = i4 + 1;
            this.delta = i5;
            bArr[i4] = (byte) (((int) j5) & 255);
            int i10 = i4 + 2;
            this.delta = i10;
            bArr[i5] = (byte) (((int) (j5 >> 8)) & 255);
            int i11 = i4 + 3;
            this.delta = i11;
            bArr[i10] = (byte) (((int) (j5 >> 16)) & 255);
            int i12 = i4 + 4;
            this.delta = i12;
            bArr[i11] = (byte) (((int) (j5 >> 24)) & 255);
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
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.delta), Integer.valueOf(this.charlie), 1), e);
        }
    }

    public final void ivory(int i4) {
        if (i4 >= 0) {
            lavender(i4);
        } else {
            magenta(i4);
        }
    }

    public final void jade(int i4, int i5) {
        lavender((i4 << 3) | i5);
    }

    public final void lavender(int i4) {
        byte[] bArr = this.bravo;
        boolean z2 = foxtrot;
        int i5 = this.charlie;
        if (z2 && !AbstractC1485c.alpha()) {
            int i10 = this.delta;
            if (i5 - i10 >= 5) {
                if ((i4 & (-128)) == 0) {
                    this.delta = 1 + i10;
                    M.juliet(bArr, i10, (byte) i4);
                    return;
                }
                this.delta = i10 + 1;
                M.juliet(bArr, i10, (byte) (i4 | 128));
                int i11 = i4 >>> 7;
                if ((i11 & (-128)) == 0) {
                    int i12 = this.delta;
                    this.delta = 1 + i12;
                    M.juliet(bArr, i12, (byte) i11);
                    return;
                }
                int i13 = this.delta;
                this.delta = i13 + 1;
                M.juliet(bArr, i13, (byte) (i11 | 128));
                int i14 = i4 >>> 14;
                if ((i14 & (-128)) == 0) {
                    int i15 = this.delta;
                    this.delta = 1 + i15;
                    M.juliet(bArr, i15, (byte) i14);
                    return;
                }
                int i16 = this.delta;
                this.delta = i16 + 1;
                M.juliet(bArr, i16, (byte) (i14 | 128));
                int i17 = i4 >>> 21;
                if ((i17 & (-128)) == 0) {
                    int i18 = this.delta;
                    this.delta = 1 + i18;
                    M.juliet(bArr, i18, (byte) i17);
                    return;
                } else {
                    int i19 = this.delta;
                    this.delta = i19 + 1;
                    M.juliet(bArr, i19, (byte) (i17 | 128));
                    int i20 = this.delta;
                    this.delta = 1 + i20;
                    M.juliet(bArr, i20, (byte) (i4 >>> 28));
                    return;
                }
            }
        }
        while ((i4 & (-128)) != 0) {
            try {
                int i21 = this.delta;
                this.delta = i21 + 1;
                bArr[i21] = (byte) ((i4 & 127) | 128);
                i4 >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.delta), Integer.valueOf(i5), 1), e);
            }
        }
        int i22 = this.delta;
        this.delta = i22 + 1;
        bArr[i22] = (byte) i4;
    }

    public final void lime(int i4, long j5) {
        jade(i4, 0);
        magenta(j5);
    }

    public final void magenta(long j5) {
        byte[] bArr = this.bravo;
        boolean z2 = foxtrot;
        int i4 = this.charlie;
        if (z2 && i4 - this.delta >= 10) {
            while ((j5 & (-128)) != 0) {
                int i5 = this.delta;
                this.delta = i5 + 1;
                M.juliet(bArr, i5, (byte) ((((int) j5) & 127) | 128));
                j5 >>>= 7;
            }
            int i10 = this.delta;
            this.delta = 1 + i10;
            M.juliet(bArr, i10, (byte) j5);
            return;
        }
        while ((j5 & (-128)) != 0) {
            try {
                int i11 = this.delta;
                this.delta = i11 + 1;
                bArr[i11] = (byte) ((((int) j5) & 127) | 128);
                j5 >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.delta), Integer.valueOf(i4), 1), e);
            }
        }
        int i12 = this.delta;
        this.delta = i12 + 1;
        bArr[i12] = (byte) j5;
    }
}
