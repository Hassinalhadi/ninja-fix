package F;

import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import bz.AbstractC0779d;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.InterfaceC1673j;
import okhttp3.internal.http2.Http2;
import t0.AbstractC2911e0;

/* renamed from: F.t2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0162t2 {
    public static final C0162t2 alpha = new Object();
    public static final float bravo = 56;
    public static final float charlie = 280;
    public static final float delta = 1;
    public static final float echo = 2;

    public static androidx.compose.foundation.layout.M charlie() {
        float f5 = androidx.compose.material3.internal.at.bravo;
        return new androidx.compose.foundation.layout.M(f5, androidx.compose.material3.internal.at.delta, f5, 0);
    }

    public final void alpha(boolean z2, boolean z10, InterfaceC1673j interfaceC1673j, C0143o2 c0143o2, a0.as asVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        long j5;
        T.p pVar = T.p.alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-818661242);
        if (c0585q.hotel(z2)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i14 = i4 | i5;
        if (c0585q.hotel(z10)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i15 = i14 | i10;
        if (c0585q.golf(interfaceC1673j)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i16 = i15 | i11;
        if (c0585q.golf(c0143o2)) {
            i12 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i12 = 8192;
        }
        int i17 = i16 | i12;
        if (c0585q.golf(asVar)) {
            i13 = 131072;
        } else {
            i13 = 65536;
        }
        int i18 = i17 | i13;
        if ((38347923 & i18) == 38347922 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            c0585q.orange();
            if ((i4 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
            }
            c0585q.romeo();
            boolean booleanValue = ((Boolean) s6.J0.alpha(interfaceC1673j, c0585q, (i18 >> 6) & 14).getValue()).booleanValue();
            if (!z2) {
                j5 = c0143o2.golf;
            } else if (z10) {
                j5 = c0143o2.hotel;
            } else if (booleanValue) {
                j5 = c0143o2.echo;
            } else {
                j5 = c0143o2.foxtrot;
            }
            C0158s2 c0158s2 = new C0158s2(new Af.i(0, 2, androidx.compose.runtime.D0.class, bx.F.alpha(j5, AbstractC0779d.kilo(150, 0, null, 6), c0585q, 48, 12), "value", "getValue()Ljava/lang/Object;"));
            float f5 = androidx.compose.material3.internal.at.bravo;
            AbstractC0547m.alpha(T.a.alpha(androidx.compose.ui.draw.a.bravo(pVar, new B2.ap(19, asVar, c0158s2)), AbstractC2911e0.alpha, new C0154r2(c0143o2, interfaceC1673j, z2, z10)), c0585q, 0);
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0147p2(this, z2, z10, interfaceC1673j, c0143o2, asVar, i4);
        }
    }

    public final void bravo(String str, Xd.l lVar, boolean z2, boolean z10, A8.a aVar, InterfaceC1673j interfaceC1673j, boolean z11, P.d dVar, P.d dVar2, Xd.l lVar2, Xd.l lVar3, a0.as asVar, C0143o2 c0143o2, androidx.compose.foundation.layout.M m4, P.d dVar3, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z12;
        int i10;
        androidx.compose.foundation.layout.M m5;
        int i11;
        androidx.compose.foundation.layout.M m8;
        P.d echo2;
        C0585q c0585q;
        P.d dVar4;
        androidx.compose.foundation.layout.M m10;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(289640444);
        if ((i4 & 6) == 0) {
            i5 = (c0585q2.golf(str) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q2.india(lVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q2.hotel(z2) ? Barcode.FORMAT_QR_CODE : 128;
        }
        int i12 = i4 & 3072;
        int i13 = Barcode.FORMAT_UPC_E;
        if (i12 == 0) {
            z12 = z10;
            i5 |= c0585q2.hotel(z12) ? 2048 : 1024;
        } else {
            z12 = z10;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0585q2.golf(aVar) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i5 |= c0585q2.golf(interfaceC1673j) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i5 |= c0585q2.hotel(z11) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i5 |= c0585q2.india(dVar) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i5 |= c0585q2.india(dVar2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i5 |= c0585q2.india(lVar2) ? 536870912 : 268435456;
        }
        int i14 = 100663296 | (c0585q2.india(lVar3) ? 4 : 2) | (c0585q2.india(null) ? 32 : 16) | (c0585q2.india(null) ? Barcode.FORMAT_QR_CODE : 128);
        if (c0585q2.india(null)) {
            i13 = 2048;
        }
        int i15 = i14 | i13 | (c0585q2.golf(asVar) ? 16384 : 8192) | (c0585q2.golf(c0143o2) ? 131072 : 65536) | 13107200;
        if ((i5 & 306783379) == 306783378 && (38347923 & i15) == 38347922 && c0585q2.bronze()) {
            c0585q2.ochre();
            m10 = m4;
            dVar4 = dVar3;
            c0585q = c0585q2;
        } else {
            c0585q2.orange();
            if ((i4 & 1) != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
                i11 = i15 & (-3670017);
                m8 = m4;
                echo2 = dVar3;
            } else {
                if (dVar == null) {
                    float f5 = androidx.compose.material3.internal.at.bravo;
                    i10 = -3670017;
                    m5 = new androidx.compose.foundation.layout.M(f5, f5, f5, f5);
                } else {
                    i10 = -3670017;
                    float f10 = androidx.compose.material3.internal.at.bravo;
                    float f11 = z2.alpha;
                    m5 = new androidx.compose.foundation.layout.M(f10, f11, f10, f11);
                }
                i11 = i15 & i10;
                m8 = m5;
                echo2 = P.e.echo(-435523791, new C0153r1(z2, z11, interfaceC1673j, c0143o2, asVar, 1), c0585q2);
            }
            c0585q2.romeo();
            int i16 = i11;
            int i17 = i5 << 3;
            int i18 = i5 >> 3;
            int i19 = i5 >> 9;
            int i20 = i16 << 21;
            androidx.compose.material3.internal.at.alpha(androidx.compose.material3.internal.au.alpha, str, lVar, aVar, dVar, dVar2, lVar2, lVar3, null, z12, z2, z11, interfaceC1673j, m8, c0143o2, echo2, c0585q2, (i17 & 896) | (i17 & 112) | 6 | (i18 & 7168) | (i19 & 57344) | (458752 & i19) | (i19 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), ((i16 << 3) & 3670016) | ((i16 >> 9) & 14) | ((i5 >> 6) & 112) | (i5 & 896) | (i19 & 7168) | (i18 & 57344) | 12582912);
            c0585q = c0585q2;
            dVar4 = echo2;
            m10 = m8;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0151q2(this, str, lVar, z2, z10, aVar, interfaceC1673j, z11, dVar, dVar2, lVar2, lVar3, asVar, c0143o2, m10, dVar4, i4);
        }
    }
}
