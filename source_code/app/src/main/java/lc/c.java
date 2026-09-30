package lc;

import android.widget.TextView;
import androidx.appcompat.widget.i1;
import com.app.network.network.models.points.PointsVaultResponse;
import delivery.samurai.android.ui.points.presentation.PointsFragment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import t6.Q2;

/* loaded from: classes2.dex */
public final class c extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ PointsFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PointsFragment pointsFragment, Nd.c cVar) {
        super(2, cVar);
        this.purple = pointsFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        c cVar2 = new c(this.purple, cVar);
        cVar2.alpha = obj;
        return cVar2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((C2492a) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        float f5;
        C2492a c2492a = (C2492a) this.alpha;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        PointsFragment pointsFragment = this.purple;
        if (c2492a != null && c2492a.alpha == 1) {
            PointsVaultResponse pointsVaultResponse = (PointsVaultResponse) c2492a.charlie;
            if (pointsVaultResponse != null) {
                Float balance = pointsVaultResponse.getBalance();
                if (balance != null) {
                    f5 = balance.floatValue();
                } else {
                    f5 = 0.0f;
                }
                pointsFragment.f12439j = f5;
                i1 i1Var = pointsFragment.f12435f;
                String str = null;
                if (i1Var != null) {
                    Float balance2 = pointsVaultResponse.getBalance();
                    if (balance2 != null) {
                        str = Q2.bravo(balance2.floatValue());
                    }
                    ((TextView) i1Var.charlie).setText(str);
                    pointsFragment.f12436g.notifyDataSetChanged();
                } else {
                    Intrinsics.lima("binding");
                    throw null;
                }
            }
        } else if (c2492a != null && c2492a.alpha == 0) {
            d3.k kilo = pointsFragment.kilo();
            String str2 = c2492a.bravo;
            if (str2 == null) {
                str2 = "";
            }
            L9.d.pink(kilo, str2);
        }
        return Unit.INSTANCE;
    }
}
