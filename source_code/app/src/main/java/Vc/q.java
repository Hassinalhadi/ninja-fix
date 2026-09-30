package Vc;

import androidx.compose.runtime.D0;
import androidx.lifecycle.T;
import delivery.samurai.android.ui.wallet.WalletViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import vf.ad;
import vf.ao;

/* loaded from: classes2.dex */
public final class q extends Pd.i implements Xd.l {
    public final /* synthetic */ WalletViewModel alpha;
    public final /* synthetic */ D0 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(WalletViewModel walletViewModel, D0 d02, Nd.c cVar) {
        super(2, cVar);
        this.alpha = walletViewModel;
        this.purple = d02;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new q(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        D0 d02 = this.purple;
        int i4 = r.bravo;
        if (((Boolean) d02.getValue()).booleanValue()) {
            WalletViewModel walletViewModel = this.alpha;
            Tc.m mVar = (Tc.m) walletViewModel.charlie.getValue();
            if ((mVar instanceof Tc.l) && ((Tc.l) mVar).charlie && !walletViewModel.hotel) {
                walletViewModel.hotel = true;
                int i5 = walletViewModel.golf + 1;
                walletViewModel.golf = i5;
                V1.a hotel = T.hotel(walletViewModel);
                Cf.e eVar = ao.alpha;
                ad.zulu(hotel, Cf.d.purple, null, new Tc.p(walletViewModel, i5, null), 2);
            }
        }
        return Unit.INSTANCE;
    }
}
