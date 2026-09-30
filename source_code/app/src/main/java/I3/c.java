package I3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class c implements ThreadFactory {
    public final b alpha;
    public final String purple;
    public final d red;
    public final boolean silver;
    public final AtomicInteger teal;

    public c(b bVar, String str, boolean z2) {
        d dVar = d.alpha;
        this.teal = new AtomicInteger();
        this.alpha = bVar;
        this.purple = str;
        this.red = dVar;
        this.silver = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        com.google.common.util.concurrent.d dVar = new com.google.common.util.concurrent.d(4, this, runnable, false);
        this.alpha.getClass();
        a aVar = new a(dVar);
        aVar.setName("glide-" + this.purple + "-thread-" + this.teal.getAndIncrement());
        return aVar;
    }
}
