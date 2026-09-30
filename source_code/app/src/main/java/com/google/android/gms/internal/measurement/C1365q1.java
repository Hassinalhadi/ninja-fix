package com.google.android.gms.internal.measurement;

import g6.AbstractC1753a;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1365q1 extends AbstractC1753a {
    public static final Logger hotel = Logger.getLogger(C1365q1.class.getName());
    public static final boolean india = AbstractC1311e2.echo;
    public J1 delta;
    public final byte[] echo;
    public final int foxtrot;
    public int golf;

    public C1365q1(int i4, byte[] bArr) {
        int length = bArr.length;
        if (((length - i4) | i4) >= 0) {
            this.echo = bArr;
            this.golf = 0;
            this.foxtrot = i4;
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException(A0.z.juliet("Array range is invalid. Buffer.length=", length, i4, ", offset=0, length="));
    }

    public static int bravo(long j5) {
        return (640 - (Long.numberOfLeadingZeros(j5) * 9)) >>> 6;
    }

    public static int quebec(String str) {
        int length;
        try {
            length = AbstractC1316f2.charlie(str);
        } catch (zzon unused) {
            length = str.getBytes(E1.alpha).length;
        }
        return romeo(length) + length;
    }

    public static int romeo(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public final void charlie(int i4, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.echo, this.golf, i4);
            this.golf += i4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzli(this.golf, this.foxtrot, i4, e);
        }
    }

    public final void delta(int i4, C1361p1 c1361p1) {
        november((i4 << 3) | 2);
        november(c1361p1.delta());
        charlie(c1361p1.delta(), c1361p1.purple);
    }

    public final void echo(int i4, int i5) {
        november((i4 << 3) | 5);
        foxtrot(i5);
    }

    public final void foxtrot(int i4) {
        int i5 = this.golf;
        try {
            byte[] bArr = this.echo;
            bArr[i5] = (byte) i4;
            bArr[i5 + 1] = (byte) (i4 >> 8);
            bArr[i5 + 2] = (byte) (i4 >> 16);
            bArr[i5 + 3] = (byte) (i4 >> 24);
            this.golf = i5 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzli(i5, this.foxtrot, 4, e);
        }
    }

    public final void golf(int i4, long j5) {
        november((i4 << 3) | 1);
        hotel(j5);
    }

    public final void hotel(long j5) {
        int i4 = this.golf;
        try {
            byte[] bArr = this.echo;
            bArr[i4] = (byte) j5;
            bArr[i4 + 1] = (byte) (j5 >> 8);
            bArr[i4 + 2] = (byte) (j5 >> 16);
            bArr[i4 + 3] = (byte) (j5 >> 24);
            bArr[i4 + 4] = (byte) (j5 >> 32);
            bArr[i4 + 5] = (byte) (j5 >> 40);
            bArr[i4 + 6] = (byte) (j5 >> 48);
            bArr[i4 + 7] = (byte) (j5 >> 56);
            this.golf = i4 + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzli(i4, this.foxtrot, 8, e);
        }
    }

    public final void india(int i4, int i5) {
        november(i4 << 3);
        juliet(i5);
    }

    public final void juliet(int i4) {
        if (i4 >= 0) {
            november(i4);
        } else {
            papa(i4);
        }
    }

    public final void kilo(int i4, String str) {
        november((i4 << 3) | 2);
        int i5 = this.golf;
        try {
            int romeo = romeo(str.length() * 3);
            int romeo2 = romeo(str.length());
            byte[] bArr = this.echo;
            int i10 = this.foxtrot;
            if (romeo2 == romeo) {
                int i11 = i5 + romeo2;
                this.golf = i11;
                int bravo = AbstractC1316f2.bravo(str, bArr, i11, i10 - i11);
                this.golf = i5;
                november((bravo - i5) - romeo2);
                this.golf = bravo;
                return;
            }
            november(AbstractC1316f2.charlie(str));
            int i12 = this.golf;
            this.golf = AbstractC1316f2.bravo(str, bArr, i12, i10 - i12);
        } catch (zzon e) {
            this.golf = i5;
            hotel.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(E1.alpha);
            try {
                int length = bytes.length;
                november(length);
                charlie(length, bytes);
            } catch (IndexOutOfBoundsException e4) {
                throw new zzli(e4);
            }
        } catch (IndexOutOfBoundsException e5) {
            throw new zzli(e5);
        }
    }

    public final void lima(int i4, int i5) {
        november((i4 << 3) | i5);
    }

    public final void mike(int i4, int i5) {
        november(i4 << 3);
        november(i5);
    }

    public final void november(int i4) {
        int i5;
        int i10 = this.golf;
        while (true) {
            int i11 = i4 & (-128);
            byte[] bArr = this.echo;
            if (i11 == 0) {
                i5 = i10 + 1;
                bArr[i10] = (byte) i4;
                this.golf = i5;
                return;
            } else {
                i5 = i10 + 1;
                try {
                    bArr[i10] = (byte) (i4 | 128);
                    i4 >>>= 7;
                    i10 = i5;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzli(i5, this.foxtrot, 1, e);
                }
            }
            throw new zzli(i5, this.foxtrot, 1, e);
        }
    }

    public final void oscar(int i4, long j5) {
        november(i4 << 3);
        papa(j5);
    }

    public final void papa(long j5) {
        int i4;
        int i5 = this.golf;
        byte[] bArr = this.echo;
        boolean z2 = india;
        int i10 = this.foxtrot;
        if (z2 && i10 - i5 >= 10) {
            long j6 = j5;
            while ((j6 & (-128)) != 0) {
                AbstractC1311e2.charlie.delta(bArr, AbstractC1311e2.foxtrot + i5, (byte) (((int) j6) | 128));
                j6 >>>= 7;
                i5++;
            }
            i4 = i5 + 1;
            AbstractC1311e2.charlie.delta(bArr, AbstractC1311e2.foxtrot + i5, (byte) j6);
        } else {
            long j7 = j5;
            while ((j7 & (-128)) != 0) {
                i4 = i5 + 1;
                try {
                    bArr[i5] = (byte) (((int) j7) | 128);
                    j7 >>>= 7;
                    i5 = i4;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzli(i4, i10, 1, e);
                }
            }
            i4 = i5 + 1;
            bArr[i5] = (byte) j7;
        }
        this.golf = i4;
    }
}
