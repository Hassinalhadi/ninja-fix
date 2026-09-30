package com.checkout.components.core.common.components.factory;

import A4.a;
import A4.b;
import Xd.l;
import android.content.Context;
import com.checkout.components.card.CardComponent;
import com.checkout.components.card.CardComponentFactory;
import com.checkout.components.card.model.CardComponentConfig;
import com.checkout.components.core.featuregate.policy.CardSchemePolicy;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.component.CardConfiguration;
import com.checkout.components.interfaces.component.ComponentOption;
import com.checkout.components.interfaces.component.PaymentButtonAction;
import com.checkout.components.interfaces.component.RememberMeConfiguration;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.DisplayCvvConfiguration;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.paymentsession.PaymentMethod;
import com.checkout.components.interfaces.model.paymentsession.PaymentSession;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.checkout.components.rememberme.utils.ExtensionsKt;
import com.checkout.components.ui.data.DisplayCvvRepository;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import com.checkout.components.ui.utils.extensions.UtilsKt;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.L;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JÅ\u0001\u0010-\u001a\u00020,2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000ej\u0004\u0018\u0001`\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162$\u0010\u001f\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00192\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/checkout/components/core/common/components/factory/DefaultCardComponentFactory;", "Lcom/checkout/components/card/CardComponentFactory;", "Lcom/checkout/components/core/featuregate/policy/CardSchemePolicy;", "cardSchemePolicy", "<init>", "(Lcom/checkout/components/core/featuregate/policy/CardSchemePolicy;)V", "Lcom/checkout/components/card/model/CardComponentConfig;", Constants.KEY_CONFIG, "Landroid/content/Context;", "context", "Lcom/checkout/components/interfaces/Environment;", "environment", "", "publicKey", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "Lcom/checkout/components/interfaces/localisation/Translation;", "translation", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "Ljava/util/Locale;", "locale", "Lyf/L;", "Lcom/checkout/components/interfaces/model/PaymentState;", "paymentStateFlow", "Lkotlin/Function2;", "Lcom/checkout/components/interfaces/model/ComponentResult;", "Lcom/checkout/components/interfaces/model/CardTokenDetails;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "", "", "onTokenResult", "Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", "rememberMeInheritedConfig", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "paymentSession", "Lcom/checkout/components/rememberme/CheckoutRememberMe;", "rememberMe", "Lcom/checkout/components/interfaces/component/ComponentOption;", "componentOption", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/card/CardComponent;", "create", "(Lcom/checkout/components/card/model/CardComponentConfig;Landroid/content/Context;Lcom/checkout/components/interfaces/Environment;Ljava/lang/String;Ljava/util/Map;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Ljava/util/Locale;Lyf/L;LXd/l;Lcom/checkout/components/interfaces/component/RememberMeConfiguration;Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;Lcom/checkout/components/rememberme/CheckoutRememberMe;Lcom/checkout/components/interfaces/component/ComponentOption;Lcom/checkout/components/interfaces/insight/LogDetails;Lcom/checkout/components/interfaces/insight/Logger;)Lcom/checkout/components/card/CardComponent;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultCardComponentFactory implements CardComponentFactory {
    public static final int $stable = 8;

    /* renamed from: a */
    private final CardSchemePolicy f4723a;

    public DefaultCardComponentFactory(@NotNull CardSchemePolicy cardSchemePolicy) {
        Intrinsics.echo(cardSchemePolicy, "cardSchemePolicy");
        this.f4723a = cardSchemePolicy;
    }

    public static final List a(PaymentMethod getSupportedCardSchemes) {
        Intrinsics.echo(getSupportedCardSchemes, "$this$getSupportedCardSchemes");
        return getSupportedCardSchemes.getCardSchemes();
    }

    public static final List b(PaymentMethod getSupportedCardSchemes) {
        Intrinsics.echo(getSupportedCardSchemes, "$this$getSupportedCardSchemes");
        return getSupportedCardSchemes.getCardSchemes();
    }

    @Override // com.checkout.components.card.CardComponentFactory
    @NotNull
    public final CardComponent create(@NotNull CardComponentConfig r21, @NotNull Context context, @NotNull Environment environment, @NotNull String publicKey, @Nullable Map<ComponentTranslationKey, String> translation, @Nullable DesignTokens designTokens, @NotNull Locale locale, @NotNull L paymentStateFlow, @NotNull l onTokenResult, @NotNull RememberMeConfiguration rememberMeInheritedConfig, @NotNull PaymentSession paymentSession, @Nullable CheckoutRememberMe rememberMe, @Nullable ComponentOption componentOption, @NotNull LogDetails logDetails, @NotNull Logger logger) {
        PaymentButtonAction paymentButtonAction;
        CardConfiguration cardConfiguration;
        DisplayCvvConfiguration displayCvvConfiguration;
        CardConfiguration cardConfiguration2;
        Intrinsics.echo(r21, "config");
        Intrinsics.echo(context, "context");
        Intrinsics.echo(environment, "environment");
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(locale, "locale");
        Intrinsics.echo(paymentStateFlow, "paymentStateFlow");
        Intrinsics.echo(onTokenResult, "onTokenResult");
        Intrinsics.echo(rememberMeInheritedConfig, "rememberMeInheritedConfig");
        Intrinsics.echo(paymentSession, "paymentSession");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(logger, "logger");
        if (componentOption == null || (paymentButtonAction = componentOption.getPaymentButtonAction()) == null) {
            paymentButtonAction = PaymentButtonAction.PAYMENT;
        }
        PaymentButtonAction paymentButtonAction2 = paymentButtonAction;
        CardSchemePolicy cardSchemePolicy = this.f4723a;
        if (componentOption != null) {
            cardConfiguration = componentOption.getCardConfiguration();
        } else {
            cardConfiguration = null;
        }
        PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
        SupportedSchemesRepository supportedSchemesRepository = new SupportedSchemesRepository(cardSchemePolicy.filter(UtilsKt.getSupportedCardSchemes(cardConfiguration, companion.getCard(), paymentSession, new a(0))), this.f4723a.filter(UtilsKt.getSupportedCardSchemes(rememberMeInheritedConfig, companion.getRememberMe(), paymentSession, new a(1))), new b(rememberMe, 0));
        if (componentOption == null || (cardConfiguration2 = componentOption.getCardConfiguration()) == null || (displayCvvConfiguration = cardConfiguration2.getDisplayCvvConfiguration()) == null) {
            displayCvvConfiguration = DisplayCvvConfiguration.SHOW;
        }
        return new CardComponent(r21, environment, publicKey, context, translation, paymentStateFlow, onTokenResult, supportedSchemesRepository, new DisplayCvvRepository(displayCvvConfiguration, DisplayCvvConfiguration.SHOW, new b(rememberMe, 1)), designTokens, locale, logger, logDetails, paymentButtonAction2);
    }

    public static final ComponentName a(CheckoutRememberMe checkoutRememberMe) {
        return ExtensionsKt.mapToComponentName(checkoutRememberMe != null ? checkoutRememberMe.currentScreen() : null, PaymentMethodName.INSTANCE.getCard());
    }

    public static final ComponentName b(CheckoutRememberMe checkoutRememberMe) {
        return ExtensionsKt.mapToComponentName(checkoutRememberMe != null ? checkoutRememberMe.currentScreen() : null, PaymentMethodName.INSTANCE.getCard());
    }
}
