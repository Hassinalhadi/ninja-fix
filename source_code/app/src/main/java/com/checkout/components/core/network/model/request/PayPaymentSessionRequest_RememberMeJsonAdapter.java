package com.checkout.components.core.network.model.request;

import com.checkout.components.core.B;
import com.checkout.components.core.C;
import com.checkout.components.core.network.model.request.PayPaymentSessionRequest;
import com.clevertap.android.sdk.Constants;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest_RememberMeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$RememberMe;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$RememberMe;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$RememberMe;)V", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayPaymentSessionRequest_RememberMeJsonAdapter extends JsonAdapter<PayPaymentSessionRequest.RememberMe> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f4891a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f4892b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f4893c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f4894d;
    private final JsonAdapter e;

    /* renamed from: f, reason: collision with root package name */
    private final JsonAdapter f4895f;

    /* renamed from: g, reason: collision with root package name */
    private final JsonAdapter f4896g;

    /* renamed from: h, reason: collision with root package name */
    private volatile Constructor f4897h;

    public PayPaymentSessionRequest_RememberMeJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("card_metadata", "processing", "session_metadata", "source", Constants.KEY_TYPE, "risk");
        Intrinsics.delta(of2, "of(...)");
        this.f4891a = of2;
        this.f4892b = C.a(moshi, CardMetadata.class, "cardMetadata", "adapter(...)");
        this.f4893c = C.a(moshi, Processing.class, "processing", "adapter(...)");
        this.f4894d = C.a(moshi, SessionMetaData.class, "sessionMetaData", "adapter(...)");
        this.e = C.a(moshi, RememberMeSource.class, "source", "adapter(...)");
        this.f4895f = C.a(moshi, String.class, Constants.KEY_TYPE, "adapter(...)");
        this.f4896g = C.a(moshi, Risk.class, "risk", "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return B.a(57, "GeneratedJsonAdapter(PayPaymentSessionRequest.RememberMe)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final PayPaymentSessionRequest.RememberMe fromJson(@NotNull JsonReader reader) {
        char c3;
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        int i4 = -1;
        String str = null;
        CardMetadata cardMetadata = null;
        Processing processing = null;
        SessionMetaData sessionMetaData = null;
        RememberMeSource rememberMeSource = null;
        Risk risk = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.f4891a)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    cardMetadata = (CardMetadata) this.f4892b.fromJson(reader);
                    break;
                case 1:
                    processing = (Processing) this.f4893c.fromJson(reader);
                    i4 &= -3;
                    break;
                case 2:
                    sessionMetaData = (SessionMetaData) this.f4894d.fromJson(reader);
                    if (sessionMetaData == null) {
                        throw Util.unexpectedNull("sessionMetaData", "session_metadata", reader);
                    }
                    break;
                case 3:
                    rememberMeSource = (RememberMeSource) this.e.fromJson(reader);
                    if (rememberMeSource == null) {
                        throw Util.unexpectedNull("source", "source", reader);
                    }
                    break;
                case 4:
                    str = (String) this.f4895f.fromJson(reader);
                    if (str == null) {
                        throw Util.unexpectedNull(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
                    }
                    i4 &= -17;
                    break;
                case 5:
                    risk = (Risk) this.f4896g.fromJson(reader);
                    i4 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i4 == -51) {
            if (sessionMetaData == null) {
                throw Util.missingProperty("sessionMetaData", "session_metadata", reader);
            }
            if (rememberMeSource != null) {
                Intrinsics.charlie(str, "null cannot be cast to non-null type kotlin.String");
                return new PayPaymentSessionRequest.RememberMe(cardMetadata, processing, sessionMetaData, rememberMeSource, str, risk);
            }
            throw Util.missingProperty("source", "source", reader);
        }
        Constructor constructor = this.f4897h;
        if (constructor == null) {
            c3 = 3;
            constructor = PayPaymentSessionRequest.RememberMe.class.getDeclaredConstructor(CardMetadata.class, Processing.class, SessionMetaData.class, RememberMeSource.class, String.class, Risk.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.f4897h = constructor;
            Intrinsics.delta(constructor, "also(...)");
        } else {
            c3 = 3;
        }
        if (sessionMetaData == null) {
            throw Util.missingProperty("sessionMetaData", "session_metadata", reader);
        }
        if (rememberMeSource != null) {
            Integer valueOf = Integer.valueOf(i4);
            Object[] objArr = new Object[8];
            objArr[0] = cardMetadata;
            objArr[1] = processing;
            objArr[2] = sessionMetaData;
            objArr[c3] = rememberMeSource;
            objArr[4] = str;
            objArr[5] = risk;
            objArr[6] = valueOf;
            objArr[7] = null;
            Object newInstance = constructor.newInstance(objArr);
            Intrinsics.delta(newInstance, "newInstance(...)");
            return (PayPaymentSessionRequest.RememberMe) newInstance;
        }
        throw Util.missingProperty("source", "source", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable PayPaymentSessionRequest.RememberMe value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("card_metadata");
            this.f4892b.toJson(writer, (JsonWriter) value_.getCardMetadata());
            writer.name("processing");
            this.f4893c.toJson(writer, (JsonWriter) value_.getProcessing());
            writer.name("session_metadata");
            this.f4894d.toJson(writer, (JsonWriter) value_.getSessionMetaData());
            writer.name("source");
            this.e.toJson(writer, (JsonWriter) value_.getSource());
            writer.name(Constants.KEY_TYPE);
            this.f4895f.toJson(writer, (JsonWriter) value_.getType());
            writer.name("risk");
            this.f4896g.toJson(writer, (JsonWriter) value_.getRisk());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
