package va;

import delivery.samurai.android.ui.auth.signin.presentation.NafathVerificationActivity;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.aw;

/* loaded from: classes2.dex */
public final class i extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ NafathVerificationActivity purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(NafathVerificationActivity nafathVerificationActivity, Nd.c cVar) {
        super(2, cVar);
        this.purple = nafathVerificationActivity;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new i(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((i) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            int i5 = NafathVerificationActivity.f12165N;
            NafathVerificationActivity nafathVerificationActivity = this.purple;
            aw nafathTerminal = nafathVerificationActivity.gray().getNafathTerminal();
            f fVar = new f(nafathVerificationActivity, 1);
            this.alpha = 1;
            if (nafathTerminal.collect(fVar, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
