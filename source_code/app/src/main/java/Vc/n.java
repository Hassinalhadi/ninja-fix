package Vc;

import Tc.t;
import androidx.lifecycle.T;
import com.app.network.network.models.Currency;
import com.app.network.network.models.Wallet;
import delivery.samurai.android.ui.wallet.WalletViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import t6.Q2;
import vf.ad;
import vf.ao;
import yf.N;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ WalletViewModel purple;

    public /* synthetic */ n(WalletViewModel walletViewModel, int i4) {
        this.alpha = i4;
        this.purple = walletViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Tc.l lVar;
        String str;
        Wallet wallet;
        Currency currency;
        String localizedName;
        float f5;
        float abs;
        WalletViewModel walletViewModel = this.purple;
        switch (this.alpha) {
            case 0:
                N n5 = walletViewModel.echo;
                if (!(n5.getValue() instanceof Tc.f)) {
                    n5.juliet(null, Tc.f.alpha);
                    Object value = walletViewModel.charlie.getValue();
                    if (value instanceof Tc.l) {
                        lVar = (Tc.l) value;
                    } else {
                        lVar = null;
                    }
                    String str2 = "";
                    if (lVar == null) {
                        str = "";
                    } else {
                        Float f10 = lVar.delta;
                        if (f10 != null) {
                            abs = f10.floatValue();
                        } else {
                            Float balance = lVar.alpha.getBalance();
                            if (balance != null) {
                                f5 = balance.floatValue();
                            } else {
                                f5 = 0.0f;
                            }
                            abs = Math.abs(f5);
                        }
                        str = Q2.bravo(abs);
                    }
                    if (lVar != null && (wallet = lVar.alpha) != null && (currency = wallet.getCurrency()) != null && (localizedName = currency.getLocalizedName()) != null) {
                        str2 = localizedName;
                    }
                    V1.a hotel = T.hotel(walletViewModel);
                    Cf.e eVar = ao.alpha;
                    ad.zulu(hotel, Cf.d.purple, null, new t(walletViewModel, str, str2, null), 2);
                }
                return Unit.INSTANCE;
            case 1:
                walletViewModel.alpha();
                return Unit.INSTANCE;
            case 2:
                walletViewModel.bravo();
                return Unit.INSTANCE;
            case 3:
                walletViewModel.bravo();
                return Unit.INSTANCE;
            case 4:
                walletViewModel.bravo();
                walletViewModel.alpha();
                return Unit.INSTANCE;
            default:
                walletViewModel.bravo();
                return Unit.INSTANCE;
        }
    }
}
