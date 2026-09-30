package J7;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class a implements ThreadFactory {
    public static final ThreadFactory teal = Executors.defaultThreadFactory();
    public final AtomicLong alpha = new AtomicLong();
    public final String purple;
    public final int red;
    public final StrictMode.ThreadPolicy silver;

    public a(String str, int i4, StrictMode.ThreadPolicy threadPolicy) {
        this.purple = str;
        this.red = i4;
        this.silver = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = teal.newThread(new A8.g(7, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.purple + " Thread #" + this.alpha.getAndIncrement());
        return newThread;
    }
}
