package Jb;

import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class D extends Pd.i implements Xd.l {
    public final /* synthetic */ HomeViewModelV2 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(HomeViewModelV2 homeViewModelV2, Nd.c cVar) {
        super(2, cVar);
        this.alpha = homeViewModelV2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new D(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        HomeViewModelV2 homeViewModelV2 = this.alpha;
        homeViewModelV2.bravo.juliet().subscribe(new Fb.k(25, new C(homeViewModelV2, 0)), new Fb.k(26, new C(homeViewModelV2, 1)));
        return Unit.INSTANCE;
    }
}
