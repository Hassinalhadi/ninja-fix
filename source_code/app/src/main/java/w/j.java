package w;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.I;
import vf.Y;
import vf.ab;
import vf.ad;

/* loaded from: classes3.dex */
public final class j extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ k purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = kVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        j jVar = new j(this.purple, cVar);
        jVar.alpha = obj;
        return jVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        ab abVar = (ab) this.alpha;
        k kVar = this.purple;
        I i4 = (I) kVar.bravo.getAndSet(null);
        AtomicReference atomicReference = kVar.bravo;
        Y zulu = ad.zulu(abVar, null, null, new C3231i(i4, kVar, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, zulu)) {
                z2 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z2 = false;
                break;
            }
        }
        return Boolean.valueOf(z2);
    }
}
