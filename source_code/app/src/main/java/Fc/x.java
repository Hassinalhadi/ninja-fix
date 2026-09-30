package Fc;

import androidx.lifecycle.az;
import com.app.network.network.models.AppState;
import com.app.network.network.models.DeviceInfo;
import delivery.samurai.android.ui.splash.AuthViewModel;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class x extends Pd.i implements Xd.l {
    public final /* synthetic */ az alpha;
    public final /* synthetic */ AuthViewModel purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Nd.c cVar, az azVar, AuthViewModel authViewModel) {
        super(2, cVar);
        this.alpha = azVar;
        this.purple = authViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new x(cVar, this.alpha, this.purple);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AppState appState = AppState.REGISTERING_DEVICE;
        az azVar = this.alpha;
        azVar.postValue(appState);
        AuthViewModel authViewModel = this.purple;
        DeviceInfo alpha = L9.d.alpha(AuthViewModel.access$getApp$p(authViewModel));
        AuthViewModel.access$getAuthService$p(authViewModel).india(alpha).subscribe(new Fb.k(11, new w(authViewModel, alpha, azVar, 0)), new Fb.k(12, new h(authViewModel, 2)));
        return Unit.INSTANCE;
    }
}
