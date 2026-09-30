package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ l purple;
    public final /* synthetic */ CameraDevice red;

    public /* synthetic */ k(l lVar, CameraDevice cameraDevice, int i4) {
        this.alpha = i4;
        this.purple = lVar;
        this.red = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                ((CameraDevice.StateCallback) this.purple.bravo).onClosed(this.red);
                return;
            case 1:
                ((CameraDevice.StateCallback) this.purple.bravo).onDisconnected(this.red);
                return;
            default:
                ((CameraDevice.StateCallback) this.purple.bravo).onOpened(this.red);
                return;
        }
    }
}
