package Fc;

import com.app.network.network.models.UserInfo;
import delivery.samurai.android.ui.splash.AuthViewModel;
import ea.EnumC1644b;
import ea.InterfaceC1643a;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class f extends Pd.i implements Xd.l {
    public final /* synthetic */ AuthViewModel alpha;
    public final /* synthetic */ UserInfo purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AuthViewModel authViewModel, UserInfo userInfo, Nd.c cVar) {
        super(2, cVar);
        this.alpha = authViewModel;
        this.purple = userInfo;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        UserInfo userInfo = this.purple;
        AuthViewModel authViewModel = this.alpha;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        try {
            L9.d.lavender(AuthViewModel.access$getApp$p(authViewModel), userInfo);
            AuthViewModel.access$getUnleashContextUpdater$p(authViewModel).alpha(userInfo);
            AuthViewModel.access$getApp$p(authViewModel).red.mike(userInfo);
            InterfaceC1643a access$getAnalyticsTracker$p = AuthViewModel.access$getAnalyticsTracker$p(authViewModel);
            EnumC1644b[] enumC1644bArr = EnumC1644b.alpha;
            com.google.android.material.datepicker.j.delta(access$getAnalyticsTracker$p);
            AuthViewModel.access$fetchCaptainInfoAfterLogin(authViewModel);
        } catch (Exception e) {
            authViewModel.getErrorObserver().postValue(new Pair(new Integer(903), authViewModel.onHandleError(e)));
        }
        return Unit.INSTANCE;
    }
}
