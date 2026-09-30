package Z3;

/* loaded from: classes3.dex */
public final class e {
    public volatile boolean alpha;

    public final void alpha() {
        if (!this.alpha) {
        } else {
            throw new IllegalStateException("Already released");
        }
    }
}
