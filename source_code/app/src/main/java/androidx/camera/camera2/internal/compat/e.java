package androidx.camera.camera2.internal.compat;

import a4.u;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.lifecycle.RunnableC0643m;
import av.ag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import t6.AbstractC3003i;

/* loaded from: classes3.dex */
public final class e extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ int alpha;
    public Object bravo;
    public final Object charlie;

    public e(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 3:
                this.charlie = AbstractC3003i.alpha(new u(7, this));
                return;
            default:
                this.bravo = null;
                this.charlie = new HashMap();
                return;
        }
    }

    public void alpha(CaptureRequest captureRequest, List list) {
        HashMap hashMap = (HashMap) this.charlie;
        List list2 = (List) hashMap.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list2.size() + list.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            hashMap.put(captureRequest, arrayList);
            return;
        }
        hashMap.put(captureRequest, list);
    }

    public void bravo() {
        V0.h hVar = (V0.h) this.bravo;
        if (hVar != null) {
            hVar.bravo(null);
            this.bravo = null;
        }
    }

    public List charlie(CaptureRequest captureRequest) {
        List list = (List) ((HashMap) this.charlie).get(captureRequest);
        if (list != null) {
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j5) {
        switch (this.alpha) {
            case 0:
                ((bd.h) this.bravo).execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) e.this.charlie).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j5);
                    }
                });
                return;
            case 1:
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j5);
                return;
            case 2:
                Iterator it = charlie(captureRequest).iterator();
                while (it.hasNext()) {
                    CameraCaptureSession cameraCaptureSession2 = cameraCaptureSession;
                    CaptureRequest captureRequest2 = captureRequest;
                    Surface surface2 = surface;
                    long j6 = j5;
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession2, captureRequest2, surface2, j6);
                    cameraCaptureSession = cameraCaptureSession2;
                    captureRequest = captureRequest2;
                    surface = surface2;
                    j5 = j6;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.alpha) {
            case 0:
                ((bd.h) this.bravo).execute(new B2.j(this, cameraCaptureSession, captureRequest, totalCaptureResult, 3));
                return;
            case 1:
                ((bd.h) this.bravo).execute(new RunnableC0643m(3, this, totalCaptureResult));
                return;
            case 2:
                Iterator it = charlie(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            default:
                bravo();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.alpha) {
            case 0:
                ((bd.h) this.bravo).execute(new B2.j(this, cameraCaptureSession, captureRequest, captureFailure, 5));
                return;
            case 1:
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                return;
            case 2:
                Iterator it = charlie(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                return;
            case 3:
                bravo();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.alpha) {
            case 0:
                ((bd.h) this.bravo).execute(new B2.j(this, cameraCaptureSession, captureRequest, captureResult, 4));
                return;
            case 1:
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
            case 2:
                Iterator it = charlie(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i4) {
        switch (this.alpha) {
            case 0:
                ((bd.h) this.bravo).execute(new ae.l(this, cameraCaptureSession, i4, 2));
                return;
            case 1:
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i4);
                return;
            case 2:
                Iterator it = ((HashMap) this.charlie).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceAborted(cameraCaptureSession, i4);
                    }
                }
                ag agVar = (ag) this.bravo;
                if (agVar != null) {
                    agVar.alpha();
                    return;
                }
                return;
            case 3:
                bravo();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i4, final long j5) {
        switch (this.alpha) {
            case 0:
                ((bd.h) this.bravo).execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) e.this.charlie).onCaptureSequenceCompleted(cameraCaptureSession, i4, j5);
                    }
                });
                return;
            case 1:
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i4, j5);
                return;
            case 2:
                Iterator it = ((HashMap) this.charlie).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceCompleted(cameraCaptureSession, i4, j5);
                    }
                }
                ag agVar = (ag) this.bravo;
                if (agVar != null) {
                    agVar.alpha();
                    return;
                }
                return;
            case 3:
                bravo();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j5, final long j6) {
        switch (this.alpha) {
            case 0:
                ((bd.h) this.bravo).execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) e.this.charlie).onCaptureStarted(cameraCaptureSession, captureRequest, j5, j6);
                    }
                });
                return;
            case 1:
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j5, j6);
                return;
            case 2:
                Iterator it = charlie(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j5, j6);
                }
                return;
            case 3:
                bravo();
                return;
        }
    }

    public e(bd.h hVar, CameraCaptureSession.CaptureCallback captureCallback) {
        this.alpha = 0;
        this.bravo = hVar;
        this.charlie = captureCallback;
    }

    public e(bd.h hVar) {
        this.alpha = 1;
        this.charlie = new HashSet();
        this.bravo = hVar;
    }
}
