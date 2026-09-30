package A7;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class g {
    public static final Charset alpha = Charset.forName("UTF-8");

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e2, code lost:
    
        if (r7 != 4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] alpha(String str) {
        byte[] bytes = str.getBytes(alpha);
        int length = bytes.length;
        int i4 = (length * 3) / 4;
        byte[] bArr = new byte[i4];
        int[] iArr = f.bravo;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i5 < length) {
            if (i10 == 0) {
                while (true) {
                    int i13 = i5 + 4;
                    if (i13 > length || (i11 = (iArr[bytes[i5] & 255] << 18) | (iArr[bytes[i5 + 1] & 255] << 12) | (iArr[bytes[i5 + 2] & 255] << 6) | iArr[bytes[i5 + 3] & 255]) < 0) {
                        break;
                    }
                    bArr[i12 + 2] = (byte) i11;
                    bArr[i12 + 1] = (byte) (i11 >> 8);
                    bArr[i12] = (byte) (i11 >> 16);
                    i12 += 3;
                    i5 = i13;
                }
                if (i5 >= length) {
                    break;
                }
            }
            int i14 = i5 + 1;
            int i15 = iArr[bytes[i5] & 255];
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5 && i15 != -1) {
                                    break;
                                }
                                i5 = i14;
                            } else {
                                if (i15 == -2) {
                                    i10++;
                                } else if (i15 != -1) {
                                    break;
                                }
                                i5 = i14;
                            }
                        } else if (i15 >= 0) {
                            i15 |= i11 << 6;
                            bArr[i12 + 2] = (byte) i15;
                            bArr[i12 + 1] = (byte) (i15 >> 8);
                            bArr[i12] = (byte) (i15 >> 16);
                            i12 += 3;
                            i10 = 0;
                        } else {
                            if (i15 == -2) {
                                bArr[i12 + 1] = (byte) (i11 >> 2);
                                bArr[i12] = (byte) (i11 >> 10);
                                i12 += 2;
                                i10 = 5;
                            } else if (i15 != -1) {
                                break;
                            }
                            i5 = i14;
                        }
                    } else {
                        if (i15 < 0) {
                            if (i15 == -2) {
                                bArr[i12] = (byte) (i11 >> 4);
                                i10 = 4;
                                i12++;
                            } else if (i15 != -1) {
                                break;
                            }
                            i5 = i14;
                        }
                        i15 |= i11 << 6;
                    }
                } else {
                    if (i15 < 0) {
                        if (i15 != -1) {
                            break;
                        }
                        i5 = i14;
                    }
                    i15 |= i11 << 6;
                }
                i10++;
            } else {
                if (i15 < 0) {
                    if (i15 != -1) {
                        break;
                    }
                    i5 = i14;
                }
                i10++;
            }
            i11 = i15;
            i5 = i14;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    int i16 = i12 + 1;
                    bArr[i12] = (byte) (i11 >> 10);
                    i12 += 2;
                    bArr[i16] = (byte) (i11 >> 2);
                }
            } else {
                bArr[i12] = (byte) (i11 >> 4);
                i12++;
            }
            if (i12 == i4) {
                return bArr;
            }
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, 0, bArr2, 0, i12);
            return bArr2;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static byte[] bravo(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = f.charlie;
        int i4 = (length / 3) * 4;
        if (length % 3 > 0) {
            i4 += 4;
        }
        byte[] bArr3 = new byte[i4];
        int i5 = 0;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            int i12 = i5 + 3;
            if (i12 > length) {
                break;
            }
            int i13 = (bArr[i5 + 2] & 255) | ((bArr[i5] & 255) << 16) | ((bArr[i5 + 1] & 255) << 8);
            bArr3[i11] = bArr2[(i13 >> 18) & 63];
            bArr3[i11 + 1] = bArr2[(i13 >> 12) & 63];
            bArr3[i11 + 2] = bArr2[(i13 >> 6) & 63];
            bArr3[i11 + 3] = bArr2[i13 & 63];
            int i14 = i11 + 4;
            i10--;
            if (i10 == 0) {
                i11 += 5;
                bArr3[i14] = 10;
                i10 = 19;
            } else {
                i11 = i14;
            }
            i5 = i12;
        }
        if (i5 == length - 1) {
            int i15 = (bArr[i5] & 255) << 4;
            bArr3[i11] = bArr2[(i15 >> 6) & 63];
            bArr3[i11 + 1] = bArr2[i15 & 63];
            bArr3[i11 + 2] = 61;
            bArr3[i11 + 3] = 61;
            return bArr3;
        }
        if (i5 == length - 2) {
            int i16 = ((bArr[i5 + 1] & 255) << 2) | ((bArr[i5] & 255) << 10);
            bArr3[i11] = bArr2[(i16 >> 12) & 63];
            bArr3[i11 + 1] = bArr2[(i16 >> 6) & 63];
            bArr3[i11 + 2] = bArr2[i16 & 63];
            bArr3[i11 + 3] = 61;
        }
        return bArr3;
    }
}
