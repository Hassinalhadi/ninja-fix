package au;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.C0505c;
import av.ah;

/* loaded from: classes3.dex */
public final class a extends ah {

    /* renamed from: a, reason: collision with root package name */
    public static final C0505c f3240a = new C0505c("camera2.captureRequest.templateType", Integer.TYPE, null);

    /* renamed from: b, reason: collision with root package name */
    public static final C0505c f3241b = new C0505c("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);

    /* renamed from: c, reason: collision with root package name */
    public static final C0505c f3242c = new C0505c("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);

    /* renamed from: d, reason: collision with root package name */
    public static final C0505c f3243d = new C0505c("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
    public static final C0505c e = new C0505c("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);

    /* renamed from: f, reason: collision with root package name */
    public static final C0505c f3244f = new C0505c("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

    public static C0505c yellow(CaptureRequest.Key key) {
        return new C0505c("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
