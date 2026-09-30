package ap;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Executor {
    public final /* synthetic */ int alpha;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.alpha) {
            case 0:
                b.charlie().alpha.bravo.execute(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
