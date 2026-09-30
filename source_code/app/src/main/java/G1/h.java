package G1;

import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.y;

/* loaded from: classes3.dex */
public final class h extends Pd.i implements l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Pd.i red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(l lVar, Nd.c cVar) {
        super(2, cVar);
        this.red = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        h hVar = new h(this.red, cVar);
        hVar.purple = obj;
        return hVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((b) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                b bVar = (b) this.purple;
                ResultKt.alpha(obj);
                return bVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        b bVar2 = new b(y.amber(((b) this.purple).alpha()), false);
        this.purple = bVar2;
        this.alpha = 1;
        if (this.red.invoke(bVar2, this) == aVar) {
            return aVar;
        }
        return bVar2;
    }
}
