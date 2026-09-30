package zc;

import androidx.lifecycle.az;
import com.app.network.network.response.DataResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ShiftBookingViewModelV2 purple;

    public /* synthetic */ n(ShiftBookingViewModelV2 shiftBookingViewModelV2, int i4) {
        this.alpha = i4;
        this.purple = shiftBookingViewModelV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                az azVar = this.purple.bravo;
                C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a.charlie = (DataResponse) obj;
                azVar.setValue(c2492a);
                return Unit.INSTANCE;
            default:
                Throwable th = (Throwable) obj;
                ShiftBookingViewModelV2 shiftBookingViewModelV2 = this.purple;
                az azVar2 = shiftBookingViewModelV2.bravo;
                Intrinsics.checkNotNull(th);
                String msg = shiftBookingViewModelV2.onHandleError(th);
                Intrinsics.echo(msg, "msg");
                azVar2.setValue(new C2492a(0, msg));
                return Unit.INSTANCE;
        }
    }
}
