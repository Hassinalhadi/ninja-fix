package Fc;

import da.AbstractC1595a;
import delivery.samurai.android.ui.splash.AuthViewModel;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class k extends Pd.i implements Xd.l {
    public final /* synthetic */ AuthViewModel alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AuthViewModel authViewModel, Nd.c cVar) {
        super(2, cVar);
        this.alpha = authViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new k(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AbstractC1595a.alpha.getAndSet(false);
        AuthViewModel authViewModel = this.alpha;
        AuthViewModel.access$getAuthService$p(authViewModel).foxtrot(true).subscribe(new Fb.k(8, new h(authViewModel, 1)), new j(0, new D0.z(23)));
        return Unit.INSTANCE;
    }
}
