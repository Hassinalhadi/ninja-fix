package Ic;

import D0.an;
import F.G2;
import H0.i;
import H0.n;
import H0.v;
import T.k;
import T.p;
import T.s;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import com.app.network.network.models.Root;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.AbstractC2715m5;
import s6.AbstractC2786u5;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.R3;

/* loaded from: classes2.dex */
public abstract class e {
    public static final n alpha = new n(ArraysKt.sierra(new i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)}));

    public static final void alpha(Root root, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        boolean z10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(974333643);
        if (c0585q.india(root)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4;
        if (c0585q.india(function0)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i11 | i10;
        if ((i12 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            k kVar = T.d.teal;
            float f5 = 12;
            s bravo = androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(R3.charlie(V.echo(V.charlie(p.alpha, 1.0f), 84), 1, f.bravo, AbstractC2094g.bravo(f5)), AbstractC2094g.bravo(f5)), f.alpha, ao.alpha);
            if ((i12 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q.jade();
            if (z10 || jade == C0580l.alpha) {
                jade = new Bb.a(function0, 5);
                c0585q.f(jade);
            }
            s uniform = AbstractC0538d.uniform(androidx.compose.foundation.a.echo(15, bravo, null, (Function0) jade, false), 16, 0.0f, 2);
            ap delta = AbstractC0547m.delta(kVar, false);
            long j5 = c0585q.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(uniform, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ad.blue(i13, c0585q, i13, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            String name = root.getName();
            if (name == null) {
                name = "";
            }
            G2.bravo(name, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(f.charlie, AbstractC2636d7.charlie(14), new v(700), null, alpha, 0L, 3, 0L, 0, 16744408), c0585q, 0, 0, 65534);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Cb.a(i4, 4, root, function0);
        }
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, j.a] */
    public static final void bravo(List roots, Function1 function1, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        Function1 function12;
        Function1 onRootClick = function1;
        Intrinsics.echo(roots, "roots");
        Intrinsics.echo(onRootClick, "onRootClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2126315889);
        if (c0585q.india(roots)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i4 | i5;
        if (c0585q.india(onRootClick)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i11 | i10;
        if ((i12 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            p pVar = p.alpha;
            FillElement fillElement = V.charlie;
            s bravo = androidx.compose.foundation.a.bravo(fillElement, f.echo, ao.alpha);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(bravo, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ad.blue(i13, c0585q, i13, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            float f5 = 16;
            float f10 = 12;
            boolean z10 = false;
            G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.tickets_selection_msg), AbstractC0538d.tango(pVar, f5, f10), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(f.delta, AbstractC2636d7.charlie(13), new v(HttpConstants.HTTP_BAD_REQUEST), null, alpha, 0L, 0, 0L, 0, 16777176), c0585q, 48, 0, 65532);
            c0585q = c0585q;
            ?? obj = new Object();
            s uniform = AbstractC0538d.uniform(fillElement, f10, 0.0f, 2);
            float f11 = 10;
            C0540f golf = AbstractC0542h.golf(f11);
            C0540f golf2 = AbstractC0542h.golf(f11);
            M delta = AbstractC0538d.delta(0.0f, 0.0f, 0.0f, f5, 7);
            boolean india = c0585q.india(roots);
            if ((i12 & 112) == 32) {
                z10 = true;
            }
            boolean z11 = india | z10;
            Object jade = c0585q.jade();
            if (!z11 && jade != C0580l.alpha) {
                function12 = function1;
            } else {
                function12 = function1;
                jade = new a(roots, function12, 0);
                c0585q.f(jade);
            }
            onRootClick = function12;
            AbstractC2786u5.alpha(obj, uniform, null, delta, golf2, golf, null, false, null, (Function1) jade, c0585q, 1772592);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new b(roots, onRootClick, i4, 0);
        }
    }
}
