package Tc;

import delivery.samurai.android.ui.wallet.WalletViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.N;

/* loaded from: classes2.dex */
public final class o extends Pd.i implements Xd.l {
    public final /* synthetic */ WalletViewModel alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Throwable red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(WalletViewModel walletViewModel, int i4, Throwable th, Nd.c cVar) {
        super(2, cVar);
        this.alpha = walletViewModel;
        this.purple = i4;
        this.red = th;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new o(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        WalletViewModel walletViewModel = this.alpha;
        walletViewModel.hotel = false;
        if (this.purple == 0) {
            j jVar = new j(walletViewModel.onHandleError(this.red));
            N n5 = walletViewModel.charlie;
            n5.getClass();
            n5.juliet(null, jVar);
        }
        return Unit.INSTANCE;
    }
}
