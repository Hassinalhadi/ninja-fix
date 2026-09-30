package V0;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class a {
    public static final a charlie;
    public static final a delta;
    public final boolean alpha;
    public final CancellationException bravo;

    static {
        if (g.silver) {
            delta = null;
            charlie = null;
        } else {
            delta = new a(false, null);
            charlie = new a(true, null);
        }
    }

    public a(boolean z2, CancellationException cancellationException) {
        this.alpha = z2;
        this.bravo = cancellationException;
    }
}
