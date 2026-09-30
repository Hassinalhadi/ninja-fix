package androidx.camera.core;

import s6.T7;

/* loaded from: classes3.dex */
public final class B {
    public static final B delta = new B(0, false, false);
    public static final B echo = new B(500, true, false);
    public static final B foxtrot;
    public final long alpha;
    public final boolean bravo;
    public final boolean charlie;

    static {
        new B(100L, true, false);
        foxtrot = new B(0L, false, true);
    }

    public B(long j5, boolean z2, boolean z10) {
        this.bravo = z2;
        this.alpha = j5;
        if (z10) {
            T7.bravo("shouldRetry must be false when completeWithoutFailure is set to true", !z2);
        }
        this.charlie = z10;
    }
}
