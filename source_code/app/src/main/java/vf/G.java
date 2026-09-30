package vf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class G extends K {
    public static final /* synthetic */ AtomicIntegerFieldUpdater white = AtomicIntegerFieldUpdater.newUpdater(G.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final Function1 teal;

    public G(Function1 function1) {
        this.teal = function1;
    }

    @Override // vf.K
    public final boolean juliet() {
        return true;
    }

    @Override // vf.K
    public final void kilo(Throwable th) {
        if (white.compareAndSet(this, 0, 1)) {
            this.teal.invoke(th);
        }
    }
}
