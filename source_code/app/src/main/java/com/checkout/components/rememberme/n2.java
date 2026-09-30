package com.checkout.components.rememberme;

import com.checkout.components.rememberme.ui.manager.RMStateManager;
import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;
import yf.at;

/* loaded from: classes3.dex */
public final class n2 extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f6160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletScreenViewModel f6161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(WalletScreenViewModel walletScreenViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f6161b = walletScreenViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new n2(this.f6161b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new n2(this.f6161b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        RMStateManager rMStateManager;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f6160a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        rMStateManager = this.f6161b.f6391n;
        at uiPaymentErrorMessage = rMStateManager.getUiPaymentErrorMessage();
        m2 m2Var = new m2(this.f6161b);
        this.f6160a = 1;
        ((yf.N) uiPaymentErrorMessage).collect(m2Var, this);
        return aVar;
    }
}
