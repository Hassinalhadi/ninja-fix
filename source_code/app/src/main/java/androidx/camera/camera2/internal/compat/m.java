package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import aw.u;
import aw.v;
import java.util.List;

/* loaded from: classes3.dex */
public class m extends w.o {
    @Override // w.o
    public void romeo(v vVar) {
        CameraDevice cameraDevice = (CameraDevice) this.purple;
        w.o.quebec(cameraDevice, vVar);
        u uVar = vVar.alpha;
        g gVar = new g(uVar.charlie(), uVar.echo());
        List foxtrot = uVar.foxtrot();
        B2.b bVar = (B2.b) this.red;
        bVar.getClass();
        aw.h bravo = uVar.bravo();
        Handler handler = bVar.alpha;
        try {
            if (bravo != null) {
                InputConfiguration inputConfiguration = bravo.alpha.alpha;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, v.alpha(foxtrot), gVar, handler);
            } else if (uVar.delta() == 1) {
                cameraDevice.createConstrainedHighSpeedCaptureSession(w.o.amber(foxtrot), gVar, handler);
            } else {
                cameraDevice.createCaptureSessionByOutputConfigurations(v.alpha(foxtrot), gVar, handler);
            }
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}
