package bj;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ j purple;

    public /* synthetic */ g(j jVar, int i4) {
        this.alpha = i4;
        this.purple = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                this.purple.alpha();
                return;
            case 1:
                this.purple.bravo();
                return;
            default:
                j jVar = this.purple;
                l lVar = jVar.romeo;
                if (lVar != null) {
                    lVar.foxtrot();
                }
                if (jVar.quebec == null) {
                    jVar.papa.charlie();
                    return;
                }
                return;
        }
    }
}
