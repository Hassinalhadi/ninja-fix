package com.checkout.components.rememberme;

import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class j2 extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletScreenViewModel f5969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(WalletScreenViewModel walletScreenViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f5969b = walletScreenViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new j2(this.f5969b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new j2(this.f5969b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        PrimitiveStateFlowRepository primitiveStateFlowRepository;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f5968a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            primitiveStateFlowRepository = this.f5969b.f6381c;
            yf.L flow = primitiveStateFlowRepository.getFlow();
            WalletScreenViewModel walletScreenViewModel = this.f5969b;
            g2 g2Var = new g2(walletScreenViewModel);
            this.f5968a = 1;
            Object collect = flow.collect(new i2(g2Var, walletScreenViewModel), this);
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
