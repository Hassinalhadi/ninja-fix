package Wf;

import Lb.am;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ e red;
    public final /* synthetic */ x silver;
    public final /* synthetic */ Q0.d teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, x xVar, Q0.d dVar, Nd.c cVar) {
        super(2, cVar);
        this.red = eVar;
        this.silver = xVar;
        this.teal = dVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        k kVar = new k(this.red, this.silver, this.teal, cVar);
        kVar.purple = obj;
        return kVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((k) create((r) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            String str = u.alpha(this.red, (r) this.purple).bravo;
            am amVar = new am(26);
            this.alpha = 1;
            Lazy lazy = m.alpha;
            j jVar = new j(amVar, this.silver, str, null);
            w.o oVar = m.delta;
            oVar.getClass();
            obj = vf.ad.mike(new c(oVar, str, jVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Intrinsics.charlie(obj, "null cannot be cast to non-null type org.jetbrains.compose.resources.ImageCache.Svg");
        throw new ClassCastException();
    }
}
