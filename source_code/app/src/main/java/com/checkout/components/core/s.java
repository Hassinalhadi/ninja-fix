package com.checkout.components.core;

import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.core.risk.RiskManager;
import com.checkout.components.interfaces.component.CheckoutComponentConfiguration;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.model.PayRequestPayload;
import com.checkout.components.wallet.WalletComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class s extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public Object f5006a;

    /* renamed from: b, reason: collision with root package name */
    public int f5007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InternalCheckoutComponents f5008c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WalletComponent f5009d;
    public final /* synthetic */ ComponentCallback e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f5010f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(InternalCheckoutComponents internalCheckoutComponents, WalletComponent walletComponent, ComponentCallback componentCallback, String str, Nd.c cVar) {
        super(2, cVar);
        this.f5008c = internalCheckoutComponents;
        this.f5009d = walletComponent;
        this.e = componentCallback;
        this.f5010f = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new s(this.f5008c, this.f5009d, this.e, this.f5010f, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (r1.submitComponentPayment$core_standardRelease(r3, r5, r9, r10) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r11 == r0) goto L19;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RiskManager riskManager;
        CheckoutComponentConfiguration.Payment payment;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f5007b;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            riskManager = this.f5008c.f4686l;
            this.f5007b = 1;
            obj = riskManager.publishAndHandleRiskResult$core_standardRelease(null, this);
        }
        String str = (String) obj;
        InternalCheckoutComponents internalCheckoutComponents = this.f5008c;
        WalletComponent walletComponent = this.f5009d;
        ComponentCallback componentCallback = this.e;
        payment = internalCheckoutComponents.f4676a;
        String publicKey = payment.getPublicKey();
        String str2 = this.f5010f;
        String access$getAppIdentifier = InternalCheckoutComponents.access$getAppIdentifier(this.f5008c);
        if (!this.f5008c.isCustomTabAvailable$core_standardRelease()) {
            access$getAppIdentifier = null;
        }
        PayRequestPayload.GooglePay googlePay = new PayRequestPayload.GooglePay(publicKey, str2, str, access$getAppIdentifier);
        this.f5006a = null;
        this.f5007b = 2;
    }
}
