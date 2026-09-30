package lc;

import delivery.samurai.android.ui.points.presentation.PointsFragment;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import r3.C2492a;

/* loaded from: classes2.dex */
public final class e extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ PointsFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PointsFragment pointsFragment, Nd.c cVar) {
        super(2, cVar);
        this.purple = pointsFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        e eVar = new e(this.purple, cVar);
        eVar.alpha = obj;
        return eVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((C2492a) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        C2492a c2492a = (C2492a) this.alpha;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        PointsFragment pointsFragment = this.purple;
        if (c2492a != null && c2492a.alpha == 1) {
            pointsFragment.f12440k = (List) c2492a.charlie;
        } else if (c2492a != null && c2492a.alpha == 0) {
            d3.k kilo = pointsFragment.kilo();
            String str = c2492a.bravo;
            if (str == null) {
                str = "";
            }
            L9.d.pink(kilo, str);
        }
        return Unit.INSTANCE;
    }
}
