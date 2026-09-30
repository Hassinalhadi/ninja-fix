package com.google.protobuf;

/* loaded from: classes2.dex */
public final class M extends az {
    public final /* synthetic */ int charlie;

    public static int delta(long j5, byte[] bArr, int i4, int i5) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    return N.delta(i4, L.golf(j5, bArr), L.golf(j5 + 1, bArr));
                }
                throw new AssertionError();
            }
            return N.charlie(i4, L.golf(j5, bArr));
        }
        az azVar = N.alpha;
        if (i4 > -12) {
            return -1;
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r27 + r5;
     */
    @Override // com.google.protobuf.az
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int alpha(String str, byte[] bArr, int i4, int i5) {
        int i10;
        int i11;
        char charAt;
        long j5;
        long j6;
        long j7;
        int i12;
        char charAt2;
        switch (this.charlie) {
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
                            L.kilo(bArr, j10, (byte) charAt2);
                            i20++;
                            j10 = 1 + j10;
                        }
                    }
                    if (i20 != length2) {
                        while (i20 < length2) {
                            char charAt5 = str.charAt(i20);
                            if (charAt5 < 128 && j10 < j11) {
                                L.kilo(bArr, j10, (byte) charAt5);
                                j7 = j11;
                                j6 = j5;
                                j10 += j5;
                            } else if (charAt5 < 2048 && j10 <= j11 - 2) {
                                j6 = j5;
                                long j12 = j10 + j6;
                                L.kilo(bArr, j10, (byte) ((charAt5 >>> 6) | 960));
                                j10 += 2;
                                L.kilo(bArr, j12, (byte) ((charAt5 & '?') | 128));
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
                                                L.kilo(bArr, j10, (byte) ((codePoint2 >>> 18) | 240));
                                                L.kilo(bArr, j10 + j6, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                long j13 = j10 + 3;
                                                L.kilo(bArr, j10 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                j10 += 4;
                                                L.kilo(bArr, j13, (byte) ((codePoint2 & 63) | 128));
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
                                L.kilo(bArr, j10, (byte) ((charAt5 >>> '\f') | 480));
                                j7 = j11;
                                long j14 = j10 + 2;
                                L.kilo(bArr, j10 + j6, (byte) (((charAt5 >>> 6) & 63) | 128));
                                j10 += 3;
                                L.kilo(bArr, j14, (byte) ((charAt5 & '?') | 128));
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0094 A[SYNTHETIC] */
    @Override // com.google.protobuf.az
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int charlie(byte[] bArr, int i4, int i5) {
        int i10;
        int i11;
        int i12;
        long j5;
        byte b2;
        long j6;
        byte golf;
        int i13 = i4;
        switch (this.charlie) {
            case 0:
                while (i13 < i5 && bArr[i13] >= 0) {
                    i13++;
                }
                if (i13 < i5) {
                    while (i13 < i5) {
                        int i14 = i13 + 1;
                        byte b4 = bArr[i13];
                        if (b4 < 0) {
                            if (b4 < -32) {
                                if (i14 >= i5) {
                                    return b4;
                                }
                                if (b4 >= -62) {
                                    i13 += 2;
                                    if (bArr[i14] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b4 < -16) {
                                if (i14 >= i5 - 1) {
                                    return N.alpha(bArr, i14, i5);
                                }
                                int i15 = i13 + 2;
                                byte b6 = bArr[i14];
                                if (b6 <= -65 && ((b4 != -32 || b6 >= -96) && (b4 != -19 || b6 < -96))) {
                                    i13 += 3;
                                    if (bArr[i15] > -65) {
                                    }
                                }
                            } else {
                                if (i14 >= i5 - 2) {
                                    return N.alpha(bArr, i14, i5);
                                }
                                int i16 = i13 + 2;
                                byte b10 = bArr[i14];
                                if (b10 <= -65 && (((b10 + 112) + (b4 << 28)) >> 30) == 0) {
                                    int i17 = i13 + 3;
                                    if (bArr[i16] <= -65) {
                                        i13 += 4;
                                        if (bArr[i17] > -65) {
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i13 = i14;
                    }
                }
                return 0;
            default:
                if (((bArr.length - i5) | i13 | i5) >= 0) {
                    long j7 = i13;
                    int i18 = (int) (i5 - j7);
                    if (i18 < 16) {
                        i10 = 0;
                    } else {
                        int i19 = 8 - (((int) j7) & 7);
                        long j10 = j7;
                        i10 = 0;
                        while (i10 < i19) {
                            long j11 = j10 + 1;
                            if (L.golf(j10, bArr) >= 0) {
                                i10++;
                                j10 = j11;
                            }
                        }
                        while (true) {
                            int i20 = i10 + 8;
                            if (i20 <= i18) {
                                i11 = -1;
                                if ((L.charlie.hotel(L.foxtrot + j10, bArr) & (-9187201950435737472L)) == 0) {
                                    j10 += 8;
                                    i10 = i20;
                                }
                            } else {
                                i11 = -1;
                            }
                        }
                        while (true) {
                            if (i10 < i18) {
                                long j12 = j10 + 1;
                                if (L.golf(j10, bArr) >= 0) {
                                    i10++;
                                    j10 = j12;
                                }
                            } else {
                                i10 = i18;
                            }
                        }
                        i12 = i18 - i10;
                        j5 = j7 + i10;
                        while (true) {
                            b2 = 0;
                            while (true) {
                                if (i12 <= 0) {
                                    j6 = j5 + 1;
                                    golf = L.golf(j5, bArr);
                                    if (golf >= 0) {
                                        i12--;
                                        j5 = j6;
                                        b2 = golf;
                                    } else {
                                        j5 = j6;
                                        b2 = golf;
                                    }
                                }
                            }
                            if (i12 != 0) {
                                return 0;
                            }
                            int i21 = i12 - 1;
                            if (b2 < -32) {
                                if (i21 == 0) {
                                    return b2;
                                }
                                i12 -= 2;
                                if (b2 >= -62) {
                                    long j13 = j5 + 1;
                                    if (L.golf(j5, bArr) <= -65) {
                                        j5 = j13;
                                    }
                                }
                            } else if (b2 < -16) {
                                if (i21 < 2) {
                                    return delta(j5, bArr, b2, i21);
                                }
                                i12 -= 3;
                                long j14 = j5 + 1;
                                byte golf2 = L.golf(j5, bArr);
                                if (golf2 <= -65 && ((b2 != -32 || golf2 >= -96) && (b2 != -19 || golf2 < -96))) {
                                    j5 += 2;
                                    if (L.golf(j14, bArr) > -65) {
                                    }
                                }
                            } else {
                                if (i21 < 3) {
                                    return delta(j5, bArr, b2, i21);
                                }
                                i12 -= 4;
                                long j15 = j5 + 1;
                                byte golf3 = L.golf(j5, bArr);
                                if (golf3 <= -65 && (((golf3 + 112) + (b2 << 28)) >> 30) == 0) {
                                    long j16 = j5 + 2;
                                    if (L.golf(j15, bArr) <= -65) {
                                        j5 += 3;
                                        if (L.golf(j16, bArr) > -65) {
                                        }
                                    }
                                }
                            }
                        }
                        return i11;
                    }
                    i11 = -1;
                    i12 = i18 - i10;
                    j5 = j7 + i10;
                    while (true) {
                        b2 = 0;
                        while (true) {
                            if (i12 <= 0) {
                            }
                            i12--;
                            j5 = j6;
                            b2 = golf;
                        }
                        if (i12 != 0) {
                        }
                    }
                    return i11;
                }
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i5)));
        }
    }
}
