package Xc;

import Fb.j;
import Pd.i;
import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.models.HeatMapLocation;
import delivery.samurai.android.ui.zones.ZonesViewModel;
import io.reactivex.Single;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class f extends i implements l {
    public final /* synthetic */ ZonesViewModel alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ az silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ZonesViewModel zonesViewModel, String str, long j5, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = zonesViewModel;
        this.purple = str;
        this.red = j5;
        this.silver = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f(this.alpha, this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        ZonesViewModel zonesViewModel = this.alpha;
        Single<List<HeatMapLocation>> alpha = zonesViewModel.alpha.alpha(this.purple, this.red);
        az azVar = this.silver;
        alpha.subscribe(new X9.f(9, new j(azVar, 21)), new X9.f(10, new e(azVar, zonesViewModel, 0)));
        return Unit.INSTANCE;
    }
}
