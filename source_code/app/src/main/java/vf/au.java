package vf;

/* loaded from: classes2.dex */
public final class au extends av {
    public final d0 red;

    public au(long j5, d0 d0Var) {
        super(j5);
        this.red = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.red.run();
    }

    @Override // vf.av
    public final String toString() {
        return super.toString() + this.red;
    }
}
