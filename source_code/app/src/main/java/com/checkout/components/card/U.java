package com.checkout.components.card;

import com.checkout.components.card.ui.manager.PaymentFormStateManager;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class U extends Pd.i implements Xd.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f3966a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f3967b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f3968c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f3969d;
    public /* synthetic */ boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PaymentFormStateManager f3970f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(PaymentFormStateManager paymentFormStateManager, Nd.c cVar) {
        super(6, cVar);
        this.f3970f = paymentFormStateManager;
    }

    @Override // Xd.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        boolean booleanValue4 = ((Boolean) obj4).booleanValue();
        boolean booleanValue5 = ((Boolean) obj5).booleanValue();
        U u4 = new U(this.f3970f, (Nd.c) obj6);
        u4.f3966a = booleanValue;
        u4.f3967b = booleanValue2;
        u4.f3968c = booleanValue3;
        u4.f3969d = booleanValue4;
        u4.e = booleanValue5;
        return u4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        boolean z10 = this.f3966a;
        boolean z11 = this.f3967b;
        boolean z12 = this.f3968c;
        boolean z13 = this.f3969d;
        boolean z14 = this.e;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        PaymentFormStateManager paymentFormStateManager = this.f3970f;
        boolean isCvvAccepted = paymentFormStateManager.isCvvAccepted(z13, z14, paymentFormStateManager.getDisplayCvvConfiguration());
        if (z10 && z11 && z12 && isCvvAccepted) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
