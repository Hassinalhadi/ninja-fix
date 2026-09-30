package com.checkout.components.insight;

import Cf.e;
import Nd.h;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.checkout.components.insight.data.dto.Accessibility;
import com.checkout.components.insight.data.dto.DeviceData;
import com.checkout.components.insight.data.dto.ErrorDetails;
import com.checkout.components.insight.data.dto.EventData;
import com.checkout.components.insight.data.dto.Events;
import com.checkout.components.insight.data.dto.Properties;
import com.checkout.components.insight.usecase.SendLogsUseCase;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.ErrorExtensionsKt;
import com.checkout.components.interfaces.insight.LogLevel;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.insight.PaymentSessionDetails;
import com.checkout.components.interfaces.insight.ProductEventName;
import com.checkout.components.interfaces.insight.ProductEventProperties;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vf.U;
import vf.aa;
import vf.ab;
import vf.ad;
import vf.ao;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u0000 A2\u00020\u0001:\u0001AB]\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J1\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u001cJ)\u0010!\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0006\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\"J9\u0010!\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010#J\"\u0010$\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J7\u00105\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u0010+\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0004\b3\u00104J\u0017\u00108\u001a\u00020\u000b2\u0006\u00107\u001a\u000206H\u0007¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00152\u0006\u0010)\u001a\u00020:H\u0007¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u00020\u000b2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010=H\u0007¢\u0006\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/checkout/components/insight/LoggerManager;", "Lcom/checkout/components/interfaces/insight/Logger;", "", "publicKey", "mobileSessionId", "Lcom/checkout/components/interfaces/insight/PaymentSessionDetails;", "paymentSessionDetails", "Landroid/content/Context;", "context", "Lcom/checkout/components/insight/usecase/SendLogsUseCase;", "sendLogsUseCase", "", "analyticsDisabled", "isDebug", "Lcom/checkout/components/insight/TimestampFormatter;", "timestampFormatter", "Lvf/ab;", "loggingCoroutineScope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/insight/PaymentSessionDetails;Landroid/content/Context;Lcom/checkout/components/insight/usecase/SendLogsUseCase;ZZLcom/checkout/components/insight/TimestampFormatter;Lvf/ab;)V", Constants.KEY_MESSAGE, "", "logInfo", "(Ljava/lang/String;)V", "logWarning", "messageToLog", "name", "stackTrace", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/checkout/components/interfaces/error/CheckoutError;", RedirectCustomTabEventLogger.RESULT_ERROR, "errorStack", "throwInDebug", "logError", "(Lcom/checkout/components/interfaces/error/CheckoutError;Ljava/lang/String;Z)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "logErrorAndAwait", "(Lcom/checkout/components/interfaces/error/CheckoutError;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "getMobileSessionId", "()Ljava/lang/String;", "Lcom/checkout/components/interfaces/insight/ProductEventName;", com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM, "Lcom/checkout/components/interfaces/insight/ProductEventProperties;", "properties", "sendProductEvent", "(Lcom/checkout/components/interfaces/insight/ProductEventName;Lcom/checkout/components/interfaces/insight/ProductEventProperties;)V", "Lcom/checkout/components/interfaces/insight/LogLevel;", "level", "Lcom/checkout/components/insight/data/dto/ErrorDetails;", "errorDetails", "Lcom/checkout/components/insight/data/dto/Properties;", "log$insight_standardRelease", "(Lcom/checkout/components/interfaces/insight/LogLevel;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/ErrorDetails;Lcom/checkout/components/insight/data/dto/Properties;)V", "log", "", "fontScale", "isDisplayTextLarge", "(F)Z", "Lcom/checkout/components/insight/data/dto/Events;", "sendEvent", "(Lcom/checkout/components/insight/data/dto/Events;)V", "", "featureFlags", "logsAreEnabled", "(Ljava/util/List;)Z", "Companion", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoggerManager implements Logger {

    /* renamed from: a, reason: collision with root package name */
    private final String f5106a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5107b;

    /* renamed from: c, reason: collision with root package name */
    private final PaymentSessionDetails f5108c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f5109d;
    private final SendLogsUseCase e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5110f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f5111g;

    /* renamed from: h, reason: collision with root package name */
    private final TimestampFormatter f5112h;

    /* renamed from: i, reason: collision with root package name */
    private final ab f5113i;

    /* renamed from: j, reason: collision with root package name */
    private final Set f5114j;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductEventName.values().length];
            try {
                iArr[ProductEventName.InitialisationSucceeded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LoggerManager(String publicKey, String mobileSessionId, PaymentSessionDetails paymentSessionDetails, Context context, SendLogsUseCase sendLogsUseCase, boolean z2, boolean z10, TimestampFormatter timestampFormatter, ab loggingCoroutineScope) {
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(mobileSessionId, "mobileSessionId");
        Intrinsics.echo(paymentSessionDetails, "paymentSessionDetails");
        Intrinsics.echo(context, "context");
        Intrinsics.echo(sendLogsUseCase, "sendLogsUseCase");
        Intrinsics.echo(timestampFormatter, "timestampFormatter");
        Intrinsics.echo(loggingCoroutineScope, "loggingCoroutineScope");
        this.f5106a = publicKey;
        this.f5107b = mobileSessionId;
        this.f5108c = paymentSessionDetails;
        this.f5109d = context;
        this.e = sendLogsUseCase;
        this.f5110f = z2;
        this.f5111g = z10;
        this.f5112h = timestampFormatter;
        this.f5113i = loggingCoroutineScope;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.delta(newSetFromMap, "newSetFromMap(...)");
        this.f5114j = newSetFromMap;
    }

    private final boolean a(ProductEventName productEventName, ProductEventProperties productEventProperties) {
        if (productEventName != ProductEventName.PaymentMethodSelected) {
            return false;
        }
        String str = productEventName.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String();
        String componentName = productEventProperties.getComponentName();
        String paymentMethodName = productEventProperties.getPaymentMethodName();
        return !this.f5114j.add(str + "_" + componentName + "_" + paymentMethodName);
    }

    public static final Object access$logAndAwait(LoggerManager loggerManager, LogLevel logLevel, String str, ErrorDetails errorDetails, Properties properties, Nd.c cVar) {
        if (!loggerManager.logsAreEnabled(loggerManager.f5108c.getFeatureFlags())) {
            return Unit.INSTANCE;
        }
        Object blue = ad.blue(loggerManager.f5113i.charlie(), new b(loggerManager, logLevel, str, errorDetails, properties, null), cVar);
        if (blue == Od.a.alpha) {
            return blue;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void log$insight_standardRelease$default(LoggerManager loggerManager, LogLevel logLevel, String str, ErrorDetails errorDetails, Properties properties, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            errorDetails = null;
        }
        if ((i4 & 8) != 0) {
            properties = null;
        }
        loggerManager.log$insight_standardRelease(logLevel, str, errorDetails, properties);
    }

    @Override // com.checkout.components.interfaces.insight.Logger
    /* renamed from: getMobileSessionId, reason: from getter */
    public final String getF5107b() {
        return this.f5107b;
    }

    public final boolean isDisplayTextLarge(float fontScale) {
        return ((double) fontScale) > 1.0d;
    }

    public final void log$insight_standardRelease(LogLevel level, String message, ErrorDetails errorDetails, Properties properties) {
        Intrinsics.echo(level, "level");
        Intrinsics.echo(message, "message");
        if (!logsAreEnabled(this.f5108c.getFeatureFlags())) {
            return;
        }
        sendEvent(a(level, message, errorDetails, properties));
    }

    @Override // com.checkout.components.interfaces.insight.Logger
    public final void logError(CheckoutError error, String errorStack, boolean throwInDebug) {
        Intrinsics.echo(error, "error");
        log$insight_standardRelease$default(this, LogLevel.ERROR, ErrorExtensionsKt.toLogMessage(error), new ErrorDetails(error.getCode().name(), error.getMessage(), errorStack), null, 8, null);
        if (throwInDebug && this.f5111g) {
            throw error;
        }
    }

    @Override // com.checkout.components.interfaces.insight.Logger
    public final Object logErrorAndAwait(CheckoutError checkoutError, String str, Nd.c<? super Unit> cVar) {
        Object blue;
        LogLevel logLevel = LogLevel.ERROR;
        String logMessage = ErrorExtensionsKt.toLogMessage(checkoutError);
        ErrorDetails errorDetails = new ErrorDetails(checkoutError.getCode().name(), checkoutError.getMessage(), str);
        if (!logsAreEnabled(this.f5108c.getFeatureFlags())) {
            blue = Unit.INSTANCE;
        } else {
            blue = ad.blue(this.f5113i.charlie(), new b(this, logLevel, logMessage, errorDetails, null, null), cVar);
            if (blue != Od.a.alpha) {
                blue = Unit.INSTANCE;
            }
        }
        if (blue == Od.a.alpha) {
            return blue;
        }
        return Unit.INSTANCE;
    }

    @Override // com.checkout.components.interfaces.insight.Logger
    public final void logInfo(String message) {
        Intrinsics.echo(message, "message");
        log$insight_standardRelease$default(this, LogLevel.INFO, message, null, null, 12, null);
    }

    @Override // com.checkout.components.interfaces.insight.Logger
    public final void logWarning(String message) {
        Intrinsics.echo(message, "message");
        log$insight_standardRelease$default(this, LogLevel.WARN, message, null, null, 12, null);
    }

    public final boolean logsAreEnabled(List<String> featureFlags) {
        if (featureFlags == null) {
            return false;
        }
        if (!featureFlags.contains(com.checkout.components.interfaces.insight.Constants.LOGS_ENABLED) && !featureFlags.contains(com.checkout.components.interfaces.insight.Constants.FORCE_LOGS_ENABLED)) {
            return false;
        }
        return true;
    }

    public final void sendEvent(Events event) {
        Intrinsics.echo(event, "event");
        ad.zulu(this.f5113i, null, null, new c(this, event, null), 3);
    }

    @Override // com.checkout.components.interfaces.insight.Logger
    public final void sendProductEvent(ProductEventName event, ProductEventProperties properties) {
        Intrinsics.echo(event, "event");
        Intrinsics.echo(properties, "properties");
        if (this.f5110f || a(event, properties)) {
            return;
        }
        String str = event.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String();
        Properties properties2 = new Properties(null, null, null, null, null, null, null, null, null, null, properties.getComponentName(), properties.getPaymentMethodName(), properties.getActionType(), properties.getRenderer(), properties.getPaymentId(), properties.getResult(), properties.getName(), 1023, null);
        if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
            properties2 = Properties.copy$default(properties2, null, null, null, null, null, null, this.f5108c.getExperiments(), null, null, null, null, null, null, null, null, null, null, 131007, null);
        }
        sendEvent(new Events(kotlin.collections.ab.juliet(new EventData.ProductEvent(this.f5112h.format(new Date()), this.f5108c.getPaymentSessionId(), this.f5108c.getEntityId(), this.f5108c.getProcessingChannelId(), this.f5107b, a(), "2.1.0", str, properties2))));
    }

    @Override // com.checkout.components.interfaces.insight.Logger
    public final void logWarning(String messageToLog, String name, String message, String stackTrace) {
        Intrinsics.echo(messageToLog, "messageToLog");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(message, "message");
        log$insight_standardRelease$default(this, LogLevel.WARN, messageToLog, new ErrorDetails(name, message, stackTrace), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Events a(LogLevel logLevel, String str, ErrorDetails errorDetails, Properties properties) {
        String str2;
        String str3;
        String stack;
        String format = this.f5112h.format(new Date());
        String paymentSessionId = this.f5108c.getPaymentSessionId();
        String entityId = this.f5108c.getEntityId();
        String processingChannelId = this.f5108c.getProcessingChannelId();
        String str4 = this.f5107b;
        DeviceData a6 = a();
        String str5 = "";
        String str6 = str == null ? "" : str;
        String value = logLevel.getValue();
        if (errorDetails == null || (str2 = errorDetails.getName()) == null) {
            str2 = "";
        }
        if (errorDetails == null || (str3 = errorDetails.getMessage()) == null) {
            str3 = "";
        }
        if (errorDetails != null && (stack = errorDetails.getStack()) != null) {
            str5 = stack;
        }
        return new Events(kotlin.collections.ab.juliet(new EventData.LogEvent(format, paymentSessionId, entityId, processingChannelId, str4, a6, "2.1.0", str6, value, new ErrorDetails(str2, str3, str5), properties)));
    }

    @Override // com.checkout.components.interfaces.insight.Logger
    public final void logError(String messageToLog, String name, String message, String stackTrace, boolean throwInDebug) {
        Intrinsics.echo(messageToLog, "messageToLog");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(message, "message");
        log$insight_standardRelease$default(this, LogLevel.ERROR, messageToLog, new ErrorDetails(name, message, stackTrace), null, 8, null);
        if (throwInDebug && this.f5111g) {
            throw new IllegalStateException(ao.ad.amber(name, ": ", message));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LoggerManager(String str, String str2, PaymentSessionDetails paymentSessionDetails, Context context, SendLogsUseCase sendLogsUseCase, boolean z2, boolean z10, TimestampFormatter timestampFormatter, ab abVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, paymentSessionDetails, context, sendLogsUseCase, z2, z10, timestampFormatter, abVar);
        int i5 = 0;
        z2 = (i4 & 32) != 0 ? false : z2;
        z10 = (i4 & 64) != 0 ? false : z10;
        timestampFormatter = (i4 & 128) != 0 ? new TimestampFormatter(i5, null, 3, 0 == true ? 1 : 0) : timestampFormatter;
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            h plus = new aa("InsightLoggingService").plus(ad.foxtrot());
            e eVar = ao.alpha;
            abVar = ad.charlie(plus.plus(Cf.d.purple).plus(U.alpha));
        }
    }

    private final DeviceData a() {
        PackageInfo packageInfo;
        String packageName = this.f5109d.getPackageName();
        Intrinsics.delta(packageName, "getPackageName(...)");
        PackageManager packageManager = this.f5109d.getPackageManager();
        Intrinsics.delta(packageManager, "getPackageManager(...)");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            packageInfo = E0.c.charlie(packageManager, packageName, E0.c.delta());
            Intrinsics.checkNotNull(packageInfo);
        } else {
            packageInfo = packageManager.getPackageInfo(packageName, 0);
            Intrinsics.checkNotNull(packageInfo);
        }
        String valueOf = String.valueOf(i4);
        String amber = ao.ad.amber(Build.MANUFACTURER, " - ", Build.MODEL);
        String uuid = new UUID(packageInfo.firstInstallTime, packageInfo.lastUpdateTime).toString();
        Intrinsics.delta(uuid, "toString(...)");
        String packageName2 = packageInfo.packageName;
        Intrinsics.delta(packageName2, "packageName");
        String str = packageInfo.versionName;
        if (str == null) {
            str = "unknown";
        }
        return new DeviceData("2.1.0", "android", valueOf, amber, uuid, packageName2, str, new Accessibility(isDisplayTextLarge(this.f5109d.getResources().getConfiguration().fontScale)));
    }
}
