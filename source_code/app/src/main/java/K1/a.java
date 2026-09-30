package K1;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ThreadFactory {
    public final /* synthetic */ String alpha;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.alpha);
        thread.setPriority(10);
        return thread;
    }
}
