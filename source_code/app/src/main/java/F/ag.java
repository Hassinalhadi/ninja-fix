package F;

import a0.C0366t;
import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.InterfaceC0539e;
import androidx.compose.foundation.layout.InterfaceC0541g;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import androidx.recyclerview.widget.RecyclerView;
import bz.AbstractC0779d;
import bz.AbstractC0800z;
import bz.C0788m;
import bz.C0795u;
import bz.C0797w;
import bz.InterfaceC0787l;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2645e7;
import t0.AbstractC2901T;

/* loaded from: classes3.dex */
public abstract class ag {
    public static final C0795u alpha = new C0795u(0.8f, 0.0f, 0.8f, 0.15f);
    public static final float bravo = 24;
    public static final float charlie;
    public static final float delta;

    static {
        float f5 = 4;
        charlie = f5;
        delta = 16 - f5;
    }

    public static final void alpha(P.d dVar, T.p pVar, P.d dVar2, P.d dVar3, float f5, androidx.compose.foundation.layout.G g2, M2 m22, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        T.p pVar2;
        float f10;
        androidx.compose.foundation.layout.G charlie2;
        float f11;
        T.p pVar3;
        androidx.compose.foundation.layout.G g5;
        float f12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1952988048);
        int i11 = i4 | 90160;
        if (c0585q.golf(m22)) {
            i5 = 1048576;
        } else {
            i5 = 524288;
        }
        int i12 = i11 | i5 | 12582912;
        if ((4793491 & i12) == 4793490 && c0585q.bronze()) {
            c0585q.ochre();
            pVar3 = pVar;
            f12 = f5;
            g5 = g2;
        } else {
            c0585q.orange();
            if ((i4 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                f10 = f5;
                charlie2 = g2;
                i10 = i12 & (-458753);
                pVar2 = pVar;
            } else {
                T.p pVar4 = T.p.alpha;
                i10 = i12 & (-458753);
                pVar2 = pVar4;
                f10 = P2.alpha;
                charlie2 = P2.charlie(c0585q);
            }
            c0585q.romeo();
            D0.an alpha2 = T2.alpha(c0585q, H.x.charlie);
            if (!Q0.g.alpha(f10, Float.NaN) && !Q0.g.alpha(f10, Float.POSITIVE_INFINITY)) {
                f11 = f10;
            } else {
                f11 = P2.alpha;
            }
            charlie(pVar2, dVar, alpha2, true, dVar2, dVar3, f11, charlie2, m22, c0585q, ((i10 << 6) & 234881024) | 805530678);
            pVar3 = pVar2;
            g5 = charlie2;
            f12 = f10;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new r(dVar, pVar3, dVar2, dVar3, f12, g5, m22, i4);
        }
    }

