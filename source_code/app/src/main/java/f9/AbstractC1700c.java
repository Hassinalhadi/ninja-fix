package f9;

import S5.l;
import ao.ad;
import b9.C0737a;
import com.google.zxing.WriterException;
import e9.C1642b;
import java.util.Arrays;

/* renamed from: f9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1700c {
    public static final int[][] alpha = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] bravo = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] charlie = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] delta = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int alpha(l lVar, boolean z2) {
        int i4;
        byte b2;
        int i5 = lVar.purple;
        int i10 = lVar.red;
        if (z2) {
            i4 = i10;
        } else {
            i4 = i5;
        }
        if (!z2) {
            i5 = i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i4; i12++) {
            byte b4 = -1;
            int i13 = 0;
            for (int i14 = 0; i14 < i5; i14++) {
                byte[][] bArr = (byte[][]) lVar.silver;
                if (z2) {
                    b2 = bArr[i12][i14];
                } else {
                    b2 = bArr[i14][i12];
                }
                if (b2 == b4) {
                    i13++;
                } else {
                    if (i13 >= 5) {
                        i11 += i13 - 2;
                    }
                    i13 = 1;
                    b4 = b2;
                }
            }
            if (i13 >= 5) {
                i11 = (i13 - 2) + i11;
            }
        }
        return i11;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:95:0x01f2. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bravo(C0737a c0737a, int i4, C1642b c1642b, int i5, l lVar) {
        char c3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char c4;
        int i16;
        int i17;
        byte[][] bArr = (byte[][]) lVar.silver;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = alpha[0].length;
        echo(0, 0, lVar);
        int i18 = lVar.purple;
        int i19 = i18 - length;
        echo(i19, 0, lVar);
        echo(0, i19, lVar);
        delta(0, 7, lVar);
        int i20 = i18 - 8;
        delta(i20, 7, lVar);
        delta(0, i20, lVar);
        foxtrot(7, 0, lVar);
        int i21 = lVar.red;
        int i22 = i21 - 8;
        foxtrot(i22, 0, lVar);
        int i23 = i21 - 7;
        foxtrot(7, i23, lVar);
        if (lVar.hotel(8, i22) != 0) {
            lVar.juliet(8, i22, 1);
            int i24 = c1642b.alpha;
            if (i24 < 2) {
                c3 = 1;
            } else {
                c3 = 1;
                int[] iArr = charlie[i24 - 1];
                int length2 = iArr.length;
                int i25 = 0;
                while (i25 < length2) {
                    int i26 = iArr[i25];
                    if (i26 >= 0) {
                        int length3 = iArr.length;
                        int i27 = 0;
                        while (i27 < length3) {
                            byte[][] bArr3 = bArr;
                            int i28 = iArr[i27];
                            if (i28 >= 0 && golf(lVar.hotel(i28, i26))) {
                                int i29 = i28 - 2;
                                int i30 = i26 - 2;
                                i10 = i26;
                                int i31 = 0;
                                while (true) {
                                    if (i31 >= 5) {
                                        break;
                                    }
                                    int[] iArr2 = bravo[i31];
                                    int i32 = i31;
                                    int i33 = 0;
                                    for (int i34 = 5; i33 < i34; i34 = 5) {
                                        int i35 = i33;
                                        lVar.juliet(i29 + i33, i30 + i32, iArr2[i35]);
                                        i33 = i35 + 1;
                                        i27 = i27;
                                    }
                                    i31 = i32 + 1;
                                }
                            } else {
                                i10 = i26;
                            }
                            i27++;
                            bArr = bArr3;
                            i26 = i10;
                        }
                    }
                    i25++;
                    bArr = bArr;
                }
            }
            byte[][] bArr4 = bArr;
            int i36 = 8;
            while (i36 < i20) {
                int i37 = i36 + 1;
                int i38 = i37 % 2;
                if (golf(lVar.hotel(i36, 6))) {
                    lVar.juliet(i36, 6, i38);
                }
                if (golf(lVar.hotel(6, i36))) {
                    lVar.juliet(6, i36, i38);
                }
                i36 = i37;
            }
            C0737a c0737a2 = new C0737a();
            if (i5 >= 0 && i5 < 8) {
                int i39 = 1;
                if (i4 != 1) {
                    i39 = 2;
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                throw null;
                            }
                        } else {
                            i39 = 3;
                        }
                    } else {
                        i39 = 0;
                    }
                }
                int i40 = (i39 << 3) | i5;
                c0737a2.bravo(i40, 5);
                c0737a2.bravo(charlie(i40, 1335), 10);
                C0737a c0737a3 = new C0737a();
                c0737a3.bravo(21522, 15);
                if (c0737a2.purple == c0737a3.purple) {
                    int i41 = 0;
                    while (true) {
                        int[] iArr3 = c0737a2.alpha;
                        if (i41 >= iArr3.length) {
                            break;
                        }
                        iArr3[i41] = iArr3[i41] ^ c0737a3.alpha[i41];
                        i41++;
                    }
                    if (c0737a2.purple == 15) {
                        int i42 = 0;
                        while (true) {
                            int i43 = c0737a2.purple;
                            if (i42 >= i43) {
                                break;
                            }
                            boolean delta2 = c0737a2.delta((i43 - 1) - i42);
                            int[] iArr4 = delta[i42];
                            int i44 = iArr4[0];
                            byte[] bArr5 = bArr4[iArr4[c3]];
                            byte b2 = delta2 ? (byte) 1 : (byte) 0;
                            bArr5[i44] = b2;
                            if (i42 < 8) {
                                i17 = (i18 - i42) - 1;
                                i16 = 8;
                            } else {
                                i16 = (i42 - 8) + i23;
                                i17 = 8;
                            }
                            bArr4[i16][i17] = b2;
                            i42++;
                        }
                        if (i24 >= 7) {
                            C0737a c0737a4 = new C0737a();
                            c0737a4.bravo(i24, 6);
                            c0737a4.bravo(charlie(i24, 7973), 12);
                            if (c0737a4.purple == 18) {
                                int i45 = 17;
                                for (int i46 = 0; i46 < 6; i46++) {
                                    for (int i47 = 0; i47 < 3; i47++) {
                                        boolean delta3 = c0737a4.delta(i45);
                                        i45--;
                                        int i48 = (i21 - 11) + i47;
                                        byte[] bArr6 = bArr4[i48];
                                        byte b4 = delta3 ? (byte) 1 : (byte) 0;
                                        bArr6[i46] = b4;
                                        bArr4[i46][i48] = b4;
                                    }
                                }
                            } else {
                                throw new WriterException("should not happen but we got: " + c0737a4.purple);
                            }
                        }
                        int i49 = i18 - 1;
                        int i50 = i21 - 1;
                        int i51 = 0;
                        int i52 = -1;
                        while (i49 > 0) {
                            if (i49 == 6) {
                                i49--;
                            }
                            while (i50 >= 0 && i50 < i21) {
                                for (int i53 = 0; i53 < 2; i53++) {
                                    int i54 = i49 - i53;
                                    if (golf(lVar.hotel(i54, i50))) {
                                        if (i51 < c0737a.purple) {
                                            boolean delta4 = c0737a.delta(i51);
                                            i51++;
                                            i11 = delta4;
                                        } else {
                                            i11 = 0;
                                        }
                                        if (i5 != -1) {
                                            switch (i5) {
                                                case 0:
                                                    i12 = i50 + i54;
                                                    i13 = i12 & 1;
                                                    if (i13 != 0) {
                                                        c4 = c3;
                                                    } else {
                                                        c4 = 0;
                                                    }
                                                    if (c4 != 0) {
                                                        i11 = ~i11;
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    i13 = i50 & 1;
                                                    if (i13 != 0) {
                                                    }
                                                    if (c4 != 0) {
                                                    }
                                                    break;
                                                case 2:
                                                    i13 = i54 % 3;
                                                    if (i13 != 0) {
                                                    }
                                                    if (c4 != 0) {
                                                    }
                                                    break;
                                                case 3:
                                                    i13 = (i50 + i54) % 3;
                                                    if (i13 != 0) {
                                                    }
                                                    if (c4 != 0) {
                                                    }
                                                    break;
                                                case 4:
                                                    i13 = ((i54 / 3) + (i50 / 2)) & 1;
                                                    if (i13 != 0) {
                                                    }
                                                    if (c4 != 0) {
                                                    }
                                                    break;
                                                case 5:
                                                    int i55 = i50 * i54;
                                                    i13 = (i55 % 3) + (i55 & 1);
                                                    if (i13 != 0) {
                                                    }
                                                    if (c4 != 0) {
                                                    }
                                                    break;
                                                case 6:
                                                    int i56 = i50 * i54;
                                                    i14 = i56 & 1;
                                                    i15 = i56 % 3;
                                                    i12 = i15 + i14;
                                                    i13 = i12 & 1;
                                                    if (i13 != 0) {
                                                    }
                                                    if (c4 != 0) {
                                                    }
                                                    break;
                                                case 7:
                                                    i15 = (i50 * i54) % 3;
                                                    i14 = (i50 + i54) & 1;
                                                    i12 = i15 + i14;
                                                    i13 = i12 & 1;
                                                    if (i13 != 0) {
                                                    }
                                                    if (c4 != 0) {
                                                    }
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(ad.zulu(i5, "Invalid mask pattern: "));
                                            }
                                        }
                                        bArr4[i50][i54] = (byte) i11;
                                    }
                                }
                                i50 += i52;
                            }
                            i52 = -i52;
                            i50 += i52;
                            i49 -= 2;
                        }
                        if (i51 == c0737a.purple) {
                            return;
                        }
                        throw new WriterException("Not all bits consumed: " + i51 + '/' + c0737a.purple);
                    }
                    throw new WriterException("should not happen but we got: " + c0737a2.purple);
                }
                throw new IllegalArgumentException("Sizes don't match");
            }
            throw new WriterException("Invalid mask pattern");
        }
        throw new WriterException();
    }

    public static int charlie(int i4, int i5) {
        if (i5 != 0) {
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i5);
            int i10 = 32 - numberOfLeadingZeros;
            int i11 = i4 << (31 - numberOfLeadingZeros);
            while (32 - Integer.numberOfLeadingZeros(i11) >= i10) {
                i11 ^= i5 << ((32 - Integer.numberOfLeadingZeros(i11)) - i10);
            }
            return i11;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static void delta(int i4, int i5, l lVar) {
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = i4 + i10;
            if (golf(lVar.hotel(i11, i5))) {
                lVar.juliet(i11, i5, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    public static void echo(int i4, int i5, l lVar) {
        for (int i10 = 0; i10 < 7; i10++) {
            int[] iArr = alpha[i10];
            for (int i11 = 0; i11 < 7; i11++) {
                lVar.juliet(i4 + i11, i5 + i10, iArr[i11]);
            }
        }
    }

    public static void foxtrot(int i4, int i5, l lVar) {
        for (int i10 = 0; i10 < 7; i10++) {
            int i11 = i5 + i10;
            if (golf(lVar.hotel(i4, i11))) {
                lVar.juliet(i4, i11, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    public static boolean golf(int i4) {
        if (i4 == -1) {
            return true;
        }
        return false;
    }
}
