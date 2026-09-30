package s;

import Cb.ac;
import Ec.al;
import T.s;
import U0.ad;
import a0.AbstractC0367u;
import a0.C0360n;
import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.aa;
import androidx.compose.runtime.as;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import f0.AbstractC1680b;
import k5.C2012e;
import k5.C2015h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import q0.C2391j;
import t6.AbstractC3055s2;
import t6.AbstractC3076w3;
import u.AbstractC3134h;
import u.InterfaceC3132f;

/* renamed from: s.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2534m {
    public static final ad alpha = new ad(14);

    public static final void alpha(q.g gVar, q.c cVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        Context context;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1904307118);
        if (c0585q.golf(gVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4;
        if (c0585q.india(cVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i11 | i10;
        boolean z10 = true;
        if ((i12 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            if (Build.VERSION.SDK_INT >= 28) {
                c0585q.purple(-1009462744);
                context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-1009413640);
                c0585q.quebec(false);
                context = null;
            }
            boolean india = c0585q.india(cVar);
            if ((i12 & 14) != 4) {
                z10 = false;
            }
            boolean india2 = india | z10 | c0585q.india(context);
            Object jade = c0585q.jade();
            if (india2 || jade == C0580l.alpha) {
                jade = new ac(cVar, context, gVar, 26);
                c0585q.f(jade);
            }
            c.g.bravo(null, null, (Function1) jade, c0585q, 0, 3);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2015h(i4, 3, gVar, cVar);
        }
    }

    public static final void bravo(int i4, long j5, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        int i11;
        boolean z2;
        boolean z10;
        int i12;
        int i13;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1240244237);
        if ((i5 & 6) == 0) {
            i10 = i4;
            if (c0585q.echo(i10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i5 | i13;
        } else {
            i10 = i4;
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q.foxtrot(j5)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        boolean z11 = true;
        if ((i11 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
            boolean golf = c0585q.golf(context);
            if ((i11 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z12 = z10 | golf;
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (z12 || jade == asVar) {
                jade = Integer.valueOf(context.obtainStyledAttributes(new int[]{i10}).getResourceId(0, -1));
                c0585q.f(jade);
            }
            int intValue = ((Number) jade).intValue();
            if (intValue == -1) {
                Q uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new C2012e(i10, i5, 1, j5);
                    return;
                }
                return;
            }
            AbstractC1680b charlie = AbstractC3076w3.charlie(intValue, c0585q, 0);
            if ((i11 & 112) != 32) {
                z11 = false;
            }
            Object jade2 = c0585q.jade();
            if (z11 || jade2 == asVar) {
                if (j5 == 16) {
                    jade2 = null;
                } else {
                    jade2 = new C0360n(j5, 5);
                }
                c0585q.f(jade2);
            }
            AbstractC0547m.alpha(androidx.compose.ui.draw.a.delta(V.kilo(T.p.alpha, c.f.juliet), charlie, null, C2391j.bravo, 0.0f, (AbstractC0367u) jade2, 22), c0585q, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new C2012e(i4, i5, 2, j5);
        }
    }

    public static final void charlie(q.g gVar, InterfaceC3132f interfaceC3132f, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean z10;
        int i10;
        boolean india;
        int i11;
        boolean india2;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2040393164);
        if ((i4 & 6) == 0) {
            if ((i4 & 8) == 0) {
                india2 = c0585q.golf(gVar);
            } else {
                india2 = c0585q.india(gVar);
            }
            if (india2) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if ((i4 & 64) == 0) {
                india = c0585q.golf(interfaceC3132f);
            } else {
                india = c0585q.india(interfaceC3132f);
            }
            if (india) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(function0)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        boolean z11 = true;
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            if ((i5 & 112) != 32 && ((i5 & 64) == 0 || !c0585q.golf(interfaceC3132f))) {
                z10 = false;
            } else {
                z10 = true;
            }
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (z10 || jade == asVar) {
                jade = new C2536o(new androidx.core.widget.f(17, new okhttp3.internal.ws.a(3, interfaceC3132f, function0)));
                c0585q.f(jade);
            }
            C2536o c2536o = (C2536o) jade;
            if ((i5 & 14) != 4 && ((i5 & 8) == 0 || !c0585q.india(gVar))) {
                z11 = false;
            }
            Object jade2 = c0585q.jade();
            if (z11 || jade2 == asVar) {
                jade2 = new kotlin.collections.n(18, gVar);
                c0585q.f(jade2);
            }
            U0.l.alpha(c2536o, (Function0) jade2, alpha, P.e.echo(1315155414, new P0.b(7, interfaceC3132f, gVar), c0585q), c0585q, 3456, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new al(gVar, interfaceC3132f, function0, i4, 21);
        }
    }

    public static final void delta(s sVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12 = 2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1392105195);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(dVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(1 & i5, z2)) {
            aa aaVar = AbstractC3134h.alpha;
            P.d dVar2 = AbstractC2533l.alpha;
            AbstractC3055s2.alpha(sVar, aaVar, dVar, c0585q, ((i5 << 6) & 7168) | (i5 & 14) | 432);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2529h(sVar, dVar, i4, i12);
        }
    }
}
