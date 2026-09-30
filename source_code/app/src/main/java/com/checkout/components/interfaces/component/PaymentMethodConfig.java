package com.checkout.components.interfaces.component;

import Q0.n;
import android.content.Context;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.model.paymentsession.PaymentMethod;
import com.checkout.components.interfaces.model.paymentsession.PaymentSession;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.L;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\b\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017j\u0004\u0018\u0001`\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\u001a\u0010$\u001a\u0016\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 j\u0004\u0018\u0001`#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0019H\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b1\u00102J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b=\u0010>J$\u0010?\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017j\u0004\u0018\u0001`\u001aHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\bC\u0010DJ$\u0010E\u001a\u0016\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 j\u0004\u0018\u0001`#HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020%HÆ\u0003¢\u0006\u0004\bG\u0010HJØ\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017j\u0004\u0018\u0001`\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u001c\b\u0002\u0010$\u001a\u0016\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 j\u0004\u0018\u0001`#2\b\b\u0002\u0010&\u001a\u00020%HÆ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010L\u001a\u00020KHÖ\u0001¢\u0006\u0004\bL\u0010MJ\u001a\u0010O\u001a\u00020%2\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u00102R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u00104R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u00106R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u00108R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010:R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010<R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010>R+\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017j\u0004\u0018\u0001`\u001a8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010@R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010BR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010DR+\u0010$\u001a\u0016\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 j\u0004\u0018\u0001`#8\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010FR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010H¨\u0006~"}, d2 = {"Lcom/checkout/components/interfaces/component/PaymentMethodConfig;", "", "Landroid/content/Context;", "context", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "paymentSession", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentMethod;", "paymentMethod", "Lcom/checkout/components/interfaces/component/ComponentOption;", "specificOptions", "Lyf/L;", "Lcom/checkout/components/interfaces/model/PaymentState;", "paymentStateFlow", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "LQ0/n;", "layoutDirection", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "Ljava/util/Locale;", "locale", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "", "Lcom/checkout/components/interfaces/localisation/Translation;", "translation", "Lcom/checkout/components/interfaces/component/ApmErrorHandler;", "apmErrorHandler", "Lcom/checkout/components/interfaces/component/ApmSubmitHandler;", "apmSubmitHandler", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "", "Lcom/checkout/components/interfaces/component/OnReadyCallback;", "onReady", "", "shouldInvokeOnReady", "<init>", "(Landroid/content/Context;Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;Lcom/checkout/components/interfaces/model/paymentsession/PaymentMethod;Lcom/checkout/components/interfaces/component/ComponentOption;Lyf/L;Lcom/checkout/components/interfaces/insight/Logger;LQ0/n;Lcom/checkout/components/interfaces/insight/LogDetails;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Ljava/util/Locale;Ljava/util/Map;Lcom/checkout/components/interfaces/component/ApmErrorHandler;Lcom/checkout/components/interfaces/component/ApmSubmitHandler;Lkotlin/jvm/functions/Function1;Z)V", "toString", "()Ljava/lang/String;", "component1", "()Landroid/content/Context;", "component2", "()Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "component3", "()Lcom/checkout/components/interfaces/model/paymentsession/PaymentMethod;", "component4", "()Lcom/checkout/components/interfaces/component/ComponentOption;", "component5", "()Lyf/L;", "component6", "()Lcom/checkout/components/interfaces/insight/Logger;", "component7", "()LQ0/n;", "component8", "()Lcom/checkout/components/interfaces/insight/LogDetails;", "component9", "()Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "component10", "()Ljava/util/Locale;", "component11", "()Ljava/util/Map;", "component12", "()Lcom/checkout/components/interfaces/component/ApmErrorHandler;", "component13", "()Lcom/checkout/components/interfaces/component/ApmSubmitHandler;", "component14", "()Lkotlin/jvm/functions/Function1;", "component15", "()Z", Constants.COPY_TYPE, "(Landroid/content/Context;Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;Lcom/checkout/components/interfaces/model/paymentsession/PaymentMethod;Lcom/checkout/components/interfaces/component/ComponentOption;Lyf/L;Lcom/checkout/components/interfaces/insight/Logger;LQ0/n;Lcom/checkout/components/interfaces/insight/LogDetails;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Ljava/util/Locale;Ljava/util/Map;Lcom/checkout/components/interfaces/component/ApmErrorHandler;Lcom/checkout/components/interfaces/component/ApmSubmitHandler;Lkotlin/jvm/functions/Function1;Z)Lcom/checkout/components/interfaces/component/PaymentMethodConfig;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/Context;", "getContext", "b", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "getPaymentSession", "c", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentMethod;", "getPaymentMethod", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/component/ComponentOption;", "getSpecificOptions", "e", "Lyf/L;", "getPaymentStateFlow", "f", "Lcom/checkout/components/interfaces/insight/Logger;", "getLogger", "g", "LQ0/n;", "getLayoutDirection", "h", "Lcom/checkout/components/interfaces/insight/LogDetails;", "getLogDetails", "i", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "getDesignTokens", "j", "Ljava/util/Locale;", "getLocale", "k", "Ljava/util/Map;", "getTranslation", "l", "Lcom/checkout/components/interfaces/component/ApmErrorHandler;", "getApmErrorHandler", "m", "Lcom/checkout/components/interfaces/component/ApmSubmitHandler;", "getApmSubmitHandler", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, "Lkotlin/jvm/functions/Function1;", "getOnReady", "o", "Z", "getShouldInvokeOnReady", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethodConfig {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final PaymentSession paymentSession;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PaymentMethod paymentMethod;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ComponentOption specificOptions;

    /* renamed from: e, reason: from kotlin metadata */
    private final L paymentStateFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Logger logger;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final n layoutDirection;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final LogDetails logDetails;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final DesignTokens designTokens;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Locale locale;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Map translation;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ApmErrorHandler apmErrorHandler;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ApmSubmitHandler apmSubmitHandler;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function1 onReady;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldInvokeOnReady;

    public PaymentMethodConfig(@NotNull Context context, @NotNull PaymentSession paymentSession, @NotNull PaymentMethod paymentMethod, @Nullable ComponentOption componentOption, @NotNull L paymentStateFlow, @NotNull Logger logger, @NotNull n layoutDirection, @NotNull LogDetails logDetails, @Nullable DesignTokens designTokens, @NotNull Locale locale, @Nullable Map<ComponentTranslationKey, String> map, @NotNull ApmErrorHandler apmErrorHandler, @NotNull ApmSubmitHandler apmSubmitHandler, @Nullable Function1<? super PaymentMethodComponent, Unit> function1, boolean z2) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(paymentSession, "paymentSession");
        Intrinsics.echo(paymentMethod, "paymentMethod");
        Intrinsics.echo(paymentStateFlow, "paymentStateFlow");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(layoutDirection, "layoutDirection");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(locale, "locale");
        Intrinsics.echo(apmErrorHandler, "apmErrorHandler");
        Intrinsics.echo(apmSubmitHandler, "apmSubmitHandler");
        this.context = context;
        this.paymentSession = paymentSession;
        this.paymentMethod = paymentMethod;
        this.specificOptions = componentOption;
        this.paymentStateFlow = paymentStateFlow;
        this.logger = logger;
        this.layoutDirection = layoutDirection;
        this.logDetails = logDetails;
        this.designTokens = designTokens;
        this.locale = locale;
        this.translation = map;
        this.apmErrorHandler = apmErrorHandler;
        this.apmSubmitHandler = apmSubmitHandler;
        this.onReady = function1;
        this.shouldInvokeOnReady = z2;
    }

    public static /* synthetic */ PaymentMethodConfig copy$default(PaymentMethodConfig paymentMethodConfig, Context context, PaymentSession paymentSession, PaymentMethod paymentMethod, ComponentOption componentOption, L l10, Logger logger, n nVar, LogDetails logDetails, DesignTokens designTokens, Locale locale, Map map, ApmErrorHandler apmErrorHandler, ApmSubmitHandler apmSubmitHandler, Function1 function1, boolean z2, int i4, Object obj) {
        Context context2;
        PaymentSession paymentSession2;
        PaymentMethod paymentMethod2;
        ComponentOption componentOption2;
        L l11;
        Logger logger2;
        n nVar2;
        LogDetails logDetails2;
        DesignTokens designTokens2;
        Locale locale2;
        Map map2;
        ApmErrorHandler apmErrorHandler2;
        ApmSubmitHandler apmSubmitHandler2;
        Function1 function12;
        boolean z10;
        if ((i4 & 1) != 0) {
            context2 = paymentMethodConfig.context;
        } else {
            context2 = context;
        }
        if ((i4 & 2) != 0) {
            paymentSession2 = paymentMethodConfig.paymentSession;
        } else {
            paymentSession2 = paymentSession;
        }
        if ((i4 & 4) != 0) {
            paymentMethod2 = paymentMethodConfig.paymentMethod;
        } else {
            paymentMethod2 = paymentMethod;
        }
        if ((i4 & 8) != 0) {
            componentOption2 = paymentMethodConfig.specificOptions;
        } else {
            componentOption2 = componentOption;
        }
        if ((i4 & 16) != 0) {
            l11 = paymentMethodConfig.paymentStateFlow;
        } else {
            l11 = l10;
        }
        if ((i4 & 32) != 0) {
            logger2 = paymentMethodConfig.logger;
        } else {
            logger2 = logger;
        }
        if ((i4 & 64) != 0) {
            nVar2 = paymentMethodConfig.layoutDirection;
        } else {
            nVar2 = nVar;
        }
        if ((i4 & 128) != 0) {
            logDetails2 = paymentMethodConfig.logDetails;
        } else {
            logDetails2 = logDetails;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            designTokens2 = paymentMethodConfig.designTokens;
        } else {
            designTokens2 = designTokens;
        }
        if ((i4 & 512) != 0) {
            locale2 = paymentMethodConfig.locale;
        } else {
            locale2 = locale;
        }
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            map2 = paymentMethodConfig.translation;
        } else {
            map2 = map;
        }
        if ((i4 & 2048) != 0) {
            apmErrorHandler2 = paymentMethodConfig.apmErrorHandler;
        } else {
            apmErrorHandler2 = apmErrorHandler;
        }
        if ((i4 & 4096) != 0) {
            apmSubmitHandler2 = paymentMethodConfig.apmSubmitHandler;
        } else {
            apmSubmitHandler2 = apmSubmitHandler;
        }
        if ((i4 & 8192) != 0) {
            function12 = paymentMethodConfig.onReady;
        } else {
            function12 = function1;
        }
        if ((i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            z10 = paymentMethodConfig.shouldInvokeOnReady;
        } else {
            z10 = z2;
        }
        return paymentMethodConfig.copy(context2, paymentSession2, paymentMethod2, componentOption2, l11, logger2, nVar2, logDetails2, designTokens2, locale2, map2, apmErrorHandler2, apmSubmitHandler2, function12, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    @Nullable
    public final Map<ComponentTranslationKey, String> component11() {
        return this.translation;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final ApmErrorHandler getApmErrorHandler() {
        return this.apmErrorHandler;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final ApmSubmitHandler getApmSubmitHandler() {
        return this.apmSubmitHandler;
    }

    @Nullable
    public final Function1<PaymentMethodComponent, Unit> component14() {
        return this.onReady;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getShouldInvokeOnReady() {
        return this.shouldInvokeOnReady;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PaymentSession getPaymentSession() {
        return this.paymentSession;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final ComponentOption getSpecificOptions() {
        return this.specificOptions;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final L getPaymentStateFlow() {
        return this.paymentStateFlow;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Logger getLogger() {
        return this.logger;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final n getLayoutDirection() {
        return this.layoutDirection;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final LogDetails getLogDetails() {
        return this.logDetails;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final DesignTokens getDesignTokens() {
        return this.designTokens;
    }

    @NotNull
    public final PaymentMethodConfig copy(@NotNull Context context, @NotNull PaymentSession paymentSession, @NotNull PaymentMethod paymentMethod, @Nullable ComponentOption specificOptions, @NotNull L paymentStateFlow, @NotNull Logger logger, @NotNull n layoutDirection, @NotNull LogDetails logDetails, @Nullable DesignTokens designTokens, @NotNull Locale locale, @Nullable Map<ComponentTranslationKey, String> translation, @NotNull ApmErrorHandler apmErrorHandler, @NotNull ApmSubmitHandler apmSubmitHandler, @Nullable Function1<? super PaymentMethodComponent, Unit> onReady, boolean shouldInvokeOnReady) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(paymentSession, "paymentSession");
        Intrinsics.echo(paymentMethod, "paymentMethod");
        Intrinsics.echo(paymentStateFlow, "paymentStateFlow");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(layoutDirection, "layoutDirection");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(locale, "locale");
        Intrinsics.echo(apmErrorHandler, "apmErrorHandler");
        Intrinsics.echo(apmSubmitHandler, "apmSubmitHandler");
        return new PaymentMethodConfig(context, paymentSession, paymentMethod, specificOptions, paymentStateFlow, logger, layoutDirection, logDetails, designTokens, locale, translation, apmErrorHandler, apmSubmitHandler, onReady, shouldInvokeOnReady);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodConfig)) {
            return false;
        }
        PaymentMethodConfig paymentMethodConfig = (PaymentMethodConfig) other;
        return Intrinsics.areEqual(this.context, paymentMethodConfig.context) && Intrinsics.areEqual(this.paymentSession, paymentMethodConfig.paymentSession) && Intrinsics.areEqual(this.paymentMethod, paymentMethodConfig.paymentMethod) && Intrinsics.areEqual(this.specificOptions, paymentMethodConfig.specificOptions) && Intrinsics.areEqual(this.paymentStateFlow, paymentMethodConfig.paymentStateFlow) && Intrinsics.areEqual(this.logger, paymentMethodConfig.logger) && this.layoutDirection == paymentMethodConfig.layoutDirection && Intrinsics.areEqual(this.logDetails, paymentMethodConfig.logDetails) && Intrinsics.areEqual(this.designTokens, paymentMethodConfig.designTokens) && Intrinsics.areEqual(this.locale, paymentMethodConfig.locale) && Intrinsics.areEqual(this.translation, paymentMethodConfig.translation) && Intrinsics.areEqual(this.apmErrorHandler, paymentMethodConfig.apmErrorHandler) && Intrinsics.areEqual(this.apmSubmitHandler, paymentMethodConfig.apmSubmitHandler) && Intrinsics.areEqual(this.onReady, paymentMethodConfig.onReady) && this.shouldInvokeOnReady == paymentMethodConfig.shouldInvokeOnReady;
    }

    @NotNull
    public final ApmErrorHandler getApmErrorHandler() {
        return this.apmErrorHandler;
    }

    @NotNull
    public final ApmSubmitHandler getApmSubmitHandler() {
        return this.apmSubmitHandler;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final DesignTokens getDesignTokens() {
        return this.designTokens;
    }

    @NotNull
    public final n getLayoutDirection() {
        return this.layoutDirection;
    }

    @NotNull
    public final Locale getLocale() {
        return this.locale;
    }

    @NotNull
    public final LogDetails getLogDetails() {
        return this.logDetails;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    @Nullable
    public final Function1<PaymentMethodComponent, Unit> getOnReady() {
        return this.onReady;
    }

    @NotNull
    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    @NotNull
    public final PaymentSession getPaymentSession() {
        return this.paymentSession;
    }

    @NotNull
    public final L getPaymentStateFlow() {
        return this.paymentStateFlow;
    }

    public final boolean getShouldInvokeOnReady() {
        return this.shouldInvokeOnReady;
    }

    @Nullable
    public final ComponentOption getSpecificOptions() {
        return this.specificOptions;
    }

    @Nullable
    public final Map<ComponentTranslationKey, String> getTranslation() {
        return this.translation;
    }

    public final int hashCode() {
        int hashCode = (this.paymentMethod.hashCode() + ((this.paymentSession.hashCode() + (this.context.hashCode() * 31)) * 31)) * 31;
        ComponentOption componentOption = this.specificOptions;
        int hashCode2 = (this.logDetails.hashCode() + ((this.layoutDirection.hashCode() + ((this.logger.hashCode() + ((this.paymentStateFlow.hashCode() + ((hashCode + (componentOption == null ? 0 : componentOption.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        DesignTokens designTokens = this.designTokens;
        int hashCode3 = (this.locale.hashCode() + ((hashCode2 + (designTokens == null ? 0 : designTokens.hashCode())) * 31)) * 31;
        Map map = this.translation;
        int hashCode4 = (this.apmSubmitHandler.hashCode() + ((this.apmErrorHandler.hashCode() + ((hashCode3 + (map == null ? 0 : map.hashCode())) * 31)) * 31)) * 31;
        Function1 function1 = this.onReady;
        return (this.shouldInvokeOnReady ? 1231 : 1237) + ((hashCode4 + (function1 != null ? function1.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "PaymentMethodConfig(type=" + this.paymentMethod.getType() + ", locale=" + this.locale + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PaymentMethodConfig(Context context, PaymentSession paymentSession, PaymentMethod paymentMethod, ComponentOption componentOption, L l10, Logger logger, n nVar, LogDetails logDetails, DesignTokens designTokens, Locale locale, Map map, ApmErrorHandler apmErrorHandler, ApmSubmitHandler apmSubmitHandler, Function1 function1, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, paymentSession, paymentMethod, componentOption, l10, logger, nVar, logDetails, designTokens, locale, map, apmErrorHandler, r14, function1, z2);
        ApmSubmitHandler apmSubmitHandler2;
        if ((i4 & 4096) != 0) {
            ApmSubmitHandler.INSTANCE.getClass();
            apmSubmitHandler2 = a.f5325a;
        } else {
            apmSubmitHandler2 = apmSubmitHandler;
        }
    }
}
