package I3;

import android.os.Process;

/* loaded from: classes3.dex */
public final class a extends Thread {
    public final /* synthetic */ int alpha = 0;

    public /* synthetic */ a(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
    }

    public /* synthetic */ a(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
