package F;

import a0.C0366t;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0584p;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.C0593z;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bz.AbstractC0779d;
import bz.C0778c;
import bz.C0788m;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.C1667d;
import f.C1670g;
import f.C1676m;
import f.InterfaceC1672i;
import f.InterfaceC1673j;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t0.AbstractC2901T;
import t6.AbstractC3087z;
import t6.T3;

/* loaded from: classes3.dex */
public abstract class K1 {
    public static final E.g alpha = new E.g(0.16f, 0.1f, 0.08f, 0.1f);

    /* JADX WARN: Removed duplicated region for block: B:103:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(Function0 function0, P.d dVar, T.p pVar, P.d dVar2, Xd.l lVar, P.d dVar3, P.d dVar4, a0.as asVar, long j5, long j6, long j7, long j10, float f5, U0.t tVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        Function0 function02;
        int i10;
        P.d dVar5;
        int i11;
        Xd.l lVar2;
        int i12;
        P.d dVar6;
        a0.as asVar2;
        long j11;
        long delta;
        P.d dVar7;
        a0.as asVar3;
        long j12;
        long j13;
        long j14;
        U0.t tVar2;
        float f10;
        int i13;
        C0585q c0585q;
        T.p pVar2;
        P.d dVar8;
        Xd.l lVar3;
        P.d dVar9;
        a0.as asVar4;
        long j15;
        long j16;
        long j17;
        long j18;
        float f11;
        U0.t tVar3;
        androidx.compose.runtime.Q uniform;
        int i14;
        int i15;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-2081346864);
        if ((i4 & 6) == 0) {
            function02 = function0;
            i10 = (c0585q2.india(function02) ? 4 : 2) | i4;
        } else {
            function02 = function0;
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= c0585q2.india(dVar) ? 32 : 16;
        }
        int i16 = i10 | 384;
        int i17 = i5 & 8;
        if (i17 != 0) {
            i16 = i10 | 3456;
        } else if ((i4 & 3072) == 0) {
            dVar5 = dVar2;
            i16 |= c0585q2.india(dVar5) ? 2048 : Barcode.FORMAT_UPC_E;
            i11 = 16 & i5;
            if (i11 == 0) {
                i16 |= 24576;
            } else if ((i4 & 24576) == 0) {
                lVar2 = lVar;
                i16 |= c0585q2.india(lVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                i12 = 32 & i5;
                if (i12 != 0) {
                    i16 |= 196608;
                } else if ((196608 & i4) == 0) {
                    dVar6 = dVar3;
                    i16 |= c0585q2.india(dVar6) ? 131072 : 65536;
                    if ((1572864 & i4) == 0) {
                        i16 |= c0585q2.india(dVar4) ? 1048576 : 524288;
                    }
                    if ((12582912 & i4) != 0) {
                        if ((i5 & 128) == 0) {
                            asVar2 = asVar;
                            if (c0585q2.golf(asVar2)) {
                                i15 = 8388608;
                                i16 |= i15;
                            }
                        } else {
                            asVar2 = asVar;
                        }
                        i15 = 4194304;
                        i16 |= i15;
                    } else {
                        asVar2 = asVar;
                    }
                    if ((100663296 & i4) != 0) {
                        if ((i5 & Barcode.FORMAT_QR_CODE) == 0) {
                            j11 = j5;
                            if (c0585q2.foxtrot(j11)) {
                                i14 = 67108864;
                                i16 |= i14;
                            }
                        } else {
                            j11 = j5;
                        }
                        i14 = 33554432;
                        i16 |= i14;
                    } else {
                        j11 = j5;
                    }
                    if ((i4 & 805306368) == 0) {
                        i16 |= 268435456;
                    }
                    if ((i16 & 306783379) != 306783378 && c0585q2.bronze()) {
                        c0585q2.ochre();
                        pVar2 = pVar;
                        f11 = f5;
                        tVar3 = tVar;
                        c0585q = c0585q2;
                        dVar8 = dVar5;
                        lVar3 = lVar2;
                        dVar9 = dVar6;
                        asVar4 = asVar2;
                        j15 = j11;
                        j16 = j6;
                        j17 = j7;
                        j18 = j10;
                    } else {
                        c0585q2.orange();
                        if ((i4 & 1) == 0 && !c0585q2.beige()) {
                            c0585q2.ochre();
                            if ((i5 & 128) != 0) {
                                i16 &= -29360129;
                            }
                            if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
                                i16 &= -234881025;
                            }
                            i13 = i16 & (-1879048193);
                            j14 = j7;
                            delta = j10;
                            f10 = f5;
                            tVar2 = tVar;
                            dVar7 = dVar6;
                            asVar3 = asVar2;
                            j12 = j11;
                            j13 = j6;
                        } else {
                            T.p pVar3 = T.p.alpha;
                            if (i17 != 0) {
                                dVar5 = null;
                            }
                            if (i11 != 0) {
                                lVar2 = null;
                            }
                            if (i12 != 0) {
                                dVar6 = null;
                            }
                            if ((i5 & 128) != 0) {
                                float f12 = AbstractC0084a.alpha;
                                i16 &= -29360129;
                                asVar2 = Z1.alpha(c0585q2, H.d.alpha);
                            }
                            if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
                                float f13 = AbstractC0084a.alpha;
                                int i18 = H.d.alpha;
                                j11 = Q.delta(c0585q2, 38);
                                i16 &= -234881025;
                            }
                            float f14 = AbstractC0084a.alpha;
                            long delta2 = Q.delta(c0585q2, H.d.foxtrot);
                            int i19 = (-1879048193) & i16;
                            long delta3 = Q.delta(c0585q2, H.d.bravo);
                            delta = Q.delta(c0585q2, H.d.delta);
                            float f15 = AbstractC0084a.alpha;
                            pVar = pVar3;
                            dVar7 = dVar6;
                            asVar3 = asVar2;
                            j12 = j11;
                            j13 = delta2;
                            j14 = delta3;
                            tVar2 = new U0.t(7, false);
                            f10 = f15;
                            i13 = i19;
                        }
                        P.d dVar10 = dVar5;
                        Xd.l lVar4 = lVar2;
                        T.p pVar4 = pVar;
                        c0585q2.romeo();
                        c0585q = c0585q2;
                        AbstractC0128l.charlie(function02, dVar, pVar4, dVar10, lVar4, dVar7, dVar4, asVar3, j12, j13, j14, delta, f10, tVar2, c0585q, i13 & 2147483646, 3456);
                        pVar2 = pVar4;
                        dVar8 = dVar10;
                        lVar3 = lVar4;
                        dVar9 = dVar7;
                        asVar4 = asVar3;
                        j15 = j12;
                        j16 = j13;
                        j17 = j14;
                        j18 = delta;
                        f11 = f10;
                        tVar3 = tVar2;
                    }
                    uniform = c0585q.uniform();
                    if (uniform == null) {
                        uniform.delta = new C0120j(function0, dVar, pVar2, dVar8, lVar3, dVar9, dVar4, asVar4, j15, j16, j17, j18, f11, tVar3, i4, i5, 1);
                        return;
                    }
                    return;
                }
                dVar6 = dVar3;
                if ((1572864 & i4) == 0) {
                }
                if ((12582912 & i4) != 0) {
                }
                if ((100663296 & i4) != 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                if ((i16 & 306783379) != 306783378) {
                }
                c0585q2.orange();
                if ((i4 & 1) == 0) {
                }
                T.p pVar32 = T.p.alpha;
                if (i17 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if ((i5 & 128) != 0) {
                }
                if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
                }
                float f142 = AbstractC0084a.alpha;
                long delta22 = Q.delta(c0585q2, H.d.foxtrot);
                int i192 = (-1879048193) & i16;
                long delta32 = Q.delta(c0585q2, H.d.bravo);
                delta = Q.delta(c0585q2, H.d.delta);
                float f152 = AbstractC0084a.alpha;
                pVar = pVar32;
                dVar7 = dVar6;
                asVar3 = asVar2;
                j12 = j11;
                j13 = delta22;
                j14 = delta32;
                tVar2 = new U0.t(7, false);
                f10 = f152;
                i13 = i192;
                P.d dVar102 = dVar5;
                Xd.l lVar42 = lVar2;
                T.p pVar42 = pVar;
                c0585q2.romeo();
                c0585q = c0585q2;
                AbstractC0128l.charlie(function02, dVar, pVar42, dVar102, lVar42, dVar7, dVar4, asVar3, j12, j13, j14, delta, f10, tVar2, c0585q, i13 & 2147483646, 3456);
                pVar2 = pVar42;
                dVar8 = dVar102;
                lVar3 = lVar42;
                dVar9 = dVar7;
                asVar4 = asVar3;
                j15 = j12;
                j16 = j13;
                j17 = j14;
                j18 = delta;
                f11 = f10;
                tVar3 = tVar2;
                uniform = c0585q.uniform();
                if (uniform == null) {
                }
            }
            lVar2 = lVar;
            i12 = 32 & i5;
            if (i12 != 0) {
            }
            dVar6 = dVar3;
            if ((1572864 & i4) == 0) {
            }
            if ((12582912 & i4) != 0) {
            }
            if ((100663296 & i4) != 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            if ((i16 & 306783379) != 306783378) {
            }
            c0585q2.orange();
            if ((i4 & 1) == 0) {
            }
            T.p pVar322 = T.p.alpha;
            if (i17 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if ((i5 & 128) != 0) {
            }
            if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
            }
            float f1422 = AbstractC0084a.alpha;
            long delta222 = Q.delta(c0585q2, H.d.foxtrot);
            int i1922 = (-1879048193) & i16;
            long delta322 = Q.delta(c0585q2, H.d.bravo);
            delta = Q.delta(c0585q2, H.d.delta);
            float f1522 = AbstractC0084a.alpha;
            pVar = pVar322;
            dVar7 = dVar6;
            asVar3 = asVar2;
            j12 = j11;
            j13 = delta222;
            j14 = delta322;
            tVar2 = new U0.t(7, false);
            f10 = f1522;
            i13 = i1922;
            P.d dVar1022 = dVar5;
            Xd.l lVar422 = lVar2;
            T.p pVar422 = pVar;
            c0585q2.romeo();
            c0585q = c0585q2;
            AbstractC0128l.charlie(function02, dVar, pVar422, dVar1022, lVar422, dVar7, dVar4, asVar3, j12, j13, j14, delta, f10, tVar2, c0585q, i13 & 2147483646, 3456);
            pVar2 = pVar422;
            dVar8 = dVar1022;
            lVar3 = lVar422;
            dVar9 = dVar7;
            asVar4 = asVar3;
            j15 = j12;
            j16 = j13;
            j17 = j14;
            j18 = delta;
            f11 = f10;
            tVar3 = tVar2;
            uniform = c0585q.uniform();
            if (uniform == null) {
            }
        }
        dVar5 = dVar2;
        i11 = 16 & i5;
        if (i11 == 0) {
        }
        lVar2 = lVar;
        i12 = 32 & i5;
        if (i12 != 0) {
        }
        dVar6 = dVar3;
        if ((1572864 & i4) == 0) {
        }
        if ((12582912 & i4) != 0) {
        }
        if ((100663296 & i4) != 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        if ((i16 & 306783379) != 306783378) {
        }
        c0585q2.orange();
        if ((i4 & 1) == 0) {
        }
        T.p pVar3222 = T.p.alpha;
        if (i17 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if ((i5 & 128) != 0) {
        }
        if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
        }
        float f14222 = AbstractC0084a.alpha;
        long delta2222 = Q.delta(c0585q2, H.d.foxtrot);
        int i19222 = (-1879048193) & i16;
        long delta3222 = Q.delta(c0585q2, H.d.bravo);
        delta = Q.delta(c0585q2, H.d.delta);
        float f15222 = AbstractC0084a.alpha;
        pVar = pVar3222;
        dVar7 = dVar6;
        asVar3 = asVar2;
        j12 = j11;
        j13 = delta2222;
        j14 = delta3222;
        tVar2 = new U0.t(7, false);
        f10 = f15222;
        i13 = i19222;
        P.d dVar10222 = dVar5;
        Xd.l lVar4222 = lVar2;
        T.p pVar4222 = pVar;
        c0585q2.romeo();
        c0585q = c0585q2;
        AbstractC0128l.charlie(function02, dVar, pVar4222, dVar10222, lVar4222, dVar7, dVar4, asVar3, j12, j13, j14, delta, f10, tVar2, c0585q, i13 & 2147483646, 3456);
        pVar2 = pVar4222;
        dVar8 = dVar10222;
        lVar3 = lVar4222;
        dVar9 = dVar7;
        asVar4 = asVar3;
        j15 = j12;
        j16 = j13;
        j17 = j14;
        j18 = delta;
        f11 = f10;
        tVar3 = tVar2;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(Function0 function0, T.s sVar, boolean z2, a0.as asVar, ak akVar, ap apVar, b.ab abVar, androidx.compose.foundation.layout.M m4, Xd.m mVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        T.s sVar2;
        int i11;
        int i12;
        boolean z10;
        int i13;
        a0.as asVar2;
        ap apVar2;
        int i14;
        b.ab abVar2;
        int i15;
        int i16;
        androidx.compose.foundation.layout.M m5;
        int i17;
        int i18;
        ak akVar2;
        ak akVar3;
        androidx.compose.runtime.as asVar3;
        Object jade;
        long j5;
        long j6;
        ak akVar4;
        androidx.compose.foundation.layout.M m8;
        float f5;
        InterfaceC1673j interfaceC1673j;
        boolean z11;
        boolean z12;
        C0788m c0788m;
        boolean z13;
        float f10;
        C0585q c0585q;
        T.s sVar3;
        androidx.compose.foundation.layout.M m10;
        ap apVar3;
        a0.as asVar4;
        b.ab abVar3;
        boolean z14;
        ak akVar5;
        androidx.compose.runtime.Q uniform;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(650121315);
        if ((i4 & 6) == 0) {
            if (c0585q2.india(function0)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i10 = i23 | i4;
        } else {
            i10 = i4;
        }
        int i24 = 2 & i5;
        if (i24 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            sVar2 = sVar;
            if (c0585q2.golf(sVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
            i12 = i5 & 4;
            if (i12 == 0) {
                i10 |= 384;
            } else if ((i4 & 384) == 0) {
                z10 = z2;
                if (c0585q2.hotel(z10)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i10 |= i13;
                if ((i4 & 3072) == 0) {
                    if ((i5 & 8) == 0) {
                        asVar2 = asVar;
                        if (c0585q2.golf(asVar2)) {
                            i22 = 2048;
                            i10 |= i22;
                        }
                    } else {
                        asVar2 = asVar;
                    }
                    i22 = Barcode.FORMAT_UPC_E;
                    i10 |= i22;
                } else {
                    asVar2 = asVar;
                }
                boolean z15 = true;
                if ((i4 & 24576) == 0) {
                    if ((i5 & 16) == 0 && c0585q2.golf(akVar)) {
                        i21 = Http2.INITIAL_MAX_FRAME_SIZE;
                        i10 |= i21;
                    }
                    i21 = 8192;
                    i10 |= i21;
                }
                if ((i4 & 196608) == 0) {
                    if ((i5 & 32) == 0) {
                        apVar2 = apVar;
                        if (c0585q2.golf(apVar2)) {
                            i20 = 131072;
                            i10 |= i20;
                        }
                    } else {
                        apVar2 = apVar;
                    }
                    i20 = 65536;
                    i10 |= i20;
                } else {
                    apVar2 = apVar;
                }
                i14 = i5 & 64;
                if (i14 != 0) {
                    i10 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    abVar2 = abVar;
                    if (c0585q2.golf(abVar2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i10 |= i15;
                    i16 = 128 & i5;
                    if (i16 == 0) {
                        i10 |= 12582912;
                        m5 = m4;
                    } else {
                        m5 = m4;
                        if ((i4 & 12582912) == 0) {
                            if (c0585q2.golf(m5)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i10 |= i17;
                        }
                    }
                    if ((i5 & Barcode.FORMAT_QR_CODE) == 0) {
                        i10 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if (c0585q2.golf(null)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i10 |= i18;
                    }
                    if ((805306368 & i4) == 0) {
                        if (c0585q2.india(mVar)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i10 |= i19;
                    }
                    if ((i10 & 306783379) != 306783378 && c0585q2.bronze()) {
                        c0585q2.ochre();
                        m10 = m5;
                        c0585q = c0585q2;
                        sVar3 = sVar2;
                        z14 = z10;
                        asVar4 = asVar2;
                        abVar3 = abVar2;
                        apVar3 = apVar2;
                        akVar5 = akVar;
                    } else {
                        c0585q2.orange();
                        if ((i4 & 1) == 0 && !c0585q2.beige()) {
                            c0585q2.ochre();
                            if ((i5 & 8) != 0) {
                                i10 &= -7169;
                            }
                            if ((i5 & 16) != 0) {
                                i10 &= -57345;
                            }
                            if ((i5 & 32) != 0) {
                                i10 &= -458753;
                            }
                            akVar3 = akVar;
                        } else {
                            if (i24 != 0) {
                                sVar2 = T.p.alpha;
                            }
                            if (i12 != 0) {
                                z10 = true;
                            }
                            if ((i5 & 8) != 0) {
                                androidx.compose.foundation.layout.M m11 = al.alpha;
                                i10 &= -7169;
                                asVar2 = Z1.alpha(c0585q2, H.g.bravo);
                            }
                            if ((i5 & 16) == 0) {
                                androidx.compose.foundation.layout.M m12 = al.alpha;
                                akVar2 = al.charlie((O) c0585q2.kilo(Q.alpha));
                                i10 &= -57345;
                            } else {
                                akVar2 = akVar;
                            }
                            if ((i5 & 32) != 0) {
                                i10 = (-458753) & i10;
                                apVar2 = al.bravo(0.0f, 31);
                            }
                            if (i14 != 0) {
                                abVar2 = null;
                            }
                            if (i16 != 0) {
                                m5 = al.alpha;
                            }
                            akVar3 = akVar2;
                        }
                        b.ab abVar4 = abVar2;
                        T.s sVar4 = sVar2;
                        a0.as asVar5 = asVar2;
                        c0585q2.romeo();
                        c0585q2.purple(-239156623);
                        asVar3 = C0580l.alpha;
                        jade = c0585q2.jade();
                        if (jade == asVar3) {
                            jade = ao.ad.xray(c0585q2);
                        }
                        InterfaceC1673j interfaceC1673j2 = (InterfaceC1673j) jade;
                        c0585q2.quebec(false);
                        if (!z10) {
                            j5 = akVar3.alpha;
                        } else {
                            j5 = akVar3.charlie;
                        }
                        if (!z10) {
                            j6 = akVar3.bravo;
                        } else {
                            j6 = akVar3.delta;
                        }
                        long j7 = j6;
                        c0585q2.purple(-239150048);
                        if (apVar2 != null) {
                            akVar4 = akVar3;
                            m8 = m5;
                            interfaceC1673j = interfaceC1673j2;
                            z12 = z10;
                            c0788m = null;
                        } else {
                            int i25 = ((i10 >> 6) & 14) | ((i10 >> 9) & 896);
                            Object jade2 = c0585q2.jade();
                            if (jade2 == asVar3) {
                                jade2 = new SnapshotStateList();
                                c0585q2.f(jade2);
                            }
                            SnapshotStateList snapshotStateList = (SnapshotStateList) jade2;
                            boolean golf = c0585q2.golf(interfaceC1673j2);
                            akVar4 = akVar3;
                            Object jade3 = c0585q2.jade();
                            if (!golf && jade3 != asVar3) {
                                m8 = m5;
                            } else {
                                m8 = m5;
                                jade3 = new an(interfaceC1673j2, snapshotStateList, null);
                                c0585q2.f(jade3);
                            }
                            C0564b.foxtrot((Xd.l) jade3, c0585q2, interfaceC1673j2);
                            InterfaceC1672i interfaceC1672i = (InterfaceC1672i) CollectionsKt.olive(snapshotStateList);
                            if (!z10) {
                                f5 = apVar2.echo;
                            } else if (interfaceC1672i instanceof C1676m) {
                                f5 = apVar2.bravo;
                            } else if (interfaceC1672i instanceof C1670g) {
                                f5 = apVar2.delta;
                            } else if (interfaceC1672i instanceof C1667d) {
                                f5 = apVar2.charlie;
                            } else {
                                f5 = apVar2.alpha;
                            }
                            Object jade4 = c0585q2.jade();
                            if (jade4 == asVar3) {
                                interfaceC1673j = interfaceC1673j2;
                                jade4 = new C0778c(new Q0.g(f5), AbstractC0779d.lima, null, 12);
                                c0585q2.f(jade4);
                            } else {
                                interfaceC1673j = interfaceC1673j2;
                            }
                            C0778c c0778c = (C0778c) jade4;
                            Q0.g gVar = new Q0.g(f5);
                            boolean india = c0585q2.india(c0778c) | c0585q2.delta(f5);
                            if ((((i25 & 14) ^ 6) > 4 && c0585q2.hotel(z10)) || (i25 & 6) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            boolean z16 = india | z11;
                            if ((((i25 & 896) ^ 384) <= 256 || !c0585q2.golf(apVar2)) && (i25 & 384) != 256) {
                                z15 = false;
                            }
                            boolean india2 = z16 | z15 | c0585q2.india(interfaceC1672i);
                            Object jade5 = c0585q2.jade();
                            if (!india2 && jade5 != asVar3) {
                                z12 = z10;
                            } else {
                                boolean z17 = z10;
                                jade5 = new ao(c0778c, f5, z17, apVar2, interfaceC1672i, null);
                                z12 = z17;
                                c0585q2.f(jade5);
                            }
                            C0564b.foxtrot((Xd.l) jade5, c0585q2, gVar);
                            c0788m = c0778c.charlie;
                        }
                        c0585q2.quebec(false);
                        if (c0788m == null) {
                            f10 = ((Q0.g) ((androidx.compose.runtime.t0) c0788m.purple).getValue()).alpha;
                            z13 = false;
                        } else {
                            z13 = false;
                            f10 = 0;
                        }
                        T.s bravo = A0.o.bravo(sVar4, z13, C0172x.red);
                        androidx.compose.foundation.layout.M m13 = m8;
                        c0585q = c0585q2;
                        long j10 = j5;
                        AbstractC0127k2.bravo(f10, (i10 & 8078) | (234881024 & (i10 << 6)), 64, j10, j7, P.e.echo(956488494, new aq(j7, m13, mVar, 0), c0585q2), bravo, asVar5, c0585q, abVar4, interfaceC1673j, function0, z12);
                        sVar3 = sVar4;
                        m10 = m13;
                        apVar3 = apVar2;
                        asVar4 = asVar5;
                        abVar3 = abVar4;
                        z14 = z12;
                        akVar5 = akVar4;
                    }
                    uniform = c0585q.uniform();
                    if (uniform == null) {
                        uniform.delta = new ar(function0, sVar3, z14, asVar4, akVar5, apVar3, abVar3, m10, mVar, i4, i5, 0);
                        return;
                    }
                    return;
                }
                abVar2 = abVar;
                i16 = 128 & i5;
                if (i16 == 0) {
                }
                if ((i5 & Barcode.FORMAT_QR_CODE) == 0) {
                }
                if ((805306368 & i4) == 0) {
                }
                if ((i10 & 306783379) != 306783378) {
                }
                c0585q2.orange();
                if ((i4 & 1) == 0) {
                }
                if (i24 != 0) {
                }
                if (i12 != 0) {
                }
                if ((i5 & 8) != 0) {
                }
                if ((i5 & 16) == 0) {
                }
                if ((i5 & 32) != 0) {
                }
                if (i14 != 0) {
                }
                if (i16 != 0) {
                }
                akVar3 = akVar2;
                b.ab abVar42 = abVar2;
                T.s sVar42 = sVar2;
                a0.as asVar52 = asVar2;
                c0585q2.romeo();
                c0585q2.purple(-239156623);
                asVar3 = C0580l.alpha;
                jade = c0585q2.jade();
                if (jade == asVar3) {
                }
                InterfaceC1673j interfaceC1673j22 = (InterfaceC1673j) jade;
                c0585q2.quebec(false);
                if (!z10) {
                }
                if (!z10) {
                }
                long j72 = j6;
                c0585q2.purple(-239150048);
                if (apVar2 != null) {
                }
                c0585q2.quebec(false);
                if (c0788m == null) {
                }
                T.s bravo2 = A0.o.bravo(sVar42, z13, C0172x.red);
                androidx.compose.foundation.layout.M m132 = m8;
                c0585q = c0585q2;
                long j102 = j5;
                AbstractC0127k2.bravo(f10, (i10 & 8078) | (234881024 & (i10 << 6)), 64, j102, j72, P.e.echo(956488494, new aq(j72, m132, mVar, 0), c0585q2), bravo2, asVar52, c0585q, abVar42, interfaceC1673j, function0, z12);
                sVar3 = sVar42;
                m10 = m132;
                apVar3 = apVar2;
                asVar4 = asVar52;
                abVar3 = abVar42;
                z14 = z12;
                akVar5 = akVar4;
                uniform = c0585q.uniform();
                if (uniform == null) {
                }
            }
            z10 = z2;
            if ((i4 & 3072) == 0) {
            }
            boolean z152 = true;
            if ((i4 & 24576) == 0) {
            }
            if ((i4 & 196608) == 0) {
            }
            i14 = i5 & 64;
            if (i14 != 0) {
            }
            abVar2 = abVar;
            i16 = 128 & i5;
            if (i16 == 0) {
            }
            if ((i5 & Barcode.FORMAT_QR_CODE) == 0) {
            }
            if ((805306368 & i4) == 0) {
            }
            if ((i10 & 306783379) != 306783378) {
            }
            c0585q2.orange();
            if ((i4 & 1) == 0) {
            }
            if (i24 != 0) {
            }
            if (i12 != 0) {
            }
            if ((i5 & 8) != 0) {
            }
            if ((i5 & 16) == 0) {
            }
            if ((i5 & 32) != 0) {
            }
            if (i14 != 0) {
            }
            if (i16 != 0) {
            }
            akVar3 = akVar2;
            b.ab abVar422 = abVar2;
            T.s sVar422 = sVar2;
            a0.as asVar522 = asVar2;
            c0585q2.romeo();
            c0585q2.purple(-239156623);
            asVar3 = C0580l.alpha;
            jade = c0585q2.jade();
            if (jade == asVar3) {
            }
            InterfaceC1673j interfaceC1673j222 = (InterfaceC1673j) jade;
            c0585q2.quebec(false);
            if (!z10) {
            }
            if (!z10) {
            }
            long j722 = j6;
            c0585q2.purple(-239150048);
            if (apVar2 != null) {
            }
            c0585q2.quebec(false);
            if (c0788m == null) {
            }
            T.s bravo22 = A0.o.bravo(sVar422, z13, C0172x.red);
            androidx.compose.foundation.layout.M m1322 = m8;
            c0585q = c0585q2;
            long j1022 = j5;
            AbstractC0127k2.bravo(f10, (i10 & 8078) | (234881024 & (i10 << 6)), 64, j1022, j722, P.e.echo(956488494, new aq(j722, m1322, mVar, 0), c0585q2), bravo22, asVar522, c0585q, abVar422, interfaceC1673j, function0, z12);
            sVar3 = sVar422;
            m10 = m1322;
            apVar3 = apVar2;
            asVar4 = asVar522;
            abVar3 = abVar422;
            z14 = z12;
            akVar5 = akVar4;
            uniform = c0585q.uniform();
            if (uniform == null) {
            }
        }
        sVar2 = sVar;
        i12 = i5 & 4;
        if (i12 == 0) {
        }
        z10 = z2;
        if ((i4 & 3072) == 0) {
        }
        boolean z1522 = true;
        if ((i4 & 24576) == 0) {
        }
        if ((i4 & 196608) == 0) {
        }
        i14 = i5 & 64;
        if (i14 != 0) {
        }
        abVar2 = abVar;
        i16 = 128 & i5;
        if (i16 == 0) {
        }
        if ((i5 & Barcode.FORMAT_QR_CODE) == 0) {
        }
        if ((805306368 & i4) == 0) {
        }
        if ((i10 & 306783379) != 306783378) {
        }
        c0585q2.orange();
        if ((i4 & 1) == 0) {
        }
        if (i24 != 0) {
        }
        if (i12 != 0) {
        }
        if ((i5 & 8) != 0) {
        }
        if ((i5 & 16) == 0) {
        }
        if ((i5 & 32) != 0) {
        }
        if (i14 != 0) {
        }
        if (i16 != 0) {
        }
        akVar3 = akVar2;
        b.ab abVar4222 = abVar2;
        T.s sVar4222 = sVar2;
        a0.as asVar5222 = asVar2;
        c0585q2.romeo();
        c0585q2.purple(-239156623);
        asVar3 = C0580l.alpha;
        jade = c0585q2.jade();
        if (jade == asVar3) {
        }
        InterfaceC1673j interfaceC1673j2222 = (InterfaceC1673j) jade;
        c0585q2.quebec(false);
        if (!z10) {
        }
        if (!z10) {
        }
        long j7222 = j6;
        c0585q2.purple(-239150048);
        if (apVar2 != null) {
        }
        c0585q2.quebec(false);
        if (c0788m == null) {
        }
        T.s bravo222 = A0.o.bravo(sVar4222, z13, C0172x.red);
        androidx.compose.foundation.layout.M m13222 = m8;
        c0585q = c0585q2;
        long j10222 = j5;
        AbstractC0127k2.bravo(f10, (i10 & 8078) | (234881024 & (i10 << 6)), 64, j10222, j7222, P.e.echo(956488494, new aq(j7222, m13222, mVar, 0), c0585q2), bravo222, asVar5222, c0585q, abVar4222, interfaceC1673j, function0, z12);
        sVar3 = sVar4222;
        m10 = m13222;
        apVar3 = apVar2;
        asVar4 = asVar5222;
        abVar3 = abVar4222;
        z14 = z12;
        akVar5 = akVar4;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void charlie(T.s sVar, a0.as asVar, at atVar, au auVar, b.ab abVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        at atVar2;
        au auVar2;
        b.ab abVar2;
        int i11;
        b.ab abVar3;
        androidx.compose.runtime.as asVar2;
        Object jade;
        C0585q c0585q;
        androidx.compose.runtime.Q uniform;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1179621553);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(sVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(asVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i4 & 384) == 0) {
            if ((i5 & 4) == 0) {
                atVar2 = atVar;
                if (c0585q2.golf(atVar2)) {
                    i14 = Barcode.FORMAT_QR_CODE;
                    i10 |= i14;
                }
            } else {
                atVar2 = atVar;
            }
            i14 = 128;
            i10 |= i14;
        } else {
            atVar2 = atVar;
        }
        if ((i4 & 3072) == 0) {
            if ((i5 & 8) == 0) {
                auVar2 = auVar;
                if (c0585q2.golf(auVar2)) {
                    i13 = 2048;
                    i10 |= i13;
                }
            } else {
                auVar2 = auVar;
            }
            i13 = Barcode.FORMAT_UPC_E;
            i10 |= i13;
        } else {
            auVar2 = auVar;
        }
        int i17 = i5 & 16;
        if (i17 != 0) {
            i10 |= 24576;
        } else if ((i4 & 24576) == 0) {
            abVar2 = abVar;
            if (c0585q2.golf(abVar2)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i10 |= i11;
            if ((196608 & i4) == 0) {
                if (c0585q2.india(dVar)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i10 |= i12;
            }
            if ((74899 & i10) != 74898 && c0585q2.bronze()) {
                c0585q2.ochre();
                c0585q = c0585q2;
            } else {
                c0585q2.orange();
                if ((i4 & 1) == 0 && !c0585q2.beige()) {
                    c0585q2.ochre();
                    if ((i5 & 4) != 0) {
                        i10 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        i10 &= -7169;
                    }
                } else {
                    if ((i5 & 4) != 0) {
                        atVar2 = quebec((O) c0585q2.kilo(Q.alpha));
                        i10 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        auVar2 = mike(0.0f, 63);
                        i10 &= -7169;
                    }
                    if (i17 != 0) {
                        abVar3 = null;
                        c0585q2.romeo();
                        long j5 = atVar2.alpha;
                        auVar2.getClass();
                        c0585q2.purple(-1763481333);
                        c0585q2.purple(-734838460);
                        asVar2 = C0580l.alpha;
                        jade = c0585q2.jade();
                        if (jade == asVar2) {
                            jade = C0564b.zulu(new Q0.g(auVar2.alpha));
                            c0585q2.f(jade);
                        }
                        c0585q2.quebec(false);
                        c0585q2.quebec(false);
                        c0585q = c0585q2;
                        AbstractC0127k2.alpha(sVar, asVar, j5, atVar2.bravo, 0.0f, ((Q0.g) ((androidx.compose.runtime.ax) jade).getValue()).alpha, abVar3, P.e.echo(664103990, new C0096d(dVar, 4, (byte) 0), c0585q2), c0585q, (i10 & 14) | 12582912 | (i10 & 112) | ((i10 << 6) & 3670016), 16);
                        abVar2 = abVar3;
                    }
                }
                abVar3 = abVar2;
                c0585q2.romeo();
                long j52 = atVar2.alpha;
                auVar2.getClass();
                c0585q2.purple(-1763481333);
                c0585q2.purple(-734838460);
                asVar2 = C0580l.alpha;
                jade = c0585q2.jade();
                if (jade == asVar2) {
                }
                c0585q2.quebec(false);
                c0585q2.quebec(false);
                c0585q = c0585q2;
                AbstractC0127k2.alpha(sVar, asVar, j52, atVar2.bravo, 0.0f, ((Q0.g) ((androidx.compose.runtime.ax) jade).getValue()).alpha, abVar3, P.e.echo(664103990, new C0096d(dVar, 4, (byte) 0), c0585q2), c0585q, (i10 & 14) | 12582912 | (i10 & 112) | ((i10 << 6) & 3670016), 16);
                abVar2 = abVar3;
            }
            au auVar3 = auVar2;
            at atVar3 = atVar2;
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new av(sVar, asVar, atVar3, auVar3, abVar2, dVar, i4, i5);
                return;
            }
            return;
        }
        abVar2 = abVar;
        if ((196608 & i4) == 0) {
        }
        if ((74899 & i10) != 74898) {
        }
        c0585q2.orange();
        if ((i4 & 1) == 0) {
        }
        if ((i5 & 4) != 0) {
        }
        if ((i5 & 8) != 0) {
        }
        if (i17 != 0) {
        }
        abVar3 = abVar2;
        c0585q2.romeo();
        long j522 = atVar2.alpha;
        auVar2.getClass();
        c0585q2.purple(-1763481333);
        c0585q2.purple(-734838460);
        asVar2 = C0580l.alpha;
        jade = c0585q2.jade();
        if (jade == asVar2) {
        }
        c0585q2.quebec(false);
        c0585q2.quebec(false);
        c0585q = c0585q2;
        AbstractC0127k2.alpha(sVar, asVar, j522, atVar2.bravo, 0.0f, ((Q0.g) ((androidx.compose.runtime.ax) jade).getValue()).alpha, abVar3, P.e.echo(664103990, new C0096d(dVar, 4, (byte) 0), c0585q2), c0585q, (i10 & 14) | 12582912 | (i10 & 112) | ((i10 << 6) & 3670016), 16);
        abVar2 = abVar3;
        au auVar32 = auVar2;
        at atVar32 = atVar2;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void delta(T.s sVar, float f5, long j5, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        T.s sVar2;
        float f10;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1562471785);
        int i13 = i5 & 1;
        if (i13 != 0) {
            i10 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.foxtrot(j5)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i10 & 147) == 146 && c0585q.bronze()) {
            c0585q.ochre();
            sVar2 = sVar;
        } else {
            c0585q.orange();
            if ((i4 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
            } else if (i13 != 0) {
                sVar2 = T.p.alpha;
                c0585q.romeo();
                c0585q.purple(-433645095);
                if (!Q0.g.alpha(f5, 0.0f)) {
                    f10 = 1.0f / ((Q0.d) c0585q.kilo(AbstractC2901T.hotel)).alpha();
                } else {
                    f10 = f5;
                }
                c0585q.quebec(false);
                AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(sVar2, 1.0f), f10), j5, a0.ao.alpha), c0585q, 0);
            }
            sVar2 = sVar;
            c0585q.romeo();
            c0585q.purple(-433645095);
            if (!Q0.g.alpha(f5, 0.0f)) {
            }
            c0585q.quebec(false);
            AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(sVar2, 1.0f), f10), j5, a0.ao.alpha), c0585q, 0);
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0097d0(sVar2, f5, j5, i4, i5, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void echo(T.s sVar, float f5, long j5, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        T.s sVar2;
        int i10;
        int i11;
        float f10;
        int i12;
        long j6;
        T.s sVar3;
        boolean z2;
        boolean z10;
        Object jade;
        T.s sVar4;
        androidx.compose.runtime.Q uniform;
        int i13;
        int i14 = 0;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(75144485);
        boolean z11 = true;
        int i15 = i5 & 1;
        if (i15 != 0) {
            i10 = i4 | 6;
            sVar2 = sVar;
        } else if ((i4 & 6) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i4;
        } else {
            sVar2 = sVar;
            i10 = i4;
        }
        int i16 = i5 & 2;
        if (i16 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            f10 = f5;
            if (c0585q.delta(f10)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
            if ((i4 & 384) != 0) {
                j6 = j5;
                if ((i5 & 4) == 0 && c0585q.foxtrot(j6)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i10 |= i13;
            } else {
                j6 = j5;
            }
            if ((i10 & 147) != 146 && c0585q.bronze()) {
                c0585q.ochre();
                sVar4 = sVar2;
            } else {
                c0585q.orange();
                if ((i4 & 1) == 0 && !c0585q.beige()) {
                    c0585q.ochre();
                    if ((i5 & 4) != 0) {
                        i10 &= -897;
                    }
                    sVar3 = sVar2;
                } else {
                    if (i15 == 0) {
                        sVar3 = T.p.alpha;
                    } else {
                        sVar3 = sVar2;
                    }
                    if (i16 != 0) {
                        f10 = AbstractC0093c0.alpha;
                    }
                    if ((i5 & 4) != 0) {
                        float f11 = AbstractC0093c0.alpha;
                        float f12 = H.e.alpha;
                        i10 &= -897;
                        j6 = Q.delta(c0585q, 25);
                    }
                }
                c0585q.romeo();
                T.s echo = androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(sVar3, 1.0f), f10);
                if ((i10 & 112) != 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((((i10 & 896) ^ 384) > 256 || !c0585q.foxtrot(j6)) && (i10 & 384) != 256) {
                    z11 = false;
                }
                z10 = z2 | z11;
                jade = c0585q.jade();
                if (!z10 || jade == C0580l.alpha) {
                    jade = new C0101e0(f10, i14, j6);
                    c0585q.f(jade);
                }
                T3.alpha(echo, (Function1) jade, c0585q, 0);
                sVar4 = sVar3;
            }
            float f13 = f10;
            long j7 = j6;
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C0097d0(sVar4, f13, j7, i4, i5, 1);
                return;
            }
            return;
        }
        f10 = f5;
        if ((i4 & 384) != 0) {
        }
        if ((i10 & 147) != 146) {
        }
        c0585q.orange();
        if ((i4 & 1) == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 != 0) {
        }
        if ((i5 & 4) != 0) {
        }
        c0585q.romeo();
        T.s echo2 = androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(sVar3, 1.0f), f10);
        if ((i10 & 112) != 32) {
        }
        if (((i10 & 896) ^ 384) > 256) {
        }
        z11 = false;
        z10 = z2 | z11;
        jade = c0585q.jade();
        if (!z10) {
        }
        jade = new C0101e0(f10, i14, j6);
        c0585q.f(jade);
        T3.alpha(echo2, (Function1) jade, c0585q, 0);
        sVar4 = sVar3;
        float f132 = f10;
        long j72 = j6;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void foxtrot(Function0 function0, T.s sVar, boolean z2, C0129l0 c0129l0, Xd.l lVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        T.s sVar2;
        int i11;
        int i12;
        long j5;
        C0129l0 c0129l02;
        long j6;
        long j7;
        long j10;
        int i13;
        boolean z10;
        C0129l0 c0129l03;
        long j11;
        int romeo;
        long j12;
        Xd.l lVar2;
        boolean z11;
        androidx.compose.runtime.Q uniform;
        int i14;
        int i15;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1142896114);
        if ((i4 & 6) == 0) {
            if (c0585q.india(function0)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i10 = i15 | i4;
        } else {
            i10 = i4;
        }
        int i16 = i5 & 2;
        if (i16 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
            int i17 = i10 | 384;
            if ((i4 & 3072) == 0) {
                i17 = i10 | 1408;
            }
            i12 = i17 | 24576;
            if ((196608 & i4) == 0) {
                if (c0585q.india(lVar)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            if ((74899 & i12) != 74898 && c0585q.bronze()) {
                c0585q.ochre();
                z11 = z2;
                c0129l03 = c0129l0;
                lVar2 = lVar;
            } else {
                c0585q.orange();
                if ((i4 & 1) == 0 && !c0585q.beige()) {
                    c0585q.ochre();
                    i13 = i12 & (-7169);
                    z10 = z2;
                    c0129l03 = c0129l0;
                } else {
                    if (i16 != 0) {
                        sVar2 = T.p.alpha;
                    }
                    c0585q.purple(-1519621781);
                    j5 = ((C0366t) c0585q.kilo(Y.alpha)).alpha;
                    O o5 = (O) c0585q.kilo(Q.alpha);
                    c0129l02 = o5.lime;
                    if (c0129l02 == null) {
                        long j13 = C0366t.juliet;
                        C0129l0 c0129l04 = new C0129l0(j13, j5, j13, C0366t.bravo(0.38f, j5));
                        o5.lime = c0129l04;
                        c0129l02 = c0129l04;
                    }
                    j6 = c0129l02.bravo;
                    if (!C0366t.charlie(j6, j5)) {
                        c0585q.quebec(false);
                    } else {
                        long bravo = C0366t.bravo(0.38f, j5);
                        if (j5 != 16) {
                            j7 = j5;
                        } else {
                            j7 = j6;
                        }
                        if (bravo != 16) {
                            j10 = bravo;
                        } else {
                            j10 = c0129l02.delta;
                        }
                        C0129l0 c0129l05 = new C0129l0(c0129l02.alpha, j7, c0129l02.charlie, j10);
                        c0585q.quebec(false);
                        c0129l02 = c0129l05;
                    }
                    i13 = i12 & (-7169);
                    z10 = true;
                    c0129l03 = c0129l02;
                }
                int i18 = i13;
                T.s sVar3 = sVar2;
                c0585q.romeo();
                androidx.compose.runtime.E0 e02 = AbstractC0145p0.alpha;
                T.s then = sVar3.then(MinimumInteractiveModifier.alpha);
                float f5 = H.j.bravo;
                T.s alpha2 = AbstractC3087z.alpha(androidx.compose.foundation.layout.V.kilo(then, f5), Z1.alpha(c0585q, 5));
                if (!z10) {
                    j11 = c0129l03.alpha;
                } else {
                    j11 = c0129l03.charlie;
                }
                T.s charlie = androidx.compose.foundation.a.charlie(androidx.compose.foundation.a.bravo(alpha2, j11, a0.ao.alpha), null, L1.bravo(false, f5 / 2, c0585q, 54, 4), z10, new A0.h(0), function0, 8);
                q0.ap delta = AbstractC0547m.delta(T.d.teal, false);
                romeo = C0564b.romeo(c0585q);
                androidx.compose.runtime.I mike = c0585q.mike();
                T.s charlie2 = T.a.charlie(charlie, c0585q);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q.white();
                if (!c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q, delta);
                C0564b.blue(C2551k.echo, c0585q, mike);
                C2549i c2549i = C2551k.golf;
                if (!c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                    ao.ad.blue(romeo, c0585q, romeo, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie2);
                if (!z10) {
                    j12 = c0129l03.bravo;
                } else {
                    j12 = c0129l03.delta;
                }
                lVar2 = lVar;
                C0564b.alpha(Y.alpha.alpha(new C0366t(j12)), lVar2, c0585q, ((i18 >> 12) & 112) | 8);
                c0585q.quebec(true);
                sVar2 = sVar3;
                z11 = z10;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C0133m0(function0, sVar2, z11, c0129l03, lVar2, i4, i5);
                return;
            }
            return;
        }
        sVar2 = sVar;
        int i172 = i10 | 384;
        if ((i4 & 3072) == 0) {
        }
        i12 = i172 | 24576;
        if ((196608 & i4) == 0) {
        }
        if ((74899 & i12) != 74898) {
        }
        c0585q.orange();
        if ((i4 & 1) == 0) {
        }
        if (i16 != 0) {
        }
        c0585q.purple(-1519621781);
        j5 = ((C0366t) c0585q.kilo(Y.alpha)).alpha;
        O o52 = (O) c0585q.kilo(Q.alpha);
        c0129l02 = o52.lime;
        if (c0129l02 == null) {
        }
        j6 = c0129l02.bravo;
        if (!C0366t.charlie(j6, j5)) {
        }
        i13 = i12 & (-7169);
        z10 = true;
        c0129l03 = c0129l02;
        int i182 = i13;
        T.s sVar32 = sVar2;
        c0585q.romeo();
        androidx.compose.runtime.E0 e022 = AbstractC0145p0.alpha;
        T.s then2 = sVar32.then(MinimumInteractiveModifier.alpha);
        float f52 = H.j.bravo;
        T.s alpha22 = AbstractC3087z.alpha(androidx.compose.foundation.layout.V.kilo(then2, f52), Z1.alpha(c0585q, 5));
        if (!z10) {
        }
        T.s charlie3 = androidx.compose.foundation.a.charlie(androidx.compose.foundation.a.bravo(alpha22, j11, a0.ao.alpha), null, L1.bravo(false, f52 / 2, c0585q, 54, 4), z10, new A0.h(0), function0, 8);
        q0.ap delta2 = AbstractC0547m.delta(T.d.teal, false);
        romeo = C0564b.romeo(c0585q);
        androidx.compose.runtime.I mike2 = c0585q.mike();
        T.s charlie22 = T.a.charlie(charlie3, c0585q);
        InterfaceC2552l.maroon.getClass();
        C2550j c2550j2 = C2551k.bravo;
        c0585q.white();
        if (!c0585q.lime) {
        }
        C0564b.blue(C2551k.foxtrot, c0585q, delta2);
        C0564b.blue(C2551k.echo, c0585q, mike2);
        C2549i c2549i2 = C2551k.golf;
        if (!c0585q.lime) {
        }
        ao.ad.blue(romeo, c0585q, romeo, c2549i2);
        C0564b.blue(C2551k.delta, c0585q, charlie22);
        if (!z10) {
        }
        lVar2 = lVar;
        C0564b.alpha(Y.alpha.alpha(new C0366t(j12)), lVar2, c0585q, ((i182 >> 12) & 112) | 8);
        c0585q.quebec(true);
        sVar2 = sVar32;
        z11 = z10;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void golf(Function0 function0, C0126k1 c0126k1, C0778c c0778c, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        C0126k1 c0126k12;
        androidx.compose.runtime.as asVar;
        Q0.n nVar;
        boolean z2;
        C0585q c0585q;
        Object obj;
        boolean z10;
        boolean z11;
        C0585q c0585q2;
        int i10;
        boolean india;
        int i11;
        int i12;
        int i13;
        C0585q c0585q3 = (C0585q) interfaceC0581m;
        c0585q3.silver(1254951810);
        if ((i4 & 6) == 0) {
            if (c0585q3.india(function0)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i5 = i13 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            c0126k12 = c0126k1;
            if (c0585q3.golf(c0126k12)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i5 |= i12;
        } else {
            c0126k12 = c0126k1;
        }
        if ((i4 & 384) == 0) {
            if ((i4 & 512) == 0) {
                india = c0585q3.golf(c0778c);
            } else {
                india = c0585q3.india(c0778c);
            }
            if (india) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i5 |= i11;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q3.india(dVar)) {
                i10 = 2048;
            } else {
                i10 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i10;
        }
        int i14 = i5;
        if ((i14 & 1171) == 1170 && c0585q3.bronze()) {
            c0585q3.ochre();
            c0585q2 = c0585q3;
        } else {
            View view = (View) c0585q3.kilo(AndroidCompositionLocals_androidKt.foxtrot);
            Q0.d dVar2 = (Q0.d) c0585q3.kilo(AbstractC2901T.hotel);
            Q0.n nVar2 = (Q0.n) c0585q3.kilo(AbstractC2901T.november);
            C0584p beige = C0564b.beige(c0585q3);
            androidx.compose.runtime.ax black = C0564b.black(dVar, c0585q3);
            UUID uuid = (UUID) R.l.delta(new Object[0], null, P.f1046c, c0585q3, 3072, 6);
            Object jade = c0585q3.jade();
            androidx.compose.runtime.as asVar2 = C0580l.alpha;
            if (jade == asVar2) {
                C0593z c0593z = new C0593z(C0564b.november(c0585q3));
                c0585q3.f(c0593z);
                jade = c0593z;
            }
            vf.ab abVar = ((C0593z) jade).alpha;
            boolean z12 = true;
            if ((((Configuration) c0585q3.kilo(AndroidCompositionLocals_androidKt.alpha)).uiMode & 48) != 32) {
                z12 = false;
            }
            boolean golf = c0585q3.golf(view) | c0585q3.golf(dVar2);
            Object jade2 = c0585q3.jade();
            if (!golf && jade2 != asVar2) {
                obj = jade2;
                c0585q = c0585q3;
                asVar = asVar2;
                nVar = nVar2;
                z2 = true;
            } else {
                C0585q c0585q4 = c0585q3;
                asVar = asVar2;
                nVar = nVar2;
                z2 = true;
                M0 m02 = new M0(function0, c0126k12, view, nVar, dVar2, uuid, c0778c, abVar, z12);
                P.d dVar3 = new P.d(new C0140o(black, 1), -1560960657, true);
                I0 i02 = m02.silver;
                i02.setParentCompositionContext(beige);
                ((androidx.compose.runtime.t0) i02.f1029f).setValue(dVar3);
                i02.f1031h = true;
                i02.charlie();
                c0585q4.f(m02);
                obj = m02;
                c0585q = c0585q4;
            }
            M0 m03 = (M0) obj;
            boolean india2 = c0585q.india(m03);
            Object jade3 = c0585q.jade();
            if (india2 || jade3 == asVar) {
                jade3 = new K0(m03, 1);
                c0585q.f(jade3);
            }
            C0564b.delta(m03, (Function1) jade3, c0585q);
            boolean india3 = c0585q.india(m03);
            if ((i14 & 14) == 4) {
                z10 = z2;
            } else {
                z10 = false;
            }
            boolean z13 = india3 | z10;
            if ((i14 & 112) == 32) {
                z11 = z2;
            } else {
                z11 = false;
            }
            boolean golf2 = z13 | z11 | c0585q.golf(nVar);
            Object jade4 = c0585q.jade();
            if (golf2 || jade4 == asVar) {
                jade4 = new S0((ae.p) m03, function0, (Object) c0126k1, nVar, 1);
                c0585q.f(jade4);
            }
            C0564b.juliet((Function0) jade4, c0585q);
            c0585q2 = c0585q;
        }
        androidx.compose.runtime.Q uniform = c0585q2.uniform();
        if (uniform != null) {
            uniform.delta = new C0134m1(function0, c0126k1, c0778c, dVar, i4, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void hotel(Function0 function0, T.s sVar, boolean z2, a0.as asVar, ak akVar, ap apVar, b.ab abVar, androidx.compose.foundation.layout.M m4, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        boolean z10;
        int i11;
        a0.as asVar2;
        ak akVar2;
        int i12;
        ap apVar2;
        int i13;
        b.ab abVar2;
        androidx.compose.foundation.layout.M m5;
        int i14;
        P.d dVar2;
        boolean z11;
        C0585q c0585q;
        ap apVar3;
        androidx.compose.runtime.Q uniform;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1694808287);
        if ((i4 & 6) == 0) {
            if (c0585q2.india(function0)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i10 = i21 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(sVar)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i10 |= i20;
        }
        int i22 = i5 & 4;
        if (i22 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            z10 = z2;
            if (c0585q2.hotel(z10)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            if ((i4 & 3072) != 0) {
                asVar2 = asVar;
                if (c0585q2.golf(asVar2)) {
                    i19 = 2048;
                } else {
                    i19 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i19;
            } else {
                asVar2 = asVar;
            }
            if ((i4 & 24576) != 0) {
                akVar2 = akVar;
                if (c0585q2.golf(akVar2)) {
                    i18 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i18 = 8192;
                }
                i10 |= i18;
            } else {
                akVar2 = akVar;
            }
            i12 = i5 & 32;
            if (i12 == 0) {
                i10 |= 196608;
            } else if ((196608 & i4) == 0) {
                apVar2 = apVar;
                if (c0585q2.golf(apVar2)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i10 |= i13;
                if ((1572864 & i4) == 0) {
                    abVar2 = abVar;
                    if (c0585q2.golf(abVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i10 |= i17;
                } else {
                    abVar2 = abVar;
                }
                if ((12582912 & i4) == 0) {
                    m5 = m4;
                    if (c0585q2.golf(m5)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i10 |= i16;
                } else {
                    m5 = m4;
                }
                i14 = i10 | 100663296;
                if ((805306368 & i4) == 0) {
                    dVar2 = dVar;
                    if (c0585q2.india(dVar2)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i14 |= i15;
                } else {
                    dVar2 = dVar;
                }
                if ((306783379 & i14) != 306783378 && c0585q2.bronze()) {
                    c0585q2.ochre();
                    c0585q = c0585q2;
                    apVar3 = apVar2;
                } else {
                    c0585q2.orange();
                    if ((i4 & 1) == 0 && !c0585q2.beige()) {
                        c0585q2.ochre();
                        z11 = z10;
                    } else {
                        if (i22 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i12 != 0) {
                            apVar2 = null;
                        }
                    }
                    ap apVar4 = apVar2;
                    c0585q2.romeo();
                    c0585q = c0585q2;
                    P.d dVar3 = dVar2;
                    boolean z12 = z11;
                    bravo(function0, sVar, z12, asVar2, akVar2, apVar4, abVar2, m5, dVar3, c0585q, i14 & 2147483646, 0);
                    z10 = z12;
                    apVar3 = apVar4;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new ar(function0, sVar, z10, asVar, akVar, apVar3, abVar, m4, dVar, i4, i5, 1);
                    return;
                }
                return;
            }
            apVar2 = apVar;
            if ((1572864 & i4) == 0) {
            }
            if ((12582912 & i4) == 0) {
            }
            i14 = i10 | 100663296;
            if ((805306368 & i4) == 0) {
            }
            if ((306783379 & i14) != 306783378) {
            }
            c0585q2.orange();
            if ((i4 & 1) == 0) {
            }
            if (i22 != 0) {
            }
            if (i12 != 0) {
            }
            ap apVar42 = apVar2;
            c0585q2.romeo();
            c0585q = c0585q2;
            P.d dVar32 = dVar2;
            boolean z122 = z11;
            bravo(function0, sVar, z122, asVar2, akVar2, apVar42, abVar2, m5, dVar32, c0585q, i14 & 2147483646, 0);
            z10 = z122;
            apVar3 = apVar42;
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        z10 = z2;
        if ((i4 & 3072) != 0) {
        }
        if ((i4 & 24576) != 0) {
        }
        i12 = i5 & 32;
        if (i12 == 0) {
        }
        apVar2 = apVar;
        if ((1572864 & i4) == 0) {
        }
        if ((12582912 & i4) == 0) {
        }
        i14 = i10 | 100663296;
        if ((805306368 & i4) == 0) {
        }
        if ((306783379 & i14) != 306783378) {
        }
        c0585q2.orange();
        if ((i4 & 1) == 0) {
        }
        if (i22 != 0) {
        }
        if (i12 != 0) {
        }
        ap apVar422 = apVar2;
        c0585q2.romeo();
        c0585q = c0585q2;
        P.d dVar322 = dVar2;
        boolean z1222 = z11;
        bravo(function0, sVar, z1222, asVar2, akVar2, apVar422, abVar2, m5, dVar322, c0585q, i14 & 2147483646, 0);
        z10 = z1222;
        apVar3 = apVar422;
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final void india(a0.as asVar, at atVar, au auVar, b.ab abVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        au auVar2;
        au auVar3;
        T.p pVar = T.p.alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(740336179);
        if (c0585q.golf(asVar)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i13 = i4 | i5;
        if (c0585q.golf(atVar)) {
            i10 = Barcode.FORMAT_QR_CODE;
        } else {
            i10 = 128;
        }
        int i14 = i13 | i10 | Barcode.FORMAT_UPC_E;
        if (c0585q.golf(abVar)) {
            i11 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i11 = 8192;
        }
        int i15 = i14 | i11;
        if ((74899 & i15) == 74898 && c0585q.bronze()) {
            c0585q.ochre();
            auVar3 = auVar;
        } else {
            c0585q.orange();
            if ((i4 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                i12 = i15 & (-7169);
                auVar2 = auVar;
            } else {
                float f5 = H.n.alpha;
                i12 = i15 & (-7169);
                auVar2 = new au(f5, f5, f5, f5, H.n.charlie, H.n.bravo);
            }
            c0585q.romeo();
            charlie(pVar, asVar, atVar, auVar2, abVar, dVar, c0585q, i12 & 524286, 0);
            auVar3 = auVar2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aw(asVar, atVar, auVar3, abVar, dVar, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void juliet(Function0 function0, T.s sVar, boolean z2, a0.as asVar, ak akVar, androidx.compose.foundation.layout.M m4, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        T.s sVar2;
        int i11;
        int i12;
        boolean z10;
        int i13;
        a0.as asVar2;
        int i14;
        P.d dVar2;
        T.s sVar3;
        ak akVar2;
        int i15;
        ak akVar3;
        int i16;
        androidx.compose.foundation.layout.M m5;
        C0585q c0585q;
        T.s sVar4;
        boolean z11;
        a0.as asVar3;
        ak akVar4;
        androidx.compose.foundation.layout.M m8;
        androidx.compose.runtime.Q uniform;
        int i17;
        int i18;
        int i19;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-2106428362);
        if ((i4 & 6) == 0) {
            if (c0585q2.india(function0)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i10 = i19 | i4;
        } else {
            i10 = i4;
        }
        int i20 = i5 & 2;
        if (i20 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            sVar2 = sVar;
            if (c0585q2.golf(sVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
            i12 = i5 & 4;
            if (i12 == 0) {
                i10 |= 384;
            } else if ((i4 & 384) == 0) {
                z10 = z2;
                if (c0585q2.hotel(z10)) {
                    i13 = Barcode.FORMAT_QR_CODE;
                } else {
                    i13 = 128;
                }
                i10 |= i13;
                if ((i4 & 3072) == 0) {
                    if ((i5 & 8) == 0) {
                        asVar2 = asVar;
                        if (c0585q2.golf(asVar2)) {
                            i18 = 2048;
                            i10 |= i18;
                        }
                    } else {
                        asVar2 = asVar;
                    }
                    i18 = Barcode.FORMAT_UPC_E;
                    i10 |= i18;
                } else {
                    asVar2 = asVar;
                }
                if ((i4 & 24576) == 0) {
                    i10 |= 8192;
                }
                i14 = i10 | 115015680;
                if ((805306368 & i4) == 0) {
                    dVar2 = dVar;
                    if (c0585q2.india(dVar2)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i14 |= i17;
                } else {
                    dVar2 = dVar;
                }
                if ((306783379 & i14) != 306783378 && c0585q2.bronze()) {
                    c0585q2.ochre();
                    c0585q = c0585q2;
                    sVar4 = sVar2;
                    z11 = z10;
                    asVar3 = asVar2;
                    akVar4 = akVar;
                    m8 = m4;
                } else {
                    c0585q2.orange();
                    if ((i4 & 1) == 0 && !c0585q2.beige()) {
                        c0585q2.ochre();
                        if ((i5 & 8) != 0) {
                            i14 &= -7169;
                        }
                        i16 = i14 & (-57345);
                        akVar3 = akVar;
                        m5 = m4;
                        sVar3 = sVar2;
                    } else {
                        if (i20 != 0) {
                            sVar3 = T.p.alpha;
                        } else {
                            sVar3 = sVar2;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        }
                        if ((i5 & 8) != 0) {
                            androidx.compose.foundation.layout.M m10 = al.alpha;
                            i14 &= -7169;
                            asVar2 = Z1.alpha(c0585q2, 5);
                        }
                        androidx.compose.foundation.layout.M m11 = al.alpha;
                        O o5 = (O) c0585q2.kilo(Q.alpha);
                        akVar2 = o5.gray;
                        if (akVar2 == null) {
                            long j5 = C0366t.juliet;
                            i15 = -57345;
                            akVar3 = new ak(j5, Q.charlie(o5, 26), j5, C0366t.bravo(0.38f, Q.charlie(o5, 18)));
                            o5.gray = akVar3;
                        } else {
                            i15 = -57345;
                            akVar3 = akVar2;
                        }
                        i16 = i14 & i15;
                        m5 = al.bravo;
                    }
                    boolean z12 = z10;
                    a0.as asVar4 = asVar2;
                    c0585q2.romeo();
                    c0585q = c0585q2;
                    P.d dVar3 = dVar2;
                    T.s sVar5 = sVar3;
                    bravo(function0, sVar5, z12, asVar4, akVar3, null, null, m5, dVar3, c0585q, i16 & 2147483646, 0);
                    sVar4 = sVar5;
                    z11 = z12;
                    asVar3 = asVar4;
                    akVar4 = akVar3;
                    m8 = m5;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new as(function0, sVar4, z11, asVar3, akVar4, m8, dVar, i4, i5);
                    return;
                }
                return;
            }
            z10 = z2;
            if ((i4 & 3072) == 0) {
            }
            if ((i4 & 24576) == 0) {
            }
            i14 = i10 | 115015680;
            if ((805306368 & i4) == 0) {
            }
            if ((306783379 & i14) != 306783378) {
            }
            c0585q2.orange();
            if ((i4 & 1) == 0) {
            }
            if (i20 != 0) {
            }
            if (i12 != 0) {
            }
            if ((i5 & 8) != 0) {
            }
            androidx.compose.foundation.layout.M m112 = al.alpha;
            O o52 = (O) c0585q2.kilo(Q.alpha);
            akVar2 = o52.gray;
            if (akVar2 == null) {
            }
            i16 = i14 & i15;
            m5 = al.bravo;
            boolean z122 = z10;
            a0.as asVar42 = asVar2;
            c0585q2.romeo();
            c0585q = c0585q2;
            P.d dVar32 = dVar2;
            T.s sVar52 = sVar3;
            bravo(function0, sVar52, z122, asVar42, akVar3, null, null, m5, dVar32, c0585q, i16 & 2147483646, 0);
            sVar4 = sVar52;
            z11 = z122;
            asVar3 = asVar42;
            akVar4 = akVar3;
            m8 = m5;
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        sVar2 = sVar;
        i12 = i5 & 4;
        if (i12 == 0) {
        }
        z10 = z2;
        if ((i4 & 3072) == 0) {
        }
        if ((i4 & 24576) == 0) {
        }
        i14 = i10 | 115015680;
        if ((805306368 & i4) == 0) {
        }
        if ((306783379 & i14) != 306783378) {
        }
        c0585q2.orange();
        if ((i4 & 1) == 0) {
        }
        if (i20 != 0) {
        }
        if (i12 != 0) {
        }
        if ((i5 & 8) != 0) {
        }
        androidx.compose.foundation.layout.M m1122 = al.alpha;
        O o522 = (O) c0585q2.kilo(Q.alpha);
        akVar2 = o522.gray;
        if (akVar2 == null) {
        }
        i16 = i14 & i15;
        m5 = al.bravo;
        boolean z1222 = z10;
        a0.as asVar422 = asVar2;
        c0585q2.romeo();
        c0585q = c0585q2;
        P.d dVar322 = dVar2;
        T.s sVar522 = sVar3;
        bravo(function0, sVar522, z1222, asVar422, akVar3, null, null, m5, dVar322, c0585q, i16 & 2147483646, 0);
        sVar4 = sVar522;
        z11 = z1222;
        asVar3 = asVar422;
        akVar4 = akVar3;
        m8 = m5;
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final void kilo(T.s sVar, float f5, long j5, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1534852205);
        if (((i4 | 48) & 147) == 146 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            c0585q.orange();
            if ((i4 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
            } else {
                f5 = AbstractC0093c0.alpha;
            }
            c0585q.romeo();
            T.s oscar = androidx.compose.foundation.layout.V.oscar(sVar.then(androidx.compose.foundation.layout.V.bravo), f5);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new C0101e0(f5, 1, j5);
                c0585q.f(jade);
            }
            T3.alpha(oscar, (Function1) jade, c0585q, 0);
        }
        float f10 = f5;
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0105f0(sVar, f10, j5, i4);
        }
    }

    public static at lima(long j5, InterfaceC0581m interfaceC0581m, int i4) {
        long j6;
        long bravo = Q.bravo(j5, interfaceC0581m);
        long j7 = C0366t.kilo;
        long bravo2 = C0366t.bravo(0.38f, bravo);
        at quebec = quebec((O) ((C0585q) interfaceC0581m).kilo(Q.alpha));
        if (j5 != 16) {
            j6 = j5;
        } else {
            j6 = quebec.alpha;
        }
        if (bravo == 16) {
            bravo = quebec.bravo;
        }
        long j10 = bravo;
        if (j7 == 16) {
            j7 = quebec.charlie;
        }
        long j11 = j7;
        if (bravo2 == 16) {
            bravo2 = quebec.delta;
        }
        return new at(j6, j10, j11, bravo2);
    }

    public static au mike(float f5, int i4) {
        if ((i4 & 1) != 0) {
            f5 = H.h.alpha;
        }
        return new au(f5, H.h.hotel, H.h.foxtrot, H.h.golf, H.h.echo, H.h.charlie);
    }

    public static ay november(long j5, long j6, long j7, InterfaceC0581m interfaceC0581m) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22 = C0366t.kilo;
        O o5 = (O) ((C0585q) interfaceC0581m).kilo(Q.alpha);
        ay ayVar = o5.lavender;
        if (ayVar == null) {
            long charlie = Q.charlie(o5, H.a.delta);
            long j23 = C0366t.juliet;
            int i4 = H.a.bravo;
            long charlie2 = Q.charlie(o5, i4);
            int i5 = H.a.charlie;
            j10 = j22;
            ay ayVar2 = new ay(charlie, j23, charlie2, j23, C0366t.bravo(0.38f, Q.charlie(o5, i5)), j23, C0366t.bravo(0.38f, Q.charlie(o5, i5)), Q.charlie(o5, i4), Q.charlie(o5, H.a.foxtrot), C0366t.bravo(0.38f, Q.charlie(o5, i5)), C0366t.bravo(0.38f, Q.charlie(o5, H.a.echo)), C0366t.bravo(0.38f, Q.charlie(o5, i5)));
            o5.lavender = ayVar2;
            ayVar = ayVar2;
        } else {
            j10 = j22;
        }
        long j24 = C0366t.juliet;
        if (j7 != 16) {
            j11 = j7;
        } else {
            j11 = ayVar.alpha;
        }
        if (j24 != 16) {
            j12 = j24;
        } else {
            j12 = ayVar.bravo;
        }
        if (j5 != 16) {
            j13 = j5;
        } else {
            j13 = ayVar.charlie;
        }
        if (j24 != 16) {
            j14 = j24;
        } else {
            j14 = ayVar.delta;
        }
        if (j10 != 16) {
            j15 = j10;
        } else {
            j15 = ayVar.echo;
        }
        if (j24 == 16) {
            j24 = ayVar.foxtrot;
        }
        long j25 = j24;
        if (j10 != 16) {
            j16 = j10;
        } else {
            j16 = ayVar.golf;
        }
        if (j5 != 16) {
            j17 = j5;
        } else {
            j17 = ayVar.hotel;
        }
        if (j6 != 16) {
            j18 = j6;
        } else {
            j18 = ayVar.india;
        }
        if (j10 != 16) {
            j19 = j10;
        } else {
            j19 = ayVar.juliet;
        }
        if (j10 != 16) {
            j20 = j10;
        } else {
            j20 = ayVar.kilo;
        }
        if (j10 != 16) {
            j21 = j10;
        } else {
            j21 = ayVar.lima;
        }
        return new ay(j11, j12, j13, j14, j15, j25, j16, j17, j18, j19, j20, j21);
    }

    public static C0131l2 oscar(long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, InterfaceC0581m interfaceC0581m, int i4) {
        long j19;
        long j20;
        long j21;
        long j22;
        if ((i4 & 4) != 0) {
            j19 = C0366t.juliet;
        } else {
            j19 = j7;
        }
        float f5 = H.t.alpha;
        long delta = Q.delta(interfaceC0581m, 11);
        if ((i4 & 64) != 0) {
            j20 = Q.delta(interfaceC0581m, 24);
        } else {
            j20 = j12;
        }
        long delta2 = Q.delta(interfaceC0581m, 39);
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            j21 = C0366t.juliet;
        } else {
            j21 = j15;
        }
        long bravo = C0366t.bravo(0.38f, Q.delta(interfaceC0581m, 18));
        androidx.compose.runtime.E0 e02 = Q.alpha;
        long kilo = a0.ao.kilo(bravo, ((O) ((C0585q) interfaceC0581m).kilo(e02)).papa);
        if ((i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            j22 = a0.ao.kilo(C0366t.bravo(0.12f, Q.delta(interfaceC0581m, 18)), ((O) ((C0585q) interfaceC0581m).kilo(e02)).papa);
        } else {
            j22 = j18;
        }
        return new C0131l2(j5, j6, j19, delta, j10, j11, j20, delta2, j13, j14, j21, kilo, j16, j17, j22, a0.ao.kilo(C0366t.bravo(0.38f, Q.delta(interfaceC0581m, 39)), ((O) ((C0585q) interfaceC0581m).kilo(e02)).papa));
    }

    public static H1 papa(long j5, long j6, InterfaceC0581m interfaceC0581m) {
        long j7;
        long j10;
        long j11;
        long j12 = C0366t.kilo;
        O o5 = (O) ((C0585q) interfaceC0581m).kilo(Q.alpha);
        H1 h1 = o5.maroon;
        if (h1 == null) {
            float f5 = H.q.alpha;
            H1 h12 = new H1(Q.charlie(o5, 26), Q.charlie(o5, 19), C0366t.bravo(0.38f, Q.charlie(o5, 18)), C0366t.bravo(0.38f, Q.charlie(o5, 18)));
            o5.maroon = h12;
            h1 = h12;
        }
        if (j5 != 16) {
            j7 = j5;
        } else {
            j7 = h1.alpha;
        }
        if (j6 != 16) {
            j10 = j6;
        } else {
            j10 = h1.bravo;
        }
        if (j12 != 16) {
            j11 = j12;
        } else {
            j11 = h1.charlie;
        }
        if (j12 == 16) {
            j12 = h1.delta;
        }
        return new H1(j7, j10, j11, j12);
    }

    public static at quebec(O o5) {
        at atVar = o5.green;
        if (atVar == null) {
            float f5 = H.h.alpha;
            at atVar2 = new at(Q.charlie(o5, 39), Q.alpha(o5, Q.charlie(o5, 39)), a0.ao.kilo(C0366t.bravo(H.h.delta, Q.charlie(o5, H.h.bravo)), Q.charlie(o5, 39)), C0366t.bravo(0.38f, Q.alpha(o5, Q.charlie(o5, 39))));
            o5.green = atVar2;
            return atVar2;
        }
        return atVar;
    }
}
