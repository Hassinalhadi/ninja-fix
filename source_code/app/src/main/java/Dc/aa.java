package Dc;

import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.shiftsV2.ShiftsViewModelV2;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class aa extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ShiftsViewModelV2 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(ShiftsViewModelV2 shiftsViewModelV2, Nd.c cVar) {
        super(2, cVar);
        this.purple = shiftsViewModelV2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new aa(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aa) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        ShiftsViewModelV2 shiftsViewModelV2 = this.purple;
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
                this.alpha = 1;
                obj = fVar.alpha("CAPTAIN_SHIFT_LEAVE", this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            shiftsViewModelV2.hotel = ((DataResponse) obj).getItems();
        } catch (Exception unused) {
        }
        shiftsViewModelV2.alpha(true);
        return Unit.INSTANCE;
    }
}
