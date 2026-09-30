package androidx.fragment.app;

/* renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0630z implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ai purple;

    public /* synthetic */ RunnableC0630z(ai aiVar, int i4) {
        this.alpha = i4;
        this.purple = aiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                this.purple.startPostponedEnterTransition();
                return;
            default:
                this.purple.callStartTransitionListener(false);
                return;
        }
    }
}
