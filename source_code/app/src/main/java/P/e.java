package P;

import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;

/* loaded from: classes3.dex */
public abstract class e {
    public static final Object alpha = new Object();
    public static final StackTraceElement[] bravo = new StackTraceElement[0];
    public static final j charlie = new j(0, new long[0], new Object[0]);

    public static final int alpha(int i4, int i5) {
        return i4 << (((i5 % 10) * 3) + 1);
    }

    public static final d bravo(int i4, kotlin.e eVar) {
        return new d(eVar, i4, false);
    }

    public static final long charlie() {
        return Thread.currentThread().getId();
    }

    public static final void delta(C0585q c0585q, Xd.l lVar) {
        Intrinsics.charlie(lVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        x.echo(2, lVar);
        lVar.invoke(c0585q, 1);
    }

    public static final d echo(int i4, kotlin.e eVar, InterfaceC0581m interfaceC0581m) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        if (jade == C0580l.alpha) {
            jade = new d(eVar, i4, true);
            c0585q.f(jade);
        }
        d dVar = (d) jade;
        dVar.kilo(eVar);
        return dVar;
    }

    public static final boolean foxtrot(Q q4, Q q5) {
        if (q4 != null) {
            if (q4 instanceof Q) {
                if (q4.bravo() && !Intrinsics.areEqual(q4, q5) && !Intrinsics.areEqual(q4.charlie, q5.charlie)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }
}
