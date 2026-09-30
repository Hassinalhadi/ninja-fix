package zc;

import androidx.lifecycle.az;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ az purple;
    public final /* synthetic */ ShiftBookingViewModelV2 red;

    public /* synthetic */ o(az azVar, ShiftBookingViewModelV2 shiftBookingViewModelV2, int i4) {
        this.alpha = i4;
        this.purple = azVar;
        this.red = shiftBookingViewModelV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.alpha) {
            case 0:
                Intrinsics.checkNotNull(th);
                String onHandleError = this.red.onHandleError(th);
                this.purple.postValue(com.google.android.material.datepicker.j.november(0, onHandleError, Constants.KEY_MSG, onHandleError));
                return Unit.INSTANCE;
            default:
                Intrinsics.checkNotNull(th);
                String onHandleError2 = this.red.onHandleError(th);
                this.purple.postValue(com.google.android.material.datepicker.j.november(0, onHandleError2, Constants.KEY_MSG, onHandleError2));
                return Unit.INSTANCE;
        }
    }
}
