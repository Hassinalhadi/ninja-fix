package I7;

import i8.InterfaceC1904b;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class m implements InterfaceC1904b {
    public volatile Set alpha;
    public volatile Set bravo;

    public final synchronized void alpha() {
        try {
            Iterator it = this.alpha.iterator();
            while (it.hasNext()) {
                this.bravo.add(((InterfaceC1904b) it.next()).get());
            }
            this.alpha = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // i8.InterfaceC1904b
    public final Object get() {
        if (this.bravo == null) {
            synchronized (this) {
                try {
                    if (this.bravo == null) {
                        this.bravo = Collections.newSetFromMap(new ConcurrentHashMap());
                        alpha();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.bravo);
    }
}
