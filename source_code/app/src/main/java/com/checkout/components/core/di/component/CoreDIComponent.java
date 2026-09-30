package com.checkout.components.core.di.component;

import com.checkout.components.core.CheckoutComponentsFactory;
import com.checkout.components.core.featuregate.SessionFlagWriter;
import com.checkout.components.core.featuregate.guard.AnalyticsDisabledGuard;
import com.checkout.components.core.featuregate.guard.CustomTabsEnabledGuard;
import com.checkout.components.core.featuregate.guard.ForwardingEmailsDisabledGuard;
import com.checkout.components.core.featuregate.guard.LogsEnabledGuard;
import com.checkout.components.core.featuregate.policy.CardSchemePolicy;
import com.checkout.components.core.network.PayRequestBuilder;
import com.checkout.components.core.ui.model.ComposeStyle;
import com.checkout.components.core.usecase.GetPaymentSessionUseCase;
import com.checkout.components.core.usecase.PayPaymentSessionUseCase;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.redirecthandler.RedirectDelegate;
import com.checkout.components.rememberme.CheckoutRememberMeFactory;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\u0016\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u0015H&J\b\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020#H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"Lcom/checkout/components/core/di/component/CoreDIComponent;", "", "inject", "", "factory", "Lcom/checkout/components/core/CheckoutComponentsFactory;", "providePayPaymentSessionUseCase", "Lcom/checkout/components/core/usecase/PayPaymentSessionUseCase;", "provideGetPaymentSessionUseCase", "Lcom/checkout/components/core/usecase/GetPaymentSessionUseCase;", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideEnvironment", "Lcom/checkout/components/interfaces/Environment;", "provideRedirectDelegateFactory", "Lcom/checkout/components/redirecthandler/RedirectDelegate$Factory;", "checkoutRememberMeFactory", "Lcom/checkout/components/rememberme/CheckoutRememberMeFactory;", "payRequestBuilder", "Lcom/checkout/components/core/network/PayRequestBuilder;", "provideDesignTokensToCoreComposeStyleMapper", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "Lcom/checkout/components/core/ui/model/ComposeStyle;", "provideSessionFlagWriter", "Lcom/checkout/components/core/featuregate/SessionFlagWriter;", "provideLogsEnabledGuard", "Lcom/checkout/components/core/featuregate/guard/LogsEnabledGuard;", "provideCustomTabsEnabledGuard", "Lcom/checkout/components/core/featuregate/guard/CustomTabsEnabledGuard;", "provideAnalyticsDisabledGuard", "Lcom/checkout/components/core/featuregate/guard/AnalyticsDisabledGuard;", "provideForwardingEmailsDisabledGuard", "Lcom/checkout/components/core/featuregate/guard/ForwardingEmailsDisabledGuard;", "provideCardSchemePolicy", "Lcom/checkout/components/core/featuregate/policy/CardSchemePolicy;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CoreDIComponent {
    @NotNull
    CheckoutRememberMeFactory checkoutRememberMeFactory();

    void inject(@NotNull CheckoutComponentsFactory factory);

    @NotNull
    PayRequestBuilder payRequestBuilder();

    @NotNull
    AnalyticsDisabledGuard provideAnalyticsDisabledGuard();

    @NotNull
    CardSchemePolicy provideCardSchemePolicy();

    @NotNull
    CustomTabsEnabledGuard provideCustomTabsEnabledGuard();

    @NotNull
    Mapper<DesignTokens, ComposeStyle> provideDesignTokensToCoreComposeStyleMapper();

    @NotNull
    Environment provideEnvironment();

    @NotNull
    ForwardingEmailsDisabledGuard provideForwardingEmailsDisabledGuard();

    @NotNull
    GetPaymentSessionUseCase provideGetPaymentSessionUseCase();

    @NotNull
    LogsEnabledGuard provideLogsEnabledGuard();

    @NotNull
    Moshi provideMoshi();

    @NotNull
    PayPaymentSessionUseCase providePayPaymentSessionUseCase();

    @NotNull
    RedirectDelegate.Factory provideRedirectDelegateFactory();

    @NotNull
    SessionFlagWriter provideSessionFlagWriter();
}
