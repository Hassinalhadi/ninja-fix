package com.checkout.components.insight.data.dto;

import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/insight/data/dto/ReactNativeInsightPropertiesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/insight/data/dto/ReactNativeInsightProperties;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/insight/data/dto/ReactNativeInsightProperties;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/insight/data/dto/ReactNativeInsightProperties;)V", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReactNativeInsightPropertiesJsonAdapter extends JsonAdapter<ReactNativeInsightProperties> {

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f5221a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f5222b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Constructor f5223c;

    public ReactNativeInsightPropertiesJsonAdapter(Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("version", "arch", "engine");
        Intrinsics.delta(of2, "of(...)");
        this.f5221a = of2;
        JsonAdapter adapter = moshi.adapter(String.class, u.alpha, "version");
        Intrinsics.delta(adapter, "adapter(...)");
        this.f5222b = adapter;
    }

    public final String toString() {
        return j.india(50, "GeneratedJsonAdapter(ReactNativeInsightProperties)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public final ReactNativeInsightProperties fromJson(JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        int i4 = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.f5221a);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.f5222b.fromJson(reader);
                i4 &= -2;
            } else if (selectName == 1) {
                str2 = (String) this.f5222b.fromJson(reader);
                i4 &= -3;
            } else if (selectName == 2) {
                str3 = (String) this.f5222b.fromJson(reader);
                i4 &= -5;
            }
        }
        reader.endObject();
        if (i4 == -8) {
            return new ReactNativeInsightProperties(str, str2, str3);
        }
        Constructor constructor = this.f5223c;
        if (constructor == null) {
            constructor = ReactNativeInsightProperties.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.f5223c = constructor;
            Intrinsics.delta(constructor, "also(...)");
        }
        Object newInstance = constructor.newInstance(str, str2, str3, Integer.valueOf(i4), null);
        Intrinsics.delta(newInstance, "newInstance(...)");
        return (ReactNativeInsightProperties) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter writer, ReactNativeInsightProperties value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("version");
            this.f5222b.toJson(writer, (JsonWriter) value_.getVersion());
            writer.name("arch");
            this.f5222b.toJson(writer, (JsonWriter) value_.getArch());
            writer.name("engine");
            this.f5222b.toJson(writer, (JsonWriter) value_.getEngine());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
