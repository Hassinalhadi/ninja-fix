package Cf;

import Af.u;
import java.util.concurrent.Executor;
import vf.AbstractC3220y;
import vf.az;

/* loaded from: classes2.dex */
public final class d extends az implements Executor {
    public static final d purple = new AbstractC3220y();
    public static final AbstractC3220y red;

    /* JADX WARN: Type inference failed for: r0v0, types: [Cf.d, vf.y] */
    static {
        l lVar = l.purple;
        int i4 = u.alpha;
        if (64 >= i4) {
            i4 = 64;
        }
        red = lVar.jade(Af.f.kilo(i4, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // vf.AbstractC3220y
    public final void beige(Nd.h hVar, Runnable runnable) {
        red.beige(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        beige(Nd.i.alpha, runnable);
    }

    @Override // vf.AbstractC3220y
    public final void green(Nd.h hVar, Runnable runnable) {
        red.green(hVar, runnable);
    }

    @Override // vf.AbstractC3220y
    public final AbstractC3220y jade(int i4) {
        return l.purple.jade(i4);
    }

    @Override // vf.AbstractC3220y
    public final String toString() {
        return "Dispatchers.IO";
    }
}
