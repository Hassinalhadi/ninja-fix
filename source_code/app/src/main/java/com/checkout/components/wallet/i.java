package com.checkout.components.wallet;

import Xd.l;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.wallet.WalletComponent;
import com.checkout.components.wallet.ui.model.WalletComponentConfig;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class i extends Pd.i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WalletComponent f6521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6522b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(WalletComponent walletComponent, String str, Nd.c cVar) {
        super(2, cVar);
        this.f6521a = walletComponent;
        this.f6522b = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new i(this.f6521a, this.f6522b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.f6521a, this.f6522b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        WalletComponentConfig walletComponentConfig;
        WalletComponentConfig walletComponentConfig2;
        ComponentCallback componentCallback;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        WalletComponent.Companion companion = WalletComponent.INSTANCE;
        WalletComponent walletComponent = this.f6521a;
        walletComponentConfig = walletComponent.f6441a;
        Logger logger = walletComponentConfig.getLogger();
        walletComponentConfig2 = this.f6521a.f6441a;
        LogDetails logDetails = walletComponentConfig2.getLogDetails();
        componentCallback = this.f6521a.getComponentCallback();
        companion.handlePaymentAttemptError$wallet_standardRelease(walletComponent, logger, logDetails, componentCallback.getOnError(), this.f6522b);
        return Unit.INSTANCE;
    }
}
