package s6;

import F.C0121j0;
import b9.AbstractC0739c;
import b9.C0737a;
import b9.C0738b;
import c9.C0831a;
import c9.C0832b;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.zxing.WriterException;
import e9.C1642b;
import e9.EnumC1641a;
import f9.AbstractC1699b;
import f9.AbstractC1700c;
import f9.C1698a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: s6.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2746q0 {
    public static String[] alpha;

    /* JADX WARN: Code restructure failed: missing block: B:232:0x055b, code lost:
    
        r1 = new c9.C0832b[]{r12, r2}[1].bravo;
        r2 = r3 - r1.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x056e, code lost:
    
        if (r4 >= r2) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0570, code lost:
    
        r9[r32 + r4] = 0;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x057a, code lost:
    
        java.lang.System.arraycopy(r1, 0, r9, r32 + r2, r1.length);
        r1 = new byte[r3];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0584, code lost:
    
        if (r2 >= r3) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0586, code lost:
    
        r1[r2] = (byte) r9[r7 + r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0592, code lost:
    
        r0.add(new f9.C1698a(r8, r1));
        r13 = java.lang.Math.max(r13, r7);
        r14 = java.lang.Math.max(r14, r3);
        r6 = r36 + r15[0];
        r3 = r24 + 1;
        r7 = r25;
        r4 = r28;
        r9 = r29;
        r11 = r31;
        r1 = r34;
        r2 = r35;
        r8 = 8;
        r10 = 1;
        r21 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0743, code lost:
    
        if (r12 == false) goto L390;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x07df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x016d  */
    /* JADX WARN: Type inference failed for: r8v3, types: [b9.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0738b alpha(String str) {
        EnumC1641a enumC1641a;
        int i4;
        int ordinal;
        int i5;
        char c3;
        int i10;
        int length;
        int i11;
        int i12;
        byte[][] bArr;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        char c4;
        C0832b c0832b;
        int i17;
        C0832b c0832b2;
        C0832b c0832b3;
        int i18;
        int i19;
        int i20;
        char c10;
        C0832b c0832b4;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z13;
        char c11 = 6;
        char c12 = 4;
        int i25 = 8;
        int i26 = 2;
        int i27 = 1;
        if (!str.isEmpty()) {
            Charset charset = AbstractC1699b.bravo;
            EnumC1641a enumC1641a2 = EnumC1641a.BYTE;
            Charset charset2 = AbstractC0739c.bravo;
            if (charset2 != null && charset2.equals(charset)) {
                byte[] bytes = str.getBytes(AbstractC0739c.bravo);
                int length2 = bytes.length;
                if (length2 % 2 == 0) {
                    for (int i28 = 0; i28 < length2; i28 += 2) {
                        int i29 = bytes[i28] & 255;
                        if ((i29 >= 129 && i29 <= 159) || (i29 >= 224 && i29 <= 235)) {
                        }
                    }
                    z13 = true;
                    if (z13) {
                        enumC1641a = EnumC1641a.KANJI;
                        C0737a c0737a = new C0737a();
                        c0737a.bravo(enumC1641a.purple, 4);
                        C0737a c0737a2 = new C0737a();
                        ordinal = enumC1641a.ordinal();
                        if (ordinal == 1) {
                            if (ordinal != 2) {
                                if (ordinal != 4) {
                                    if (ordinal == 6) {
                                        Charset charset3 = AbstractC0739c.bravo;
                                        if (charset3 != null) {
                                            byte[] bytes2 = str.getBytes(charset3);
                                            if (bytes2.length % 2 == 0) {
                                                int length3 = bytes2.length - 1;
                                                for (int i30 = 0; i30 < length3; i30 += 2) {
                                                    int i31 = ((bytes2[i30] & 255) << 8) | (bytes2[i30 + 1] & 255);
                                                    if (i31 >= 33088 && i31 <= 40956) {
                                                        i24 = i31 - 33088;
                                                    } else if (i31 >= 57408 && i31 <= 60351) {
                                                        i24 = i31 - 49472;
                                                    } else {
                                                        i24 = -1;
                                                    }
                                                    if (i24 != -1) {
                                                        c0737a2.bravo(((i24 >> 8) * 192) + (i24 & 255), 13);
                                                    } else {
                                                        throw new WriterException("Invalid byte sequence");
                                                    }
                                                }
                                            } else {
                                                throw new WriterException("Kanji byte size not even");
                                            }
                                        } else {
                                            throw new WriterException("SJIS Charset not supported on this platform");
                                        }
                                    } else {
                                        throw new WriterException("Invalid mode: " + enumC1641a);
                                    }
                                } else {
                                    for (byte b2 : str.getBytes(charset)) {
                                        c0737a2.bravo(b2, 8);
                                    }
                                }
                                i5 = 2;
                                int alpha2 = enumC1641a.alpha(C1642b.alpha(1)) + c0737a.purple + c0737a2.purple;
                                for (i10 = 1; i10 <= 40; i10++) {
                                    C1642b alpha3 = C1642b.alpha(i10);
                                    if (AbstractC1699b.alpha(alpha2, alpha3, 1)) {
                                        int alpha4 = enumC1641a.alpha(alpha3) + c0737a.purple + c0737a2.purple;
                                        int i32 = 1;
                                        for (int i33 = 40; i32 <= i33; i33 = 40) {
                                            C1642b alpha5 = C1642b.alpha(i32);
                                            if (AbstractC1699b.alpha(alpha4, alpha5, 1)) {
                                                C0737a c0737a3 = new C0737a();
                                                int i34 = c0737a.purple;
                                                c0737a3.charlie(i34);
                                                for (int i35 = 0; i35 < i34; i35++) {
                                                    c0737a3.alpha(c0737a.delta(i35));
                                                }
                                                if (enumC1641a == enumC1641a2) {
                                                    length = c0737a2.echo();
                                                } else {
                                                    length = str.length();
                                                }
                                                int alpha6 = enumC1641a.alpha(alpha5);
                                                int i36 = 1 << alpha6;
                                                if (length < i36) {
                                                    c0737a3.bravo(length, alpha6);
                                                    int i37 = c0737a2.purple;
                                                    c0737a3.charlie(c0737a3.purple + i37);
                                                    for (int i38 = 0; i38 < i37; i38++) {
                                                        c0737a3.alpha(c0737a2.delta(i38));
                                                    }
                                                    Fe.c cVar = alpha5.bravo[av.q.mike(1)];
                                                    int i39 = 0;
                                                    for (C0121j0 c0121j0 : (C0121j0[]) cVar.red) {
                                                        i39 += c0121j0.bravo;
                                                    }
                                                    int i40 = i39 * cVar.purple;
                                                    int i41 = alpha5.charlie;
                                                    int i42 = i41 - i40;
                                                    int i43 = i42 * 8;
                                                    if (c0737a3.purple <= i43) {
                                                        for (int i44 = 0; i44 < 4 && c0737a3.purple < i43; i44++) {
                                                            c0737a3.alpha(false);
                                                        }
                                                        boolean z14 = false;
                                                        int i45 = c0737a3.purple & 7;
                                                        if (i45 > 0) {
                                                            while (i45 < 8) {
                                                                c0737a3.alpha(z14);
                                                                i45++;
                                                                z14 = false;
                                                            }
                                                        }
                                                        int echo = i42 - c0737a3.echo();
                                                        for (int i46 = 0; i46 < echo; i46++) {
                                                            if ((i46 & 1) == 0) {
                                                                i21 = 236;
                                                            } else {
                                                                i21 = 17;
                                                            }
                                                            c0737a3.bravo(i21, 8);
                                                        }
                                                        if (c0737a3.purple == i43) {
                                                            int i47 = 0;
                                                            for (C0121j0 c0121j02 : (C0121j0[]) cVar.red) {
                                                                i47 += c0121j02.bravo;
                                                            }
                                                            if (c0737a3.echo() == i42) {
                                                                ArrayList arrayList = new ArrayList(i47);
                                                                int i48 = 0;
                                                                int i49 = 0;
                                                                int i50 = 0;
                                                                int i51 = 0;
                                                                while (i48 < i47) {
                                                                    int[] iArr = new int[i27];
                                                                    int[] iArr2 = new int[i27];
                                                                    if (i48 < i47) {
                                                                        int i52 = i41 % i47;
                                                                        char c13 = c12;
                                                                        int i53 = i47 - i52;
                                                                        int i54 = i41 / i47;
                                                                        int i55 = i54 + 1;
                                                                        int i56 = i42 / i47;
                                                                        int i57 = i56 + 1;
                                                                        int i58 = i54 - i56;
                                                                        int i59 = i27;
                                                                        int i60 = i55 - i57;
                                                                        if (i58 == i60) {
                                                                            int i61 = i25;
                                                                            if (i47 == i53 + i52) {
                                                                                if (i41 == ((i57 + i60) * i52) + ((i56 + i58) * i53)) {
                                                                                    if (i48 < i53) {
                                                                                        c4 = 0;
                                                                                        iArr[0] = i56;
                                                                                        iArr2[0] = i58;
                                                                                    } else {
                                                                                        c4 = 0;
                                                                                        iArr[0] = i57;
                                                                                        iArr2[0] = i60;
                                                                                    }
                                                                                    int i62 = iArr[c4];
                                                                                    byte[] bArr2 = new byte[i62];
                                                                                    int i63 = i49 * 8;
                                                                                    int i64 = 0;
                                                                                    while (i64 < i62) {
                                                                                        int i65 = i48;
                                                                                        int[] iArr3 = iArr2;
                                                                                        int i66 = i47;
                                                                                        int i67 = 0;
                                                                                        int i68 = 0;
                                                                                        for (int i69 = i61; i67 < i69; i69 = 8) {
                                                                                            if (c0737a3.delta(i63)) {
                                                                                                i68 |= i59 << (7 - i67);
                                                                                            }
                                                                                            i63++;
                                                                                            i67++;
                                                                                        }
                                                                                        bArr2[i64] = (byte) i68;
                                                                                        i64++;
                                                                                        i48 = i65;
                                                                                        iArr2 = iArr3;
                                                                                        i47 = i66;
                                                                                        i61 = 8;
                                                                                    }
                                                                                    int i70 = i48;
                                                                                    int i71 = i47;
                                                                                    int i72 = iArr2[0];
                                                                                    int i73 = i62 + i72;
                                                                                    int[] iArr4 = new int[i73];
                                                                                    for (int i74 = 0; i74 < i62; i74++) {
                                                                                        iArr4[i74] = bArr2[i74] & 255;
                                                                                    }
                                                                                    C0831a c0831a = C0831a.golf;
                                                                                    ArrayList arrayList2 = new ArrayList();
                                                                                    arrayList2.add(new C0832b(c0831a, new int[]{i59}));
                                                                                    if (i72 != 0) {
                                                                                        int i75 = i73 - i72;
                                                                                        if (i75 > 0) {
                                                                                            C0737a c0737a4 = c0737a3;
                                                                                            if (i72 >= arrayList2.size()) {
                                                                                                C0832b c0832b5 = (C0832b) androidx.appcompat.widget.P0.amber(i59, arrayList2);
                                                                                                int i76 = i59;
                                                                                                int size = arrayList2.size();
                                                                                                while (size <= i72) {
                                                                                                    int i77 = size;
                                                                                                    C1642b c1642b = alpha5;
                                                                                                    int i78 = i76;
                                                                                                    int[] iArr5 = {i78, c0831a.alpha[(size - 1) + c0831a.foxtrot]};
                                                                                                    if (iArr5[0] == 0) {
                                                                                                        i18 = i41;
                                                                                                        int i79 = i5;
                                                                                                        int i80 = i78;
                                                                                                        while (i80 < i79 && iArr5[i80] == 0) {
                                                                                                            i80++;
                                                                                                        }
                                                                                                        if (i80 == i79) {
                                                                                                            iArr5 = new int[]{0};
                                                                                                            i19 = i42;
                                                                                                            i20 = i49;
                                                                                                            c10 = 0;
                                                                                                        } else {
                                                                                                            int i81 = 2 - i80;
                                                                                                            i19 = i42;
                                                                                                            int[] iArr6 = new int[i81];
                                                                                                            i20 = i49;
                                                                                                            c10 = 0;
                                                                                                            System.arraycopy(iArr5, i80, iArr6, 0, i81);
                                                                                                            iArr5 = iArr6;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i18 = i41;
                                                                                                        i19 = i42;
                                                                                                        i20 = i49;
                                                                                                        c10 = 0;
                                                                                                    }
                                                                                                    c0832b5.getClass();
                                                                                                    C0832b c0832b6 = c0832b5;
                                                                                                    C0831a c0831a2 = c0832b6.alpha;
                                                                                                    if (c0831a2.equals(c0831a)) {
                                                                                                        if (!c0832b6.charlie() && iArr5[c10] != 0) {
                                                                                                            int[] iArr7 = c0832b6.bravo;
                                                                                                            int length4 = iArr7.length;
                                                                                                            int length5 = iArr5.length;
                                                                                                            int[] iArr8 = new int[(length4 + length5) - 1];
                                                                                                            int[] iArr9 = iArr5;
                                                                                                            int i82 = 0;
                                                                                                            while (i82 < length4) {
                                                                                                                int i83 = length4;
                                                                                                                int i84 = iArr7[i82];
                                                                                                                int i85 = i82;
                                                                                                                int i86 = 0;
                                                                                                                while (i86 < length5) {
                                                                                                                    int i87 = i85 + i86;
                                                                                                                    iArr8[i87] = iArr8[i87] ^ c0831a2.alpha(i84, iArr9[i86]);
                                                                                                                    i86++;
                                                                                                                    length5 = length5;
                                                                                                                }
                                                                                                                i82 = i85 + 1;
                                                                                                                length4 = i83;
                                                                                                            }
                                                                                                            c0832b4 = new C0832b(c0831a2, iArr8);
                                                                                                        } else {
                                                                                                            c0832b4 = c0831a2.charlie;
                                                                                                        }
                                                                                                        arrayList2.add(c0832b4);
                                                                                                        size = i77 + 1;
                                                                                                        c0832b5 = c0832b4;
                                                                                                        alpha5 = c1642b;
                                                                                                        i41 = i18;
                                                                                                        i42 = i19;
                                                                                                        i49 = i20;
                                                                                                        i5 = 2;
                                                                                                        i76 = 1;
                                                                                                    } else {
                                                                                                        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            int i88 = i41;
                                                                                            int i89 = i42;
                                                                                            int i90 = i49;
                                                                                            C1642b c1642b2 = alpha5;
                                                                                            C0832b c0832b7 = (C0832b) arrayList2.get(i72);
                                                                                            int[] iArr10 = new int[i75];
                                                                                            System.arraycopy(iArr4, 0, iArr10, 0, i75);
                                                                                            if (i75 != 0) {
                                                                                                if (i75 > 1 && iArr10[0] == 0) {
                                                                                                    int i91 = 1;
                                                                                                    while (i91 < i75 && iArr10[i91] == 0) {
                                                                                                        i91++;
                                                                                                    }
                                                                                                    if (i91 == i75) {
                                                                                                        iArr10 = new int[]{0};
                                                                                                    } else {
                                                                                                        int i92 = i75 - i91;
                                                                                                        int[] iArr11 = new int[i92];
                                                                                                        System.arraycopy(iArr10, i91, iArr11, 0, i92);
                                                                                                        iArr10 = iArr11;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 >= 0) {
                                                                                                    int length6 = iArr10.length;
                                                                                                    int[] iArr12 = new int[length6 + i72];
                                                                                                    int i93 = 0;
                                                                                                    while (i93 < length6) {
                                                                                                        iArr12[i93] = c0831a.alpha(iArr10[i93], 1);
                                                                                                        i93++;
                                                                                                        iArr10 = iArr10;
                                                                                                    }
                                                                                                    C0832b c0832b8 = new C0832b(c0831a, iArr12);
                                                                                                    if (c0831a.equals(c0832b7.alpha)) {
                                                                                                        if (!c0832b7.charlie()) {
                                                                                                            int bravo = c0832b7.bravo();
                                                                                                            int[] iArr13 = c0832b7.bravo;
                                                                                                            if (iArr13[(iArr13.length - 1) - bravo] != 0) {
                                                                                                                int i94 = c0831a.alpha[(c0831a.delta - c0831a.bravo[r4]) - 1];
                                                                                                                C0832b c0832b9 = c0831a.charlie;
                                                                                                                C0832b c0832b10 = c0832b9;
                                                                                                                while (true) {
                                                                                                                    int i95 = i75;
                                                                                                                    if (c0832b8.bravo() < c0832b7.bravo() || c0832b8.charlie()) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    int bravo2 = c0832b8.bravo() - c0832b7.bravo();
                                                                                                                    C0832b c0832b11 = c0832b9;
                                                                                                                    int alpha7 = c0831a.alpha(c0832b8.bravo[(r5.length - 1) - c0832b8.bravo()], i94);
                                                                                                                    if (bravo2 >= 0) {
                                                                                                                        C0831a c0831a3 = c0832b7.alpha;
                                                                                                                        if (alpha7 == 0) {
                                                                                                                            c0832b2 = c0831a3.charlie;
                                                                                                                            c0832b = c0832b7;
                                                                                                                            i17 = i94;
                                                                                                                        } else {
                                                                                                                            int length7 = iArr13.length;
                                                                                                                            c0832b = c0832b7;
                                                                                                                            int[] iArr14 = new int[length7 + bravo2];
                                                                                                                            i17 = i94;
                                                                                                                            int i96 = 0;
                                                                                                                            while (i96 < length7) {
                                                                                                                                int i97 = i96;
                                                                                                                                iArr14[i97] = c0831a3.alpha(iArr13[i97], alpha7);
                                                                                                                                i96 = i97 + 1;
                                                                                                                            }
                                                                                                                            c0832b2 = new C0832b(c0831a3, iArr14);
                                                                                                                        }
                                                                                                                        if (bravo2 >= 0) {
                                                                                                                            if (alpha7 == 0) {
                                                                                                                                c0832b3 = c0832b11;
                                                                                                                            } else {
                                                                                                                                int[] iArr15 = new int[bravo2 + 1];
                                                                                                                                iArr15[0] = alpha7;
                                                                                                                                c0832b3 = new C0832b(c0831a, iArr15);
                                                                                                                            }
                                                                                                                            c0832b10 = c0832b10.alpha(c0832b3);
                                                                                                                            c0832b8 = c0832b8.alpha(c0832b2);
                                                                                                                            i75 = i95;
                                                                                                                            c0832b9 = c0832b11;
                                                                                                                            c0832b7 = c0832b;
                                                                                                                            i94 = i17;
                                                                                                                        } else {
                                                                                                                            throw new IllegalArgumentException();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        throw new IllegalArgumentException();
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                throw new ArithmeticException();
                                                                                                            }
                                                                                                        } else {
                                                                                                            throw new IllegalArgumentException("Divide by 0");
                                                                                                        }
                                                                                                    } else {
                                                                                                        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                                                                                                    }
                                                                                                } else {
                                                                                                    throw new IllegalArgumentException();
                                                                                                }
                                                                                            } else {
                                                                                                throw new IllegalArgumentException();
                                                                                            }
                                                                                        } else {
                                                                                            throw new IllegalArgumentException("No data bytes provided");
                                                                                        }
                                                                                    } else {
                                                                                        throw new IllegalArgumentException("No error correction bytes");
                                                                                    }
                                                                                } else {
                                                                                    throw new WriterException("Total bytes mismatch");
                                                                                }
                                                                            } else {
                                                                                throw new WriterException("RS blocks mismatch");
                                                                            }
                                                                        } else {
                                                                            throw new WriterException("EC bytes mismatch");
                                                                        }
                                                                    } else {
                                                                        throw new WriterException("Block ID too large");
                                                                    }
                                                                }
                                                                int i98 = i41;
                                                                C1642b c1642b3 = alpha5;
                                                                if (i42 == i49) {
                                                                    C0737a c0737a5 = new C0737a();
                                                                    for (int i99 = 0; i99 < i50; i99++) {
                                                                        Iterator it = arrayList.iterator();
                                                                        while (it.hasNext()) {
                                                                            byte[] bArr3 = ((C1698a) it.next()).alpha;
                                                                            if (i99 < bArr3.length) {
                                                                                c0737a5.bravo(bArr3[i99], 8);
                                                                            }
                                                                        }
                                                                    }
                                                                    for (int i100 = 0; i100 < i51; i100++) {
                                                                        Iterator it2 = arrayList.iterator();
                                                                        while (it2.hasNext()) {
                                                                            byte[] bArr4 = ((C1698a) it2.next()).bravo;
                                                                            if (i100 < bArr4.length) {
                                                                                c0737a5.bravo(bArr4[i100], 8);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (i98 == c0737a5.echo()) {
                                                                        int i101 = (c1642b3.alpha * 4) + 17;
                                                                        S5.l lVar = new S5.l(i101, i101);
                                                                        int i102 = LottieConstants.IterateForever;
                                                                        int i103 = -1;
                                                                        int i104 = 0;
                                                                        while (true) {
                                                                            i11 = lVar.purple;
                                                                            i12 = lVar.red;
                                                                            if (i104 >= 8) {
                                                                                break;
                                                                            }
                                                                            boolean z15 = true;
                                                                            AbstractC1700c.bravo(c0737a5, 1, c1642b3, i104, lVar);
                                                                            int i105 = 0;
                                                                            int alpha8 = AbstractC1700c.alpha(lVar, false) + AbstractC1700c.alpha(lVar, true);
                                                                            int i106 = 0;
                                                                            int i107 = 0;
                                                                            while (true) {
                                                                                int i108 = i12 - 1;
                                                                                bArr = (byte[][]) lVar.silver;
                                                                                if (i106 >= i108) {
                                                                                    break;
                                                                                }
                                                                                byte[] bArr5 = bArr[i106];
                                                                                int i109 = i107;
                                                                                int i110 = i105;
                                                                                while (i110 < i11 - 1) {
                                                                                    byte b4 = bArr5[i110];
                                                                                    int i111 = i110 + 1;
                                                                                    boolean z16 = z15;
                                                                                    if (b4 == bArr5[i111]) {
                                                                                        byte[] bArr6 = bArr[i106 + 1];
                                                                                        if (b4 == bArr6[i110] && b4 == bArr6[i111]) {
                                                                                            i109++;
                                                                                        }
                                                                                    }
                                                                                    i110 = i111;
                                                                                    z15 = z16;
                                                                                }
                                                                                i106++;
                                                                                i107 = i109;
                                                                                i105 = 0;
                                                                                z15 = true;
                                                                            }
                                                                            int i112 = (i107 * 3) + alpha8;
                                                                            int i113 = 0;
                                                                            int i114 = 0;
                                                                            while (i113 < i12) {
                                                                                int i115 = 0;
                                                                                while (i115 < i11) {
                                                                                    byte[] bArr7 = bArr[i113];
                                                                                    int i116 = i115 + 6;
                                                                                    if (i116 < i11) {
                                                                                        i13 = i114;
                                                                                        if (bArr7[i115] == 1 && bArr7[i115 + 1] == 0 && bArr7[i115 + 2] == 1 && bArr7[i115 + 3] == 1 && bArr7[i115 + 4] == 1 && bArr7[i115 + 5] == 0 && bArr7[i116] == 1) {
                                                                                            int i117 = i115 - 4;
                                                                                            if (i117 >= 0 && bArr7.length >= i115) {
                                                                                                while (i117 < i115) {
                                                                                                    if (bArr7[i117] != 1) {
                                                                                                        i117++;
                                                                                                    }
                                                                                                }
                                                                                                z11 = true;
                                                                                                if (z11) {
                                                                                                    int i118 = i115 + 7;
                                                                                                    int i119 = i115 + 11;
                                                                                                    if (i118 >= 0 && bArr7.length >= i119) {
                                                                                                        while (i118 < i119) {
                                                                                                            int i120 = i118;
                                                                                                            if (bArr7[i118] != 1) {
                                                                                                                i118 = i120 + 1;
                                                                                                            }
                                                                                                        }
                                                                                                        z12 = true;
                                                                                                    }
                                                                                                    z12 = false;
                                                                                                    break;
                                                                                                }
                                                                                                i114 = i13 + 1;
                                                                                                i14 = i113 + 6;
                                                                                                if (i14 < i12) {
                                                                                                    if (bArr[i113][i115] == 1 && bArr[i113 + 1][i115] == 0 && bArr[i113 + 2][i115] == 1 && bArr[i113 + 3][i115] == 1 && bArr[i113 + 4][i115] == 1 && bArr[i113 + 5][i115] == 0 && bArr[i14][i115] == 1) {
                                                                                                        int i121 = i113 - 4;
                                                                                                        if (i121 >= 0 && bArr.length >= i113) {
                                                                                                            while (i121 < i113) {
                                                                                                                if (bArr[i121][i115] != 1) {
                                                                                                                    i121++;
                                                                                                                }
                                                                                                            }
                                                                                                            z2 = true;
                                                                                                            if (z2) {
                                                                                                                int i122 = i113 + 7;
                                                                                                                int i123 = i113 + 11;
                                                                                                                if (i122 < 0 || bArr.length < i123) {
                                                                                                                    i15 = i113;
                                                                                                                    i16 = 1;
                                                                                                                } else {
                                                                                                                    while (i122 < i123) {
                                                                                                                        i15 = i113;
                                                                                                                        i16 = 1;
                                                                                                                        if (bArr[i122][i115] != 1) {
                                                                                                                            i122++;
                                                                                                                            i113 = i15;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i15 = i113;
                                                                                                                    i16 = 1;
                                                                                                                    z10 = true;
                                                                                                                    if (!z10) {
                                                                                                                        i115 += i16;
                                                                                                                        i113 = i15;
                                                                                                                    }
                                                                                                                }
                                                                                                                z10 = false;
                                                                                                                if (!z10) {
                                                                                                                }
                                                                                                            } else {
                                                                                                                i15 = i113;
                                                                                                                i16 = 1;
                                                                                                            }
                                                                                                            i114 += i16;
                                                                                                            i115 += i16;
                                                                                                            i113 = i15;
                                                                                                        }
                                                                                                        z2 = false;
                                                                                                        if (z2) {
                                                                                                        }
                                                                                                        i114 += i16;
                                                                                                        i115 += i16;
                                                                                                        i113 = i15;
                                                                                                    } else {
                                                                                                        i15 = i113;
                                                                                                        i16 = 1;
                                                                                                    }
                                                                                                } else {
                                                                                                    i15 = i113;
                                                                                                    i16 = 1;
                                                                                                }
                                                                                                i115 += i16;
                                                                                                i113 = i15;
                                                                                            }
                                                                                            z11 = false;
                                                                                            if (z11) {
                                                                                            }
                                                                                            i114 = i13 + 1;
                                                                                            i14 = i113 + 6;
                                                                                            if (i14 < i12) {
                                                                                            }
                                                                                            i115 += i16;
                                                                                            i113 = i15;
                                                                                        }
                                                                                    } else {
                                                                                        i13 = i114;
                                                                                    }
                                                                                    i114 = i13;
                                                                                    i14 = i113 + 6;
                                                                                    if (i14 < i12) {
                                                                                    }
                                                                                    i115 += i16;
                                                                                    i113 = i15;
                                                                                }
                                                                                i113++;
                                                                                i114 = i114;
                                                                            }
                                                                            int i124 = (i114 * 40) + i112;
                                                                            int i125 = 0;
                                                                            int i126 = 0;
                                                                            while (i125 < i12) {
                                                                                byte[] bArr8 = bArr[i125];
                                                                                int i127 = i126;
                                                                                for (int i128 = 0; i128 < i11; i128++) {
                                                                                    if (bArr8[i128] == 1) {
                                                                                        i127++;
                                                                                    }
                                                                                }
                                                                                i125++;
                                                                                i126 = i127;
                                                                            }
                                                                            int i129 = i12 * i11;
                                                                            int abs = (((Math.abs((i126 * 2) - i129) * 10) / i129) * 10) + i124;
                                                                            if (abs < i102) {
                                                                                i102 = abs;
                                                                                i103 = i104;
                                                                            }
                                                                            i104++;
                                                                        }
                                                                        AbstractC1700c.bravo(c0737a5, 1, c1642b3, i103, lVar);
                                                                        int i130 = i11 + 8;
                                                                        int i131 = i12 + 8;
                                                                        int max = Math.max(600, i130);
                                                                        int max2 = Math.max(600, i131);
                                                                        int min = Math.min(max / i130, max2 / i131);
                                                                        int i132 = (max - (i11 * min)) / 2;
                                                                        int i133 = (max2 - (i12 * min)) / 2;
                                                                        ?? obj = new Object();
                                                                        if (max >= 1 && max2 >= 1) {
                                                                            obj.alpha = max;
                                                                            obj.purple = max2;
                                                                            int i134 = (max + 31) / 32;
                                                                            obj.red = i134;
                                                                            obj.silver = new int[i134 * max2];
                                                                            int i135 = 0;
                                                                            while (i135 < i12) {
                                                                                int i136 = i132;
                                                                                int i137 = 0;
                                                                                while (i137 < i11) {
                                                                                    if (lVar.hotel(i137, i135) == 1) {
                                                                                        if (i133 >= 0 && i136 >= 0) {
                                                                                            if (min >= 1 && min >= 1) {
                                                                                                int i138 = i136 + min;
                                                                                                int i139 = i133 + min;
                                                                                                if (i139 <= obj.purple && i138 <= obj.alpha) {
                                                                                                    for (int i140 = i133; i140 < i139; i140++) {
                                                                                                        int i141 = obj.red * i140;
                                                                                                        int i142 = i136;
                                                                                                        while (i142 < i138) {
                                                                                                            int i143 = (i142 / 32) + i141;
                                                                                                            int i144 = min;
                                                                                                            int[] iArr16 = obj.silver;
                                                                                                            iArr16[i143] = iArr16[i143] | (1 << (i142 & 31));
                                                                                                            i142++;
                                                                                                            min = i144;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    throw new IllegalArgumentException("The region must fit inside the matrix");
                                                                                                }
                                                                                            } else {
                                                                                                throw new IllegalArgumentException("Height and width must be at least 1");
                                                                                            }
                                                                                        } else {
                                                                                            throw new IllegalArgumentException("Left and top must be nonnegative");
                                                                                        }
                                                                                    }
                                                                                    int i145 = min;
                                                                                    i137++;
                                                                                    i136 += i145;
                                                                                    min = i145;
                                                                                }
                                                                                i135++;
                                                                                i133 += min;
                                                                            }
                                                                            return obj;
                                                                        }
                                                                        throw new IllegalArgumentException("Both dimensions must be greater than 0");
                                                                    }
                                                                    StringBuilder sierra = Q0.c.sierra(i98, "Interleaving error: ", " and ");
                                                                    sierra.append(c0737a5.echo());
                                                                    sierra.append(" differ.");
                                                                    throw new WriterException(sierra.toString());
                                                                }
                                                                throw new WriterException("Data bytes does not match offset");
                                                            }
                                                            throw new WriterException("Number of bits and data bytes does not match");
                                                        }
                                                        throw new WriterException("Bits size does not equal capacity");
                                                    }
                                                    throw new WriterException("data bits cannot fit in the QR Code" + c0737a3.purple + " > " + i43);
                                                }
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(length);
                                                sb2.append(" is bigger than ");
                                                sb2.append(i36 - 1);
                                                throw new WriterException(sb2.toString());
                                            }
                                            i32++;
                                        }
                                        throw new WriterException("Data too big");
                                    }
                                }
                                throw new WriterException("Data too big");
                            }
                            int length8 = str.length();
                            int i146 = 0;
                            while (i146 < length8) {
                                char charAt = str.charAt(i146);
                                int[] iArr17 = AbstractC1699b.alpha;
                                if (charAt < '`') {
                                    i22 = iArr17[charAt];
                                } else {
                                    i22 = -1;
                                }
                                if (i22 != -1) {
                                    int i147 = i26;
                                    int i148 = i146 + 1;
                                    if (i148 < length8) {
                                        char charAt2 = str.charAt(i148);
                                        if (charAt2 < '`') {
                                            i23 = iArr17[charAt2];
                                        } else {
                                            i23 = -1;
                                        }
                                        if (i23 != -1) {
                                            c0737a2.bravo((i22 * 45) + i23, 11);
                                            i146 += 2;
                                        } else {
                                            throw new WriterException();
                                        }
                                    } else {
                                        c0737a2.bravo(i22, 6);
                                        i146 = i148;
                                    }
                                    i26 = i147;
                                } else {
                                    throw new WriterException();
                                }
                            }
                            i5 = i26;
                        } else {
                            i5 = 2;
                            int length9 = str.length();
                            int i149 = 0;
                            while (i149 < length9) {
                                int charAt3 = str.charAt(i149) - '0';
                                int i150 = i149 + 2;
                                if (i150 < length9) {
                                    c3 = c11;
                                    c0737a2.bravo(A0.z.foxtrot(str.charAt(i149 + 1) - '0', 10, charAt3 * 100, str.charAt(i150) - '0'), 10);
                                    i149 += 3;
                                } else {
                                    c3 = c11;
                                    i149++;
                                    if (i149 < length9) {
                                        c0737a2.bravo((charAt3 * 10) + (str.charAt(i149) - '0'), 7);
                                        i149 = i150;
                                    } else {
                                        c0737a2.bravo(charAt3, 4);
                                    }
                                }
                                c11 = c3;
                            }
                        }
                        int alpha22 = enumC1641a.alpha(C1642b.alpha(1)) + c0737a.purple + c0737a2.purple;
                        while (i10 <= 40) {
                        }
                        throw new WriterException("Data too big");
                    }
                }
                z13 = false;
                if (z13) {
                }
            }
            int i151 = 0;
            boolean z17 = false;
            boolean z18 = false;
            while (true) {
                if (i151 < str.length()) {
                    char charAt4 = str.charAt(i151);
                    if (charAt4 >= '0' && charAt4 <= '9') {
                        z18 = true;
                    } else {
                        if (charAt4 < '`') {
                            i4 = AbstractC1699b.alpha[charAt4];
                        } else {
                            i4 = -1;
                        }
                        if (i4 == -1) {
                            break;
                        }
                        z17 = true;
                    }
                    i151++;
                } else if (z17) {
                    enumC1641a = EnumC1641a.ALPHANUMERIC;
                } else if (z18) {
                    enumC1641a = EnumC1641a.NUMERIC;
                }
            }
            enumC1641a = enumC1641a2;
            C0737a c0737a6 = new C0737a();
            c0737a6.bravo(enumC1641a.purple, 4);
            C0737a c0737a22 = new C0737a();
            ordinal = enumC1641a.ordinal();
            if (ordinal == 1) {
            }
            int alpha222 = enumC1641a.alpha(C1642b.alpha(1)) + c0737a6.purple + c0737a22.purple;
            while (i10 <= 40) {
            }
            throw new WriterException("Data too big");
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
