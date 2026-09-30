package E8;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class i implements T5.c {
    public static final AtomicReference alpha = new AtomicReference();

    @Override // T5.c
    public final void alpha(boolean z2) {
        Random random = j.juliet;
        synchronized (j.class) {
            Iterator it = j.kilo.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).golf(z2);
            }
        }
    }
}
