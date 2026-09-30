package t0;

import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ax implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ ay alpha;

    public ax(ay ayVar) {
        this.alpha = ayVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        this.alpha.red.removeCallbacks(this);
        ay.magenta(this.alpha);
        ay ayVar = this.alpha;
        synchronized (ayVar.silver) {
            if (!ayVar.f13830b) {
                return;
            }
            ayVar.f13830b = false;
            ArrayList arrayList = ayVar.white;
            ayVar.white = ayVar.yellow;
            ayVar.yellow = arrayList;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((Choreographer.FrameCallback) arrayList.get(i4)).doFrame(j5);
            }
            arrayList.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ay.magenta(this.alpha);
        ay ayVar = this.alpha;
        synchronized (ayVar.silver) {
            if (ayVar.white.isEmpty()) {
                ayVar.purple.removeFrameCallback(this);
                ayVar.f13830b = false;
            }
        }
    }
}
