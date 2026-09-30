package G1;

import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends Pd.i implements l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Pd.i red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(l lVar, Nd.c cVar) {
        super(2, cVar);
        this.red = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        c cVar2 = new c(this.red, cVar);
        cVar2.purple = obj;
        return cVar2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            b bVar = (b) this.purple;
            this.alpha = 1;
            obj = this.red.invoke(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        b bVar2 = (b) obj;
        Intrinsics.charlie(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        bVar2.bravo.alpha.set(true);
        return bVar2;
    }
}
