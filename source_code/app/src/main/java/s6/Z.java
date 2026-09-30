package s6;

import a0.C0366t;
import g0.C1725e;
import g0.C1726f;
import g0.C1730j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3018l;

/* loaded from: classes2.dex */
public abstract class Z {
    public static C1726f alpha;

    public static void alpha(com.google.common.util.concurrent.e eVar) {
        boolean z2 = false;
        if (eVar.isDone()) {
            while (true) {
                try {
                    eVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
                return;
            }
            return;
        }
        throw new IllegalStateException(AbstractC3018l.bravo("Future was expected to be done: %s", eVar));
    }

    public static final C1726f bravo() {
        C1726f c1726f = alpha;
        if (c1726f != null) {
            Intrinsics.checkNotNull(c1726f);
            return c1726f;
        }
        C1725e c1725e = new C1725e("Filled.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        List list = g0.ah.alpha;
        a0.au auVar = new a0.au(C0366t.bravo);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g0.n(7.41f, 8.59f));
        arrayList.add(new g0.m(12.0f, 13.17f));
        arrayList.add(new g0.u(4.59f, -4.58f));
        arrayList.add(new g0.m(18.0f, 10.0f));
        arrayList.add(new g0.u(-6.0f, 6.0f));
        arrayList.add(new g0.u(-6.0f, -6.0f));
        arrayList.add(new g0.u(1.41f, -1.41f));
        arrayList.add(C1730j.charlie);
        c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, auVar, null, "", arrayList);
        C1726f echo = c1725e.echo();
        alpha = echo;
        Intrinsics.checkNotNull(echo);
        return echo;
    }
}
