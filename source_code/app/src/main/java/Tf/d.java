package Tf;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class d extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock access$getLock$cp;
        g charlie;
        while (true) {
            try {
                g.access$getCompanion$p().getClass();
                access$getLock$cp = g.access$getLock$cp();
                access$getLock$cp.lock();
                try {
                    g.access$getCompanion$p().getClass();
                    charlie = c.charlie();
                } catch (Throwable th) {
                    access$getLock$cp.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
            }
            if (charlie == g.access$getHead$cp()) {
                g.access$getCompanion$p();
                g.access$setHead$cp(null);
                access$getLock$cp.unlock();
                return;
            } else {
                access$getLock$cp.unlock();
                if (charlie != null) {
                    charlie.timedOut();
                }
            }
        }
    }
}
