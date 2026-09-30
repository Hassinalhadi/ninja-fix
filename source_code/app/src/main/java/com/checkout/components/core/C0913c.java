package com.checkout.components.core;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.core.common.components.ApmSubmitHandlerFactory;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ApmSubmitHandler;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.insight.ProductEventName;
import com.checkout.components.interfaces.insight.ProductEventProperties;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import vf.ab;

/* renamed from: com.checkout.components.core.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0913c implements ApmSubmitHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f4659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ApmSubmitHandlerFactory f4660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComponentCallback f4661c;

    public C0913c(Function0 function0, ApmSubmitHandlerFactory apmSubmitHandlerFactory, ComponentCallback componentCallback) {
        this.f4659a = function0;
        this.f4660b = apmSubmitHandlerFactory;
        this.f4661c = componentCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d4, code lost:
    
        if (vf.ad.blue(r1, r10, r3) == r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.checkout.components.interfaces.component.ApmSubmitHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, Map map, Nd.c cVar) {
        C0912b c0912b;
        int i4;
        boolean z2;
        PaymentMethodComponent paymentMethodComponent;
        String str2;
        PaymentMethodComponent paymentMethodComponent2;
        Map map2;
        Object obj;
        Map map3;
        ab abVar;
        String str3 = str;
        if (cVar instanceof C0912b) {
            c0912b = (C0912b) cVar;
            int i5 = c0912b.f4658f;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0912b.f4658f = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = c0912b.f4657d;
                Od.a aVar = Od.a.alpha;
                i4 = c0912b.f4658f;
                z2 = false;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj2);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    PaymentMethodComponent paymentMethodComponent3 = (PaymentMethodComponent) c0912b.f4656c;
                    map3 = (Map) c0912b.f4655b;
                    String str4 = (String) c0912b.f4654a;
                    ResultKt.alpha(obj2);
                    paymentMethodComponent = paymentMethodComponent3;
                    str3 = str4;
                    obj = obj2;
                } else {
                    ResultKt.alpha(obj2);
                    paymentMethodComponent = (PaymentMethodComponent) this.f4659a.invoke();
                    this.f4660b.f4666a.sendProductEvent(ProductEventName.Press, new ProductEventProperties(str3, null, null, null, null, null, "pay_button", 62, null));
                    Function1<PaymentMethodComponent, Unit> onSubmit = this.f4661c.getOnSubmit();
                    if (onSubmit != null) {
                        onSubmit.invoke(paymentMethodComponent);
                    }
                    Xd.l handleTap = this.f4661c.getHandleTap();
                    if (handleTap != null) {
                        c0912b.f4654a = str3;
                        c0912b.f4655b = map;
                        c0912b.f4656c = paymentMethodComponent;
                        c0912b.f4658f = 1;
                        Object invoke = handleTap.invoke(paymentMethodComponent, c0912b);
                        if (invoke != aVar) {
                            obj = invoke;
                            map3 = map;
                        }
                        return aVar;
                    }
                    str2 = str3;
                    paymentMethodComponent2 = paymentMethodComponent;
                    map2 = map;
                    if (!z2) {
                        abVar = this.f4660b.f4667b;
                        Nd.h minusKey = abVar.charlie().minusKey(vf.H.alpha);
                        C0911a c0911a = new C0911a(this.f4660b, paymentMethodComponent2, this.f4661c, str2, map2, null);
                        c0912b.f4654a = null;
                        c0912b.f4655b = null;
                        c0912b.f4656c = null;
                        c0912b.f4658f = 2;
                    } else {
                        return Unit.INSTANCE;
                    }
                }
                str2 = str3;
                paymentMethodComponent2 = paymentMethodComponent;
                map2 = map3;
                if (!((Boolean) obj).booleanValue()) {
                    z2 = true;
                }
                if (!z2) {
                }
            }
        }
        c0912b = new C0912b(this, cVar);
        Object obj22 = c0912b.f4657d;
        Od.a aVar2 = Od.a.alpha;
        i4 = c0912b.f4658f;
        z2 = false;
        if (i4 == 0) {
        }
        str2 = str3;
        paymentMethodComponent2 = paymentMethodComponent;
        map2 = map3;
        if (!((Boolean) obj).booleanValue()) {
        }
        if (!z2) {
        }
    }
}
