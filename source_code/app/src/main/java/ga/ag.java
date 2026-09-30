package ga;

import androidx.lifecycle.az;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class ag implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ az purple;
    public final /* synthetic */ MyAccountViewModel red;

    public /* synthetic */ ag(az azVar, MyAccountViewModel myAccountViewModel, int i4) {
        this.alpha = i4;
        this.purple = azVar;
        this.red = myAccountViewModel;
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
            case 1:
                Intrinsics.checkNotNull(th);
                String onHandleError2 = this.red.onHandleError(th);
                this.purple.postValue(com.google.android.material.datepicker.j.november(0, onHandleError2, Constants.KEY_MSG, onHandleError2));
                return Unit.INSTANCE;
            case 2:
                Intrinsics.checkNotNull(th);
                String onHandleError3 = this.red.onHandleError(th);
                this.purple.postValue(com.google.android.material.datepicker.j.november(0, onHandleError3, Constants.KEY_MSG, onHandleError3));
                return Unit.INSTANCE;
            default:
                Intrinsics.checkNotNull(th);
                String onHandleError4 = this.red.onHandleError(th);
                this.purple.postValue(com.google.android.material.datepicker.j.november(0, onHandleError4, Constants.KEY_MSG, onHandleError4));
                return Unit.INSTANCE;
        }
    }
}
