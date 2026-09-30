package x2;

/* renamed from: x2.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3290k implements x {
    public final /* synthetic */ Runnable alpha;

    public C3290k(Runnable runnable) {
        this.alpha = runnable;
    }

    @Override // x2.x
    public final void onTransitionCancel(z zVar) {
    }

    @Override // x2.x
    public final void onTransitionEnd(z zVar) {
        this.alpha.run();
    }

    @Override // x2.x
    public final void onTransitionPause(z zVar) {
    }

    @Override // x2.x
    public final void onTransitionResume(z zVar) {
    }

    @Override // x2.x
    public final void onTransitionStart(z zVar) {
        throw null;
    }

    @Override // x2.x
    public final void onTransitionStart(z zVar, boolean z2) {
    }

    @Override // x2.x
    public final void onTransitionEnd(z zVar, boolean z2) {
        onTransitionEnd(zVar);
    }
}
