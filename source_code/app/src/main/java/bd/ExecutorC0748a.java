package bd;

import Y3.l;
import java.util.concurrent.Executor;

/* renamed from: bd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC0748a implements Executor {
    public static volatile ExecutorC0748a purple;
    public static final /* synthetic */ ExecutorC0748a red = new ExecutorC0748a(5);
    public static final /* synthetic */ ExecutorC0748a silver = new ExecutorC0748a(6);
    public final /* synthetic */ int alpha;

    public /* synthetic */ ExecutorC0748a(int i4) {
        this.alpha = i4;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.alpha) {
            case 0:
                runnable.run();
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                runnable.run();
                return;
            case 3:
                l.foxtrot().post(runnable);
                return;
            case 4:
                runnable.run();
                return;
            case 5:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
