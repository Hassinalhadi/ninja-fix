package com.checkout.components.core.common.components;

import A4.b;
import Cf.d;
import Cf.e;
import N2.ae;
import Nd.c;
import Xd.l;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.CardComponent;
import com.checkout.components.card.CardComponentFactory;
import com.checkout.components.card.model.CardComponentConfig;
import com.checkout.components.core.C0923r;
import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.core.common.components.factory.DefaultCardComponentFactory;
import com.checkout.components.core.error.CommonErrorMessages;
import com.checkout.components.core.featuregate.guard.CustomTabsEnabledGuard;
import com.checkout.components.core.featuregate.guard.ForwardingEmailsDisabledGuard;
import com.checkout.components.core.featuregate.policy.CardSchemePolicy;
import com.checkout.components.core.mapper.PaymentSessionSubmissionResultToResponseMapper;
import com.checkout.components.core.model.PaymentDataJson;
import com.checkout.components.core.model.PaymentMethodData;
import com.checkout.components.core.model.TokenizationData;
import com.checkout.components.core.n;
import com.checkout.components.core.network.PayRequestBuilder;
import com.checkout.components.core.network.model.request.PayPaymentSessionRequest;
import com.checkout.components.core.network.model.response.DeclineReason;
import com.checkout.components.core.network.model.response.ErrorResponse;
import com.checkout.components.core.network.model.response.PayPaymentSessionResponse;
import com.checkout.components.core.network.model.response.PaymentAction;
import com.checkout.components.core.network.model.response.PaymentStatus;
import com.checkout.components.core.network.model.response.ResultWrapper;
import com.checkout.components.core.o;
import com.checkout.components.core.p;
import com.checkout.components.core.q;
import com.checkout.components.core.risk.RiskManager;
import com.checkout.components.core.s;
import com.checkout.components.core.t;
import com.checkout.components.core.u;
import com.checkout.components.core.ui.FlowComponentFactory;
import com.checkout.components.core.ui.model.ComposeStyle;
import com.checkout.components.core.ui.model.FlowComponentConfig;
import com.checkout.components.core.usecase.PayPaymentSessionUseCase;
import com.checkout.components.core.v;
import com.checkout.components.core.w;
import com.checkout.components.core.x;
import com.checkout.components.core.y;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.api.CheckoutComponents;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.api.StandaloneComponent;
import com.checkout.components.interfaces.api.StandaloneComponentFactory;
import com.checkout.components.interfaces.component.AddressConfiguration;
import com.checkout.components.interfaces.component.CardConfiguration;
import com.checkout.components.interfaces.component.CheckoutComponentConfiguration;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.component.ComponentOption;
import com.checkout.components.interfaces.component.GooglePayButtonTheme;
import com.checkout.components.interfaces.component.GooglePayButtonType;
import com.checkout.components.interfaces.component.GooglePayConfiguration;
import com.checkout.components.interfaces.component.PaymentMethodComponentFactory;
import com.checkout.components.interfaces.component.PaymentMethodConfig;
import com.checkout.components.interfaces.component.RememberMeConfiguration;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.error.CheckoutErrorDetails;
import com.checkout.components.interfaces.error.ErrorExtensionsKt;
import com.checkout.components.interfaces.insight.LogDetailsImpl;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.localisation.Locale;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.ApiCallResult;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.model.CardTokenDetails;
import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.ComponentResult;
import com.checkout.components.interfaces.model.GooglePayResponseStatus;
import com.checkout.components.interfaces.model.PayRequestPayload;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.PaymentState;
import com.checkout.components.interfaces.model.Phone;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.checkout.components.interfaces.model.StandaloneComponentName;
import com.checkout.components.interfaces.model.UpdateDetails;
import com.checkout.components.interfaces.model.paymentsession.CardParameters;
import com.checkout.components.interfaces.model.paymentsession.PaymentMethod;
import com.checkout.components.interfaces.model.paymentsession.PaymentSession;
import com.checkout.components.interfaces.model.paymentsession.PaymentSessionSubmissionResult;
import com.checkout.components.interfaces.uicustomisation.designtoken.ColorTokens;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.utils.ExtensionsKt;
import com.checkout.components.redirecthandler.RedirectDelegate;
import com.checkout.components.redirecthandler.RedirectOutcome;
import com.checkout.components.redirecthandler.customtab.CustomTabWarmupManager;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.checkout.components.rememberme.CheckoutRememberMeFactory;
import com.checkout.components.rememberme.model.RememberMeCallback;
import com.checkout.components.ui.data.SupportedTypesRepository;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.utils.extensions.UtilsKt;
import com.checkout.components.wallet.WalletComponent;
import com.checkout.components.wallet.WalletComponentFactory;
import com.checkout.components.wallet.ui.model.WalletComponentConfig;
import com.checkout.components.wallet.wrapper.GooglePayFlowCoordinator;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.squareup.moshi.Moshi;
import ge.InterfaceC1772d;
import h9.aq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import k4.C2007a;
import k5.C2015h;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n.Y;
import okhttp3.internal.ws.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2689j6;
import vf.ab;
import vf.ad;
import vf.ao;
import y.ar;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;
import yf.N;
import yf.at;
import yf.av;

