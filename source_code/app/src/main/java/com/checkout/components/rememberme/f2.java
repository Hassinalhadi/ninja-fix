package com.checkout.components.rememberme;

import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class f2 extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletScreenViewModel f5933b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(WalletScreenViewModel walletScreenViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f5933b = walletScreenViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f2(this.f5933b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new f2(this.f5933b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f5932a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            yf.L state = this.f5933b.getState();
            WalletScreenViewModel walletScreenViewModel = this.f5933b;
            W1 w12 = new W1(walletScreenViewModel);
            this.f5932a = 1;
            Object collect = state.collect(new c2(new Y1(new e2(new a2(w12), walletScreenViewModel))), this);
            if (collect != aVar) {
                collect = Unit.INSTANCE;
            }
            if (collect != aVar) {
                collect = Unit.INSTANCE;
            }
            if (collect != aVar) {
                collect = Unit.INSTANCE;
            }
            if (collect != aVar) {
                collect = Unit.INSTANCE;
            }
            if (collect == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
