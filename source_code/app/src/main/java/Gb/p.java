package Gb;

import androidx.lifecycle.az;
import com.app.network.network.response.DataResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import delivery.samurai.android.ui.envelopV2.EnvelopsViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ EnvelopsViewModelV2 purple;

    public /* synthetic */ p(EnvelopsViewModelV2 envelopsViewModelV2, int i4) {
        this.alpha = i4;
        this.purple = envelopsViewModelV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                az azVar = this.purple.bravo;
                C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a.charlie = (DataResponse) obj;
                azVar.postValue(c2492a);
                return Unit.INSTANCE;
            case 1:
                Throwable th = (Throwable) obj;
                EnvelopsViewModelV2 envelopsViewModelV2 = this.purple;
                az azVar2 = envelopsViewModelV2.bravo;
                Intrinsics.checkNotNull(th);
                String msg = envelopsViewModelV2.onHandleError(th);
                Intrinsics.echo(msg, "msg");
                azVar2.postValue(new C2492a(0, msg));
                return Unit.INSTANCE;
            case 2:
                az azVar3 = this.purple.bravo;
                C2492a c2492a2 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a2.charlie = (DataResponse) obj;
                azVar3.postValue(c2492a2);
                return Unit.INSTANCE;
            default:
                Throwable th2 = (Throwable) obj;
                EnvelopsViewModelV2 envelopsViewModelV22 = this.purple;
                az azVar4 = envelopsViewModelV22.bravo;
                Intrinsics.checkNotNull(th2);
                String msg2 = envelopsViewModelV22.onHandleError(th2);
                Intrinsics.echo(msg2, "msg");
                azVar4.postValue(new C2492a(0, msg2));
                return Unit.INSTANCE;
        }
    }
}
