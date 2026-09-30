package s6;

/* loaded from: classes2.dex */
public final class aq {
    public static final aq charlie;
    public static final aq delta;
    public final boolean alpha;
    public final RuntimeException bravo;

    static {
        if (A.silver) {
            delta = null;
            charlie = null;
        } else {
            delta = new aq(false, null);
            charlie = new aq(true, null);
        }
    }

    public aq(boolean z2, RuntimeException runtimeException) {
        this.alpha = z2;
        this.bravo = runtimeException;
    }
}
