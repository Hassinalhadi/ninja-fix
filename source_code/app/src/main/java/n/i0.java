package n;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class i0 implements q0.az {
    public final h9.an alpha;

    public i0(h9.an anVar) {
        this.alpha = anVar;
    }

    @Override // T.s
    public final /* synthetic */ boolean all(Function1 function1) {
        return Q0.c.alpha(this, function1);
    }

    @Override // T.s
    public final Object foldIn(Object obj, Xd.l lVar) {
        return lVar.invoke(obj, this);
    }

    @Override // q0.az
    public final Object foxtrot() {
        return this;
    }

    @Override // T.s
    public final /* synthetic */ T.s then(T.s sVar) {
        return Q0.c.charlie(this, sVar);
    }
}
