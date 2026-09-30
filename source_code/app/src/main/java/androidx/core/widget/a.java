package androidx.core.widget;

/* loaded from: classes3.dex */
public final class a {
    public int alpha;
    public int bravo;
    public float charlie;
    public float delta;
    public long echo;
    public long foxtrot;
    public long golf;
    public float hotel;
    public int india;

    public final float alpha(long j5) {
        long j6 = this.echo;
        if (j5 < j6) {
            return 0.0f;
        }
        long j7 = this.golf;
        if (j7 >= 0 && j5 >= j7) {
            float f5 = this.hotel;
            return (d.bravo(((float) (j5 - j7)) / this.india, 0.0f, 1.0f) * f5) + (1.0f - f5);
        }
        return d.bravo(((float) (j5 - j6)) / this.alpha, 0.0f, 1.0f) * 0.5f;
    }
}
