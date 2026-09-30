package Jb;

import com.app.network.network.models.captian.CaptainStatus;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class N extends Pd.i implements Xd.l {
    public final /* synthetic */ HomeViewModelV2 alpha;
    public final /* synthetic */ CaptainStatus purple;
    public final /* synthetic */ androidx.lifecycle.az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(HomeViewModelV2 homeViewModelV2, CaptainStatus captainStatus, androidx.lifecycle.az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = homeViewModelV2;
        this.purple = captainStatus;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new N(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        HomeViewModelV2 homeViewModelV2 = this.alpha;
        Single<ResponseBody> gold = homeViewModelV2.bravo.gold(this.purple.name());
        androidx.lifecycle.az azVar = this.red;
        gold.subscribe(new I(5, new Fb.j(azVar, 9)), new I(6, new G(azVar, homeViewModelV2, 3)));
        return Unit.INSTANCE;
    }
}
