package lc;

import delivery.samurai.android.ui.points.presentation.PointsFragment;
import delivery.samurai.android.ui.points.presentation.PointsViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.AbstractC3428A;

/* loaded from: classes2.dex */
public final class d extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ PointsFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PointsFragment pointsFragment, Nd.c cVar) {
        super(2, cVar);
        this.purple = pointsFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new d(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            PointsFragment pointsFragment = this.purple;
            PointsViewModel quebec = pointsFragment.quebec();
            c cVar = new c(pointsFragment, null);
            this.alpha = 1;
            if (AbstractC3428A.kilo(quebec.charlie, cVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
