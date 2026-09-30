package hd;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import pd.AbstractC2304b;

/* loaded from: classes2.dex */
public final class i extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ AbstractC2304b silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Object obj, AbstractC2304b abstractC2304b, Nd.c cVar) {
        super(2, cVar);
        this.red = obj;
        this.silver = abstractC2304b;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        i iVar = new i(this.red, this.silver, cVar);
        iVar.purple = obj;
        return iVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((io.ktor.utils.io.ar) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        AbstractC2304b abstractC2304b = this.silver;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                io.ktor.utils.io.ar arVar = (io.ktor.utils.io.ar) this.purple;
                io.ktor.utils.io.t tVar = (io.ktor.utils.io.t) this.red;
                io.ktor.utils.io.ag agVar = arVar.alpha;
                this.alpha = 1;
                obj = io.ktor.utils.io.ak.delta(tVar, agVar, Long.MAX_VALUE, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ((Number) obj).longValue();
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            vf.ad.kilo(abstractC2304b, e);
            throw e;
        } catch (Throwable th) {
            vf.ad.kilo(abstractC2304b, vf.ad.alpha("Receive failed", th));
            throw th;
        }
    }
}
