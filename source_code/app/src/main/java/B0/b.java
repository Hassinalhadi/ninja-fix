package B0;

import A2.q;
import Aa.g;
import B9.C0058p;
import J.e;
import Q0.k;
import a0.C0347ag;
import a0.ao;
import android.os.Handler;
import bv.aa;
import bv.ah;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function0;
import s0.C;
import s0.C2563x;
import s0.L;
import s0.U;
import s0.al;
import s6.AbstractC2609a7;
import s6.AbstractC2728o0;
import t0.C2907c0;

/* loaded from: classes3.dex */
public final class b {
    public final a alpha;
    public final c bravo;
    public final ah charlie;
    public boolean delta;
    public boolean echo;
    public boolean foxtrot;
    public q golf;
    public long hotel;
    public final g india;
    public final Z.a juliet;

    public b() {
        a aVar = new a((char) 0, 0);
        aVar.charlie = new long[192];
        aVar.delta = new long[192];
        this.alpha = aVar;
        this.bravo = new c();
        this.charlie = new ah();
        this.hotel = -1L;
        this.india = new g(6, this);
        this.juliet = new Z.a();
    }

    public static long golf(al alVar) {
        float[] bravo;
        int alpha;
        C0058p c0058p = alVar.f13305x;
        L l10 = (L) c0058p.foxtrot;
        L l11 = (C2563x) c0058p.echo;
        long j5 = 0;
        while (l11 != null && l11 != l10) {
            U u4 = l11.C;
            j5 = AbstractC2609a7.bravo(j5, l11.f13262t);
            l11 = l11.f13253k;
            if (u4 != null && (alpha = AbstractC2728o0.alpha((bravo = ((C2907c0) u4).bravo()))) != 3) {
                if ((alpha & 2) == 0) {
                    return 9223372034707292159L;
                }
                j5 = C0347ag.bravo(j5, bravo);
            }
        }
        return AbstractC2609a7.charlie(j5);
    }

    public static void hotel(al alVar) {
        long j5;
        long j6 = ((L) alVar.f13305x.foxtrot).f13262t;
        al victor = alVar.victor();
        if (victor != null) {
            if (k.alpha(victor.red, 9223372034707292159L)) {
                hotel(victor);
            }
            long j7 = victor.red;
            if (!k.alpha(j7, 9223372034707292159L)) {
                if (victor.white) {
                    j5 = golf(victor);
                    victor.teal = j5;
                    victor.white = false;
                } else {
                    j5 = victor.teal;
                }
                if (!k.alpha(j5, 9223372034707292159L)) {
                    j6 = k.charlie(k.charlie(j7, j5), j6);
                }
            }
            j6 = 9223372034707292159L;
        }
        alVar.red = j6;
    }

