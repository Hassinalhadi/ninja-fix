package M1;

/* loaded from: classes3.dex */
public final class e {
    public final long alpha;
    public final long bravo;

    public e(long j5, long j6) {
        if (j6 == 0) {
            this.alpha = 0L;
            this.bravo = 1L;
        } else {
            this.alpha = j5;
            this.bravo = j6;
        }
    }

    public final String toString() {
        return this.alpha + "/" + this.bravo;
    }
}
