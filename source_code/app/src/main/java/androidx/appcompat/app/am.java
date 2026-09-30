package androidx.appcompat.app;

/* loaded from: classes3.dex */
public final class am {
    public boolean alpha;
    public long bravo;

    public long alpha() {
        if (this.alpha) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.bravo - System.nanoTime());
    }
}
