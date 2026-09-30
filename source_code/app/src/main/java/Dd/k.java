package Dd;

/* loaded from: classes2.dex */
public final class k implements Pd.d, Nd.c {
    public static final k alpha = new Object();

    @Override // Pd.d
    public final Pd.d getCallerFrame() {
        return null;
    }

    @Override // Nd.c
    public final Nd.h getContext() {
        return Nd.i.alpha;
    }

    @Override // Nd.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
