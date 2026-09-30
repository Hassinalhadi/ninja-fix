package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: d.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1520a0 extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ long purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1520a0(long j5, Nd.c cVar) {
        super(2, cVar);
        this.purple = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C1520a0 c1520a0 = new C1520a0(this.purple, cVar);
        c1520a0.alpha = obj;
        return c1520a0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1520a0) create((C1542l0) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        C1548o0 c1548o0 = ((C1542l0) this.alpha).alpha;
        c1548o0.charlie(c1548o0.kilo, this.purple, 1);
        return Unit.INSTANCE;
    }
}
