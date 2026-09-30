package n;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: n.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2130e {
    public static final Pair alpha = new Pair(CollectionsKt.emptyList(), CollectionsKt.emptyList());

    public static final void alpha(D0.g gVar, List list, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1794596951);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(gVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        char c3 = ' ';
        if ((i4 & 48) == 0) {
            if (c0585q.india(list)) {
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
            int size = list.size();
            int i12 = 0;
            while (i12 < size) {
                D0.e eVar = (D0.e) list.get(i12);
                Xd.m mVar = (Xd.m) eVar.alpha;
                Object jade = c0585q.jade();
                if (jade == C0580l.alpha) {
                    jade = C2129d.bravo;
                    c0585q.f(jade);
                }
                q0.ap apVar = (q0.ap) jade;
                T.p pVar = T.p.alpha;
                long j5 = c0585q.magenta;
                int i13 = (int) (j5 ^ (j5 >>> c3));
                androidx.compose.runtime.I mike = c0585q.mike();
                T.s charlie = T.a.charlie(pVar, c0585q);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q, apVar);
                C0564b.blue(C2551k.echo, c0585q, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                    ao.ad.blue(i13, c0585q, i13, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie);
                mVar.invoke(gVar.subSequence(eVar.bravo, eVar.charlie).purple, c0585q, 0);
                c0585q.quebec(true);
                i12++;
                c3 = ' ';
            }
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.aa(i4, 23, gVar, list);
        }
    }
}
