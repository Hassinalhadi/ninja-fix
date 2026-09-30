package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ g purple;
    public final /* synthetic */ CameraCaptureSession red;

    public /* synthetic */ f(g gVar, CameraCaptureSession cameraCaptureSession, int i4) {
        this.alpha = i4;
        this.purple = gVar;
        this.red = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                this.purple.alpha.onActive(this.red);
                return;
            case 1:
                this.purple.alpha.onClosed(this.red);
                return;
            case 2:
                this.purple.alpha.onCaptureQueueEmpty(this.red);
                return;
            case 3:
                this.purple.alpha.onConfigured(this.red);
                return;
            case 4:
                this.purple.alpha.onReady(this.red);
                return;
            default:
                this.purple.alpha.onConfigureFailed(this.red);
                return;
        }
    }
}
