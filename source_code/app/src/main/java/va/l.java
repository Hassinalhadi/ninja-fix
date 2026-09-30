package va;

import androidx.lifecycle.T;
import delivery.samurai.android.ui.auth.signin.presentation.NafathVerificationActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class l extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ NafathVerificationActivity purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(NafathVerificationActivity nafathVerificationActivity, Nd.c cVar) {
        super(2, cVar);
        this.purple = nafathVerificationActivity;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new l(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            androidx.lifecycle.ab abVar = androidx.lifecycle.ab.alpha;
            NafathVerificationActivity nafathVerificationActivity = this.purple;
            k kVar = new k(nafathVerificationActivity, null);
            this.alpha = 1;
            Object india = T.india(nafathVerificationActivity.getLifecycle(), kVar, this);
            if (india != obj2) {
                india = Unit.INSTANCE;
            }
            if (india == obj2) {
                return obj2;
            }
        }
        return Unit.INSTANCE;
    }
}
