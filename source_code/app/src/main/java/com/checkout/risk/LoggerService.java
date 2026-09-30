package com.checkout.risk;

import android.content.Context;
import androidx.appcompat.widget.P0;
import av.q;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.checkout.eventlogger.CheckoutEventLogger;
import com.checkout.eventlogger.CheckoutEventLoggerKt;
import com.checkout.eventlogger.Environment;
import com.checkout.eventlogger.domain.model.Event;
import com.checkout.eventlogger.domain.model.MonitoringLevel;
import com.checkout.eventlogger.domain.model.RemoteProcessorMetadata;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001*B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006Jc\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014H\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J[\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010 J(\u0010!\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0014H\u0002J\u0011\u0010&\u001a\u00020#*\u00020#H\u0000¢\u0006\u0002\b'J\u0011\u0010(\u001a\u00020\u0014*\u00020#H\u0000¢\u0006\u0002\b)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/checkout/risk/LoggerService;", "Lcom/checkout/risk/LoggerServiceProtocol;", "internalConfig", "Lcom/checkout/risk/RiskSDKInternalConfig;", "context", "Landroid/content/Context;", "(Lcom/checkout/risk/RiskSDKInternalConfig;Landroid/content/Context;)V", "logger", "Lcom/checkout/eventlogger/CheckoutEventLogger;", "formatEvent", "Lcom/checkout/eventlogger/domain/model/Event;", "riskEvent", "Lcom/checkout/risk/RiskEvent;", "blockTime", "", "deviceDataPersistTime", "fpLoadTime", "fpPublishTime", "totalLatency", "deviceSessionID", "", "requestID", RedirectCustomTabEventLogger.RESULT_ERROR, "Lcom/checkout/risk/RiskLogError;", "(Lcom/checkout/risk/RiskEvent;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;DLjava/lang/String;Ljava/lang/String;Lcom/checkout/risk/RiskLogError;)Lcom/checkout/eventlogger/domain/model/Event;", "getDDTags", "environment", "getMaskedPublicKey", "publicKey", "initialise", "", "log", "(Lcom/checkout/risk/RiskEvent;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/risk/RiskLogError;)V", "provideProcessorMetadata", "Lcom/checkout/eventlogger/domain/model/RemoteProcessorMetadata;", "Lcom/checkout/eventlogger/Environment;", "identifier", "version", "toLoggingEnvironment", "toLoggingEnvironment$Risk_release", "toLoggingName", "toLoggingName$Risk_release", "LoggingEvent", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoggerService implements LoggerServiceProtocol {

    @NotNull
    private final RiskSDKInternalConfig internalConfig;

    @NotNull
    private final CheckoutEventLogger logger;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RiskEnvironment.values().length];
            try {
                iArr[RiskEnvironment.QA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RiskEnvironment.SANDBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RiskEnvironment.PRODUCTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RiskEvent.values().length];
            try {
                iArr2[RiskEvent.PUBLISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RiskEvent.COLLECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RiskEvent.PUBLISH_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RiskEvent.LOAD_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[RiskEvent.PUBLISH_DISABLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public LoggerService(@NotNull RiskSDKInternalConfig internalConfig, @NotNull Context context) {
        Intrinsics.echo(internalConfig, "internalConfig");
        Intrinsics.echo(context, "context");
        this.internalConfig = internalConfig;
        CheckoutEventLogger checkoutEventLogger = new CheckoutEventLogger(Constants.PRODUCT_NAME);
        Boolean DEFAULT_LOGCAT_MONITORING_ENABLED = BuildConfig.DEFAULT_LOGCAT_MONITORING_ENABLED;
        Intrinsics.delta(DEFAULT_LOGCAT_MONITORING_ENABLED, "DEFAULT_LOGCAT_MONITORING_ENABLED");
        if (DEFAULT_LOGCAT_MONITORING_ENABLED.booleanValue()) {
            checkoutEventLogger.enableLocalProcessor(MonitoringLevel.DEBUG);
        }
        this.logger = checkoutEventLogger;
        initialise(context, internalConfig);
    }

    private final Event formatEvent(RiskEvent riskEvent, Double blockTime, Double deviceDataPersistTime, Double fpLoadTime, Double fpPublishTime, double totalLatency, String deviceSessionID, String requestID, RiskLogError error) {
        boolean z2;
        MonitoringLevel monitoringLevel;
        LinkedHashMap linkedHashMap;
        String str;
        String str2;
        String str3;
        String str4;
        String id2 = TimeZone.getDefault().getID();
        String maskedPublicKey = getMaskedPublicKey(this.internalConfig.getMerchantPublicKey());
        String name = this.internalConfig.getEnvironment().name();
        Locale ROOT = Locale.ROOT;
        Intrinsics.delta(ROOT, "ROOT");
        String lowerCase = name.toLowerCase(ROOT);
        Intrinsics.delta(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String dDTags = getDDTags(lowerCase);
        if (this.internalConfig.getFramesOptions() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        int[] iArr = WhenMappings.$EnumSwitchMapping$1;
        int i4 = iArr[riskEvent.ordinal()];
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3 && i4 != 4) {
                if (i4 == 5) {
                    monitoringLevel = MonitoringLevel.WARN;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                monitoringLevel = MonitoringLevel.ERROR;
            }
        } else {
            monitoringLevel = MonitoringLevel.INFO;
        }
        int i5 = iArr[riskEvent.ordinal()];
        boolean z10 = z2;
        MonitoringLevel monitoringLevel2 = monitoringLevel;
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3 && i5 != 4 && i5 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            Pair pair = new Pair("Block", blockTime);
            Pair pair2 = new Pair("DeviceDataPersist", deviceDataPersistTime);
            Pair pair3 = new Pair("FpLoad", fpLoadTime);
            Pair pair4 = new Pair("FpPublish", fpPublishTime);
            Pair pair5 = new Pair("Total", Double.valueOf(totalLatency));
            Pair pair6 = new Pair("EventType", riskEvent.getRawValue());
            Pair pair7 = new Pair("FramesMode", Boolean.valueOf(z10));
            Pair pair8 = new Pair("MaskedPublicKey", maskedPublicKey);
            Pair pair9 = new Pair("ddTags", dDTags);
            Pair pair10 = new Pair("RiskSDKVersion", Constants.RISK_PACKAGE_VERSION);
            Pair pair11 = new Pair("Timezone", id2);
            if (error != null) {
                str = error.getMessage();
            } else {
                str = null;
            }
            Pair pair12 = new Pair("ErrorMessage", str);
            if (error != null) {
                str2 = error.getType();
            } else {
                str2 = null;
            }
            Pair pair13 = new Pair("ErrorType", str2);
            if (error != null) {
                str3 = error.getReason();
            } else {
                str3 = null;
            }
            Pair pair14 = new Pair("ErrorReason", str3);
            if (error != null) {
                str4 = error.getInnerExceptionType();
            } else {
                str4 = null;
            }
            Map sierra = y.sierra(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, new Pair("InnerExceptionType", str4));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : sierra.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap = new LinkedHashMap(y.quebec(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                Intrinsics.checkNotNull(value);
                linkedHashMap.put(key, value);
            }
        } else {
            Map sierra2 = y.sierra(new Pair("Block", blockTime), new Pair("DeviceDataPersist", deviceDataPersistTime), new Pair("FpLoad", fpLoadTime), new Pair("FpPublish", fpPublishTime), new Pair("Total", Double.valueOf(totalLatency)), new Pair("EventType", riskEvent.getRawValue()), new Pair("FramesMode", Boolean.valueOf(z10)), new Pair("MaskedPublicKey", maskedPublicKey), new Pair("ddTags", dDTags), new Pair("RiskSDKVersion", Constants.RISK_PACKAGE_VERSION), new Pair("Timezone", id2), new Pair("FpRequestId", requestID), new Pair("DeviceSessionId", deviceSessionID));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry3 : sierra2.entrySet()) {
                if (entry3.getValue() != null) {
                    linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                }
            }
            linkedHashMap = new LinkedHashMap(y.quebec(linkedHashMap3.size()));
            for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                Object key2 = entry4.getKey();
                Object value2 = entry4.getValue();
                Intrinsics.checkNotNull(value2);
                linkedHashMap.put(key2, value2);
            }
        }
        return new LoggingEvent(monitoringLevel2, linkedHashMap, null, riskEvent.getRawValue(), 4, null);
    }

    private final String getDDTags(String environment) {
        return q.echo("team:prism,service:prism.risk.android,version:2.3.0,env:", environment);
    }

    private final String getMaskedPublicKey(String publicKey) {
        return StringsKt.yellow(8, publicKey) + "********" + StringsKt.a(6, publicKey);
    }

    private final void initialise(Context context, RiskSDKInternalConfig internalConfig) {
        String str;
        String str2;
        String str3;
        Environment environment;
        FramesOptions framesOptions = internalConfig.getFramesOptions();
        if (framesOptions == null || (str = framesOptions.getProductIdentifier()) == null) {
            str = BuildConfig.LIBRARY_PACKAGE_NAME;
        }
        FramesOptions framesOptions2 = internalConfig.getFramesOptions();
        if (framesOptions2 == null || (str2 = framesOptions2.getVersion()) == null) {
            str2 = com.checkout.eventlogger.BuildConfig.VERSION_NAME;
        }
        FramesOptions framesOptions3 = internalConfig.getFramesOptions();
        if (framesOptions3 != null) {
            str3 = framesOptions3.getCorrelationId();
        } else {
            str3 = null;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[internalConfig.getEnvironment().ordinal()];
        if (i4 != 1 && i4 != 2) {
            if (i4 == 3) {
                environment = Environment.PRODUCTION.INSTANCE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            environment = Environment.SANDBOX.INSTANCE;
        }
        this.logger.enableRemoteProcessor(toLoggingEnvironment$Risk_release(environment), provideProcessorMetadata(context, environment, str, str2));
        if (str3 != null) {
            this.logger.addMetadata(CheckoutEventLoggerKt.METADATA_CORRELATION_ID, str3);
        }
    }

    private final RemoteProcessorMetadata provideProcessorMetadata(Context context, Environment environment, String identifier, String version) {
        return RemoteProcessorMetadata.INSTANCE.from(context, toLoggingName$Risk_release(environment), identifier, version);
    }

    @Override // com.checkout.risk.LoggerServiceProtocol
    public void log(@NotNull RiskEvent riskEvent, @Nullable Double blockTime, @Nullable Double deviceDataPersistTime, @Nullable Double fpLoadTime, @Nullable Double fpPublishTime, @Nullable String deviceSessionID, @Nullable String requestID, @Nullable RiskLogError error) {
        double d4;
        Intrinsics.echo(riskEvent, "riskEvent");
        Double[] dArr = {blockTime, deviceDataPersistTime, fpLoadTime, fpPublishTime};
        double d9 = 0.0d;
        for (int i4 = 0; i4 < 4; i4++) {
            Double d10 = dArr[i4];
            if (d10 != null) {
                d4 = d10.doubleValue();
            } else {
                d4 = 0.0d;
            }
            d9 += d4;
        }
        this.logger.logEvent(formatEvent(riskEvent, blockTime, deviceDataPersistTime, fpLoadTime, fpPublishTime, d9, deviceSessionID, requestID, error));
    }

    @NotNull
    public final Environment toLoggingEnvironment$Risk_release(@NotNull Environment environment) {
        Intrinsics.echo(environment, "<this>");
        Environment.PRODUCTION production = Environment.PRODUCTION.INSTANCE;
        if (Intrinsics.areEqual(environment, production)) {
            return production;
        }
        Environment.SANDBOX sandbox = Environment.SANDBOX.INSTANCE;
        if (Intrinsics.areEqual(environment, sandbox)) {
            return sandbox;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String toLoggingName$Risk_release(@NotNull Environment environment) {
        Intrinsics.echo(environment, "<this>");
        if (Intrinsics.areEqual(environment, Environment.PRODUCTION.INSTANCE)) {
            return "production";
        }
        if (Intrinsics.areEqual(environment, Environment.SANDBOX.INSTANCE)) {
            return "sandbox";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/checkout/risk/LoggerService$LoggingEvent;", "Lcom/checkout/eventlogger/domain/model/Event;", "monitoringLevel", "Lcom/checkout/eventlogger/domain/model/MonitoringLevel;", "properties", "", "", "", "time", "Ljava/util/Date;", "typeIdentifier", "(Lcom/checkout/eventlogger/domain/model/MonitoringLevel;Ljava/util/Map;Ljava/util/Date;Ljava/lang/String;)V", "getMonitoringLevel", "()Lcom/checkout/eventlogger/domain/model/MonitoringLevel;", "getProperties", "()Ljava/util/Map;", "getTime", "()Ljava/util/Date;", "getTypeIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class LoggingEvent implements Event {

        @NotNull
        private final MonitoringLevel monitoringLevel;

        @NotNull
        private final Map<String, Object> properties;

        @NotNull
        private final Date time;

        @NotNull
        private final String typeIdentifier;

        public LoggingEvent(@NotNull MonitoringLevel monitoringLevel, @NotNull Map<String, ? extends Object> properties, @NotNull Date time, @NotNull String typeIdentifier) {
            Intrinsics.echo(monitoringLevel, "monitoringLevel");
            Intrinsics.echo(properties, "properties");
            Intrinsics.echo(time, "time");
            Intrinsics.echo(typeIdentifier, "typeIdentifier");
            this.monitoringLevel = monitoringLevel;
            this.properties = properties;
            this.time = time;
            this.typeIdentifier = typeIdentifier;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LoggingEvent copy$default(LoggingEvent loggingEvent, MonitoringLevel monitoringLevel, Map map, Date date, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                monitoringLevel = loggingEvent.monitoringLevel;
            }
            if ((i4 & 2) != 0) {
                map = loggingEvent.properties;
            }
            if ((i4 & 4) != 0) {
                date = loggingEvent.time;
            }
            if ((i4 & 8) != 0) {
                str = loggingEvent.typeIdentifier;
            }
            return loggingEvent.copy(monitoringLevel, map, date, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final MonitoringLevel getMonitoringLevel() {
            return this.monitoringLevel;
        }

        @NotNull
        public final Map<String, Object> component2() {
            return this.properties;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Date getTime() {
            return this.time;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getTypeIdentifier() {
            return this.typeIdentifier;
        }

        @NotNull
        public final LoggingEvent copy(@NotNull MonitoringLevel monitoringLevel, @NotNull Map<String, ? extends Object> properties, @NotNull Date time, @NotNull String typeIdentifier) {
            Intrinsics.echo(monitoringLevel, "monitoringLevel");
            Intrinsics.echo(properties, "properties");
            Intrinsics.echo(time, "time");
            Intrinsics.echo(typeIdentifier, "typeIdentifier");
            return new LoggingEvent(monitoringLevel, properties, time, typeIdentifier);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoggingEvent)) {
                return false;
            }
            LoggingEvent loggingEvent = (LoggingEvent) other;
            return this.monitoringLevel == loggingEvent.monitoringLevel && Intrinsics.areEqual(this.properties, loggingEvent.properties) && Intrinsics.areEqual(this.time, loggingEvent.time) && Intrinsics.areEqual(this.typeIdentifier, loggingEvent.typeIdentifier);
        }

        @Override // com.checkout.eventlogger.domain.model.Event
        @NotNull
        /* renamed from: getMonitoringLevel */
        public MonitoringLevel getF6582a() {
            return this.monitoringLevel;
        }

        @Override // com.checkout.eventlogger.domain.model.Event
        @NotNull
        public Map<String, Object> getProperties() {
            return this.properties;
        }

        @Override // com.checkout.eventlogger.domain.model.Event
        @NotNull
        /* renamed from: getTime */
        public Date getE() {
            return this.time;
        }

        @Override // com.checkout.eventlogger.domain.model.Event
        @NotNull
        /* renamed from: getTypeIdentifier */
        public String getF6583b() {
            return this.typeIdentifier;
        }

        public int hashCode() {
            return this.typeIdentifier.hashCode() + ((this.time.hashCode() + ((this.properties.hashCode() + (this.monitoringLevel.hashCode() * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LoggingEvent(monitoringLevel=");
            sb2.append(this.monitoringLevel);
            sb2.append(", properties=");
            sb2.append(this.properties);
            sb2.append(", time=");
            sb2.append(this.time);
            sb2.append(", typeIdentifier=");
            return P0.fuchsia(sb2, this.typeIdentifier, ')');
        }

        public /* synthetic */ LoggingEvent(MonitoringLevel monitoringLevel, Map map, Date date, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(monitoringLevel, (i4 & 2) != 0 ? t.alpha : map, (i4 & 4) != 0 ? new Date() : date, str);
        }
    }
}
