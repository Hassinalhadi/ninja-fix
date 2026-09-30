package cc;

import androidx.compose.runtime.ax;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class n extends Pd.i implements Xd.l {
    public final /* synthetic */ String alpha;
    public final /* synthetic */ ax purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = str;
        this.purple = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new n(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        ax axVar = this.purple;
        axVar.setValue(kotlin.collections.ab.november((Set) axVar.getValue(), this.alpha));
        return Unit.INSTANCE;
    }
}
