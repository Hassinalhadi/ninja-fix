package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class aa extends AbstractC1426u {
    public static final Logger echo = Logger.getLogger(aa.class.getName());
    public static final boolean foxtrot = W.echo;
    public ax alpha;
    public final byte[] bravo;
    public final int charlie;
    public int delta;

    public aa(int i4, byte[] bArr) {
        int length = bArr.length;
        if (((length - i4) | i4) >= 0) {
            this.bravo = bArr;
            this.delta = 0;
            this.charlie = i4;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i4)));
    }

    public static int cyan(String str) {
        int length;
        try {
            length = X.charlie(str);
        } catch (zzhd unused) {
            length = str.getBytes(at.alpha).length;
        }
        return romeo(length) + length;
    }

    public static int romeo(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public static int sierra(long j5) {
        return (640 - (Long.numberOfLeadingZeros(j5) * 9)) >>> 6;
    }

    public final void amber(int i4, int i5) {
        bronze(i4 << 3);
        azure(i5);
    }

    public final void azure(int i4) {
        if (i4 >= 0) {
            bronze(i4);
        } else {
            crimson(i4);
        }
    }

    public final void beige(int i4, String str) {
        bronze((i4 << 3) | 2);
        int i5 = this.delta;
        try {
            int romeo = romeo(str.length() * 3);
            int romeo2 = romeo(str.length());
            byte[] bArr = this.bravo;
            int i10 = this.charlie;
            if (romeo2 == romeo) {
                int i11 = i5 + romeo2;
                this.delta = i11;
                int bravo = X.bravo(str, bArr, i11, i10 - i11);
                this.delta = i5;
                bronze((bravo - i5) - romeo2);
                this.delta = bravo;
                return;
            }
            bronze(X.charlie(str));
            int i12 = this.delta;
            this.delta = X.bravo(str, bArr, i12, i10 - i12);
        } catch (zzhd e) {
            this.delta = i5;
            echo.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(at.alpha);
            try {
                int length = bytes.length;
                bronze(length);
                uniform(bytes, 0, length);
            } catch (IndexOutOfBoundsException e4) {
                throw new zzdl(e4);
            }
        } catch (IndexOutOfBoundsException e5) {
            throw new zzdl(e5);
        }
    }

    public final void black(int i4, int i5) {
        bronze((i4 << 3) | i5);
    }

    public final void blue(int i4, int i5) {
        bronze(i4 << 3);
        bronze(i5);
    }

    public final void bronze(int i4) {
        while (true) {
            int i5 = i4 & (-128);
            byte[] bArr = this.bravo;
            if (i5 == 0) {
                int i10 = this.delta;
                this.delta = i10 + 1;
                bArr[i10] = (byte) i4;
                return;
            } else {
                try {
                    int i11 = this.delta;
                    this.delta = i11 + 1;
                    bArr[i11] = (byte) ((i4 | 128) & 255);
                    i4 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.delta), Integer.valueOf(this.charlie), 1), e);
                }
            }
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.delta), Integer.valueOf(this.charlie), 1), e);
        }
    }

    public final void coral(int i4, long j5) {
        bronze(i4 << 3);
        crimson(j5);
    }

    public final void crimson(long j5) {
        byte[] bArr = this.bravo;
        boolean z2 = foxtrot;
        int i4 = this.charlie;
        if (!z2 || i4 - this.delta < 10) {
            while ((j5 & (-128)) != 0) {
                try {
                    int i5 = this.delta;
                    this.delta = i5 + 1;
                    bArr[i5] = (byte) ((((int) j5) | 128) & 255);
                    j5 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.delta), Integer.valueOf(i4), 1), e);
                }
            }
            int i10 = this.delta;
            this.delta = i10 + 1;
            bArr[i10] = (byte) j5;
            return;
        }
        while (true) {
            int i11 = (int) j5;
            if ((j5 & (-128)) == 0) {
                int i12 = this.delta;
                this.delta = 1 + i12;
                W.charlie.delta(bArr, W.foxtrot + i12, (byte) i11);
                return;
            }
            int i13 = this.delta;
            this.delta = i13 + 1;
            W.charlie.delta(bArr, W.foxtrot + i13, (byte) ((i11 | 128) & 255));
            j5 >>>= 7;
        }
    }

    public final void tango(byte b2) {
        try {
            byte[] bArr = this.bravo;
            int i4 = this.delta;
            this.delta = i4 + 1;
            bArr[i4] = b2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.delta), Integer.valueOf(this.charlie), 1), e);
        }
    }

    public final void uniform(byte[] bArr, int i4, int i5) {
        try {
            System.arraycopy(bArr, i4, this.bravo, this.delta, i5);
            this.delta += i5;
        } catch (IndexOutOfBoundsException e) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.delta), Integer.valueOf(this.charlie), Integer.valueOf(i5)), e);
        }
    }

    public final void victor(int i4, AbstractC1431z abstractC1431z) {
        bronze((i4 << 3) | 2);
        bronze(abstractC1431z.hotel());
        abstractC1431z.romeo(this);
    }

    public final void whiskey(int i4, int i5) {
        bronze((i4 << 3) | 5);
        xray(i5);
    }

    public final void xray(int i4) {
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
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.delta), Integer.valueOf(this.charlie), 1), e);
        }
    }

    public final void yankee(int i4, long j5) {
        bronze((i4 << 3) | 1);
        zulu(j5);
    }

    public final void zulu(long j5) {
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
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.delta), Integer.valueOf(this.charlie), 1), e);
        }
    }
}
