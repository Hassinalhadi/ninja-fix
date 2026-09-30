package av;

import android.util.ArrayMap;
import androidx.camera.core.impl.AbstractC0512j;
import androidx.camera.core.impl.C0515m;
import androidx.camera.core.impl.InterfaceC0519q;
import androidx.camera.core.impl.InterfaceC0523v;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class f extends AbstractC0512j {
    public final /* synthetic */ int alpha = 0;
    public Object bravo;
    public Object charlie;

    public /* synthetic */ f() {
    }

    @Override // androidx.camera.core.impl.AbstractC0512j
    public void alpha(int i4) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((HashSet) this.bravo).iterator();
                while (it.hasNext()) {
                    AbstractC0512j abstractC0512j = (AbstractC0512j) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.charlie).get(abstractC0512j)).execute(new Jb.at(abstractC0512j, i4, 2));
                    } catch (RejectedExecutionException e) {
                        AbstractC3066u3.delta("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0512j
    public final void bravo(int i4, InterfaceC0519q interfaceC0519q) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((HashSet) this.bravo).iterator();
                while (it.hasNext()) {
                    AbstractC0512j abstractC0512j = (AbstractC0512j) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.charlie).get(abstractC0512j)).execute(new ae.l(i4, 5, abstractC0512j, interfaceC0519q));
                    } catch (RejectedExecutionException e) {
                        AbstractC3066u3.delta("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                    }
                }
                return;
            default:
                ((V0.h) this.bravo).bravo(null);
                ((InterfaceC0523v) this.charlie).juliet(this);
                return;
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0512j
    public void charlie(int i4, C0515m c0515m) {
        switch (this.alpha) {
            case 0:
                Iterator it = ((HashSet) this.bravo).iterator();
                while (it.hasNext()) {
                    AbstractC0512j abstractC0512j = (AbstractC0512j) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.charlie).get(abstractC0512j)).execute(new ae.l(i4, 4, abstractC0512j, c0515m));
                    } catch (RejectedExecutionException e) {
                        AbstractC3066u3.delta("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                    }
                }
                return;
            default:
                return;
        }
    }

    public f(V0.h hVar, InterfaceC0523v interfaceC0523v) {
        this.bravo = hVar;
        this.charlie = interfaceC0523v;
    }
}
