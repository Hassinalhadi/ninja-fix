package Gc;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ q purple;

    public /* synthetic */ n(q qVar, int i4) {
        this.alpha = i4;
        this.purple = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.purple;
        switch (this.alpha) {
            case 0:
                W8.a aVar = q.A;
                if (qVar.isAdded()) {
                    qVar.victor().onBackPressed();
                    return;
                }
                return;
            default:
                W8.a aVar2 = q.A;
                if (qVar.isAdded()) {
                    qVar.kilo();
                    return;
                }
                return;
        }
    }
}
