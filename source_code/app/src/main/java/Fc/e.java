package Fc;

import androidx.lifecycle.az;
import com.app.network.network.models.ChangePasswordRequest;
import delivery.samurai.android.ui.splash.AuthViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class e extends Pd.i implements Xd.l {
    public final /* synthetic */ AuthViewModel alpha;
    public final /* synthetic */ ChangePasswordRequest purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AuthViewModel authViewModel, ChangePasswordRequest changePasswordRequest, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = authViewModel;
        this.purple = changePasswordRequest;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new e(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AuthViewModel authViewModel = this.alpha;
        Single<ResponseBody> alpha = AuthViewModel.access$getAuthService$p(authViewModel).alpha(this.purple);
        az azVar = this.red;
        alpha.subscribe(new Fb.k(4, new Fb.j(azVar, 2)), new Fb.k(5, new d(azVar, authViewModel, 0)));
        return Unit.INSTANCE;
    }
}
