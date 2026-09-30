package com.checkout.components.core;

import com.checkout.components.core.common.components.ApmSubmitHandlerFactory;
import com.checkout.components.core.risk.RiskManager;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.model.PayRequestPayload;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* renamed from: com.checkout.components.core.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0911a extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public Object f4648a;

    /* renamed from: b, reason: collision with root package name */
    public int f4649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ApmSubmitHandlerFactory f4650c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PaymentMethodComponent f4651d;
    public final /* synthetic */ ComponentCallback e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4652f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Map f4653g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0911a(ApmSubmitHandlerFactory apmSubmitHandlerFactory, PaymentMethodComponent paymentMethodComponent, ComponentCallback componentCallback, String str, Map map, Nd.c cVar) {
        super(2, cVar);
        this.f4650c = apmSubmitHandlerFactory;
        this.f4651d = paymentMethodComponent;
        this.e = componentCallback;
        this.f4652f = str;
        this.f4653g = map;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0911a(this.f4650c, this.f4651d, this.e, this.f4652f, this.f4653g, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0911a) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if (r1.invoke(r4, r5, r6, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r11 == r0) goto L15;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4649b;
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
            RiskManager access$getRiskManager$p = ApmSubmitHandlerFactory.access$getRiskManager$p(this.f4650c);
            this.f4649b = 1;
            obj = access$getRiskManager$p.publishAndHandleRiskResult$core_standardRelease(null, this);
        }
        Xd.n access$getSubmitPayment$p = ApmSubmitHandlerFactory.access$getSubmitPayment$p(this.f4650c);
        PaymentMethodComponent paymentMethodComponent = this.f4651d;
        ComponentCallback componentCallback = this.e;
        String str = this.f4652f;
        PayRequestPayload.Apm apm = new PayRequestPayload.Apm(str, this.f4650c.validateAndRemoveReservedKeys$core_standardRelease(str, this.f4653g), (String) obj, ApmSubmitHandlerFactory.access$getEffectiveAppIdentifier$p(this.f4650c));
        this.f4648a = null;
        this.f4649b = 2;
    }
}
