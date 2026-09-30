package F;

import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import bz.AbstractC0779d;
import bz.AbstractC0800z;
import bz.C0795u;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import t0.AbstractC2901T;
import t6.T3;

/* loaded from: classes3.dex */
public abstract class G1 {
    public static final float alpha;
    public static final float bravo;
    public static final C0795u charlie;

    static {
        float f5 = 10;
        alpha = f5;
        AbstractC0538d.uniform(A0.o.bravo(androidx.compose.ui.layout.a.bravo(D.f1002d), true, C0172x.e), 0.0f, f5, 1);
        bravo = H.p.charlie - (H.p.bravo * 2);
        new C0795u(0.2f, 0.0f, 0.8f, 1.0f);
        new C0795u(0.4f, 0.0f, 1.0f, 1.0f);
        new C0795u(0.0f, 0.0f, 0.65f, 1.0f);
        new C0795u(0.1f, 0.0f, 0.45f, 1.0f);
        charlie = new C0795u(0.4f, 0.0f, 0.2f, 1.0f);
    }

    public static final void alpha(Function0 function0, T.s sVar, long j5, float f5, long j6, int i4, float f10, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        int i11;
        float f11;
        boolean z2;
        Object b12;
        T.s sVar2;
        float f12;
        float f13;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1798883595);
        if (c0585q.india(function0)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i5 | i10;
        if (c0585q.echo(i4)) {
            i11 = 131072;
        } else {
            i11 = 65536;
        }
        int i13 = i12 | i11 | 1572864;
        if ((599187 & i13) == 599186 && c0585q.bronze()) {
            c0585q.ochre();
            f13 = f10;
        } else {
            c0585q.orange();
            if ((i5 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                f11 = f10;
            } else {
                f11 = A1.charlie;
            }
            c0585q.romeo();
            boolean z10 = true;
            if ((i13 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object jade = c0585q.jade();
            Object obj = C0580l.alpha;
            if (z2 || jade == obj) {
                jade = new C0090b1(function0, 2);
                c0585q.f(jade);
            }
            Function0 function02 = (Function0) jade;
            c0.h hVar = new c0.h(((Q0.d) c0585q.kilo(AbstractC2901T.hotel)).lavender(f5), 0.0f, i4, 0, null, 26);
            boolean golf = c0585q.golf(function02);
            Object jade2 = c0585q.jade();
            if (golf || jade2 == obj) {
                jade2 = new R0(function02, 2);
                c0585q.f(jade2);
            }
            T.s kilo = androidx.compose.foundation.layout.V.kilo(A0.o.bravo(sVar, true, (Function1) jade2), bravo);
            boolean golf2 = c0585q.golf(function02);
            if ((i13 & 458752) != 131072) {
                z10 = false;
            }
            boolean india = golf2 | z10 | c0585q.india(hVar);
            Object jade3 = c0585q.jade();
            if (!india && jade3 != obj) {
                sVar2 = kilo;
                b12 = jade3;
                f12 = f11;
            } else {
                sVar2 = kilo;
                f12 = f11;
                b12 = new B1(function02, i4, f12, f5, j6, hVar, j5);
                c0585q.f(b12);
            }
            T3.alpha(sVar2, (Function1) b12, c0585q, 0);
            f13 = f12;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C1(function0, sVar, j5, f5, j6, i4, f13, i5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b9, code lost:
    
        if (r15.foxtrot(r11) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0202, code lost:
    
        if (r15.foxtrot(r13) == false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(T.s sVar, long j5, float f5, long j6, int i4, InterfaceC0581m interfaceC0581m, int i5, int i10) {
        T.s sVar2;
        int i11;
        int i12;
        float f10;
        int i13;
        long j7;
        int i14;
        int i15;
        T.s sVar3;
        long j10;
        long j11;
        long j12;
        int i16;
        long j13;
        boolean z2;
        boolean z10;
        long j14;
        boolean z11;
        boolean z12;
        Object jade;
        int i17;
        T.s sVar4;
        long j15;
        long j16;
        float f11;
        androidx.compose.runtime.Q uniform;
        int i18;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-115871647);
        int i19 = i10 & 1;
        if (i19 != 0) {
            i11 = i5 | 6;
            sVar2 = sVar;
        } else if ((i5 & 6) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i5;
        } else {
            sVar2 = sVar;
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            if ((i10 & 2) == 0 && c0585q.foxtrot(j5)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i11 |= i18;
        }
        int i20 = i10 & 4;
        if (i20 != 0) {
            i11 |= 384;
        } else if ((i5 & 384) == 0) {
            f10 = f5;
            if (c0585q.delta(f10)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i11 |= i13;
            j7 = j6;
            if ((i10 & 8) != 0 && c0585q.foxtrot(j7)) {
                i14 = 2048;
            } else {
                i14 = Barcode.FORMAT_UPC_E;
            }
            i15 = i11 | i14 | 24576;
            if ((i15 & 9363) != 9362 && c0585q.bronze()) {
                c0585q.ochre();
                j16 = j5;
                i17 = i4;
                sVar4 = sVar2;
                j15 = j7;
                f11 = f10;
            } else {
                c0585q.orange();
                if ((i5 & 1) == 0 && !c0585q.beige()) {
                    c0585q.ochre();
                    if ((i10 & 2) != 0) {
                        i15 &= -113;
                    }
                    if ((i10 & 8) != 0) {
                        i15 &= -7169;
                    }
                    j12 = j5;
                    i16 = i4;
                    j11 = j7;
                } else {
                    if (i19 == 0) {
                        sVar3 = T.p.alpha;
                    } else {
                        sVar3 = sVar2;
                    }
                    if ((i10 & 2) == 0) {
                        float f12 = A1.alpha;
                        float f13 = H.p.alpha;
                        j10 = Q.delta(c0585q, 26);
                        i15 &= -113;
                    } else {
                        j10 = j5;
                    }
                    if (i20 != 0) {
                        f10 = A1.alpha;
                    }
                    if ((i10 & 8) != 0) {
                        float f14 = A1.alpha;
                        j7 = C0366t.juliet;
                        i15 &= -7169;
                    }
                    sVar2 = sVar3;
                    j11 = j7;
                    j12 = j10;
                    i16 = A1.bravo;
                }
                float f15 = f10;
                c0585q.romeo();
                c0.h hVar = new c0.h(((Q0.d) c0585q.kilo(AbstractC2901T.hotel)).lavender(f15), 0.0f, i16, 0, null, 26);
                bz.aj india = AbstractC0779d.india(null, c0585q, 1);
                bz.g0 g0Var = AbstractC0779d.kilo;
                S7.a aVar = AbstractC0800z.delta;
                long j17 = j11;
                long j18 = j12;
                bz.ag delta = AbstractC0779d.delta(india, 0, 5, g0Var, AbstractC0779d.golf(AbstractC0779d.kilo(6660, 0, aVar, 2), 6), null, c0585q, 33208, 16);
                bz.ag charlie2 = AbstractC0779d.charlie(india, 286.0f, AbstractC0779d.golf(AbstractC0779d.kilo(1332, 0, aVar, 2), 6), null, c0585q, 4536, 8);
                bz.ag charlie3 = AbstractC0779d.charlie(india, 290.0f, AbstractC0779d.golf(AbstractC0779d.hotel(C0172x.f1250c), 6), null, c0585q, 4536, 8);
                bz.ag charlie4 = AbstractC0779d.charlie(india, 290.0f, AbstractC0779d.golf(AbstractC0779d.hotel(C0172x.f1251d), 6), null, c0585q, 4536, 8);
                T.s kilo = androidx.compose.foundation.layout.V.kilo(A0.o.bravo(sVar2, true, new a5.c(13)), bravo);
                if (((i15 & 7168) ^ 3072) <= 2048) {
                    j13 = j17;
                } else {
                    j13 = j17;
                }
                if ((i15 & 3072) != 2048) {
                    z2 = false;
                    boolean india2 = z2 | c0585q.india(hVar) | c0585q.golf(delta) | c0585q.golf(charlie3) | c0585q.golf(charlie4) | c0585q.golf(charlie2);
                    if ((i15 & 896) == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z13 = z10 | india2;
                    if (((i15 & 112) ^ 48) > 32) {
                        j14 = j18;
                    } else {
                        j14 = j18;
                    }
                    if ((i15 & 48) != 32) {
                        z11 = false;
                        z12 = z13 | z11;
                        jade = c0585q.jade();
                        if (!z12 || jade == C0580l.alpha) {
                            jade = new D1(f15, j13, j14, delta, charlie3, charlie4, charlie2, hVar);
                            c0585q.f(jade);
                        }
                        T3.alpha(kilo, (Function1) jade, c0585q, 0);
                        i17 = i16;
                        sVar4 = sVar2;
                        j15 = j13;
                        j16 = j14;
                        f11 = f15;
                    }
                    z11 = true;
                    z12 = z13 | z11;
                    jade = c0585q.jade();
                    if (!z12) {
                    }
                    jade = new D1(f15, j13, j14, delta, charlie3, charlie4, charlie2, hVar);
                    c0585q.f(jade);
                    T3.alpha(kilo, (Function1) jade, c0585q, 0);
                    i17 = i16;
                    sVar4 = sVar2;
                    j15 = j13;
                    j16 = j14;
                    f11 = f15;
                }
                z2 = true;
                boolean india22 = z2 | c0585q.india(hVar) | c0585q.golf(delta) | c0585q.golf(charlie3) | c0585q.golf(charlie4) | c0585q.golf(charlie2);
                if ((i15 & 896) == 256) {
                }
                boolean z132 = z10 | india22;
                if (((i15 & 112) ^ 48) > 32) {
                }
                if ((i15 & 48) != 32) {
                }
                z11 = true;
                z12 = z132 | z11;
                jade = c0585q.jade();
                if (!z12) {
                }
                jade = new D1(f15, j13, j14, delta, charlie3, charlie4, charlie2, hVar);
                c0585q.f(jade);
                T3.alpha(kilo, (Function1) jade, c0585q, 0);
                i17 = i16;
                sVar4 = sVar2;
                j15 = j13;
                j16 = j14;
                f11 = f15;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new E1(sVar4, j16, f11, j15, i17, i5, i10);
                return;
            }
            return;
        }
        f10 = f5;
        j7 = j6;
        if ((i10 & 8) != 0) {
        }
        i14 = Barcode.FORMAT_UPC_E;
        i15 = i11 | i14 | 24576;
        if ((i15 & 9363) != 9362) {
        }
        c0585q.orange();
        if ((i5 & 1) == 0) {
        }
        if (i19 == 0) {
        }
        if ((i10 & 2) == 0) {
        }
        if (i20 != 0) {
        }
        if ((i10 & 8) != 0) {
        }
        sVar2 = sVar3;
        j11 = j7;
        j12 = j10;
        i16 = A1.bravo;
        float f152 = f10;
        c0585q.romeo();
        c0.h hVar2 = new c0.h(((Q0.d) c0585q.kilo(AbstractC2901T.hotel)).lavender(f152), 0.0f, i16, 0, null, 26);
        bz.aj india3 = AbstractC0779d.india(null, c0585q, 1);
        bz.g0 g0Var2 = AbstractC0779d.kilo;
        S7.a aVar2 = AbstractC0800z.delta;
        long j172 = j11;
        long j182 = j12;
        bz.ag delta2 = AbstractC0779d.delta(india3, 0, 5, g0Var2, AbstractC0779d.golf(AbstractC0779d.kilo(6660, 0, aVar2, 2), 6), null, c0585q, 33208, 16);
        bz.ag charlie22 = AbstractC0779d.charlie(india3, 286.0f, AbstractC0779d.golf(AbstractC0779d.kilo(1332, 0, aVar2, 2), 6), null, c0585q, 4536, 8);
        bz.ag charlie32 = AbstractC0779d.charlie(india3, 290.0f, AbstractC0779d.golf(AbstractC0779d.hotel(C0172x.f1250c), 6), null, c0585q, 4536, 8);
        bz.ag charlie42 = AbstractC0779d.charlie(india3, 290.0f, AbstractC0779d.golf(AbstractC0779d.hotel(C0172x.f1251d), 6), null, c0585q, 4536, 8);
        T.s kilo2 = androidx.compose.foundation.layout.V.kilo(A0.o.bravo(sVar2, true, new a5.c(13)), bravo);
        if (((i15 & 7168) ^ 3072) <= 2048) {
        }
        if ((i15 & 3072) != 2048) {
        }
        z2 = true;
        boolean india222 = z2 | c0585q.india(hVar2) | c0585q.golf(delta2) | c0585q.golf(charlie32) | c0585q.golf(charlie42) | c0585q.golf(charlie22);
        if ((i15 & 896) == 256) {
        }
        boolean z1322 = z10 | india222;
        if (((i15 & 112) ^ 48) > 32) {
        }
        if ((i15 & 48) != 32) {
        }
        z11 = true;
        z12 = z1322 | z11;
        jade = c0585q.jade();
        if (!z12) {
        }
        jade = new D1(f152, j13, j14, delta2, charlie32, charlie42, charlie22, hVar2);
        c0585q.f(jade);
        T3.alpha(kilo2, (Function1) jade, c0585q, 0);
        i17 = i16;
        sVar4 = sVar2;
        j15 = j13;
        j16 = j14;
        f11 = f152;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void charlie(c0.d dVar, float f5, float f10, long j5, c0.h hVar) {
        float f11 = 2;
        float f12 = hVar.alpha / f11;
        float delta = Z.e.delta(dVar.bravo()) - (f11 * f12);
        ao.ad.foxtrot(dVar, j5, f5, f10, t6.H2.alpha(f12, f12), t6.M2.alpha(delta, delta), 0.0f, hVar, 832);
    }
}
