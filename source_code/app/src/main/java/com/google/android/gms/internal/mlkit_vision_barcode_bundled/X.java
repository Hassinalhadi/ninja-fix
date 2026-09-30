package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public abstract class X {
    public static final ah alpha;

    static {
        if (W.echo && W.delta) {
            int i4 = AbstractC1424s.alpha;
        }
        alpha = new ah(7);
    }

    public static int alpha(byte[] bArr, int i4, int i5) {
        int i10 = i5 - i4;
        byte b2 = bArr[i4 - 1];
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    byte b4 = bArr[i4];
                    byte b6 = bArr[i4 + 1];
                    if (b2 > -12 || b4 > -65 || b6 > -65) {
                        return -1;
                    }
                    return (b6 << 16) ^ ((b4 << 8) ^ b2);
                }
                throw new AssertionError();
            }
            return delta(b2, bArr[i4]);
        }
        if (b2 > -12) {
            return -1;
        }
        return b2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int bravo(String str, byte[] bArr, int i4, int i5) {
        int i10;
        int i11;
        int i12;
        char charAt;
        int length = str.length();
        int i13 = 0;
        while (true) {
            i10 = i4 + i5;
            if (i13 >= length || (i12 = i13 + i4) >= i10 || (charAt = str.charAt(i13)) >= 128) {
                break;
            }
            bArr[i12] = (byte) charAt;
            i13++;
        }
        int i14 = i4 + i13;
        while (i13 < length) {
            char charAt2 = str.charAt(i13);
            if (charAt2 < 128 && i14 < i10) {
                bArr[i14] = (byte) charAt2;
                i14++;
            } else if (charAt2 < 2048 && i14 <= i10 - 2) {
                bArr[i14] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i14 + 1] = (byte) ((charAt2 & '?') | 128);
                i14 += 2;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i14 <= i10 - 3) {
                bArr[i14] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i14 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i14 + 2] = (byte) ((charAt2 & '?') | 128);
                i14 += 3;
            } else {
                if (i14 <= i10 - 4) {
                    int i15 = i13 + 1;
                    if (i15 != str.length()) {
                        char charAt3 = str.charAt(i15);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i16 = i14 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i14 += 4;
                            bArr[i16] = (byte) ((codePoint & 63) | 128);
                            i13 = i15;
                        } else {
                            i13 = i15;
                        }
                    }
                    throw new zzhd(i13 - 1, length);
                }
                if (charAt2 >= 55296 && charAt2 <= 57343 && ((i11 = i13 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i11)))) {
                    throw new zzhd(i13, length);
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i14);
            }
            i13++;
        }
        return i14;
    }

    public static int charlie(String str) {
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
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i5) >= 65536) {
                                i5++;
                            } else {
                                throw new zzhd(i5, length2);
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

    public static int delta(int i4, int i5) {
        if (i4 > -12 || i5 > -65) {
            return -1;
        }
        return i4 ^ (i5 << 8);
    }
}
