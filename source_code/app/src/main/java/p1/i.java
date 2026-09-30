package p1;

import android.os.Process;

/* loaded from: classes3.dex */
public final class i extends Thread {
    public final int alpha;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.alpha = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.alpha);
        super.run();
    }
}
