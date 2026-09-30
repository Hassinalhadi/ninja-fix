package io.reactivex.internal.schedulers;

import androidx.appcompat.widget.P0;
import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final boolean nonBlocking;
    final String prefix;
    final int priority;

    /* loaded from: classes2.dex */
    public static final class RxCustomThread extends Thread implements NonBlockingThread {
        public RxCustomThread(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread;
        String str = this.prefix + NumberOnlyZipVisualTransformation.HYPHEN + incrementAndGet();
        if (this.nonBlocking) {
            thread = new RxCustomThread(runnable, str);
        } else {
            thread = new Thread(runnable, str);
        }
        thread.setPriority(this.priority);
        thread.setDaemon(true);
        return thread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return P0.gold(new StringBuilder("RxThreadFactory["), this.prefix, Constants.AES_SUFFIX);
    }

    public RxThreadFactory(String str, int i4) {
        this(str, i4, false);
    }

    public RxThreadFactory(String str, int i4, boolean z2) {
        this.prefix = str;
        this.priority = i4;
        this.nonBlocking = z2;
    }
}
