package I7;

import f8.InterfaceC1695a;
import f8.InterfaceC1696b;
import f8.InterfaceC1697c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class k implements InterfaceC1697c, InterfaceC1696b {
    public final HashMap alpha = new HashMap();
    public ArrayDeque bravo = new ArrayDeque();
    public final Executor charlie;

    public k(Executor executor) {
        this.charlie = executor;
    }

    public final synchronized void alpha(Executor executor, InterfaceC1695a interfaceC1695a) {
        try {
            executor.getClass();
            if (!this.alpha.containsKey(B7.b.class)) {
                this.alpha.put(B7.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.alpha.get(B7.b.class)).put(interfaceC1695a, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
