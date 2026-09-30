package av;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC0512j;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.V;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import s6.T7;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class v extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ int alpha;
    public final Object bravo;

    public v(AbstractC0512j abstractC0512j) {
        this.alpha = 1;
        if (abstractC0512j != null) {
            this.bravo = abstractC0512j;
            return;
        }
        throw new NullPointerException("cameraCaptureCallback is null");
    }

    public static int alpha(CaptureRequest captureRequest) {
        Integer num;
        if (!(captureRequest.getTag() instanceof V) || (num = (Integer) ((V) captureRequest.getTag()).alpha.get("CAPTURE_CONFIG_ID_KEY")) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j5) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    CaptureRequest captureRequest2 = captureRequest;
                    Surface surface2 = surface;
                    long j6 = j5;
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest2, surface2, j6);
                    captureRequest = captureRequest2;
                    surface = surface2;
                    j5 = j6;
                }
                return;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j5);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        V v4;
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            case 1:
                super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                Object tag = captureRequest.getTag();
                if (tag != null) {
                    T7.bravo("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof V);
                    v4 = (V) tag;
                } else {
                    v4 = V.bravo;
                }
                ((AbstractC0512j) this.bravo).bravo(alpha(captureRequest), new J2.e(23, v4, totalCaptureResult));
                return;
            default:
                synchronized (((aj) this.bravo).alpha) {
                    try {
                        P p4 = ((aj) this.bravo).foxtrot;
                        if (p4 != null) {
                            androidx.camera.core.impl.ad adVar = p4.golf;
                            AbstractC3066u3.bravo("CaptureSession", "Submit FLASH_MODE_OFF request");
                            aj ajVar = (aj) this.bravo;
                            ajVar.november.getClass();
                            ajVar.kilo(Collections.singletonList(a3.l.charlie(adVar)));
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.camera.core.impl.m, java.lang.Object] */
    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                return;
            case 1:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                ((AbstractC0512j) this.bravo).charlie(alpha(captureRequest), new Object());
                return;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                return;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i4) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceAborted(cameraCaptureSession, i4);
                }
                return;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i4);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i4, long j5) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceCompleted(cameraCaptureSession, i4, j5);
                }
                return;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i4, j5);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j5, long j6) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j5, j6);
                }
                return;
            case 1:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j5, j6);
                ((AbstractC0512j) this.bravo).delta(alpha(captureRequest));
                return;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j5, j6);
                return;
        }
    }

    public v(List list) {
        this.alpha = 0;
        this.bravo = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) it.next();
            if (!(captureCallback instanceof w)) {
                ((ArrayList) this.bravo).add(captureCallback);
            }
        }
    }

    public v(aj ajVar) {
        this.alpha = 2;
        this.bravo = ajVar;
    }
}
