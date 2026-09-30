package com.checkout.components.core;

import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.core.network.model.request.PayPaymentSessionRequest;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ComponentCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class w extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public Object f5090a;

    /* renamed from: b, reason: collision with root package name */
    public int f5091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComponentCallback f5092c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InternalCheckoutComponents f5093d;
    public final /* synthetic */ PaymentMethodComponent e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PayPaymentSessionRequest f5094f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(InternalCheckoutComponents internalCheckoutComponents, PaymentMethodComponent paymentMethodComponent, ComponentCallback componentCallback, PayPaymentSessionRequest payPaymentSessionRequest, Nd.c cVar) {
        super(2, cVar);
        this.f5092c = componentCallback;
        this.f5093d = internalCheckoutComponents;
        this.e = paymentMethodComponent;
        this.f5094f = payPaymentSessionRequest;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new w(this.f5093d, this.e, this.f5092c, this.f5094f, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (com.checkout.components.core.common.components.InternalCheckoutComponents.access$handleCustomSubmission(r4, r5, r6, r7, r8, r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (com.checkout.components.core.common.components.InternalCheckoutComponents.access$handleDirectApiCall(r1, r3, r4, r5, r10) == r0) goto L17;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f5091b;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            Xd.l handleSubmit = this.f5092c.getHandleSubmit();
            if (handleSubmit != null) {
                InternalCheckoutComponents internalCheckoutComponents = this.f5093d;
                PaymentMethodComponent paymentMethodComponent = this.e;
                ComponentCallback componentCallback = this.f5092c;
                PayPaymentSessionRequest payPaymentSessionRequest = this.f5094f;
                this.f5090a = null;
                this.f5091b = 1;
            } else {
                InternalCheckoutComponents internalCheckoutComponents2 = this.f5093d;
                PaymentMethodComponent paymentMethodComponent2 = this.e;
                ComponentCallback componentCallback2 = this.f5092c;
                PayPaymentSessionRequest payPaymentSessionRequest2 = this.f5094f;
                this.f5090a = null;
                this.f5091b = 2;
            }
        }
        return Unit.INSTANCE;
    }
}
