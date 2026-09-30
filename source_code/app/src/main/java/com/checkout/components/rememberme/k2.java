package com.checkout.components.rememberme;

import com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.usecase.LogoutUseCase;
import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class k2 extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletScreenViewModel f5984b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(WalletScreenViewModel walletScreenViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f5984b = walletScreenViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new k2(this.f5984b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new k2(this.f5984b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        LogoutUseCase logoutUseCase;
        PrimitiveSharedFlowRepository primitiveSharedFlowRepository;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f5983a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            logoutUseCase = this.f5984b.f6383f;
            logoutUseCase.invoke$rememberme_standardRelease();
            primitiveSharedFlowRepository = this.f5984b.f6393p;
            RememberMeScreen.Alternative alternative = RememberMeScreen.Alternative.INSTANCE;
            this.f5983a = 1;
            if (primitiveSharedFlowRepository.emit(alternative, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
