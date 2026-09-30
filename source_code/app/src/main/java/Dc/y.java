package Dc;

import androidx.lifecycle.az;
import com.app.network.network.models.breaks.BreakResponse;
import com.app.network.network.models.breaks.CreateBreakRequest;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import delivery.samurai.android.ui.shiftsV2.ShiftsViewModelV2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* loaded from: classes2.dex */
public final class y extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ShiftsViewModelV2 purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ShiftsViewModelV2 shiftsViewModelV2, long j5, int i4, Nd.c cVar) {
        super(2, cVar);
        this.purple = shiftsViewModelV2;
        this.red = j5;
        this.silver = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new y(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        ShiftsViewModelV2 shiftsViewModelV2 = this.purple;
        az azVar = shiftsViewModelV2.oscar;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                t3.f fVar = shiftsViewModelV2.alpha;
                CreateBreakRequest createBreakRequest = new CreateBreakRequest(this.red, this.silver);
                this.alpha = 1;
                obj = fVar.golf(createBreakRequest, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
            c2492a.charlie = (BreakResponse) obj;
            azVar.postValue(c2492a);
        } catch (Exception e) {
            String msg = shiftsViewModelV2.onHandleError(e);
            Intrinsics.echo(msg, "msg");
            azVar.postValue(new C2492a(0, msg));
        }
        return Unit.INSTANCE;
    }
}
