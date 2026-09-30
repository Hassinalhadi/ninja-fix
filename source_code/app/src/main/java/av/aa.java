package av;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s6.T7;

/* loaded from: classes3.dex */
public final class aa extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ int alpha;
    public final Object bravo;

    public /* synthetic */ aa(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    private final void alpha(CameraCaptureSession cameraCaptureSession) {
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                return;
            case 1:
                aw awVar = (aw) this.bravo;
                awVar.kilo(cameraCaptureSession);
                awVar.alpha(awVar);
                return;
            default:
                super.onActive(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
                return;
            case 1:
                aw awVar = (aw) this.bravo;
                awVar.kilo(cameraCaptureSession);
                awVar.bravo(awVar);
                return;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                return;
            case 1:
                aw awVar = (aw) this.bravo;
                awVar.kilo(cameraCaptureSession);
                awVar.charlie(awVar);
                return;
            default:
                super.onClosed(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        V0.h hVar;
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((aw) this.bravo).kilo(cameraCaptureSession);
                    aw awVar = (aw) this.bravo;
                    awVar.delta(awVar);
                    synchronized (((aw) this.bravo).alpha) {
                        T7.foxtrot(((aw) this.bravo).india, "OpenCaptureSession completer should not null");
                        aw awVar2 = (aw) this.bravo;
                        hVar = awVar2.india;
                        awVar2.india = null;
                    }
                    hVar.delta(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th) {
                    synchronized (((aw) this.bravo).alpha) {
                        T7.foxtrot(((aw) this.bravo).india, "OpenCaptureSession completer should not null");
                        aw awVar3 = (aw) this.bravo;
                        V0.h hVar2 = awVar3.india;
                        awVar3.india = null;
                        hVar2.delta(new IllegalStateException("onConfigureFailed"));
                        throw th;
                    }
                }
            default:
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        V0.h hVar;
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((aw) this.bravo).kilo(cameraCaptureSession);
                    aw awVar = (aw) this.bravo;
                    awVar.echo(awVar);
                    synchronized (((aw) this.bravo).alpha) {
                        T7.foxtrot(((aw) this.bravo).india, "OpenCaptureSession completer should not null");
                        aw awVar2 = (aw) this.bravo;
                        hVar = awVar2.india;
                        awVar2.india = null;
                    }
                    hVar.bravo(null);
                    return;
                } catch (Throwable th) {
                    synchronized (((aw) this.bravo).alpha) {
                        T7.foxtrot(((aw) this.bravo).india, "OpenCaptureSession completer should not null");
                        aw awVar3 = (aw) this.bravo;
                        V0.h hVar2 = awVar3.india;
                        awVar3.india = null;
                        hVar2.bravo(null);
                        throw th;
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ((E) this.bravo).india = ImageWriter.newInstance(inputSurface, 1);
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                return;
            case 1:
                aw awVar = (aw) this.bravo;
                awVar.kilo(cameraCaptureSession);
                awVar.foxtrot(awVar);
                return;
            default:
                super.onReady(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                return;
            case 1:
                aw awVar = (aw) this.bravo;
                awVar.kilo(cameraCaptureSession);
                awVar.hotel(awVar, surface);
                return;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                return;
        }
    }

    public aa(List list) {
        this.alpha = 0;
        this.bravo = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof ab)) {
                ((ArrayList) this.bravo).add(stateCallback);
            }
        }
    }
}
