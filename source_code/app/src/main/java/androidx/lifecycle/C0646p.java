package androidx.lifecycle;

import Jb.C0211t;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0646p extends Pd.i implements Xd.l {
    public final /* synthetic */ az alpha;
    public final /* synthetic */ C0211t purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0646p(az azVar, C0211t c0211t, Nd.c cVar) {
        super(2, cVar);
        this.alpha = azVar;
        this.purple = c0211t;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0646p(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0646p) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        this.alpha.observeForever(this.purple);
        return Unit.INSTANCE;
    }
}
