package com.checkout.components.core;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.core.common.components.DynamicComponentFactoriesProvider;
import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.core.common.components.StandaloneCheckoutComponents;
import com.checkout.components.core.di.component.CoreDIComponent;
import com.checkout.components.core.di.component.DaggerCoreDIComponent;
import com.checkout.components.core.di.module.EnvironmentModule;
import com.checkout.components.core.di.module.RememberMeModule;
import com.checkout.components.core.error.CommonErrorMessages;
import com.checkout.components.core.featuregate.guard.CustomTabsEnabledGuard;
import com.checkout.components.core.featuregate.guard.ForwardingEmailsDisabledGuard;
import com.checkout.components.core.featuregate.policy.CardSchemePolicy;
import com.checkout.components.core.mapper.PaymentSessionSubmissionResultToResponseMapper;
import com.checkout.components.core.network.PayRequestBuilder;
import com.checkout.components.core.network.model.response.ErrorResponse;
import com.checkout.components.core.network.model.response.ResultWrapper;
import com.checkout.components.core.risk.RiskFactory;
import com.checkout.components.core.risk.RiskManager;
import com.checkout.components.core.ui.model.ComposeStyle;
import com.checkout.components.core.usecase.PayPaymentSessionUseCase;
import com.checkout.components.core.utils.extension.ExtensionsKt;
import com.checkout.components.insight.factory.InsightFactory;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.api.CheckoutComponents;
import com.checkout.components.interfaces.component.CheckoutComponentConfiguration;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.error.CheckoutErrorDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.insight.PaymentSessionDetails;
import com.checkout.components.interfaces.insight.ProductEventName;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.PaymentSessionResponse;
import com.checkout.components.interfaces.model.paymentsession.PaymentSession;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.redirecthandler.RedirectDelegate;
import com.checkout.components.rememberme.CheckoutRememberMeFactory;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Moshi;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u001aH\u0081@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068AX\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R$\u0010$\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/checkout/components/core/CheckoutComponentsFactory;", "", "Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration;", Constants.KEY_CONFIG, "", "mobileSessionId", "Lcom/checkout/components/core/di/component/CoreDIComponent;", "coreDIComponent", "Lcom/checkout/components/insight/factory/InsightFactory;", "insightFactory", "<init>", "(Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration;Ljava/lang/String;Lcom/checkout/components/core/di/component/CoreDIComponent;Lcom/checkout/components/insight/factory/InsightFactory;)V", "(Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration;)V", "paymentSessionId", "Lcom/checkout/components/interfaces/insight/Logger;", "createPaymentSessionlessLogger", "(Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration;Ljava/lang/String;)Lcom/checkout/components/interfaces/insight/Logger;", "publicKey", "Lcom/checkout/components/interfaces/model/PaymentSessionResponse;", "paymentSession", "", "validateConfiguration", "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/PaymentSessionResponse;)V", "Lcom/checkout/components/interfaces/api/CheckoutComponents;", "create", "(LNd/c;)Ljava/lang/Object;", "Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration$Payment;", "fetchPaymentSessionAndCreateCheckoutComponents$core_standardRelease", "(Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration$Payment;LNd/c;)Ljava/lang/Object;", "fetchPaymentSessionAndCreateCheckoutComponents", "Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration;", "Ljava/lang/String;", "Lcom/checkout/components/core/di/component/CoreDIComponent;", "getCoreDIComponent$core_standardRelease", "()Lcom/checkout/components/core/di/component/CoreDIComponent;", "Lcom/checkout/components/insight/factory/InsightFactory;", "logging", "Lcom/checkout/components/interfaces/insight/Logger;", "getLogging$core_standardRelease", "()Lcom/checkout/components/interfaces/insight/Logger;", "setLogging$core_standardRelease", "(Lcom/checkout/components/interfaces/insight/Logger;)V", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final class CheckoutComponentsFactory {
    public static final int $stable = 8;

    @NotNull
    private final CheckoutComponentConfiguration config;

    @NotNull
    private final CoreDIComponent coreDIComponent;

    @NotNull
    private final InsightFactory insightFactory;

    @Nullable
    private Logger logging;

    @NotNull
    private final String mobileSessionId;

    public CheckoutComponentsFactory(@NotNull CheckoutComponentConfiguration config, @NotNull String mobileSessionId, @NotNull CoreDIComponent coreDIComponent, @NotNull InsightFactory insightFactory) {
        Intrinsics.echo(config, "config");
        Intrinsics.echo(mobileSessionId, "mobileSessionId");
        Intrinsics.echo(coreDIComponent, "coreDIComponent");
        Intrinsics.echo(insightFactory, "insightFactory");
        this.config = config;
        this.mobileSessionId = mobileSessionId;
        this.coreDIComponent = coreDIComponent;
        this.insightFactory = insightFactory;
    }

    private final Logger createPaymentSessionlessLogger(CheckoutComponentConfiguration config, String paymentSessionId) {
        return this.insightFactory.createLogger(config.getPublicKey(), this.mobileSessionId, config.getContext(), new PaymentSessionDetails(paymentSessionId, "", "", ab.juliet(com.checkout.components.interfaces.insight.Constants.FORCE_LOGS_ENABLED), null, 16, null), this.coreDIComponent.provideEnvironment(), false);
    }

    private final void validateConfiguration(String publicKey, PaymentSessionResponse paymentSession) {
        CheckoutErrorCode checkoutErrorCode = CheckoutErrorCode.CONFIGURATION_INVALID;
        ExtensionsKt.validateConfigurationField(publicKey, checkoutErrorCode, CommonErrorMessages.ERROR_MESSAGE_PUBLIC_KEY, this.mobileSessionId, paymentSession.getId());
        ExtensionsKt.validateConfigurationField(paymentSession.getId(), checkoutErrorCode, CommonErrorMessages.ERROR_MESSAGE_INVALID_ID, this.mobileSessionId, paymentSession.getId());
        ExtensionsKt.validateConfigurationField(paymentSession.getSecret(), checkoutErrorCode, CommonErrorMessages.ERROR_MESSAGE_INVALID_SECRET, this.mobileSessionId, paymentSession.getId());
    }

    @Nullable
    public final Object create(@NotNull Nd.c<? super CheckoutComponents> cVar) {
        CheckoutComponentConfiguration checkoutComponentConfiguration = this.config;
        if (checkoutComponentConfiguration instanceof CheckoutComponentConfiguration.Payment) {
            validateConfiguration(((CheckoutComponentConfiguration.Payment) checkoutComponentConfiguration).getPublicKey(), ((CheckoutComponentConfiguration.Payment) this.config).getPaymentSession());
            return fetchPaymentSessionAndCreateCheckoutComponents$core_standardRelease((CheckoutComponentConfiguration.Payment) this.config, cVar);
        }
        if (checkoutComponentConfiguration instanceof CheckoutComponentConfiguration.Standalone) {
            return new StandaloneCheckoutComponents(createPaymentSessionlessLogger(checkoutComponentConfiguration, ""), this.config);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x007b, code lost:
    
        if (r1 == r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchPaymentSessionAndCreateCheckoutComponents$core_standardRelease(@NotNull CheckoutComponentConfiguration.Payment payment, @NotNull Nd.c<? super CheckoutComponents> cVar) {
        C0914d c0914d;
        int i4;
        CheckoutComponentConfiguration.Payment payment2;
        ResultWrapper resultWrapper;
        PaymentSessionSubmissionResultToResponseMapper paymentSessionSubmissionResultToResponseMapper;
        List<String> list;
        String str;
        if (cVar instanceof C0914d) {
            c0914d = (C0914d) cVar;
            int i5 = c0914d.f4729g;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0914d.f4729g = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0914d.e;
                Od.a aVar = Od.a.alpha;
                i4 = c0914d.f4729g;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        CheckoutError.Request request = c0914d.f4726c;
                        ResultKt.alpha(obj);
                        throw request;
                    }
                    payment2 = (CheckoutComponentConfiguration.Payment) c0914d.f4724a;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    InterfaceC3439i invoke = this.coreDIComponent.provideGetPaymentSessionUseCase().invoke(payment.getPublicKey(), payment.getPaymentSession().getId(), payment.getPaymentSession().getSecret(), this.mobileSessionId);
                    payment2 = payment;
                    c0914d.f4724a = payment2;
                    c0914d.f4729g = 1;
                    obj = AbstractC3428A.november(invoke, c0914d);
                }
                CheckoutComponentConfiguration.Payment payment3 = payment2;
                resultWrapper = (ResultWrapper) obj;
                if (!(resultWrapper instanceof ResultWrapper.Error)) {
                    ResultWrapper.Error error = (ResultWrapper.Error) resultWrapper;
                    CheckoutErrorCode code = error.getCode();
                    String message = error.getMessage();
                    String str2 = this.mobileSessionId;
                    String id2 = payment3.getPaymentSession().getId();
                    ErrorResponse errorResponse = error.getErrorResponse();
                    if (errorResponse != null) {
                        list = errorResponse.getErrorCodes();
                    } else {
                        list = null;
                    }
                    ErrorResponse errorResponse2 = error.getErrorResponse();
                    if (errorResponse2 != null) {
                        str = errorResponse2.getRequestId();
                    } else {
                        str = null;
                    }
                    CheckoutError.Request request2 = new CheckoutError.Request(message, code, new CheckoutErrorDetails.Request(str2, id2, null, null, list, str, error.getHttpStatusCode()));
                    Logger createPaymentSessionlessLogger = createPaymentSessionlessLogger(payment3, payment3.getPaymentSession().getId());
                    String stackTraceString = ExtensionsKt.toStackTraceString(error);
                    c0914d.f4724a = null;
                    c0914d.f4725b = null;
                    c0914d.f4726c = request2;
                    c0914d.f4727d = null;
                    c0914d.f4729g = 2;
                    if (createPaymentSessionlessLogger.logErrorAndAwait(request2, stackTraceString, c0914d) != aVar) {
                        throw request2;
                    }
                    return aVar;
                }
                if (resultWrapper instanceof ResultWrapper.Success) {
                    ResultWrapper.Success success = (ResultWrapper.Success) resultWrapper;
                    this.coreDIComponent.provideSessionFlagWriter().applySessionData(((PaymentSession) success.getData()).getFeatureFlags(), ((PaymentSession) success.getData()).getExperiments());
                    Logger createLogger = this.insightFactory.createLogger(payment3.getPublicKey(), this.mobileSessionId, payment3.getContext(), new PaymentSessionDetails(((PaymentSession) success.getData()).getId(), ((PaymentSession) success.getData()).getEntityId(), ((PaymentSession) success.getData()).getProcessingChannelId(), ((PaymentSession) success.getData()).getFeatureFlags(), ((PaymentSession) success.getData()).getExperiments()), this.coreDIComponent.provideEnvironment(), this.coreDIComponent.provideAnalyticsDisabledGuard().getF4797a());
                    this.logging = createLogger;
                    N4.a.echo(createLogger, ProductEventName.InitialisationSucceeded, null, 2, null);
                    PayPaymentSessionUseCase providePayPaymentSessionUseCase = this.coreDIComponent.providePayPaymentSessionUseCase();
                    PaymentSession paymentSession = (PaymentSession) success.getData();
                    Moshi provideMoshi = this.coreDIComponent.provideMoshi();
                    Mapper<DesignTokens, ComposeStyle> provideDesignTokensToCoreComposeStyleMapper = this.coreDIComponent.provideDesignTokensToCoreComposeStyleMapper();
                    RedirectDelegate.Factory provideRedirectDelegateFactory = this.coreDIComponent.provideRedirectDelegateFactory();
                    CustomTabsEnabledGuard provideCustomTabsEnabledGuard = this.coreDIComponent.provideCustomTabsEnabledGuard();
                    ForwardingEmailsDisabledGuard provideForwardingEmailsDisabledGuard = this.coreDIComponent.provideForwardingEmailsDisabledGuard();
                    CardSchemePolicy provideCardSchemePolicy = this.coreDIComponent.provideCardSchemePolicy();
                    RiskManager riskManager = new RiskManager(createLogger, new RiskFactory(payment3.getContext(), payment3.getPublicKey(), ExtensionsKt.toRiskSDKEnvironment(payment3.getEnvironment())), null, 4, null);
                    CheckoutRememberMeFactory checkoutRememberMeFactory = this.coreDIComponent.checkoutRememberMeFactory();
                    PayRequestBuilder payRequestBuilder = this.coreDIComponent.payRequestBuilder();
                    ComponentCallback componentCallback = payment3.getComponentCallback();
                    if (componentCallback != null && componentCallback.getHandleSubmit() != null) {
                        paymentSessionSubmissionResultToResponseMapper = new PaymentSessionSubmissionResultToResponseMapper();
                    } else {
                        paymentSessionSubmissionResultToResponseMapper = null;
                    }
                    return new InternalCheckoutComponents(payment3, paymentSession, providePayPaymentSessionUseCase, provideMoshi, provideDesignTokensToCoreComposeStyleMapper, createLogger, null, null, provideCardSchemePolicy, null, provideRedirectDelegateFactory, provideCustomTabsEnabledGuard, provideForwardingEmailsDisabledGuard, null, riskManager, null, checkoutRememberMeFactory, payRequestBuilder, paymentSessionSubmissionResultToResponseMapper, new DynamicComponentFactoriesProvider(createLogger, null), 41664, null);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        c0914d = new C0914d(this, cVar);
        Object obj2 = c0914d.e;
        Od.a aVar2 = Od.a.alpha;
        i4 = c0914d.f4729g;
        if (i4 == 0) {
        }
        CheckoutComponentConfiguration.Payment payment32 = payment2;
        resultWrapper = (ResultWrapper) obj2;
        if (!(resultWrapper instanceof ResultWrapper.Error)) {
        }
    }

    @NotNull
    /* renamed from: getCoreDIComponent$core_standardRelease, reason: from getter */
    public final CoreDIComponent getCoreDIComponent() {
        return this.coreDIComponent;
    }

    @Nullable
    /* renamed from: getLogging$core_standardRelease, reason: from getter */
    public final Logger getLogging() {
        return this.logging;
    }

    public final void setLogging$core_standardRelease(@Nullable Logger logger) {
        this.logging = logger;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckoutComponentsFactory(@NotNull CheckoutComponentConfiguration config) {
        this(config, r0, r1, new InsightFactory());
        Intrinsics.echo(config, "config");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.delta(uuid, "toString(...)");
        CoreDIComponent build = DaggerCoreDIComponent.builder().environmentModule(new EnvironmentModule(config.getEnvironment())).rememberMeModule(new RememberMeModule(config.getPublicKey(), config.getEnvironment(), config.getAppearance())).build();
        Intrinsics.delta(build, "build(...)");
    }
}
