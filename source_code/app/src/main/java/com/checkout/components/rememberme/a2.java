package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.model.WalletListItem;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class a2 implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3440j f5855a;

    public a2(InterfaceC3440j interfaceC3440j) {
        this.f5855a = interfaceC3440j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        Z1 z12;
        int i4;
        if (cVar instanceof Z1) {
            z12 = (Z1) cVar;
            int i5 = z12.f5846b;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                z12.f5846b = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = z12.f5845a;
                Od.a aVar = Od.a.alpha;
                i4 = z12.f5846b;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    InterfaceC3440j interfaceC3440j = this.f5855a;
                    if (((WalletListItem) obj).getBin() != null) {
                        z12.f5847c = null;
                        z12.f5848d = null;
                        z12.f5849f = null;
                        z12.f5850g = null;
                        z12.f5846b = 1;
                        if (interfaceC3440j.emit(obj, z12) == aVar) {
                            return aVar;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        z12 = new Z1(this, cVar);
        Object obj22 = z12.f5845a;
        Od.a aVar2 = Od.a.alpha;
        i4 = z12.f5846b;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }
}
