package com.checkout.components.insight.data.dto;

import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/insight/data/dto/AccessibilityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/insight/data/dto/Accessibility;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/insight/data/dto/Accessibility;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/insight/data/dto/Accessibility;)V", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccessibilityJsonAdapter extends JsonAdapter<Accessibility> {

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f5138a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f5139b;

    public AccessibilityJsonAdapter(Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("large_text");
        Intrinsics.delta(of2, "of(...)");
        this.f5138a = of2;
        JsonAdapter adapter = moshi.adapter(Boolean.TYPE, u.alpha, "largeText");
        Intrinsics.delta(adapter, "adapter(...)");
        this.f5139b = adapter;
    }

    public final String toString() {
        return j.india(35, "GeneratedJsonAdapter(Accessibility)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public final Accessibility fromJson(JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.f5138a);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0 && (bool = (Boolean) this.f5139b.fromJson(reader)) == null) {
                throw Util.unexpectedNull("largeText", "large_text", reader);
            }
        }
        reader.endObject();
        if (bool != null) {
            return new Accessibility(bool.booleanValue());
        }
        throw Util.missingProperty("largeText", "large_text", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter writer, Accessibility value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("large_text");
            this.f5139b.toJson(writer, (JsonWriter) Boolean.valueOf(value_.getLargeText()));
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
