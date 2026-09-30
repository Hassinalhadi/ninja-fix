package Lb;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class L extends Pd.i implements Xd.l {
    public final /* synthetic */ String alpha;
    public final /* synthetic */ Function1 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(String str, Function1 function1, Nd.c cVar) {
        super(2, cVar);
        this.alpha = str;
        this.purple = function1;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new L(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        String str = this.alpha;
        if (str.length() == 6) {
            this.purple.invoke(str);
        }
        return Unit.INSTANCE;
    }
}
