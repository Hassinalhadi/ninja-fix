package t6;

import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s.C2523b;
import s.C2528g;
import s.C2529h;
import s.C2530i;
import u.AbstractC3134h;

/* renamed from: t6.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3067v {
    public static final void alpha(T.s sVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2064964257);
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
        if (c0585q.magenta(i5 & 1, z2)) {
            bravo(sVar, dVar, c0585q, ((i5 << 3) & 896) | (i5 & 14) | 48);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2529h(sVar, dVar, i4, 0);
        }
    }

    public static final void bravo(T.s sVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(771959668);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(null)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(dVar)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.yankee(null, androidx.compose.runtime.as.red);
                c0585q.f(jade);
            }
            androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new C2530i(axVar, 0);
                c0585q.f(jade2);
            }
            C0564b.alpha(AbstractC3134h.bravo.alpha(delta((Function0) jade2, c0585q, 0)), P.e.echo(-291176396, new P0.c(sVar, axVar, dVar, 1), c0585q), c0585q, 56);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2529h(sVar, dVar, i4, 1);
        }
    }

    public static final Wf.x charlie(androidx.compose.runtime.E0 e02, C0585q c0585q) {
        Intrinsics.echo(e02, "<this>");
        c0585q.purple(-1260790148);
        Wf.a.alpha(c0585q, 0);
        Wf.x xVar = (Wf.x) c0585q.kilo(e02);
        c0585q.quebec(false);
        return xVar;
    }

    public static final C2528g delta(Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        View view = (View) c0585q.kilo(AndroidCompositionLocals_androidKt.foxtrot);
        boolean golf = c0585q.golf(view);
        Object jade = c0585q.jade();
        androidx.compose.runtime.as asVar = C0580l.alpha;
        if (golf || jade == asVar) {
            jade = new C2528g(view, null, function0);
            c0585q.f(jade);
        }
        C2528g c2528g = (C2528g) jade;
        boolean india = c0585q.india(c2528g);
        Object jade2 = c0585q.jade();
        if (india || jade2 == asVar) {
            jade2 = new C2523b(c2528g, 3);
            c0585q.f(jade2);
        }
        C0564b.delta(c2528g, (Function1) jade2, c0585q);
        return c2528g;
    }
}
