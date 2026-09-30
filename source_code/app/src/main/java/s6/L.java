package s6;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class L extends A implements RunnableFuture, aw {

    /* renamed from: a, reason: collision with root package name */
    public volatile K f13694a;

    @Override // s6.A
    public final String alpha() {
        K k6 = this.f13694a;
        if (k6 != null) {
            return ao.ad.gray("task=[", k6.toString(), Constants.AES_SUFFIX);
        }
        return super.alpha();
    }

    @Override // s6.A
    public final void bravo() {
        K k6;
        Object obj = this.alpha;
        if ((obj instanceof aq) && ((aq) obj).alpha && (k6 = this.f13694a) != null) {
            H h4 = K.silver;
            H h10 = K.red;
            Runnable runnable = (Runnable) k6.get();
            if (runnable instanceof Thread) {
                G g2 = new G(k6);
                g2.setExclusiveOwnerThread(Thread.currentThread());
                if (k6.compareAndSet(runnable, g2)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) k6.getAndSet(h10)) == h4) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) k6.getAndSet(h10)) == h4) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.f13694a = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        K k6 = this.f13694a;
        if (k6 != null) {
            k6.run();
        }
        this.f13694a = null;
    }
}
