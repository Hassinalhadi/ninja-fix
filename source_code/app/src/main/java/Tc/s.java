package Tc;

import delivery.samurai.android.ui.wallet.WalletViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.N;

/* loaded from: classes2.dex */
public final class s extends Pd.i implements Xd.l {
    public final /* synthetic */ WalletViewModel alpha;
    public final /* synthetic */ Throwable purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(WalletViewModel walletViewModel, Throwable th, Nd.c cVar) {
        super(2, cVar);
        this.alpha = walletViewModel;
        this.purple = th;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new s(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        WalletViewModel walletViewModel = this.alpha;
        d dVar = new d(walletViewModel.onHandleError(this.purple));
        N n5 = walletViewModel.echo;
        n5.getClass();
        n5.juliet(null, dVar);
        return Unit.INSTANCE;
    }
}
