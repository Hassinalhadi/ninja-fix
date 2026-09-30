package s6;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import gb.C1762a;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import vf.C3207k;

/* loaded from: classes2.dex */
public abstract class T4 {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(T.s sVar, String str, String str2, C1762a c1762a, int i4, InterfaceC0581m interfaceC0581m, int i5, int i10) {
        T.s sVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        C0585q c0585q;
        androidx.compose.runtime.Q uniform;
        boolean z10;
        int i15;
        boolean z11;
        int i16;
        int i17;
        int i18;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(2142145892);
        int i19 = i10 & 1;
        if (i19 != 0) {
            i11 = i5 | 6;
            sVar2 = sVar;
        } else if ((i5 & 6) == 0) {
            sVar2 = sVar;
            if (c0585q2.golf(sVar2)) {
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
            if (c0585q2.golf(str)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i11 |= i18;
        }
        if ((i5 & 384) == 0) {
            if (c0585q2.golf(str2)) {
                i17 = Barcode.FORMAT_QR_CODE;
            } else {
                i17 = 128;
            }
            i11 |= i17;
        }
        if ((i5 & 3072) == 0) {
            if (c0585q2.golf(c1762a)) {
                i16 = 2048;
            } else {
                i16 = Barcode.FORMAT_UPC_E;
            }
            i11 |= i16;
        }
        int i20 = i10 & 16;
        if (i20 != 0) {
            i11 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i13 = i4;
            if (c0585q2.echo(i13)) {
                i14 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i14 = 8192;
            }
            i11 |= i14;
            if ((i11 & 9363) == 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q2.magenta(i11 & 1, z2)) {
                T.s sVar3 = T.p.alpha;
                if (i19 != 0) {
                    sVar2 = sVar3;
                }
                if (i20 != 0) {
                    i13 = 1;
                }
                T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(sVar2, c1762a.alpha, AbstractC2094g.bravo(c1762a.golf)), c1762a.echo, c1762a.foxtrot);
                if (str != null) {
                    c0585q2.purple(2044934651);
                    if ((i11 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object jade = c0585q2.jade();
                    if (z11 || jade == C0580l.alpha) {
                        jade = new Lb.ae(str, 9);
                        c0585q2.f(jade);
                    }
                    z10 = false;
                    sVar3 = A0.o.bravo(sVar3, false, (Function1) jade);
                    c0585q2.quebec(false);
                } else {
                    z10 = false;
                    c0585q2.purple(2045036982);
                    c0585q2.quebec(false);
                }
                T.s then = tango.then(sVar3);
                q0.ap delta = AbstractC0547m.delta(T.d.teal, z10);
                int romeo = C0564b.romeo(c0585q2);
                androidx.compose.runtime.I mike = c0585q2.mike();
                T.s charlie = T.a.charlie(then, c0585q2);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q2, delta);
                C0564b.blue(C2551k.echo, c0585q2, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                    ao.ad.blue(romeo, c0585q2, romeo, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q2, charlie);
                if (i13 == 1) {
                    i15 = 2;
                } else {
                    i15 = 1;
                }
                int i21 = i13;
                F.G2.bravo(str2, null, c1762a.bravo, c1762a.charlie, c1762a.delta, null, 0L, new O0.k(3), c1762a.charlie, i15, false, i21, 0, null, null, c0585q2, (i11 >> 6) & 14, (i11 >> 3) & 7168, 119250);
                c0585q = c0585q2;
                c0585q.quebec(true);
                i13 = i21;
            } else {
                c0585q = c0585q2;
                c0585q.ochre();
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new Lb.ab(sVar2, str, str2, c1762a, i13, i5, i10);
                return;
            }
            return;
        }
        i13 = i4;
        if ((i11 & 9363) == 9362) {
        }
        if (!c0585q2.magenta(i11 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final Object bravo(G6.q qVar, J8.z zVar) {
        if (qVar.india()) {
            Exception golf = qVar.golf();
            if (golf == null) {
                if (!qVar.delta) {
                    return qVar.hotel();
                }
                throw new CancellationException("Task " + qVar + " was cancelled normally.");
            }
            throw golf;
        }
        C3207k c3207k = new C3207k(1, J6.delta(zVar));
        c3207k.tango();
        qVar.charlie(Ff.a.alpha, new Ff.b(c3207k, 0));
        Object sierra = c3207k.sierra();
        Od.a aVar = Od.a.alpha;
        return sierra;
    }
}
