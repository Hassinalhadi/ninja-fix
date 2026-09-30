package d3;

import android.content.IntentFilter;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class g extends Pd.i implements Xd.l {
    public final /* synthetic */ k alpha;
    public final /* synthetic */ List purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, List list, Nd.c cVar) {
        super(2, cVar);
        this.alpha = kVar;
        this.purple = list;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new g(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        k kVar = this.alpha;
        if (!kVar.isFinishing() && !kVar.isDestroyed() && !kVar.getSupportFragmentManager().jade()) {
            Iterator it = this.purple.iterator();
            while (it.hasNext()) {
                kVar.yellow.add(new Long(((Number) it.next()).longValue()));
            }
            IntentFilter intentFilter = k.C;
            kVar.emerald();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
