package s6;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import java.util.AbstractList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2763s0;
import t6.AbstractC3071v3;
import t6.AbstractC3086y3;

/* renamed from: s6.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2763s0 {
    public static final void alpha(final AbstractList cards, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z2;
        final int i10;
        final int i11 = 0;
        Intrinsics.echo(cards, "cards");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(203904560);
        if (c0585q.india(cards)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i5 | i4;
        if ((i12 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            if (cards.isEmpty()) {
                androidx.compose.runtime.Q uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new Xd.l(cards, i4, i11) { // from class: Bb.b
                        public final /* synthetic */ int alpha;
                        public final /* synthetic */ AbstractList purple;

                        {
                            this.alpha = i11;
                        }

                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            int i13 = this.alpha;
                            InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                            ((Integer) obj2).getClass();
                            switch (i13) {
                                case 0:
                                    AbstractC2763s0.alpha(this.purple, interfaceC0581m2, C0564b.cyan(1));
                                    return Unit.INSTANCE;
                                default:
                                    AbstractC2763s0.alpha(this.purple, interfaceC0581m2, C0564b.cyan(1));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            T.p pVar = T.p.alpha;
            float f5 = 12;
            T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.romeo(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f)), AbstractC3071v3.alpha(c0585q, R.color.cool_gray), AbstractC2094g.bravo(f5)), f5, f5);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2063g, c0585q, 48);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(tango, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie);
            z.ak.bravo(AbstractC3086y3.bravo(c0585q, R.string.details), androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(AbstractC3071v3.alpha(c0585q, R.color.colorPrimary), AbstractC2636d7.charlie(16), new H0.v(700), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 3, 0L, 0, 16744408), c0585q, 48, 0, 65532);
            c0585q = c0585q;
            T.s hotel = com.google.android.material.datepicker.j.hotel(pVar, f5, c0585q, pVar, 1.0f);
            androidx.compose.foundation.layout.B b2 = androidx.compose.foundation.layout.B.alpha;
            T.s november = AbstractC0538d.november(hotel);
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(8), T.d.f2060c, c0585q, 54);
            int romeo2 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(november, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ao.ad.blue(romeo2, c0585q, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie2);
            c0585q.purple(-983268972);
            Iterator it = cards.iterator();
            while (it.hasNext()) {
                Bb.f fVar = (Bb.f) it.next();
                String str = fVar.alpha;
                if (1.0f <= 0.0d) {
                    AbstractC1797a.alpha("invalid weight; must be greater than zero");
                }
                AbstractC2799w0.alpha(str, fVar.bravo, new LayoutWeightElement(1.0f, true), fVar.charlie, c0585q, 0);
            }
            i10 = 1;
            A0.z.papa(c0585q, false, true, true);
        } else {
            i10 = 1;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Xd.l(cards, i4, i10) { // from class: Bb.b
                public final /* synthetic */ int alpha;
                public final /* synthetic */ AbstractList purple;

                {
                    this.alpha = i10;
                }

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    int i13 = this.alpha;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                    ((Integer) obj2).getClass();
                    switch (i13) {
                        case 0:
                            AbstractC2763s0.alpha(this.purple, interfaceC0581m2, C0564b.cyan(1));
                            return Unit.INSTANCE;
                        default:
                            AbstractC2763s0.alpha(this.purple, interfaceC0581m2, C0564b.cyan(1));
                            return Unit.INSTANCE;
                    }
                }
            };
        }
    }

    public static void bravo(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static void charlie(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public static void delta(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
