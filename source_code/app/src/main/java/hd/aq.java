package hd;

import io.ktor.client.plugins.HttpRequestTimeoutException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import od.C2226c;
import vf.a0;

/* loaded from: classes2.dex */
public final class aq extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ Long purple;
    public final /* synthetic */ C2226c red;
    public final /* synthetic */ a0 silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(Long l10, C2226c c2226c, a0 a0Var, Nd.c cVar) {
        super(2, cVar);
        this.purple = l10;
        this.red = c2226c;
        this.silver = a0Var;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new aq(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aq) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            long longValue = this.purple.longValue();
            this.alpha = 1;
            if (vf.ad.november(longValue, this) == aVar) {
                return aVar;
            }
        }
        C2226c c2226c = this.red;
        HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(c2226c);
        rg.b bVar = ar.alpha;
        Intrinsics.echo(bVar, "<this>");
        if (bVar.foxtrot()) {
            bVar.hotel("Request timeout: " + c2226c.alpha);
        }
        String message = httpRequestTimeoutException.getMessage();
        Intrinsics.checkNotNull(message);
        this.silver.foxtrot(vf.ad.alpha(message, httpRequestTimeoutException));
        return Unit.INSTANCE;
    }
}
