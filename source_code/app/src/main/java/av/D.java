package av;

/* loaded from: classes3.dex */
public final /* synthetic */ class D implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ S2.l purple;

    public /* synthetic */ D(S2.l lVar, int i4) {
        this.alpha = i4;
        this.purple = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                this.purple.kilo();
                return;
            case 1:
                this.purple.kilo();
                return;
            default:
                S2.l lVar = this.purple;
                if (lVar != null) {
                    lVar.kilo();
                    return;
                }
                return;
        }
    }
}
