package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0647q extends Pd.i implements Xd.l {
    public final /* synthetic */ az alpha;
    public final /* synthetic */ A purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0647q(az azVar, A a6, Nd.c cVar) {
        super(2, cVar);
        this.alpha = azVar;
        this.purple = a6;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0647q(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0647q) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        this.alpha.removeObserver(this.purple);
        return Unit.INSTANCE;
    }
}
