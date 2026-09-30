package com.checkout.components.rememberme;

import com.checkout.components.rememberme.model.WalletListItem;
import com.checkout.components.rememberme.model.WalletScreenViewState;
import com.checkout.components.rememberme.wallet.WalletButtonDelegate;
import com.checkout.components.rememberme.wallet.WalletCvvDelegate;
import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l2 extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public Object f5991a;

    /* renamed from: b, reason: collision with root package name */
    public int f5992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WalletScreenViewModel f5993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(WalletScreenViewModel walletScreenViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f5993c = walletScreenViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new l2(this.f5993c, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new l2(this.f5993c, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        WalletListItem walletListItem;
        WalletButtonDelegate walletButtonDelegate;
        WalletCvvDelegate walletCvvDelegate;
        List<WalletListItem> walletListItems;
        Object obj2;
        String str;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f5992b;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            WalletScreenViewState walletScreenViewState = (WalletScreenViewState) this.f5993c.getState().getValue();
            if (walletScreenViewState != null && (walletListItems = walletScreenViewState.getWalletListItems()) != null) {
                WalletScreenViewModel walletScreenViewModel = this.f5993c;
                Iterator<T> it = walletListItems.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        String id2 = ((WalletListItem) obj2).getId();
                        WalletScreenViewState walletScreenViewState2 = (WalletScreenViewState) walletScreenViewModel.getState().getValue();
                        if (walletScreenViewState2 != null) {
                            str = walletScreenViewState2.getSelectedMethodId();
                        } else {
                            str = null;
                        }
                        if (Intrinsics.areEqual(id2, str)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                walletListItem = (WalletListItem) obj2;
            } else {
                walletListItem = null;
            }
            if (walletListItem != null && walletListItem.getShowCvvInputField()) {
                walletCvvDelegate = this.f5993c.f6379a;
                if (!walletCvvDelegate.validateCvv$rememberme_standardRelease()) {
                    return Unit.INSTANCE;
                }
            }
            walletButtonDelegate = this.f5993c.f6392o;
            this.f5991a = null;
            this.f5992b = 1;
            if (walletButtonDelegate.onClick$rememberme_standardRelease(this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
