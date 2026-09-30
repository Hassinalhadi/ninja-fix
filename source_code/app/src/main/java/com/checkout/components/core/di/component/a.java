package com.checkout.components.core.di.component;

import com.checkout.components.core.AbstractC0915e;
import com.checkout.components.core.CheckoutComponentsFactory;
import com.checkout.components.core.di.module.EnvironmentModule;
import com.checkout.components.core.di.module.EnvironmentModule_ProvideEnvironmentFactory;
import com.checkout.components.core.di.module.FeatureGateModule;
import com.checkout.components.core.di.module.FeatureGateModule_ProvideAnalyticsDisabledGuardFactory;
import com.checkout.components.core.di.module.FeatureGateModule_ProvideCustomTabsEnabledGuardFactory;
import com.checkout.components.core.di.module.FeatureGateModule_ProvideForwardingEmailsDisabledGuardFactory;
import com.checkout.components.core.di.module.FeatureGateModule_ProvideJaywanSchemeEnabledGuardFactory;
import com.checkout.components.core.di.module.FeatureGateModule_ProvideLogsEnabledGuardFactory;
import com.checkout.components.core.di.module.FeatureGateModule_ProvideSessionFlagWriterFactory;
import com.checkout.components.core.di.module.NetworkModule;
import com.checkout.components.core.di.module.NetworkModule_ProvideLoggingInterceptor$core_standardReleaseFactory;
import com.checkout.components.core.di.module.NetworkModule_ProvideMoshiFactory;
import com.checkout.components.core.di.module.NetworkModule_ProvideOkHttpClient$core_standardReleaseFactory;
import com.checkout.components.core.di.module.NetworkModule_ProvidePaymentRepository$core_standardReleaseFactory;
import com.checkout.components.core.di.module.NetworkModule_ProvidePaymentSessionApi$core_standardReleaseFactory;
import com.checkout.components.core.di.module.RedirectHandlerModule;
import com.checkout.components.core.di.module.RedirectHandlerModule_ProvideRedirectDelegateFactoryFactory;
import com.checkout.components.core.di.module.RememberMeModule;
import com.checkout.components.core.di.module.RememberMeModule_CheckoutRememberMeFactoryFactory;
import com.checkout.components.core.di.module.StyleMapperModule;
import com.checkout.components.core.di.module.StyleMapperModule_ProvideDesignTokensToCoreComposeStyleMapperFactory;
import com.checkout.components.core.di.module.UseCaseModule;
import com.checkout.components.core.di.module.UseCaseModule_ErrorResponseAdapterFactory;
import com.checkout.components.core.di.module.UseCaseModule_ProvideGetPaymentSessionUseCaseFactory;
import com.checkout.components.core.di.module.UseCaseModule_ProvidePayPaymentSessionUseCaseFactory;
import com.checkout.components.core.featuregate.FeatureGateImpl;
import com.checkout.components.core.featuregate.SessionFlagWriter;
import com.checkout.components.core.featuregate.guard.AnalyticsDisabledGuard;
import com.checkout.components.core.featuregate.guard.CustomTabsEnabledGuard;
import com.checkout.components.core.featuregate.guard.ForwardingEmailsDisabledGuard;
import com.checkout.components.core.featuregate.guard.LogsEnabledGuard;
import com.checkout.components.core.featuregate.policy.CardSchemePolicy;
import com.checkout.components.core.network.PayRequestBuilder;
import com.checkout.components.core.usecase.GetPaymentSessionUseCase;
import com.checkout.components.core.usecase.PayPaymentSessionUseCase;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.redirecthandler.RedirectDelegate;
import com.checkout.components.rememberme.CheckoutRememberMeFactory;
import com.squareup.moshi.Moshi;
import dagger.internal.d;

/* loaded from: classes3.dex */
public final class a implements CoreDIComponent {

    /* renamed from: a, reason: collision with root package name */
    public final FeatureGateModule f4738a;

    /* renamed from: b, reason: collision with root package name */
    public final d f4739b;

    /* renamed from: c, reason: collision with root package name */
    public final d f4740c;

    /* renamed from: d, reason: collision with root package name */
    public final d f4741d;
    public final d e;

    /* renamed from: f, reason: collision with root package name */
    public final d f4742f;

    /* renamed from: g, reason: collision with root package name */
    public final d f4743g;

    /* renamed from: h, reason: collision with root package name */
    public final d f4744h;

    /* renamed from: i, reason: collision with root package name */
    public final d f4745i;

    /* renamed from: j, reason: collision with root package name */
    public final d f4746j;

    /* renamed from: k, reason: collision with root package name */
    public final d f4747k;

    /* renamed from: l, reason: collision with root package name */
    public final d f4748l;

    /* renamed from: m, reason: collision with root package name */
    public final d f4749m;

