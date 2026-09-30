package K1;

import android.os.Build;
import id.C1915c;
import java.util.ArrayList;
import java.util.Set;
import s6.W5;
import s6.X5;

/* loaded from: classes3.dex */
public final class e extends W5 {
    public final /* synthetic */ f bravo;

    public e(f fVar) {
        this.bravo = fVar;
    }

    @Override // s6.W5
    public final void alpha(Throwable th) {
        ((k) this.bravo.charlie).foxtrot(th);
    }

    @Override // s6.W5
    public final void bravo(com.google.firebase.messaging.o oVar) {
        Set<int[]> alpha;
        f fVar = this.bravo;
        fVar.bravo = oVar;
        com.google.firebase.messaging.o oVar2 = (com.google.firebase.messaging.o) fVar.bravo;
        k kVar = (k) fVar.charlie;
        W8.a aVar = kVar.golf;
        d dVar = kVar.india;
        if (Build.VERSION.SDK_INT >= 34) {
            alpha = o.alpha();
        } else {
            alpha = X5.alpha();
        }
        fVar.alpha = new C1915c(oVar2, aVar, dVar, alpha);
        k kVar2 = (k) fVar.charlie;
        kVar2.getClass();
        ArrayList arrayList = new ArrayList();
        kVar2.alpha.writeLock().lock();
        try {
            kVar2.charlie = 1;
            arrayList.addAll(kVar2.bravo);
            kVar2.bravo.clear();
            kVar2.alpha.writeLock().unlock();
            kVar2.delta.post(new i(arrayList, kVar2.charlie, (Throwable) null));
        } catch (Throwable th) {
            kVar2.alpha.writeLock().unlock();
            throw th;
        }
    }
}
