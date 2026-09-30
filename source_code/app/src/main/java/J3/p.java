package J3;

import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class p {
    public static final ArrayDeque bravo;
    public Object alpha;

    static {
        char[] cArr = Y3.l.alpha;
        bravo = new ArrayDeque(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p alpha(Object obj) {
        p pVar;
        p pVar2;
        ArrayDeque arrayDeque = bravo;
        synchronized (arrayDeque) {
            pVar = (p) arrayDeque.poll();
            pVar2 = pVar;
        }
        if (pVar == null) {
            pVar2 = new Object();
        }
        pVar2.alpha = obj;
        return pVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            pVar.getClass();
            if (this.alpha.equals(pVar.alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }
}
