package Dc;

import androidx.compose.ui.platform.ComposeView;
import delivery.samurai.android.ui.shiftsV2.ShiftSummariesViewModelV2;
import delivery.samurai.android.ui.shiftsV2.ShiftsFragmentV2;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class s extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ShiftsFragmentV2 purple;
    public final /* synthetic */ ComposeView red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ShiftsFragmentV2 shiftsFragmentV2, ComposeView composeView, Nd.c cVar) {
        super(2, cVar);
        this.purple = shiftsFragmentV2;
        this.red = composeView;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new s(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((s) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            ShiftSummariesViewModelV2 quebec = this.purple.quebec();
            q qVar = new q(this.red, 1);
            this.alpha = 1;
            if (quebec.golf.alpha.collect(qVar, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
