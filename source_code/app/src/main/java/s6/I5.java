package s6;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import ob.AbstractC2210c;
import ob.C2211d;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3087z;

/* loaded from: classes2.dex */
public abstract class I5 {
    public static final void alpha(int i4, P.d dVar, T.p pVar, InterfaceC0581m interfaceC0581m) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1310533456);
        int i5 = i4 | 432;
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            pVar = T.p.alpha;
            float f5 = C2211d.bravo;
            long j5 = AbstractC2210c.alpha;
            T.s charlie = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
            float f10 = C2211d.yankee;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(t6.R3.charlie(AbstractC3087z.alpha(charlie, AbstractC2094g.bravo(f10)), C2211d.echo, Db.c.azure, AbstractC2094g.bravo(f10)), j5, a0.ao.alpha), C2211d.zulu);
            q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, delta);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            T.s charlie3 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            int romeo2 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie4 = T.a.charlie(charlie3, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ao.ad.blue(romeo2, c0585q, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            dVar.invoke(c0585q, 6);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Pa.d(dVar, pVar, i4);
        }
    }

    public static final void bravo(bv.al alVar, Object obj, Object obj2) {
        boolean z2;
        Object obj3;
        int foxtrot = alVar.foxtrot(obj);
        if (foxtrot < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            obj3 = null;
        } else {
            obj3 = alVar.charlie[foxtrot];
        }
        if (obj3 != null) {
            if (obj3 instanceof bv.am) {
                ((bv.am) obj3).alpha(obj2);
            } else if (obj3 != obj2) {
                bv.am amVar = new bv.am();
                amVar.alpha(obj3);
                amVar.alpha(obj2);
                obj2 = amVar;
            }
            obj2 = obj3;
        }
        if (z2) {
            int i4 = ~foxtrot;
            alVar.bravo[i4] = obj;
            alVar.charlie[i4] = obj2;
            return;
        }
        alVar.charlie[foxtrot] = obj2;
    }

    public static bv.al charlie() {
        long[] jArr = bv.au.alpha;
        return new bv.al();
    }

    public static final boolean delta(bv.al alVar, Object obj, Object obj2) {
        Object golf = alVar.golf(obj);
        if (golf == null) {
            return false;
        }
        if (golf instanceof bv.am) {
            bv.am amVar = (bv.am) golf;
            boolean lima = amVar.lima(obj2);
            if (lima && amVar.golf()) {
                alVar.kilo(obj);
            }
            return lima;
        }
        if (!Intrinsics.areEqual(golf, obj2)) {
            return false;
        }
        alVar.kilo(obj);
        return true;
    }

    public static final void echo(bv.al alVar, Object obj) {
        boolean z2;
        long[] jArr = alVar.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128) {
                            int i11 = (i4 << 3) + i10;
                            Object obj2 = alVar.bravo[i11];
                            Object obj3 = alVar.charlie[i11];
                            if (obj3 instanceof bv.am) {
                                Intrinsics.charlie(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                bv.am amVar = (bv.am) obj3;
                                amVar.lima(obj);
                                z2 = amVar.golf();
                            } else if (obj3 == obj) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                alVar.lima(i11);
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        return;
                    }
                }
                if (i4 != length) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }
}
