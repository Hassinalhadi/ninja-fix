package n;

import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2126a implements Xd.l {
    public final /* synthetic */ long alpha;
    public final /* synthetic */ T.s purple;

    public C2126a(long j5, T.s sVar) {
        this.alpha = j5;
        this.purple = sVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(intValue & 1, z2)) {
            long j5 = this.alpha;
            if (j5 != 9205357640488583168L) {
                c0585q.purple(-1244013944);
                T.s juliet = androidx.compose.foundation.layout.V.juliet(this.purple, Q0.i.bravo(j5), Q0.i.alpha(j5), 0.0f, 0.0f, 12);
                q0.ap delta = AbstractC0547m.delta(T.d.purple, false);
                long j6 = c0585q.magenta;
                int i4 = (int) (j6 ^ (j6 >>> 32));
                androidx.compose.runtime.I mike = c0585q.mike();
                T.s charlie = T.a.charlie(juliet, c0585q);
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
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i4))) {
                    ao.ad.blue(i4, c0585q, i4, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie);
                AbstractC2128c.bravo(null, c0585q, 0, 1);
                c0585q.quebec(true);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-1243644858);
                AbstractC2128c.bravo(this.purple, c0585q, 0, 0);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
