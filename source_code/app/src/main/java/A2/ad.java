package A2;

/* loaded from: classes3.dex */
public final class ad extends Zd.a {
    public final Throwable alpha;

    public ad(Throwable th) {
        this.alpha = th;
    }

    public final String toString() {
        return "FAILURE (" + this.alpha.getMessage() + ")";
    }
}
