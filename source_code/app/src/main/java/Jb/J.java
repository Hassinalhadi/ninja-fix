package Jb;

import com.app.network.network.models.TransferCard;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class J extends Pd.i implements Xd.l {
    public final /* synthetic */ HomeViewModelV2 alpha;
    public final /* synthetic */ androidx.lifecycle.az purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(HomeViewModelV2 homeViewModelV2, androidx.lifecycle.az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = homeViewModelV2;
        this.purple = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new J(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        HomeViewModelV2 homeViewModelV2 = this.alpha;
        Single<DataResponse<TransferCard>> indigo = homeViewModelV2.bravo.indigo(null);
        androidx.lifecycle.az azVar = this.purple;
        indigo.subscribe(new Fb.k(29, new Fb.j(azVar, 7)), new I(0, new G(azVar, homeViewModelV2, 1)));
        return Unit.INSTANCE;
    }
}
