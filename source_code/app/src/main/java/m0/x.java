package m0;

import Lb.W;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class x implements T.q {
    public T0.d alpha;
    public W purple;
    public boolean red;
    public final J2.n silver;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, J2.n] */
    public x() {
        ?? obj = new Object();
        obj.silver = this;
        obj.purple = v.alpha;
        this.silver = obj;
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
