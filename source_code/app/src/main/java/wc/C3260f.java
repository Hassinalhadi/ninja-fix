package wc;

import F.AbstractC0127k2;
import F.G2;
import F.K1;
import O0.k;
import T.p;
import T.s;
import Xd.m;
import a0.C0366t;
import a0.ao;
import af.C0437h;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0552s;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import ao.ad;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import kotlin.Unit;
import kotlin.collections.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.J4;
import t6.AbstractC3086y3;

/* renamed from: wc.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3260f implements m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C3257c purple;
    public final /* synthetic */ ax red;
    public final /* synthetic */ C0437h silver;

    public /* synthetic */ C3260f(C3257c c3257c, ax axVar, C0437h c0437h, int i4) {
        this.alpha = i4;
        this.purple = c3257c;
        this.red = axVar;
        this.silver = c0437h;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        int i4;
        boolean z10;
        int i5;
        switch (this.alpha) {
            case 0:
                C0552s BoxWithConstraints = (C0552s) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Integer) obj3).intValue();
                Intrinsics.echo(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((intValue & 6) == 0) {
                    if (((C0585q) interfaceC0581m).golf(BoxWithConstraints)) {
                        i4 = 4;
                    } else {
                        i4 = 2;
                    }
                    intValue |= i4;
                }
                if ((intValue & 19) != 18) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    boolean booleanValue = ((Boolean) this.red.getValue()).booleanValue();
                    p pVar = p.alpha;
                    Object obj4 = C0580l.alpha;
                    if (booleanValue) {
                        c0585q.purple(1230963855);
                        C3257c c3257c = this.purple;
                        boolean india = c0585q.india(c3257c);
                        Object jade = c0585q.jade();
                        if (india || jade == obj4) {
                            jade = new C3256b(c3257c, 2);
                            c0585q.f(jade);
                        }
                        FillElement fillElement = V.charlie;
                        androidx.compose.ui.viewinterop.a.alpha((Function1) jade, fillElement, null, c0585q, 48, 4);
                        float f5 = 322;
                        float f10 = 32;
                        float charlie = BoxWithConstraints.charlie() - f10;
                        float bravo = BoxWithConstraints.bravo() - f10;
                        if (Float.compare(charlie, bravo) >= 0) {
                            charlie = bravo;
                        }
                        if (Float.compare(f5, charlie) >= 0) {
                            f5 = charlie;
                        }
                        AbstractC3255a.bravo(((Q0.g) J4.alpha(new Q0.g(f5), new Q0.g(280))).alpha, fillElement, c0585q, 48);
                        c0585q.quebec(false);
                    } else {
                        c0585q.purple(1231916392);
                        s sierra = AbstractC0538d.sierra(V.charlie, 24);
                        C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.echo, T.d.f2063g, c0585q, 54);
                        long j5 = c0585q.magenta;
                        int i10 = (int) (j5 ^ (j5 >>> 32));
                        I mike = c0585q.mike();
                        s charlie2 = T.a.charlie(sierra, c0585q);
                        InterfaceC2552l.maroon.getClass();
                        Function0 function0 = C2551k.bravo;
                        c0585q.white();
                        if (c0585q.lime) {
                            c0585q.lima(function0);
                        } else {
                            c0585q.i();
                        }
                        C0564b.blue(C2551k.foxtrot, c0585q, alpha);
                        C0564b.blue(C2551k.echo, c0585q, mike);
                        C2549i c2549i = C2551k.golf;
                        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i10))) {
                            ad.blue(i10, c0585q, i10, c2549i);
                        }
                        C0564b.blue(C2551k.delta, c0585q, charlie2);
                        G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.camera_permission_is_required_to_use_the_scanner), null, C0366t.echo, AbstractC2636d7.charlie(16), null, null, 0L, new k(3), 0L, 0, false, 0, 0, null, null, c0585q, 3456, 0, 130546);
                        AbstractC0538d.echo(V.echo(pVar, 16), c0585q);
                        Object obj5 = this.silver;
                        boolean india2 = c0585q.india(obj5);
                        Object jade2 = c0585q.jade();
                        if (india2 || jade2 == obj4) {
                            jade2 = new n(28, obj5);
                            c0585q.f(jade2);
                        }
                        K1.bravo((Function0) jade2, null, false, null, null, null, null, null, AbstractC3255a.delta, c0585q, 805306368, 510);
                        c0585q.quebec(true);
                        c0585q.quebec(false);
                    }
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                L padding = (L) obj;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                Intrinsics.echo(padding, "padding");
                if ((intValue2 & 6) == 0) {
                    if (((C0585q) interfaceC0581m2).golf(padding)) {
                        i5 = 4;
                    } else {
                        i5 = 2;
                    }
                    intValue2 |= i5;
                }
                if ((intValue2 & 19) != 18) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    p pVar2 = p.alpha;
                    s romeo = AbstractC0538d.romeo(V.charlie, padding);
                    C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
                    long j6 = c0585q2.magenta;
                    int i11 = (int) (j6 ^ (j6 >>> 32));
                    I mike2 = c0585q2.mike();
                    s charlie3 = T.a.charlie(romeo, c0585q2);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q2, alpha2);
                    C0564b.blue(C2551k.echo, c0585q2, mike2);
                    C2549i c2549i2 = C2551k.golf;
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i11))) {
                        ad.blue(i11, c0585q2, i11, c2549i2);
                    }
                    C0564b.blue(C2551k.delta, c0585q2, charlie3);
                    AbstractC0127k2.alpha(V.charlie(pVar2, 1.0f), null, C0366t.echo, 0L, 0.0f, 0.0f, null, AbstractC3255a.charlie, c0585q2, 12583302, 122);
                    s charlie4 = V.charlie(pVar2, 1.0f);
                    if (1.0f <= 0.0d) {
                        AbstractC1797a.alpha("invalid weight; must be greater than zero");
                    }
                    AbstractC0538d.alpha(androidx.compose.foundation.a.bravo(charlie4.then(new LayoutWeightElement(1.0f, true)), C0366t.bravo, ao.alpha), null, false, P.e.echo(-670781509, new C3260f(this.purple, this.red, this.silver, 0), c0585q2), c0585q2, 3072, 6);
                    c0585q2.quebec(true);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
