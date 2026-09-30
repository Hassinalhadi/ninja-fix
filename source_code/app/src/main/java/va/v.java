package va;

import delivery.samurai.android.ui.auth.signin.presentation.SignInActivity;
import delivery.samurai.android.ui.splash.AuthViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.AbstractC3428A;
import yf.L;

/* loaded from: classes2.dex */
public final class v extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ SignInActivity purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(SignInActivity signInActivity, Nd.c cVar) {
        super(2, cVar);
        this.purple = signInActivity;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new v(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            int i5 = SignInActivity.f12172P;
            SignInActivity signInActivity = this.purple;
            L signInResponseState = ((AuthViewModel) signInActivity.f12174I.getValue()).getSignInResponseState();
            u uVar = new u(signInActivity, null);
            this.alpha = 1;
            if (AbstractC3428A.kilo(signInResponseState, uVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
