package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraManager;

/* loaded from: classes3.dex */
public final class p extends CameraManager.AvailabilityCallback {
    public final bd.h alpha;
    public final av.o bravo;
    public final Object charlie = new Object();
    public boolean delta = false;

    public p(bd.h hVar, av.o oVar) {
        this.alpha = hVar;
        this.bravo = oVar;
    }

    public final void alpha() {
        synchronized (this.charlie) {
            this.delta = true;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.charlie) {
            try {
                if (!this.delta) {
                    this.alpha.execute(new A2.q(25, this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.charlie) {
            try {
                if (!this.delta) {
                    this.alpha.execute(new o(this, str, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.charlie) {
            try {
                if (!this.delta) {
                    this.alpha.execute(new o(this, str, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
