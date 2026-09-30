package bd;

import E5.p;
import java.util.concurrent.ThreadFactory;
import p1.i;

/* renamed from: bd.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ThreadFactoryC0751d implements ThreadFactory {
    public final /* synthetic */ int alpha;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.alpha) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
            case 1:
                return new Thread(new p(runnable, 3), "glide-active-resources");
            default:
                return new i(runnable);
        }
    }
}
