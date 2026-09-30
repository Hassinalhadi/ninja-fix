package Hb;

import Cb.ad;
import Fb.j;
import Fb.k;
import Pd.i;
import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.models.ReferralResponse;
import delivery.samurai.android.ui.home.HomeViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class b extends i implements l {
    public final /* synthetic */ HomeViewModel alpha;
    public final /* synthetic */ az purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HomeViewModel homeViewModel, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = homeViewModel;
        this.purple = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new b(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        HomeViewModel homeViewModel = this.alpha;
        Single<ReferralResponse> emerald = homeViewModel.alpha.emerald();
        az azVar = this.purple;
        emerald.subscribe(new k(23, new j(azVar, 5)), new k(24, new ad(10, azVar, homeViewModel)));
        return Unit.INSTANCE;
    }
}
