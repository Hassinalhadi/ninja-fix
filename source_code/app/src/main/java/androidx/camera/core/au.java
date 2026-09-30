package androidx.camera.core;

import androidx.camera.core.impl.AbstractC0512j;
import androidx.camera.core.impl.InterfaceC0519q;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class au extends AbstractC0512j {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ au(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // androidx.camera.core.impl.AbstractC0512j
    public void bravo(int i4, InterfaceC0519q interfaceC0519q) {
        switch (this.alpha) {
            case 0:
                av avVar = (av) this.bravo;
                synchronized (avVar.alpha) {
                    try {
                        if (!avVar.teal) {
                            avVar.f2940b.put(interfaceC0519q.getTimestamp(), new bf.c(interfaceC0519q));
                            avVar.india();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 1:
            default:
                return;
            case 2:
                Iterator it = ((bn.f) this.bravo).alpha.iterator();
                while (it.hasNext()) {
                    androidx.camera.core.impl.P p4 = ((O) it.next()).mike;
                    Iterator it2 = p4.golf.delta.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC0512j) it2.next()).bravo(i4, new bn.g(interfaceC0519q, p4.golf.foxtrot, -1L));
                    }
                }
                return;
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0512j
    public void delta(int i4) {
        switch (this.alpha) {
            case 1:
                tg.k.echo().execute(new androidx.camera.core.impl.ai(8, this));
                return;
            default:
                return;
        }
    }
}
