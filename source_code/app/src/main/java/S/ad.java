package S;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class ad implements ac {
    public final P.a alpha = new AtomicInteger(0);

    public final boolean charlie(int i4) {
        if ((i4 & this.alpha.get()) != 0) {
            return true;
        }
        return false;
    }

    @Override // S.ac
    public /* synthetic */ ae delta(ae aeVar, ae aeVar2, ae aeVar3) {
        return null;
    }

    public final void golf(int i4) {
        P.a aVar;
        int i5;
        do {
            aVar = this.alpha;
            i5 = aVar.get();
            if ((i5 & i4) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i5, i5 | i4));
    }
}
