package av;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class ac extends CameraDevice.StateCallback {
    public final /* synthetic */ int alpha;
    public final Object bravo;

    public ac(ao aoVar) {
        this.alpha = 1;
        this.bravo = aoVar;
    }

    private final void charlie(CameraDevice cameraDevice) {
    }

    public void alpha() {
        ArrayList xray;
        synchronized (((ao) this.bravo).purple) {
            xray = ((ao) this.bravo).xray();
            ((LinkedHashSet) ((ao) this.bravo).teal).clear();
            ((LinkedHashSet) ((ao) this.bravo).red).clear();
            ((LinkedHashSet) ((ao) this.bravo).silver).clear();
        }
        Iterator it = xray.iterator();
        while (it.hasNext()) {
            aw awVar = (aw) it.next();
            awVar.quebec();
            awVar.uniform.charlie();
        }
    }

    public void bravo() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((ao) this.bravo).purple) {
            linkedHashSet.addAll((LinkedHashSet) ((ao) this.bravo).teal);
            linkedHashSet.addAll((LinkedHashSet) ((ao) this.bravo).red);
        }
        ((bd.h) ((ao) this.bravo).alpha).execute(new androidx.camera.core.impl.ai(6, linkedHashSet));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                return;
            default:
                bravo();
                alpha();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                return;
            default:
                bravo();
                alpha();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i4) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i4);
                }
                return;
            default:
                bravo();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((ao) this.bravo).purple) {
                    linkedHashSet.addAll((LinkedHashSet) ((ao) this.bravo).teal);
                    linkedHashSet.addAll((LinkedHashSet) ((ao) this.bravo).red);
                }
                ((bd.h) ((ao) this.bravo).alpha).execute(new Jb.at(linkedHashSet, i4, 3));
                alpha();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((ArrayList) this.bravo).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                return;
            default:
                return;
        }
    }

    public ac(ArrayList arrayList) {
        this.alpha = 0;
        this.bravo = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof ad)) {
                ((ArrayList) this.bravo).add(stateCallback);
            }
        }
    }
}
