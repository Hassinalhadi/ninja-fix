package E5;

import android.os.Process;
import s6.D5;

/* loaded from: classes3.dex */
public final class p implements Runnable {
    public final /* synthetic */ int alpha;
    public final Runnable purple;

    public /* synthetic */ p(Runnable runnable, int i4) {
        this.alpha = i4;
        this.purple = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                try {
                    this.purple.run();
                    return;
                } catch (Exception e) {
                    D5.golf("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.purple.run();
                return;
            case 2:
                this.purple.run();
                return;
            case 3:
                Process.setThreadPriority(10);
                this.purple.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.purple.run();
                return;
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 1:
                return this.purple.toString();
            default:
                return super.toString();
        }
    }
}
