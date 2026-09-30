package Fc;

import androidx.lifecycle.az;
import com.app.network.network.models.ResetPasswordRequest;
import delivery.samurai.android.ui.splash.AuthViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class y extends Pd.i implements Xd.l {
    public final /* synthetic */ AuthViewModel alpha;
    public final /* synthetic */ ResetPasswordRequest purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(AuthViewModel authViewModel, ResetPasswordRequest resetPasswordRequest, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = authViewModel;
        this.purple = resetPasswordRequest;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new y(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AuthViewModel authViewModel = this.alpha;
        Single<ResponseBody> mike = AuthViewModel.access$getAuthService$p(authViewModel).mike(this.purple);
        az azVar = this.red;
        mike.subscribe(new Fb.k(13, new Fb.j(azVar, 3)), new Fb.k(14, new d(azVar, authViewModel, 3)));
        return Unit.INSTANCE;
    }
}
