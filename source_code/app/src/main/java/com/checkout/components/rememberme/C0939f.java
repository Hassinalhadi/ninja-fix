package com.checkout.components.rememberme;

import F.C0103e2;
import F.EnumC0107f2;
import Yb.C0312j0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ad;
import com.checkout.components.rememberme.webview.BottomSheetWebViewState;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;

/* renamed from: com.checkout.components.rememberme.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0939f extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0103e2 f5926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BottomSheetWebViewState f5927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0939f(C0103e2 c0103e2, BottomSheetWebViewState bottomSheetWebViewState, Nd.c cVar) {
        super(2, cVar);
        this.f5926b = c0103e2;
        this.f5927c = bottomSheetWebViewState;
    }

    public static final EnumC0107f2 a(C0103e2 c0103e2) {
        return (EnumC0107f2) ((ad) c0103e2.bravo.juliet).getValue();
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0939f(this.f5926b, this.f5927c, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0939f(this.f5926b, this.f5927c, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f5925a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            InterfaceC3439i lima = AbstractC3428A.lima(C0564b.bronze(new C0312j0(6, this.f5926b)));
            C0936e c0936e = new C0936e(this.f5927c);
            this.f5925a = 1;
            if (lima.collect(c0936e, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
