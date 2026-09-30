package com.checkout.components.core;

import com.checkout.components.card.CardComponent;
import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.core.risk.RiskManager;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.model.CardTokenDetails;
import com.checkout.components.interfaces.model.ComponentResult;
import com.checkout.components.interfaces.model.PayRequestPayload;
import com.checkout.components.interfaces.model.PaymentMethodName;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.ab;

/* loaded from: classes3.dex */
public final class t extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public Object f5011a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5012b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5013c;

    /* renamed from: d, reason: collision with root package name */
    public int f5014d;
    public final /* synthetic */ ComponentResult.Success e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InternalCheckoutComponents f5015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f5016g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ComponentCallback f5017h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ComponentResult.Success success, InternalCheckoutComponents internalCheckoutComponents, boolean z2, ComponentCallback componentCallback, Nd.c cVar) {
        super(2, cVar);
        this.e = success;
        this.f5015f = internalCheckoutComponents;
        this.f5016g = z2;
        this.f5017h = componentCallback;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new t(this.e, this.f5015f, this.f5016g, this.f5017h, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        if (r2.submitComponentPayment$core_standardRelease(r15, r13, r4, r14) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e5, code lost:
    
        if (r3.submitComponentPayment$core_standardRelease(r4, r15, r6, r14) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r15 == r0) goto L34;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CardTokenDetails cardTokenDetails;
        RiskManager riskManager;
        String str;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f5014d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
            }
            cardTokenDetails = (CardTokenDetails) this.f5011a;
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            cardTokenDetails = (CardTokenDetails) this.e.getValue();
            riskManager = this.f5015f.f4686l;
            String token = cardTokenDetails.getToken();
            this.f5011a = cardTokenDetails;
            this.f5014d = 1;
            obj = riskManager.publishAndHandleRiskResult$core_standardRelease(token, this);
        }
        String str2 = (String) obj;
        if (!this.f5016g) {
            return Unit.INSTANCE;
        }
        String tokenReference = cardTokenDetails.getTokenReference();
        if (tokenReference != null) {
            InternalCheckoutComponents internalCheckoutComponents = this.f5015f;
            ComponentCallback componentCallback = this.f5017h;
            Object obj2 = ((LinkedHashMap) internalCheckoutComponents.getPaymentMethodComponents$core_standardRelease()).get(PaymentMethodName.INSTANCE.getCard());
            Intrinsics.charlie(obj2, "null cannot be cast to non-null type com.checkout.components.card.CardComponent");
            CardComponent cardComponent = (CardComponent) obj2;
            String token2 = cardTokenDetails.getToken();
            String bin = cardTokenDetails.getBin();
            String access$getAppIdentifier = InternalCheckoutComponents.access$getAppIdentifier(internalCheckoutComponents);
            if (internalCheckoutComponents.isCustomTabAvailable$core_standardRelease()) {
                str = access$getAppIdentifier;
            } else {
                str = null;
            }
            PayRequestPayload.RememberMe rememberMe = new PayRequestPayload.RememberMe(token2, tokenReference, bin, true, str2, null, str);
            this.f5011a = cardTokenDetails;
            this.f5012b = str2;
            this.f5013c = null;
            this.f5014d = 2;
        } else {
            InternalCheckoutComponents internalCheckoutComponents2 = this.f5015f;
            Object obj3 = ((LinkedHashMap) internalCheckoutComponents2.getPaymentMethodComponents$core_standardRelease()).get(PaymentMethodName.INSTANCE.getCard());
            Intrinsics.charlie(obj3, "null cannot be cast to non-null type com.checkout.components.card.CardComponent");
            CardComponent cardComponent2 = (CardComponent) obj3;
            ComponentCallback componentCallback2 = this.f5017h;
            String access$getAppIdentifier2 = InternalCheckoutComponents.access$getAppIdentifier(this.f5015f);
            if (!this.f5015f.isCustomTabAvailable$core_standardRelease()) {
                access$getAppIdentifier2 = null;
            }
            PayRequestPayload.Card card = new PayRequestPayload.Card(cardTokenDetails, str2, access$getAppIdentifier2);
            this.f5011a = null;
            this.f5012b = null;
            this.f5013c = null;
            this.f5014d = 3;
        }
    }
}
