package J3;

import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class o extends B8.h {
    @Override // B8.h
    public final void echo(Object obj, Object obj2) {
        p pVar = (p) obj;
        pVar.getClass();
        ArrayDeque arrayDeque = p.bravo;
        synchronized (arrayDeque) {
            arrayDeque.offer(pVar);
        }
    }
}
