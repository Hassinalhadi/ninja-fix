package Oe;

/* loaded from: classes2.dex */
public abstract class ae {
    public static final ac alpha = new Object();
    public static final ad bravo = new Object();

    public static int alpha(int i4, int i5) {
        if (i4 <= -12 && i5 <= -65) {
            return i4 ^ (i5 << 8);
        }
        return -1;
    }

    public static int bravo(byte[] bArr, int i4, int i5) {
        byte b2 = bArr[i4 - 1];
        int i10 = i5 - i4;
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
            return alpha(b2, bArr[i4]);
        }
        if (b2 > -12) {
            return -1;
        }
        return b2;
    }

    public static int charlie(byte[] bArr, int i4, int i5) {
        while (i4 < i5 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 >= i5) {
            return 0;
        }
        while (i4 < i5) {
            int i10 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i10 >= i5) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i4 += 2;
                        if (bArr[i10] > -65) {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                } else if (b2 < -16) {
                    if (i10 >= i5 - 1) {
                        return bravo(bArr, i10, i5);
                    }
                    int i11 = i4 + 2;
                    byte b4 = bArr[i10];
                    if (b4 <= -65) {
                        if (b2 != -32 || b4 >= -96) {
                            if (b2 != -19 || b4 < -96) {
                                i4 += 3;
                                if (bArr[i11] > -65) {
                                    return -1;
                                }
                            } else {
                                return -1;
                            }
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                } else {
                    if (i10 >= i5 - 2) {
                        return bravo(bArr, i10, i5);
                    }
                    int i12 = i4 + 2;
                    byte b6 = bArr[i10];
                    if (b6 <= -65) {
                        if ((((b6 + 112) + (b2 << 28)) >> 30) == 0) {
                            int i13 = i4 + 3;
                            if (bArr[i12] <= -65) {
                                i4 += 4;
                                if (bArr[i13] > -65) {
                                    return -1;
                                }
                            } else {
                                return -1;
                            }
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                }
            } else {
                i4 = i10;
            }
        }
        return 0;
    }
}
