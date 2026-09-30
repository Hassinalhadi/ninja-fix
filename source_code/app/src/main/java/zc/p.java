package zc;

import androidx.lifecycle.az;
import com.app.network.network.models.Shift;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingViewModelV2;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import ma.C2109a;
import vf.ab;

/* loaded from: classes2.dex */
public final class p extends Pd.i implements Xd.l {
    public final /* synthetic */ ShiftBookingViewModelV2 alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ az silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ShiftBookingViewModelV2 shiftBookingViewModelV2, long j5, String str, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = shiftBookingViewModelV2;
        this.purple = j5;
        this.red = str;
        this.silver = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new p(this.alpha, this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        ShiftBookingViewModelV2 shiftBookingViewModelV2 = this.alpha;
        Single<Shift> india = shiftBookingViewModelV2.alpha.india(this.purple, this.red);
        az azVar = this.silver;
        india.subscribe(new sa.c(7, new C2109a(azVar, 14)), new sa.c(8, new o(azVar, shiftBookingViewModelV2, 0)));
        return Unit.INSTANCE;
    }
}
