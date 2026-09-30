package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.model.WalletListItem;
import com.checkout.components.rememberme.model.WalletScreenViewState;
import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class e2 implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3440j f5923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletScreenViewModel f5924b;

    public e2(InterfaceC3440j interfaceC3440j, WalletScreenViewModel walletScreenViewModel) {
        this.f5923a = interfaceC3440j;
        this.f5924b = walletScreenViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        d2 d2Var;
        int i4;
        List<WalletListItem> walletListItems;
        if (cVar instanceof d2) {
            d2Var = (d2) cVar;
            int i5 = d2Var.f5877b;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                d2Var.f5877b = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = d2Var.f5876a;
                Od.a aVar = Od.a.alpha;
                i4 = d2Var.f5877b;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    InterfaceC3440j interfaceC3440j = this.f5923a;
                    String str = (String) obj;
                    WalletScreenViewState walletScreenViewState = (WalletScreenViewState) this.f5924b.getState().getValue();
                    if (walletScreenViewState != null && (walletListItems = walletScreenViewState.getWalletListItems()) != null) {
                        for (WalletListItem walletListItem : walletListItems) {
                            if (Intrinsics.areEqual(walletListItem.getId(), str)) {
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    walletListItem = null;
                    if (walletListItem != null) {
                        d2Var.f5878c = null;
                        d2Var.e = null;
                        d2Var.f5880f = null;
                        d2Var.f5881g = null;
                        d2Var.f5882h = null;
                        d2Var.f5877b = 1;
                        if (interfaceC3440j.emit(walletListItem, d2Var) == aVar) {
                            return aVar;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        d2Var = new d2(this, cVar);
        Object obj22 = d2Var.f5876a;
        Od.a aVar2 = Od.a.alpha;
        i4 = d2Var.f5877b;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }
}
