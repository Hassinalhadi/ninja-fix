package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function0;
import t0.AbstractC2901T;
import t6.X3;

/* renamed from: F.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0148q {
    public static final U0.ad alpha = new U0.ad(14);

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(boolean z2, Function0 function0, T.s sVar, long j5, b.g0 g0Var, U0.ad adVar, a0.as asVar, long j6, float f5, float f10, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        boolean z10;
        int i10;
        Function0 function02;
        T.s sVar2;
        int i11;
        long j7;
        int i12;
        T.s sVar3;
        long floatToRawIntBits;
        int i13;
        U0.ad adVar2;
        T.s sVar4;
        float f11;
        b.g0 g0Var2;
        a0.as asVar2;
        long j10;
        float f12;
        Object jade;
        androidx.compose.runtime.as asVar3;
        bz.an anVar;
        Object jade2;
        boolean z11;
        boolean golf;
        Object jade3;
        C0585q c0585q;
        long j11;
        U0.ad adVar3;
        T.s sVar5;
        b.g0 g0Var3;
        a0.as asVar4;
        long j12;
        float f13;
        float f14;
        androidx.compose.runtime.Q uniform;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1431928300);
        if ((i4 & 6) == 0) {
            z10 = z2;
            if (c0585q2.hotel(z10)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i4;
        } else {
            z10 = z2;
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            function02 = function0;
            if (c0585q2.india(function02)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        } else {
            function02 = function0;
        }
        int i18 = 4 & i5;
        if (i18 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            sVar2 = sVar;
            if (c0585q2.golf(sVar2)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            int i19 = i10 | 3072;
            if ((i4 & 24576) == 0) {
                i19 = i10 | 11264;
            }
            int i20 = 196608 | i19;
            if ((1572864 & i4) == 0) {
                i20 = 720896 | i19;
            }
            if ((12582912 & i4) != 0) {
                if ((i5 & 128) == 0) {
                    j7 = j6;
                    if (c0585q2.foxtrot(j7)) {
                        i14 = 8388608;
                        i20 |= i14;
                    }
                } else {
                    j7 = j6;
                }
                i14 = 4194304;
                i20 |= i14;
            } else {
                j7 = j6;
            }
            i12 = i20 | 905969664;
            if ((306783379 & i12) != 306783378 && c0585q2.bronze()) {
                c0585q2.ochre();
                g0Var3 = g0Var;
                adVar3 = adVar;
                asVar4 = asVar;
                f14 = f10;
                c0585q = c0585q2;
                sVar5 = sVar2;
                j12 = j7;
                j11 = j5;
                f13 = f5;
            } else {
                c0585q2.orange();
                if ((i4 & 1) == 0 && !c0585q2.beige()) {
                    c0585q2.ochre();
                    int i21 = i12 & (-3727361);
                    if ((128 & i5) != 0) {
                        i21 = i12 & (-33087489);
                    }
                    g0Var2 = g0Var;
                    adVar2 = adVar;
                    asVar2 = asVar;
                    f11 = f5;
                    f12 = f10;
                    i13 = i21;
                    sVar4 = sVar2;
                    j10 = j7;
                    floatToRawIntBits = j5;
                } else {
                    if (i18 == 0) {
                        sVar3 = T.p.alpha;
                    } else {
                        sVar3 = sVar2;
                    }
                    float f15 = 0;
                    T.s sVar6 = sVar3;
                    floatToRawIntBits = (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L);
                    b.g0 alpha2 = X3.alpha(c0585q2);
                    float f16 = AbstractC0152r0.alpha;
                    a0.as alpha3 = Z1.alpha(c0585q2, H.l.bravo);
                    int i22 = i12 & (-3727361);
                    if ((128 & i5) == 0) {
                        j7 = Q.delta(c0585q2, 37);
                        i13 = i12 & (-33087489);
                    } else {
                        i13 = i22;
                    }
                    float f17 = AbstractC0152r0.alpha;
                    float f18 = AbstractC0152r0.bravo;
                    adVar2 = alpha;
                    sVar4 = sVar6;
                    f11 = f17;
                    g0Var2 = alpha2;
                    asVar2 = alpha3;
                    j10 = j7;
                    f12 = f18;
                }
                c0585q2.romeo();
                jade = c0585q2.jade();
                asVar3 = C0580l.alpha;
                if (jade == asVar3) {
                    jade = new bz.an(Boolean.FALSE);
                    c0585q2.f(jade);
                }
                anVar = (bz.an) jade;
                ((androidx.compose.runtime.t0) anVar.red).setValue(Boolean.valueOf(z10));
                if (((Boolean) ((androidx.compose.runtime.t0) anVar.purple).getValue()).booleanValue() && !((Boolean) ((androidx.compose.runtime.t0) anVar.red).getValue()).booleanValue()) {
                    c0585q = c0585q2;
                } else {
                    jade2 = c0585q2.jade();
                    if (jade2 == asVar3) {
                        jade2 = C0564b.zulu(new a0.aw(a0.aw.bravo));
                        c0585q2.f(jade2);
                    }
                    androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade2;
                    Q0.d dVar2 = (Q0.d) c0585q2.kilo(AbstractC2901T.hotel);
                    if ((i13 & 7168) != 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    golf = z11 | c0585q2.golf(dVar2);
                    jade3 = c0585q2.jade();
                    if (!golf || jade3 == asVar3) {
                        jade3 = new androidx.compose.material3.internal.x(floatToRawIntBits, dVar2, new C0140o(axVar, i17));
                        c0585q2.f(jade3);
                    }
                    U0.l.alpha((androidx.compose.material3.internal.x) jade3, function02, adVar2, P.e.echo(2126968933, new C0132m(sVar4, anVar, axVar, g0Var2, asVar2, j10, f11, f12, dVar), c0585q2), c0585q2, ((i13 >> 9) & 896) | (i13 & 112) | 3072, 0);
                    c0585q = c0585q2;
                }
                j11 = floatToRawIntBits;
                adVar3 = adVar2;
                sVar5 = sVar4;
                g0Var3 = g0Var2;
                asVar4 = asVar2;
                j12 = j10;
                f13 = f11;
                f14 = f12;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C0136n(z2, function0, sVar5, j11, g0Var3, adVar3, asVar4, j12, f13, f14, dVar, i4, i5);
                return;
            }
            return;
        }
        sVar2 = sVar;
        int i192 = i10 | 3072;
        if ((i4 & 24576) == 0) {
        }
        int i202 = 196608 | i192;
        if ((1572864 & i4) == 0) {
        }
        if ((12582912 & i4) != 0) {
        }
        i12 = i202 | 905969664;
        if ((306783379 & i12) != 306783378) {
        }
        c0585q2.orange();
        if ((i4 & 1) == 0) {
        }
        if (i18 == 0) {
        }
        float f152 = 0;
        T.s sVar62 = sVar3;
        floatToRawIntBits = (Float.floatToRawIntBits(f152) << 32) | (Float.floatToRawIntBits(f152) & 4294967295L);
        b.g0 alpha22 = X3.alpha(c0585q2);
        float f162 = AbstractC0152r0.alpha;
        a0.as alpha32 = Z1.alpha(c0585q2, H.l.bravo);
        int i222 = i12 & (-3727361);
        if ((128 & i5) == 0) {
        }
        float f172 = AbstractC0152r0.alpha;
        float f182 = AbstractC0152r0.bravo;
        adVar2 = alpha;
        sVar4 = sVar62;
        f11 = f172;
        g0Var2 = alpha22;
        asVar2 = alpha32;
        j10 = j7;
        f12 = f182;
        c0585q2.romeo();
        jade = c0585q2.jade();
        asVar3 = C0580l.alpha;
        if (jade == asVar3) {
        }
        anVar = (bz.an) jade;
        ((androidx.compose.runtime.t0) anVar.red).setValue(Boolean.valueOf(z10));
        if (((Boolean) ((androidx.compose.runtime.t0) anVar.purple).getValue()).booleanValue()) {
        }
        jade2 = c0585q2.jade();
        if (jade2 == asVar3) {
        }
        androidx.compose.runtime.ax axVar2 = (androidx.compose.runtime.ax) jade2;
        Q0.d dVar22 = (Q0.d) c0585q2.kilo(AbstractC2901T.hotel);
        if ((i13 & 7168) != 2048) {
        }
        golf = z11 | c0585q2.golf(dVar22);
        jade3 = c0585q2.jade();
        if (!golf) {
        }
        jade3 = new androidx.compose.material3.internal.x(floatToRawIntBits, dVar22, new C0140o(axVar2, i17));
        c0585q2.f(jade3);
        U0.l.alpha((androidx.compose.material3.internal.x) jade3, function02, adVar2, P.e.echo(2126968933, new C0132m(sVar4, anVar, axVar2, g0Var2, asVar2, j10, f11, f12, dVar), c0585q2), c0585q2, ((i13 >> 9) & 896) | (i13 & 112) | 3072, 0);
        c0585q = c0585q2;
        j11 = floatToRawIntBits;
        adVar3 = adVar2;
        sVar5 = sVar4;
        g0Var3 = g0Var2;
        asVar4 = asVar2;
        j12 = j10;
        f13 = f11;
        f14 = f12;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void bravo(P.d dVar, Function0 function0, T.s sVar, boolean z2, C0156s0 c0156s0, androidx.compose.foundation.layout.M m4, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        androidx.compose.foundation.layout.M m5;
        T.s sVar2;
        androidx.compose.foundation.layout.M m8;
        C0156s0 c0156s02;
        boolean z10;
        C0585q c0585q;
        androidx.compose.foundation.layout.M m10;
        C0156s0 c0156s03;
        boolean z11;
        T.s sVar3;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1826340448);
        if (c0585q2.india(function0)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i15 = i4 | i10;
        int i16 = i5 & 4;
        if (i16 != 0) {
            i12 = i15 | 384;
        } else {
            if (c0585q2.golf(sVar)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i12 = i15 | i11;
        }
        int i17 = i12 | 224256;
        if ((i5 & 64) == 0 && c0585q2.golf(c0156s0)) {
            i13 = 1048576;
        } else {
            i13 = 524288;
        }
        int i18 = i17 | i13;
        int i19 = i5 & 128;
        if (i19 != 0) {
            i18 |= 12582912;
        } else if ((i4 & 12582912) == 0) {
            if (c0585q2.golf(m4)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i18 |= i14;
        }
        int i20 = i18 | 100663296;
        if ((38347923 & i20) == 38347922 && c0585q2.bronze()) {
            c0585q2.ochre();
            sVar3 = sVar;
            z11 = z2;
            c0156s03 = c0156s0;
            c0585q = c0585q2;
            m10 = m4;
        } else {
            c0585q2.orange();
            if ((i4 & 1) != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
                if ((i5 & 64) != 0) {
                    i20 &= -3670017;
                }
                sVar2 = sVar;
                z10 = z2;
                c0156s02 = c0156s0;
                m8 = m4;
            } else {
                if (i16 != 0) {
                    sVar = T.p.alpha;
                }
                if ((i5 & 64) != 0) {
                    c0156s0 = AbstractC0152r0.alpha(c0585q2);
                    i20 &= -3670017;
                }
                if (i19 != 0) {
                    m5 = AbstractC0152r0.charlie;
                } else {
                    m5 = m4;
                }
                sVar2 = sVar;
                m8 = m5;
                c0156s02 = c0156s0;
                z10 = true;
            }
            c0585q2.romeo();
            AbstractC0173x0.bravo(dVar, function0, sVar2, z10, c0156s02, m8, c0585q2, i20 & 268435454);
            c0585q = c0585q2;
            m10 = m8;
            c0156s03 = c0156s02;
            z11 = z10;
            sVar3 = sVar2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0144p(dVar, function0, sVar3, z11, c0156s03, m10, i4, i5);
        }
    }
}
