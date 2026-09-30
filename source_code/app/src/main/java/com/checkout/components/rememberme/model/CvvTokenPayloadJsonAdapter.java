package com.checkout.components.rememberme.model;

import com.checkout.components.rememberme.AbstractC0924a;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/rememberme/model/CvvTokenPayloadJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/rememberme/model/CvvTokenPayload;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/rememberme/model/CvvTokenPayload;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/rememberme/model/CvvTokenPayload;)V", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CvvTokenPayloadJsonAdapter extends JsonAdapter<CvvTokenPayload> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f6032a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f6033b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f6034c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Constructor f6035d;

    public CvvTokenPayloadJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("token_data", Constants.KEY_TYPE);
        Intrinsics.delta(of2, "of(...)");
        this.f6032a = of2;
        this.f6033b = AbstractC0924a.a(moshi, TokenData.class, "tokenData", "adapter(...)");
        this.f6034c = AbstractC0924a.a(moshi, String.class, Constants.KEY_TYPE, "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return j.india(37, "GeneratedJsonAdapter(CvvTokenPayload)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final CvvTokenPayload fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        TokenData tokenData = null;
        String str = null;
        int i4 = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.f6032a);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                tokenData = (TokenData) this.f6033b.fromJson(reader);
                if (tokenData == null) {
                    throw Util.unexpectedNull("tokenData", "token_data", reader);
                }
            } else if (selectName == 1) {
                str = (String) this.f6034c.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
                }
                i4 = -3;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i4 == -3) {
            if (tokenData != null) {
                Intrinsics.charlie(str, "null cannot be cast to non-null type kotlin.String");
                return new CvvTokenPayload(tokenData, str);
            }
            throw Util.missingProperty("tokenData", "token_data", reader);
        }
        Constructor constructor = this.f6035d;
        if (constructor == null) {
            constructor = CvvTokenPayload.class.getDeclaredConstructor(TokenData.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.f6035d = constructor;
            Intrinsics.delta(constructor, "also(...)");
        }
        if (tokenData != null) {
            Object newInstance = constructor.newInstance(tokenData, str, Integer.valueOf(i4), null);
            Intrinsics.delta(newInstance, "newInstance(...)");
            return (CvvTokenPayload) newInstance;
        }
        throw Util.missingProperty("tokenData", "token_data", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable CvvTokenPayload value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("token_data");
            this.f6033b.toJson(writer, (JsonWriter) value_.getTokenData());
            writer.name(Constants.KEY_TYPE);
            this.f6034c.toJson(writer, (JsonWriter) value_.getType());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
