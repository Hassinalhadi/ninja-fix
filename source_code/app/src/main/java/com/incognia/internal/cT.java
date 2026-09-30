package com.incognia.internal;

import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public abstract class cT {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ boolean f10252b = true;

    public static byte[] W(int i4, byte[] bArr) {
        boolean z2;
        boolean z10;
        byte[] bArr2;
        int i5;
        int i10;
        int length = bArr.length;
        int i11 = 0;
        if ((i4 & 1) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i4 & 2) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i4 & 8) == 0) {
            bArr2 = gjm.f10494b;
        } else {
            bArr2 = gjm.f10493W;
        }
        if (z10) {
            i5 = 19;
        } else {
            i5 = -1;
        }
        int i12 = (length / 3) * 4;
        if (z2) {
            if (length % 3 > 0) {
                i12 += 4;
            }
        } else {
            int i13 = length % 3;
            if (i13 != 1) {
                if (i13 == 2) {
                    i12 += 3;
                }
            } else {
                i12 += 2;
            }
        }
        if (z10 && length > 0) {
            i12 += ((length - 1) / 57) + 1;
        }
        byte[] bArr3 = new byte[i12];
        int i14 = i5;
        int i15 = 0;
        while (true) {
            int i16 = i11 + 3;
            if (i16 > length) {
                break;
            }
            int i17 = (bArr[i11 + 2] & 255) | ((bArr[i11] & 255) << 16) | ((bArr[i11 + 1] & 255) << 8);
            bArr3[i15] = bArr2[(i17 >> 18) & 63];
            bArr3[i15 + 1] = bArr2[(i17 >> 12) & 63];
            bArr3[i15 + 2] = bArr2[(i17 >> 6) & 63];
            bArr3[i15 + 3] = bArr2[i17 & 63];
            int i18 = i15 + 4;
            i14--;
            if (i14 == 0) {
                i15 += 5;
                bArr3[i18] = 10;
                i14 = 19;
            } else {
                i15 = i18;
            }
            i11 = i16;
        }
        if (i11 == length - 1) {
            int i19 = i11 + 1;
            int i20 = (bArr[i11] & 255) << 4;
            bArr3[i15] = bArr2[(i20 >> 6) & 63];
            int i21 = i15 + 2;
            bArr3[i15 + 1] = bArr2[i20 & 63];
            if (z2) {
                int i22 = i15 + 3;
                bArr3[i21] = 61;
                i15 += 4;
                bArr3[i22] = 61;
            } else {
                i15 = i21;
            }
            if (z10) {
                bArr3[i15] = 10;
                i15++;
            }
            i11 = i19;
        } else if (i11 == length - 2) {
            int i23 = i11 + 1;
            int i24 = (bArr[i11] & 255) << 10;
            i11 += 2;
            int i25 = ((bArr[i23] & 255) << 2) | i24;
            bArr3[i15] = bArr2[(i25 >> 12) & 63];
            bArr3[i15 + 1] = bArr2[(i25 >> 6) & 63];
            int i26 = i15 + 3;
            bArr3[i15 + 2] = bArr2[i25 & 63];
            if (z2) {
                i15 += 4;
                bArr3[i26] = 61;
            } else {
                i15 = i26;
            }
            if (z10) {
                i10 = i15 + 1;
                bArr3[i15] = 10;
                i15 = i10;
            }
        } else if (z10 && i15 > 0 && i14 != 19) {
            i10 = i15 + 1;
            bArr3[i15] = 10;
            i15 = i10;
        }
        if (!gjm.f10495f9 && i11 != length) {
            throw new AssertionError();
        }
        if (!f10252b && i15 != i12) {
            throw new AssertionError();
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00db, code lost:
    
        if (r6 != 4) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] b(int i4, byte[] bArr) {
        int length = bArr.length;
        int i5 = (length * 3) / 4;
        byte[] bArr2 = new byte[i5];
        int[] iArr = ak4.f10111b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length) {
            if (i11 == 0) {
                while (true) {
                    int i14 = i10 + 4;
                    if (i14 > length || (i12 = (iArr[bArr[i10] & 255] << 18) | (iArr[bArr[i10 + 1] & 255] << 12) | (iArr[bArr[i10 + 2] & 255] << 6) | iArr[bArr[i10 + 3] & 255]) < 0) {
                        break;
                    }
                    bArr2[i13 + 2] = (byte) i12;
                    bArr2[i13 + 1] = (byte) (i12 >> 8);
                    bArr2[i13] = (byte) (i12 >> 16);
                    i13 += 3;
                    i10 = i14;
                }
                if (i10 >= length) {
                    break;
                }
            }
            int i15 = i10 + 1;
            int i16 = iArr[bArr[i10] & 255];
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5 && i16 != -1) {
                                    break;
                                }
                                i10 = i15;
                            } else if (i16 != -2) {
                                if (i16 != -1) {
                                    break;
                                }
                                i10 = i15;
                            }
                        } else {
                            if (i16 >= 0) {
                                i12 = (i12 << 6) | i16;
                                bArr2[i13 + 2] = (byte) i12;
                                bArr2[i13 + 1] = (byte) (i12 >> 8);
                                bArr2[i13] = (byte) (i12 >> 16);
                                i13 += 3;
                                i11 = 0;
                            } else if (i16 == -2) {
                                bArr2[i13 + 1] = (byte) (i12 >> 2);
                                bArr2[i13] = (byte) (i12 >> 10);
                                i13 += 2;
                                i11 = 5;
                            } else if (i16 != -1) {
                                break;
                            }
                            i10 = i15;
                        }
                    } else {
                        if (i16 < 0) {
                            if (i16 == -2) {
                                bArr2[i13] = (byte) (i12 >> 4);
                                i11 = 4;
                                i13++;
                            } else if (i16 != -1) {
                                break;
                            }
                            i10 = i15;
                        }
                        i12 = (i12 << 6) | i16;
                    }
                } else {
                    if (i16 < 0) {
                        if (i16 != -1) {
                            break;
                        }
                        i10 = i15;
                    }
                    i12 = (i12 << 6) | i16;
                }
                i11++;
                i10 = i15;
            } else {
                if (i16 >= 0) {
                    i11++;
                    i12 = i16;
                } else if (i16 != -1) {
                    break;
                }
                i10 = i15;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    int i17 = i13 + 1;
                    bArr2[i13] = (byte) (i12 >> 10);
                    i13 += 2;
                    bArr2[i17] = (byte) (i12 >> 2);
                }
            } else {
                bArr2[i13] = (byte) (i12 >> 4);
                i13++;
            }
            if (i13 == i5) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i13];
            System.arraycopy(bArr2, 0, bArr3, 0, i13);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static String f9(int i4, byte[] bArr) {
        try {
            return new String(W(i4, bArr), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
