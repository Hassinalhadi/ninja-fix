package av;

import android.hardware.camera2.CameraManager;

/* loaded from: classes3.dex */
public final class o extends CameraManager.AvailabilityCallback {
    public final String alpha;
    public boolean bravo = true;
    public final /* synthetic */ s charlie;

    public o(s sVar, String str) {
        this.charlie = sVar;
        this.alpha = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (this.alpha.equals(str)) {
            this.bravo = true;
            if (this.charlie.A == 4) {
                this.charlie.fuchsia(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (!this.alpha.equals(str)) {
            return;
        }
        this.bravo = false;
    }
}
