package Wf;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ e red;
    public final /* synthetic */ x silver;
    public final /* synthetic */ Q0.d teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, x xVar, Q0.d dVar, Nd.c cVar) {
        super(2, cVar);
        this.red = eVar;
        this.silver = xVar;
        this.teal = dVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        l lVar = new l(this.red, this.silver, this.teal, cVar);
        lVar.purple = obj;
        return lVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((r) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

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
            String str = u.alpha(this.red, (r) this.purple).bravo;
            Aa.l lVar = new Aa.l(28, this.teal);
            this.alpha = 1;
            Lazy lazy = m.alpha;
            j jVar = new j(lVar, this.silver, str, null);
            w.o oVar = m.delta;
            oVar.getClass();
            obj = vf.ad.mike(new c(oVar, str, jVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Intrinsics.charlie(obj, "null cannot be cast to non-null type org.jetbrains.compose.resources.ImageCache.Vector");
        return ((g) obj).alpha;
    }
}
