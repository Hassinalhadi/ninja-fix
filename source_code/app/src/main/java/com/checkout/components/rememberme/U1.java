package com.checkout.components.rememberme;

import com.checkout.components.rememberme.model.WalletListItem;
import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class U1 extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletScreenViewModel f5813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WalletListItem f5814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1(WalletScreenViewModel walletScreenViewModel, WalletListItem walletListItem, Nd.c cVar) {
        super(2, cVar);
        this.f5813b = walletScreenViewModel;
        this.f5814c = walletListItem;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new U1(this.f5813b, this.f5814c, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new U1(this.f5813b, this.f5814c, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Xd.l lVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f5812a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        lVar = this.f5813b.e;
        String bin = this.f5814c.getBin();
        if (bin == null) {
            bin = "";
        }
        this.f5812a = 1;
        Object invoke = lVar.invoke(bin, this);
        if (invoke == aVar) {
            return aVar;
        }
        return invoke;
    }
}
