package Fc;

import androidx.lifecycle.az;
import delivery.samurai.android.ui.splash.AuthViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class u extends Pd.i implements Xd.l {
    public final /* synthetic */ AuthViewModel alpha;
    public final /* synthetic */ az purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Nd.c cVar, az azVar, AuthViewModel authViewModel) {
        super(2, cVar);
        this.alpha = authViewModel;
        this.purple = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new u(cVar, this.purple, this.alpha);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AuthViewModel authViewModel = this.alpha;
        Single<ResponseBody> lima = AuthViewModel.access$getAuthService$p(authViewModel).lima();
        az azVar = this.purple;
        lima.subscribe(new Fb.k(9, new d(authViewModel, azVar, 1)), new Fb.k(10, new d(azVar, authViewModel, 2)));
        return Unit.INSTANCE;
    }
}
