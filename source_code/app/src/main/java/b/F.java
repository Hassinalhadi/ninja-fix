package b;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class F implements T.q {
    public final E alpha;

    public F(E e) {
        this.alpha = e;
    }

    @Override // T.s
    public final /* synthetic */ boolean all(Function1 function1) {
        return Q0.c.alpha(this, function1);
    }

    @Override // T.s
    public final Object foldIn(Object obj, Xd.l lVar) {
        return lVar.invoke(obj, this);
    }

    @Override // T.s
    public final /* synthetic */ T.s then(T.s sVar) {
        return Q0.c.charlie(this, sVar);
    }
}
