package s6;

import android.os.Looper;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import m.C2093f;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: s6.y7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2824y7 {
    public static final void alpha(T.p pVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        P.d dVar = Cb.y.uniform;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-480013148);
        int i5 = i4 | 6;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            pVar = T.p.alpha;
            T.s charlie = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
            long j5 = Db.c.crimson;
            C2093f c2093f = Db.a.bravo;
            T.s sierra = AbstractC0538d.sierra(t6.R3.charlie(androidx.compose.foundation.a.bravo(charlie, j5, c2093f), 1, Db.c.coral, c2093f), Db.d.alpha);
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
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            androidx.appcompat.widget.P0.indigo(6, dVar, c0585q, true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Pa.h(pVar, i4);
        }
    }

    public static K1.f bravo(Looper looper, Object obj, String str) {
        V5.x.india(obj, "Listener must not be null");
        V5.x.india(looper, "Looper must not be null");
        return new K1.f(looper, obj, str);
    }

    public static K1.f charlie(Object obj, String str, Executor executor) {
        V5.x.india(obj, "Listener must not be null");
        V5.x.india(executor, "Executor must not be null");
        return new K1.f(obj, str, executor);
    }

    public static T5.i delta(Object obj, String str) {
        V5.x.india(obj, "Listener must not be null");
        V5.x.foxtrot(str, "Listener type must not be empty");
        return new T5.i(obj, str);
    }
}
