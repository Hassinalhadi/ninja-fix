package com.checkout.components.card.di.injector;

import Nd.c;
import Xd.l;
import android.content.Context;
import ao.ad;
import com.checkout.components.card.di.base.InjectionClient;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.card.di.component.CardDIComponent;
import com.checkout.components.card.di.component.j;
import com.checkout.components.card.di.module.CardMetaDataNetworkModule;
import com.checkout.components.card.di.module.ComponentStyleModule;
import com.checkout.components.card.di.module.NetworkModule;
import com.checkout.components.card.di.module.PaymentModule;
import com.checkout.components.card.di.module.StyleMapperModule;
import com.checkout.components.card.di.module.TokenNetworkModule;
import com.checkout.components.card.di.module.ValidationModule;
import com.checkout.components.card.model.CardComponentCallbacks;
import com.checkout.components.card.operations.PaymentOperationManager;
import com.checkout.components.card.operations.network.repository.CardMetaDataRepository;
import com.checkout.components.card.ui.component.address.AddressViewModelFactory;
import com.checkout.components.card.ui.component.base.InputComponentViewModelFactory;
import com.checkout.components.card.ui.component.errorlabel.ErrorLabelViewModel;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewModel;
import com.checkout.components.card.ui.component.savecard.SaveCardContainerViewModelFactory;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.card.utils.extensions.CommonExtensionsKt;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.component.AddressConfiguration;
import com.checkout.components.interfaces.component.CardConfiguration;
import com.checkout.components.interfaces.component.PaymentButtonAction;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.checkout.components.ui.data.DisplayCvvRepository;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import com.checkout.components.ui.data.SupportedTypesRepository;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.L;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/checkout/components/card/di/injector/CardInjector;", "Lcom/checkout/components/card/di/base/Injector;", "Lcom/checkout/components/card/di/component/CardDIComponent;", "component", "<init>", "(Lcom/checkout/components/card/di/component/CardDIComponent;)V", "Lcom/checkout/components/card/di/base/InjectionClient;", "client", "", "inject", "(Lcom/checkout/components/card/di/base/InjectionClient;)V", "Lcom/checkout/components/card/operations/PaymentOperationManager;", "getOrCreatePaymentOperationManager", "()Lcom/checkout/components/card/operations/PaymentOperationManager;", "Lcom/checkout/components/card/operations/network/repository/CardMetaDataRepository;", "cardMetaDataRepository", "()Lcom/checkout/components/card/operations/network/repository/CardMetaDataRepository;", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "paymentStateManager", "()Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "Companion", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardInjector implements Injector {
    public static final int $stable = 8;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final CardDIComponent f4107a;

    /* renamed from: b, reason: collision with root package name */
    private PaymentOperationManager f4108b;

    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J¹\u0001\u0010*\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/checkout/components/card/di/injector/CardInjector$Companion;", "", "Lcom/checkout/components/ui/data/SupportedTypesRepository;", "supportedTypesRepository", "Lcom/checkout/components/ui/data/SupportedSchemesRepository;", "supportedSchemesRepository", "Lcom/checkout/components/ui/data/DisplayCvvRepository;", "displayCvvRepository", "Lcom/checkout/components/interfaces/Environment;", "environment", "", "publicKey", "Landroid/content/Context;", "context", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "Lcom/checkout/components/interfaces/localisation/Translation;", "translation", "Lyf/L;", "Lcom/checkout/components/interfaces/model/PaymentState;", "paymentStateFlow", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "appearance", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/interfaces/component/PaymentButtonAction;", "paymentButtonAction", "Lcom/checkout/components/interfaces/component/AddressConfiguration;", "addressConfiguration", "Lcom/checkout/components/rememberme/CheckoutRememberMe;", "rememberMe", "Ljava/util/Locale;", "locale", "Lcom/checkout/components/card/model/CardComponentCallbacks;", "callbacks", "Lcom/checkout/components/interfaces/component/CardConfiguration;", "cardConfiguration", "Lcom/checkout/components/card/di/base/Injector;", "create$card_standardRelease", "(Lcom/checkout/components/ui/data/SupportedTypesRepository;Lcom/checkout/components/ui/data/SupportedSchemesRepository;Lcom/checkout/components/ui/data/DisplayCvvRepository;Lcom/checkout/components/interfaces/Environment;Ljava/lang/String;Landroid/content/Context;Ljava/util/Map;Lyf/L;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lcom/checkout/components/interfaces/insight/LogDetails;Lcom/checkout/components/interfaces/insight/Logger;Lcom/checkout/components/interfaces/component/PaymentButtonAction;Lcom/checkout/components/interfaces/component/AddressConfiguration;Lcom/checkout/components/rememberme/CheckoutRememberMe;Ljava/util/Locale;Lcom/checkout/components/card/model/CardComponentCallbacks;Lcom/checkout/components/interfaces/component/CardConfiguration;)Lcom/checkout/components/card/di/base/Injector;", "create", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final Injector create$card_standardRelease(@NotNull SupportedTypesRepository supportedTypesRepository, @NotNull SupportedSchemesRepository supportedSchemesRepository, @NotNull DisplayCvvRepository displayCvvRepository, @NotNull Environment environment, @NotNull String publicKey, @NotNull Context context, @Nullable Map<ComponentTranslationKey, String> translation, @NotNull L paymentStateFlow, @Nullable DesignTokens appearance, @NotNull LogDetails logDetails, @NotNull Logger logger, @NotNull PaymentButtonAction paymentButtonAction, @Nullable AddressConfiguration addressConfiguration, @Nullable CheckoutRememberMe rememberMe, @NotNull Locale locale, @NotNull CardComponentCallbacks callbacks, @Nullable CardConfiguration cardConfiguration) {
            Intrinsics.echo(supportedTypesRepository, "supportedTypesRepository");
            Intrinsics.echo(supportedSchemesRepository, "supportedSchemesRepository");
            Intrinsics.echo(displayCvvRepository, "displayCvvRepository");
            Intrinsics.echo(environment, "environment");
            Intrinsics.echo(publicKey, "publicKey");
            Intrinsics.echo(context, "context");
            Intrinsics.echo(paymentStateFlow, "paymentStateFlow");
            Intrinsics.echo(logDetails, "logDetails");
            Intrinsics.echo(logger, "logger");
            Intrinsics.echo(paymentButtonAction, "paymentButtonAction");
            Intrinsics.echo(locale, "locale");
            Intrinsics.echo(callbacks, "callbacks");
            String baseUrl = CommonExtensionsKt.baseUrl(environment);
            baseUrl.getClass();
            String cagBaseUrl = CommonExtensionsKt.cagBaseUrl(environment);
            cagBaseUrl.getClass();
            String cardMetaDataBaseUrl = CommonExtensionsKt.cardMetaDataBaseUrl(environment);
            cardMetaDataBaseUrl.getClass();
            l onTokenResult = callbacks.getOnTokenResult();
            onTokenResult.getClass();
            l lVar = onTokenResult;
            l onTokenized = callbacks.getOnTokenized();
            Function1<CardMetadata, CallbackResult> onCardBinChanged = callbacks.getOnCardBinChanged();
            Function0<Unit> onChange = callbacks.getOnChange();
            onChange.getClass();
            Function0<Unit> function0 = onChange;
            Function1<CheckoutError, Unit> onError = callbacks.getOnError();
            Function0<Unit> onSubmit = callbacks.getOnSubmit();
            onSubmit.getClass();
            Function1<c<? super Boolean>, Object> handlePayButtonTap = callbacks.getHandlePayButtonTap();
            return new CardInjector(new j(new PaymentModule(), new TokenNetworkModule(), new StyleMapperModule(), new ValidationModule(), new ComponentStyleModule(), new NetworkModule(), new CardMetaDataNetworkModule(), supportedTypesRepository, supportedSchemesRepository, displayCvvRepository, baseUrl, cagBaseUrl, cardMetaDataBaseUrl, publicKey, context, translation, lVar, paymentStateFlow, appearance, logDetails, logger, locale, cardConfiguration, paymentButtonAction, onTokenized, onCardBinChanged, function0, onError, onSubmit, handlePayButtonTap, addressConfiguration, rememberMe));
        }
    }

    public CardInjector(@NotNull CardDIComponent component) {
        Intrinsics.echo(component, "component");
        this.f4107a = component;
    }

    @NotNull
    public final CardMetaDataRepository cardMetaDataRepository() {
        return this.f4107a.cardMetaDataRepository();
    }

    @NotNull
    public final PaymentOperationManager getOrCreatePaymentOperationManager() {
        PaymentOperationManager paymentOperationManager = this.f4108b;
        if (paymentOperationManager == null) {
            PaymentOperationManager create = new PaymentOperationManager.PaymentOperationManagerFactory(this).create();
            this.f4108b = create;
            return create;
        }
        return paymentOperationManager;
    }

    @Override // com.checkout.components.card.di.base.Injector
    public final void inject(@NotNull InjectionClient client) {
        Intrinsics.echo(client, "client");
        if (client instanceof AddressViewModelFactory) {
            this.f4107a.inject((AddressViewModelFactory) client);
            return;
        }
        if (client instanceof PayButtonViewModel.PayButtonFactory) {
            this.f4107a.inject((PayButtonViewModel.PayButtonFactory) client);
            return;
        }
        if (client instanceof ErrorLabelViewModel.ErrorLabelViewModelFactory) {
            this.f4107a.inject((ErrorLabelViewModel.ErrorLabelViewModelFactory) client);
            return;
        }
        if (client instanceof InputComponentViewModelFactory) {
            this.f4107a.inject((InputComponentViewModelFactory) client);
        } else if (client instanceof PaymentOperationManager.PaymentOperationManagerFactory) {
            this.f4107a.inject((PaymentOperationManager.PaymentOperationManagerFactory) client);
        } else {
            if (client instanceof SaveCardContainerViewModelFactory) {
                this.f4107a.inject((SaveCardContainerViewModelFactory) client);
                return;
            }
            throw new IllegalArgumentException(ad.gray("Invalid injection request for ", client.getClass().getName(), "."));
        }
    }

    @NotNull
    public final PaymentStateManager paymentStateManager() {
        return this.f4107a.paymentStateManager();
    }
}
