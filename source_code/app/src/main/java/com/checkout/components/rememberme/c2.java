package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.model.WalletScreenViewState;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class c2 implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3440j f5870a;

    public c2(InterfaceC3440j interfaceC3440j) {
        this.f5870a = interfaceC3440j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        b2 b2Var;
        int i4;
        String str;
        if (cVar instanceof b2) {
            b2Var = (b2) cVar;
            int i5 = b2Var.f5861b;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                b2Var.f5861b = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = b2Var.f5860a;
                Od.a aVar = Od.a.alpha;
                i4 = b2Var.f5861b;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    InterfaceC3440j interfaceC3440j = this.f5870a;
                    WalletScreenViewState walletScreenViewState = (WalletScreenViewState) obj;
                    if (walletScreenViewState != null) {
                        str = walletScreenViewState.getSelectedMethodId();
                    } else {
                        str = null;
                    }
                    b2Var.f5862c = null;
                    b2Var.e = null;
                    b2Var.f5864f = null;
                    b2Var.f5865g = null;
                    b2Var.f5861b = 1;
                    if (interfaceC3440j.emit(str, b2Var) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        b2Var = new b2(this, cVar);
        Object obj22 = b2Var.f5860a;
        Od.a aVar2 = Od.a.alpha;
        i4 = b2Var.f5861b;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }
}
