package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public final /* synthetic */ class W0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Toolbar purple;

    public /* synthetic */ W0(Toolbar toolbar, int i4) {
        this.alpha = i4;
        this.purple = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ao.n nVar;
        switch (this.alpha) {
            case 0:
                Z0 z02 = this.purple.f2827F;
                if (z02 == null) {
                    nVar = null;
                } else {
                    nVar = z02.purple;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.purple.mike();
                return;
        }
    }
}
