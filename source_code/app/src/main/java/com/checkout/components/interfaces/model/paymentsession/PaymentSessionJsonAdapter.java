package com.checkout.components.interfaces.model.paymentsession;

import com.checkout.components.interfaces.a;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/model/paymentsession/PaymentSessionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;)V", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentSessionJsonAdapter extends JsonAdapter<PaymentSession> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f5545a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f5546b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f5547c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f5548d;
    private final JsonAdapter e;

    /* renamed from: f, reason: collision with root package name */
    private final JsonAdapter f5549f;

    /* renamed from: g, reason: collision with root package name */
    private final JsonAdapter f5550g;

    /* renamed from: h, reason: collision with root package name */
    private final JsonAdapter f5551h;

    public PaymentSessionJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of(Constants.KEY_ID, "entity_id", "processing_channel_id", "amount", "locale", "currency", "payment_methods", "feature_flags", "experiments", "risk", Constants.KEY_LINKS);
        Intrinsics.delta(of2, "of(...)");
        this.f5545a = of2;
        this.f5546b = a.a(moshi, String.class, Constants.KEY_ID, "adapter(...)");
        this.f5547c = a.a(moshi, Integer.TYPE, "amount", "adapter(...)");
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, PaymentMethod.class);
        u uVar = u.alpha;
        JsonAdapter adapter = moshi.adapter(newParameterizedType, uVar, "paymentMethods");
        Intrinsics.delta(adapter, "adapter(...)");
        this.f5548d = adapter;
        JsonAdapter adapter2 = moshi.adapter(Types.newParameterizedType(List.class, String.class), uVar, "featureFlags");
        Intrinsics.delta(adapter2, "adapter(...)");
        this.e = adapter2;
        JsonAdapter adapter3 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, String.class), uVar, "experiments");
        Intrinsics.delta(adapter3, "adapter(...)");
        this.f5549f = adapter3;
        this.f5550g = a.a(moshi, Risk.class, "risk", "adapter(...)");
        this.f5551h = a.a(moshi, Links.class, Constants.KEY_LINKS, "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return j.india(36, "GeneratedJsonAdapter(PaymentSession)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0049. Please report as an issue. */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final PaymentSession fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        List list2 = null;
        Map map = null;
        Risk risk = null;
        Links links = null;
        while (true) {
            Integer num2 = num;
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            String str9 = str4;
            String str10 = str5;
            List list3 = list;
            if (reader.hasNext()) {
                List list4 = list2;
                switch (reader.selectName(this.f5545a)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        num = num2;
                        list2 = list4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        str4 = str9;
                        str5 = str10;
                        list = list3;
                    case 0:
                        str = (String) this.f5546b.fromJson(reader);
                        if (str == null) {
                            throw Util.unexpectedNull(Constants.KEY_ID, Constants.KEY_ID, reader);
                        }
                        num = num2;
                        list2 = list4;
                        str2 = str7;
                        str3 = str8;
                        str4 = str9;
                        str5 = str10;
                        list = list3;
                    case 1:
                        str2 = (String) this.f5546b.fromJson(reader);
                        if (str2 == null) {
                            throw Util.unexpectedNull("entityId", "entity_id", reader);
                        }
                        num = num2;
                        list2 = list4;
                        str = str6;
                        str3 = str8;
                        str4 = str9;
                        str5 = str10;
                        list = list3;
                    case 2:
                        str3 = (String) this.f5546b.fromJson(reader);
                        if (str3 == null) {
                            throw Util.unexpectedNull("processingChannelId", "processing_channel_id", reader);
                        }
                        num = num2;
                        list2 = list4;
                        str = str6;
                        str2 = str7;
                        str4 = str9;
                        str5 = str10;
                        list = list3;
                    case 3:
                        num = (Integer) this.f5547c.fromJson(reader);
                        if (num == null) {
                            throw Util.unexpectedNull("amount", "amount", reader);
                        }
                        list2 = list4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        str4 = str9;
                        str5 = str10;
                        list = list3;
                    case 4:
                        str4 = (String) this.f5546b.fromJson(reader);
                        if (str4 == null) {
                            throw Util.unexpectedNull("locale", "locale", reader);
                        }
                        num = num2;
                        list2 = list4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        str5 = str10;
                        list = list3;
                    case 5:
                        str5 = (String) this.f5546b.fromJson(reader);
                        if (str5 == null) {
                            throw Util.unexpectedNull("currency", "currency", reader);
                        }
                        num = num2;
                        list2 = list4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        str4 = str9;
                        list = list3;
                    case 6:
                        list = (List) this.f5548d.fromJson(reader);
                        if (list == null) {
                            throw Util.unexpectedNull("paymentMethods", "payment_methods", reader);
                        }
                        num = num2;
                        list2 = list4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        str4 = str9;
                        str5 = str10;
                    case 7:
                        list2 = (List) this.e.fromJson(reader);
                        num = num2;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        str4 = str9;
                        str5 = str10;
                        list = list3;
                    case 8:
                        map = (Map) this.f5549f.fromJson(reader);
                        num = num2;
                        list2 = list4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        str4 = str9;
                        str5 = str10;
                        list = list3;
                    case 9:
                        risk = (Risk) this.f5550g.fromJson(reader);
                        num = num2;
                        list2 = list4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        str4 = str9;
                        str5 = str10;
                        list = list3;
                    case 10:
                        links = (Links) this.f5551h.fromJson(reader);
                        num = num2;
                        list2 = list4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        str4 = str9;
                        str5 = str10;
                        list = list3;
                    default:
                        num = num2;
                        list2 = list4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        str4 = str9;
                        str5 = str10;
                        list = list3;
                }
            } else {
                List list5 = list2;
                reader.endObject();
                if (str6 == null) {
                    throw Util.missingProperty(Constants.KEY_ID, Constants.KEY_ID, reader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("entityId", "entity_id", reader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("processingChannelId", "processing_channel_id", reader);
                }
                if (num2 != null) {
                    int intValue = num2.intValue();
                    if (str9 == null) {
                        throw Util.missingProperty("locale", "locale", reader);
                    }
                    if (str10 == null) {
                        throw Util.missingProperty("currency", "currency", reader);
                    }
                    if (list3 != null) {
                        return new PaymentSession(str6, str7, str8, intValue, str9, str10, list3, list5, map, risk, links);
                    }
                    throw Util.missingProperty("paymentMethods", "payment_methods", reader);
                }
                throw Util.missingProperty("amount", "amount", reader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable PaymentSession value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name(Constants.KEY_ID);
            this.f5546b.toJson(writer, (JsonWriter) value_.getId());
            writer.name("entity_id");
            this.f5546b.toJson(writer, (JsonWriter) value_.getEntityId());
            writer.name("processing_channel_id");
            this.f5546b.toJson(writer, (JsonWriter) value_.getProcessingChannelId());
            writer.name("amount");
            this.f5547c.toJson(writer, (JsonWriter) Integer.valueOf(value_.getAmount()));
            writer.name("locale");
            this.f5546b.toJson(writer, (JsonWriter) value_.getLocale());
            writer.name("currency");
            this.f5546b.toJson(writer, (JsonWriter) value_.getCurrency());
            writer.name("payment_methods");
            this.f5548d.toJson(writer, (JsonWriter) value_.getPaymentMethods());
            writer.name("feature_flags");
            this.e.toJson(writer, (JsonWriter) value_.getFeatureFlags());
            writer.name("experiments");
            this.f5549f.toJson(writer, (JsonWriter) value_.getExperiments());
            writer.name("risk");
            this.f5550g.toJson(writer, (JsonWriter) value_.getRisk());
            writer.name(Constants.KEY_LINKS);
            this.f5551h.toJson(writer, (JsonWriter) value_.getLinks());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
