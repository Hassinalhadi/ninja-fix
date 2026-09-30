package S5;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Executor {
    public static final /* synthetic */ f purple = new f(0);
    public static final /* synthetic */ f red = new f(1);
    public final /* synthetic */ int alpha;

    public /* synthetic */ f(int i4) {
        this.alpha = i4;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.alpha) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
