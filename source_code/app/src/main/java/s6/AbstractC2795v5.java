package s6;

import a0.InterfaceC0341aa;
import androidx.compose.foundation.layout.InterfaceC0539e;
import androidx.compose.foundation.layout.InterfaceC0541g;
import androidx.compose.foundation.layout.M;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import b.C0704t;
import com.google.mlkit.vision.barcode.common.Barcode;
import d.C1543m;
import j.C1920c;
import j.C1921d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2;
import s6.AbstractC2795v5;
import t0.AbstractC2901T;

/* renamed from: s6.v5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2795v5 {
    /* JADX WARN: Code restructure failed: missing block: B:143:0x026a, code lost:
    
        if (r14.hotel(false) != false) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(final T.s sVar, j.t tVar, final C1920c c1920c, final androidx.compose.foundation.layout.M m4, final C1543m c1543m, final boolean z2, final C0704t c0704t, final InterfaceC0541g interfaceC0541g, final InterfaceC0539e interfaceC0539e, final Function1 function1, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        int i11;
        j.t tVar2;
        C0585q c0585q;
        boolean z10;
        boolean golf;
        Object kVar;
        j.t tVar3;
        Object obj;
        boolean z11;
        ge.s sVar2;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(708740370);
        if ((i4 & 6) == 0) {
            i10 = (c0585q2.golf(sVar) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= c0585q2.golf(tVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= (i4 & 512) == 0 ? c0585q2.golf(c1920c) : c0585q2.india(c1920c) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i10 |= c0585q2.golf(m4) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i10 |= c0585q2.hotel(false) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i4 & 196608) == 0) {
            i10 |= c0585q2.hotel(true) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i10 |= c0585q2.golf(c1543m) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i10 |= c0585q2.hotel(z2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i10 |= c0585q2.golf(c0704t) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i10 |= c0585q2.golf(interfaceC0541g) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i11 = i5 | (c0585q2.golf(interfaceC0539e) ? 4 : 2);
        } else {
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            i11 |= c0585q2.india(function1) ? 32 : 16;
        }
        if (c0585q2.magenta(i10 & 1, ((i10 & 306783379) == 306783378 && (i11 & 19) == 18) ? false : true)) {
            c0585q2.orange();
            int i12 = i4 & 1;
            T.s sVar3 = T.p.alpha;
            Object obj2 = C0580l.alpha;
            if (i12 != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
            }
            c0585q2.romeo();
            int i13 = i10 >> 3;
            int i14 = i13 & 14;
            int i15 = i14 | (i11 & 112);
            androidx.compose.runtime.ax black = C0564b.black(function1, c0585q2);
            int i16 = i10;
            boolean z12 = (((i15 & 14) ^ 6) > 4 && c0585q2.golf(tVar)) || (i15 & 6) == 4;
            Object jade = c0585q2.jade();
            if (z12 || jade == obj2) {
                androidx.compose.runtime.as asVar = androidx.compose.runtime.as.silver;
                jade = new Af.i(0, 4, androidx.compose.runtime.D0.class, C0564b.papa(asVar, new Yb.F(17, C0564b.papa(asVar, new Cb.u(black, 25)), tVar)), "value", "getValue()Ljava/lang/Object;");
                c0585q2.f(jade);
            }
            ge.s sVar4 = (ge.s) jade;
            int i17 = i14 | ((i16 >> 9) & 112);
            boolean z13 = ((((i17 & 14) ^ 6) > 4 && c0585q2.golf(tVar)) || (i17 & 6) == 4) | ((((i17 & 112) ^ 48) > 32 && c0585q2.hotel(false)) || (i17 & 48) == 32);
            Object jade2 = c0585q2.jade();
            if (z13 || jade2 == obj2) {
                jade2 = new j.v(tVar);
                c0585q2.f(jade2);
            }
            j.v vVar = (j.v) jade2;
            Object jade3 = c0585q2.jade();
            if (jade3 == obj2) {
                jade3 = C0564b.november(c0585q2);
                c0585q2.f(jade3);
            }
            vf.ab abVar = (vf.ab) jade3;
            InterfaceC0341aa interfaceC0341aa = (InterfaceC0341aa) c0585q2.kilo(AbstractC2901T.golf);
            androidx.compose.foundation.lazy.layout.ab abVar2 = !((Boolean) c0585q2.kilo(AbstractC2901T.victor)).booleanValue() ? androidx.compose.foundation.lazy.layout.A.alpha : null;
            int i18 = (i16 & 524272) | ((i11 << 18) & 3670016) | ((i16 >> 6) & 29360128);
            boolean z14 = ((((i18 & 896) ^ 384) > 256 && c0585q2.golf(c1920c)) || (i18 & 384) == 256) | ((((i18 & 112) ^ 48) > 32 && c0585q2.golf(tVar)) || (i18 & 48) == 32) | ((((i18 & 7168) ^ 3072) > 2048 && c0585q2.golf(m4)) || (i18 & 3072) == 2048);
            if (((57344 & i18) ^ 24576) <= 16384) {
            }
            if ((i18 & 24576) != 16384) {
                z10 = false;
                golf = ((((i18 & 29360128) ^ 12582912) <= 8388608 && c0585q2.golf(interfaceC0541g)) || (i18 & 12582912) == 8388608) | z14 | z10 | ((((458752 & i18) ^ 196608) <= 131072 && c0585q2.hotel(true)) || (i18 & 196608) == 131072) | ((((i18 & 3670016) ^ 1572864) <= 1048576 && c0585q2.golf(interfaceC0539e)) || (i18 & 1572864) == 1048576) | c0585q2.golf(interfaceC0341aa);
                Object jade4 = c0585q2.jade();
                if (!golf || jade4 == obj2) {
                    tVar3 = tVar;
                    obj = obj2;
                    z11 = true;
                    kVar = new j.k(tVar3, m4, sVar4, c1920c, interfaceC0541g, interfaceC0539e, abVar, interfaceC0341aa, abVar2);
                    sVar2 = sVar4;
                    c0585q2.f(kVar);
                } else {
                    kVar = jade4;
                    obj = obj2;
                    sVar2 = sVar4;
                    z11 = true;
                    tVar3 = tVar;
                }
                androidx.compose.foundation.lazy.layout.y yVar = (androidx.compose.foundation.lazy.layout.y) kVar;
                d.K k6 = d.K.alpha;
                if (!z2) {
                    c0585q2.purple(27343139);
                    if (((i14 ^ 6) <= 4 || !c0585q2.golf(tVar3)) && (i13 & 6) != 4) {
                        z11 = false;
                    }
                    Object jade5 = c0585q2.jade();
                    if (z11 || jade5 == obj) {
                        jade5 = new C1921d(tVar3);
                        c0585q2.f(jade5);
                    }
                    sVar3 = androidx.compose.foundation.lazy.layout.j.mike((C1921d) jade5, tVar3.november, k6);
                    c0585q2.quebec(false);
                } else {
                    c0585q2.purple(27639344);
                    c0585q2.quebec(false);
                }
                tVar2 = tVar3;
                c0585q = c0585q2;
                androidx.compose.foundation.lazy.layout.j.alpha(sVar2, androidx.compose.foundation.a.juliet(androidx.compose.foundation.lazy.layout.j.november(sVar.then(tVar3.kilo).then(tVar3.lima), sVar2, vVar, k6, z2).then(sVar3).then(tVar3.mike.india), tVar3, k6, z2, c1543m, tVar3.foxtrot, false, c0704t), tVar2.oscar, yVar, c0585q, 0);
            }
            z10 = true;
            golf = ((((i18 & 29360128) ^ 12582912) <= 8388608 && c0585q2.golf(interfaceC0541g)) || (i18 & 12582912) == 8388608) | z14 | z10 | ((((458752 & i18) ^ 196608) <= 131072 && c0585q2.hotel(true)) || (i18 & 196608) == 131072) | ((((i18 & 3670016) ^ 1572864) <= 1048576 && c0585q2.golf(interfaceC0539e)) || (i18 & 1572864) == 1048576) | c0585q2.golf(interfaceC0341aa);
            Object jade42 = c0585q2.jade();
            if (golf) {
            }
            tVar3 = tVar;
            obj = obj2;
            z11 = true;
            kVar = new j.k(tVar3, m4, sVar4, c1920c, interfaceC0541g, interfaceC0539e, abVar, interfaceC0341aa, abVar2);
            sVar2 = sVar4;
            c0585q2.f(kVar);
            androidx.compose.foundation.lazy.layout.y yVar2 = (androidx.compose.foundation.lazy.layout.y) kVar;
            d.K k62 = d.K.alpha;
            if (!z2) {
            }
            tVar2 = tVar3;
            c0585q = c0585q2;
            androidx.compose.foundation.lazy.layout.j.alpha(sVar2, androidx.compose.foundation.a.juliet(androidx.compose.foundation.lazy.layout.j.november(sVar.then(tVar3.kilo).then(tVar3.lima), sVar2, vVar, k62, z2).then(sVar3).then(tVar3.mike.india), tVar3, k62, z2, c1543m, tVar3.foxtrot, false, c0704t), tVar2.oscar, yVar2, c0585q, 0);
        } else {
            tVar2 = tVar;
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            final j.t tVar4 = tVar2;
            uniform.delta = new Xd.l() { // from class: j.i
                @Override // Xd.l
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    int cyan2 = C0564b.cyan(i5);
                    M m5 = m4;
                    InterfaceC0541g interfaceC0541g2 = interfaceC0541g;
                    InterfaceC0539e interfaceC0539e2 = interfaceC0539e;
                    Function1 function12 = function1;
                    AbstractC2795v5.alpha(T.s.this, tVar4, c1920c, m5, c1543m, z2, c0704t, interfaceC0541g2, interfaceC0539e2, function12, (InterfaceC0581m) obj3, cyan, cyan2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final boolean bravo(Z.c cVar, float f5, float f10) {
        float f11 = cVar.alpha;
        if (f5 <= cVar.charlie && f11 <= f5 && f10 <= cVar.delta && cVar.bravo <= f10) {
            return true;
        }
        return false;
    }
}
