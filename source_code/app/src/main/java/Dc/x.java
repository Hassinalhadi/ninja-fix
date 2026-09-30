package Dc;

import com.app.network.network.models.CancelShiftRequest;
import delivery.samurai.android.ui.shiftsV2.ShiftsViewModelV2;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class x extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ShiftsViewModelV2 purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ Aa.l teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ShiftsViewModelV2 shiftsViewModelV2, long j5, String str, Aa.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = shiftsViewModelV2;
        this.red = j5;
        this.silver = str;
        this.teal = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new x(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        Aa.l lVar = this.teal;
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
                long j5 = this.red;
                CancelShiftRequest cancelShiftRequest = new CancelShiftRequest(this.silver);
                this.alpha = 1;
                if (fVar.kilo(j5, cancelShiftRequest, this) == aVar) {
                    return aVar;
                }
            }
            lVar.invoke(Boolean.TRUE);
            shiftsViewModelV2.alpha(true);
        } catch (Exception unused) {
            lVar.invoke(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
