package Fc;

import androidx.lifecycle.az;
import da.AbstractC1595a;
import delivery.samurai.android.ui.splash.AuthViewModel;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class i extends Pd.i implements Xd.l {
    public final /* synthetic */ AuthViewModel alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AuthViewModel authViewModel, boolean z2, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = authViewModel;
        this.purple = z2;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new i(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        boolean andSet = AbstractC1595a.alpha.getAndSet(false);
        AuthViewModel authViewModel = this.alpha;
        AuthViewModel.access$getAuthService$p(authViewModel).foxtrot(andSet).subscribe(new Fb.k(6, new g(this.purple, authViewModel, this.red)), new Fb.k(7, new h(authViewModel, 0)));
        return Unit.INSTANCE;
    }
}
