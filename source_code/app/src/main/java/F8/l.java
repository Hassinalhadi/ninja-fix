package F8;

/* loaded from: classes2.dex */
public final class l {
    public final /* synthetic */ m alpha;

    public l(m mVar) {
        this.alpha = mVar;
    }

    public final void alpha() {
        m mVar = this.alpha;
        synchronized (mVar) {
            mVar.delta = true;
        }
        this.alpha.golf();
    }
}
