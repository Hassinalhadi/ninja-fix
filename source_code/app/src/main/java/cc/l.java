package cc;

import androidx.compose.runtime.ax;
import androidx.compose.runtime.p0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.u;
import vf.ab;

/* loaded from: classes2.dex */
public final class l extends Pd.i implements Xd.l {
    public final /* synthetic */ p0 alpha;
    public final /* synthetic */ ax purple;
    public final /* synthetic */ ax red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p0 p0Var, ax axVar, ax axVar2, Nd.c cVar) {
        super(2, cVar);
        this.alpha = p0Var;
        this.purple = axVar;
        this.red = axVar2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new l(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        g.india(this.alpha, 0);
        this.purple.setValue(Boolean.FALSE);
        this.red.setValue(u.alpha);
        return Unit.INSTANCE;
    }
}
