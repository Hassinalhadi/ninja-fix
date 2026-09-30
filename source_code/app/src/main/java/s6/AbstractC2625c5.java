package s6;

import a0.InterfaceC0341aa;
import androidx.compose.foundation.layout.InterfaceC0539e;
import androidx.compose.foundation.layout.InterfaceC0541g;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import b.C0704t;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import d.C1543m;
import i.C1856e;
import i.C1857f;
import i.C1865n;
import i.C1874w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s1.C2576i;
import s6.AbstractC2625c5;
import t0.AbstractC2901T;
import ue.C3158b;

/* renamed from: s6.c5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2625c5 {
    /* JADX WARN: Removed duplicated region for block: B:114:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016f  */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, i.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(final T.s sVar, C1874w c1874w, final androidx.compose.foundation.layout.M m4, final boolean z2, final C1543m c1543m, final boolean z10, final C0704t c0704t, T.i iVar, InterfaceC0541g interfaceC0541g, T.j jVar, InterfaceC0539e interfaceC0539e, final Function1 function1, InterfaceC0581m interfaceC0581m, final int i4, final int i5, final int i10) {
        int i11;
        T.i iVar2;
        int i12;
        int i13;
        int i14;
        C1874w c1874w2;
        C0585q c0585q;
        final InterfaceC0541g interfaceC0541g2;
        final T.j jVar2;
        final InterfaceC0539e interfaceC0539e2;
        T.i iVar3;
        androidx.compose.runtime.Q uniform;
        int i15;
        InterfaceC0541g interfaceC0541g3;
        T.j jVar3;
        int i16;
        InterfaceC0539e interfaceC0539e3;
        boolean z11;
        Object jade;
        androidx.compose.runtime.as asVar;
        ge.s sVar2;
        boolean z12;
        Object jade2;
        androidx.compose.foundation.lazy.layout.am amVar;
        Object jade3;
        boolean echo;
        Object jade4;
        T.j jVar4;
        androidx.compose.foundation.lazy.layout.am amVar2;
        int i17;
        ge.s sVar3;
        InterfaceC0541g interfaceC0541g4;
        InterfaceC0539e interfaceC0539e4;
        T.s sVar4;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(924924659);
        if ((i4 & 6) == 0) {
            i11 = (c0585q2.golf(sVar) ? 4 : 2) | i4;
        } else {
            i11 = i4;
        }
        if ((i4 & 48) == 0) {
            i11 |= c0585q2.golf(c1874w) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i11 |= c0585q2.golf(m4) ? Barcode.FORMAT_QR_CODE : 128;
        }
        int i18 = i4 & 3072;
        int i19 = Barcode.FORMAT_UPC_E;
        if (i18 == 0) {
            i11 |= c0585q2.hotel(false) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i11 |= c0585q2.hotel(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i11 |= c0585q2.golf(c1543m) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i11 |= c0585q2.hotel(z10) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i11 |= c0585q2.golf(c0704t) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i11 |= 33554432;
        }
        int i20 = i10 & 512;
        if (i20 != 0) {
            i11 |= 805306368;
            iVar2 = iVar;
        } else {
            iVar2 = iVar;
            if ((i4 & 805306368) == 0) {
                i11 |= c0585q2.golf(iVar2) ? 536870912 : 268435456;
            }
        }
        int i21 = i10 & Barcode.FORMAT_UPC_E;
        if (i21 != 0) {
            i13 = i5 | 6;
            i12 = i11;
        } else if ((i5 & 6) == 0) {
            i12 = i11;
            i13 = i5 | (c0585q2.golf(interfaceC0541g) ? 4 : 2);
        } else {
            i12 = i11;
            i13 = i5;
        }
        int i22 = i10 & 2048;
        if (i22 != 0) {
            i13 |= 48;
            i14 = i22;
        } else if ((i5 & 48) == 0) {
            i14 = i22;
            i13 |= c0585q2.golf(jVar) ? 32 : 16;
        } else {
            i14 = i22;
        }
        int i23 = i13;
        int i24 = i10 & 4096;
        if (i24 != 0) {
            i23 |= 384;
        } else if ((i5 & 384) == 0) {
            i23 |= c0585q2.golf(interfaceC0539e) ? Barcode.FORMAT_QR_CODE : 128;
            if ((i5 & 3072) == 0) {
                if (c0585q2.india(function1)) {
                    i19 = 2048;
                }
                i23 |= i19;
            }
            boolean z13 = true;
            if (!c0585q2.magenta(i12 & 1, (i12 & 306783379) == 306783378 || (i23 & 1171) != 1170)) {
                c0585q2.orange();
                if ((i4 & 1) == 0 || c0585q2.beige()) {
                    i15 = i12 & (-234881025);
                    if (i20 != 0) {
                        iVar2 = null;
                    }
                    interfaceC0541g3 = i21 != 0 ? null : interfaceC0541g;
                    jVar3 = i14 != 0 ? null : jVar;
                    if (i24 != 0) {
                        i16 = i23;
                        interfaceC0539e3 = null;
                        c0585q2.romeo();
                        int i25 = i15 >> 3;
                        int i26 = i25 & 14;
                        int i27 = i26 | ((i16 >> 6) & 112);
                        int i28 = i15;
                        androidx.compose.runtime.ax black = C0564b.black(function1, c0585q2);
                        int i29 = i16;
                        z11 = (((i27 & 14) ^ 6) <= 4 && c0585q2.golf(c1874w)) || (i27 & 6) == 4;
                        jade = c0585q2.jade();
                        asVar = C0580l.alpha;
                        if (!z11 || jade == asVar) {
                            ?? obj = new Object();
                            obj.alpha = C0564b.whiskey(LottieConstants.IterateForever);
                            obj.bravo = C0564b.whiskey(LottieConstants.IterateForever);
                            androidx.compose.runtime.as asVar2 = androidx.compose.runtime.as.silver;
                            jade = new Af.i(0, 3, androidx.compose.runtime.D0.class, C0564b.papa(asVar2, new Ac.l(C0564b.papa(asVar2, new Cb.u(black, 24)), c1874w, (Object) obj, 12)), "value", "getValue()Ljava/lang/Object;");
                            c0585q2.f(jade);
                        }
                        sVar2 = (ge.s) jade;
                        int i30 = i28 >> 9;
                        int i31 = i26 | (i30 & 112);
                        z12 = ((((i31 & 112) ^ 48) <= 32 && c0585q2.hotel(z2)) || (i31 & 48) == 32) | ((((i31 & 14) ^ 6) <= 4 && c0585q2.golf(c1874w)) || (i31 & 6) == 4);
                        jade2 = c0585q2.jade();
                        if (!z12 || jade2 == asVar) {
                            jade2 = new C1856e(c1874w, z2);
                            c0585q2.f(jade2);
                        }
                        amVar = (androidx.compose.foundation.lazy.layout.am) jade2;
                        jade3 = c0585q2.jade();
                        if (jade3 == asVar) {
                            jade3 = C0564b.november(c0585q2);
                            c0585q2.f(jade3);
                        }
                        vf.ab abVar = (vf.ab) jade3;
                        InterfaceC0341aa interfaceC0341aa = (InterfaceC0341aa) c0585q2.kilo(AbstractC2901T.golf);
                        androidx.compose.foundation.lazy.layout.ab abVar2 = ((Boolean) c0585q2.kilo(AbstractC2901T.victor)).booleanValue() ? null : androidx.compose.foundation.lazy.layout.A.alpha;
                        int i32 = i29 << 18;
                        int i33 = (i28 & 65520) | (i30 & 3670016) | (i32 & 29360128) | (i32 & 234881024) | ((i29 << 27) & 1879048192);
                        echo = ((((i33 & 112) ^ 48) <= 32 && c0585q2.golf(c1874w)) || (i33 & 48) == 32) | ((((i33 & 896) ^ 384) <= 256 && c0585q2.golf(m4)) || (i33 & 384) == 256) | ((((i33 & 7168) ^ 3072) <= 2048 && c0585q2.hotel(false)) || (i33 & 3072) == 2048) | ((((57344 & i33) ^ 24576) <= 16384 && c0585q2.hotel(z2)) || (i33 & 24576) == 16384) | c0585q2.echo(0) | ((((i33 & 3670016) ^ 1572864) <= 1048576 && c0585q2.golf(iVar2)) || (i33 & 1572864) == 1048576) | ((((i33 & 29360128) ^ 12582912) <= 8388608 && c0585q2.golf(jVar3)) || (i33 & 12582912) == 8388608) | ((((i33 & 234881024) ^ 100663296) <= 67108864 && c0585q2.golf(interfaceC0539e3)) || (i33 & 100663296) == 67108864) | ((((i33 & 1879048192) ^ 805306368) <= 536870912 && c0585q2.golf(interfaceC0541g3)) || (i33 & 805306368) == 536870912) | c0585q2.golf(interfaceC0341aa) | c0585q2.golf(abVar2);
                        jade4 = c0585q2.jade();
                        if (!echo || jade4 == asVar) {
                            T.i iVar4 = iVar2;
                            jVar4 = jVar3;
                            iVar3 = iVar4;
                            c0585q = c0585q2;
                            amVar2 = amVar;
                            i17 = 4;
                            InterfaceC0541g interfaceC0541g5 = interfaceC0541g3;
                            jade4 = new C1865n(c1874w, z2, m4, sVar2, interfaceC0541g5, interfaceC0539e3, abVar, interfaceC0341aa, abVar2, iVar3, jVar4);
                            sVar3 = sVar2;
                            interfaceC0541g4 = interfaceC0541g5;
                            interfaceC0539e4 = interfaceC0539e3;
                            c0585q.f(jade4);
                        } else {
                            sVar3 = sVar2;
                            c0585q = c0585q2;
                            interfaceC0539e4 = interfaceC0539e3;
                            iVar3 = iVar2;
                            amVar2 = amVar;
                            i17 = 4;
                            jVar4 = jVar3;
                            interfaceC0541g4 = interfaceC0541g3;
                        }
                        androidx.compose.foundation.lazy.layout.y yVar = (androidx.compose.foundation.lazy.layout.y) jade4;
                        d.K k6 = !z2 ? d.K.alpha : d.K.purple;
                        if (!z10) {
                            c0585q.purple(-2077085864);
                            if ((((i25 & 14) ^ 6) <= i17 || !c0585q.golf(c1874w)) && (i25 & 6) != i17) {
                                z13 = false;
                            }
                            boolean echo2 = z13 | c0585q.echo(0);
                            Object jade5 = c0585q.jade();
                            if (echo2 || jade5 == asVar) {
                                jade5 = new C1857f(c1874w);
                                c0585q.f(jade5);
                            }
                            sVar4 = androidx.compose.foundation.lazy.layout.j.mike((C1857f) jade5, c1874w.oscar, k6);
                            c0585q.quebec(false);
                        } else {
                            c0585q.purple(-2076657041);
                            c0585q.quebec(false);
                            sVar4 = T.p.alpha;
                        }
                        c1874w2 = c1874w;
                        androidx.compose.foundation.lazy.layout.j.alpha(sVar3, androidx.compose.foundation.a.juliet(androidx.compose.foundation.lazy.layout.j.november(sVar.then(c1874w.lima).then(c1874w.mike), sVar3, amVar2, k6, z10).then(sVar4).then(c1874w.november.india), c1874w, k6, z10, c1543m, c1874w.golf, false, c0704t), c1874w2.papa, yVar, c0585q, 0);
                        interfaceC0541g2 = interfaceC0541g4;
                        jVar2 = jVar4;
                        interfaceC0539e2 = interfaceC0539e4;
                    }
                } else {
                    c0585q2.ochre();
                    i15 = i12 & (-234881025);
                    interfaceC0541g3 = interfaceC0541g;
                    jVar3 = jVar;
                }
                i16 = i23;
                interfaceC0539e3 = interfaceC0539e;
                c0585q2.romeo();
                int i252 = i15 >> 3;
                int i262 = i252 & 14;
                int i272 = i262 | ((i16 >> 6) & 112);
                int i282 = i15;
                androidx.compose.runtime.ax black2 = C0564b.black(function1, c0585q2);
                int i292 = i16;
                if (((i272 & 14) ^ 6) <= 4) {
                }
                jade = c0585q2.jade();
                asVar = C0580l.alpha;
                if (!z11) {
                }
                ?? obj2 = new Object();
                obj2.alpha = C0564b.whiskey(LottieConstants.IterateForever);
                obj2.bravo = C0564b.whiskey(LottieConstants.IterateForever);
                androidx.compose.runtime.as asVar22 = androidx.compose.runtime.as.silver;
                jade = new Af.i(0, 3, androidx.compose.runtime.D0.class, C0564b.papa(asVar22, new Ac.l(C0564b.papa(asVar22, new Cb.u(black2, 24)), c1874w, (Object) obj2, 12)), "value", "getValue()Ljava/lang/Object;");
                c0585q2.f(jade);
                sVar2 = (ge.s) jade;
                int i302 = i282 >> 9;
                int i312 = i262 | (i302 & 112);
                z12 = ((((i312 & 112) ^ 48) <= 32 && c0585q2.hotel(z2)) || (i312 & 48) == 32) | ((((i312 & 14) ^ 6) <= 4 && c0585q2.golf(c1874w)) || (i312 & 6) == 4);
                jade2 = c0585q2.jade();
                if (!z12) {
                }
                jade2 = new C1856e(c1874w, z2);
                c0585q2.f(jade2);
                amVar = (androidx.compose.foundation.lazy.layout.am) jade2;
                jade3 = c0585q2.jade();
                if (jade3 == asVar) {
                }
                vf.ab abVar3 = (vf.ab) jade3;
                InterfaceC0341aa interfaceC0341aa2 = (InterfaceC0341aa) c0585q2.kilo(AbstractC2901T.golf);
                androidx.compose.foundation.lazy.layout.ab abVar22 = ((Boolean) c0585q2.kilo(AbstractC2901T.victor)).booleanValue() ? null : androidx.compose.foundation.lazy.layout.A.alpha;
                int i322 = i292 << 18;
                int i332 = (i282 & 65520) | (i302 & 3670016) | (i322 & 29360128) | (i322 & 234881024) | ((i292 << 27) & 1879048192);
                echo = ((((i332 & 112) ^ 48) <= 32 && c0585q2.golf(c1874w)) || (i332 & 48) == 32) | ((((i332 & 896) ^ 384) <= 256 && c0585q2.golf(m4)) || (i332 & 384) == 256) | ((((i332 & 7168) ^ 3072) <= 2048 && c0585q2.hotel(false)) || (i332 & 3072) == 2048) | ((((57344 & i332) ^ 24576) <= 16384 && c0585q2.hotel(z2)) || (i332 & 24576) == 16384) | c0585q2.echo(0) | ((((i332 & 3670016) ^ 1572864) <= 1048576 && c0585q2.golf(iVar2)) || (i332 & 1572864) == 1048576) | ((((i332 & 29360128) ^ 12582912) <= 8388608 && c0585q2.golf(jVar3)) || (i332 & 12582912) == 8388608) | ((((i332 & 234881024) ^ 100663296) <= 67108864 && c0585q2.golf(interfaceC0539e3)) || (i332 & 100663296) == 67108864) | ((((i332 & 1879048192) ^ 805306368) <= 536870912 && c0585q2.golf(interfaceC0541g3)) || (i332 & 805306368) == 536870912) | c0585q2.golf(interfaceC0341aa2) | c0585q2.golf(abVar22);
                jade4 = c0585q2.jade();
                if (echo) {
                }
                T.i iVar42 = iVar2;
                jVar4 = jVar3;
                iVar3 = iVar42;
                c0585q = c0585q2;
                amVar2 = amVar;
                i17 = 4;
                InterfaceC0541g interfaceC0541g52 = interfaceC0541g3;
                jade4 = new C1865n(c1874w, z2, m4, sVar2, interfaceC0541g52, interfaceC0539e3, abVar3, interfaceC0341aa2, abVar22, iVar3, jVar4);
                sVar3 = sVar2;
                interfaceC0541g4 = interfaceC0541g52;
                interfaceC0539e4 = interfaceC0539e3;
                c0585q.f(jade4);
                androidx.compose.foundation.lazy.layout.y yVar2 = (androidx.compose.foundation.lazy.layout.y) jade4;
                d.K k62 = !z2 ? d.K.alpha : d.K.purple;
                if (!z10) {
                }
                c1874w2 = c1874w;
                androidx.compose.foundation.lazy.layout.j.alpha(sVar3, androidx.compose.foundation.a.juliet(androidx.compose.foundation.lazy.layout.j.november(sVar.then(c1874w.lima).then(c1874w.mike), sVar3, amVar2, k62, z10).then(sVar4).then(c1874w.november.india), c1874w, k62, z10, c1543m, c1874w.golf, false, c0704t), c1874w2.papa, yVar2, c0585q, 0);
                interfaceC0541g2 = interfaceC0541g4;
                jVar2 = jVar4;
                interfaceC0539e2 = interfaceC0539e4;
            } else {
                c1874w2 = c1874w;
                c0585q = c0585q2;
                c0585q.ochre();
                interfaceC0541g2 = interfaceC0541g;
                jVar2 = jVar;
                interfaceC0539e2 = interfaceC0539e;
                iVar3 = iVar2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                final C1874w c1874w3 = c1874w2;
                final T.i iVar5 = iVar3;
                uniform.delta = new Xd.l() { // from class: i.l
                    @Override // Xd.l
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int cyan = C0564b.cyan(i4 | 1);
                        int cyan2 = C0564b.cyan(i5);
                        Function1 function12 = function1;
                        int i34 = i10;
                        AbstractC2625c5.alpha(T.s.this, c1874w3, m4, z2, c1543m, z10, c0704t, iVar5, interfaceC0541g2, jVar2, interfaceC0539e2, function12, (InterfaceC0581m) obj3, cyan, cyan2, i34);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        if ((i5 & 3072) == 0) {
        }
        boolean z132 = true;
        if (!c0585q2.magenta(i12 & 1, (i12 & 306783379) == 306783378 || (i23 & 1171) != 1170)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final C3158b bravo(C2576i c2576i, Ne.b classId, Me.f jvmMetadataVersion) {
        Intrinsics.echo(c2576i, "<this>");
        Intrinsics.echo(classId, "classId");
        Intrinsics.echo(jvmMetadataVersion, "jvmMetadataVersion");
        D8.c charlie = c2576i.charlie(classId, jvmMetadataVersion);
        if (charlie != null) {
            return (C3158b) charlie.purple;
        }
        return null;
    }
}
