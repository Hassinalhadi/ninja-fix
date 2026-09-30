package com.checkout.components.card.operations.network.model;

import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/card/operations/network/model/ErrorResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/card/operations/network/model/ErrorResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/card/operations/network/model/ErrorResponse;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/card/operations/network/model/ErrorResponse;)V", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorResponseJsonAdapter extends JsonAdapter<ErrorResponse> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f4305a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f4306b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f4307c;

    public ErrorResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("request_id", "error_type", "error_codes");
        Intrinsics.delta(of2, "of(...)");
        this.f4305a = of2;
        u uVar = u.alpha;
        JsonAdapter adapter = moshi.adapter(String.class, uVar, "requestId");
        Intrinsics.delta(adapter, "adapter(...)");
        this.f4306b = adapter;
        JsonAdapter adapter2 = moshi.adapter(Types.newParameterizedType(List.class, String.class), uVar, "errorCodes");
        Intrinsics.delta(adapter2, "adapter(...)");
        this.f4307c = adapter2;
    }

    @NotNull
    public final String toString() {
        return j.india(35, "GeneratedJsonAdapter(ErrorResponse)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final ErrorResponse fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        List list = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.f4305a);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.f4306b.fromJson(reader);
            } else if (selectName == 1) {
                str2 = (String) this.f4306b.fromJson(reader);
            } else if (selectName == 2) {
                list = (List) this.f4307c.fromJson(reader);
            }
        }
        reader.endObject();
        return new ErrorResponse(str, str2, list);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable ErrorResponse value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("request_id");
            this.f4306b.toJson(writer, (JsonWriter) value_.getRequestId());
            writer.name("error_type");
            this.f4306b.toJson(writer, (JsonWriter) value_.getErrorType());
            writer.name("error_codes");
            this.f4307c.toJson(writer, (JsonWriter) value_.getErrorCodes());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