    public static final void bravo(P.d dVar, T.p pVar, P.d dVar2, P.d dVar3, float f5, float f10, androidx.compose.foundation.layout.G g2, M2 m22, Q2 q22, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        float f11;
        float f12;
        androidx.compose.foundation.layout.G charlie2;
        T.p pVar2;
        int i10;
        float f13;
        float f14;
        C0585q c0585q;
        float f15;
        float f16;
        T.p pVar3;
        androidx.compose.foundation.layout.G g5;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1879191686);
        if ((i4 & 6) == 0) {
            if (c0585q2.india(dVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i15 | i4;
        } else {
            i5 = i4;
        }
        int i16 = i5 | 48;
        if ((i4 & 384) == 0) {
            if (c0585q2.india(dVar2)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i16 |= i14;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q2.india(dVar3)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i16 |= i13;
        }
        int i17 = 221184 | i16;
        if ((1572864 & i4) == 0) {
            i17 = 745472 | i16;
        }
        if ((12582912 & i4) == 0) {
            if (c0585q2.golf(m22)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i17 |= i12;
        }
        if ((100663296 & i4) == 0) {
            if (c0585q2.golf(q22)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i17 |= i11;
        }
        if ((38347923 & i17) == 38347922 && c0585q2.bronze()) {
            c0585q2.ochre();
            pVar3 = pVar;
            f15 = f5;
            f16 = f10;
            g5 = g2;
            c0585q = c0585q2;
        } else {
            c0585q2.orange();
            if ((i4 & 1) != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
                i10 = i17 & (-3670017);
                pVar2 = pVar;
                f11 = f5;
                f12 = f10;
                charlie2 = g2;
            } else {
                T.p pVar4 = T.p.alpha;
                f11 = P2.bravo;
                f12 = P2.charlie;
                charlie2 = P2.charlie(c0585q2);
                pVar2 = pVar4;
                i10 = i17 & (-3670017);
            }
            c0585q2.romeo();
            D0.an alpha2 = T2.alpha(c0585q2, H.v.bravo);
            D0.an alpha3 = T2.alpha(c0585q2, H.x.charlie);
            if (!Q0.g.alpha(f11, Float.NaN) && !Q0.g.alpha(f11, Float.POSITIVE_INFINITY)) {
                f13 = f11;
            } else {
                f13 = P2.bravo;
            }
            if (!Q0.g.alpha(f12, Float.NaN) && !Q0.g.alpha(f12, Float.POSITIVE_INFINITY)) {
                f14 = f12;
            } else {
                f14 = P2.charlie;
            }
            int i18 = i10 << 12;
            float f17 = bravo;
            c0585q = c0585q2;
            echo(pVar2, dVar, alpha2, f17, dVar, alpha3, dVar2, dVar3, f13, f14, charlie2, m22, q22, c0585q, ((i10 >> 3) & 14) | 3072 | ((i10 << 3) & 112) | (57344 & i18) | (3670016 & i18) | (i18 & 29360128), (i10 >> 18) & 1022);
            f15 = f11;
            f16 = f12;
            pVar3 = pVar2;
            g5 = charlie2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0155s(dVar, pVar3, dVar2, dVar3, f15, f16, g5, m22, q22, i4);
        }
    }

    public static final void charlie(T.s sVar, P.d dVar, D0.an anVar, boolean z2, P.d dVar2, P.d dVar3, float f5, androidx.compose.foundation.layout.G g2, M2 m22, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        P.d dVar4;
        D0.an anVar2;
        boolean z10;
        P.d dVar5;
        boolean z11;
        C0585q c0585q;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-342194911);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(sVar)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i5 = i19 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            dVar4 = dVar;
            if (c0585q2.india(dVar4)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i5 |= i18;
        } else {
            dVar4 = dVar;
        }
        if ((i4 & 384) == 0) {
            anVar2 = anVar;
            if (c0585q2.golf(anVar2)) {
                i17 = Barcode.FORMAT_QR_CODE;
            } else {
                i17 = 128;
            }
            i5 |= i17;
        } else {
            anVar2 = anVar;
        }
        if ((i4 & 3072) == 0) {
            z10 = z2;
            if (c0585q2.hotel(z10)) {
                i16 = 2048;
            } else {
                i16 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i16;
        } else {
            z10 = z2;
        }
        if ((i4 & 24576) == 0) {
            dVar5 = dVar2;
            if (c0585q2.india(dVar5)) {
                i15 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i15 = 8192;
            }
            i5 |= i15;
        } else {
            dVar5 = dVar2;
        }
        if ((196608 & i4) == 0) {
            if (c0585q2.india(dVar3)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i5 |= i14;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q2.delta(f5)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i5 |= i13;
        }
        if ((12582912 & i4) == 0) {
            if (c0585q2.golf(g2)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i5 |= i12;
        }
        if ((100663296 & i4) == 0) {
            if (c0585q2.golf(m22)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i5 |= i11;
        }
        if ((805306368 & i4) == 0) {
            if (c0585q2.golf(null)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i5 |= i10;
        }
        if ((306783379 & i5) == 306783378 && c0585q2.bronze()) {
            c0585q2.ochre();
            c0585q = c0585q2;
        } else if (!Float.isNaN(f5) && f5 != Float.POSITIVE_INFINITY) {
            float lavender = ((Q0.d) c0585q2.kilo(AbstractC2901T.hotel)).lavender(f5);
            if (lavender < 0.0f) {
                lavender = 0.0f;
            }
            int i20 = i5 & 1879048192;
            boolean z12 = true;
            if (i20 == 536870912) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean delta2 = z11 | c0585q2.delta(lavender);
            Object jade = c0585q2.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (delta2 || jade == asVar) {
                jade = new P(lavender);
                c0585q2.f(jade);
            }
            C0564b.juliet((Function0) jade, c0585q2);
            if (i20 != 536870912) {
                z12 = false;
            }
            Object jade2 = c0585q2.jade();
            if (z12 || jade2 == asVar) {
                jade2 = C0564b.quebec(new P(0, 14));
                c0585q2.f(jade2);
            }
            androidx.compose.runtime.D0 alpha2 = bx.F.alpha(a0.ao.quebec(m22.alpha, m22.bravo, AbstractC0800z.charlie.bravo(((Number) ((androidx.compose.runtime.D0) jade2).getValue()).floatValue())), AbstractC0779d.juliet(400.0f, null, 5), c0585q2, 48, 12);
            P.d echo = P.e.echo(1370231018, new C0096d(dVar3, 2, (byte) 0), c0585q2);
            c0585q2.purple(-1193605157);
            T.p pVar = T.p.alpha;
            c0585q2.quebec(false);
            c0585q = c0585q2;
            AbstractC0127k2.alpha(sVar.then(pVar), null, ((C0366t) alpha2.getValue()).alpha, 0L, 0.0f, 0.0f, null, P.e.echo(-1943739546, new C0163u(g2, f5, m22, dVar4, anVar2, z10, dVar5, echo), c0585q2), c0585q, 12582912, 122);
        } else {
            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0166v(sVar, dVar, anVar, z2, dVar2, dVar3, f5, g2, m22, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void delta(P.d dVar, T.s sVar, P.d dVar2, P.d dVar3, float f5, androidx.compose.foundation.layout.G g2, M2 m22, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        T.s sVar2;
        int i11;
        int i12;
        P.d dVar4;
        int i13;
        int i14;
        T.s sVar3;
        P.d dVar5;
        float f10;
        int i15;
        T.s sVar4;
        P.d dVar6;
        androidx.compose.foundation.layout.G charlie2;
        float f11;
        C0585q c0585q;
        float f12;
        T.s sVar5;
        P.d dVar7;
        androidx.compose.foundation.layout.G g5;
        androidx.compose.runtime.Q uniform;
        int i16;
        int i17;
        int i18;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(226148675);
        if ((i4 & 6) == 0) {
            if (c0585q2.india(dVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i10 = i18 | i4;
        } else {
            i10 = i4;
        }
        int i19 = i5 & 2;
        if (i19 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            sVar2 = sVar;
            if (c0585q2.golf(sVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
            if ((i4 & 384) == 0) {
                if (c0585q2.india(dVar2)) {
                    i17 = Barcode.FORMAT_QR_CODE;
                } else {
                    i17 = 128;
                }
                i10 |= i17;
            }
            i12 = i5 & 8;
            if (i12 == 0) {
                i10 |= 3072;
            } else if ((i4 & 3072) == 0) {
                dVar4 = dVar3;
                if (c0585q2.india(dVar4)) {
                    i13 = 2048;
                } else {
                    i13 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i13;
                int i20 = i10 | 24576;
                if ((196608 & i4) == 0) {
                    i20 = 90112 | i10;
                }
                if ((1572864 & i4) == 0) {
                    if (c0585q2.golf(m22)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i20 |= i16;
                }
                i14 = 12582912 | i20;
                if ((4793491 & i14) != 4793490 && c0585q2.bronze()) {
                    c0585q2.ochre();
                    g5 = g2;
                    c0585q = c0585q2;
                    sVar5 = sVar2;
                    dVar7 = dVar4;
                    f12 = f5;
                } else {
                    c0585q2.orange();
                    if ((i4 & 1) == 0 && !c0585q2.beige()) {
                        c0585q2.ochre();
                        i15 = i14 & (-458753);
                        f10 = f5;
                        charlie2 = g2;
                        sVar4 = sVar2;
                        dVar6 = dVar4;
                    } else {
                        if (i19 != 0) {
                            sVar3 = T.p.alpha;
                        } else {
                            sVar3 = sVar2;
                        }
                        if (i12 != 0) {
                            dVar5 = U.alpha;
                        } else {
                            dVar5 = dVar4;
                        }
                        f10 = P2.alpha;
                        i15 = i14 & (-458753);
                        sVar4 = sVar3;
                        dVar6 = dVar5;
                        charlie2 = P2.charlie(c0585q2);
                    }
                    c0585q2.romeo();
                    D0.an alpha2 = T2.alpha(c0585q2, H.x.charlie);
                    if (Q0.g.alpha(f10, Float.NaN) && !Q0.g.alpha(f10, Float.POSITIVE_INFINITY)) {
                        f11 = f10;
                    } else {
                        f11 = P2.alpha;
                    }
                    int i21 = ((i15 >> 3) & 14) | 3072 | ((i15 << 3) & 112);
                    int i22 = i15 << 6;
                    c0585q = c0585q2;
                    charlie(sVar4, dVar, alpha2, false, dVar2, dVar6, f11, charlie2, m22, c0585q, i21 | (57344 & i22) | (458752 & i22) | (234881024 & i22) | (i22 & 1879048192));
                    f12 = f10;
                    sVar5 = sVar4;
                    dVar7 = dVar6;
                    g5 = charlie2;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new C0169w(dVar, sVar5, dVar2, dVar7, f12, g5, m22, i4, i5);
                    return;
                }
                return;
            }
            dVar4 = dVar3;
            int i202 = i10 | 24576;
            if ((196608 & i4) == 0) {
            }
            if ((1572864 & i4) == 0) {
            }
            i14 = 12582912 | i202;
            if ((4793491 & i14) != 4793490) {
            }
            c0585q2.orange();
            if ((i4 & 1) == 0) {
            }
            if (i19 != 0) {
            }
            if (i12 != 0) {
            }
            f10 = P2.alpha;
            i15 = i14 & (-458753);
            sVar4 = sVar3;
            dVar6 = dVar5;
            charlie2 = P2.charlie(c0585q2);
            c0585q2.romeo();
            D0.an alpha22 = T2.alpha(c0585q2, H.x.charlie);
            if (Q0.g.alpha(f10, Float.NaN)) {
            }
            f11 = P2.alpha;
            int i212 = ((i15 >> 3) & 14) | 3072 | ((i15 << 3) & 112);
            int i222 = i15 << 6;
            c0585q = c0585q2;
            charlie(sVar4, dVar, alpha22, false, dVar2, dVar6, f11, charlie2, m22, c0585q, i212 | (57344 & i222) | (458752 & i222) | (234881024 & i222) | (i222 & 1879048192));
            f12 = f10;
            sVar5 = sVar4;
            dVar7 = dVar6;
            g5 = charlie2;
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        sVar2 = sVar;
        if ((i4 & 384) == 0) {
        }
        i12 = i5 & 8;
        if (i12 == 0) {
        }
        dVar4 = dVar3;
        int i2022 = i10 | 24576;
        if ((196608 & i4) == 0) {
        }
        if ((1572864 & i4) == 0) {
        }
        i14 = 12582912 | i2022;
        if ((4793491 & i14) != 4793490) {
        }
        c0585q2.orange();
        if ((i4 & 1) == 0) {
        }
        if (i19 != 0) {
        }
        if (i12 != 0) {
        }
        f10 = P2.alpha;
        i15 = i14 & (-458753);
        sVar4 = sVar3;
        dVar6 = dVar5;
        charlie2 = P2.charlie(c0585q2);
        c0585q2.romeo();
        D0.an alpha222 = T2.alpha(c0585q2, H.x.charlie);
        if (Q0.g.alpha(f10, Float.NaN)) {
        }
        f11 = P2.alpha;
        int i2122 = ((i15 >> 3) & 14) | 3072 | ((i15 << 3) & 112);
        int i2222 = i15 << 6;
        c0585q = c0585q2;
        charlie(sVar4, dVar, alpha222, false, dVar2, dVar6, f11, charlie2, m22, c0585q, i2122 | (57344 & i2222) | (458752 & i2222) | (234881024 & i2222) | (i2222 & 1879048192));
        f12 = f10;
        sVar5 = sVar4;
        dVar7 = dVar6;
        g5 = charlie2;
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.jvm.internal.s, java.lang.Object] */
    public static final void echo(T.s sVar, P.d dVar, D0.an anVar, float f5, P.d dVar2, D0.an anVar2, P.d dVar3, P.d dVar4, float f10, float f11, androidx.compose.foundation.layout.G g2, M2 m22, Q2 q22, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        P.d dVar5;
        int i11;
        boolean z2;
        float f12;
        boolean z10;
        T.s sVar2;
        C0585q c0585q;
        boolean z11;
        boolean z12;
        R2 state;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1169193376);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(sVar)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i10 = i23 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(dVar)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i10 |= i22;
        }
        int i24 = 128;
        if ((i4 & 384) == 0) {
            if (c0585q2.golf(anVar)) {
                i21 = Barcode.FORMAT_QR_CODE;
            } else {
                i21 = 128;
            }
            i10 |= i21;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q2.delta(f5)) {
                i20 = 2048;
            } else {
                i20 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i20;
        }
        if ((i4 & 24576) == 0) {
            dVar5 = dVar2;
            if (c0585q2.india(dVar5)) {
                i19 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i19 = 8192;
            }
            i10 |= i19;
        } else {
            dVar5 = dVar2;
        }
        if ((i4 & 196608) == 0) {
            if (c0585q2.golf(anVar2)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i10 |= i18;
        }
        if ((i4 & 1572864) == 0) {
            if (c0585q2.india(dVar3)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i10 |= i17;
        }
        if ((i4 & 12582912) == 0) {
            if (c0585q2.india(dVar4)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i10 |= i16;
        }
        if ((i4 & 100663296) == 0) {
            if (c0585q2.delta(f10)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i10 |= i15;
        }
        if ((i4 & 805306368) == 0) {
            if (c0585q2.delta(f11)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i10 |= i14;
        }
        if ((i5 & 6) == 0) {
            if (c0585q2.golf(g2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i5 | i13;
        } else {
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q2.golf(m22)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i5 & 384) == 0) {
            if (c0585q2.golf(q22)) {
                i24 = Barcode.FORMAT_QR_CODE;
            }
            i11 |= i24;
        }
        int i25 = i11;
        if ((i10 & 306783379) == 306783378 && (i25 & 147) == 146 && c0585q2.bronze()) {
            c0585q2.ochre();
            c0585q = c0585q2;
        } else if (!Float.isNaN(f10) && f10 != Float.POSITIVE_INFINITY) {
            if (!Float.isNaN(f11) && f11 != Float.POSITIVE_INFINITY) {
                if (Float.compare(f11, f10) >= 0) {
                    ?? obj = new Object();
                    ?? obj2 = new Object();
                    ?? obj3 = new Object();
                    Q0.d dVar6 = (Q0.d) c0585q2.kilo(AbstractC2901T.hotel);
                    obj.alpha = dVar6.lavender(f11);
                    obj2.alpha = dVar6.lavender(f10);
                    obj3.alpha = dVar6.ochre(f5);
                    int i26 = i25 & 896;
                    if (i26 == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean delta2 = z2 | c0585q2.delta(obj2.alpha) | c0585q2.delta(obj.alpha);
                    Object jade = c0585q2.jade();
                    androidx.compose.runtime.as asVar = C0580l.alpha;
                    if (delta2 || jade == asVar) {
                        jade = new Ce.ab(q22, obj2, obj, 1);
                        c0585q2.f(jade);
                    }
                    C0564b.juliet((Function0) jade, c0585q2);
                    if (q22 != null && (state = q22.getState()) != null) {
                        f12 = state.alpha();
                    } else {
                        f12 = 0.0f;
                    }
                    m22.getClass();
                    long quebec = a0.ao.quebec(m22.alpha, m22.bravo, AbstractC0800z.charlie.bravo(f12));
                    P.d echo = P.e.echo(-89435287, new C0096d(dVar4, 3, (byte) 0), c0585q2);
                    float bravo2 = alpha.bravo(f12);
                    float f13 = 1.0f - f12;
                    if (f12 < 0.5f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z13 = !z10;
                    c0585q2.purple(1641266888);
                    if (q22 != null) {
                        d.K k6 = d.K.alpha;
                        if (i26 == 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Object jade2 = c0585q2.jade();
                        if (z11 || jade2 == asVar) {
                            jade2 = new A0.p(8, q22);
                            c0585q2.f(jade2);
                        }
                        d.aq bravo3 = d.al.bravo((Function1) jade2, c0585q2);
                        if (i26 == 256) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        Object jade3 = c0585q2.jade();
                        if (z12 || jade3 == asVar) {
                            jade3 = new ae(q22, null);
                            c0585q2.f(jade3);
                        }
                        sVar2 = new DraggableElement(bravo3, k6, true, null, false, d.al.alpha, (Xd.m) jade3, false);
                    } else {
                        sVar2 = T.p.alpha;
                    }
                    T.s sVar3 = sVar2;
                    c0585q2.quebec(false);
                    c0585q = c0585q2;
                    AbstractC0127k2.alpha(sVar.then(sVar3), null, quebec, 0L, 0.0f, 0.0f, null, P.e.echo(-1350062619, new ac(g2, f10, m22, dVar5, anVar2, bravo2, z10, dVar3, echo, f11, q22, dVar, anVar, f13, obj3, z13), c0585q2), c0585q, 12582912, 122);
                } else {
                    throw new IllegalArgumentException("The expandedHeight is expected to be greater or equal to the collapsedHeight");
                }
            } else {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
        } else {
            throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite");
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ad(sVar, dVar, anVar, f5, dVar2, anVar2, dVar3, dVar4, f10, f11, g2, m22, q22, i4, i5);
        }
    }

    public static final void foxtrot(T.s sVar, S1 s12, long j5, long j6, long j7, P.d dVar, D0.an anVar, float f5, InterfaceC0541g interfaceC0541g, InterfaceC0539e interfaceC0539e, int i4, boolean z2, P.d dVar2, P.d dVar3, InterfaceC0581m interfaceC0581m, int i5, int i10) {
        int i11;
        int i12;
        long j10;
        T.s sVar2;
        C0585q c0585q;
        long j11 = j7;
        P.d dVar4 = dVar3;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-742442296);
        if ((i5 & 6) == 0) {
            i11 = i5 | (c0585q2.golf(sVar) ? 4 : 2);
        } else {
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            i11 |= (i5 & 64) == 0 ? c0585q2.golf(s12) : c0585q2.india(s12) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i11 |= c0585q2.foxtrot(j5) ? 256 : 128;
        }
        int i13 = i5 & 3072;
        int i14 = Barcode.FORMAT_UPC_E;
        if (i13 == 0) {
            i11 |= c0585q2.foxtrot(j6) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i11 |= c0585q2.foxtrot(j11) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i5) == 0) {
            i11 |= c0585q2.india(dVar) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i11 |= c0585q2.golf(anVar) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i11 |= c0585q2.delta(f5) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i11 |= c0585q2.golf(interfaceC0541g) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i11 |= c0585q2.golf(interfaceC0539e) ? 536870912 : 268435456;
        }
        if ((i10 & 6) == 0) {
            i12 = i10 | (c0585q2.echo(i4) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0585q2.hotel(z2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c0585q2.india(dVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            if (c0585q2.india(dVar4)) {
                i14 = 2048;
            }
            i12 |= i14;
        }
        int i15 = i12;
        if ((i11 & 306783379) == 306783378 && (i15 & 1171) == 1170 && c0585q2.bronze()) {
            c0585q2.ochre();
            j10 = j5;
            c0585q = c0585q2;
        } else {
            boolean z10 = ((i11 & 1879048192) == 536870912) | ((i11 & 112) == 32 || ((i11 & 64) != 0 && c0585q2.india(s12))) | ((i11 & 234881024) == 67108864) | ((i15 & 14) == 4);
            Object jade = c0585q2.jade();
            if (z10 || jade == C0580l.alpha) {
                jade = new C0178z(s12, interfaceC0539e, interfaceC0541g, i4);
                c0585q2.f(jade);
            }
            q0.ap apVar = (q0.ap) jade;
            int romeo = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie2 = T.a.charlie(sVar, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q2, apVar);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q2, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q2, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie2);
            T.p pVar = T.p.alpha;
            T.s charlie3 = androidx.compose.ui.layout.a.charlie(pVar, "navigationIcon");
            float f10 = charlie;
            T.s whiskey = AbstractC0538d.whiskey(charlie3, f10, 0.0f, 0.0f, 0.0f, 14);
            T.k kVar = T.d.alpha;
            q0.ap delta2 = AbstractC0547m.delta(kVar, false);
            int romeo2 = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike2 = c0585q2.mike();
            T.s charlie4 = T.a.charlie(whiskey, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, delta2);
            C0564b.blue(c2549i2, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo2))) {
                ao.ad.blue(romeo2, c0585q2, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie4);
            androidx.compose.runtime.aa aaVar = Y.alpha;
            j10 = j5;
            C0564b.alpha(aaVar.alpha(new C0366t(j10)), dVar2, c0585q2, ((i15 >> 3) & 112) | 8);
            c0585q2.quebec(true);
            T.s uniform = AbstractC0538d.uniform(androidx.compose.ui.layout.a.charlie(pVar, Constants.KEY_TITLE), f10, 0.0f, 2);
            if (z2) {
                AtomicInteger atomicInteger = A0.o.alpha;
                sVar2 = new ClearAndSetSemanticsElement(C0172x.purple);
            } else {
                sVar2 = pVar;
            }
            T.s bravo2 = androidx.compose.ui.graphics.a.bravo(uniform.then(sVar2), 0.0f, 0.0f, f5, 0.0f, null, 131067);
            q0.ap delta3 = AbstractC0547m.delta(kVar, false);
            int romeo3 = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike3 = c0585q2.mike();
            T.s charlie5 = T.a.charlie(bravo2, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, delta3);
            C0564b.blue(c2549i2, c0585q2, mike3);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo3))) {
                ao.ad.blue(romeo3, c0585q2, romeo3, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie5);
            int i16 = i11 >> 9;
            androidx.compose.material3.internal.i.alpha(j6, anVar, dVar, c0585q2, (i16 & 14) | ((i11 >> 15) & 112) | (i16 & 896));
            c0585q = c0585q2;
            c0585q.quebec(true);
            T.s whiskey2 = AbstractC0538d.whiskey(androidx.compose.ui.layout.a.charlie(pVar, "actionIcons"), 0.0f, 0.0f, f10, 0.0f, 11);
            q0.ap delta4 = AbstractC0547m.delta(kVar, false);
            int romeo4 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike4 = c0585q.mike();
            T.s charlie6 = T.a.charlie(whiskey2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, delta4);
            C0564b.blue(c2549i2, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo4))) {
                ao.ad.blue(romeo4, c0585q, romeo4, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie6);
            j11 = j7;
            dVar4 = dVar3;
            C0564b.alpha(aaVar.alpha(new C0366t(j11)), dVar4, c0585q, 8 | ((i15 >> 6) & 112));
            c0585q.quebec(true);
            c0585q.quebec(true);
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new aa(sVar, s12, j10, j6, j11, dVar, anVar, f5, interfaceC0541g, interfaceC0539e, i4, z2, dVar2, dVar4, i5, i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        if (bz.P.charlie(r9, r10, r4, r5) == r0) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r12v6, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object golf(R2 r22, float f5, C0797w c0797w, InterfaceC0787l interfaceC0787l, Pd.c cVar) {
        Pd.c cVar2;
        int i4;
        kotlin.jvm.internal.r rVar;
        InterfaceC0787l interfaceC0787l2;
        float charlie2;
        kotlin.jvm.internal.r rVar2;
        kotlin.jvm.internal.r rVar3;
        if (cVar instanceof af) {
            af afVar = (af) cVar;
            int i5 = afVar.teal;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                afVar.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                cVar2 = afVar;
                af afVar2 = cVar2;
                Object obj = afVar2.silver;
                Od.a aVar = Od.a.alpha;
                i4 = afVar2.teal;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            rVar2 = (kotlin.jvm.internal.r) afVar2.alpha;
                            ResultKt.alpha(obj);
                            rVar3 = rVar2;
                            return new Q0.r(AbstractC2645e7.alpha(0.0f, rVar3.alpha));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.r rVar4 = afVar2.red;
                    interfaceC0787l = afVar2.purple;
                    R2 r23 = (R2) afVar2.alpha;
                    ResultKt.alpha(obj);
                    rVar = rVar4;
                    r22 = r23;
                } else {
                    ResultKt.alpha(obj);
                    if (r22.alpha() >= 0.01f && r22.alpha() != 1.0f) {
                        ?? obj2 = new Object();
                        obj2.alpha = f5;
                        rVar = obj2;
                        if (c0797w != null) {
                            rVar = obj2;
                            if (Math.abs(f5) > 1.0f) {
                                Object obj3 = new Object();
                                C0788m bravo2 = AbstractC0779d.bravo(28, 0.0f, f5);
                                C1.av avVar = new C1.av(obj3, r22, obj2, 1);
                                afVar2.alpha = r22;
                                afVar2.purple = interfaceC0787l;
                                afVar2.red = obj2;
                                afVar2.teal = 1;
                                rVar = obj2;
                            }
                        }
                    } else {
                        return new Q0.r(0L);
                    }
                }
                interfaceC0787l2 = interfaceC0787l;
                rVar3 = rVar;
                if (interfaceC0787l2 != null) {
                    rVar3 = rVar;
                    if (r22.bravo() < 0.0f) {
                        rVar3 = rVar;
                        if (r22.bravo() > r22.charlie()) {
                            C0788m bravo3 = AbstractC0779d.bravo(30, r22.bravo(), 0.0f);
                            if (r22.alpha() < 0.5f) {
                                charlie2 = 0.0f;
                            } else {
                                charlie2 = r22.charlie();
                            }
                            Float f10 = new Float(charlie2);
                            A0.p pVar = new A0.p(9, r22);
                            afVar2.alpha = rVar;
                            afVar2.purple = null;
                            afVar2.red = null;
                            afVar2.teal = 2;
                            if (bz.P.echo(bravo3, f10, interfaceC0787l2, pVar, afVar2, 4) != aVar) {
                                rVar2 = rVar;
                                rVar3 = rVar2;
                            }
                            return aVar;
                        }
                    }
                }
                return new Q0.r(AbstractC2645e7.alpha(0.0f, rVar3.alpha));
            }
        }
        cVar2 = new Pd.c(cVar);
        af afVar22 = cVar2;
        Object obj4 = afVar22.silver;
        Od.a aVar2 = Od.a.alpha;
        i4 = afVar22.teal;
        if (i4 == 0) {
        }
        interfaceC0787l2 = interfaceC0787l;
        rVar3 = rVar;
        if (interfaceC0787l2 != null) {
        }
        return new Q0.r(AbstractC2645e7.alpha(0.0f, rVar3.alpha));
    }

    public static final R2 hotel(C0585q c0585q) {
        Object[] objArr = new Object[0];
        J2.l lVar = R2.delta;
        boolean delta2 = c0585q.delta(-3.4028235E38f) | c0585q.delta(0.0f) | c0585q.delta(0.0f);
        Object jade = c0585q.jade();
        if (delta2 || jade == C0580l.alpha) {
            jade = new P(0, 15);
            c0585q.f(jade);
        }
        return (R2) R.l.delta(objArr, lVar, (Function0) jade, c0585q, 0, 4);
    }
}
