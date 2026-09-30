package com.google.protobuf;

/* loaded from: classes2.dex */
public abstract class N {
    public static final az alpha;

    static {
        M m4;
        if (L.echo && L.delta && !AbstractC1500c.alpha()) {
            m4 = new M(1);
        } else {
            m4 = new M(0);
        }
        alpha = m4;
    }

    public static int alpha(byte[] bArr, int i4, int i5) {
        byte b2 = bArr[i4 - 1];
        int i10 = i5 - i4;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return delta(b2, bArr[i4], bArr[i4 + 1]);
                }
                throw new AssertionError();
            }
            return charlie(b2, bArr[i4]);
        }
        if (b2 > -12) {
            return -1;
        }
        return b2;
    }

    public static int bravo(String str) {
        int length = str.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && str.charAt(i5) < 128) {
            i5++;
        }
        int i10 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char charAt = str.charAt(i5);
            if (charAt < 2048) {
                i10 += (127 - charAt) >>> 31;
                i5++;
            } else {
                int length2 = str.length();
                while (i5 < length2) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 < 2048) {
                        i4 += (127 - charAt2) >>> 31;
                    } else {
                        i4 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i5) >= 65536) {
                                i5++;
                            } else {
                                throw new Utf8$UnpairedSurrogateException(i5, length2);
                            }
                        }
                    }
                    i5++;
                }
                i10 += i4;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i10 + 4294967296L));
    }

    public static int charlie(int i4, int i5) {
        if (i4 > -12 || i5 > -65) {
            return -1;
        }
        return i4 ^ (i5 << 8);
    }

    public static int delta(int i4, int i5, int i10) {
        if (i4 > -12 || i5 > -65 || i10 > -65) {
            return -1;
        }
        return (i4 ^ (i5 << 8)) ^ (i10 << 16);
    }
}
