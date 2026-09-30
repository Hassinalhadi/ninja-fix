package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.model.GetWalletResponse;
import com.checkout.components.rememberme.model.WalletScreenViewState;
import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class i2 implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3440j f5959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletScreenViewModel f5960b;

    public i2(InterfaceC3440j interfaceC3440j, WalletScreenViewModel walletScreenViewModel) {
        this.f5959a = interfaceC3440j;
        this.f5960b = walletScreenViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        h2 h2Var;
        int i4;
        WalletScreenViewState a6;
        if (cVar instanceof h2) {
            h2Var = (h2) cVar;
            int i5 = h2Var.f5945b;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                h2Var.f5945b = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = h2Var.f5944a;
                Od.a aVar = Od.a.alpha;
                i4 = h2Var.f5945b;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    InterfaceC3440j interfaceC3440j = this.f5959a;
                    a6 = this.f5960b.a((GetWalletResponse) obj);
                    h2Var.f5946c = null;
                    h2Var.e = null;
                    h2Var.f5948f = null;
                    h2Var.f5949g = null;
                    h2Var.f5945b = 1;
                    if (interfaceC3440j.emit(a6, h2Var) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        h2Var = new h2(this, cVar);
        Object obj22 = h2Var.f5944a;
        Od.a aVar2 = Od.a.alpha;
        i4 = h2Var.f5945b;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }
}
