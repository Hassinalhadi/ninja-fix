package B2;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class o extends Pd.i implements Xd.l {
    public /* synthetic */ boolean alpha;
    public final /* synthetic */ Context purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, Nd.c cVar) {
        super(2, cVar);
        this.purple = context;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        o oVar = new o(this.purple, cVar);
        oVar.alpha = ((Boolean) obj).booleanValue();
        return oVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((o) create(bool, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        K2.g.alpha(this.purple, RescheduleReceiver.class, this.alpha);
        return Unit.INSTANCE;
    }
}
