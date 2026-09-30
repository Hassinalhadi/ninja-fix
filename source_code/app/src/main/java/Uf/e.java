package Uf;

import Tf.ah;
import Tf.u;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import pf.C2359i;

/* loaded from: classes3.dex */
public final class e extends Pd.h implements Xd.l {
    public kotlin.collections.l purple;
    public Iterator red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f2158s;
    public int silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ ah white;
    public final /* synthetic */ u yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ah ahVar, u uVar, boolean z2, Nd.c cVar) {
        super(2, cVar);
        this.white = ahVar;
        this.yellow = uVar;
        this.f2158s = z2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        e eVar = new e(this.white, this.yellow, this.f2158s, cVar);
        eVar.teal = obj;
        return eVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((C2359i) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        C2359i c2359i;
        kotlin.collections.l lVar;
        Iterator it;
        Od.a aVar = Od.a.alpha;
        int i4 = this.silver;
        if (i4 != 0) {
            if (i4 == 1) {
                it = this.red;
                kotlin.collections.l lVar2 = this.purple;
                c2359i = (C2359i) this.teal;
                ResultKt.alpha(obj);
                lVar = lVar2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            C2359i c2359i2 = (C2359i) this.teal;
            kotlin.collections.l lVar3 = new kotlin.collections.l();
            ah ahVar = this.white;
            lVar3.addLast(ahVar);
            c2359i = c2359i2;
            lVar = lVar3;
            it = this.yellow.list(ahVar).iterator();
        }
        while (it.hasNext()) {
            ah ahVar2 = (ah) it.next();
            this.teal = c2359i;
            this.purple = lVar;
            this.red = it;
            this.silver = 1;
            if (b.bravo(c2359i, this.yellow, lVar, ahVar2, this.f2158s, false, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
