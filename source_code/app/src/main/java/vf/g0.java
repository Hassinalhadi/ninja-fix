package vf;

/* loaded from: classes2.dex */
public final class g0 extends AbstractC3220y {
    public static final g0 purple = new AbstractC3220y();

    @Override // vf.AbstractC3220y
    public final void beige(Nd.h hVar, Runnable runnable) {
        k0 k0Var = (k0) hVar.get(k0.purple);
        if (k0Var != null) {
            k0Var.alpha = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // vf.AbstractC3220y
    public final AbstractC3220y jade(int i4) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // vf.AbstractC3220y
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
