package Fc;

import com.app.network.network.models.SignUpRequest;
import delivery.samurai.android.ui.splash.AuthViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import yf.N;
import yf.at;

/* loaded from: classes2.dex */
public final class ac extends Pd.i implements Xd.l {
    public final /* synthetic */ AuthViewModel alpha;
    public final /* synthetic */ Function1 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(AuthViewModel authViewModel, Function1 function1, Nd.c cVar) {
        super(2, cVar);
        this.alpha = authViewModel;
        this.purple = function1;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ac(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ac) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AuthViewModel authViewModel = this.alpha;
        at access$get_signUpRequest$p = AuthViewModel.access$get_signUpRequest$p(authViewModel);
        SignUpRequest copy$default = SignUpRequest.copy$default((SignUpRequest) ((N) AuthViewModel.access$get_signUpRequest$p(authViewModel)).getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
        this.purple.invoke(copy$default);
        ((N) access$get_signUpRequest$p).india(copy$default);
        return Unit.INSTANCE;
    }
}
