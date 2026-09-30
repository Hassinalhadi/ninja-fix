package com.checkout.components.insight.data.dto;

import com.checkout.components.insight.data.dto.EventData;
import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/insight/data/dto/EventData_MetricEventJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/insight/data/dto/EventData$MetricEvent;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/insight/data/dto/EventData$MetricEvent;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/insight/data/dto/EventData$MetricEvent;)V", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EventData_MetricEventJsonAdapter extends JsonAdapter<EventData.MetricEvent> {

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f5186a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f5187b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f5188c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f5189d;

    public EventData_MetricEventJsonAdapter(Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("timestamp", "payment_session_id", "entity_id", "processing_channel_id", "mobile_session_id", "device_data", "version", "metric_type", "properties");
        Intrinsics.delta(of2, "of(...)");
        this.f5186a = of2;
        u uVar = u.alpha;
        JsonAdapter adapter = moshi.adapter(String.class, uVar, "timestamp");
        Intrinsics.delta(adapter, "adapter(...)");
        this.f5187b = adapter;
        JsonAdapter adapter2 = moshi.adapter(DeviceData.class, uVar, "deviceData");
        Intrinsics.delta(adapter2, "adapter(...)");
        this.f5188c = adapter2;
        JsonAdapter adapter3 = moshi.adapter(Properties.class, uVar, "properties");
        Intrinsics.delta(adapter3, "adapter(...)");
        this.f5189d = adapter3;
    }

    public final String toString() {
        return j.india(43, "GeneratedJsonAdapter(EventData.MetricEvent)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0055. Please report as an issue. */
    @Override // com.squareup.moshi.JsonAdapter
    public final EventData.MetricEvent fromJson(JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        DeviceData deviceData = null;
        String str6 = null;
        String str7 = null;
        Properties properties = null;
        while (true) {
            String str8 = str;
            String str9 = str2;
            String str10 = str3;
            String str11 = str4;
            String str12 = str5;
            DeviceData deviceData2 = deviceData;
            String str13 = str6;
            String str14 = str7;
            Properties properties2 = properties;
            if (reader.hasNext()) {
                switch (reader.selectName(this.f5186a)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                        str4 = str11;
                        str5 = str12;
                        deviceData = deviceData2;
                        str6 = str13;
                        str7 = str14;
                        properties = properties2;
                    case 0:
                        str = (String) this.f5187b.fromJson(reader);
                        if (str == null) {
                            throw Util.unexpectedNull("timestamp", "timestamp", reader);
                        }
                        str2 = str9;
                        str3 = str10;
                        str4 = str11;
                        str5 = str12;
                        deviceData = deviceData2;
                        str6 = str13;
                        str7 = str14;
                        properties = properties2;
                    case 1:
                        str2 = (String) this.f5187b.fromJson(reader);
                        if (str2 == null) {
                            throw Util.unexpectedNull("paymentSessionId", "payment_session_id", reader);
                        }
                        str = str8;
                        str3 = str10;
                        str4 = str11;
                        str5 = str12;
                        deviceData = deviceData2;
                        str6 = str13;
                        str7 = str14;
                        properties = properties2;
                    case 2:
                        str3 = (String) this.f5187b.fromJson(reader);
                        if (str3 == null) {
                            throw Util.unexpectedNull("entityId", "entity_id", reader);
                        }
                        str = str8;
                        str2 = str9;
                        str4 = str11;
                        str5 = str12;
                        deviceData = deviceData2;
                        str6 = str13;
                        str7 = str14;
                        properties = properties2;
                    case 3:
                        str4 = (String) this.f5187b.fromJson(reader);
                        if (str4 == null) {
                            throw Util.unexpectedNull("processingChannelId", "processing_channel_id", reader);
                        }
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                        str5 = str12;
                        deviceData = deviceData2;
                        str6 = str13;
                        str7 = str14;
                        properties = properties2;
                    case 4:
                        str5 = (String) this.f5187b.fromJson(reader);
                        if (str5 == null) {
                            throw Util.unexpectedNull("mobileSessionId", "mobile_session_id", reader);
                        }
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                        str4 = str11;
                        deviceData = deviceData2;
                        str6 = str13;
                        str7 = str14;
                        properties = properties2;
                    case 5:
                        deviceData = (DeviceData) this.f5188c.fromJson(reader);
                        if (deviceData == null) {
                            throw Util.unexpectedNull("deviceData", "device_data", reader);
                        }
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                        str4 = str11;
                        str5 = str12;
                        str6 = str13;
                        str7 = str14;
                        properties = properties2;
                    case 6:
                        str6 = (String) this.f5187b.fromJson(reader);
                        if (str6 == null) {
                            throw Util.unexpectedNull("version", "version", reader);
                        }
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                        str4 = str11;
                        str5 = str12;
                        deviceData = deviceData2;
                        str7 = str14;
                        properties = properties2;
                    case 7:
                        str7 = (String) this.f5187b.fromJson(reader);
                        if (str7 == null) {
                            throw Util.unexpectedNull("metricType", "metric_type", reader);
                        }
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                        str4 = str11;
                        str5 = str12;
                        deviceData = deviceData2;
                        str6 = str13;
                        properties = properties2;
                    case 8:
                        properties = (Properties) this.f5189d.fromJson(reader);
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                        str4 = str11;
                        str5 = str12;
                        deviceData = deviceData2;
                        str6 = str13;
                        str7 = str14;
                    default:
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                        str4 = str11;
                        str5 = str12;
                        deviceData = deviceData2;
                        str6 = str13;
                        str7 = str14;
                        properties = properties2;
                }
            } else {
                reader.endObject();
                if (str8 == null) {
                    throw Util.missingProperty("timestamp", "timestamp", reader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("paymentSessionId", "payment_session_id", reader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("entityId", "entity_id", reader);
                }
                if (str11 == null) {
                    throw Util.missingProperty("processingChannelId", "processing_channel_id", reader);
                }
                if (str12 == null) {
                    throw Util.missingProperty("mobileSessionId", "mobile_session_id", reader);
                }
                if (deviceData2 == null) {
                    throw Util.missingProperty("deviceData", "device_data", reader);
                }
                if (str13 == null) {
                    throw Util.missingProperty("version", "version", reader);
                }
                if (str14 != null) {
                    return new EventData.MetricEvent(str8, str9, str10, str11, str12, deviceData2, str13, str14, properties2);
                }
                throw Util.missingProperty("metricType", "metric_type", reader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter writer, EventData.MetricEvent value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("timestamp");
            this.f5187b.toJson(writer, (JsonWriter) value_.getTimestamp());
            writer.name("payment_session_id");
            this.f5187b.toJson(writer, (JsonWriter) value_.getPaymentSessionId());
            writer.name("entity_id");
            this.f5187b.toJson(writer, (JsonWriter) value_.getEntityId());
            writer.name("processing_channel_id");
            this.f5187b.toJson(writer, (JsonWriter) value_.getProcessingChannelId());
            writer.name("mobile_session_id");
            this.f5187b.toJson(writer, (JsonWriter) value_.getMobileSessionId());
            writer.name("device_data");
            this.f5188c.toJson(writer, (JsonWriter) value_.getDeviceData());
            writer.name("version");
            this.f5187b.toJson(writer, (JsonWriter) value_.getVersion());
            writer.name("metric_type");
            this.f5187b.toJson(writer, (JsonWriter) value_.getMetricType());
            writer.name("properties");
            this.f5189d.toJson(writer, (JsonWriter) value_.getProperties());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
