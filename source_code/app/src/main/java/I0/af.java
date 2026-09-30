package I0;

import android.view.Choreographer;

/* loaded from: classes3.dex */
public final /* synthetic */ class af implements Choreographer.FrameCallback {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Runnable purple;

    public /* synthetic */ af(Runnable runnable, int i4) {
        this.alpha = i4;
        this.purple = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        switch (this.alpha) {
            case 0:
                this.purple.run();
                return;
            default:
                ((A2.q) this.purple).run();
                return;
        }
    }
}
