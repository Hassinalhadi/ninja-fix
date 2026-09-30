package D2;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ g purple;

    public /* synthetic */ f(g gVar, int i4) {
        this.alpha = i4;
        this.purple = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                g.alpha(this.purple);
                return;
            default:
                g.bravo(this.purple);
                return;
        }
    }
}
