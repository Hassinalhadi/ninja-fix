package f6;

import E5.p;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: f6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ThreadFactoryC1693a implements ThreadFactory {
    public final String alpha;
    public final ThreadFactory purple = Executors.defaultThreadFactory();

    public ThreadFactoryC1693a(String str) {
        this.alpha = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.purple.newThread(new p(runnable, 4));
        newThread.setName(this.alpha);
        return newThread;
    }
}
