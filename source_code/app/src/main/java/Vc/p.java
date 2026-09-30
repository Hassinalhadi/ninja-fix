package Vc;

import delivery.samurai.android.ui.wallet.WalletViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class p extends Pd.i implements Xd.l {
    public final /* synthetic */ WalletViewModel alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(WalletViewModel walletViewModel, Nd.c cVar) {
        super(2, cVar);
        this.alpha = walletViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new p(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        this.alpha.alpha();
        return Unit.INSTANCE;
    }
}
