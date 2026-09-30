package com.checkout.components.wallet.ui.model;

import a0.C0366t;
import android.content.Context;
import ao.ad;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.component.GooglePayButtonTheme;
import com.checkout.components.interfaces.component.GooglePayButtonType;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.interfaces.model.UpdateDetails;
import com.checkout.components.interfaces.model.paymentsession.PaymentSession;
import com.checkout.components.wallet.wrapper.GooglePayFlowCoordinator;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import pe.AbstractC2327c;
import yf.L;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u0010;\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010>\u001a\u00020\u0017HÀ\u0003¢\u0006\u0004\b<\u0010=J\u001e\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019HÀ\u0003¢\u0006\u0004\b?\u0010@J\u0018\u0010D\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001dHÀ\u0003¢\u0006\u0004\bB\u0010CJ\u0018\u0010F\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dHÀ\u0003¢\u0006\u0004\bE\u0010CJ\u0010\u0010I\u001a\u00020!HÀ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010L\u001a\u00020#HÀ\u0003¢\u0006\u0004\bJ\u0010KJÖ\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#HÆ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010P\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bP\u0010.J\u0010\u0010R\u001a\u00020QHÖ\u0001¢\u0006\u0004\bR\u0010SJ\u001a\u0010U\u001a\u00020\u00172\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bU\u0010VR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u00102R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u00104R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u00106R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u00108R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010:R\u001a\u0010\u0018\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010=R(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010@R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010CR\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b~\u0010|\u001a\u0004\b\u007f\u0010CR\u001d\u0010\"\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010HR\u001d\u0010$\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010K¨\u0006\u0086\u0001"}, d2 = {"Lcom/checkout/components/wallet/ui/model/WalletComponentConfig;", "", "Landroid/content/Context;", "context", "Lcom/checkout/components/interfaces/Environment;", "environment", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "paymentSession", "", "publicKey", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "componentCallback", "Lcom/checkout/components/wallet/wrapper/GooglePayFlowCoordinator;", "googlePayFlowCoordinator", "Lyf/L;", "Lcom/checkout/components/interfaces/model/PaymentState;", "paymentStateFlow", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "La0/t;", "errorTextColor", "", "shouldInvokeOnReady", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/model/UpdateDetails;", "", "onUpdateDetails", "", "supportedCardSchemes", "Lcom/checkout/components/interfaces/model/CardTypeName;", "supportedCardTypes", "Lcom/checkout/components/interfaces/component/GooglePayButtonTheme;", "buttonTheme", "Lcom/checkout/components/interfaces/component/GooglePayButtonType;", "buttonType", "<init>", "(Landroid/content/Context;Lcom/checkout/components/interfaces/Environment;Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;Ljava/lang/String;Lcom/checkout/components/interfaces/component/ComponentCallback;Lcom/checkout/components/wallet/wrapper/GooglePayFlowCoordinator;Lyf/L;Lcom/checkout/components/interfaces/insight/Logger;Lcom/checkout/components/interfaces/insight/LogDetails;JZLkotlin/jvm/functions/Function1;Ljava/util/List;Ljava/util/List;Lcom/checkout/components/interfaces/component/GooglePayButtonTheme;Lcom/checkout/components/interfaces/component/GooglePayButtonType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroid/content/Context;", "component2", "()Lcom/checkout/components/interfaces/Environment;", "component3", "()Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/checkout/components/interfaces/component/ComponentCallback;", "component6", "()Lcom/checkout/components/wallet/wrapper/GooglePayFlowCoordinator;", "component7", "()Lyf/L;", "component8", "()Lcom/checkout/components/interfaces/insight/Logger;", "component9", "()Lcom/checkout/components/interfaces/insight/LogDetails;", "component10-0d7_KjU", "()J", "component10", "component11$wallet_standardRelease", "()Z", "component11", "component12$wallet_standardRelease", "()Lkotlin/jvm/functions/Function1;", "component12", "component13$wallet_standardRelease", "()Ljava/util/List;", "component13", "component14$wallet_standardRelease", "component14", "component15$wallet_standardRelease", "()Lcom/checkout/components/interfaces/component/GooglePayButtonTheme;", "component15", "component16$wallet_standardRelease", "()Lcom/checkout/components/interfaces/component/GooglePayButtonType;", "component16", "copy-htLuCmU", "(Landroid/content/Context;Lcom/checkout/components/interfaces/Environment;Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;Ljava/lang/String;Lcom/checkout/components/interfaces/component/ComponentCallback;Lcom/checkout/components/wallet/wrapper/GooglePayFlowCoordinator;Lyf/L;Lcom/checkout/components/interfaces/insight/Logger;Lcom/checkout/components/interfaces/insight/LogDetails;JZLkotlin/jvm/functions/Function1;Ljava/util/List;Ljava/util/List;Lcom/checkout/components/interfaces/component/GooglePayButtonTheme;Lcom/checkout/components/interfaces/component/GooglePayButtonType;)Lcom/checkout/components/wallet/ui/model/WalletComponentConfig;", Constants.COPY_TYPE, "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/Context;", "getContext", "b", "Lcom/checkout/components/interfaces/Environment;", "getEnvironment", "c", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "getPaymentSession", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "getPublicKey", "e", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "getComponentCallback", "f", "Lcom/checkout/components/wallet/wrapper/GooglePayFlowCoordinator;", "getGooglePayFlowCoordinator", "g", "Lyf/L;", "getPaymentStateFlow", "h", "Lcom/checkout/components/interfaces/insight/Logger;", "getLogger", "i", "Lcom/checkout/components/interfaces/insight/LogDetails;", "getLogDetails", "j", "J", "getErrorTextColor-0d7_KjU", "k", "Z", "getShouldInvokeOnReady$wallet_standardRelease", "l", "Lkotlin/jvm/functions/Function1;", "getOnUpdateDetails$wallet_standardRelease", "m", "Ljava/util/List;", "getSupportedCardSchemes$wallet_standardRelease", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, "getSupportedCardTypes$wallet_standardRelease", "o", "Lcom/checkout/components/interfaces/component/GooglePayButtonTheme;", "getButtonTheme$wallet_standardRelease", "p", "Lcom/checkout/components/interfaces/component/GooglePayButtonType;", "getButtonType$wallet_standardRelease", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WalletComponentConfig {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Environment environment;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PaymentSession paymentSession;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String publicKey;

    /* renamed from: e, reason: from kotlin metadata */
    private final ComponentCallback componentCallback;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final GooglePayFlowCoordinator googlePayFlowCoordinator;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final L paymentStateFlow;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Logger logger;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final LogDetails logDetails;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long errorTextColor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldInvokeOnReady;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Function1 onUpdateDetails;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final List supportedCardSchemes;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List supportedCardTypes;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final GooglePayButtonTheme buttonTheme;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final GooglePayButtonType buttonType;

    public WalletComponentConfig(Context context, Environment environment, PaymentSession paymentSession, String publicKey, ComponentCallback componentCallback, GooglePayFlowCoordinator googlePayFlowCoordinator, L paymentStateFlow, Logger logger, LogDetails logDetails, long j5, boolean z2, Function1 function1, List list, List list2, GooglePayButtonTheme buttonTheme, GooglePayButtonType buttonType, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(environment, "environment");
        Intrinsics.echo(paymentSession, "paymentSession");
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(componentCallback, "componentCallback");
        Intrinsics.echo(paymentStateFlow, "paymentStateFlow");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(buttonTheme, "buttonTheme");
        Intrinsics.echo(buttonType, "buttonType");
        this.context = context;
        this.environment = environment;
        this.paymentSession = paymentSession;
        this.publicKey = publicKey;
        this.componentCallback = componentCallback;
        this.googlePayFlowCoordinator = googlePayFlowCoordinator;
        this.paymentStateFlow = paymentStateFlow;
        this.logger = logger;
        this.logDetails = logDetails;
        this.errorTextColor = j5;
        this.shouldInvokeOnReady = z2;
        this.onUpdateDetails = function1;
        this.supportedCardSchemes = list;
        this.supportedCardTypes = list2;
        this.buttonTheme = buttonTheme;
        this.buttonType = buttonType;
    }

    /* renamed from: copy-htLuCmU$default, reason: not valid java name */
    public static /* synthetic */ WalletComponentConfig m197copyhtLuCmU$default(WalletComponentConfig walletComponentConfig, Context context, Environment environment, PaymentSession paymentSession, String str, ComponentCallback componentCallback, GooglePayFlowCoordinator googlePayFlowCoordinator, L l10, Logger logger, LogDetails logDetails, long j5, boolean z2, Function1 function1, List list, List list2, GooglePayButtonTheme googlePayButtonTheme, GooglePayButtonType googlePayButtonType, int i4, Object obj) {
        Context context2;
        Environment environment2;
        PaymentSession paymentSession2;
        String str2;
        ComponentCallback componentCallback2;
        GooglePayFlowCoordinator googlePayFlowCoordinator2;
        L l11;
        Logger logger2;
        LogDetails logDetails2;
        long j6;
        boolean z10;
        Function1 function12;
        List list3;
        List list4;
        GooglePayButtonTheme googlePayButtonTheme2;
        GooglePayButtonType googlePayButtonType2;
        if ((i4 & 1) != 0) {
            context2 = walletComponentConfig.context;
        } else {
            context2 = context;
        }
        if ((i4 & 2) != 0) {
            environment2 = walletComponentConfig.environment;
        } else {
            environment2 = environment;
        }
        if ((i4 & 4) != 0) {
            paymentSession2 = walletComponentConfig.paymentSession;
        } else {
            paymentSession2 = paymentSession;
        }
        if ((i4 & 8) != 0) {
            str2 = walletComponentConfig.publicKey;
        } else {
            str2 = str;
        }
        if ((i4 & 16) != 0) {
            componentCallback2 = walletComponentConfig.componentCallback;
        } else {
            componentCallback2 = componentCallback;
        }
        if ((i4 & 32) != 0) {
            googlePayFlowCoordinator2 = walletComponentConfig.googlePayFlowCoordinator;
        } else {
            googlePayFlowCoordinator2 = googlePayFlowCoordinator;
        }
        if ((i4 & 64) != 0) {
            l11 = walletComponentConfig.paymentStateFlow;
        } else {
            l11 = l10;
        }
        if ((i4 & 128) != 0) {
            logger2 = walletComponentConfig.logger;
        } else {
            logger2 = logger;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            logDetails2 = walletComponentConfig.logDetails;
        } else {
            logDetails2 = logDetails;
        }
        if ((i4 & 512) != 0) {
            j6 = walletComponentConfig.errorTextColor;
        } else {
            j6 = j5;
        }
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            z10 = walletComponentConfig.shouldInvokeOnReady;
        } else {
            z10 = z2;
        }
        if ((i4 & 2048) != 0) {
            function12 = walletComponentConfig.onUpdateDetails;
        } else {
            function12 = function1;
        }
        if ((i4 & 4096) != 0) {
            list3 = walletComponentConfig.supportedCardSchemes;
        } else {
            list3 = list;
        }
        Context context3 = context2;
        if ((i4 & 8192) != 0) {
            list4 = walletComponentConfig.supportedCardTypes;
        } else {
            list4 = list2;
        }
        List list5 = list4;
        if ((i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            googlePayButtonTheme2 = walletComponentConfig.buttonTheme;
        } else {
            googlePayButtonTheme2 = googlePayButtonTheme;
        }
        if ((i4 & 32768) != 0) {
            googlePayButtonType2 = walletComponentConfig.buttonType;
        } else {
            googlePayButtonType2 = googlePayButtonType;
        }
        return walletComponentConfig.m199copyhtLuCmU(context3, environment2, paymentSession2, str2, componentCallback2, googlePayFlowCoordinator2, l11, logger2, logDetails2, j6, z10, function12, list3, list5, googlePayButtonTheme2, googlePayButtonType2);
    }

    /* renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* renamed from: component10-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorTextColor() {
        return this.errorTextColor;
    }

    /* renamed from: component11$wallet_standardRelease, reason: from getter */
    public final boolean getShouldInvokeOnReady() {
        return this.shouldInvokeOnReady;
    }

    public final Function1<UpdateDetails, Unit> component12$wallet_standardRelease() {
        return this.onUpdateDetails;
    }

    public final List<String> component13$wallet_standardRelease() {
        return this.supportedCardSchemes;
    }

    public final List<CardTypeName> component14$wallet_standardRelease() {
        return this.supportedCardTypes;
    }

    /* renamed from: component15$wallet_standardRelease, reason: from getter */
    public final GooglePayButtonTheme getButtonTheme() {
        return this.buttonTheme;
    }

    /* renamed from: component16$wallet_standardRelease, reason: from getter */
    public final GooglePayButtonType getButtonType() {
        return this.buttonType;
    }

    /* renamed from: component2, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentSession getPaymentSession() {
        return this.paymentSession;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* renamed from: component5, reason: from getter */
    public final ComponentCallback getComponentCallback() {
        return this.componentCallback;
    }

    /* renamed from: component6, reason: from getter */
    public final GooglePayFlowCoordinator getGooglePayFlowCoordinator() {
        return this.googlePayFlowCoordinator;
    }

    /* renamed from: component7, reason: from getter */
    public final L getPaymentStateFlow() {
        return this.paymentStateFlow;
    }

    /* renamed from: component8, reason: from getter */
    public final Logger getLogger() {
        return this.logger;
    }

    /* renamed from: component9, reason: from getter */
    public final LogDetails getLogDetails() {
        return this.logDetails;
    }

    /* renamed from: copy-htLuCmU, reason: not valid java name */
    public final WalletComponentConfig m199copyhtLuCmU(Context context, Environment environment, PaymentSession paymentSession, String publicKey, ComponentCallback componentCallback, GooglePayFlowCoordinator googlePayFlowCoordinator, L paymentStateFlow, Logger logger, LogDetails logDetails, long errorTextColor, boolean shouldInvokeOnReady, Function1<? super UpdateDetails, Unit> onUpdateDetails, List<String> supportedCardSchemes, List<? extends CardTypeName> supportedCardTypes, GooglePayButtonTheme buttonTheme, GooglePayButtonType buttonType) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(environment, "environment");
        Intrinsics.echo(paymentSession, "paymentSession");
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(componentCallback, "componentCallback");
        Intrinsics.echo(paymentStateFlow, "paymentStateFlow");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(buttonTheme, "buttonTheme");
        Intrinsics.echo(buttonType, "buttonType");
        return new WalletComponentConfig(context, environment, paymentSession, publicKey, componentCallback, googlePayFlowCoordinator, paymentStateFlow, logger, logDetails, errorTextColor, shouldInvokeOnReady, onUpdateDetails, supportedCardSchemes, supportedCardTypes, buttonTheme, buttonType, null);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletComponentConfig)) {
            return false;
        }
        WalletComponentConfig walletComponentConfig = (WalletComponentConfig) other;
        return Intrinsics.areEqual(this.context, walletComponentConfig.context) && this.environment == walletComponentConfig.environment && Intrinsics.areEqual(this.paymentSession, walletComponentConfig.paymentSession) && Intrinsics.areEqual(this.publicKey, walletComponentConfig.publicKey) && Intrinsics.areEqual(this.componentCallback, walletComponentConfig.componentCallback) && Intrinsics.areEqual(this.googlePayFlowCoordinator, walletComponentConfig.googlePayFlowCoordinator) && Intrinsics.areEqual(this.paymentStateFlow, walletComponentConfig.paymentStateFlow) && Intrinsics.areEqual(this.logger, walletComponentConfig.logger) && Intrinsics.areEqual(this.logDetails, walletComponentConfig.logDetails) && C0366t.charlie(this.errorTextColor, walletComponentConfig.errorTextColor) && this.shouldInvokeOnReady == walletComponentConfig.shouldInvokeOnReady && Intrinsics.areEqual(this.onUpdateDetails, walletComponentConfig.onUpdateDetails) && Intrinsics.areEqual(this.supportedCardSchemes, walletComponentConfig.supportedCardSchemes) && Intrinsics.areEqual(this.supportedCardTypes, walletComponentConfig.supportedCardTypes) && this.buttonTheme == walletComponentConfig.buttonTheme && this.buttonType == walletComponentConfig.buttonType;
    }

    public final GooglePayButtonTheme getButtonTheme$wallet_standardRelease() {
        return this.buttonTheme;
    }

    public final GooglePayButtonType getButtonType$wallet_standardRelease() {
        return this.buttonType;
    }

    public final ComponentCallback getComponentCallback() {
        return this.componentCallback;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    /* renamed from: getErrorTextColor-0d7_KjU, reason: not valid java name */
    public final long m200getErrorTextColor0d7_KjU() {
        return this.errorTextColor;
    }

    public final GooglePayFlowCoordinator getGooglePayFlowCoordinator() {
        return this.googlePayFlowCoordinator;
    }

    public final LogDetails getLogDetails() {
        return this.logDetails;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final Function1<UpdateDetails, Unit> getOnUpdateDetails$wallet_standardRelease() {
        return this.onUpdateDetails;
    }

    public final PaymentSession getPaymentSession() {
        return this.paymentSession;
    }

    public final L getPaymentStateFlow() {
        return this.paymentStateFlow;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final boolean getShouldInvokeOnReady$wallet_standardRelease() {
        return this.shouldInvokeOnReady;
    }

    public final List<String> getSupportedCardSchemes$wallet_standardRelease() {
        return this.supportedCardSchemes;
    }

    public final List<CardTypeName> getSupportedCardTypes$wallet_standardRelease() {
        return this.supportedCardTypes;
    }

    public final int hashCode() {
        int hashCode;
        int i4;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (this.componentCallback.hashCode() + AbstractC2327c.sierra((this.paymentSession.hashCode() + ((this.environment.hashCode() + (this.context.hashCode() * 31)) * 31)) * 31, 31, this.publicKey)) * 31;
        GooglePayFlowCoordinator googlePayFlowCoordinator = this.googlePayFlowCoordinator;
        int i5 = 0;
        if (googlePayFlowCoordinator == null) {
            hashCode = 0;
        } else {
            hashCode = googlePayFlowCoordinator.hashCode();
        }
        int hashCode5 = (this.logDetails.hashCode() + ((this.logger.hashCode() + ((this.paymentStateFlow.hashCode() + ((hashCode4 + hashCode) * 31)) * 31)) * 31)) * 31;
        long j5 = this.errorTextColor;
        int i10 = C0366t.lima;
        int whiskey = ad.whiskey(hashCode5, 31, j5);
        if (this.shouldInvokeOnReady) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i11 = (i4 + whiskey) * 31;
        Function1 function1 = this.onUpdateDetails;
        if (function1 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = function1.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        List list = this.supportedCardSchemes;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        List list2 = this.supportedCardTypes;
        if (list2 != null) {
            i5 = list2.hashCode();
        }
        return this.buttonType.hashCode() + ((this.buttonTheme.hashCode() + ((i13 + i5) * 31)) * 31);
    }

    public final String toString() {
        return "WalletComponentConfig(context=" + this.context + ", environment=" + this.environment + ", paymentSession=" + this.paymentSession + ", publicKey=" + this.publicKey + ", componentCallback=" + this.componentCallback + ", googlePayFlowCoordinator=" + this.googlePayFlowCoordinator + ", paymentStateFlow=" + this.paymentStateFlow + ", logger=" + this.logger + ", logDetails=" + this.logDetails + ", errorTextColor=" + C0366t.india(this.errorTextColor) + ", shouldInvokeOnReady=" + this.shouldInvokeOnReady + ", onUpdateDetails=" + this.onUpdateDetails + ", supportedCardSchemes=" + this.supportedCardSchemes + ", supportedCardTypes=" + this.supportedCardTypes + ", buttonTheme=" + this.buttonTheme + ", buttonType=" + this.buttonType + ")";
    }

    public /* synthetic */ WalletComponentConfig(Context context, Environment environment, PaymentSession paymentSession, String str, ComponentCallback componentCallback, GooglePayFlowCoordinator googlePayFlowCoordinator, L l10, Logger logger, LogDetails logDetails, long j5, boolean z2, Function1 function1, List list, List list2, GooglePayButtonTheme googlePayButtonTheme, GooglePayButtonType googlePayButtonType, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, environment, paymentSession, str, componentCallback, googlePayFlowCoordinator, l10, logger, logDetails, j5, z2, (i4 & 2048) != 0 ? null : function1, (i4 & 4096) != 0 ? null : list, (i4 & 8192) != 0 ? null : list2, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? GooglePayButtonTheme.DARK : googlePayButtonTheme, (i4 & 32768) != 0 ? GooglePayButtonType.BUY : googlePayButtonType, null);
    }
}
