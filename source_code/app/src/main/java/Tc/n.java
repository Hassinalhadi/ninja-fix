package Tc;

import com.app.network.network.models.Wallet;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.wallet.WalletViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import vf.ab;
import yf.N;

/* loaded from: classes2.dex */
public final class n extends Pd.i implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ WalletViewModel purple;
    public final /* synthetic */ DataResponse red;
    public final /* synthetic */ Wallet silver;
    public final /* synthetic */ boolean teal;
    public final /* synthetic */ Float white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i4, WalletViewModel walletViewModel, DataResponse dataResponse, Wallet wallet, boolean z2, Float f5, Nd.c cVar) {
        super(2, cVar);
        this.alpha = i4;
        this.purple = walletViewModel;
        this.red = dataResponse;
        this.silver = wallet;
        this.teal = z2;
        this.white = f5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new n(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        int i4 = this.alpha;
        WalletViewModel walletViewModel = this.purple;
        if (i4 == 0) {
            walletViewModel.india.clear();
        }
        walletViewModel.india.addAll(this.red.getItems());
        Wallet wallet = this.silver;
        Intrinsics.checkNotNull(wallet);
        l lVar = new l(wallet, CollectionsKt.z(walletViewModel.india), this.teal, this.white);
        N n5 = walletViewModel.charlie;
        n5.getClass();
        n5.juliet(null, lVar);
        walletViewModel.hotel = false;
        return Unit.INSTANCE;
    }
}
