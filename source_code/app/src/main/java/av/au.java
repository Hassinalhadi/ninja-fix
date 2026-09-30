package av;

import android.hardware.camera2.CameraCaptureSession;
import java.util.LinkedHashSet;
import s6.T7;

/* loaded from: classes3.dex */
public final /* synthetic */ class au implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ aw purple;

    public /* synthetic */ au(aw awVar, int i4) {
        this.alpha = i4;
        this.purple = awVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                aw awVar = this.purple;
                awVar.golf(awVar);
                return;
            default:
                aw awVar2 = this.purple;
                awVar2.lima("Session call super.close()");
                T7.foxtrot(awVar2.golf, "Need to call openCaptureSession before using this API.");
                ao aoVar = awVar2.bravo;
                synchronized (aoVar.purple) {
                    ((LinkedHashSet) aoVar.silver).add(awVar2);
                }
                ((CameraCaptureSession) ((J2.l) awVar2.golf.purple).alpha).close();
                awVar2.delta.execute(new au(awVar2, 0));
                return;
        }
    }
}