    public a(NetworkModule networkModule, UseCaseModule useCaseModule, StyleMapperModule styleMapperModule, EnvironmentModule environmentModule, RememberMeModule rememberMeModule, FeatureGateModule featureGateModule, RedirectHandlerModule redirectHandlerModule) {
        this.f4738a = featureGateModule;
        d bravo = dagger.internal.a.bravo(new NetworkModule_ProvideMoshiFactory(networkModule));
        this.f4739b = bravo;
        d bravo2 = dagger.internal.a.bravo(new UseCaseModule_ErrorResponseAdapterFactory(useCaseModule, bravo));
        this.f4740c = bravo2;
        d bravo3 = dagger.internal.a.bravo(new NetworkModule_ProvideOkHttpClient$core_standardReleaseFactory(networkModule, dagger.internal.a.bravo(new NetworkModule_ProvideLoggingInterceptor$core_standardReleaseFactory(networkModule))));
        this.f4741d = bravo3;
        d bravo4 = dagger.internal.a.bravo(new EnvironmentModule_ProvideEnvironmentFactory(environmentModule));
        this.e = bravo4;
        d bravo5 = dagger.internal.a.bravo(new NetworkModule_ProvidePaymentRepository$core_standardReleaseFactory(networkModule, dagger.internal.a.bravo(new NetworkModule_ProvidePaymentSessionApi$core_standardReleaseFactory(networkModule, bravo, bravo3, bravo4))));
        this.f4742f = bravo5;
        this.f4743g = dagger.internal.a.bravo(new UseCaseModule_ProvidePayPaymentSessionUseCaseFactory(useCaseModule, bravo2, bravo5));
        this.f4744h = dagger.internal.a.bravo(new UseCaseModule_ProvideGetPaymentSessionUseCaseFactory(useCaseModule, bravo2, bravo5));
        this.f4745i = dagger.internal.a.bravo(new RedirectHandlerModule_ProvideRedirectDelegateFactoryFactory(redirectHandlerModule));
        this.f4746j = dagger.internal.a.bravo(new RememberMeModule_CheckoutRememberMeFactoryFactory(rememberMeModule));
        this.f4747k = dagger.internal.a.bravo(new StyleMapperModule_ProvideDesignTokensToCoreComposeStyleMapperFactory(styleMapperModule));
        d bravo6 = dagger.internal.a.bravo(AbstractC0915e.f4788a);
        this.f4748l = bravo6;
        this.f4749m = dagger.internal.a.bravo(new FeatureGateModule_ProvideSessionFlagWriterFactory(featureGateModule, bravo6));
    }

    @Override // com.checkout.components.core.di.component.CoreDIComponent
    public final CheckoutRememberMeFactory checkoutRememberMeFactory() {
        return (CheckoutRememberMeFactory) this.f4746j.get();
    }

    @Override // com.checkout.components.core.di.component.CoreDIComponent
    public final void inject(CheckoutComponentsFactory checkoutComponentsFactory) {
    }

    @Override // com.checkout.components.core.di.component.CoreDIComponent
    public final PayRequestBuilder payRequestBuilder() {
        return new PayRequestBuilder();
    }

    @Override // com.checkout.components.core.di.component.CoreDIComponent
    public final AnalyticsDisabledGuard provideAnalyticsDisabledGuard() {
        return FeatureGateModule_ProvideAnalyticsDisabledGuardFactory.provideAnalyticsDisabledGuard(this.f4738a, (FeatureGateImpl) this.f4748l.get());
    }

    @Override // com.checkout.components.core.di.component.CoreDIComponent
    public final CardSchemePolicy provideCardSchemePolicy() {
        return new CardSchemePolicy(FeatureGateModule_ProvideJaywanSchemeEnabledGuardFactory.provideJaywanSchemeEnabledGuard(this.f4738a, (FeatureGateImpl) this.f4748l.get()));
    }

    @Override // com.checkout.components.core.di.component.CoreDIComponent
    public final CustomTabsEnabledGuard provideCustomTabsEnabledGuard() {
        return FeatureGateModule_ProvideCustomTabsEnabledGuardFactory.provideCustomTabsEnabledGuard(this.f4738a, (FeatureGateImpl) this.f4748l.get());
    }

    @Override // com.checkout.components.core.di.component.CoreDIComponent
    public final Mapper provideDesignTokensToCoreComposeStyleMapper() {
        return (Mapper) this.f4747k.get();
    }

    @Override // com.checkout.components.core.di.component.CoreDIComponent
    public final Environment provideEnvironment() {
        return (Environment) this.e.get();
    }

    @Override // com.checkout.components.core.di.component.CoreDIComponent
    public final ForwardingEmailsDisabledGuard provideForwardingEmailsDisabledGuard() {
        return FeatureGateModule_ProvideForwardingEmailsDisabledGuardFactory.provideForwardingEmailsDisabledGuard(this.f4738a, (FeatureGateImpl) this.f4748l.get());
    }

    @Override // com.checkout.components.core.di.component.CoreDIComponent
    public final GetPaymentSessionUseCase provideGetPaymentSessionUseCase() {
        return (GetPaymentSessionUseCase) this.f4744h.get();
    }

    @Override // com.checkout.components.core.di.component.CoreDIComponent
    public final LogsEnabledGuard provideLogsEnabledGuard() {
        return FeatureGateModule_ProvideLogsEnabledGuardFactory.provideLogsEnabledGuard(this.f4738a, (FeatureGateImpl) this.f4748l.get());
    }

    @Override // com.checkout.components.core.di.component.CoreDIComponent
    public final Moshi provideMoshi() {
        return (Moshi) this.f4739b.get();
    }

    @Override // com.checkout.components.core.di.component.CoreDIComponent
    public final PayPaymentSessionUseCase providePayPaymentSessionUseCase() {
        return (PayPaymentSessionUseCase) this.f4743g.get();
    }

    @Override // com.checkout.components.core.di.component.CoreDIComponent
    public final RedirectDelegate.Factory provideRedirectDelegateFactory() {
        return (RedirectDelegate.Factory) this.f4745i.get();
    }

    @Override // com.checkout.components.core.di.component.CoreDIComponent
    public final SessionFlagWriter provideSessionFlagWriter() {
        return (SessionFlagWriter) this.f4749m.get();
    }
}
