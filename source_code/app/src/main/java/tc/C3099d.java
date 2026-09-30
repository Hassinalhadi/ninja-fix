package tc;

import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* renamed from: tc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3099d extends Pd.i implements Xd.l {
    public final /* synthetic */ C3105j alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3099d(C3105j c3105j, Nd.c cVar) {
        super(2, cVar);
        this.alpha = c3105j;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3099d(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3099d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        this.alpha.lima(false, false);
        return Unit.INSTANCE;
    }
}
