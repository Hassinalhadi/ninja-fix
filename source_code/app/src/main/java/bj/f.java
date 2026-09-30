package bj;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ k purple;

    public /* synthetic */ f(k kVar, int i4) {
        this.alpha = i4;
        this.purple = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                k kVar = this.purple;
                kVar.getClass();
                tg.k.echo().execute(new f(kVar, 1));
                return;
            default:
                k kVar2 = this.purple;
                if (!kVar2.november) {
                    kVar2.delta();
                    return;
                }
                return;
        }
    }
}
