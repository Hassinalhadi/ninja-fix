package com.checkout.components.insight.data.dto;

import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/insight/data/dto/ErrorDetailsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/insight/data/dto/ErrorDetails;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/insight/data/dto/ErrorDetails;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/insight/data/dto/ErrorDetails;)V", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorDetailsJsonAdapter extends JsonAdapter<ErrorDetails> {

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f5153a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f5154b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f5155c;

    public ErrorDetailsJsonAdapter(Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("name", Constants.KEY_MESSAGE, "stack");
        Intrinsics.delta(of2, "of(...)");
        this.f5153a = of2;
        u uVar = u.alpha;
        JsonAdapter adapter = moshi.adapter(String.class, uVar, "name");
        Intrinsics.delta(adapter, "adapter(...)");
        this.f5154b = adapter;
        JsonAdapter adapter2 = moshi.adapter(String.class, uVar, "stack");
        Intrinsics.delta(adapter2, "adapter(...)");
        this.f5155c = adapter2;
    }

    public final String toString() {
        return j.india(34, "GeneratedJsonAdapter(ErrorDetails)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public final ErrorDetails fromJson(JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.f5153a);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.f5154b.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull("name", "name", reader);
                }
            } else if (selectName == 1) {
                str2 = (String) this.f5154b.fromJson(reader);
                if (str2 == null) {
                    throw Util.unexpectedNull(Constants.KEY_MESSAGE, Constants.KEY_MESSAGE, reader);
                }
            } else if (selectName == 2) {
                str3 = (String) this.f5155c.fromJson(reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        if (str2 != null) {
            return new ErrorDetails(str, str2, str3);
        }
        throw Util.missingProperty(Constants.KEY_MESSAGE, Constants.KEY_MESSAGE, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter writer, ErrorDetails value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("name");
            this.f5154b.toJson(writer, (JsonWriter) value_.getName());
            writer.name(Constants.KEY_MESSAGE);
            this.f5154b.toJson(writer, (JsonWriter) value_.getMessage());
            writer.name("stack");
            this.f5155c.toJson(writer, (JsonWriter) value_.getStack());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
