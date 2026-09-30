package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import java.util.AbstractQueue;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class D extends Thread {
    public final Object alpha;
    public final AbstractQueue purple;
    public boolean red = false;
    public final /* synthetic */ E silver;

    /* JADX WARN: Multi-variable type inference failed */
    public D(E e, String str, BlockingQueue blockingQueue) {
        this.silver = e;
        V5.x.hotel(blockingQueue);
        this.alpha = new Object();
        this.purple = (AbstractQueue) blockingQueue;
        setName(str);
    }

    public final void alpha() {
        Object obj = this.alpha;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void bravo() {
        E e = this.silver;
        synchronized (e.f7504b) {
            try {
                if (!this.red) {
                    e.f7505c.release();
                    e.f7504b.notifyAll();
                    if (this == e.red) {
                        e.red = null;
                    } else if (this == e.silver) {
                        e.silver = null;
                    } else {
                        ar arVar = ((G) e.alpha).f7507b;
                        G.foxtrot(arVar);
                        arVar.white.alpha("Current scheduler thread is neither worker nor network");
                    }
                    this.red = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i4;
        boolean z2 = false;
        while (!z2) {
            try {
                this.silver.f7505c.acquire();
                z2 = true;
            } catch (InterruptedException e) {
                ar arVar = ((G) this.silver.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.f7632b.bravo(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                AbstractQueue abstractQueue = this.purple;
                C c3 = (C) abstractQueue.poll();
                if (c3 != null) {
                    if (true != c3.purple) {
                        i4 = 10;
                    } else {
                        i4 = threadPriority;
                    }
                    Process.setThreadPriority(i4);
                    c3.run();
                } else {
                    Object obj = this.alpha;
                    synchronized (obj) {
                        if (abstractQueue.peek() == null) {
                            this.silver.getClass();
                            try {
                                obj.wait(OkHttpConstants.READ_TIMEOUT_MS);
                            } catch (InterruptedException e4) {
                                ar arVar2 = ((G) this.silver.alpha).f7507b;
                                G.foxtrot(arVar2);
                                arVar2.f7632b.bravo(e4, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.silver.f7504b) {
                        if (this.purple.peek() == null) {
                            bravo();
                            bravo();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            bravo();
            throw th;
        }
    }
}
