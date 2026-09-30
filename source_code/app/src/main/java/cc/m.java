package cc;

import androidx.compose.runtime.ax;
import androidx.compose.runtime.p0;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import vf.ab;

/* loaded from: classes2.dex */
public final class m extends Pd.i implements Xd.l {
    public final /* synthetic */ List alpha;
    public final /* synthetic */ p0 purple;
    public final /* synthetic */ ax red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List list, p0 p0Var, ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = list;
        this.purple = p0Var;
        this.red = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new m(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        List list = this.alpha;
        boolean isEmpty = list.isEmpty();
        p0 p0Var = this.purple;
        if (isEmpty) {
            g.india(p0Var, 0);
            this.red.setValue(Boolean.FALSE);
        } else if (p0Var.juliet() > CollectionsKt.ivory(list)) {
            g.india(p0Var, CollectionsKt.ivory(list));
        }
        return Unit.INSTANCE;
    }
}
