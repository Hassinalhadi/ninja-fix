package com.checkout.components.rememberme;

import F.EnumC0107f2;
import com.checkout.components.rememberme.webview.BottomSheetWebViewState;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* renamed from: com.checkout.components.rememberme.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0936e implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetWebViewState f5915a;

    public C0936e(BottomSheetWebViewState bottomSheetWebViewState) {
        this.f5915a = bottomSheetWebViewState;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        boolean z2;
        EnumC0107f2 enumC0107f2 = (EnumC0107f2) obj;
        BottomSheetWebViewState bottomSheetWebViewState = this.f5915a;
        if (enumC0107f2 == EnumC0107f2.purple) {
            z2 = true;
        } else {
            z2 = false;
        }
        bottomSheetWebViewState.updateExpansionState(z2);
        return Unit.INSTANCE;
    }
}
