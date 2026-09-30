package na;

import androidx.lifecycle.az;
import com.app.network.network.models.OrderTask;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import retrofit2.HttpException;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ az purple;
    public final /* synthetic */ OrdersViewModel red;

    public /* synthetic */ g(az azVar, OrdersViewModel ordersViewModel, int i4) {
        this.alpha = i4;
        this.purple = azVar;
        this.red = ordersViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HttpException httpException;
        switch (this.alpha) {
            case 0:
                Throwable th = (Throwable) obj;
                Intrinsics.checkNotNull(th);
                String onHandleError = this.red.onHandleError(th);
                this.purple.postValue(com.google.android.material.datepicker.j.november(0, onHandleError, Constants.KEY_MSG, onHandleError));
                return Unit.INSTANCE;
            case 1:
                Throwable th2 = (Throwable) obj;
                Intrinsics.checkNotNull(th2);
                String onHandleError2 = this.red.onHandleError(th2);
                this.purple.postValue(com.google.android.material.datepicker.j.november(0, onHandleError2, Constants.KEY_MSG, onHandleError2));
                return Unit.INSTANCE;
            case 2:
                Throwable th3 = (Throwable) obj;
                Intrinsics.checkNotNull(th3);
                String onHandleError3 = this.red.onHandleError(th3);
                this.purple.postValue(com.google.android.material.datepicker.j.november(0, onHandleError3, Constants.KEY_MSG, onHandleError3));
                return Unit.INSTANCE;
            case 3:
                Throwable th4 = (Throwable) obj;
                Intrinsics.checkNotNull(th4);
                String onHandleError4 = this.red.onHandleError(th4);
                this.purple.postValue(com.google.android.material.datepicker.j.november(0, onHandleError4, Constants.KEY_MSG, onHandleError4));
                return Unit.INSTANCE;
            case 4:
                Throwable th5 = (Throwable) obj;
                Intrinsics.checkNotNull(th5);
                String onHandleError5 = this.red.onHandleError(th5);
                this.purple.postValue(com.google.android.material.datepicker.j.november(0, onHandleError5, Constants.KEY_MSG, onHandleError5));
                return Unit.INSTANCE;
            case 5:
                Throwable th6 = (Throwable) obj;
                Intrinsics.checkNotNull(th6);
                String onHandleError6 = this.red.onHandleError(th6);
                this.purple.postValue(com.google.android.material.datepicker.j.november(0, onHandleError6, Constants.KEY_MSG, onHandleError6));
                return Unit.INSTANCE;
            case 6:
                OrdersViewModel ordersViewModel = this.red;
                az azVar = this.purple;
                ordersViewModel.india = null;
                C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a.charlie = (OrderTask) obj;
                azVar.postValue(c2492a);
                return Unit.INSTANCE;
            case 7:
                OrdersViewModel ordersViewModel2 = this.red;
                az azVar2 = this.purple;
                Throwable th7 = (Throwable) obj;
                Integer num = null;
                if (th7 instanceof HttpException) {
                    httpException = (HttpException) th7;
                } else {
                    httpException = null;
                }
                if (httpException != null) {
                    num = Integer.valueOf(httpException.code());
                }
                ordersViewModel2.india = num;
                Intrinsics.checkNotNull(th7);
                String msg = ordersViewModel2.onHandleError(th7);
                Intrinsics.echo(msg, "msg");
                azVar2.postValue(new C2492a(0, msg));
                return Unit.INSTANCE;
            default:
                Throwable th8 = (Throwable) obj;
                Intrinsics.checkNotNull(th8);
                String onHandleError7 = this.red.onHandleError(th8);
                this.purple.postValue(com.google.android.material.datepicker.j.november(0, onHandleError7, Constants.KEY_MSG, onHandleError7));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(OrdersViewModel ordersViewModel, az azVar, int i4) {
        this.alpha = i4;
        this.red = ordersViewModel;
        this.purple = azVar;
    }
}
