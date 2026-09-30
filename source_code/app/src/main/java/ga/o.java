package ga;

import delivery.samurai.android.ui.about.MoreFragment;
import delivery.samurai.android.ui.about.viewmodel.MoreViewModel;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class o extends Pd.i implements Xd.l {
    public final /* synthetic */ MoreFragment alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(MoreFragment moreFragment, Nd.c cVar) {
        super(2, cVar);
        this.alpha = moreFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new o(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        MoreFragment moreFragment = this.alpha;
        ((MoreViewModel) moreFragment.f12109f.getValue()).charlie.observe(moreFragment.getViewLifecycleOwner(), new Dc.t(15, new m(moreFragment, 1)));
        return Unit.INSTANCE;
    }
}
