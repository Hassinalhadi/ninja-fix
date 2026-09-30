package b;

import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class Q {
    public final AtomicReference alpha = new AtomicReference(null);
    public final Ef.c bravo = Ef.d.alpha();

    public static final void alpha(Q q4, N n5) {
        while (true) {
            AtomicReference atomicReference = q4.alpha;
            N n10 = (N) atomicReference.get();
            if (n10 != null && n5.alpha.compareTo(n10.alpha) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(n10, n5)) {
                if (atomicReference.get() != n10) {
                    break;
                }
            }
            if (n10 != null) {
                n10.bravo.foxtrot(new MutationInterruptedException());
                return;
            }
            return;
        }
    }

    public static Object bravo(Q q4, Function1 function1, Nd.c cVar) {
        M m4 = M.alpha;
        q4.getClass();
        return vf.ad.mike(new O(q4, function1, null), cVar);
    }
}
