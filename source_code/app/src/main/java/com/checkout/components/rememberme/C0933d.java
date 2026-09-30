package com.checkout.components.rememberme;

import com.checkout.components.rememberme.webview.BottomSheetWebViewState;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: com.checkout.components.rememberme.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0933d extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetWebViewState f5872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5873b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0933d(BottomSheetWebViewState bottomSheetWebViewState, String str, Nd.c cVar) {
        super(2, cVar);
        this.f5872a = bottomSheetWebViewState;
        this.f5873b = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0933d(this.f5872a, this.f5873b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0933d(this.f5872a, this.f5873b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        this.f5872a.resetForNewUrl(this.f5873b);
        return Unit.INSTANCE;
    }
}
