package androidx.lifecycle;

/* loaded from: classes3.dex */
public final class aq implements Runnable {
    public final /* synthetic */ au alpha;

    public aq(au auVar) {
        this.alpha = auVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.alpha.mDataLock) {
            obj = this.alpha.mPendingData;
            this.alpha.mPendingData = au.NOT_SET;
        }
        this.alpha.setValue(obj);
    }
}
