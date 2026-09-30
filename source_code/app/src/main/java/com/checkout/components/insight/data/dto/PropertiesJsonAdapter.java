package com.checkout.components.insight.data.dto;

import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/insight/data/dto/PropertiesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/insight/data/dto/Properties;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/insight/data/dto/Properties;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/insight/data/dto/Properties;)V", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PropertiesJsonAdapter extends JsonAdapter<Properties> {

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f5213a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f5214b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f5215c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f5216d;
    private final JsonAdapter e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Constructor f5217f;

    public PropertiesJsonAdapter(Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("react_native", "appearance", "component_callbacks", "locale", "translations", "feature_flags_enabled", "experiments", "integration_domain", Constants.KEY_URL, "method", "component_name", "payment_method_name", "action_type", "renderer", "payment_id", "result", "name");
        Intrinsics.delta(of2, "of(...)");
        this.f5213a = of2;
        u uVar = u.alpha;
        JsonAdapter adapter = moshi.adapter(ReactNativeInsightProperties.class, uVar, "reactNative");
        Intrinsics.delta(adapter, "adapter(...)");
        this.f5214b = adapter;
        JsonAdapter adapter2 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class), uVar, "appearance");
        Intrinsics.delta(adapter2, "adapter(...)");
        this.f5215c = adapter2;
        JsonAdapter adapter3 = moshi.adapter(String.class, uVar, "locale");
        Intrinsics.delta(adapter3, "adapter(...)");
        this.f5216d = adapter3;
        JsonAdapter adapter4 = moshi.adapter(Types.newParameterizedType(List.class, String.class), uVar, "featureFlagsEnabled");
        Intrinsics.delta(adapter4, "adapter(...)");
        this.e = adapter4;
    }

    public final String toString() {
        return j.india(32, "GeneratedJsonAdapter(Properties)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public final Properties fromJson(JsonReader reader) {
        int i4;
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        int i5 = -1;
        ReactNativeInsightProperties reactNativeInsightProperties = null;
        Map map = null;
        Map map2 = null;
        String str = null;
        Map map3 = null;
        List list = null;
        Map map4 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.f5213a)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    continue;
                case 0:
                    i4 = -2;
                    reactNativeInsightProperties = (ReactNativeInsightProperties) this.f5214b.fromJson(reader);
                    break;
                case 1:
                    i4 = -3;
                    map = (Map) this.f5215c.fromJson(reader);
                    break;
                case 2:
                    i4 = -5;
                    map2 = (Map) this.f5215c.fromJson(reader);
                    break;
                case 3:
                    i4 = -9;
                    str = (String) this.f5216d.fromJson(reader);
                    break;
                case 4:
                    i4 = -17;
                    map3 = (Map) this.f5215c.fromJson(reader);
                    break;
                case 5:
                    i4 = -33;
                    list = (List) this.e.fromJson(reader);
                    break;
                case 6:
                    i4 = -65;
                    map4 = (Map) this.f5215c.fromJson(reader);
                    break;
                case 7:
                    i4 = -129;
                    str2 = (String) this.f5216d.fromJson(reader);
                    break;
                case 8:
                    i4 = -257;
                    str3 = (String) this.f5216d.fromJson(reader);
                    break;
                case 9:
                    i4 = -513;
                    str4 = (String) this.f5216d.fromJson(reader);
                    break;
                case 10:
                    i4 = -1025;
                    str5 = (String) this.f5216d.fromJson(reader);
                    break;
                case 11:
                    i4 = -2049;
                    str6 = (String) this.f5216d.fromJson(reader);
                    break;
                case 12:
                    i4 = -4097;
                    str7 = (String) this.f5216d.fromJson(reader);
                    break;
                case 13:
                    i4 = -8193;
                    str8 = (String) this.f5216d.fromJson(reader);
                    break;
                case 14:
                    i4 = -16385;
                    str9 = (String) this.f5216d.fromJson(reader);
                    break;
                case 15:
                    i4 = -32769;
                    str10 = (String) this.f5216d.fromJson(reader);
                    break;
                case 16:
                    i4 = -65537;
                    str11 = (String) this.f5216d.fromJson(reader);
                    break;
            }
            i5 &= i4;
        }
        reader.endObject();
        if (i5 == -131072) {
            return new Properties(reactNativeInsightProperties, map, map2, str, map3, list, map4, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
        }
        Constructor constructor = this.f5217f;
        if (constructor == null) {
            constructor = Properties.class.getDeclaredConstructor(ReactNativeInsightProperties.class, Map.class, Map.class, String.class, Map.class, List.class, Map.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.f5217f = constructor;
            Intrinsics.delta(constructor, "also(...)");
        }
        Object newInstance = constructor.newInstance(reactNativeInsightProperties, map, map2, str, map3, list, map4, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, Integer.valueOf(i5), null);
        Intrinsics.delta(newInstance, "newInstance(...)");
        return (Properties) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter writer, Properties value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("react_native");
            this.f5214b.toJson(writer, (JsonWriter) value_.getReactNative());
            writer.name("appearance");
            this.f5215c.toJson(writer, (JsonWriter) value_.getAppearance());
            writer.name("component_callbacks");
            this.f5215c.toJson(writer, (JsonWriter) value_.getComponentCallbacks());
            writer.name("locale");
            this.f5216d.toJson(writer, (JsonWriter) value_.getLocale());
            writer.name("translations");
            this.f5215c.toJson(writer, (JsonWriter) value_.getTranslations());
            writer.name("feature_flags_enabled");
            this.e.toJson(writer, (JsonWriter) value_.getFeatureFlagsEnabled());
            writer.name("experiments");
            this.f5215c.toJson(writer, (JsonWriter) value_.getExperiments());
            writer.name("integration_domain");
            this.f5216d.toJson(writer, (JsonWriter) value_.getIntegrationDomain());
            writer.name(Constants.KEY_URL);
            this.f5216d.toJson(writer, (JsonWriter) value_.getUrl());
            writer.name("method");
            this.f5216d.toJson(writer, (JsonWriter) value_.getMethod());
            writer.name("component_name");
            this.f5216d.toJson(writer, (JsonWriter) value_.getComponentName());
            writer.name("payment_method_name");
            this.f5216d.toJson(writer, (JsonWriter) value_.getPaymentMethodName());
            writer.name("action_type");
            this.f5216d.toJson(writer, (JsonWriter) value_.getActionType());
            writer.name("renderer");
            this.f5216d.toJson(writer, (JsonWriter) value_.getRenderer());
            writer.name("payment_id");
            this.f5216d.toJson(writer, (JsonWriter) value_.getPaymentId());
            writer.name("result");
            this.f5216d.toJson(writer, (JsonWriter) value_.getResult());
            writer.name("name");
            this.f5216d.toJson(writer, (JsonWriter) value_.getName());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
