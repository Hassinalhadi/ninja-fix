package com.checkout.components.wallet;

import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class f extends Pd.i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WalletComponent f6509a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WalletComponent walletComponent, Nd.c cVar) {
        super(2, cVar);
        this.f6509a = walletComponent;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f(this.f6509a, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.f6509a, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        this.f6509a.getMediator().payByGooglePay();
        return Unit.INSTANCE;
    }
}
