package z1;

import android.view.Choreographer;

/* loaded from: classes3.dex */
public final class f implements Choreographer.FrameCallback {
    public final /* synthetic */ g alpha;

    public f(g gVar) {
        this.alpha = gVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        this.alpha.alpha.run();
    }
}
