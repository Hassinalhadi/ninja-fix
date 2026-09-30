package Ff;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class a implements Executor {
    public static final a alpha = new Object();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
