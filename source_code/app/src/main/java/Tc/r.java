package Tc;

import com.app.network.network.models.WalletSettlementResponse;
import delivery.samurai.android.ui.wallet.WalletViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.N;

/* loaded from: classes2.dex */
public final class r extends Pd.i implements Xd.l {
    public final /* synthetic */ WalletViewModel alpha;
    public final /* synthetic */ WalletSettlementResponse purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ String silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(WalletViewModel walletViewModel, WalletSettlementResponse walletSettlementResponse, String str, String str2, Nd.c cVar) {
        super(2, cVar);
        this.alpha = walletViewModel;
        this.purple = walletSettlementResponse;
        this.red = str;
        this.silver = str2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new r(this.alpha, this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        WalletViewModel walletViewModel = this.alpha;
        g gVar = new g(r1.getWalletTopup().getId(), this.purple.getWalletTopup().getPaymentSession(), this.red, this.silver);
        N n5 = walletViewModel.echo;
        n5.getClass();
        n5.juliet(null, gVar);
        return Unit.INSTANCE;
    }
}
