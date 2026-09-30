package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC0662g implements Executor {
    public final Handler alpha = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.alpha.post(runnable);
    }
}
