package androidx.camera.core;

/* loaded from: classes3.dex */
public final /* synthetic */ class E implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ L purple;
    public final /* synthetic */ C0502i red;

    public /* synthetic */ E(L l10, C0502i c0502i, int i4) {
        this.alpha = i4;
        this.purple = l10;
        this.red = c0502i;
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
