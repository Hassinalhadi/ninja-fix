package com.checkout.components.wallet;

import Ec.ar;
import Xd.l;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import bz.af;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.BasePaymentMethodComponent;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.ErrorExtensionsKt;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.PaymentState;
import com.checkout.components.interfaces.model.UpdateDetails;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.checkout.components.wallet.GooglePayMediator;
import com.checkout.components.wallet.common.CurrencyExtensionsKt;
import com.checkout.components.wallet.data.model.Currency;
import com.checkout.components.wallet.ui.WalletComponentViewRenderer;
import com.checkout.components.wallet.ui.model.WalletComponentConfig;
import com.checkout.components.wallet.wrapper.GooglePayFlowCoordinator;
import com.clevertap.android.sdk.Constants;
import d.C1534h0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vf.ad;
import vf.ao;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\"\u001a\u00020\u000bH\u0001¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020\u000bH\u0001¢\u0006\u0004\b'\u0010!R!\u0010/\u001a\u00020)8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010!\u001a\u0004\b,\u0010-R\"\u00106\u001a\u0004\u0018\u0001008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010!\u001a\u0004\b3\u00104R\u001a\u0010<\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/checkout/components/wallet/WalletComponent;", "Lcom/checkout/components/interfaces/component/BasePaymentMethodComponent;", "Lcom/checkout/components/wallet/ui/model/WalletComponentConfig;", Constants.KEY_CONFIG, "Lcom/checkout/components/wallet/GooglePayMediator$Companion$Factory;", "mediatorFactory", "<init>", "(Lcom/checkout/components/wallet/ui/model/WalletComponentConfig;Lcom/checkout/components/wallet/GooglePayMediator$Companion$Factory;)V", "(Lcom/checkout/components/wallet/ui/model/WalletComponentConfig;)V", "Lcom/checkout/components/interfaces/error/CheckoutError;", RedirectCustomTabEventLogger.RESULT_ERROR, "", "handleCoordinatorError", "(Lcom/checkout/components/interfaces/error/CheckoutError;)V", "", "isAvailable", "(LNd/c;)Ljava/lang/Object;", "Render", "(Landroidx/compose/runtime/m;I)V", "tokenize", "submit", "isValid", "Lcom/checkout/components/interfaces/model/UpdateDetails;", "updateDetails", "update", "(Lcom/checkout/components/interfaces/model/UpdateDetails;)V", "Lkotlin/Pair;", "", "Lcom/checkout/components/wallet/data/model/Currency;", "validateUpdateDetails$wallet_standardRelease", "(Lcom/checkout/components/interfaces/model/UpdateDetails;)Lkotlin/Pair;", "validateUpdateDetails", "invokePaymentAttempt$wallet_standardRelease", "()V", "invokePaymentAttempt", "Landroid/view/View;", "container", "provideView", "(Landroid/view/View;)Landroid/view/View;", "handleComponentNotChecked$wallet_standardRelease", "handleComponentNotChecked", "Lcom/checkout/components/wallet/ui/WalletComponentViewRenderer;", "b", "Lkotlin/Lazy;", "getRenderer$wallet_standardRelease", "()Lcom/checkout/components/wallet/ui/WalletComponentViewRenderer;", "getRenderer$wallet_standardRelease$annotations", "renderer", "Lcom/checkout/components/wallet/GooglePayMediator;", "c", "Lcom/checkout/components/wallet/GooglePayMediator;", "getMediator$wallet_standardRelease", "()Lcom/checkout/components/wallet/GooglePayMediator;", "getMediator$wallet_standardRelease$annotations", "mediator", "Lcom/checkout/components/interfaces/model/ComponentName;", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/model/ComponentName;", "getName", "()Lcom/checkout/components/interfaces/model/ComponentName;", "name", "Companion", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WalletComponent extends BasePaymentMethodComponent {
    public static final int $stable = 8;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a */
    private final WalletComponentConfig f6441a;

    /* renamed from: b, reason: from kotlin metadata */
    private final Lazy renderer;

    /* renamed from: c, reason: from kotlin metadata */
    private final GooglePayMediator mediator;

    /* renamed from: d */
    private final PaymentMethodName f6444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletComponent(WalletComponentConfig config, GooglePayMediator.Companion.Factory mediatorFactory) {
        super(config.getComponentCallback());
        Intrinsics.echo(config, "config");
        Intrinsics.echo(mediatorFactory, "mediatorFactory");
        this.f6441a = config;
        this.renderer = LazyKt.lazy(new n(3, this));
        this.mediator = mediatorFactory.create(new C1534h0(28, this));
        GooglePayFlowCoordinator googlePayFlowCoordinator = config.getGooglePayFlowCoordinator();
        if (googlePayFlowCoordinator != null) {
            googlePayFlowCoordinator.setErrorCallback$wallet_standardRelease(new e(this));
        }
        this.f6444d = PaymentMethodName.INSTANCE.getGooglePay();
    }

    public static final Unit a(WalletComponent walletComponent, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        walletComponent.Render(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final boolean access$isPaymentInProgress(WalletComponent walletComponent) {
        return walletComponent.f6441a.getPaymentStateFlow().getValue() instanceof PaymentState.InProgress;
    }

    public static /* synthetic */ WalletComponentViewRenderer alpha(WalletComponent walletComponent) {
        return a(walletComponent);
    }

    public static /* synthetic */ Unit bravo(WalletComponent walletComponent, String str) {
        return a(walletComponent, str);
    }

    public static /* synthetic */ Unit charlie(WalletComponent walletComponent, InterfaceC0581m interfaceC0581m, int i4) {
        return a(walletComponent, interfaceC0581m, i4);
    }

    public static /* synthetic */ Unit delta(WalletComponent walletComponent, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        return a(walletComponent, i4, interfaceC0581m, i5);
    }

    public static /* synthetic */ void getMediator$wallet_standardRelease$annotations() {
    }

    public static /* synthetic */ void getRenderer$wallet_standardRelease$annotations() {
    }

    @Override // com.checkout.components.interfaces.api.BaseComponent
    public void Render(InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2115322962);
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
            getRenderer$wallet_standardRelease().Render(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ar(this, i4, 10);
        }
    }

    /* renamed from: getMediator$wallet_standardRelease, reason: from getter */
    public final GooglePayMediator getMediator() {
        return this.mediator;
    }

    @Override // com.checkout.components.interfaces.api.BaseComponent
    public ComponentName getName() {
        return this.f6444d;
    }

    public final WalletComponentViewRenderer getRenderer$wallet_standardRelease() {
        return (WalletComponentViewRenderer) this.renderer.getValue();
    }

    public final void handleComponentNotChecked$wallet_standardRelease() {
        CheckoutError.Integration componentIsAvailableNotCheckedError = ErrorExtensionsKt.toComponentIsAvailableNotCheckedError(this.f6441a.getLogDetails());
        N4.a.alpha(this.f6441a.getLogger(), componentIsAvailableNotCheckedError, null, false, 6, null);
        l onError = getComponentCallback().getOnError();
        if (onError != null) {
            onError.invoke(this, componentIsAvailableNotCheckedError);
        }
    }

    public final void handleCoordinatorError(CheckoutError r22) {
        Intrinsics.echo(r22, "error");
        l onError = getComponentCallback().getOnError();
        if (onError != null) {
            onError.invoke(this, r22);
        }
    }

    public final void invokePaymentAttempt$wallet_standardRelease() {
        Cf.e eVar = ao.alpha;
        ad.zulu(ad.charlie(Af.n.alpha), null, null, new g(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (((java.lang.Boolean) r5).booleanValue() != true) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.checkout.components.interfaces.api.PaymentMethodComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isAvailable(Nd.c<? super Boolean> cVar) {
        h hVar;
        int i4;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i5 = hVar.f6520c;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                hVar.f6520c = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = hVar.f6518a;
                Od.a aVar = Od.a.alpha;
                i4 = hVar.f6520c;
                boolean z2 = true;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    GooglePayMediator googlePayMediator = this.mediator;
                    if (googlePayMediator != null) {
                        hVar.f6520c = 1;
                        obj = googlePayMediator.isGooglePayReady(hVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    z2 = false;
                    return Boolean.valueOf(z2);
                }
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f6518a;
        Od.a aVar2 = Od.a.alpha;
        i4 = hVar.f6520c;
        boolean z22 = true;
        if (i4 == 0) {
        }
    }

    @Override // com.checkout.components.interfaces.api.PaymentMethodComponent
    public Object isValid(Nd.c<? super Boolean> cVar) {
        return Boolean.FALSE;
    }

    @Override // com.checkout.components.interfaces.api.BaseComponent
    public View provideView(View container) {
        Intrinsics.echo(container, "container");
        Context context = container.getContext();
        Intrinsics.delta(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setContent(new P.d(new af(14, this), -94830484, true));
        return composeView;
    }

    @Override // com.checkout.components.interfaces.api.PaymentMethodComponent
    public Object submit(Nd.c<? super Unit> cVar) {
        l onError = getComponentCallback().getOnError();
        if (onError != null) {
            onError.invoke(this, ErrorExtensionsKt.toMethodNotSupportedError(this.f6441a.getLogDetails()));
        }
        return Unit.INSTANCE;
    }

    @Override // com.checkout.components.interfaces.api.PaymentMethodComponent
    public Object tokenize(Nd.c<? super Unit> cVar) {
        l onError = getComponentCallback().getOnError();
        if (onError != null) {
            onError.invoke(this, ErrorExtensionsKt.toMethodNotSupportedError(this.f6441a.getLogDetails()));
        }
        return Unit.INSTANCE;
    }

    @Override // com.checkout.components.interfaces.api.PaymentMethodComponent
    public void update(UpdateDetails updateDetails) {
        Intrinsics.echo(updateDetails, "updateDetails");
        Pair<String, Currency> validateUpdateDetails$wallet_standardRelease = validateUpdateDetails$wallet_standardRelease(updateDetails);
        if (validateUpdateDetails$wallet_standardRelease != null) {
            String str = (String) validateUpdateDetails$wallet_standardRelease.first;
            Currency currency = (Currency) validateUpdateDetails$wallet_standardRelease.second;
            GooglePayMediator googlePayMediator = this.mediator;
            if (googlePayMediator != null) {
                googlePayMediator.update(str, currency);
            }
            Function1<UpdateDetails, Unit> onUpdateDetails$wallet_standardRelease = this.f6441a.getOnUpdateDetails$wallet_standardRelease();
            if (onUpdateDetails$wallet_standardRelease != null) {
                onUpdateDetails$wallet_standardRelease.invoke(updateDetails);
            }
        }
    }

    public final Pair<String, Currency> validateUpdateDetails$wallet_standardRelease(UpdateDetails updateDetails) {
        Currency currency;
        Intrinsics.echo(updateDetails, "updateDetails");
        String currency2 = updateDetails.getCurrency();
        if (currency2 == null || (currency = CurrencyExtensionsKt.toCurrency(currency2)) == null) {
            currency = CurrencyExtensionsKt.toCurrency(this.f6441a.getPaymentSession().getCurrency());
        }
        Currency currency3 = currency;
        String createUpdateDetailsParameterInvalidMessage = ErrorMessages.INSTANCE.createUpdateDetailsParameterInvalidMessage(updateDetails.getAmount(), currency3);
        if (updateDetails.getAmount() <= 0) {
            l onError = getComponentCallback().getOnError();
            if (onError != null) {
                onError.invoke(this, ErrorExtensionsKt.validationError(this.f6441a.getLogDetails(), createUpdateDetailsParameterInvalidMessage));
            }
            return null;
        }
        if (currency3 == Currency.UNKNOWN) {
            CheckoutError.PaymentMethod paymentMethodConfigurationError = ErrorExtensionsKt.paymentMethodConfigurationError(this.f6441a.getLogDetails(), ErrorMessages.INVALID_CURRENCY);
            N4.a.alpha(this.f6441a.getLogger(), paymentMethodConfigurationError, null, false, 6, null);
            l onError2 = getComponentCallback().getOnError();
            if (onError2 != null) {
                onError2.invoke(this, paymentMethodConfigurationError);
            }
            return null;
        }
        try {
            return new Pair<>(CurrencyExtensionsKt.getFormattedAmount(updateDetails.getAmount(), currency3), currency3);
        } catch (Exception e) {
            String str = "Failed to format amount " + updateDetails.getAmount() + " for currency " + currency3 + ": " + e.getMessage();
            l onError3 = getComponentCallback().getOnError();
            if (onError3 != null) {
                onError3.invoke(this, ErrorExtensionsKt.validationError(this.f6441a.getLogDetails(), str));
            }
            return null;
        }
    }

    public static final WalletComponentViewRenderer a(WalletComponent walletComponent) {
        return new WalletComponentViewRenderer(walletComponent.f6441a, walletComponent.mediator, new j(walletComponent), new k(walletComponent), walletComponent);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJK\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/wallet/WalletComponent$Companion;", "", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "component", "Lcom/checkout/components/wallet/ui/model/WalletComponentConfig;", Constants.KEY_CONFIG, "", "errorMessage", "", "handlePaymentAttemptError$wallet_standardRelease", "(Lcom/checkout/components/interfaces/api/PaymentMethodComponent;Lcom/checkout/components/wallet/ui/model/WalletComponentConfig;Ljava/lang/String;)V", "handlePaymentAttemptError", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lkotlin/Function2;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "onError", "(Lcom/checkout/components/interfaces/api/PaymentMethodComponent;Lcom/checkout/components/interfaces/insight/Logger;Lcom/checkout/components/interfaces/insight/LogDetails;LXd/l;Ljava/lang/String;)V", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void handlePaymentAttemptError$wallet_standardRelease(PaymentMethodComponent component, WalletComponentConfig r92, String errorMessage) {
            Intrinsics.echo(component, "component");
            Intrinsics.echo(r92, "config");
            Intrinsics.echo(errorMessage, "errorMessage");
            handlePaymentAttemptError$wallet_standardRelease(component, r92.getLogger(), r92.getLogDetails(), r92.getComponentCallback().getOnError(), errorMessage);
        }

        public final void handlePaymentAttemptError$wallet_standardRelease(PaymentMethodComponent component, Logger logger, LogDetails logDetails, l onError, String errorMessage) {
            Intrinsics.echo(component, "component");
            Intrinsics.echo(logger, "logger");
            Intrinsics.echo(logDetails, "logDetails");
            Intrinsics.echo(errorMessage, "errorMessage");
            CheckoutError.PaymentMethod paymentMethodAttemptedError = ErrorExtensionsKt.toPaymentMethodAttemptedError(logDetails, errorMessage);
            N4.a.alpha(logger, paymentMethodAttemptedError, null, false, 6, null);
            if (onError != null) {
                onError.invoke(component, paymentMethodAttemptedError);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WalletComponent(WalletComponentConfig config) {
        this(config, new GooglePayMediator.Companion.Factory(config));
        Intrinsics.echo(config, "config");
    }

    public static final Unit a(WalletComponent walletComponent, String errorMessage) {
        Intrinsics.echo(errorMessage, "errorMessage");
        Cf.e eVar = ao.alpha;
        ad.zulu(ad.charlie(Af.n.alpha), null, null, new i(walletComponent, errorMessage, null), 3);
        return Unit.INSTANCE;
    }

    public static final Unit a(WalletComponent walletComponent, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            walletComponent.Render(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
