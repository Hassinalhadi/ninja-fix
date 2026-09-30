package oa;

import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.models.Zone;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.areasV2.AreaViewModelV2;
import gc.C1766d;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import ma.C2109a;
import vf.ab;

/* loaded from: classes2.dex */
public final class h extends Pd.i implements l {
    public final /* synthetic */ AreaViewModelV2 alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ float red;
    public final /* synthetic */ float silver;
    public final /* synthetic */ az teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AreaViewModelV2 areaViewModelV2, int i4, float f5, float f10, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = areaViewModelV2;
        this.purple = i4;
        this.red = f5;
        this.silver = f10;
        this.teal = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new h(this.alpha, this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AreaViewModelV2 areaViewModelV2 = this.alpha;
        Single<DataResponse<Zone>> lima = areaViewModelV2.alpha.lima(this.purple, this.red, this.silver);
        az azVar = this.teal;
        lima.subscribe(new C1766d(26, new C2109a(azVar, 11)), new C1766d(27, new C2207f(azVar, areaViewModelV2, 1)));
        return Unit.INSTANCE;
    }
}
