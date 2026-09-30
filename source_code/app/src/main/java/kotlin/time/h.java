package kotlin.time;

/* loaded from: classes2.dex */
public final class h implements i {
    public final long alpha;
    public final int purple;

    public h(long j5, int i4) {
        this.alpha = j5;
        this.purple = i4;
    }

    @Override // kotlin.time.i
    public final e alpha() {
        long j5 = e.red.alpha;
        long j6 = this.alpha;
        if (j6 >= j5 && j6 <= e.silver.alpha) {
            return g.india(this.purple, j6);
        }
        return null;
    }
}
