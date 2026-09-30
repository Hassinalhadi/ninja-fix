package Xc;

import Fb.j;
import Pd.i;
import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.models.Shift;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.zones.ZonesViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class g extends i implements l {
    public final /* synthetic */ ZonesViewModel alpha;
    public final /* synthetic */ az purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ZonesViewModel zonesViewModel, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = zonesViewModel;
        this.purple = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new g(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        ZonesViewModel zonesViewModel = this.alpha;
        Single<DataResponse<Shift>> bravo = zonesViewModel.alpha.bravo(0);
        az azVar = this.purple;
        bravo.subscribe(new X9.f(11, new j(azVar, 22)), new X9.f(12, new e(azVar, zonesViewModel, 1)));
        return Unit.INSTANCE;
    }
}
