package B2;

import androidx.work.impl.WorkerStoppedException;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.J;

/* loaded from: classes3.dex */
public final class ak extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ao purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(ao aoVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = aoVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ak(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ak) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object aeVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        ao aoVar = this.purple;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                J j5 = aoVar.november;
                aj ajVar = new aj(aoVar, null);
                this.alpha = 1;
                obj = vf.ad.blue(j5, ajVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            aeVar = (ah) obj;
        } catch (WorkerStoppedException e) {
            aeVar = new ag(e.getReason());
        } catch (CancellationException unused) {
            aeVar = new ae();
        } catch (Throwable th) {
            A2.z.echo().delta(aq.alpha, "Unexpected error in WorkerWrapper", th);
            aeVar = new ae();
        }
        Object november = aoVar.india.november(new ai(0, aeVar, aoVar));
        Intrinsics.delta(november, "workDatabase.runInTransa…          }\n            )");
        return november;
    }
}
