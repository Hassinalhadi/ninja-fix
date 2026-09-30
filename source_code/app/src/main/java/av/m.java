package av;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.lifecycle.RunnableC0643m;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import t6.K3;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements V0.i {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ s purple;

    public /* synthetic */ m(s sVar, int i4) {
        this.alpha = i4;
        this.purple = sVar;
    }

    @Override // V0.i
    public Object black(V0.h hVar) {
        switch (this.alpha) {
            case 0:
                s sVar = this.purple;
                sVar.getClass();
                try {
                    ArrayList arrayList = new ArrayList(sVar.alpha.papa().bravo().charlie);
                    arrayList.add((ac) sVar.f3275q.white);
                    arrayList.add(new androidx.camera.camera2.internal.compat.l(sVar, hVar));
                    sVar.purple.alpha.G(sVar.f3261b.alpha, sVar.red, K3.alpha(arrayList));
                    return "configAndCloseTask";
                } catch (CameraAccessExceptionCompat | SecurityException e) {
                    sVar.uniform("Unable to open camera for configAndClose: " + e.getMessage(), e);
                    hVar.delta(e);
                    return "configAndCloseTask";
                }
            default:
                s sVar2 = this.purple;
                sVar2.getClass();
                try {
                    sVar2.red.execute(new RunnableC0643m(6, sVar2, hVar));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    hVar.delta(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
        }
    }
}
