package O7;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ r purple;
    public final /* synthetic */ D5.s red;

    public /* synthetic */ o(r rVar, D5.s sVar, int i4) {
        this.alpha = i4;
        this.purple = rVar;
        this.red = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                this.purple.alpha(this.red);
                return;
            default:
                this.purple.alpha(this.red);
                return;
        }
    }
}
