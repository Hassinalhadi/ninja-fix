package Fc;

import androidx.lifecycle.az;
import com.app.network.network.models.DeviceInfo;
import delivery.samurai.android.ui.splash.AuthViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ab extends Pd.i implements Xd.l {
    public final /* synthetic */ AuthViewModel alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(AuthViewModel authViewModel, String str, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = authViewModel;
        this.purple = str;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ab(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ab) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AuthViewModel authViewModel = this.alpha;
        DeviceInfo alpha = L9.d.alpha(AuthViewModel.access$getApp$p(authViewModel));
        alpha.setInstallationUid(this.purple);
        Single<DeviceInfo> hotel = AuthViewModel.access$getAuthService$p(authViewModel).hotel(alpha);
        az azVar = this.red;
        hotel.subscribe(new Fb.k(15, new w(authViewModel, alpha, azVar, 1)), new Fb.k(16, new d(authViewModel, azVar, 4)));
        return Unit.INSTANCE;
    }
}
