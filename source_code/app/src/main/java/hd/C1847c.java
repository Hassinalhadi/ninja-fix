package hd;

import kotlin.ResultKt;
import kotlin.Unit;
import pd.AbstractC2304b;

/* renamed from: hd.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1847c extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;

    /* JADX WARN: Type inference failed for: r0v0, types: [hd.c, Pd.i, Nd.c] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ?? iVar = new Pd.i(2, cVar);
        iVar.alpha = obj;
        return iVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((C1847c) create((AbstractC2304b) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return null;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        if (((AbstractC2304b) this.alpha).bravo().delta().beige().echo(AbstractC1848d.bravo) == null) {
            return null;
        }
        throw new ClassCastException();
    }
}
