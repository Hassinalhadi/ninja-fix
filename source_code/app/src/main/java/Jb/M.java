package Jb;

import com.app.network.network.models.DeviceInfo;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class M extends Pd.i implements Xd.l {
    public final /* synthetic */ HomeViewModelV2 alpha;
    public final /* synthetic */ String purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(HomeViewModelV2 homeViewModelV2, String str, Nd.c cVar) {
        super(2, cVar);
        this.alpha = homeViewModelV2;
        this.purple = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new M(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        HomeViewModelV2 homeViewModelV2 = this.alpha;
        DeviceInfo alpha = L9.d.alpha(homeViewModelV2.alpha);
        alpha.setInstallationUid(this.purple);
        homeViewModelV2.charlie.hotel(alpha).subscribe(new I(3, new Cb.ad(13, homeViewModelV2, alpha)), new I(4, new C(homeViewModelV2, 2)));
        return Unit.INSTANCE;
    }
}
