package androidx.camera.core;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import t6.AbstractC3066u3;

/* renamed from: androidx.camera.core.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RejectedExecutionHandlerC0529k implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AbstractC3066u3.charlie("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
