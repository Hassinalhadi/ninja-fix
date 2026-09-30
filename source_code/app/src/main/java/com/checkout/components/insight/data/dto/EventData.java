package com.checkout.components.insight.data.dto;

import Q0.c;
import av.q;
import com.checkout.components.insight.a;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true, generator = "sealed:class")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0003\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/checkout/components/insight/data/dto/EventData;", "", "", "getTimestamp", "()Ljava/lang/String;", "timestamp", "getPaymentSessionId", "paymentSessionId", "getEntityId", "entityId", "getProcessingChannelId", "processingChannelId", "getMobileSessionId", "mobileSessionId", "Lcom/checkout/components/insight/data/dto/DeviceData;", "getDeviceData", "()Lcom/checkout/components/insight/data/dto/DeviceData;", "deviceData", "getVersion", "version", "Lcom/checkout/components/insight/data/dto/Properties;", "getProperties", "()Lcom/checkout/components/insight/data/dto/Properties;", "properties", "ProductEvent", "LogEvent", "MetricEvent", "Lcom/checkout/components/insight/data/dto/EventData$LogEvent;", "Lcom/checkout/components/insight/data/dto/EventData$MetricEvent;", "Lcom/checkout/components/insight/data/dto/EventData$ProductEvent;", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EventData {

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0081\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0082\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b0\u0010.\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u0014R \u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b4\u0010.\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010\u0014R \u0010\u0006\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b7\u0010.\u0012\u0004\b9\u00103\u001a\u0004\b8\u0010\u0014R \u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b:\u0010.\u0012\u0004\b<\u00103\u001a\u0004\b;\u0010\u0014R \u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\b@\u00103\u001a\u0004\b?\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010.\u001a\u0004\bB\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010.\u001a\u0004\bD\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010.\u001a\u0004\bF\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010!¨\u0006M"}, d2 = {"Lcom/checkout/components/insight/data/dto/EventData$LogEvent;", "Lcom/checkout/components/insight/data/dto/EventData;", "", "timestamp", "paymentSessionId", "entityId", "processingChannelId", "mobileSessionId", "Lcom/checkout/components/insight/data/dto/DeviceData;", "deviceData", "version", Constants.KEY_MESSAGE, "level", "Lcom/checkout/components/insight/data/dto/ErrorDetails;", RedirectCustomTabEventLogger.RESULT_ERROR, "Lcom/checkout/components/insight/data/dto/Properties;", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/DeviceData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/ErrorDetails;Lcom/checkout/components/insight/data/dto/Properties;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/checkout/components/insight/data/dto/DeviceData;", "component7", "component8", "component9", "component10", "()Lcom/checkout/components/insight/data/dto/ErrorDetails;", "component11", "()Lcom/checkout/components/insight/data/dto/Properties;", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/DeviceData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/ErrorDetails;Lcom/checkout/components/insight/data/dto/Properties;)Lcom/checkout/components/insight/data/dto/EventData$LogEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTimestamp", "b", "getPaymentSessionId", "getPaymentSessionId$annotations", "()V", "c", "getEntityId", "getEntityId$annotations", Constants.INAPP_DATA_TAG, "getProcessingChannelId", "getProcessingChannelId$annotations", "e", "getMobileSessionId", "getMobileSessionId$annotations", "f", "Lcom/checkout/components/insight/data/dto/DeviceData;", "getDeviceData", "getDeviceData$annotations", "g", "getVersion", "h", "getMessage", "i", "getLevel", "j", "Lcom/checkout/components/insight/data/dto/ErrorDetails;", "getError", "k", "Lcom/checkout/components/insight/data/dto/Properties;", "getProperties", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class LogEvent extends EventData {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String timestamp;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String paymentSessionId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String entityId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String processingChannelId;

        /* renamed from: e, reason: from kotlin metadata */
        private final String mobileSessionId;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final DeviceData deviceData;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final String version;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final String level;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final ErrorDetails error;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final Properties properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogEvent(String timestamp, @Json(name = "payment_session_id") String paymentSessionId, @Json(name = "entity_id") String entityId, @Json(name = "processing_channel_id") String processingChannelId, @Json(name = "mobile_session_id") String mobileSessionId, @Json(name = "device_data") DeviceData deviceData, String version, String message, String level, ErrorDetails errorDetails, Properties properties) {
            super(null);
            Intrinsics.echo(timestamp, "timestamp");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            Intrinsics.echo(entityId, "entityId");
            Intrinsics.echo(processingChannelId, "processingChannelId");
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(deviceData, "deviceData");
            Intrinsics.echo(version, "version");
            Intrinsics.echo(message, "message");
            Intrinsics.echo(level, "level");
            this.timestamp = timestamp;
            this.paymentSessionId = paymentSessionId;
            this.entityId = entityId;
            this.processingChannelId = processingChannelId;
            this.mobileSessionId = mobileSessionId;
            this.deviceData = deviceData;
            this.version = version;
            this.message = message;
            this.level = level;
            this.error = errorDetails;
            this.properties = properties;
        }

        public static /* synthetic */ LogEvent copy$default(LogEvent logEvent, String str, String str2, String str3, String str4, String str5, DeviceData deviceData, String str6, String str7, String str8, ErrorDetails errorDetails, Properties properties, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = logEvent.timestamp;
            }
            if ((i4 & 2) != 0) {
                str2 = logEvent.paymentSessionId;
            }
            if ((i4 & 4) != 0) {
                str3 = logEvent.entityId;
            }
            if ((i4 & 8) != 0) {
                str4 = logEvent.processingChannelId;
            }
            if ((i4 & 16) != 0) {
                str5 = logEvent.mobileSessionId;
            }
            if ((i4 & 32) != 0) {
                deviceData = logEvent.deviceData;
            }
            if ((i4 & 64) != 0) {
                str6 = logEvent.version;
            }
            if ((i4 & 128) != 0) {
                str7 = logEvent.message;
            }
            if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
                str8 = logEvent.level;
            }
            if ((i4 & 512) != 0) {
                errorDetails = logEvent.error;
            }
            if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
                properties = logEvent.properties;
            }
            ErrorDetails errorDetails2 = errorDetails;
            Properties properties2 = properties;
            String str9 = str7;
            String str10 = str8;
            DeviceData deviceData2 = deviceData;
            String str11 = str6;
            String str12 = str5;
            String str13 = str3;
            return logEvent.copy(str, str2, str13, str4, str12, deviceData2, str11, str9, str10, errorDetails2, properties2);
        }

        @Json(name = "device_data")
        public static /* synthetic */ void getDeviceData$annotations() {
        }

        @Json(name = "entity_id")
        public static /* synthetic */ void getEntityId$annotations() {
        }

        @Json(name = "mobile_session_id")
        public static /* synthetic */ void getMobileSessionId$annotations() {
        }

        @Json(name = "payment_session_id")
        public static /* synthetic */ void getPaymentSessionId$annotations() {
        }

        @Json(name = "processing_channel_id")
        public static /* synthetic */ void getProcessingChannelId$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component10, reason: from getter */
        public final ErrorDetails getError() {
            return this.error;
        }

        /* renamed from: component11, reason: from getter */
        public final Properties getProperties() {
            return this.properties;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEntityId() {
            return this.entityId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getProcessingChannelId() {
            return this.processingChannelId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getMobileSessionId() {
            return this.mobileSessionId;
        }

        /* renamed from: component6, reason: from getter */
        public final DeviceData getDeviceData() {
            return this.deviceData;
        }

        /* renamed from: component7, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component8, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component9, reason: from getter */
        public final String getLevel() {
            return this.level;
        }

        public final LogEvent copy(String timestamp, @Json(name = "payment_session_id") String paymentSessionId, @Json(name = "entity_id") String entityId, @Json(name = "processing_channel_id") String processingChannelId, @Json(name = "mobile_session_id") String mobileSessionId, @Json(name = "device_data") DeviceData deviceData, String version, String message, String level, ErrorDetails error, Properties properties) {
            Intrinsics.echo(timestamp, "timestamp");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            Intrinsics.echo(entityId, "entityId");
            Intrinsics.echo(processingChannelId, "processingChannelId");
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(deviceData, "deviceData");
            Intrinsics.echo(version, "version");
            Intrinsics.echo(message, "message");
            Intrinsics.echo(level, "level");
            return new LogEvent(timestamp, paymentSessionId, entityId, processingChannelId, mobileSessionId, deviceData, version, message, level, error, properties);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogEvent)) {
                return false;
            }
            LogEvent logEvent = (LogEvent) other;
            return Intrinsics.areEqual(this.timestamp, logEvent.timestamp) && Intrinsics.areEqual(this.paymentSessionId, logEvent.paymentSessionId) && Intrinsics.areEqual(this.entityId, logEvent.entityId) && Intrinsics.areEqual(this.processingChannelId, logEvent.processingChannelId) && Intrinsics.areEqual(this.mobileSessionId, logEvent.mobileSessionId) && Intrinsics.areEqual(this.deviceData, logEvent.deviceData) && Intrinsics.areEqual(this.version, logEvent.version) && Intrinsics.areEqual(this.message, logEvent.message) && Intrinsics.areEqual(this.level, logEvent.level) && Intrinsics.areEqual(this.error, logEvent.error) && Intrinsics.areEqual(this.properties, logEvent.properties);
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final DeviceData getDeviceData() {
            return this.deviceData;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getEntityId() {
            return this.entityId;
        }

        public final ErrorDetails getError() {
            return this.error;
        }

        public final String getLevel() {
            return this.level;
        }

        public final String getMessage() {
            return this.message;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getProcessingChannelId() {
            return this.processingChannelId;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final Properties getProperties() {
            return this.properties;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getTimestamp() {
            return this.timestamp;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getVersion() {
            return this.version;
        }

        public final int hashCode() {
            int hashCode;
            int a6 = a.a(this.level, a.a(this.message, a.a(this.version, (this.deviceData.hashCode() + a.a(this.mobileSessionId, a.a(this.processingChannelId, a.a(this.entityId, a.a(this.paymentSessionId, this.timestamp.hashCode() * 31, 31), 31), 31), 31)) * 31, 31), 31), 31);
            ErrorDetails errorDetails = this.error;
            int i4 = 0;
            if (errorDetails == null) {
                hashCode = 0;
            } else {
                hashCode = errorDetails.hashCode();
            }
            int i5 = (a6 + hashCode) * 31;
            Properties properties = this.properties;
            if (properties != null) {
                i4 = properties.hashCode();
            }
            return i5 + i4;
        }

        public final String toString() {
            String str = this.timestamp;
            String str2 = this.paymentSessionId;
            String str3 = this.entityId;
            String str4 = this.processingChannelId;
            String str5 = this.mobileSessionId;
            DeviceData deviceData = this.deviceData;
            String str6 = this.version;
            String str7 = this.message;
            String str8 = this.level;
            ErrorDetails errorDetails = this.error;
            Properties properties = this.properties;
            StringBuilder india = q.india("LogEvent(timestamp=", str, ", paymentSessionId=", str2, ", entityId=");
            c.azure(india, str3, ", processingChannelId=", str4, ", mobileSessionId=");
            india.append(str5);
            india.append(", deviceData=");
            india.append(deviceData);
            india.append(", version=");
            c.azure(india, str6, ", message=", str7, ", level=");
            india.append(str8);
            india.append(", error=");
            india.append(errorDetails);
            india.append(", properties=");
            india.append(properties);
            india.append(")");
            return india.toString();
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJl\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0011R \u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b*\u0010(\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0011R \u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b.\u0010(\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u0011R \u0010\u0006\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b1\u0010(\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\u0011R \u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b4\u0010(\u0012\u0004\b6\u0010-\u001a\u0004\b5\u0010\u0011R \u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b:\u0010-\u001a\u0004\b9\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b<\u0010\u0011R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010(\u0012\u0004\b?\u0010-\u001a\u0004\b>\u0010\u0011R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\u001b¨\u0006C"}, d2 = {"Lcom/checkout/components/insight/data/dto/EventData$MetricEvent;", "Lcom/checkout/components/insight/data/dto/EventData;", "", "timestamp", "paymentSessionId", "entityId", "processingChannelId", "mobileSessionId", "Lcom/checkout/components/insight/data/dto/DeviceData;", "deviceData", "version", "metricType", "Lcom/checkout/components/insight/data/dto/Properties;", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/DeviceData;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/Properties;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/checkout/components/insight/data/dto/DeviceData;", "component7", "component8", "component9", "()Lcom/checkout/components/insight/data/dto/Properties;", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/DeviceData;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/Properties;)Lcom/checkout/components/insight/data/dto/EventData$MetricEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTimestamp", "b", "getPaymentSessionId", "getPaymentSessionId$annotations", "()V", "c", "getEntityId", "getEntityId$annotations", Constants.INAPP_DATA_TAG, "getProcessingChannelId", "getProcessingChannelId$annotations", "e", "getMobileSessionId", "getMobileSessionId$annotations", "f", "Lcom/checkout/components/insight/data/dto/DeviceData;", "getDeviceData", "getDeviceData$annotations", "g", "getVersion", "h", "getMetricType", "getMetricType$annotations", "i", "Lcom/checkout/components/insight/data/dto/Properties;", "getProperties", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class MetricEvent extends EventData {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String timestamp;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String paymentSessionId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String entityId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String processingChannelId;

        /* renamed from: e, reason: from kotlin metadata */
        private final String mobileSessionId;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final DeviceData deviceData;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final String version;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final String metricType;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final Properties properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MetricEvent(String timestamp, @Json(name = "payment_session_id") String paymentSessionId, @Json(name = "entity_id") String entityId, @Json(name = "processing_channel_id") String processingChannelId, @Json(name = "mobile_session_id") String mobileSessionId, @Json(name = "device_data") DeviceData deviceData, String version, @Json(name = "metric_type") String metricType, Properties properties) {
            super(null);
            Intrinsics.echo(timestamp, "timestamp");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            Intrinsics.echo(entityId, "entityId");
            Intrinsics.echo(processingChannelId, "processingChannelId");
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(deviceData, "deviceData");
            Intrinsics.echo(version, "version");
            Intrinsics.echo(metricType, "metricType");
            this.timestamp = timestamp;
            this.paymentSessionId = paymentSessionId;
            this.entityId = entityId;
            this.processingChannelId = processingChannelId;
            this.mobileSessionId = mobileSessionId;
            this.deviceData = deviceData;
            this.version = version;
            this.metricType = metricType;
            this.properties = properties;
        }

        public static /* synthetic */ MetricEvent copy$default(MetricEvent metricEvent, String str, String str2, String str3, String str4, String str5, DeviceData deviceData, String str6, String str7, Properties properties, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = metricEvent.timestamp;
            }
            if ((i4 & 2) != 0) {
                str2 = metricEvent.paymentSessionId;
            }
            if ((i4 & 4) != 0) {
                str3 = metricEvent.entityId;
            }
            if ((i4 & 8) != 0) {
                str4 = metricEvent.processingChannelId;
            }
            if ((i4 & 16) != 0) {
                str5 = metricEvent.mobileSessionId;
            }
            if ((i4 & 32) != 0) {
                deviceData = metricEvent.deviceData;
            }
            if ((i4 & 64) != 0) {
                str6 = metricEvent.version;
            }
            if ((i4 & 128) != 0) {
                str7 = metricEvent.metricType;
            }
            if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
                properties = metricEvent.properties;
            }
            String str8 = str7;
            Properties properties2 = properties;
            DeviceData deviceData2 = deviceData;
            String str9 = str6;
            String str10 = str5;
            String str11 = str3;
            return metricEvent.copy(str, str2, str11, str4, str10, deviceData2, str9, str8, properties2);
        }

        @Json(name = "device_data")
        public static /* synthetic */ void getDeviceData$annotations() {
        }

        @Json(name = "entity_id")
        public static /* synthetic */ void getEntityId$annotations() {
        }

        @Json(name = "metric_type")
        public static /* synthetic */ void getMetricType$annotations() {
        }

        @Json(name = "mobile_session_id")
        public static /* synthetic */ void getMobileSessionId$annotations() {
        }

        @Json(name = "payment_session_id")
        public static /* synthetic */ void getPaymentSessionId$annotations() {
        }

        @Json(name = "processing_channel_id")
        public static /* synthetic */ void getProcessingChannelId$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEntityId() {
            return this.entityId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getProcessingChannelId() {
            return this.processingChannelId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getMobileSessionId() {
            return this.mobileSessionId;
        }

        /* renamed from: component6, reason: from getter */
        public final DeviceData getDeviceData() {
            return this.deviceData;
        }

        /* renamed from: component7, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component8, reason: from getter */
        public final String getMetricType() {
            return this.metricType;
        }

        /* renamed from: component9, reason: from getter */
        public final Properties getProperties() {
            return this.properties;
        }

        public final MetricEvent copy(String timestamp, @Json(name = "payment_session_id") String paymentSessionId, @Json(name = "entity_id") String entityId, @Json(name = "processing_channel_id") String processingChannelId, @Json(name = "mobile_session_id") String mobileSessionId, @Json(name = "device_data") DeviceData deviceData, String version, @Json(name = "metric_type") String metricType, Properties properties) {
            Intrinsics.echo(timestamp, "timestamp");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            Intrinsics.echo(entityId, "entityId");
            Intrinsics.echo(processingChannelId, "processingChannelId");
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(deviceData, "deviceData");
            Intrinsics.echo(version, "version");
            Intrinsics.echo(metricType, "metricType");
            return new MetricEvent(timestamp, paymentSessionId, entityId, processingChannelId, mobileSessionId, deviceData, version, metricType, properties);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MetricEvent)) {
                return false;
            }
            MetricEvent metricEvent = (MetricEvent) other;
            return Intrinsics.areEqual(this.timestamp, metricEvent.timestamp) && Intrinsics.areEqual(this.paymentSessionId, metricEvent.paymentSessionId) && Intrinsics.areEqual(this.entityId, metricEvent.entityId) && Intrinsics.areEqual(this.processingChannelId, metricEvent.processingChannelId) && Intrinsics.areEqual(this.mobileSessionId, metricEvent.mobileSessionId) && Intrinsics.areEqual(this.deviceData, metricEvent.deviceData) && Intrinsics.areEqual(this.version, metricEvent.version) && Intrinsics.areEqual(this.metricType, metricEvent.metricType) && Intrinsics.areEqual(this.properties, metricEvent.properties);
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final DeviceData getDeviceData() {
            return this.deviceData;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getEntityId() {
            return this.entityId;
        }

        public final String getMetricType() {
            return this.metricType;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getProcessingChannelId() {
            return this.processingChannelId;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final Properties getProperties() {
            return this.properties;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getTimestamp() {
            return this.timestamp;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getVersion() {
            return this.version;
        }

        public final int hashCode() {
            int hashCode;
            int a6 = a.a(this.metricType, a.a(this.version, (this.deviceData.hashCode() + a.a(this.mobileSessionId, a.a(this.processingChannelId, a.a(this.entityId, a.a(this.paymentSessionId, this.timestamp.hashCode() * 31, 31), 31), 31), 31)) * 31, 31), 31);
            Properties properties = this.properties;
            if (properties == null) {
                hashCode = 0;
            } else {
                hashCode = properties.hashCode();
            }
            return a6 + hashCode;
        }

        public final String toString() {
            String str = this.timestamp;
            String str2 = this.paymentSessionId;
            String str3 = this.entityId;
            String str4 = this.processingChannelId;
            String str5 = this.mobileSessionId;
            DeviceData deviceData = this.deviceData;
            String str6 = this.version;
            String str7 = this.metricType;
            Properties properties = this.properties;
            StringBuilder india = q.india("MetricEvent(timestamp=", str, ", paymentSessionId=", str2, ", entityId=");
            c.azure(india, str3, ", processingChannelId=", str4, ", mobileSessionId=");
            india.append(str5);
            india.append(", deviceData=");
            india.append(deviceData);
            india.append(", version=");
            c.azure(india, str6, ", metricType=", str7, ", properties=");
            india.append(properties);
            india.append(")");
            return india.toString();
        }
    }

    public EventData(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract DeviceData getDeviceData();

    public abstract String getEntityId();

    public abstract String getMobileSessionId();

    public abstract String getPaymentSessionId();

    public abstract String getProcessingChannelId();

    public abstract Properties getProperties();

    public abstract String getTimestamp();

    public abstract String getVersion();

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJl\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0011R \u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b*\u0010(\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0011R \u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b.\u0010(\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u0011R \u0010\u0006\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b1\u0010(\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\u0011R \u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b4\u0010(\u0012\u0004\b6\u0010-\u001a\u0004\b5\u0010\u0011R \u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b:\u0010-\u001a\u0004\b9\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b<\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010(\u001a\u0004\b>\u0010\u0011R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u001b¨\u0006B"}, d2 = {"Lcom/checkout/components/insight/data/dto/EventData$ProductEvent;", "Lcom/checkout/components/insight/data/dto/EventData;", "", "timestamp", "paymentSessionId", "entityId", "processingChannelId", "mobileSessionId", "Lcom/checkout/components/insight/data/dto/DeviceData;", "deviceData", "version", com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM, "Lcom/checkout/components/insight/data/dto/Properties;", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/DeviceData;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/Properties;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/checkout/components/insight/data/dto/DeviceData;", "component7", "component8", "component9", "()Lcom/checkout/components/insight/data/dto/Properties;", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/DeviceData;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/Properties;)Lcom/checkout/components/insight/data/dto/EventData$ProductEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTimestamp", "b", "getPaymentSessionId", "getPaymentSessionId$annotations", "()V", "c", "getEntityId", "getEntityId$annotations", Constants.INAPP_DATA_TAG, "getProcessingChannelId", "getProcessingChannelId$annotations", "e", "getMobileSessionId", "getMobileSessionId$annotations", "f", "Lcom/checkout/components/insight/data/dto/DeviceData;", "getDeviceData", "getDeviceData$annotations", "g", "getVersion", "h", "getEvent", "i", "Lcom/checkout/components/insight/data/dto/Properties;", "getProperties", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ProductEvent extends EventData {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String timestamp;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String paymentSessionId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String entityId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String processingChannelId;

        /* renamed from: e, reason: from kotlin metadata */
        private final String mobileSessionId;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final DeviceData deviceData;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final String version;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final String event;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final Properties properties;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ ProductEvent(String str, String str2, String str3, String str4, String str5, DeviceData deviceData, String str6, String str7, Properties properties, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, deviceData, str6, str7, r11);
            Properties properties2;
            if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
                properties2 = new Properties(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
            } else {
                properties2 = properties;
            }
        }

        public static /* synthetic */ ProductEvent copy$default(ProductEvent productEvent, String str, String str2, String str3, String str4, String str5, DeviceData deviceData, String str6, String str7, Properties properties, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = productEvent.timestamp;
            }
            if ((i4 & 2) != 0) {
                str2 = productEvent.paymentSessionId;
            }
            if ((i4 & 4) != 0) {
                str3 = productEvent.entityId;
            }
            if ((i4 & 8) != 0) {
                str4 = productEvent.processingChannelId;
            }
            if ((i4 & 16) != 0) {
                str5 = productEvent.mobileSessionId;
            }
            if ((i4 & 32) != 0) {
                deviceData = productEvent.deviceData;
            }
            if ((i4 & 64) != 0) {
                str6 = productEvent.version;
            }
            if ((i4 & 128) != 0) {
                str7 = productEvent.event;
            }
            if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
                properties = productEvent.properties;
            }
            String str8 = str7;
            Properties properties2 = properties;
            DeviceData deviceData2 = deviceData;
            String str9 = str6;
            String str10 = str5;
            String str11 = str3;
            return productEvent.copy(str, str2, str11, str4, str10, deviceData2, str9, str8, properties2);
        }

        @Json(name = "device_data")
        public static /* synthetic */ void getDeviceData$annotations() {
        }

        @Json(name = "entity_id")
        public static /* synthetic */ void getEntityId$annotations() {
        }

        @Json(name = "mobile_session_id")
        public static /* synthetic */ void getMobileSessionId$annotations() {
        }

        @Json(name = "payment_session_id")
        public static /* synthetic */ void getPaymentSessionId$annotations() {
        }

        @Json(name = "processing_channel_id")
        public static /* synthetic */ void getProcessingChannelId$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEntityId() {
            return this.entityId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getProcessingChannelId() {
            return this.processingChannelId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getMobileSessionId() {
            return this.mobileSessionId;
        }

        /* renamed from: component6, reason: from getter */
        public final DeviceData getDeviceData() {
            return this.deviceData;
        }

        /* renamed from: component7, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component8, reason: from getter */
        public final String getEvent() {
            return this.event;
        }

        /* renamed from: component9, reason: from getter */
        public final Properties getProperties() {
            return this.properties;
        }

        public final ProductEvent copy(String timestamp, @Json(name = "payment_session_id") String paymentSessionId, @Json(name = "entity_id") String entityId, @Json(name = "processing_channel_id") String processingChannelId, @Json(name = "mobile_session_id") String mobileSessionId, @Json(name = "device_data") DeviceData deviceData, String version, String event, Properties properties) {
            Intrinsics.echo(timestamp, "timestamp");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            Intrinsics.echo(entityId, "entityId");
            Intrinsics.echo(processingChannelId, "processingChannelId");
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(deviceData, "deviceData");
            Intrinsics.echo(version, "version");
            Intrinsics.echo(event, "event");
            return new ProductEvent(timestamp, paymentSessionId, entityId, processingChannelId, mobileSessionId, deviceData, version, event, properties);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductEvent)) {
                return false;
            }
            ProductEvent productEvent = (ProductEvent) other;
            return Intrinsics.areEqual(this.timestamp, productEvent.timestamp) && Intrinsics.areEqual(this.paymentSessionId, productEvent.paymentSessionId) && Intrinsics.areEqual(this.entityId, productEvent.entityId) && Intrinsics.areEqual(this.processingChannelId, productEvent.processingChannelId) && Intrinsics.areEqual(this.mobileSessionId, productEvent.mobileSessionId) && Intrinsics.areEqual(this.deviceData, productEvent.deviceData) && Intrinsics.areEqual(this.version, productEvent.version) && Intrinsics.areEqual(this.event, productEvent.event) && Intrinsics.areEqual(this.properties, productEvent.properties);
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final DeviceData getDeviceData() {
            return this.deviceData;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getEntityId() {
            return this.entityId;
        }

        public final String getEvent() {
            return this.event;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getProcessingChannelId() {
            return this.processingChannelId;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final Properties getProperties() {
            return this.properties;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getTimestamp() {
            return this.timestamp;
        }

        @Override // com.checkout.components.insight.data.dto.EventData
        public final String getVersion() {
            return this.version;
        }

        public final int hashCode() {
            int hashCode;
            int a6 = a.a(this.event, a.a(this.version, (this.deviceData.hashCode() + a.a(this.mobileSessionId, a.a(this.processingChannelId, a.a(this.entityId, a.a(this.paymentSessionId, this.timestamp.hashCode() * 31, 31), 31), 31), 31)) * 31, 31), 31);
            Properties properties = this.properties;
            if (properties == null) {
                hashCode = 0;
            } else {
                hashCode = properties.hashCode();
            }
            return a6 + hashCode;
        }

        public final String toString() {
            String str = this.timestamp;
            String str2 = this.paymentSessionId;
            String str3 = this.entityId;
            String str4 = this.processingChannelId;
            String str5 = this.mobileSessionId;
            DeviceData deviceData = this.deviceData;
            String str6 = this.version;
            String str7 = this.event;
            Properties properties = this.properties;
            StringBuilder india = q.india("ProductEvent(timestamp=", str, ", paymentSessionId=", str2, ", entityId=");
            c.azure(india, str3, ", processingChannelId=", str4, ", mobileSessionId=");
            india.append(str5);
            india.append(", deviceData=");
            india.append(deviceData);
            india.append(", version=");
            c.azure(india, str6, ", event=", str7, ", properties=");
            india.append(properties);
            india.append(")");
            return india.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductEvent(String timestamp, @Json(name = "payment_session_id") String paymentSessionId, @Json(name = "entity_id") String entityId, @Json(name = "processing_channel_id") String processingChannelId, @Json(name = "mobile_session_id") String mobileSessionId, @Json(name = "device_data") DeviceData deviceData, String version, String event, Properties properties) {
            super(null);
            Intrinsics.echo(timestamp, "timestamp");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            Intrinsics.echo(entityId, "entityId");
            Intrinsics.echo(processingChannelId, "processingChannelId");
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(deviceData, "deviceData");
            Intrinsics.echo(version, "version");
            Intrinsics.echo(event, "event");
            this.timestamp = timestamp;
            this.paymentSessionId = paymentSessionId;
            this.entityId = entityId;
            this.processingChannelId = processingChannelId;
            this.mobileSessionId = mobileSessionId;
            this.deviceData = deviceData;
            this.version = version;
            this.event = event;
            this.properties = properties;
        }
    }
}
