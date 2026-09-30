package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class g extends CameraCaptureSession.StateCallback {
    public final CameraCaptureSession.StateCallback alpha;
    public final Executor bravo;

    public g(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.bravo = executor;
        this.alpha = stateCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.bravo.execute(new f(this, cameraCaptureSession, 0));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        this.bravo.execute(new f(this, cameraCaptureSession, 2));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.bravo.execute(new f(this, cameraCaptureSession, 1));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.bravo.execute(new f(this, cameraCaptureSession, 5));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.bravo.execute(new f(this, cameraCaptureSession, 3));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.bravo.execute(new f(this, cameraCaptureSession, 4));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.bravo.execute(new A2.s(this, cameraCaptureSession, surface, 12));
    }
}
