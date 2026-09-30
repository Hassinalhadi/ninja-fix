package androidx.camera.camera2.internal.compat;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ p purple;
    public final /* synthetic */ String red;

    public /* synthetic */ o(p pVar, String str, int i4) {
        this.alpha = i4;
        this.purple = pVar;
        this.red = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                this.purple.bravo.onCameraAvailable(this.red);
                return;
            default:
                this.purple.bravo.onCameraUnavailable(this.red);
                return;
        }
    }
}
