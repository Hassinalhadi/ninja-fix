package com.checkout.components.core.network.model.request;

import com.checkout.components.core.B;
import com.checkout.components.core.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/core/network/model/request/RedirectContextJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/core/network/model/request/RedirectContext;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/core/network/model/request/RedirectContext;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/core/network/model/request/RedirectContext;)V", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectContextJsonAdapter extends JsonAdapter<RedirectContext> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f4904a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f4905b;

    public RedirectContextJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("scheme", "host", "app_identifier");
        Intrinsics.delta(of2, "of(...)");
        this.f4904a = of2;
        this.f4905b = C.a(moshi, String.class, "scheme", "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return B.a(37, "GeneratedJsonAdapter(RedirectContext)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final RedirectContext fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.f4904a);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.f4905b.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull("scheme", "scheme", reader);
                }
            } else if (selectName == 1) {
                str2 = (String) this.f4905b.fromJson(reader);
                if (str2 == null) {
                    throw Util.unexpectedNull("host", "host", reader);
                }
            } else if (selectName == 2 && (str3 = (String) this.f4905b.fromJson(reader)) == null) {
                throw Util.unexpectedNull("appIdentifier", "app_identifier", reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw Util.missingProperty("scheme", "scheme", reader);
        }
        if (str2 == null) {
            throw Util.missingProperty("host", "host", reader);
        }
        if (str3 != null) {
            return new RedirectContext(str, str2, str3);
        }
        throw Util.missingProperty("appIdentifier", "app_identifier", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable RedirectContext value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("scheme");
            this.f4905b.toJson(writer, (JsonWriter) value_.getScheme());
            writer.name("host");
            this.f4905b.toJson(writer, (JsonWriter) value_.getHost());
            writer.name("app_identifier");
            this.f4905b.toJson(writer, (JsonWriter) value_.getAppIdentifier());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
