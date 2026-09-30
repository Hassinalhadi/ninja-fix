package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class N extends ap {
    public final /* synthetic */ int alpha;

    public /* synthetic */ N(int i4) {
        this.alpha = i4;
    }

    public static int zulu(long j5, byte[] bArr, int i4, int i5) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    return O.delta(i4, M.foxtrot(j5, bArr), M.foxtrot(j5 + 1, bArr));
                }
                throw new AssertionError();
            }
            return O.charlie(i4, M.foxtrot(j5, bArr));
        }
        ap apVar = O.alpha;
        if (i4 > -12) {
            return -1;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    @Override // com.google.crypto.tink.shaded.protobuf.ap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String november(byte[] bArr, int i4, int i5) {
        int i10;
        int i11;
        byte b2 = -16;
        byte b4 = -32;
        int i12 = 2;
        int i13 = 1;
        switch (this.alpha) {
            case 0:
                if ((i4 | i5 | ((bArr.length - i4) - i5)) >= 0) {
                    int i14 = i4 + i5;
                    char[] cArr = new char[i5];
                    int i15 = i4;
                    int i16 = 0;
                    while (i15 < i14) {
                        byte b6 = bArr[i15];
                        if (b6 >= 0) {
                            i15++;
                            cArr[i16] = (char) b6;
                            i16++;
                        } else {
                            int i17 = i16;
                            while (i15 < i14) {
                                int i18 = i15 + 1;
                                byte b10 = bArr[i15];
                                if (b10 >= 0) {
                                    int i19 = i17 + 1;
                                    cArr[i17] = (char) b10;
                                    while (i18 < i14) {
                                        byte b11 = bArr[i18];
                                        if (b11 >= 0) {
                                            i18++;
                                            cArr[i19] = (char) b11;
                                            i19++;
                                        } else {
                                            i17 = i19;
                                            i15 = i18;
                                        }
                                    }
                                    i17 = i19;
                                    i15 = i18;
                                } else if (b10 < -32) {
                                    if (i18 < i14) {
                                        i15 += 2;
                                        ap.bravo(b10, bArr[i18], cArr, i17);
                                        i17++;
                                    } else {
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    }
                                } else if (b10 < -16) {
                                    if (i18 < i14 - 1) {
                                        int i20 = i15 + 2;
                                        i15 += 3;
                                        ap.charlie(b10, bArr[i18], bArr[i20], cArr, i17);
                                        i17++;
                                    } else {
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    }
                                } else if (i18 < i14 - 2) {
                                    byte b12 = bArr[i18];
                                    int i21 = i15 + 3;
                                    byte b13 = bArr[i15 + 2];
                                    i15 += 4;
                                    ap.alpha(b10, b12, b13, bArr[i21], cArr, i17);
                                    i17 += 2;
                                } else {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                            }
                            return new String(cArr, 0, i17);
                        }
                    }
                    int i172 = i16;
                    while (i15 < i14) {
                    }
                    return new String(cArr, 0, i172);
                }
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
            default:
                if ((i4 | i5 | ((bArr.length - i4) - i5)) >= 0) {
                    int i22 = i4 + i5;
                    char[] cArr2 = new char[i5];
                    int i23 = i4;
                    int i24 = 0;
                    while (i23 < i22) {
                        byte foxtrot = M.foxtrot(i23, bArr);
                        if (foxtrot >= 0) {
                            i23++;
                            cArr2[i24] = (char) foxtrot;
                            i24++;
                        } else {
                            int i25 = i24;
                            while (i23 < i22) {
                                int i26 = i23 + 1;
                                byte foxtrot2 = M.foxtrot(i23, bArr);
                                if (foxtrot2 >= 0) {
                                    int i27 = i25 + 1;
                                    cArr2[i25] = (char) foxtrot2;
                                    while (i26 < i22) {
                                        byte foxtrot3 = M.foxtrot(i26, bArr);
                                        if (foxtrot3 >= 0) {
                                            i26 += i13;
                                            cArr2[i27] = (char) foxtrot3;
                                            i27++;
                                        } else {
                                            i25 = i27;
                                            i10 = i12;
                                            i11 = i13;
                                            i23 = i26;
                                        }
                                    }
                                    i25 = i27;
                                    i10 = i12;
                                    i11 = i13;
                                    i23 = i26;
                                } else if (foxtrot2 < b4) {
                                    if (i26 < i22) {
                                        i23 += i12;
                                        ap.bravo(foxtrot2, M.foxtrot(i26, bArr), cArr2, i25);
                                        i10 = i12;
                                        i11 = i13;
                                        i25++;
                                    } else {
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    }
                                } else if (foxtrot2 < b2) {
                                    if (i26 < i22 - 1) {
                                        int i28 = i23 + 2;
                                        i10 = i12;
                                        i11 = i13;
                                        i23 += 3;
                                        ap.charlie(foxtrot2, M.foxtrot(i26, bArr), M.foxtrot(i28, bArr), cArr2, i25);
                                        i25++;
                                    } else {
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    }
                                } else {
                                    i10 = i12;
                                    i11 = i13;
                                    if (i26 < i22 - 2) {
                                        byte foxtrot4 = M.foxtrot(i26, bArr);
                                        int i29 = i23 + 3;
                                        byte foxtrot5 = M.foxtrot(i23 + 2, bArr);
                                        i23 += 4;
                                        ap.alpha(foxtrot2, foxtrot4, foxtrot5, M.foxtrot(i29, bArr), cArr2, i25);
                                        i25 += 2;
                                    } else {
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    }
                                }
                                i12 = i10;
                                i13 = i11;
                                b2 = -16;
                                b4 = -32;
                            }
                            return new String(cArr2, 0, i25);
                        }
                    }
                    int i252 = i24;
                    while (i23 < i22) {
                    }
                    return new String(cArr2, 0, i252);
                }
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r27 + r5;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.ap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int sierra(String str, byte[] bArr, int i4, int i5) {
        int i10;
        int i11;
        char charAt;
        long j5;
        long j6;
        long j7;
        int i12;
        char charAt2;
        switch (this.alpha) {
            case 0:
                int length = str.length();
                int i13 = i5 + i4;
                int i14 = 0;
                while (i14 < length && (i11 = i14 + i4) < i13 && (charAt = str.charAt(i14)) < 128) {
                    bArr[i11] = (byte) charAt;
                    i14++;
                }
                int i15 = i4 + i14;
                while (i14 < length) {
                    char charAt3 = str.charAt(i14);
                    if (charAt3 < 128 && i15 < i13) {
                        bArr[i15] = (byte) charAt3;
                        i15++;
                    } else if (charAt3 < 2048 && i15 <= i13 - 2) {
                        int i16 = i15 + 1;
                        bArr[i15] = (byte) ((charAt3 >>> 6) | 960);
                        i15 += 2;
                        bArr[i16] = (byte) ((charAt3 & '?') | 128);
                    } else if ((charAt3 < 55296 || 57343 < charAt3) && i15 <= i13 - 3) {
                        bArr[i15] = (byte) ((charAt3 >>> '\f') | 480);
                        int i17 = i15 + 2;
                        bArr[i15 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i15 += 3;
                        bArr[i17] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if (i15 <= i13 - 4) {
                            int i18 = i14 + 1;
                            if (i18 != str.length()) {
                                char charAt4 = str.charAt(i18);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i19 = i15 + 3;
                                    bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i15 += 4;
                                    bArr[i19] = (byte) ((codePoint & 63) | 128);
                                    i14 = i18;
                                } else {
                                    i14 = i18;
                                }
                            }
                            throw new Utf8$UnpairedSurrogateException(i14 - 1, length);
                        }
                        if (55296 <= charAt3 && charAt3 <= 57343 && ((i10 = i14 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i10)))) {
                            throw new Utf8$UnpairedSurrogateException(i14, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i15);
                    }
                    i14++;
                }
                return i15;
            default:
                long j10 = i4;
                long j11 = i5 + j10;
                int length2 = str.length();
                if (length2 <= i5 && bArr.length - i5 >= i4) {
                    int i20 = 0;
                    while (true) {
                        j5 = 1;
                        if (i20 < length2 && (charAt2 = str.charAt(i20)) < 128) {
                            M.juliet(bArr, j10, (byte) charAt2);
                            i20++;
                            j10 = 1 + j10;
                        }
                    }
                    if (i20 != length2) {
                        while (i20 < length2) {
                            char charAt5 = str.charAt(i20);
                            if (charAt5 < 128 && j10 < j11) {
                                M.juliet(bArr, j10, (byte) charAt5);
                                j7 = j11;
                                j6 = j5;
                                j10 += j5;
                            } else if (charAt5 < 2048 && j10 <= j11 - 2) {
                                j6 = j5;
                                long j12 = j10 + j6;
                                M.juliet(bArr, j10, (byte) ((charAt5 >>> 6) | 960));
                                j10 += 2;
                                M.juliet(bArr, j12, (byte) ((charAt5 & '?') | 128));
                                j7 = j11;
                            } else {
                                j6 = j5;
                                if ((charAt5 >= 55296 && 57343 >= charAt5) || j10 > j11 - 3) {
                                    j7 = j11;
                                    if (j10 <= j7 - 4) {
                                        int i21 = i20 + 1;
                                        if (i21 != length2) {
                                            char charAt6 = str.charAt(i21);
                                            if (Character.isSurrogatePair(charAt5, charAt6)) {
                                                int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                                M.juliet(bArr, j10, (byte) ((codePoint2 >>> 18) | 240));
                                                M.juliet(bArr, j10 + j6, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                long j13 = j10 + 3;
                                                M.juliet(bArr, j10 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                j10 += 4;
                                                M.juliet(bArr, j13, (byte) ((codePoint2 & 63) | 128));
                                                i20 = i21;
                                            } else {
                                                i20 = i21;
                                            }
                                        }
                                        throw new Utf8$UnpairedSurrogateException(i20 - 1, length2);
                                    }
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i12 = i20 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i12)))) {
                                        throw new Utf8$UnpairedSurrogateException(i20, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j10);
                                }
                                M.juliet(bArr, j10, (byte) ((charAt5 >>> '\f') | 480));
                                j7 = j11;
                                long j14 = j10 + 2;
                                M.juliet(bArr, j10 + j6, (byte) (((charAt5 >>> 6) & 63) | 128));
                                j10 += 3;
                                M.juliet(bArr, j14, (byte) ((charAt5 & '?') | 128));
                            }
                            i20++;
                            j5 = j6;
                            j11 = j7;
                        }
                    }
                    return (int) j10;
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i4 + i5));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ap
    public final int whiskey(byte[] bArr, int i4, int i5) {
        int i10;
        int i11;
        int i12;
        int i13 = i4;
        int i14 = 2;
        switch (this.alpha) {
            case 0:
                while (i13 < i5 && bArr[i13] >= 0) {
                    i13++;
                }
                if (i13 < i5) {
                    while (i13 < i5) {
                        int i15 = i13 + 1;
                        byte b2 = bArr[i13];
                        if (b2 < 0) {
                            if (b2 < -32) {
                                if (i15 >= i5) {
                                    return b2;
                                }
                                if (b2 >= -62) {
                                    i13 += 2;
                                    if (bArr[i15] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b2 < -16) {
                                if (i15 >= i5 - 1) {
                                    return O.alpha(bArr, i15, i5);
                                }
                                int i16 = i13 + 2;
                                byte b4 = bArr[i15];
                                if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                                    i13 += 3;
                                    if (bArr[i16] > -65) {
                                    }
                                }
                            } else {
                                if (i15 >= i5 - 2) {
                                    return O.alpha(bArr, i15, i5);
                                }
                                int i17 = i13 + 2;
                                byte b6 = bArr[i15];
                                if (b6 <= -65 && (((b6 + 112) + (b2 << 28)) >> 30) == 0) {
                                    int i18 = i13 + 3;
                                    if (bArr[i17] <= -65) {
                                        i13 += 4;
                                        if (bArr[i18] > -65) {
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i13 = i15;
                    }
                }
                return 0;
            default:
                if (((bArr.length - i5) | i13 | i5) >= 0) {
                    long j5 = i13;
                    int i19 = (int) (i5 - j5);
                    if (i19 < 16) {
                        i10 = -1;
                        i11 = 0;
                    } else {
                        i10 = -1;
                        long j6 = j5;
                        i11 = 0;
                        while (true) {
                            if (i11 < i19) {
                                long j7 = j6 + 1;
                                if (M.foxtrot(j6, bArr) >= 0) {
                                    i11++;
                                    j6 = j7;
                                }
                            } else {
                                i11 = i19;
                            }
                        }
                    }
                    int i20 = i19 - i11;
                    long j10 = j5 + i11;
                    while (true) {
                        byte b10 = 0;
                        while (true) {
                            if (i20 > 0) {
                                long j11 = j10 + 1;
                                b10 = M.foxtrot(j10, bArr);
                                if (b10 >= 0) {
                                    i20--;
                                    j10 = j11;
                                } else {
                                    j10 = j11;
                                }
                            }
                        }
                        if (i20 == 0) {
                            return 0;
                        }
                        int i21 = i20 - 1;
                        if (b10 < -32) {
                            if (i21 == 0) {
                                return b10;
                            }
                            i20 -= 2;
                            if (b10 >= -62) {
                                long j12 = j10 + 1;
                                if (M.foxtrot(j10, bArr) <= -65) {
                                    j10 = j12;
                                    i12 = i14;
                                }
                            }
                        } else if (b10 < -16) {
                            if (i21 < i14) {
                                return zulu(j10, bArr, b10, i21);
                            }
                            i20 -= 3;
                            long j13 = j10 + 1;
                            byte foxtrot = M.foxtrot(j10, bArr);
                            if (foxtrot <= -65 && ((b10 != -32 || foxtrot >= -96) && (b10 != -19 || foxtrot < -96))) {
                                j10 += 2;
                                if (M.foxtrot(j13, bArr) > -65) {
                                }
                                i12 = i14;
                            }
                        } else {
                            if (i21 < 3) {
                                return zulu(j10, bArr, b10, i21);
                            }
                            i20 -= 4;
                            long j14 = j10 + 1;
                            byte foxtrot2 = M.foxtrot(j10, bArr);
                            if (foxtrot2 <= -65 && (((foxtrot2 + 112) + (b10 << 28)) >> 30) == 0) {
                                i12 = i14;
                                long j15 = j10 + 2;
                                if (M.foxtrot(j14, bArr) <= -65) {
                                    j10 += 3;
                                    if (M.foxtrot(j15, bArr) > -65) {
                                    }
                                }
                            }
                        }
                        i14 = i12;
                    }
                    return i10;
                }
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i5)));
        }
    }
}
