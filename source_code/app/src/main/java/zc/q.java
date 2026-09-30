package zc;

import androidx.lifecycle.az;
import com.app.network.network.models.StartingPoint;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingViewModelV2;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import ma.C2109a;
import vf.ab;

/* loaded from: classes2.dex */
public final class q extends Pd.i implements Xd.l {
    public final /* synthetic */ ShiftBookingViewModelV2 alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ az teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ShiftBookingViewModelV2 shiftBookingViewModelV2, String str, long j5, int i4, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = shiftBookingViewModelV2;
        this.purple = str;
        this.red = j5;
        this.silver = i4;
        this.teal = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new q(this.alpha, this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        ShiftBookingViewModelV2 shiftBookingViewModelV2 = this.alpha;
        Single<DataResponse<StartingPoint>> mike = shiftBookingViewModelV2.alpha.mike(this.purple, this.red, this.silver, 100);
        az azVar = this.teal;
        mike.subscribe(new sa.c(9, new C2109a(azVar, 15)), new sa.c(10, new o(azVar, shiftBookingViewModelV2, 1)));
        return Unit.INSTANCE;
    }
}
