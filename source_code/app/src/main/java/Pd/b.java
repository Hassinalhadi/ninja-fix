package Pd;

/* loaded from: classes2.dex */
public final class b implements Nd.c {
    public static final b alpha = new Object();

    @Override // Nd.c
    public final Nd.h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // Nd.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
