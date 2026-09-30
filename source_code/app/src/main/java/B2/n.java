package B2;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class n extends Pd.i implements Xd.n {
    public int alpha;
    public /* synthetic */ Throwable purple;
    public /* synthetic */ long red;

    /* JADX WARN: Type inference failed for: r3v2, types: [Pd.i, B2.n] */
    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        ?? iVar = new Pd.i(4, (Nd.c) obj4);
        iVar.purple = (Throwable) obj2;
        iVar.red = longValue;
        return iVar.invokeSuspend(Unit.INSTANCE);
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
            Throwable th = this.purple;
            long j5 = this.red;
            A2.z.echo().delta(p.alpha, "Cannot check for unfinished work", th);
            long min = Math.min(j5 * 30000, p.bravo);
            this.alpha = 1;
            if (vf.ad.november(min, this) == aVar) {
                return aVar;
            }
        }
        return Boolean.TRUE;
    }
}
