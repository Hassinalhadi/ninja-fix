package com.checkout.components.core;

import com.checkout.components.card.CardComponent;
import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.core.risk.RiskManager;
import com.checkout.components.interfaces.component.CheckoutComponentConfiguration;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.model.PayRequestPayload;
import com.checkout.components.interfaces.model.PaymentMethodName;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public InternalCheckoutComponents f5095a;

    /* renamed from: b, reason: collision with root package name */
    public CardComponent f5096b;

    /* renamed from: c, reason: collision with root package name */
    public ComponentCallback f5097c;

    /* renamed from: d, reason: collision with root package name */
    public PayRequestPayload.RememberMe f5098d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InternalCheckoutComponents f5099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PayRequestPayload.RememberMe f5100g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(InternalCheckoutComponents internalCheckoutComponents, PayRequestPayload.RememberMe rememberMe, Nd.c cVar) {
        super(2, cVar);
        this.f5099f = internalCheckoutComponents;
        this.f5100g = rememberMe;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new x(this.f5099f, this.f5100g, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new x(this.f5099f, this.f5100g, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b3, code lost:
    
        if (r6.submitComponentPayment$core_standardRelease(r15, r2, r5, r17) == r1) goto L23;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InternalCheckoutComponents internalCheckoutComponents;
        CheckoutComponentConfiguration.Payment payment;
        ComponentCallback componentCallback;
        RiskManager riskManager;
        Object publishAndHandleRiskResult$core_standardRelease;
        CardComponent cardComponent;
        PayRequestPayload.RememberMe rememberMe;
        String str;
        Od.a aVar = Od.a.alpha;
        int i4 = this.e;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PayRequestPayload.RememberMe rememberMe2 = this.f5098d;
            ComponentCallback componentCallback2 = this.f5097c;
            CardComponent cardComponent2 = this.f5096b;
            internalCheckoutComponents = this.f5095a;
            ResultKt.alpha(obj);
            cardComponent = cardComponent2;
            rememberMe = rememberMe2;
            componentCallback = componentCallback2;
            publishAndHandleRiskResult$core_standardRelease = obj;
        } else {
            ResultKt.alpha(obj);
            internalCheckoutComponents = this.f5099f;
            Object obj2 = ((LinkedHashMap) internalCheckoutComponents.getPaymentMethodComponents$core_standardRelease()).get(PaymentMethodName.INSTANCE.getCard());
            Intrinsics.charlie(obj2, "null cannot be cast to non-null type com.checkout.components.card.CardComponent");
            CardComponent cardComponent3 = (CardComponent) obj2;
            payment = this.f5099f.f4676a;
            componentCallback = payment.getComponentCallback();
            if (componentCallback == null) {
                componentCallback = ComponentCallback.INSTANCE.getNO_OPS();
            }
            PayRequestPayload.RememberMe rememberMe3 = this.f5100g;
            riskManager = this.f5099f.f4686l;
            String token = this.f5100g.getToken();
            this.f5095a = internalCheckoutComponents;
            this.f5096b = cardComponent3;
            this.f5097c = componentCallback;
            this.f5098d = rememberMe3;
            this.e = 1;
            publishAndHandleRiskResult$core_standardRelease = riskManager.publishAndHandleRiskResult$core_standardRelease(token, this);
            if (publishAndHandleRiskResult$core_standardRelease != aVar) {
                cardComponent = cardComponent3;
                rememberMe = rememberMe3;
            }
            return aVar;
        }
        String str2 = (String) publishAndHandleRiskResult$core_standardRelease;
        String access$getAppIdentifier = InternalCheckoutComponents.access$getAppIdentifier(this.f5099f);
        if (this.f5099f.isCustomTabAvailable$core_standardRelease()) {
            str = access$getAppIdentifier;
        } else {
            str = null;
        }
        PayRequestPayload.RememberMe copy$default = PayRequestPayload.RememberMe.copy$default(rememberMe, null, null, null, false, str2, null, str, 47, null);
        this.f5095a = null;
        this.f5096b = null;
        this.f5097c = null;
        this.f5098d = null;
        this.e = 2;
    }
}
