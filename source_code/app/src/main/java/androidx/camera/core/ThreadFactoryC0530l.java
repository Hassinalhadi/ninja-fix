package androidx.camera.core;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: androidx.camera.core.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ThreadFactoryC0530l implements ThreadFactory {
    public final /* synthetic */ int alpha;
    public final Number purple;

    public ThreadFactoryC0530l(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 1:
                this.purple = new AtomicInteger(0);
                return;
            case 2:
                this.purple = new AtomicInteger(0);
                return;
            default:
                this.purple = new AtomicInteger(0);
                return;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.alpha) {
            case 0:
                Thread thread = new Thread(runnable);
                Locale locale = Locale.US;
                thread.setName("CameraX-core_camera_" + ((AtomicInteger) this.purple).getAndIncrement());
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                thread2.setName("arch_disk_io_" + ((AtomicInteger) this.purple).getAndIncrement());
                return thread2;
            case 2:
                Thread thread3 = new Thread(runnable);
                Locale locale2 = Locale.US;
                thread3.setName("CameraX-camerax_io_" + ((AtomicInteger) this.purple).getAndIncrement());
                return thread3;
            default:
                Thread newThread = Executors.defaultThreadFactory().newThread(new O7.v(runnable));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.purple).getAndIncrement());
                return newThread;
        }
    }

    public ThreadFactoryC0530l(AtomicLong atomicLong) {
        this.alpha = 3;
        this.purple = atomicLong;
    }
}