@Metadata(d1 = {"\u0000à\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BÅ\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J!\u00104\u001a\u0002032\u0006\u00100\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b4\u00105J!\u00104\u001a\u0002032\u0006\u00100\u001a\u0002062\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b4\u00107J\u0017\u00104\u001a\u0002092\u0006\u00100\u001a\u000208H\u0016¢\u0006\u0004\b4\u0010:J\u0017\u0010=\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020?2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\bB\u0010CJ#\u0010H\u001a\u00020A2\u0006\u0010E\u001a\u00020D2\n\b\u0002\u00100\u001a\u0004\u0018\u00010;H\u0001¢\u0006\u0004\bF\u0010GJ(\u0010P\u001a\u00020A2\u0006\u0010I\u001a\u0002032\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020LH\u0081@¢\u0006\u0004\bN\u0010OJ(\u0010R\u001a\u00020A2\u0006\u0010I\u001a\u0002032\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020LH\u0081@¢\u0006\u0004\bQ\u0010OJ'\u0010W\u001a\u00020A2\u0006\u0010I\u001a\u0002032\u0006\u0010T\u001a\u00020S2\u0006\u0010K\u001a\u00020JH\u0001¢\u0006\u0004\bU\u0010VJ\u0019\u0010\\\u001a\u00020;2\b\u0010Y\u001a\u0004\u0018\u00010XH\u0001¢\u0006\u0004\bZ\u0010[J\u0017\u0010_\u001a\u00020;2\u0006\u0010]\u001a\u00020XH\u0001¢\u0006\u0004\b^\u0010[J3\u0010h\u001a\u00020A2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020b0`2\u0006\u0010e\u001a\u00020d2\u0006\u0010K\u001a\u00020JH\u0001¢\u0006\u0004\bf\u0010gJ\u0017\u0010m\u001a\u00020A2\u0006\u0010j\u001a\u00020iH\u0001¢\u0006\u0004\bk\u0010lJ\u0018\u0010q\u001a\u00020A2\u0006\u0010M\u001a\u00020nH\u0081@¢\u0006\u0004\bo\u0010pJS\u0010x\u001a \b\u0001\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0s\u0012\u0006\u0012\u0004\u0018\u00010t\u0018\u00010r2$\u0010u\u001a \b\u0001\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0s\u0012\u0006\u0012\u0004\u0018\u00010t\u0018\u00010rH\u0001¢\u0006\u0004\bv\u0010wR \u0010\u007f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\by\u0010z\u0012\u0004\b}\u0010~\u001a\u0004\b{\u0010|R-\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020D0\u0080\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u0012\u0005\b\u0085\u0001\u0010~\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R:\u0010\u008d\u0001\u001a\u0016\u0012\u0004\u0012\u00020;\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020D0\u0080\u00010\u0087\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u0012\u0005\b\u008c\u0001\u0010~\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R2\u0010\u0095\u0001\u001a\u0004\u0018\u00010;8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u0012\u0005\b\u0094\u0001\u0010~\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R,\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R'\u0010¤\u0001\u001a\u00030\u009e\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u009f\u0001\u0010 \u0001\u0012\u0005\b£\u0001\u0010~\u001a\u0006\b¡\u0001\u0010¢\u0001R'\u0010ª\u0001\u001a\u00020d8@X\u0081\u0084\u0002¢\u0006\u0017\n\u0006\b¥\u0001\u0010¦\u0001\u0012\u0005\b©\u0001\u0010~\u001a\u0006\b§\u0001\u0010¨\u0001R)\u0010±\u0001\u001a\u0005\u0018\u00010«\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b¬\u0001\u0010\u00ad\u0001\u0012\u0005\b°\u0001\u0010~\u001a\u0006\b®\u0001\u0010¯\u0001R4\u0010¹\u0001\u001a\u0010\u0012\u0005\u0012\u00030³\u0001\u0012\u0004\u0012\u0002030²\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b´\u0001\u0010µ\u0001\u0012\u0005\b¸\u0001\u0010~\u001a\u0006\b¶\u0001\u0010·\u0001R\u001f\u0010¾\u0001\u001a\u00030º\u00018VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b½\u0001\u0010~\u001a\u0006\b»\u0001\u0010¼\u0001R\u001e\u0010Á\u0001\u001a\u00020d8@X\u0081\u0004¢\u0006\u000f\u0012\u0005\bÀ\u0001\u0010~\u001a\u0006\b¿\u0001\u0010¨\u0001¨\u0006Â\u0001"}, d2 = {"Lcom/checkout/components/core/common/components/InternalCheckoutComponents;", "Lcom/checkout/components/interfaces/api/CheckoutComponents;", "Lcom/checkout/components/interfaces/api/StandaloneComponentFactory;", "Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration$Payment;", Constants.KEY_CONFIG, "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "paymentSession", "Lcom/checkout/components/core/usecase/PayPaymentSessionUseCase;", "payPaymentSessionUseCase", "Lcom/squareup/moshi/Moshi;", "moshi", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "Lcom/checkout/components/core/ui/model/ComposeStyle;", "styleMapper", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/core/ui/FlowComponentFactory;", "flowComponentFactory", "Lcom/checkout/components/wallet/WalletComponentFactory;", "walletComponentFactory", "Lcom/checkout/components/core/featuregate/policy/CardSchemePolicy;", "cardSchemePolicy", "Lcom/checkout/components/card/CardComponentFactory;", "cardComponentFactory", "Lcom/checkout/components/redirecthandler/RedirectDelegate$Factory;", "redirectDelegateFactory", "Lcom/checkout/components/core/featuregate/guard/CustomTabsEnabledGuard;", "customTabsEnabledGuard", "Lcom/checkout/components/core/featuregate/guard/ForwardingEmailsDisabledGuard;", "forwardingEmailsDisabledGuard", "Lcom/checkout/components/core/common/components/StandaloneCheckoutComponents;", "standaloneCheckoutComponents", "Lcom/checkout/components/core/risk/RiskManager;", "riskManager", "Lvf/ab;", "networkScope", "Lcom/checkout/components/rememberme/CheckoutRememberMeFactory;", "rememberMeFactory", "Lcom/checkout/components/core/network/PayRequestBuilder;", "payRequestBuilder", "Lcom/checkout/components/core/mapper/PaymentSessionSubmissionResultToResponseMapper;", "paymentSessionSubmissionResultToResponseMapper", "Lcom/checkout/components/core/common/components/DynamicComponentFactoriesProvider;", "dynamicComponentFactoriesProvider", "<init>", "(Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration$Payment;Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;Lcom/checkout/components/core/usecase/PayPaymentSessionUseCase;Lcom/squareup/moshi/Moshi;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/insight/Logger;Lcom/checkout/components/core/ui/FlowComponentFactory;Lcom/checkout/components/wallet/WalletComponentFactory;Lcom/checkout/components/core/featuregate/policy/CardSchemePolicy;Lcom/checkout/components/card/CardComponentFactory;Lcom/checkout/components/redirecthandler/RedirectDelegate$Factory;Lcom/checkout/components/core/featuregate/guard/CustomTabsEnabledGuard;Lcom/checkout/components/core/featuregate/guard/ForwardingEmailsDisabledGuard;Lcom/checkout/components/core/common/components/StandaloneCheckoutComponents;Lcom/checkout/components/core/risk/RiskManager;Lvf/ab;Lcom/checkout/components/rememberme/CheckoutRememberMeFactory;Lcom/checkout/components/core/network/PayRequestBuilder;Lcom/checkout/components/core/mapper/PaymentSessionSubmissionResultToResponseMapper;Lcom/checkout/components/core/common/components/DynamicComponentFactoriesProvider;)V", "Lcom/checkout/components/interfaces/model/ComponentName$Flow;", "componentName", "Lcom/checkout/components/interfaces/component/ComponentOption;", "specificOptions", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "create", "(Lcom/checkout/components/interfaces/model/ComponentName$Flow;Lcom/checkout/components/interfaces/component/ComponentOption;)Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "(Lcom/checkout/components/interfaces/model/PaymentMethodName;Lcom/checkout/components/interfaces/component/ComponentOption;)Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "Lcom/checkout/components/interfaces/model/StandaloneComponentName;", "Lcom/checkout/components/interfaces/api/StandaloneComponent;", "(Lcom/checkout/components/interfaces/model/StandaloneComponentName;)Lcom/checkout/components/interfaces/api/StandaloneComponent;", "", "paymentData", "extractToken", "(Ljava/lang/String;)Ljava/lang/String;", "", "resultCode", "", "handleActivityResult", "(ILjava/lang/String;)V", "Lcom/checkout/components/interfaces/model/PaymentState;", "state", "updatePaymentState$core_standardRelease", "(Lcom/checkout/components/interfaces/model/PaymentState;Ljava/lang/String;)V", "updatePaymentState", "component", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "callback", "Lcom/checkout/components/interfaces/model/PayRequestPayload;", "payload", "submitComponentPayment$core_standardRelease", "(Lcom/checkout/components/interfaces/api/PaymentMethodComponent;Lcom/checkout/components/interfaces/component/ComponentCallback;Lcom/checkout/components/interfaces/model/PayRequestPayload;LNd/c;)Ljava/lang/Object;", "submitComponentPayment", "handlePaymentResult$core_standardRelease", "handlePaymentResult", "Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse;", "response", "handlePaymentSessionResponse$core_standardRelease", "(Lcom/checkout/components/interfaces/api/PaymentMethodComponent;Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse;Lcom/checkout/components/interfaces/component/ComponentCallback;)V", "handlePaymentSessionResponse", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest;", "paymentRequest", "encodePaymentRequestToBase64$core_standardRelease", "(Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest;)Ljava/lang/String;", "encodePaymentRequestToBase64", "request", "serializePaymentRequest$core_standardRelease", "serializePaymentRequest", "Lcom/checkout/components/interfaces/model/ComponentResult;", "Lcom/checkout/components/interfaces/model/CardTokenDetails;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "result", "", "continuePaymentFlow", "handleCardTokenResult$core_standardRelease", "(Lcom/checkout/components/interfaces/model/ComponentResult;ZLcom/checkout/components/interfaces/component/ComponentCallback;)V", "handleCardTokenResult", "Lcom/checkout/components/redirecthandler/RedirectOutcome;", "outcome", "buildRedirectOutcomeHandler$core_standardRelease", "(Lcom/checkout/components/redirecthandler/RedirectOutcome;)V", "buildRedirectOutcomeHandler", "Lcom/checkout/components/interfaces/model/PayRequestPayload$RememberMe;", "handleRememberMePayment$core_standardRelease", "(Lcom/checkout/components/interfaces/model/PayRequestPayload$RememberMe;LNd/c;)Ljava/lang/Object;", "handleRememberMePayment", "Lkotlin/Function2;", "LNd/c;", "", "handleTap", "decorateHandleTap$core_standardRelease", "(LXd/l;)LXd/l;", "decorateHandleTap", "r", "Lcom/checkout/components/core/ui/model/ComposeStyle;", "getComposeStyle", "()Lcom/checkout/components/core/ui/model/ComposeStyle;", "getComposeStyle$annotations", "()V", "composeStyle", "Lyf/at;", "t", "Lyf/at;", "getPaymentStateFlow$core_standardRelease", "()Lyf/at;", "getPaymentStateFlow$core_standardRelease$annotations", "paymentStateFlow", "Ljava/util/concurrent/ConcurrentHashMap;", "u", "Ljava/util/concurrent/ConcurrentHashMap;", "getApmStateFlows$core_standardRelease", "()Ljava/util/concurrent/ConcurrentHashMap;", "getApmStateFlows$core_standardRelease$annotations", "apmStateFlows", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE, "Ljava/lang/String;", "getRedirectingComponentType$core_standardRelease", "()Ljava/lang/String;", "setRedirectingComponentType$core_standardRelease", "(Ljava/lang/String;)V", "getRedirectingComponentType$core_standardRelease$annotations", "redirectingComponentType", "Lcom/checkout/components/interfaces/model/UpdateDetails;", Constants.INAPP_WINDOW, "Lcom/checkout/components/interfaces/model/UpdateDetails;", "getUpdatedDetails$core_standardRelease", "()Lcom/checkout/components/interfaces/model/UpdateDetails;", "setUpdatedDetails$core_standardRelease", "(Lcom/checkout/components/interfaces/model/UpdateDetails;)V", "updatedDetails", "Landroid/content/Context;", "x", "Landroid/content/Context;", "getContextWithLocale$core_standardRelease", "()Landroid/content/Context;", "getContextWithLocale$core_standardRelease$annotations", "contextWithLocale", "y", "Lkotlin/Lazy;", "isCustomTabAvailable$core_standardRelease", "()Z", "isCustomTabAvailable$core_standardRelease$annotations", "isCustomTabAvailable", "Lcom/checkout/components/redirecthandler/customtab/CustomTabWarmupManager;", "C", "Lcom/checkout/components/redirecthandler/customtab/CustomTabWarmupManager;", "getCustomTabWarmupManager$core_standardRelease", "()Lcom/checkout/components/redirecthandler/customtab/CustomTabWarmupManager;", "getCustomTabWarmupManager$core_standardRelease$annotations", "customTabWarmupManager", "", "Lcom/checkout/components/interfaces/model/ComponentName;", "s", "Ljava/util/Map;", "getPaymentMethodComponents$core_standardRelease", "()Ljava/util/Map;", "getPaymentMethodComponents$core_standardRelease$annotations", "paymentMethodComponents", "Lcom/checkout/components/interfaces/localisation/Locale;", "getComponentLocale", "()Lcom/checkout/components/interfaces/localisation/Locale;", "getComponentLocale$annotations", "componentLocale", "isRememberMeAvailable$core_standardRelease", "isRememberMeAvailable$core_standardRelease$annotations", "isRememberMeAvailable", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InternalCheckoutComponents implements CheckoutComponents, StandaloneComponentFactory {
    public static final int $stable = 8;
    private final Lazy A;
    private final ApmSubmitHandlerFactory B;

    /* renamed from: C, reason: from kotlin metadata */
    private final CustomTabWarmupManager customTabWarmupManager;

    /* renamed from: D */
    private final Lazy f4673D;

    /* renamed from: E */
    private final Lazy f4674E;

    /* renamed from: F */
    private CheckoutRememberMe f4675F;

    /* renamed from: a */
    private final CheckoutComponentConfiguration.Payment f4676a;

    /* renamed from: b */
    private final PaymentSession f4677b;

    /* renamed from: c */
    private final PayPaymentSessionUseCase f4678c;

    /* renamed from: d */
    private final Moshi f4679d;
    private final Logger e;

    /* renamed from: f */
    private final FlowComponentFactory f4680f;

    /* renamed from: g */
    private final WalletComponentFactory f4681g;

    /* renamed from: h */
    private final CardComponentFactory f4682h;

    /* renamed from: i */
    private final RedirectDelegate.Factory f4683i;

    /* renamed from: j */
    private final ForwardingEmailsDisabledGuard f4684j;

    /* renamed from: k */
    private final StandaloneCheckoutComponents f4685k;

    /* renamed from: l */
    private final RiskManager f4686l;

    /* renamed from: m */
    private final ab f4687m;

    /* renamed from: n */
    private final CheckoutRememberMeFactory f4688n;

    /* renamed from: o */
    private final PayRequestBuilder f4689o;

    /* renamed from: p */
    private final PaymentSessionSubmissionResultToResponseMapper f4690p;

    /* renamed from: q */
    private final DynamicComponentFactoriesProvider f4691q;

    /* renamed from: r, reason: from kotlin metadata */
    private final ComposeStyle composeStyle;

    /* renamed from: s */
    private final LinkedHashMap f4693s;

    /* renamed from: t, reason: from kotlin metadata */
    private final at paymentStateFlow;

    /* renamed from: u, reason: from kotlin metadata */
    private final ConcurrentHashMap apmStateFlows;

    /* renamed from: v */
    private String redirectingComponentType;

    /* renamed from: w */
    private UpdateDetails updatedDetails;

    /* renamed from: x, reason: from kotlin metadata */
    private final Context contextWithLocale;

    /* renamed from: y, reason: from kotlin metadata */
    private final Lazy isCustomTabAvailable;

    /* renamed from: z */
    private final Lazy f4700z;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentStatus.values().length];
            try {
                iArr[PaymentStatus.ActionRequired.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentStatus.Approved.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentStatus.Declined.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InternalCheckoutComponents(@NotNull CheckoutComponentConfiguration.Payment config, @NotNull PaymentSession paymentSession, @NotNull PayPaymentSessionUseCase payPaymentSessionUseCase, @NotNull Moshi moshi, @NotNull Mapper<DesignTokens, ComposeStyle> styleMapper, @NotNull Logger logger, @NotNull FlowComponentFactory flowComponentFactory, @NotNull WalletComponentFactory walletComponentFactory, @NotNull CardSchemePolicy cardSchemePolicy, @NotNull CardComponentFactory cardComponentFactory, @NotNull RedirectDelegate.Factory redirectDelegateFactory, @NotNull CustomTabsEnabledGuard customTabsEnabledGuard, @NotNull ForwardingEmailsDisabledGuard forwardingEmailsDisabledGuard, @NotNull StandaloneCheckoutComponents standaloneCheckoutComponents, @NotNull RiskManager riskManager, @NotNull ab networkScope, @NotNull CheckoutRememberMeFactory rememberMeFactory, @NotNull PayRequestBuilder payRequestBuilder, @Nullable PaymentSessionSubmissionResultToResponseMapper paymentSessionSubmissionResultToResponseMapper, @NotNull DynamicComponentFactoriesProvider dynamicComponentFactoriesProvider) {
        CustomTabWarmupManager customTabWarmupManager;
        Intrinsics.echo(config, "config");
        Intrinsics.echo(paymentSession, "paymentSession");
        Intrinsics.echo(payPaymentSessionUseCase, "payPaymentSessionUseCase");
        Intrinsics.echo(moshi, "moshi");
        Intrinsics.echo(styleMapper, "styleMapper");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(flowComponentFactory, "flowComponentFactory");
        Intrinsics.echo(walletComponentFactory, "walletComponentFactory");
        Intrinsics.echo(cardSchemePolicy, "cardSchemePolicy");
        Intrinsics.echo(cardComponentFactory, "cardComponentFactory");
        Intrinsics.echo(redirectDelegateFactory, "redirectDelegateFactory");
        Intrinsics.echo(customTabsEnabledGuard, "customTabsEnabledGuard");
        Intrinsics.echo(forwardingEmailsDisabledGuard, "forwardingEmailsDisabledGuard");
        Intrinsics.echo(standaloneCheckoutComponents, "standaloneCheckoutComponents");
        Intrinsics.echo(riskManager, "riskManager");
        Intrinsics.echo(networkScope, "networkScope");
        Intrinsics.echo(rememberMeFactory, "rememberMeFactory");
        Intrinsics.echo(payRequestBuilder, "payRequestBuilder");
        Intrinsics.echo(dynamicComponentFactoriesProvider, "dynamicComponentFactoriesProvider");
        this.f4676a = config;
        this.f4677b = paymentSession;
        this.f4678c = payPaymentSessionUseCase;
        this.f4679d = moshi;
        this.e = logger;
        this.f4680f = flowComponentFactory;
        this.f4681g = walletComponentFactory;
        this.f4682h = cardComponentFactory;
        this.f4683i = redirectDelegateFactory;
        this.f4684j = forwardingEmailsDisabledGuard;
        this.f4685k = standaloneCheckoutComponents;
        this.f4686l = riskManager;
        this.f4687m = networkScope;
        this.f4688n = rememberMeFactory;
        this.f4689o = payRequestBuilder;
        this.f4690p = paymentSessionSubmissionResultToResponseMapper;
        this.f4691q = dynamicComponentFactoriesProvider;
        this.composeStyle = styleMapper.map(config.getAppearance());
        this.f4693s = new LinkedHashMap();
        this.paymentStateFlow = AbstractC3428A.charlie(PaymentState.Default.INSTANCE);
        this.apmStateFlows = new ConcurrentHashMap();
        Context context = config.getContext();
        Configuration configuration = config.getContext().getResources().getConfiguration();
        configuration.setLocale(ExtensionsKt.mapToLocale(getComponentLocale()));
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.delta(createConfigurationContext, "createConfigurationContext(...)");
        this.contextWithLocale = createConfigurationContext;
        Lazy lazy = LazyKt.lazy(new a(14, customTabsEnabledGuard, this));
        this.isCustomTabAvailable = lazy;
        final int i4 = 0;
        Lazy lazy2 = LazyKt.lazy(new Function0(this) { // from class: z4.b
            public final /* synthetic */ InternalCheckoutComponents purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean c3;
                String a6;
                RedirectDelegate d4;
                Map b2;
                switch (i4) {
                    case 0:
                        c3 = InternalCheckoutComponents.c(this.purple);
                        return Boolean.valueOf(c3);
                    case 1:
                        a6 = InternalCheckoutComponents.a(this.purple);
                        return a6;
                    case 2:
                        d4 = InternalCheckoutComponents.d(this.purple);
                        return d4;
                    default:
                        b2 = InternalCheckoutComponents.b(this.purple);
                        return b2;
                }
            }
        });
        this.f4700z = lazy2;
        final int i5 = 1;
        Lazy lazy3 = LazyKt.lazy(new Function0(this) { // from class: z4.b
            public final /* synthetic */ InternalCheckoutComponents purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean c3;
                String a6;
                RedirectDelegate d4;
                Map b2;
                switch (i5) {
                    case 0:
                        c3 = InternalCheckoutComponents.c(this.purple);
                        return Boolean.valueOf(c3);
                    case 1:
                        a6 = InternalCheckoutComponents.a(this.purple);
                        return a6;
                    case 2:
                        d4 = InternalCheckoutComponents.d(this.purple);
                        return d4;
                    default:
                        b2 = InternalCheckoutComponents.b(this.purple);
                        return b2;
                }
            }
        });
        this.A = lazy3;
        Object value = lazy3.getValue();
        Intrinsics.delta(value, "getValue(...)");
        this.B = new ApmSubmitHandlerFactory(logger, networkScope, riskManager, (String) value, new n(this));
        if (((Boolean) lazy2.getValue()).booleanValue() && ((Boolean) lazy.getValue()).booleanValue()) {
            Context applicationContext = config.getContext().getApplicationContext();
            Intrinsics.delta(applicationContext, "getApplicationContext(...)");
            customTabWarmupManager = new CustomTabWarmupManager(applicationContext);
        } else {
            customTabWarmupManager = null;
        }
        this.customTabWarmupManager = customTabWarmupManager;
        final int i10 = 2;
        this.f4673D = LazyKt.lazy(new Function0(this) { // from class: z4.b
            public final /* synthetic */ InternalCheckoutComponents purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean c3;
                String a6;
                RedirectDelegate d4;
                Map b2;
                switch (i10) {
                    case 0:
                        c3 = InternalCheckoutComponents.c(this.purple);
                        return Boolean.valueOf(c3);
                    case 1:
                        a6 = InternalCheckoutComponents.a(this.purple);
                        return a6;
                    case 2:
                        d4 = InternalCheckoutComponents.d(this.purple);
                        return d4;
                    default:
                        b2 = InternalCheckoutComponents.b(this.purple);
                        return b2;
                }
            }
        });
        final int i11 = 3;
        this.f4674E = LazyKt.lazy(new Function0(this) { // from class: z4.b
            public final /* synthetic */ InternalCheckoutComponents purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean c3;
                String a6;
                RedirectDelegate d4;
                Map b2;
                switch (i11) {
                    case 0:
                        c3 = InternalCheckoutComponents.c(this.purple);
                        return Boolean.valueOf(c3);
                    case 1:
                        a6 = InternalCheckoutComponents.a(this.purple);
                        return a6;
                    case 2:
                        d4 = InternalCheckoutComponents.d(this.purple);
                        return d4;
                    default:
                        b2 = InternalCheckoutComponents.b(this.purple);
                        return b2;
                }
            }
        });
        riskManager.initialize$core_standardRelease();
        if (customTabWarmupManager != null) {
            customTabWarmupManager.bind();
        }
    }

    public static final boolean a(CustomTabsEnabledGuard customTabsEnabledGuard, InternalCheckoutComponents internalCheckoutComponents) {
        return customTabsEnabledGuard.getF4798a() && ((Boolean) internalCheckoutComponents.f4700z.getValue()).booleanValue();
    }

    public static final String access$getAppIdentifier(InternalCheckoutComponents internalCheckoutComponents) {
        Object value = internalCheckoutComponents.A.getValue();
        Intrinsics.delta(value, "getValue(...)");
        return (String) value;
    }

    public static final CardComponent access$getCardComponent(InternalCheckoutComponents internalCheckoutComponents) {
        Object obj = internalCheckoutComponents.f4693s.get(PaymentMethodName.INSTANCE.getCard());
        if (obj instanceof CardComponent) {
            return (CardComponent) obj;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:11:0x003b, B:12:0x006e, B:14:0x0074, B:18:0x0085, B:20:0x0089, B:21:0x00a0, B:22:0x00a5), top: B:10:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:11:0x003b, B:12:0x006e, B:14:0x0074, B:18:0x0085, B:20:0x0089, B:21:0x00a0, B:22:0x00a5), top: B:10:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleCustomSubmission(InternalCheckoutComponents internalCheckoutComponents, PaymentMethodComponent paymentMethodComponent, ComponentCallback componentCallback, PayPaymentSessionRequest payPaymentSessionRequest, l lVar, c cVar) {
        u uVar;
        int i4;
        PaymentMethodComponent paymentMethodComponent2;
        ComponentCallback componentCallback2;
        PaymentMethodComponent paymentMethodComponent3;
        ComponentCallback componentCallback3;
        Object encodePaymentRequestToBase64$core_standardRelease;
        String message;
        l onError;
        ApiCallResult apiCallResult;
        internalCheckoutComponents.getClass();
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i5 = uVar.f5024h;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                uVar.f5024h = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = uVar.f5022f;
                Object obj2 = Od.a.alpha;
                i4 = uVar.f5024h;
                if (i4 == 0) {
                    if (i4 == 1) {
                        componentCallback3 = uVar.f5019b;
                        paymentMethodComponent3 = uVar.f5018a;
                        try {
                            ResultKt.alpha(obj);
                        } catch (Exception e) {
                            e = e;
                            CheckoutErrorCode checkoutErrorCode = CheckoutErrorCode.BASE64_ENCODING_FAILED;
                            message = e.getMessage();
                            if (message == null) {
                                message = "Encountered an exception during payment submission";
                            }
                            CheckoutError.Integration integration = new CheckoutError.Integration(message, checkoutErrorCode, new CheckoutErrorDetails.Integration(internalCheckoutComponents.e.getF5107b(), internalCheckoutComponents.f4676a.getPaymentSession().getId(), paymentMethodComponent3.getName()));
                            internalCheckoutComponents.updatePaymentState$core_standardRelease(PaymentState.Default.INSTANCE, paymentMethodComponent3.getName().getValue());
                            N4.a.alpha(internalCheckoutComponents.e, integration, null, false, 4, null);
                            internalCheckoutComponents.updatedDetails = null;
                            onError = componentCallback3.getOnError();
                            if (onError != null) {
                                onError.invoke(paymentMethodComponent3, integration);
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    try {
                        encodePaymentRequestToBase64$core_standardRelease = internalCheckoutComponents.encodePaymentRequestToBase64$core_standardRelease(payPaymentSessionRequest);
                        paymentMethodComponent2 = paymentMethodComponent;
                    } catch (Exception e4) {
                        e = e4;
                        paymentMethodComponent2 = paymentMethodComponent;
                    }
                    try {
                        uVar.f5018a = paymentMethodComponent2;
                        componentCallback2 = componentCallback;
                    } catch (Exception e5) {
                        e = e5;
                        componentCallback2 = componentCallback;
                        paymentMethodComponent3 = paymentMethodComponent2;
                        componentCallback3 = componentCallback2;
                        CheckoutErrorCode checkoutErrorCode2 = CheckoutErrorCode.BASE64_ENCODING_FAILED;
                        message = e.getMessage();
                        if (message == null) {
                        }
                        CheckoutError.Integration integration2 = new CheckoutError.Integration(message, checkoutErrorCode2, new CheckoutErrorDetails.Integration(internalCheckoutComponents.e.getF5107b(), internalCheckoutComponents.f4676a.getPaymentSession().getId(), paymentMethodComponent3.getName()));
                        internalCheckoutComponents.updatePaymentState$core_standardRelease(PaymentState.Default.INSTANCE, paymentMethodComponent3.getName().getValue());
                        N4.a.alpha(internalCheckoutComponents.e, integration2, null, false, 4, null);
                        internalCheckoutComponents.updatedDetails = null;
                        onError = componentCallback3.getOnError();
                        if (onError != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    try {
                        uVar.f5019b = componentCallback2;
                        uVar.f5020c = null;
                        uVar.f5021d = null;
                        uVar.e = null;
                        uVar.f5024h = 1;
                        obj = lVar.invoke(encodePaymentRequestToBase64$core_standardRelease, uVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                        paymentMethodComponent3 = paymentMethodComponent2;
                        componentCallback3 = componentCallback2;
                    } catch (Exception e10) {
                        e = e10;
                        paymentMethodComponent3 = paymentMethodComponent2;
                        componentCallback3 = componentCallback2;
                        CheckoutErrorCode checkoutErrorCode22 = CheckoutErrorCode.BASE64_ENCODING_FAILED;
                        message = e.getMessage();
                        if (message == null) {
                        }
                        CheckoutError.Integration integration22 = new CheckoutError.Integration(message, checkoutErrorCode22, new CheckoutErrorDetails.Integration(internalCheckoutComponents.e.getF5107b(), internalCheckoutComponents.f4676a.getPaymentSession().getId(), paymentMethodComponent3.getName()));
                        internalCheckoutComponents.updatePaymentState$core_standardRelease(PaymentState.Default.INSTANCE, paymentMethodComponent3.getName().getValue());
                        N4.a.alpha(internalCheckoutComponents.e, integration22, null, false, 4, null);
                        internalCheckoutComponents.updatedDetails = null;
                        onError = componentCallback3.getOnError();
                        if (onError != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                apiCallResult = (ApiCallResult) obj;
                if (!(apiCallResult instanceof ApiCallResult.Failure)) {
                    internalCheckoutComponents.updatedDetails = null;
                    internalCheckoutComponents.updatePaymentState$core_standardRelease(PaymentState.Default.INSTANCE, paymentMethodComponent3.getName().getValue());
                } else if (apiCallResult instanceof ApiCallResult.Success) {
                    internalCheckoutComponents.updatePaymentState$core_standardRelease(PaymentState.InProgress.INSTANCE, paymentMethodComponent3.getName().getValue());
                    internalCheckoutComponents.a(paymentMethodComponent3, componentCallback3, ((ApiCallResult.Success) apiCallResult).getPaymentSessionSubmissionResult());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
        }
        uVar = new u(internalCheckoutComponents, cVar);
        Object obj3 = uVar.f5022f;
        Object obj22 = Od.a.alpha;
        i4 = uVar.f5024h;
        if (i4 == 0) {
        }
        apiCallResult = (ApiCallResult) obj3;
        if (!(apiCallResult instanceof ApiCallResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.checkout.components.interfaces.error.CheckoutError$Internal] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleDirectApiCall(InternalCheckoutComponents internalCheckoutComponents, PaymentMethodComponent paymentMethodComponent, ComponentCallback componentCallback, PayPaymentSessionRequest payPaymentSessionRequest, c cVar) {
        v vVar;
        int i4;
        PaymentMethodComponent paymentMethodComponent2;
        ComponentCallback componentCallback2;
        ResultWrapper resultWrapper;
        CheckoutError.Request request;
        List<String> list;
        internalCheckoutComponents.getClass();
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i5 = vVar.f5089f;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                vVar.f5089f = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = vVar.f5088d;
                Od.a aVar = Od.a.alpha;
                i4 = vVar.f5089f;
                CheckoutError.Request request2 = null;
                String str = null;
                if (i4 == 0) {
                    if (i4 == 1) {
                        componentCallback2 = vVar.f5086b;
                        paymentMethodComponent2 = vVar.f5085a;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    InterfaceC3439i invoke = internalCheckoutComponents.f4678c.invoke(internalCheckoutComponents.f4676a.getPublicKey(), internalCheckoutComponents.f4676a.getPaymentSession().getId(), internalCheckoutComponents.f4676a.getPaymentSession().getSecret(), payPaymentSessionRequest);
                    vVar.f5085a = paymentMethodComponent;
                    vVar.f5086b = componentCallback;
                    vVar.f5087c = null;
                    vVar.f5089f = 1;
                    obj = AbstractC3428A.november(invoke, vVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    paymentMethodComponent2 = paymentMethodComponent;
                    componentCallback2 = componentCallback;
                }
                resultWrapper = (ResultWrapper) obj;
                if (!(resultWrapper instanceof ResultWrapper.Success)) {
                    internalCheckoutComponents.handlePaymentSessionResponse$core_standardRelease(paymentMethodComponent2, (PayPaymentSessionResponse) ((ResultWrapper.Success) resultWrapper).getData(), componentCallback2);
                } else if (resultWrapper instanceof ResultWrapper.Error) {
                    ResultWrapper.Error error = (ResultWrapper.Error) resultWrapper;
                    internalCheckoutComponents.updatePaymentState$core_standardRelease(PaymentState.Default.INSTANCE, paymentMethodComponent2.getName().getValue());
                    InterfaceC1772d checkoutErrorClass = error.getCheckoutErrorClass();
                    kotlin.jvm.internal.v vVar2 = kotlin.jvm.internal.u.alpha;
                    if (Intrinsics.areEqual(checkoutErrorClass, vVar2.bravo(CheckoutError.Internal.class))) {
                        request = new CheckoutError.Internal(error.getMessage(), error.getCode(), new CheckoutErrorDetails.Internal(internalCheckoutComponents.e.getF5107b(), internalCheckoutComponents.f4676a.getPaymentSession().getId(), paymentMethodComponent2.getName()));
                    } else {
                        if (Intrinsics.areEqual(checkoutErrorClass, vVar2.bravo(CheckoutError.Request.class))) {
                            CheckoutErrorCode code = error.getCode();
                            String message = error.getMessage();
                            String f5107b = internalCheckoutComponents.e.getF5107b();
                            String id2 = internalCheckoutComponents.f4676a.getPaymentSession().getId();
                            ComponentName name = paymentMethodComponent2.getName();
                            ErrorResponse errorResponse = error.getErrorResponse();
                            if (errorResponse != null) {
                                list = errorResponse.getErrorCodes();
                            } else {
                                list = null;
                            }
                            ErrorResponse errorResponse2 = error.getErrorResponse();
                            if (errorResponse2 != null) {
                                str = errorResponse2.getRequestId();
                            }
                            request2 = new CheckoutError.Request(message, code, new CheckoutErrorDetails.Request(f5107b, id2, name, null, list, str, error.getHttpStatusCode()));
                        }
                        request = request2;
                    }
                    if (request != null) {
                        N4.a.alpha(internalCheckoutComponents.e, request, com.checkout.components.core.utils.extension.ExtensionsKt.toStackTraceString(error), false, 4, null);
                        l onError = componentCallback2.getOnError();
                        if (onError != null) {
                            onError.invoke(paymentMethodComponent2, request);
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
        }
        vVar = new v(internalCheckoutComponents, cVar);
        Object obj2 = vVar.f5088d;
        Od.a aVar2 = Od.a.alpha;
        i4 = vVar.f5089f;
        CheckoutError.Request request22 = null;
        String str2 = null;
        if (i4 == 0) {
        }
        resultWrapper = (ResultWrapper) obj2;
        if (!(resultWrapper instanceof ResultWrapper.Success)) {
        }
        return Unit.INSTANCE;
    }

    public static final Map b(InternalCheckoutComponents internalCheckoutComponents) {
        return internalCheckoutComponents.f4691q.invoke2();
    }

    public static final boolean c(InternalCheckoutComponents internalCheckoutComponents) {
        return com.checkout.components.core.utils.extension.ExtensionsKt.isCustomTabAvailable(internalCheckoutComponents.f4676a.getContext());
    }

    public static /* synthetic */ boolean charlie(CustomTabsEnabledGuard customTabsEnabledGuard, InternalCheckoutComponents internalCheckoutComponents) {
        return a(customTabsEnabledGuard, internalCheckoutComponents);
    }

    public static final RedirectDelegate d(InternalCheckoutComponents internalCheckoutComponents) {
        long j5;
        ColorTokens colorTokens;
        RedirectDelegate.Factory factory = internalCheckoutComponents.f4683i;
        Context context = internalCheckoutComponents.f4676a.getContext();
        Logger logger = internalCheckoutComponents.e;
        y yVar = new y(internalCheckoutComponents);
        CustomTabWarmupManager customTabWarmupManager = internalCheckoutComponents.customTabWarmupManager;
        DesignTokens appearance = internalCheckoutComponents.f4676a.getAppearance();
        if (appearance != null && (colorTokens = appearance.getColorTokens()) != null) {
            j5 = colorTokens.getColorFormBackground();
        } else {
            j5 = 4294967295L;
        }
        return factory.create(context, logger, yVar, customTabWarmupManager, (int) j5, ((Boolean) internalCheckoutComponents.isCustomTabAvailable.getValue()).booleanValue());
    }

    public static /* synthetic */ void getApmStateFlows$core_standardRelease$annotations() {
    }

    public static /* synthetic */ void getComponentLocale$annotations() {
    }

    public static /* synthetic */ void getComposeStyle$annotations() {
    }

    public static /* synthetic */ void getContextWithLocale$core_standardRelease$annotations() {
    }

    public static /* synthetic */ void getCustomTabWarmupManager$core_standardRelease$annotations() {
    }

    public static /* synthetic */ void getPaymentMethodComponents$core_standardRelease$annotations() {
    }

    public static /* synthetic */ void getPaymentStateFlow$core_standardRelease$annotations() {
    }

    public static /* synthetic */ void getRedirectingComponentType$core_standardRelease$annotations() {
    }

    public static /* synthetic */ void isCustomTabAvailable$core_standardRelease$annotations() {
    }

    public static /* synthetic */ void isRememberMeAvailable$core_standardRelease$annotations() {
    }

    public static /* synthetic */ PaymentMethodComponent juliet(InternalCheckoutComponents internalCheckoutComponents, PaymentMethodName paymentMethodName) {
        return a(internalCheckoutComponents, paymentMethodName);
    }

    public static /* synthetic */ void updatePaymentState$core_standardRelease$default(InternalCheckoutComponents internalCheckoutComponents, PaymentState paymentState, String str, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str = null;
        }
        internalCheckoutComponents.updatePaymentState$core_standardRelease(paymentState, str);
    }

    public final void buildRedirectOutcomeHandler$core_standardRelease(@NotNull RedirectOutcome outcome) {
        Intrinsics.echo(outcome, "outcome");
        String str = this.redirectingComponentType;
        Map<ComponentTranslationKey, String> map = null;
        this.redirectingComponentType = null;
        if (outcome instanceof RedirectOutcome.Success) {
            CustomTabWarmupManager customTabWarmupManager = this.customTabWarmupManager;
            if (customTabWarmupManager != null) {
                customTabWarmupManager.unbind();
            }
            updatePaymentState$core_standardRelease(PaymentState.Completed.INSTANCE, str);
            return;
        }
        if (outcome instanceof RedirectOutcome.Failure) {
            DeclineReason declineReason = DeclineReason.TryAgain;
            Context context = this.contextWithLocale;
            Map<Locale, Map<ComponentTranslationKey, String>> translations = this.f4676a.getTranslations();
            if (translations != null) {
                map = translations.get(getComponentLocale());
            }
            updatePaymentState$core_standardRelease(new PaymentState.Declined(com.checkout.components.core.utils.extension.ExtensionsKt.getPaymentDeclinedMessage(declineReason, context, map)), str);
            return;
        }
        if (outcome instanceof RedirectOutcome.Cancelled) {
            updatePaymentState$core_standardRelease(PaymentState.Default.INSTANCE, str);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.checkout.components.interfaces.api.CheckoutComponents
    @NotNull
    public final PaymentMethodComponent create(@NotNull ComponentName.Flow componentName, @Nullable ComponentOption specificOptions) {
        Object obj;
        Logger logger;
        Object obj2;
        PhoneNetworkEntity phone;
        int collectionSizeOrDefault;
        Intrinsics.echo(componentName, "componentName");
        if (this.f4693s.isEmpty()) {
            List<PaymentMethod> paymentMethods = this.f4677b.getPaymentMethods();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(paymentMethods, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = paymentMethods.iterator();
            while (it.hasNext()) {
                arrayList.add(new PaymentMethodName(((PaymentMethod) it.next()).getType()));
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj3 = arrayList.get(i4);
                i4++;
                if (!Intrinsics.areEqual((PaymentMethodName) obj3, PaymentMethodName.INSTANCE.getRememberMe())) {
                    arrayList2.add(obj3);
                }
            }
            Map map = (Map) this.f4674E.getValue();
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj4 = arrayList2.get(i5);
                i5++;
                PaymentMethodName paymentMethodName = (PaymentMethodName) obj4;
                PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
                if (Intrinsics.areEqual(paymentMethodName, companion.getCard()) || Intrinsics.areEqual(paymentMethodName, companion.getGooglePay()) || map.containsKey(paymentMethodName.getValue())) {
                    arrayList3.add(obj4);
                }
            }
            int size3 = arrayList3.size();
            int i10 = 0;
            while (i10 < size3) {
                Object obj5 = arrayList3.get(i10);
                i10++;
                PaymentMethodName paymentMethodName2 = (PaymentMethodName) obj5;
                a(paymentMethodName2, specificOptions == null ? this.f4676a.getComponentOptions().get(paymentMethodName2) : specificOptions, false, false);
            }
        }
        ComponentCallback a6 = a(specificOptions);
        FlowComponentFactory flowComponentFactory = this.f4680f;
        LinkedHashMap linkedHashMap = this.f4693s;
        Context context = this.contextWithLocale;
        Q0.n layoutDirection = com.checkout.components.core.utils.extension.ExtensionsKt.getLayoutDirection(getComponentLocale());
        ComposeStyle composeStyle = this.composeStyle;
        Map<Locale, Map<ComponentTranslationKey, String>> translations = this.f4676a.getTranslations();
        Map<ComponentTranslationKey, String> map2 = translations != null ? translations.get(getComponentLocale()) : null;
        LogDetailsImpl a8 = a(ComponentName.Flow.INSTANCE);
        Logger logger2 = this.e;
        ForwardingEmailsDisabledGuard forwardingEmailsDisabledGuard = this.f4684j;
        Iterator<T> it2 = this.f4677b.getPaymentMethods().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (Intrinsics.areEqual(((PaymentMethod) obj).getType(), PaymentMethodName.INSTANCE.getRememberMe().getValue())) {
                break;
            }
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        String email = paymentMethod != null ? paymentMethod.getEmail() : null;
        Iterator<T> it3 = this.f4677b.getPaymentMethods().iterator();
        while (true) {
            if (!it3.hasNext()) {
                logger = logger2;
                obj2 = null;
                break;
            }
            obj2 = it3.next();
            logger = logger2;
            if (Intrinsics.areEqual(((PaymentMethod) obj2).getType(), PaymentMethodName.INSTANCE.getRememberMe().getValue())) {
                break;
            }
            logger2 = logger;
        }
        PaymentMethod paymentMethod2 = (PaymentMethod) obj2;
        return flowComponentFactory.create$core_standardRelease(new FlowComponentConfig(linkedHashMap, composeStyle, context, layoutDirection, map2, a6, a8, a(com.checkout.components.core.utils.extension.ExtensionsKt.createInheritedRememberMeConfiguration(specificOptions, forwardingEmailsDisabledGuard, email, (paymentMethod2 == null || (phone = paymentMethod2.getPhone()) == null) ? null : new Phone(phone.getCountryCode(), phone.getNumber())), a6), logger));
    }

    @Nullable
    public final l decorateHandleTap$core_standardRelease(@Nullable l handleTap) {
        if (handleTap == null) {
            return null;
        }
        return new q(this, handleTap, null);
    }

    @NotNull
    public final String encodePaymentRequestToBase64$core_standardRelease(@Nullable PayPaymentSessionRequest paymentRequest) {
        if (paymentRequest != null) {
            try {
                byte[] bytes = serializePaymentRequest$core_standardRelease(paymentRequest).getBytes(kotlin.text.a.alpha);
                Intrinsics.delta(bytes, "getBytes(...)");
                String encodeToString = Base64.encodeToString(bytes, 2);
                if (encodeToString != null) {
                    return encodeToString;
                }
                return "";
            } catch (Exception e) {
                throw new Exception(av.q.echo("Failed to encode payment request to base64 : ", kotlin.jvm.internal.u.alpha.bravo(e.getClass()).kilo()), e);
            }
        }
        return "";
    }

    @NotNull
    public final String extractToken(@NotNull String paymentData) {
        PaymentMethodData paymentMethodData;
        TokenizationData tokenizationData;
        String token;
        Intrinsics.echo(paymentData, "paymentData");
        PaymentDataJson paymentDataJson = (PaymentDataJson) this.f4679d.adapter(PaymentDataJson.class).fromJson(paymentData);
        if (paymentDataJson != null && (paymentMethodData = paymentDataJson.getPaymentMethodData()) != null && (tokenizationData = paymentMethodData.getTokenizationData()) != null && (token = tokenizationData.getToken()) != null) {
            return token;
        }
        throw new CheckoutError.Internal(CommonErrorMessages.ERROR_MESSAGE_GOOGLE_PAY_PAYMENT_DATA, CheckoutErrorCode.PAYMENT_METHOD_ATTEMPT_FAILED, ErrorExtensionsKt.toInternalErrorDetails(a(PaymentMethodName.INSTANCE.getGooglePay())));
    }

    @NotNull
    public final ConcurrentHashMap<String, at> getApmStateFlows$core_standardRelease() {
        return this.apmStateFlows;
    }

    @Override // com.checkout.components.interfaces.api.CheckoutComponents
    @NotNull
    public final Locale getComponentLocale() {
        Locale locale = this.f4676a.getLocale();
        if (locale == null) {
            return ExtensionsKt.mapToLocale(this.f4677b.getLocale());
        }
        return locale;
    }

    @NotNull
    public final ComposeStyle getComposeStyle() {
        return this.composeStyle;
    }

    @NotNull
    /* renamed from: getContextWithLocale$core_standardRelease, reason: from getter */
    public final Context getContextWithLocale() {
        return this.contextWithLocale;
    }

    @Nullable
    /* renamed from: getCustomTabWarmupManager$core_standardRelease, reason: from getter */
    public final CustomTabWarmupManager getCustomTabWarmupManager() {
        return this.customTabWarmupManager;
    }

    @NotNull
    public final Map<ComponentName, PaymentMethodComponent> getPaymentMethodComponents$core_standardRelease() {
        return this.f4693s;
    }

    @NotNull
    /* renamed from: getPaymentStateFlow$core_standardRelease, reason: from getter */
    public final at getPaymentStateFlow() {
        return this.paymentStateFlow;
    }

    @Nullable
    /* renamed from: getRedirectingComponentType$core_standardRelease, reason: from getter */
    public final String getRedirectingComponentType() {
        return this.redirectingComponentType;
    }

    @Nullable
    /* renamed from: getUpdatedDetails$core_standardRelease, reason: from getter */
    public final UpdateDetails getUpdatedDetails() {
        return this.updatedDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.checkout.components.interfaces.model.GooglePayResponseStatus] */
    @Override // com.checkout.components.interfaces.api.CheckoutComponents
    /* renamed from: handleActivityResult */
    public final void mo83handleActivityResult(int resultCode, @NotNull String paymentData) {
        InternalCheckoutComponents internalCheckoutComponents;
        String str;
        Intrinsics.echo(paymentData, "paymentData");
        ComponentCallback componentCallback = this.f4681g.getComponentCallback();
        LinkedHashMap linkedHashMap = this.f4693s;
        PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
        Object obj = linkedHashMap.get(companion.getGooglePay());
        Intrinsics.charlie(obj, "null cannot be cast to non-null type com.checkout.components.wallet.WalletComponent");
        WalletComponent walletComponent = (WalletComponent) obj;
        try {
            GooglePayResponseStatus fromCode = GooglePayResponseStatus.INSTANCE.fromCode(resultCode);
            internalCheckoutComponents = GooglePayResponseStatus.SUCCESS;
            try {
                if (fromCode == internalCheckoutComponents) {
                    ad.zulu(this.f4687m, null, null, new s(this, walletComponent, componentCallback, extractToken(paymentData), null), 3);
                    return;
                }
                updatePaymentState$core_standardRelease(PaymentState.Default.INSTANCE, companion.getGooglePay().getValue());
                if (GooglePayResponseStatus.CANCELLED != fromCode) {
                    CheckoutErrorCode checkoutErrorCode = CheckoutErrorCode.PAYMENT_REQUEST_FAILED;
                    if (fromCode == null || (str = fromCode.toString()) == null) {
                        str = "code: " + resultCode;
                    }
                    CheckoutError.PaymentMethod paymentMethod = new CheckoutError.PaymentMethod("Google Pay payment request failed with status: " + str, checkoutErrorCode, ErrorExtensionsKt.toPaymentMethodErrorDetails(a(companion.getGooglePay())));
                    N4.a.alpha(this.e, paymentMethod, null, false, 6, null);
                    l onError = componentCallback.getOnError();
                    if (onError != null) {
                        onError.invoke(walletComponent, paymentMethod);
                    }
                }
            } catch (CheckoutError e) {
                e = e;
                CheckoutError checkoutError = e;
                updatePaymentState$core_standardRelease(PaymentState.Default.INSTANCE, PaymentMethodName.INSTANCE.getGooglePay().getValue());
                N4.a.alpha(internalCheckoutComponents.e, checkoutError, null, false, 6, null);
                l onError2 = componentCallback.getOnError();
                if (onError2 != null) {
                    onError2.invoke(walletComponent, checkoutError);
                }
            }
        } catch (CheckoutError e4) {
            e = e4;
            internalCheckoutComponents = this;
        }
    }

    public final void handleCardTokenResult$core_standardRelease(@NotNull ComponentResult<CardTokenDetails, ? extends CheckoutError> result, boolean continuePaymentFlow, @NotNull ComponentCallback callback) {
        Intrinsics.echo(result, "result");
        Intrinsics.echo(callback, "callback");
        if (result instanceof ComponentResult.Success) {
            ad.zulu(this.f4687m, null, null, new t((ComponentResult.Success) result, this, continuePaymentFlow, callback, null), 3);
            return;
        }
        if (result instanceof ComponentResult.Error) {
            PaymentState.Default r92 = PaymentState.Default.INSTANCE;
            PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
            updatePaymentState$core_standardRelease(r92, companion.getCard().getValue());
            l onError = callback.getOnError();
            if (onError != null) {
                Object obj = this.f4693s.get(companion.getCard());
                Intrinsics.charlie(obj, "null cannot be cast to non-null type com.checkout.components.card.CardComponent");
                onError.invoke((CardComponent) obj, ((ComponentResult.Error) result).getError());
                return;
            }
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public final Object handlePaymentResult$core_standardRelease(@NotNull PaymentMethodComponent paymentMethodComponent, @NotNull ComponentCallback componentCallback, @NotNull PayRequestPayload payRequestPayload, @NotNull c<? super Unit> cVar) {
        PayPaymentSessionRequest build = this.f4689o.build(payRequestPayload);
        e eVar = ao.alpha;
        Object blue = ad.blue(Af.n.alpha, new w(this, paymentMethodComponent, componentCallback, build, null), cVar);
        if (blue == Od.a.alpha) {
            return blue;
        }
        return Unit.INSTANCE;
    }

    public final void handlePaymentSessionResponse$core_standardRelease(@NotNull PaymentMethodComponent component, @NotNull PayPaymentSessionResponse response, @NotNull ComponentCallback callback) {
        String url;
        Intrinsics.echo(component, "component");
        Intrinsics.echo(response, "response");
        Intrinsics.echo(callback, "callback");
        Map<ComponentTranslationKey, String> map = null;
        this.updatedDetails = null;
        int i4 = WhenMappings.$EnumSwitchMapping$0[response.getStatus().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    PayPaymentSessionResponse.Declined declined = (PayPaymentSessionResponse.Declined) response;
                    DeclineReason declineReason = declined.getDeclineReason();
                    Context context = this.contextWithLocale;
                    Map<Locale, Map<ComponentTranslationKey, String>> translations = this.f4676a.getTranslations();
                    if (translations != null) {
                        map = translations.get(getComponentLocale());
                    }
                    updatePaymentState$core_standardRelease(new PaymentState.Declined(com.checkout.components.core.utils.extension.ExtensionsKt.getPaymentDeclinedMessage(declineReason, context, map)), component.getName().getValue());
                    CheckoutError.Request request = new CheckoutError.Request("DeclineReason is " + declineReason + " - Try another payment method", CheckoutErrorCode.PAYMENT_REQUEST_DECLINED, new CheckoutErrorDetails.Request(this.e.getF5107b(), this.f4677b.getId(), component.getName(), declined.getId(), kotlin.collections.ab.juliet(declineReason.getValue()), null, null));
                    N4.a.alpha(this.e, request, null, false, 6, null);
                    l onError = callback.getOnError();
                    if (onError != null) {
                        onError.invoke(component, request);
                        return;
                    }
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
            CustomTabWarmupManager customTabWarmupManager = this.customTabWarmupManager;
            if (customTabWarmupManager != null) {
                customTabWarmupManager.unbind();
            }
            updatePaymentState$core_standardRelease(PaymentState.Completed.INSTANCE, component.getName().getValue());
            l onSuccess = callback.getOnSuccess();
            if (onSuccess != null) {
                onSuccess.invoke(component, response.getId());
                return;
            }
            return;
        }
        PayPaymentSessionResponse.ActionRequired actionRequired = (PayPaymentSessionResponse.ActionRequired) response;
        PaymentAction action = actionRequired.getAction();
        if (action instanceof PaymentAction.ThreeDS) {
            url = ((PaymentAction.ThreeDS) action).getUrl();
        } else if (action instanceof PaymentAction.Redirect) {
            url = ((PaymentAction.Redirect) action).getUrl();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        String str = url;
        if (str != null) {
            this.redirectingComponentType = component.getName().getValue();
            ((RedirectDelegate) this.f4673D.getValue()).triggerRedirect(component, str, actionRequired.getId(), this.f4677b.getId(), a(component.getName()), callback, actionRequired.getAction().getCom.clevertap.android.sdk.Constants.KEY_TYPE java.lang.String());
        }
    }

    @Nullable
    public final Object handleRememberMePayment$core_standardRelease(@NotNull PayRequestPayload.RememberMe rememberMe, @NotNull c<? super Unit> cVar) {
        Object blue = ad.blue(this.f4687m.charlie(), new x(this, rememberMe, null), cVar);
        if (blue == Od.a.alpha) {
            return blue;
        }
        return Unit.INSTANCE;
    }

    public final boolean isCustomTabAvailable$core_standardRelease() {
        return ((Boolean) this.isCustomTabAvailable.getValue()).booleanValue();
    }

    public final boolean isRememberMeAvailable$core_standardRelease() {
        boolean z2;
        List<PaymentMethod> paymentMethods = this.f4677b.getPaymentMethods();
        if (paymentMethods != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !paymentMethods.isEmpty()) {
            Iterator<T> it = paymentMethods.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((PaymentMethod) it.next()).getType(), PaymentMethodName.INSTANCE.getRememberMe().getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final String serializePaymentRequest$core_standardRelease(@NotNull PayPaymentSessionRequest request) {
        String json;
        Intrinsics.echo(request, "request");
        try {
            if (request instanceof PayPaymentSessionRequest.Card) {
                json = this.f4679d.adapter(PayPaymentSessionRequest.Card.class).toJson(request);
            } else if (request instanceof PayPaymentSessionRequest.GooglePay) {
                json = this.f4679d.adapter(PayPaymentSessionRequest.GooglePay.class).toJson(request);
            } else if (request instanceof PayPaymentSessionRequest.RememberMe) {
                json = this.f4679d.adapter(PayPaymentSessionRequest.RememberMe.class).toJson(request);
            } else if (request instanceof PayPaymentSessionRequest.Apm) {
                json = this.f4679d.adapter(PayPaymentSessionRequest.Apm.class).toJson(request);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNull(json);
            return json;
        } catch (Exception e) {
            throw new Exception(ao.ad.gray("Failed to serialize ", kotlin.jvm.internal.u.alpha.bravo(request.getClass()).kilo(), " to JSON"), e);
        }
    }

    public final void setRedirectingComponentType$core_standardRelease(@Nullable String str) {
        this.redirectingComponentType = str;
    }

    public final void setUpdatedDetails$core_standardRelease(@Nullable UpdateDetails updateDetails) {
        this.updatedDetails = updateDetails;
    }

    @Nullable
    public final Object submitComponentPayment$core_standardRelease(@NotNull PaymentMethodComponent paymentMethodComponent, @NotNull ComponentCallback componentCallback, @NotNull PayRequestPayload payRequestPayload, @NotNull c<? super Unit> cVar) {
        updatePaymentState$core_standardRelease(PaymentState.InProgress.INSTANCE, paymentMethodComponent.getName().getValue());
        Object handlePaymentResult$core_standardRelease = handlePaymentResult$core_standardRelease(paymentMethodComponent, componentCallback, payRequestPayload, cVar);
        if (handlePaymentResult$core_standardRelease == Od.a.alpha) {
            return handlePaymentResult$core_standardRelease;
        }
        return Unit.INSTANCE;
    }

    public final void updatePaymentState$core_standardRelease(@NotNull PaymentState state, @Nullable String componentName) {
        N n5;
        Object value;
        N n10;
        Object value2;
        at atVar;
        N n11;
        Object value3;
        N n12;
        Object value4;
        N n13;
        Object value5;
        N n14;
        Object value6;
        N n15;
        Object value7;
        Intrinsics.echo(state, "state");
        if (state instanceof PaymentState.Declined) {
            PaymentState.Declined declined = (PaymentState.Declined) state;
            if (componentName != null) {
                atVar = (at) this.apmStateFlows.get(componentName);
            } else {
                atVar = null;
            }
            if (atVar == null) {
                at atVar2 = this.paymentStateFlow;
                do {
                    n11 = (N) atVar2;
                    value3 = n11.getValue();
                } while (!n11.hotel(value3, declined));
                Collection<at> values = this.apmStateFlows.values();
                Intrinsics.delta(values, "<get-values>(...)");
                for (at atVar3 : values) {
                    Intrinsics.checkNotNull(atVar3);
                    do {
                        n12 = (N) atVar3;
                        value4 = n12.getValue();
                    } while (!n12.hotel(value4, PaymentState.Default.INSTANCE));
                }
                return;
            }
            do {
                n13 = (N) atVar;
                value5 = n13.getValue();
            } while (!n13.hotel(value5, declined));
            ConcurrentHashMap concurrentHashMap = this.apmStateFlows;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (!Intrinsics.areEqual((String) entry.getKey(), componentName)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (at atVar4 : linkedHashMap.values()) {
                do {
                    n15 = (N) atVar4;
                    value7 = n15.getValue();
                } while (!n15.hotel(value7, PaymentState.Default.INSTANCE));
            }
            at atVar5 = this.paymentStateFlow;
            do {
                n14 = (N) atVar5;
                value6 = n14.getValue();
            } while (!n14.hotel(value6, PaymentState.Default.INSTANCE));
            return;
        }
        Collection<at> values2 = this.apmStateFlows.values();
        Intrinsics.delta(values2, "<get-values>(...)");
        for (at atVar6 : values2) {
            Intrinsics.checkNotNull(atVar6);
            do {
                n10 = (N) atVar6;
                value2 = n10.getValue();
            } while (!n10.hotel(value2, state));
        }
        at atVar7 = this.paymentStateFlow;
        do {
            n5 = (N) atVar7;
            value = n5.getValue();
        } while (!n5.hotel(value, state));
    }

    public static final Unit b(InternalCheckoutComponents internalCheckoutComponents, ComponentCallback componentCallback) {
        Function1<PaymentMethodComponent, Unit> onSubmit;
        Object obj = internalCheckoutComponents.f4693s.get(PaymentMethodName.INSTANCE.getCard());
        CardComponent cardComponent = obj instanceof CardComponent ? (CardComponent) obj : null;
        if (cardComponent != null && (onSubmit = componentCallback.getOnSubmit()) != null) {
            onSubmit.invoke(cardComponent);
        }
        return Unit.INSTANCE;
    }

    public static final String a(InternalCheckoutComponents internalCheckoutComponents) {
        return internalCheckoutComponents.f4676a.getContext().getPackageName();
    }

    public static final Unit a(InternalCheckoutComponents internalCheckoutComponents, ComponentCallback componentCallback) {
        Function1<PaymentMethodComponent, Unit> onChange;
        Object obj = internalCheckoutComponents.f4693s.get(PaymentMethodName.INSTANCE.getCard());
        CardComponent cardComponent = obj instanceof CardComponent ? (CardComponent) obj : null;
        if (cardComponent != null && (onChange = componentCallback.getOnChange()) != null) {
            onChange.invoke(cardComponent);
        }
        return Unit.INSTANCE;
    }

    public static final List b(PaymentMethod getSupportedCardSchemes) {
        Intrinsics.echo(getSupportedCardSchemes, "$this$getSupportedCardSchemes");
        CardParameters cardParameters = getSupportedCardSchemes.getCardParameters();
        if (cardParameters != null) {
            return cardParameters.getAllowedCardNetworks();
        }
        return null;
    }

    private final void a(PaymentMethodComponent paymentMethodComponent, ComponentCallback componentCallback, PaymentSessionSubmissionResult paymentSessionSubmissionResult) {
        try {
            PaymentSessionSubmissionResultToResponseMapper paymentSessionSubmissionResultToResponseMapper = this.f4690p;
            if (paymentSessionSubmissionResultToResponseMapper == null) {
                paymentSessionSubmissionResultToResponseMapper = new PaymentSessionSubmissionResultToResponseMapper();
            }
            handlePaymentSessionResponse$core_standardRelease(paymentMethodComponent, paymentSessionSubmissionResultToResponseMapper.map(paymentSessionSubmissionResult), componentCallback);
        } catch (Exception e) {
            CheckoutErrorCode checkoutErrorCode = CheckoutErrorCode.SUBMISSION_PARSE_ERROR;
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to parse payment submission result";
            }
            CheckoutError.Integration integration = new CheckoutError.Integration(message, checkoutErrorCode, new CheckoutErrorDetails.Integration(this.e.getF5107b(), this.f4676a.getPaymentSession().getId(), paymentMethodComponent.getName()));
            String echo = AbstractC2689j6.echo(e);
            updatePaymentState$core_standardRelease(PaymentState.Default.INSTANCE, paymentMethodComponent.getName().getValue());
            N4.a.alpha(this.e, integration, echo, false, 4, null);
            this.updatedDetails = null;
            l onError = componentCallback.getOnError();
            if (onError != null) {
                onError.invoke(paymentMethodComponent, integration);
            }
        }
    }

    private final PaymentMethodComponent a(PaymentMethodName paymentMethodName, ComponentOption componentOption, boolean z2, boolean z10) {
        LinkedHashMap linkedHashMap;
        Q0.n nVar;
        DesignTokens designTokens;
        java.util.Locale locale;
        Map<ComponentTranslationKey, String> map;
        Context context;
        List<CardTypeName.GooglePay> list;
        GooglePayButtonTheme googlePayButtonTheme;
        GooglePayButtonType googlePayButtonType;
        GooglePayConfiguration googlePayConfiguration;
        GooglePayConfiguration googlePayConfiguration2;
        GooglePayConfiguration googlePayConfiguration3;
        ColorTokens colorTokens;
        InternalCheckoutComponents internalCheckoutComponents = this;
        ComponentOption componentOption2 = componentOption;
        LinkedHashMap linkedHashMap2 = internalCheckoutComponents.f4693s;
        Object obj = linkedHashMap2.get(paymentMethodName);
        if (obj == null) {
            ComponentCallback a6 = internalCheckoutComponents.a(componentOption2);
            PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
            if (Intrinsics.areEqual(paymentMethodName, companion.getCard())) {
                obj = internalCheckoutComponents.a(a6, z2, componentOption2, z10);
            } else {
                if (Intrinsics.areEqual(paymentMethodName, companion.getGooglePay())) {
                    WalletComponentFactory walletComponentFactory = internalCheckoutComponents.f4681g;
                    Context context2 = internalCheckoutComponents.contextWithLocale;
                    Environment environment = internalCheckoutComponents.f4676a.getEnvironment();
                    PaymentSession paymentSession = internalCheckoutComponents.f4677b;
                    String publicKey = internalCheckoutComponents.f4676a.getPublicKey();
                    GooglePayFlowCoordinator googlePayFlowCoordinator = (GooglePayFlowCoordinator) internalCheckoutComponents.f4676a.getFlowCoordinators().get(companion.getGooglePay());
                    Logger logger = internalCheckoutComponents.e;
                    LogDetailsImpl a8 = internalCheckoutComponents.a(companion.getGooglePay());
                    linkedHashMap = linkedHashMap2;
                    av avVar = new av(internalCheckoutComponents.paymentStateFlow);
                    DesignTokens appearance = internalCheckoutComponents.f4676a.getAppearance();
                    long delta = a0.ao.delta((appearance == null || (colorTokens = appearance.getColorTokens()) == null) ? 4289538110L : colorTokens.getColorError());
                    List<CardScheme> supportedCardSchemes = UtilsKt.getSupportedCardSchemes(componentOption2 != null ? componentOption2.getGooglePayConfiguration() : null, companion.getGooglePay(), internalCheckoutComponents.f4677b, new ar(6));
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = supportedCardSchemes.iterator();
                    while (it.hasNext()) {
                        String googlePayCardNetwork = UtilsKt.toGooglePayCardNetwork((CardScheme) it.next());
                        if (googlePayCardNetwork != null) {
                            arrayList.add(googlePayCardNetwork);
                        }
                    }
                    if (componentOption2 == null || (googlePayConfiguration3 = componentOption2.getGooglePayConfiguration()) == null) {
                        context = context2;
                        list = null;
                    } else {
                        context = context2;
                        list = googlePayConfiguration3.getAcceptedCardTypes();
                    }
                    if (componentOption2 == null || (googlePayConfiguration2 = componentOption2.getGooglePayConfiguration()) == null || (googlePayButtonTheme = googlePayConfiguration2.getButtonTheme()) == null) {
                        googlePayButtonTheme = GooglePayButtonTheme.DARK;
                    }
                    GooglePayButtonTheme googlePayButtonTheme2 = googlePayButtonTheme;
                    if (componentOption2 == null || (googlePayConfiguration = componentOption2.getGooglePayConfiguration()) == null || (googlePayButtonType = googlePayConfiguration.getButtonType()) == null) {
                        googlePayButtonType = GooglePayButtonType.BUY;
                    }
                    obj = walletComponentFactory.create(new WalletComponentConfig(context, environment, paymentSession, publicKey, a6, googlePayFlowCoordinator, avVar, logger, a8, delta, z2, new Y(25, internalCheckoutComponents), arrayList, list, googlePayButtonTheme2, googlePayButtonType, null));
                } else {
                    linkedHashMap = linkedHashMap2;
                    if (!Intrinsics.areEqual(paymentMethodName, companion.getRememberMe())) {
                        PaymentMethodComponentFactory paymentMethodComponentFactory = (PaymentMethodComponentFactory) ((Map) internalCheckoutComponents.f4674E.getValue()).get(paymentMethodName.getValue());
                        if (paymentMethodComponentFactory != null) {
                            Context context3 = internalCheckoutComponents.contextWithLocale;
                            PaymentSession paymentSession2 = internalCheckoutComponents.f4677b;
                            for (PaymentMethod paymentMethod : paymentSession2.getPaymentMethods()) {
                                if (Intrinsics.areEqual(paymentMethod.getType(), paymentMethodName.getValue())) {
                                    N charlie = AbstractC3428A.charlie(PaymentState.Default.INSTANCE);
                                    internalCheckoutComponents.apmStateFlows.put(paymentMethodName.getValue(), charlie);
                                    av avVar2 = new av(charlie);
                                    Q0.n layoutDirection = com.checkout.components.core.utils.extension.ExtensionsKt.getLayoutDirection(internalCheckoutComponents.getComponentLocale());
                                    Logger logger2 = internalCheckoutComponents.e;
                                    LogDetailsImpl a10 = a(paymentMethodName);
                                    DesignTokens appearance2 = internalCheckoutComponents.f4676a.getAppearance();
                                    java.util.Locale mapToLocale = ExtensionsKt.mapToLocale(internalCheckoutComponents.getComponentLocale());
                                    Map<Locale, Map<ComponentTranslationKey, String>> translations = internalCheckoutComponents.f4676a.getTranslations();
                                    if (translations != null) {
                                        Map<ComponentTranslationKey, String> map2 = translations.get(internalCheckoutComponents.getComponentLocale());
                                        nVar = layoutDirection;
                                        designTokens = appearance2;
                                        locale = mapToLocale;
                                        map = map2;
                                    } else {
                                        nVar = layoutDirection;
                                        designTokens = appearance2;
                                        locale = mapToLocale;
                                        map = null;
                                    }
                                    obj = paymentMethodComponentFactory.create(new PaymentMethodConfig(context3, paymentSession2, paymentMethod, componentOption2, avVar2, logger2, nVar, a10, designTokens, locale, map, new aq(18, a6), internalCheckoutComponents.B.invoke(a6, (Function0<? extends PaymentMethodComponent>) new a(13, internalCheckoutComponents, paymentMethodName)), a6.getOnReady(), z2));
                                } else {
                                    internalCheckoutComponents = this;
                                    componentOption2 = componentOption;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        throw ErrorExtensionsKt.toComponentNotSupportedError(a(paymentMethodName));
                    }
                    throw ErrorExtensionsKt.toComponentNotSupportedError(a(companion.getRememberMe()));
                }
                linkedHashMap2 = linkedHashMap;
            }
            linkedHashMap2.put(paymentMethodName, obj);
        }
        return (PaymentMethodComponent) obj;
    }

    @Override // com.checkout.components.interfaces.api.CheckoutComponents
    @NotNull
    public final PaymentMethodComponent create(@NotNull PaymentMethodName componentName, @Nullable ComponentOption specificOptions) {
        List<PaymentMethod> paymentMethods;
        Intrinsics.echo(componentName, "componentName");
        String value = componentName.getValue();
        if (!Intrinsics.areEqual(value, PaymentMethodName.INSTANCE.getRememberMe().getValue()) && ((paymentMethods = this.f4677b.getPaymentMethods()) == null || !paymentMethods.isEmpty())) {
            Iterator<T> it = paymentMethods.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Intrinsics.areEqual(((PaymentMethod) it.next()).getType(), value)) {
                    if (com.checkout.components.core.utils.extension.ExtensionsKt.toKnownPaymentMethodName(value) != null || ((Map) this.f4674E.getValue()).containsKey(value)) {
                        if (specificOptions == null) {
                            specificOptions = this.f4676a.getComponentOptions().get(componentName);
                        }
                        return a(componentName, specificOptions, true, true);
                    }
                }
            }
        }
        CheckoutError.Integration componentNotSupportedError = ErrorExtensionsKt.toComponentNotSupportedError(a(componentName));
        N4.a.alpha(this.e, componentNotSupportedError, null, false, 6, null);
        throw componentNotSupportedError;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InternalCheckoutComponents(CheckoutComponentConfiguration.Payment payment, PaymentSession paymentSession, PayPaymentSessionUseCase payPaymentSessionUseCase, Moshi moshi, Mapper mapper, Logger logger, FlowComponentFactory flowComponentFactory, WalletComponentFactory walletComponentFactory, CardSchemePolicy cardSchemePolicy, CardComponentFactory cardComponentFactory, RedirectDelegate.Factory factory, CustomTabsEnabledGuard customTabsEnabledGuard, ForwardingEmailsDisabledGuard forwardingEmailsDisabledGuard, StandaloneCheckoutComponents standaloneCheckoutComponents, RiskManager riskManager, ab abVar, CheckoutRememberMeFactory checkoutRememberMeFactory, PayRequestBuilder payRequestBuilder, PaymentSessionSubmissionResultToResponseMapper paymentSessionSubmissionResultToResponseMapper, DynamicComponentFactoriesProvider dynamicComponentFactoriesProvider, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, paymentSession, payPaymentSessionUseCase, moshi, mapper, r8, r9, r10, r11, r12, factory, customTabsEnabledGuard, forwardingEmailsDisabledGuard, r16, riskManager, r18, checkoutRememberMeFactory, payRequestBuilder, (i4 & 262144) != 0 ? null : paymentSessionSubmissionResultToResponseMapper, dynamicComponentFactoriesProvider);
        FlowComponentFactory flowComponentFactory2;
        CardSchemePolicy cardSchemePolicy2;
        CardComponentFactory cardComponentFactory2;
        CheckoutComponentConfiguration.Payment payment2;
        Logger logger2;
        StandaloneCheckoutComponents standaloneCheckoutComponents2;
        ab abVar2;
        if ((i4 & 64) != 0) {
            FlowComponentFactory.INSTANCE.getClass();
            flowComponentFactory2 = (FlowComponentFactory) FlowComponentFactory.INSTANCE$delegate.getValue();
        } else {
            flowComponentFactory2 = flowComponentFactory;
        }
        WalletComponentFactory instance = (i4 & 128) != 0 ? WalletComponentFactory.INSTANCE.getINSTANCE() : walletComponentFactory;
        if ((i4 & 512) != 0) {
            cardSchemePolicy2 = cardSchemePolicy;
            cardComponentFactory2 = new DefaultCardComponentFactory(cardSchemePolicy2);
        } else {
            cardSchemePolicy2 = cardSchemePolicy;
            cardComponentFactory2 = cardComponentFactory;
        }
        if ((i4 & 8192) != 0) {
            payment2 = payment;
            logger2 = logger;
            standaloneCheckoutComponents2 = new StandaloneCheckoutComponents(logger2, payment2);
        } else {
            payment2 = payment;
            logger2 = logger;
            standaloneCheckoutComponents2 = standaloneCheckoutComponents;
        }
        if ((32768 & i4) != 0) {
            e eVar = ao.alpha;
            abVar2 = ad.charlie(d.purple);
        } else {
            abVar2 = abVar;
        }
    }

    @Override // com.checkout.components.interfaces.api.StandaloneComponentFactory
    @NotNull
    public final StandaloneComponent create(@NotNull StandaloneComponentName componentName) {
        Intrinsics.echo(componentName, "componentName");
        return this.f4685k.create(componentName);
    }

    public static final Unit a(InternalCheckoutComponents internalCheckoutComponents, UpdateDetails details) {
        Intrinsics.echo(details, "details");
        internalCheckoutComponents.updatedDetails = details;
        return Unit.INSTANCE;
    }

    public static final PaymentMethodComponent a(InternalCheckoutComponents internalCheckoutComponents, PaymentMethodName paymentMethodName) {
        return (PaymentMethodComponent) kotlin.collections.y.papa(internalCheckoutComponents.f4693s, paymentMethodName);
    }

    public static final void a(ComponentCallback componentCallback, PaymentMethodComponent component, CheckoutError error) {
        Intrinsics.echo(component, "component");
        Intrinsics.echo(error, "error");
        l onError = componentCallback.getOnError();
        if (onError != null) {
            onError.invoke(component, error);
        }
    }

    private final LogDetailsImpl a(ComponentName componentName) {
        return new LogDetailsImpl(this.e.getF5107b(), this.f4677b.getId(), componentName);
    }

    private final CardComponent a(ComponentCallback componentCallback, boolean z2, ComponentOption componentOption, boolean z10) {
        Object obj;
        Object obj2;
        List<CardTypeName> entries;
        l onError;
        CardConfiguration cardConfiguration;
        Boolean showPayButton;
        PhoneNetworkEntity phone;
        ForwardingEmailsDisabledGuard forwardingEmailsDisabledGuard = this.f4684j;
        Iterator<T> it = this.f4677b.getPaymentMethods().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((PaymentMethod) obj).getType(), PaymentMethodName.INSTANCE.getRememberMe().getValue())) {
                break;
            }
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        String email = paymentMethod != null ? paymentMethod.getEmail() : null;
        Iterator<T> it2 = this.f4677b.getPaymentMethods().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.areEqual(((PaymentMethod) obj2).getType(), PaymentMethodName.INSTANCE.getRememberMe().getValue())) {
                break;
            }
        }
        PaymentMethod paymentMethod2 = (PaymentMethod) obj2;
        RememberMeConfiguration createInheritedRememberMeConfiguration = com.checkout.components.core.utils.extension.ExtensionsKt.createInheritedRememberMeConfiguration(componentOption, forwardingEmailsDisabledGuard, email, (paymentMethod2 == null || (phone = paymentMethod2.getPhone()) == null) ? null : new Phone(phone.getCountryCode(), phone.getNumber()));
        CheckoutRememberMe a6 = a(createInheritedRememberMeConfiguration, componentCallback);
        CardComponentFactory cardComponentFactory = this.f4682h;
        boolean booleanValue = (componentOption == null || (showPayButton = componentOption.getShowPayButton()) == null) ? true : showPayButton.booleanValue();
        AddressConfiguration addressConfiguration = componentOption != null ? componentOption.getAddressConfiguration() : null;
        String id2 = this.f4676a.getPaymentSession().getId();
        boolean z11 = isRememberMeAvailable$core_standardRelease() && z10;
        CardConfiguration cardConfiguration2 = componentOption != null ? componentOption.getCardConfiguration() : null;
        if (componentOption == null || (cardConfiguration = componentOption.getCardConfiguration()) == null || (entries = cardConfiguration.getAcceptedCardTypes()) == null) {
            entries = CardTypeName.INSTANCE.getEntries();
        }
        List<CardTypeName> acceptedCardTypes = createInheritedRememberMeConfiguration.getAcceptedCardTypes();
        if (acceptedCardTypes == null) {
            acceptedCardTypes = CardTypeName.INSTANCE.getEntries();
        }
        CardComponentConfig cardComponentConfig = new CardComponentConfig(componentCallback, z2, booleanValue, addressConfiguration, id2, a6, z11, cardConfiguration2, new SupportedTypesRepository(entries, acceptedCardTypes, new b(a6, 2)), com.checkout.components.core.utils.extension.ExtensionsKt.getLayoutDirection(getComponentLocale()));
        PaymentSession paymentSession = this.f4677b;
        Environment environment = this.f4676a.getEnvironment();
        String publicKey = this.f4676a.getPublicKey();
        Map<Locale, Map<ComponentTranslationKey, String>> translations = this.f4676a.getTranslations();
        Map<ComponentTranslationKey, String> map = translations != null ? translations.get(getComponentLocale()) : null;
        av avVar = new av(this.paymentStateFlow);
        Logger logger = this.e;
        DesignTokens appearance = this.f4676a.getAppearance();
        Context context = this.f4676a.getContext();
        java.util.Locale mapToLocale = ExtensionsKt.mapToLocale(getComponentLocale());
        PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
        CardComponent create = cardComponentFactory.create(cardComponentConfig, context, environment, publicKey, map, appearance, mapToLocale, avVar, new C2015h(10, this, componentCallback), createInheritedRememberMeConfiguration, paymentSession, a6, componentOption, a(companion.getCard()), logger);
        if (!isRememberMeAvailable$core_standardRelease()) {
            if ((componentOption != null ? componentOption.getRememberMeConfiguration() : null) != null && (onError = componentCallback.getOnError()) != null) {
                onError.invoke(create, new CheckoutError.Integration(CommonErrorMessages.REMEMBER_ME_UNAVAILABLE_ON_CONFIGURATION_PROVIDED, CheckoutErrorCode.INVALID_SETUP, ErrorExtensionsKt.toIntegrationErrorDetails(a(companion.getRememberMe()))));
            }
        }
        return create;
    }

    public static final ComponentName a(CheckoutRememberMe checkoutRememberMe) {
        return com.checkout.components.rememberme.utils.ExtensionsKt.mapToComponentName(checkoutRememberMe != null ? checkoutRememberMe.currentScreen() : null, PaymentMethodName.INSTANCE.getCard());
    }

    public static final Unit a(InternalCheckoutComponents internalCheckoutComponents, ComponentCallback componentCallback, ComponentResult result, boolean z2) {
        Intrinsics.echo(result, "result");
        internalCheckoutComponents.handleCardTokenResult$core_standardRelease(result, z2, componentCallback);
        return Unit.INSTANCE;
    }

    private final CheckoutRememberMe a(RememberMeConfiguration rememberMeConfiguration, ComponentCallback componentCallback) {
        if (!isRememberMeAvailable$core_standardRelease()) {
            return null;
        }
        if (this.f4675F == null) {
            CheckoutRememberMeFactory checkoutRememberMeFactory = this.f4688n;
            C0923r c0923r = new C0923r(this);
            at atVar = this.paymentStateFlow;
            PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
            List<CardScheme> supportedCardSchemes = UtilsKt.getSupportedCardSchemes(rememberMeConfiguration, companion.getRememberMe(), this.f4677b, new ar(7));
            List<CardTypeName> acceptedCardTypes = rememberMeConfiguration.getAcceptedCardTypes();
            if (acceptedCardTypes == null) {
                acceptedCardTypes = CardTypeName.INSTANCE.getEntries();
            }
            List<CardTypeName> list = acceptedCardTypes;
            Map<Locale, Map<ComponentTranslationKey, String>> translations = this.f4676a.getTranslations();
            this.f4675F = checkoutRememberMeFactory.create(rememberMeConfiguration, c0923r, supportedCardSchemes, list, atVar, getComponentLocale(), translations != null ? translations.get(getComponentLocale()) : null, this.contextWithLocale, a(componentCallback), new C2007a(21, componentCallback, this), a(companion.getRememberMe()), this.e);
        }
        CheckoutRememberMe checkoutRememberMe = this.f4675F;
        if (checkoutRememberMe != null) {
            return checkoutRememberMe;
        }
        Intrinsics.lima("rememberMe");
        throw null;
    }

    public static final List a(PaymentMethod getSupportedCardSchemes) {
        Intrinsics.echo(getSupportedCardSchemes, "$this$getSupportedCardSchemes");
        return getSupportedCardSchemes.getCardSchemes();
    }

    public static final Unit a(ComponentCallback componentCallback, InternalCheckoutComponents internalCheckoutComponents, CheckoutError error) {
        Intrinsics.echo(error, "error");
        l onError = componentCallback.getOnError();
        if (onError != null) {
            Object obj = internalCheckoutComponents.f4693s.get(PaymentMethodName.INSTANCE.getCard());
            Intrinsics.charlie(obj, "null cannot be cast to non-null type com.checkout.components.card.CardComponent");
            onError.invoke((CardComponent) obj, error);
        }
        return Unit.INSTANCE;
    }

    private final RememberMeCallback a(final ComponentCallback componentCallback) {
        final int i4 = 0;
        Function0 function0 = new Function0(this) { // from class: z4.a
            public final /* synthetic */ InternalCheckoutComponents purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit a6;
                Unit b2;
                switch (i4) {
                    case 0:
                        a6 = InternalCheckoutComponents.a(this.purple, componentCallback);
                        return a6;
                    default:
                        b2 = InternalCheckoutComponents.b(this.purple, componentCallback);
                        return b2;
                }
            }
        };
        final int i5 = 1;
        Function0 function02 = new Function0(this) { // from class: z4.a
            public final /* synthetic */ InternalCheckoutComponents purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit a6;
                Unit b2;
                switch (i5) {
                    case 0:
                        a6 = InternalCheckoutComponents.a(this.purple, componentCallback);
                        return a6;
                    default:
                        b2 = InternalCheckoutComponents.b(this.purple, componentCallback);
                        return b2;
                }
            }
        };
        l onTokenized = componentCallback.getOnTokenized();
        o oVar = onTokenized != null ? new o(onTokenized, null) : null;
        l handleTap = componentCallback.getHandleTap();
        p pVar = handleTap != null ? new p(this, handleTap, null) : null;
        Function1<CardMetadata, CallbackResult> onCardBinChanged = componentCallback.getOnCardBinChanged();
        return new RememberMeCallback(function0, function02, oVar, pVar, onCardBinChanged != null ? new ae(12, onCardBinChanged) : null);
    }

    public static final CallbackResult a(Function1 function1, CardMetadata cardMetadata) {
        Intrinsics.echo(cardMetadata, "cardMetadata");
        return (CallbackResult) function1.invoke(cardMetadata);
    }

    private final ComponentCallback a(ComponentOption componentOption) {
        ComponentCallback componentCallback;
        ComponentCallback copy$default;
        if (componentOption == null || (componentCallback = componentOption.getCallback()) == null) {
            componentCallback = this.f4676a.getComponentCallback();
        }
        ComponentCallback componentCallback2 = componentCallback;
        if (componentCallback2 != null) {
            l handleTap = componentCallback2.getHandleTap();
            if (handleTap != null && (copy$default = ComponentCallback.copy$default(componentCallback2, null, null, null, null, null, null, null, null, decorateHandleTap$core_standardRelease(handleTap), 255, null)) != null) {
                componentCallback2 = copy$default;
            }
        } else {
            componentCallback2 = null;
        }
        return componentCallback2 == null ? ComponentCallback.INSTANCE.getNO_OPS() : componentCallback2;
    }
}
