package Jb;

import com.app.network.network.models.CaptainProfileAttributeOtpResponse;
import com.app.network.network.models.ProfileAttributesRequest;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class L extends Pd.i implements Xd.l {
    public final /* synthetic */ HomeViewModelV2 alpha;
    public final /* synthetic */ ProfileAttributesRequest purple;
    public final /* synthetic */ androidx.lifecycle.az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(HomeViewModelV2 homeViewModelV2, ProfileAttributesRequest profileAttributesRequest, androidx.lifecycle.az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = homeViewModelV2;
        this.purple = profileAttributesRequest;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new L(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        HomeViewModelV2 homeViewModelV2 = this.alpha;
        Single<CaptainProfileAttributeOtpResponse> zulu = homeViewModelV2.bravo.zulu(this.purple);
        androidx.lifecycle.az azVar = this.red;
        zulu.subscribe(new I(1, new Fb.j(azVar, 8)), new I(2, new G(azVar, homeViewModelV2, 2)));
        return Unit.INSTANCE;
    }
}
