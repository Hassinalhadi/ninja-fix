package B2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;
import s6.J6;
import vf.C3207k;

/* loaded from: classes3.dex */
public abstract class aq {
    public static final String alpha;

    static {
        String golf = A2.z.golf("WorkerWrapper");
        Intrinsics.delta(golf, "tagWithPrefix(\"WorkerWrapper\")");
        alpha = golf;
    }

    public static final Object alpha(com.google.common.util.concurrent.e eVar, A2.y yVar, Pd.i iVar) {
        try {
            if (eVar.isDone()) {
                return bravo(eVar);
            }
            C3207k c3207k = new C3207k(1, J6.delta(iVar));
            c3207k.tango();
            eVar.foxtrot(new m(eVar, c3207k), A2.m.alpha);
            c3207k.victor(new ap(0, yVar, eVar));
            Object sierra = c3207k.sierra();
            Od.a aVar = Od.a.alpha;
            return sierra;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            Intrinsics.checkNotNull(cause);
            throw cause;
        }
    }

    public static final Object bravo(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
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
        }
        return obj;
    }
}