    public final void alpha() {
        boolean z2;
        long j5;
        long j6;
        char c3;
        long j7;
        Handler handler = T.b.alpha;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z10 = this.delta;
        if (!z10 && !this.echo) {
            z2 = false;
        } else {
            z2 = true;
        }
        a aVar = this.alpha;
        c cVar = this.bravo;
        if (z10) {
            this.delta = false;
            ah ahVar = this.charlie;
            j5 = 128;
            Object[] objArr = ahVar.alpha;
            int i4 = ahVar.bravo;
            for (int i5 = 0; i5 < i4; i5++) {
                ((Function0) objArr[i5]).invoke();
            }
            long[] jArr = (long[]) aVar.charlie;
            int i10 = aVar.bravo;
            j6 = 255;
            for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
                long j10 = jArr[i11 + 2];
                if ((((int) (j10 >> 61)) & 1) != 0) {
                    long j11 = jArr[i11];
                    long j12 = jArr[i11 + 1];
                    if (cVar.alpha.bravo(((int) j10) & 67108863) != null) {
                        throw new ClassCastException();
                    }
                }
            }
            c3 = 7;
            j7 = -9187201950435737472L;
            aa aaVar = cVar.alpha;
            Object[] objArr2 = aaVar.charlie;
            long[] jArr2 = aaVar.alpha;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j13 = jArr2[i12];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((j13 & 255) < 128 && objArr2[(i12 << 3) + i14] != null) {
                                throw new ClassCastException();
                            }
                            j13 >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        }
                    }
                    if (i12 == length) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            long[] jArr3 = (long[]) aVar.charlie;
            int i15 = aVar.bravo;
            for (int i16 = 0; i16 < jArr3.length - 2 && i16 < i15; i16 += 3) {
                int i17 = i16 + 2;
                jArr3[i17] = jArr3[i17] & (-2305843009213693953L);
            }
        } else {
            j5 = 128;
            j6 = 255;
            c3 = 7;
            j7 = -9187201950435737472L;
        }
        if (this.echo) {
            this.echo = false;
            aa aaVar2 = cVar.alpha;
            Object[] objArr3 = aaVar2.charlie;
            long[] jArr4 = aaVar2.alpha;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i18 = 0;
                while (true) {
                    long j14 = jArr4[i18];
                    if ((((~j14) << c3) & j14 & j7) != j7) {
                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                        for (int i20 = 0; i20 < i19; i20++) {
                            if ((j14 & j6) < j5 && objArr3[(i18 << 3) + i20] != null) {
                                throw new ClassCastException();
                            }
                            j14 >>= 8;
                        }
                        if (i19 != 8) {
                            break;
                        }
                    }
                    if (i18 == length2) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
        }
        if (z2) {
            cVar.getClass();
        }
        if (this.foxtrot) {
            this.foxtrot = false;
            long[] jArr5 = (long[]) aVar.charlie;
            int i21 = aVar.bravo;
            long[] jArr6 = (long[]) aVar.delta;
            int i22 = 0;
            for (int i23 = 0; i23 < jArr5.length - 2 && i22 < jArr6.length - 2 && i23 < i21; i23 += 3) {
                int i24 = i23 + 2;
                if (jArr5[i24] != 2305843009213693951L) {
                    jArr6[i22] = jArr5[i23];
                    jArr6[i22 + 1] = jArr5[i23 + 1];
                    jArr6[i22 + 2] = jArr5[i24];
                    i22 += 3;
                }
            }
            aVar.bravo = i22;
            aVar.charlie = jArr6;
            aVar.delta = jArr5;
        }
        if (cVar.bravo > currentTimeMillis) {
            return;
        }
        aa aaVar3 = cVar.alpha;
        Object[] objArr4 = aaVar3.charlie;
        long[] jArr7 = aaVar3.alpha;
        int length3 = jArr7.length - 2;
        if (length3 >= 0) {
            int i25 = 0;
            while (true) {
                long j15 = jArr7[i25];
                if ((((~j15) << c3) & j15 & j7) != j7) {
                    int i26 = 8 - ((~(i25 - length3)) >>> 31);
                    for (int i27 = 0; i27 < i26; i27++) {
                        if ((j15 & j6) < j5 && objArr4[(i25 << 3) + i27] != null) {
                            throw new ClassCastException();
                        }
                        j15 >>= 8;
                    }
                    if (i26 != 8) {
                        break;
                    }
                }
                if (i25 == length3) {
                    break;
                } else {
                    i25++;
                }
            }
        }
        cVar.bravo = -1L;
    }

    public final void bravo(al alVar, boolean z2) {
        char c3;
        boolean z10;
        int i4;
        L l10 = (L) alVar.f13305x.foxtrot;
        C c4 = alVar.f13306y.papa;
        int navy = c4.navy();
        float maroon = c4.maroon();
        Z.a aVar = this.juliet;
        aVar.bravo = 0.0f;
        aVar.charlie = 0.0f;
        aVar.delta = navy;
        aVar.echo = maroon;
        while (true) {
            c3 = ' ';
            if (l10 == null) {
                break;
            }
            U u4 = l10.C;
            long j5 = l10.f13262t;
            long floatToRawIntBits = (Float.floatToRawIntBits((int) (j5 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j5 & 4294967295L)) & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
            aVar.bravo += intBitsToFloat;
            aVar.charlie += intBitsToFloat2;
            aVar.delta += intBitsToFloat;
            aVar.echo += intBitsToFloat2;
            l10 = l10.f13253k;
            if (u4 != null) {
                float[] bravo = ((C2907c0) u4).bravo();
                if (!ao.papa(bravo)) {
                    C0347ag.charlie(bravo, aVar);
                }
            }
        }
        int i5 = (int) aVar.bravo;
        int i10 = (int) aVar.charlie;
        int i11 = (int) aVar.delta;
        int i12 = (int) aVar.echo;
        int i13 = alVar.purple;
        a aVar2 = this.alpha;
        if (!z2) {
            int i14 = 67108863;
            int i15 = i13 & 67108863;
            long[] jArr = (long[]) aVar2.charlie;
            int i16 = aVar2.bravo;
            int i17 = 0;
            while (i17 < jArr.length - 2 && i17 < i16) {
                int i18 = i17 + 2;
                int i19 = i14;
                char c10 = c3;
                long j6 = jArr[i18];
                z10 = true;
                if ((((int) j6) & i19) == i15) {
                    jArr[i17] = (i5 << c10) | (i10 & 4294967295L);
                    jArr[i17 + 1] = (i11 << c10) | (i12 & 4294967295L);
                    jArr[i18] = 2305843009213693952L | j6;
                    break;
                } else {
                    i17 += 3;
                    i14 = i19;
                    c3 = c10;
                }
            }
        }
        z10 = true;
        al victor = alVar.victor();
        if (victor != null) {
            i4 = victor.purple;
        } else {
            i4 = -1;
        }
        int i20 = i4;
        C0058p c0058p = alVar.f13305x;
        aVar2.foxtrot(i13, i5, i10, i11, i12, i20, c0058p.foxtrot(Barcode.FORMAT_UPC_E), c0058p.foxtrot(16));
        this.delta = z10;
    }

    public final void charlie(al alVar) {
        e zulu = alVar.zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            al alVar2 = (al) objArr[i5];
            bravo(alVar2, false);
            charlie(alVar2);
        }
    }

    public final void delta(al alVar) {
        boolean z2 = true;
        this.delta = true;
        int i4 = alVar.purple & 67108863;
        a aVar = this.alpha;
        long[] jArr = (long[]) aVar.charlie;
        int i5 = aVar.bravo;
        int i10 = 0;
        while (true) {
            if (i10 >= jArr.length - 2 || i10 >= i5) {
                break;
            }
            int i11 = i10 + 2;
            long j5 = jArr[i11];
            if ((((int) j5) & 67108863) == i4) {
                jArr[i11] = 2305843009213693952L | j5;
                break;
            }
            i10 += 3;
        }
        q qVar = this.golf;
        if (qVar == null) {
            z2 = false;
        }
        long j6 = this.bravo.bravo;
        if (j6 >= 0 || !z2) {
            if (this.hotel == j6 && z2) {
                return;
            }
            if (qVar != null) {
                Handler handler = T.b.alpha;
                T.b.alpha.removeCallbacks(qVar);
            }
            Handler handler2 = T.b.alpha;
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j6, 16 + currentTimeMillis);
            this.hotel = max;
            q qVar2 = new q(17, this.india);
            T.b.alpha.postDelayed(qVar2, max - currentTimeMillis);
            this.golf = qVar2;
        }
    }

    public final void echo(al alVar) {
        long golf = golf(alVar);
        if (!k.alpha(golf, 9223372034707292159L)) {
            alVar.teal = golf;
            alVar.white = false;
            e zulu = alVar.zulu();
            Object[] objArr = zulu.alpha;
            int i4 = zulu.red;
            for (int i5 = 0; i5 < i4; i5++) {
                foxtrot((al) objArr[i5], false);
            }
            delta(alVar);
            return;
        }
        charlie(alVar);
    }

    public final void foxtrot(al alVar, boolean z2) {
        int i4;
        boolean z10;
        boolean z11;
        int i5;
        long j5;
        char c3;
        int i10;
        C c4 = alVar.f13306y.papa;
        int navy = c4.navy();
        int maroon = c4.maroon();
        long j6 = alVar.red;
        long j7 = alVar.silver;
        char c10 = ' ';
        int i11 = (int) (j7 >> 32);
        int i12 = (int) (j7 & 4294967295L);
        hotel(alVar);
        long j10 = alVar.red;
        if (k.alpha(j10, 9223372034707292159L)) {
            bravo(alVar, z2);
            return;
        }
        alVar.silver = (maroon & 4294967295L) | (navy << 32);
        int i13 = (int) (j10 >> 32);
        int i14 = (int) (j10 & 4294967295L);
        int i15 = i13 + navy;
        int i16 = i14 + maroon;
        if (!z2 && k.alpha(j10, j6) && i11 == navy && i12 == maroon) {
            return;
        }
        int i17 = alVar.purple;
        a aVar = this.alpha;
        if (!z2) {
            int i18 = i17 & 67108863;
            long[] jArr = (long[]) aVar.charlie;
            int i19 = aVar.bravo;
            int i20 = 0;
            while (i20 < jArr.length - 2 && i20 < i19) {
                int i21 = i20 + 2;
                char c11 = c10;
                long[] jArr2 = jArr;
                long j11 = jArr2[i21];
                if ((((int) j11) & 67108863) == i18) {
                    long j12 = jArr2[i20];
                    jArr2[i20] = (i14 & 4294967295L) | (i13 << c11);
                    jArr2[i20 + 1] = (i15 << c11) | (i16 & 4294967295L);
                    long j13 = 2305843009213693952L;
                    jArr2[i21] = j11 | 2305843009213693952L;
                    int i22 = i13 - ((int) (j12 >> c11));
                    int i23 = i14 - ((int) j12);
                    if (i22 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 | z11) {
                        long j14 = -4503599560261633L;
                        char c12 = 26;
                        long[] jArr3 = (long[]) aVar.charlie;
                        long[] jArr4 = (long[]) aVar.delta;
                        int i24 = aVar.bravo / 3;
                        jArr4[0] = (j11 & (-4503599560261633L)) | (((i20 + 3) & 67108863) << 26);
                        int i25 = 1;
                        while (i25 > 0) {
                            i25--;
                            long j15 = jArr4[i25];
                            int i26 = ((int) j15) & 67108863;
                            long j16 = j14;
                            int i27 = ((int) (j15 >> c12)) & 67108863;
                            char c13 = '4';
                            int i28 = ((int) (j15 >> 52)) & 511;
                            if (i28 == 511) {
                                i5 = i24;
                            } else {
                                i5 = i28 + i27;
                            }
                            if (i27 < 0) {
                                break;
                            }
                            while (i27 < jArr3.length - 2 && i27 < i5) {
                                int i29 = i27 + 2;
                                long j17 = jArr3[i29];
                                char c14 = c13;
                                int i30 = i24;
                                if ((((int) (j17 >> c12)) & 67108863) == i26) {
                                    long j18 = jArr3[i27];
                                    int i31 = i27 + 1;
                                    j5 = j13;
                                    long j19 = jArr3[i31];
                                    c3 = c12;
                                    i10 = i22;
                                    jArr3[i27] = ((((int) j18) + i23) & 4294967295L) | ((((int) (j18 >> c11)) + i10) << c11);
                                    jArr3[i31] = ((((int) j19) + i23) & 4294967295L) | ((((int) (j19 >> c11)) + i10) << c11);
                                    jArr3[i29] = j17 | j5;
                                    if ((((int) (j17 >> c14)) & 511) > 0) {
                                        jArr4[i25] = (j17 & j16) | (((i27 + 3) & 67108863) << c3);
                                        i25++;
                                    }
                                } else {
                                    j5 = j13;
                                    c3 = c12;
                                    i10 = i22;
                                }
                                i27 += 3;
                                i24 = i30;
                                c13 = c14;
                                j13 = j5;
                                i22 = i10;
                                c12 = c3;
                            }
                            i24 = i24;
                            j14 = j16;
                            j13 = j13;
                            i22 = i22;
                            c12 = c12;
                        }
                    }
                    this.delta = true;
                }
                i20 += 3;
                c10 = c11;
                jArr = jArr2;
            }
        }
        al victor = alVar.victor();
        if (victor != null) {
            i4 = victor.purple;
        } else {
            i4 = -1;
        }
        int i32 = i4;
        C0058p c0058p = alVar.f13305x;
        aVar.foxtrot(i17, i13, i14, i15, i16, i32, c0058p.foxtrot(Barcode.FORMAT_UPC_E), c0058p.foxtrot(16));
        this.delta = true;
    }

    public final void india(al alVar) {
        int i4 = alVar.purple & 67108863;
        a aVar = this.alpha;
        long[] jArr = (long[]) aVar.charlie;
        int i5 = aVar.bravo;
        int i10 = 0;
        while (true) {
            if (i10 >= jArr.length - 2 || i10 >= i5) {
                break;
            }
            int i11 = i10 + 2;
            if ((((int) jArr[i11]) & 67108863) == i4) {
                jArr[i10] = -1;
                jArr[i10 + 1] = -1;
                jArr[i11] = 2305843009213693951L;
                break;
            }
            i10 += 3;
        }
        this.delta = true;
        this.foxtrot = true;
    }
}
