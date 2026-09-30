package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class ay extends az {
    public final aq.f alpha = new aq.f();

    public void bravo(au auVar, A a6) {
        if (auVar != null) {
            ax axVar = new ax(auVar, a6);
            ax axVar2 = (ax) this.alpha.bravo(auVar, axVar);
            if (axVar2 != null && axVar2.purple != a6) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (axVar2 == null && hasActiveObservers()) {
                auVar.observeForever(axVar);
                return;
            }
            return;
        }
        throw new NullPointerException("source cannot be null");
    }

    @Override // androidx.lifecycle.au
    public void onActive() {
        Iterator it = this.alpha.iterator();
        while (true) {
            aq.b bVar = (aq.b) it;
            if (bVar.hasNext()) {
                ax axVar = (ax) ((Map.Entry) bVar.next()).getValue();
                axVar.alpha.observeForever(axVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.lifecycle.au
    public void onInactive() {
        Iterator it = this.alpha.iterator();
        while (true) {
            aq.b bVar = (aq.b) it;
            if (bVar.hasNext()) {
                ax axVar = (ax) ((Map.Entry) bVar.next()).getValue();
                axVar.alpha.removeObserver(axVar);
            } else {
                return;
            }
        }
    }
}
