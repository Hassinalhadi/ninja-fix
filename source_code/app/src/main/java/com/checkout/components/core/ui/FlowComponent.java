package com.checkout.components.core.ui;

import Ac.k;
import B2.q;
import Ec.ar;
import Nd.c;
import Od.a;
import P.d;
import Xd.l;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.core.C0916f;
import com.checkout.components.core.C0917g;
import com.checkout.components.core.C0918h;
import com.checkout.components.core.error.CommonErrorMessages;
import com.checkout.components.core.ui.model.FlowComponentConfig;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.error.CheckoutErrorDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.insight.ProductEventName;
import com.checkout.components.interfaces.insight.ProductEventProperties;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.UpdateDetails;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.utils.ExtensionsKt;
import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t0.A0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\tH\u0096@¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/checkout/components/core/ui/FlowComponent;", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "Lcom/checkout/components/core/ui/model/FlowComponentConfig;", Constants.KEY_CONFIG, "<init>", "(Lcom/checkout/components/core/ui/model/FlowComponentConfig;)V", "", "isAvailable", "(LNd/c;)Ljava/lang/Object;", "", "Render", "(Landroidx/compose/runtime/m;I)V", "tokenize", "submit", "Landroid/view/View;", "container", "provideView", "(Landroid/view/View;)Landroid/view/View;", "isValid", "Lcom/checkout/components/interfaces/model/UpdateDetails;", "updateDetails", "update", "(Lcom/checkout/components/interfaces/model/UpdateDetails;)V", "method", "handleMethodSelected$core_standardRelease", "(Lcom/checkout/components/interfaces/api/PaymentMethodComponent;)V", "handleMethodSelected", "Lcom/checkout/components/interfaces/model/ComponentName;", "getName", "()Lcom/checkout/components/interfaces/model/ComponentName;", "name", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowComponent implements PaymentMethodComponent {
    public static final int $stable = 8;

    /* renamed from: a */
    private final FlowComponentConfig f5025a;

    /* renamed from: b */
    private final Lazy f5026b;

    /* renamed from: c */
    private final ax f5027c;

    public FlowComponent(@NotNull FlowComponentConfig config) {
        Intrinsics.echo(config, "config");
        this.f5025a = config;
        Lazy lazy = LazyKt.lazy(new q(8, this));
        this.f5026b = lazy;
        this.f5027c = C0564b.zulu(((FlowComponentViewRenderer) lazy.getValue()).getDefaultSelectedComponent$core_standardRelease());
    }

    public static final Unit a(FlowComponent flowComponent, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        flowComponent.Render(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit alpha(FlowComponent flowComponent, InterfaceC0581m interfaceC0581m, int i4) {
        return a(flowComponent, interfaceC0581m, i4);
    }

    public static /* synthetic */ FlowComponentViewRenderer charlie(FlowComponent flowComponent) {
        return a(flowComponent);
    }

    @Override // com.checkout.components.interfaces.api.BaseComponent
    public final void Render(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1056191604);
        if ((i4 & 6) == 0) {
            if (c0585q.india(this)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            ((FlowComponentViewRenderer) this.f5026b.getValue()).Render(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ar(this, i4, 1);
        }
    }

    @Override // com.checkout.components.interfaces.api.BaseComponent
    @NotNull
    public final ComponentName getName() {
        RememberMeScreen rememberMeScreen;
        CheckoutRememberMe rememberMe$core_standardRelease = this.f5025a.getRememberMe$core_standardRelease();
        if (rememberMe$core_standardRelease != null) {
            rememberMeScreen = rememberMe$core_standardRelease.currentScreen();
        } else {
            rememberMeScreen = null;
        }
        return ExtensionsKt.mapToComponentName(rememberMeScreen, ComponentName.Flow.INSTANCE);
    }

    public final void handleMethodSelected$core_standardRelease(@NotNull PaymentMethodComponent method) {
        Logger logger$core_standardRelease;
        Intrinsics.echo(method, "method");
        if (com.checkout.components.core.utils.extension.ExtensionsKt.toKnownPaymentMethodName(method.getName().getValue()) == null && (logger$core_standardRelease = this.f5025a.getLogger$core_standardRelease()) != null) {
            logger$core_standardRelease.sendProductEvent(ProductEventName.PaymentMethodSelected, new ProductEventProperties(ComponentName.Flow.INSTANCE.getValue(), method.getName().getValue(), null, null, null, null, null, 124, null));
        }
        Function1<PaymentMethodComponent, Unit> onChange = this.f5025a.getComponentCallback$core_standardRelease().getOnChange();
        if (onChange != null) {
            onChange.invoke(method);
        }
        this.f5027c.setValue(method);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.checkout.components.interfaces.api.PaymentMethodComponent
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isAvailable(@NotNull c<? super Boolean> cVar) {
        C0916f c0916f;
        int i4;
        if (cVar instanceof C0916f) {
            c0916f = (C0916f) cVar;
            int i5 = c0916f.f4791c;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0916f.f4791c = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0916f.f4789a;
                a aVar = a.alpha;
                i4 = c0916f.f4791c;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    CheckoutRememberMe rememberMe$core_standardRelease = this.f5025a.getRememberMe$core_standardRelease();
                    if (rememberMe$core_standardRelease != null) {
                        c0916f.f4791c = 1;
                        if (rememberMe$core_standardRelease.checkPrefilledData(c0916f) == aVar) {
                            return aVar;
                        }
                    }
                }
                return Boolean.TRUE;
            }
        }
        c0916f = new C0916f(this, cVar);
        Object obj2 = c0916f.f4789a;
        a aVar2 = a.alpha;
        i4 = c0916f.f4791c;
        if (i4 == 0) {
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.checkout.components.interfaces.api.PaymentMethodComponent
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isValid(@NotNull c<? super Boolean> cVar) {
        C0917g c0917g;
        int i4;
        boolean z2;
        if (cVar instanceof C0917g) {
            c0917g = (C0917g) cVar;
            int i5 = c0917g.f4807c;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0917g.f4807c = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0917g.f4805a;
                a aVar = a.alpha;
                i4 = c0917g.f4807c;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    PaymentMethodComponent paymentMethodComponent = this.f5025a.getComponents$core_standardRelease().get(((PaymentMethodComponent) this.f5027c.getValue()).getName());
                    if (paymentMethodComponent != null) {
                        c0917g.f4807c = 1;
                        obj = paymentMethodComponent.isValid(c0917g);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        z2 = false;
                        return Boolean.valueOf(z2);
                    }
                }
                z2 = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z2);
            }
        }
        c0917g = new C0917g(this, cVar);
        Object obj2 = c0917g.f4805a;
        a aVar2 = a.alpha;
        i4 = c0917g.f4807c;
        if (i4 == 0) {
        }
        z2 = ((Boolean) obj2).booleanValue();
        return Boolean.valueOf(z2);
    }

    @Override // com.checkout.components.interfaces.api.BaseComponent
    @NotNull
    public final View provideView(@NotNull View container) {
        Intrinsics.echo(container, "container");
        Context context = container.getContext();
        Intrinsics.delta(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setViewCompositionStrategy(A0.alpha);
        composeView.setContent(new d(new k(4, this), -2033877350, true));
        return composeView;
    }

    @Override // com.checkout.components.interfaces.api.PaymentMethodComponent
    @Nullable
    public final Object submit(@NotNull c<? super Unit> cVar) {
        RememberMeScreen rememberMeScreen;
        PaymentMethodComponent paymentMethodComponent;
        Map<ComponentName, PaymentMethodComponent> components$core_standardRelease = this.f5025a.getComponents$core_standardRelease();
        if (!components$core_standardRelease.isEmpty()) {
            Iterator<Map.Entry<ComponentName, PaymentMethodComponent>> it = components$core_standardRelease.entrySet().iterator();
            while (it.hasNext()) {
                ComponentName key = it.next().getKey();
                PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
                if (Intrinsics.areEqual(key, companion.getCard())) {
                    CheckoutRememberMe rememberMe$core_standardRelease = this.f5025a.getRememberMe$core_standardRelease();
                    if (rememberMe$core_standardRelease != null) {
                        rememberMeScreen = rememberMe$core_standardRelease.currentScreen();
                    } else {
                        rememberMeScreen = null;
                    }
                    if (!Intrinsics.areEqual(rememberMeScreen, RememberMeScreen.Alternative.INSTANCE) && rememberMeScreen != null) {
                        if (Intrinsics.areEqual(rememberMeScreen, RememberMeScreen.Wallet.INSTANCE) && (paymentMethodComponent = this.f5025a.getComponents$core_standardRelease().get(companion.getCard())) != null) {
                            Object submit = paymentMethodComponent.submit(cVar);
                            if (submit == a.alpha) {
                                return submit;
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        PaymentMethodComponent paymentMethodComponent2 = this.f5025a.getComponents$core_standardRelease().get(((PaymentMethodComponent) this.f5027c.getValue()).getName());
                        if (paymentMethodComponent2 != null) {
                            Object submit2 = paymentMethodComponent2.submit(cVar);
                            if (submit2 == a.alpha) {
                                return submit2;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        a();
        return Unit.INSTANCE;
    }

    @Override // com.checkout.components.interfaces.api.PaymentMethodComponent
    @Nullable
    public final Object tokenize(@NotNull c<? super Unit> cVar) {
        Map<ComponentName, PaymentMethodComponent> components$core_standardRelease = this.f5025a.getComponents$core_standardRelease();
        if (!components$core_standardRelease.isEmpty()) {
            Iterator<Map.Entry<ComponentName, PaymentMethodComponent>> it = components$core_standardRelease.entrySet().iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().getKey(), PaymentMethodName.INSTANCE.getCard())) {
                    PaymentMethodComponent paymentMethodComponent = this.f5025a.getComponents$core_standardRelease().get(((PaymentMethodComponent) this.f5027c.getValue()).getName());
                    if (paymentMethodComponent != null) {
                        Object obj = paymentMethodComponent.tokenize(cVar);
                        if (obj == a.alpha) {
                            return obj;
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        a();
        return Unit.INSTANCE;
    }

    @Override // com.checkout.components.interfaces.api.PaymentMethodComponent
    public final void update(@NotNull UpdateDetails updateDetails) {
        Intrinsics.echo(updateDetails, "updateDetails");
        Map<ComponentName, PaymentMethodComponent> components$core_standardRelease = this.f5025a.getComponents$core_standardRelease();
        if (!components$core_standardRelease.isEmpty()) {
            Iterator<Map.Entry<ComponentName, PaymentMethodComponent>> it = components$core_standardRelease.entrySet().iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().getKey(), PaymentMethodName.INSTANCE.getGooglePay())) {
                    PaymentMethodComponent paymentMethodComponent = this.f5025a.getComponents$core_standardRelease().get(((PaymentMethodComponent) this.f5027c.getValue()).getName());
                    if (paymentMethodComponent != null) {
                        paymentMethodComponent.update(updateDetails);
                        return;
                    }
                    return;
                }
            }
        }
        a();
    }

    public static final FlowComponentViewRenderer a(FlowComponent flowComponent) {
        return new FlowComponentViewRenderer(flowComponent.f5025a, new C0918h(flowComponent), flowComponent);
    }

    public static final Unit a(FlowComponent flowComponent, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            flowComponent.Render(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    private final void a() {
        l onError = this.f5025a.getComponentCallback$core_standardRelease().getOnError();
        if (onError != null) {
            onError.invoke(this, new CheckoutError.Integration(CommonErrorMessages.CARD_PAYMENT_NOT_SUPPORTED, CheckoutErrorCode.METHOD_NOT_SUPPORTED, new CheckoutErrorDetails.Integration(this.f5025a.getLogDetails$core_standardRelease().getMobileSessionId(), this.f5025a.getLogDetails$core_standardRelease().getPaymentSessionId(), this.f5025a.getLogDetails$core_standardRelease().getType())));
        }
    }
}
