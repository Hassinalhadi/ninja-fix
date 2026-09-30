package vf;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class U extends Nd.a implements I {
    public static final U alpha = new Nd.a(H.alpha);

    @Override // vf.I
    public final aq crimson(Function1 function1) {
        return V.alpha;
    }

    @Override // vf.I
    public final boolean echo() {
        return true;
    }

    @Override // vf.I
    public final void foxtrot(CancellationException cancellationException) {
    }

    @Override // vf.I
    public final InterfaceC3210n golf(P p4) {
        return V.alpha;
    }

    @Override // vf.I
    public final Object gray(Pd.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // vf.I
    public final boolean isCancelled() {
        return false;
    }

    @Override // vf.I
    public final aq papa(boolean z2, boolean z10, Function1 function1) {
        return V.alpha;
    }

    @Override // vf.I
    public final CancellationException quebec() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // vf.I
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }
}
