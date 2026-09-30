package F2;

import A2.z;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import vf.ad;
import xf.q;
import xf.r;

/* loaded from: classes3.dex */
public final class f extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ h purple;
    public final /* synthetic */ r red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, r rVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = hVar;
        this.red = rVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        h hVar = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            hVar.getClass();
            this.alpha = 1;
            if (ad.november(1000L, this) == aVar) {
                return aVar;
            }
        }
        z echo = z.echo();
        String str = p.alpha;
        hVar.getClass();
        echo.alpha(str, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
        ((q) this.red).mike(new b(7));
        return Unit.INSTANCE;
    }
}
