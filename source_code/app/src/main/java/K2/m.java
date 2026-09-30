package K2;

import A2.y;
import A2.z;
import B2.aq;
import android.content.Context;
import androidx.appcompat.widget.P0;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3003i;
import t6.AbstractC3008j;
import vf.ab;

/* loaded from: classes3.dex */
public final class m extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ y purple;
    public final /* synthetic */ J2.p red;
    public final /* synthetic */ o silver;
    public final /* synthetic */ Context teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(y yVar, J2.p pVar, o oVar, Context context, Nd.c cVar) {
        super(2, cVar);
        this.purple = yVar;
        this.red = pVar;
        this.silver = oVar;
        this.teal = context;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new m(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        y yVar = this.purple;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            com.google.common.util.concurrent.e foregroundInfoAsync = yVar.getForegroundInfoAsync();
            Intrinsics.delta(foregroundInfoAsync, "worker.getForegroundInfoAsync()");
            this.alpha = 1;
            obj = aq.alpha(foregroundInfoAsync, yVar, this);
        }
        A2.n nVar = (A2.n) obj;
        J2.p pVar = this.red;
        if (nVar != null) {
            String str = n.alpha;
            z.echo().alpha(str, "Updating notification for " + pVar.charlie);
            UUID id2 = yVar.getId();
            o oVar = this.silver;
            L2.c cVar = oVar.alpha;
            F4.b bVar = new F4.b(oVar, id2, nVar, this.teal, 1);
            i iVar = cVar.alpha;
            Intrinsics.echo(iVar, "<this>");
            V0.k alpha = AbstractC3003i.alpha(new A2.p(iVar, "setForegroundAsync", bVar, 1));
            this.alpha = 2;
            Object alpha2 = AbstractC3008j.alpha(alpha, this);
            if (alpha2 == aVar) {
                return aVar;
            }
            return alpha2;
        }
        throw new IllegalStateException(P0.gold(new StringBuilder("Worker was marked important ("), pVar.charlie, ") but did not provide ForegroundInfo"));
    }
}
