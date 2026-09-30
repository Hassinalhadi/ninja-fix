package cc;

import D0.af;
import F.G2;
import F.S2;
import F.T2;
import H0.v;
import a0.ar;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import delivery.samurai.android.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3086y3;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Xd.l {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ long purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ j(int i4, long j5, Function0 function0, int i5) {
        this.red = i4;
        this.purple = j5;
        this.teal = function0;
        this.silver = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        Object obj3 = this.teal;
        int i4 = this.silver;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(1 | i4);
                g.lima(this.red, this.purple, (Function0) obj3, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            default:
                int i5 = this.red;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    T.i iVar = T.d.f2063g;
                    C0537c c0537c = AbstractC0542h.alpha;
                    C0540f golf = AbstractC0542h.golf(ob.k.juliet);
                    T.p pVar = T.p.alpha;
                    C0554u alpha = AbstractC0553t.alpha(golf, iVar, c0585q, 54);
                    int romeo = C0564b.romeo(c0585q);
                    I mike = c0585q.mike();
                    T.s charlie = T.a.charlie(pVar, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q, alpha);
                    C0564b.blue(C2551k.echo, c0585q, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                        ad.blue(romeo, c0585q, romeo, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie);
                    c0585q.purple(-820426596);
                    D0.d dVar = new D0.d();
                    int echo = dVar.echo(new af(this.purple, 0L, v.f1409c, (H0.r) null, (H0.s) null, (H0.k) null, (String) null, 0L, (O0.a) null, (O0.p) null, (K0.b) null, 0L, (O0.l) null, (ar) null, 65530));
                    try {
                        dVar.bravo(String.valueOf(i5));
                        dVar.delta(echo);
                        c0585q.purple(-820411533);
                        eb.e eVar = (eb.e) obj3;
                        echo = dVar.echo(new af(eVar.charlie, 0L, v.f1407a, (H0.r) null, (H0.s) null, (H0.k) null, (String) null, 0L, (O0.a) null, (O0.p) null, (K0.b) null, 0L, (O0.l) null, (ar) null, 65530));
                        try {
                            dVar.bravo(" " + AbstractC3086y3.bravo(c0585q, R.string.of_label) + " " + i4);
                            dVar.delta(echo);
                            c0585q.quebec(false);
                            D0.g foxtrot = dVar.foxtrot();
                            c0585q.quebec(false);
                            E0 e02 = T2.alpha;
                            G2.charlie(foxtrot, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((S2) c0585q.kilo(e02)).india, c0585q, 0, 131070);
                            G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.tasks_label), null, eVar.delta, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q.kilo(e02)).lima, c0585q, 0, 0, 65530);
                            c0585q.quebec(true);
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(eb.e eVar, long j5, int i4, int i5) {
        this.teal = eVar;
        this.purple = j5;
        this.red = i4;
        this.silver = i5;
    }
}
