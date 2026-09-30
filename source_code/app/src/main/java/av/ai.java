package av;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class ai extends as {
    public final /* synthetic */ int alpha;
    public final Object bravo;

    public ai(int i4, List list) {
        Object aaVar;
        this.alpha = i4;
        switch (i4) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.bravo = arrayList;
                arrayList.addAll(list);
                return;
            default:
                if (list.isEmpty()) {
                    aaVar = new CameraCaptureSession.StateCallback();
                } else if (list.size() == 1) {
                    aaVar = (CameraCaptureSession.StateCallback) list.get(0);
                } else {
                    aaVar = new aa(list);
                }
                this.bravo = aaVar;
                return;
        }
    }

    private final void india(aw awVar) {
    }

    @Override // av.as
    public void alpha(aw awVar) {
        switch (this.alpha) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.bravo).onActive((CameraCaptureSession) ((J2.l) awVar.whiskey().purple).alpha);
                return;
            case 2:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((as) it.next()).alpha(awVar);
                }
                return;
            default:
                return;
        }
    }

    @Override // av.as
    public void bravo(aw awVar) {
        switch (this.alpha) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.bravo).onCaptureQueueEmpty((CameraCaptureSession) ((J2.l) awVar.whiskey().purple).alpha);
                return;
            case 2:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((as) it.next()).bravo(awVar);
                }
                return;
            default:
                return;
        }
    }

    @Override // av.as
    public void charlie(aw awVar) {
        switch (this.alpha) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.bravo).onClosed((CameraCaptureSession) ((J2.l) awVar.whiskey().purple).alpha);
                return;
            case 2:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((as) it.next()).charlie(awVar);
                }
                return;
            default:
                return;
        }
    }

    @Override // av.as
    public final void delta(aw awVar) {
        switch (this.alpha) {
            case 0:
                synchronized (((aj) this.bravo).alpha) {
                    try {
                        switch (q.mike(((aj) this.bravo).india)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: ".concat(q.oscar(((aj) this.bravo).india)));
                            case 3:
                            case 5:
                            case 6:
                                ((aj) this.bravo).delta();
                                break;
                            case 7:
                                AbstractC3066u3.bravo("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                                break;
                        }
                        AbstractC3066u3.charlie("CaptureSession", "CameraCaptureSession.onConfigureFailed() ".concat(q.oscar(((aj) this.bravo).india)));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.bravo).onConfigureFailed((CameraCaptureSession) ((J2.l) awVar.whiskey().purple).alpha);
                return;
            default:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((as) it.next()).delta(awVar);
                }
                return;
        }
    }

    @Override // av.as
    public final void echo(aw awVar) {
        switch (this.alpha) {
            case 0:
                synchronized (((aj) this.bravo).alpha) {
                    try {
                        switch (q.mike(((aj) this.bravo).india)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: ".concat(q.oscar(((aj) this.bravo).india)));
                            case 3:
                                aj ajVar = (aj) this.bravo;
                                ajVar.india = 5;
                                ajVar.echo = awVar;
                                AbstractC3066u3.bravo("CaptureSession", "Attempting to send capture request onConfigured");
                                aj ajVar2 = (aj) this.bravo;
                                ajVar2.lima(ajVar2.foxtrot);
                                aj ajVar3 = (aj) this.bravo;
                                ajVar3.oscar.bravo().foxtrot(new androidx.camera.core.impl.ai(5, ajVar3), tg.k.bravo());
                                break;
                            case 5:
                                ((aj) this.bravo).echo = awVar;
                                break;
                            case 6:
                                awVar.juliet();
                                break;
                        }
                        AbstractC3066u3.bravo("CaptureSession", "CameraCaptureSession.onConfigured() mState=".concat(q.oscar(((aj) this.bravo).india)));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.bravo).onConfigured((CameraCaptureSession) ((J2.l) awVar.whiskey().purple).alpha);
                return;
            default:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((as) it.next()).echo(awVar);
                }
                return;
        }
    }

    @Override // av.as
    public final void foxtrot(aw awVar) {
        switch (this.alpha) {
            case 0:
                synchronized (((aj) this.bravo).alpha) {
                    try {
                        if (q.mike(((aj) this.bravo).india) != 0) {
                            AbstractC3066u3.bravo("CaptureSession", "CameraCaptureSession.onReady() ".concat(q.oscar(((aj) this.bravo).india)));
                        } else {
                            throw new IllegalStateException("onReady() should not be possible in state: ".concat(q.oscar(((aj) this.bravo).india)));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.bravo).onReady((CameraCaptureSession) ((J2.l) awVar.whiskey().purple).alpha);
                return;
            default:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((as) it.next()).foxtrot(awVar);
                }
                return;
        }
    }

    @Override // av.as
    public final void golf(aw awVar) {
        switch (this.alpha) {
            case 0:
                synchronized (((aj) this.bravo).alpha) {
                    try {
                        if (((aj) this.bravo).india != 1) {
                            AbstractC3066u3.bravo("CaptureSession", "onSessionFinished()");
                            ((aj) this.bravo).delta();
                        } else {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: ".concat(q.oscar(((aj) this.bravo).india)));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((as) it.next()).golf(awVar);
                }
                return;
        }
    }

    @Override // av.as
    public void hotel(aw awVar, Surface surface) {
        switch (this.alpha) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.bravo).onSurfacePrepared((CameraCaptureSession) ((J2.l) awVar.whiskey().purple).alpha, surface);
                return;
            case 2:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((as) it.next()).hotel(awVar, surface);
                }
                return;
            default:
                return;
        }
    }

    public ai(aj ajVar) {
        this.alpha = 0;
        this.bravo = ajVar;
    }
}
