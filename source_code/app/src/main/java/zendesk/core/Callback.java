package zendesk.core;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import wf.RunnableC3267d;

/* loaded from: classes.dex */
public abstract class Callback<E> {
    private final AtomicBoolean canceled = new AtomicBoolean(false);

    public void cancel() {
        this.canceled.set(true);
    }

    public void internalSuccess(E e) {
        if (!this.canceled.get()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC3267d(2, this, e));
        }
    }

    /* renamed from: success, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$internalSuccess$0(E e);
}
