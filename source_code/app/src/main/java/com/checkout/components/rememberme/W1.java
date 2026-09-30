package com.checkout.components.rememberme;

import a2.C0393r;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.interfaces.data.PrimitiveStateRepository;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.rememberme.model.RememberMeCallback;
import com.checkout.components.rememberme.model.WalletListItem;
import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vf.AbstractC3220y;
import vf.ad;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class W1 implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WalletScreenViewModel f5828a;

    public W1(WalletScreenViewModel walletScreenViewModel) {
        this.f5828a = walletScreenViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // yf.InterfaceC3440j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(WalletListItem walletListItem, Nd.c cVar) {
        V1 v1;
        int i4;
        AbstractC3220y abstractC3220y;
        Result result;
        PrimitiveStateRepository primitiveStateRepository;
        RememberMeCallback rememberMeCallback;
        Function1<CardMetadata, CallbackResult> onCardBinChanged;
        if (cVar instanceof V1) {
            v1 = (V1) cVar;
            int i5 = v1.f5820d;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                v1.f5820d = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = v1.f5818b;
                Od.a aVar = Od.a.alpha;
                i4 = v1.f5820d;
                CallbackResult callbackResult = null;
                if (i4 != 0) {
                    ResultKt.alpha(obj);
                    abstractC3220y = this.f5828a.f6395r;
                    U1 u12 = new U1(this.f5828a, walletListItem, null);
                    v1.f5817a = walletListItem;
                    v1.f5820d = 1;
                    obj = ad.blue(abstractC3220y, u12, v1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    walletListItem = v1.f5817a;
                    ResultKt.alpha(obj);
                }
                result = (Result) obj;
                if (result != null) {
                    Object obj2 = result.alpha;
                    if (obj2 instanceof kotlin.k) {
                        obj2 = null;
                    }
                    CardMetadata cardMetadata = (CardMetadata) obj2;
                    if (cardMetadata != null) {
                        WalletScreenViewModel walletScreenViewModel = this.f5828a;
                        primitiveStateRepository = walletScreenViewModel.f6389l;
                        primitiveStateRepository.update((Function1) new C0393r(2, walletListItem, cardMetadata));
                        rememberMeCallback = walletScreenViewModel.f6390m;
                        if (rememberMeCallback != null && (onCardBinChanged = rememberMeCallback.getOnCardBinChanged()) != null) {
                            callbackResult = onCardBinChanged.invoke(cardMetadata);
                        }
                        if (callbackResult instanceof CallbackResult.Rejected) {
                            walletScreenViewModel.handleUnsupportedCard$rememberme_standardRelease(((CallbackResult.Rejected) callbackResult).getErrorMessage(), cardMetadata.getScheme(), walletListItem.getId());
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        v1 = new V1(this, cVar);
        Object obj3 = v1.f5818b;
        Od.a aVar2 = Od.a.alpha;
        i4 = v1.f5820d;
        CallbackResult callbackResult2 = null;
        if (i4 != 0) {
        }
        result = (Result) obj3;
        if (result != null) {
        }
        return Unit.INSTANCE;
    }

    public static final Map a(WalletListItem walletListItem, CardMetadata cardMetadata, Map currentMap) {
        Intrinsics.echo(currentMap, "currentMap");
        LinkedHashMap amber = kotlin.collections.y.amber(currentMap);
        amber.put(walletListItem.getId(), cardMetadata);
        return amber;
    }
}
