package ga;

import d.C1534h0;
import delivery.samurai.android.ui.about.TrophiesCollectionsFragment;
import delivery.samurai.android.ui.about.viewmodel.TrophiesCollectionsViewModel;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ap extends Pd.i implements Xd.l {
    public final /* synthetic */ TrophiesCollectionsFragment alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(TrophiesCollectionsFragment trophiesCollectionsFragment, Nd.c cVar) {
        super(2, cVar);
        this.alpha = trophiesCollectionsFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ap(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ap) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        TrophiesCollectionsFragment trophiesCollectionsFragment = this.alpha;
        ((TrophiesCollectionsViewModel) trophiesCollectionsFragment.f12110f.getValue()).charlie.observe(trophiesCollectionsFragment.getViewLifecycleOwner(), new Aa.f(24, new C1534h0(4, trophiesCollectionsFragment)));
        return Unit.INSTANCE;
    }
}
