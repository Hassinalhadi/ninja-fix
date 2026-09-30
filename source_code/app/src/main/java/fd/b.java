package fd;

import Xd.l;
import io.ktor.client.engine.ClientEngineClosedException;
import kotlin.ResultKt;
import kotlin.Unit;
import od.C2227d;
import vf.H;
import vf.I;
import vf.ab;

/* loaded from: classes2.dex */
public final class b extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ d purple;
    public final /* synthetic */ C2227d red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, C2227d c2227d, Nd.c cVar) {
        super(2, cVar);
        this.purple = dVar;
        this.red = c2227d;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new b(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        d dVar = this.purple;
        I i5 = (I) dVar.charlie().get(H.alpha);
        if (i5 != null) {
            z2 = i5.echo();
        } else {
            z2 = false;
        }
        if (z2) {
            this.alpha = 1;
            Object echo = ((gd.f) dVar).echo(this.red, this);
            if (echo == aVar) {
                return aVar;
            }
            return echo;
        }
        throw new ClientEngineClosedException(null, 1, null);
    }
}
