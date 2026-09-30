package be;

import av.ah;
import bd.ExecutorC0748a;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import s6.T7;
import t6.AbstractC3003i;

/* loaded from: classes3.dex */
public abstract class h {
    public static Object alpha(com.google.common.util.concurrent.e eVar) {
        T7.golf("Future was expected to be done, " + eVar, eVar.isDone());
        return bravo(eVar);
    }

    public static Object bravo(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static j charlie(Object obj) {
        if (obj == null) {
            return j.red;
        }
        return new j(0, obj);
    }

    public static com.google.common.util.concurrent.e delta(com.google.common.util.concurrent.e eVar) {
        eVar.getClass();
        if (eVar.isDone()) {
            return eVar;
        }
        return AbstractC3003i.alpha(new C0760f(eVar, 1));
    }

    public static void echo(boolean z2, com.google.common.util.concurrent.e eVar, V0.h hVar, ExecutorC0748a executorC0748a) {
        eVar.getClass();
        hVar.getClass();
        executorC0748a.getClass();
        eVar.foxtrot(new g(0, eVar, new ah(8, hVar)), executorC0748a);
        if (z2) {
            hVar.alpha(new F6.b(15, eVar), tg.k.bravo());
        }
    }

    public static RunnableC0756b foxtrot(com.google.common.util.concurrent.e eVar, InterfaceC0755a interfaceC0755a, Executor executor) {
        RunnableC0756b runnableC0756b = new RunnableC0756b(interfaceC0755a, eVar);
        eVar.foxtrot(runnableC0756b, executor);
        return runnableC0756b;
    }
}
