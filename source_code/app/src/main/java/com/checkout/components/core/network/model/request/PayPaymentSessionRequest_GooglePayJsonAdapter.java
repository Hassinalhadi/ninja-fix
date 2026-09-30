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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest_GooglePayJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$GooglePay;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$GooglePay;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$GooglePay;)V", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayPaymentSessionRequest_GooglePayJsonAdapter extends JsonAdapter<PayPaymentSessionRequest.GooglePay> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f4882a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f4883b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f4884c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f4885d;
    private final JsonAdapter e;

    /* renamed from: f, reason: collision with root package name */
    private final JsonAdapter f4886f;

    /* renamed from: g, reason: collision with root package name */
    private final JsonAdapter f4887g;

    /* renamed from: h, reason: collision with root package name */
    private volatile Constructor f4888h;

    public PayPaymentSessionRequest_GooglePayJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("googlepay_metadata", "session_metadata", "configuration_overrides", "source", Constants.KEY_TYPE, "risk");
        Intrinsics.delta(of2, "of(...)");
        this.f4882a = of2;
        this.f4883b = C.a(moshi, PayPaymentSessionRequest.GooglePay.GooglePayMetadata.class, "metadata", "adapter(...)");
        this.f4884c = C.a(moshi, SessionMetaData.class, "sessionMetaData", "adapter(...)");
        this.f4885d = C.a(moshi, ConfigurationOverrides.class, "configurationOverrides", "adapter(...)");
        this.e = C.a(moshi, Source.class, "source", "adapter(...)");
        this.f4886f = C.a(moshi, String.class, Constants.KEY_TYPE, "adapter(...)");
        this.f4887g = C.a(moshi, Risk.class, "risk", "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return B.a(56, "GeneratedJsonAdapter(PayPaymentSessionRequest.GooglePay)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final PayPaymentSessionRequest.GooglePay fromJson(@NotNull JsonReader reader) {
        char c3;
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        int i4 = -1;
        String str = null;
        PayPaymentSessionRequest.GooglePay.GooglePayMetadata googlePayMetadata = null;
        SessionMetaData sessionMetaData = null;
        ConfigurationOverrides configurationOverrides = null;
        Source source = null;
        Risk risk = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.f4882a)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    googlePayMetadata = (PayPaymentSessionRequest.GooglePay.GooglePayMetadata) this.f4883b.fromJson(reader);
                    if (googlePayMetadata == null) {
                        throw Util.unexpectedNull("metadata", "googlepay_metadata", reader);
                    }
                    break;
                case 1:
                    sessionMetaData = (SessionMetaData) this.f4884c.fromJson(reader);
                    if (sessionMetaData == null) {
                        throw Util.unexpectedNull("sessionMetaData", "session_metadata", reader);
                    }
                    break;
                case 2:
                    configurationOverrides = (ConfigurationOverrides) this.f4885d.fromJson(reader);
                    i4 &= -5;
                    break;
                case 3:
                    source = (Source) this.e.fromJson(reader);
                    if (source == null) {
                        throw Util.unexpectedNull("source", "source", reader);
                    }
                    break;
                case 4:
                    str = (String) this.f4886f.fromJson(reader);
                    if (str == null) {
                        throw Util.unexpectedNull(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
                    }
                    i4 &= -17;
                    break;
                case 5:
                    risk = (Risk) this.f4887g.fromJson(reader);
                    i4 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i4 == -53) {
            if (googlePayMetadata == null) {
                throw Util.missingProperty("metadata", "googlepay_metadata", reader);
            }
            if (sessionMetaData == null) {
                throw Util.missingProperty("sessionMetaData", "session_metadata", reader);
            }
            if (source != null) {
                Intrinsics.charlie(str, "null cannot be cast to non-null type kotlin.String");
                return new PayPaymentSessionRequest.GooglePay(googlePayMetadata, sessionMetaData, configurationOverrides, source, str, risk);
            }
            throw Util.missingProperty("source", "source", reader);
        }
        Constructor constructor = this.f4888h;
        if (constructor == null) {
            c3 = 1;
            constructor = PayPaymentSessionRequest.GooglePay.class.getDeclaredConstructor(PayPaymentSessionRequest.GooglePay.GooglePayMetadata.class, SessionMetaData.class, ConfigurationOverrides.class, Source.class, String.class, Risk.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.f4888h = constructor;
            Intrinsics.delta(constructor, "also(...)");
        } else {
            c3 = 1;
        }
        if (googlePayMetadata == null) {
            throw Util.missingProperty("metadata", "googlepay_metadata", reader);
        }
        if (sessionMetaData == null) {
            throw Util.missingProperty("sessionMetaData", "session_metadata", reader);
        }
        if (source != null) {
            Integer valueOf = Integer.valueOf(i4);
            Object[] objArr = new Object[8];
            objArr[0] = googlePayMetadata;
            objArr[c3] = sessionMetaData;
            objArr[2] = configurationOverrides;
            objArr[3] = source;
            objArr[4] = str;
            objArr[5] = risk;
            objArr[6] = valueOf;
            objArr[7] = null;
            Object newInstance = constructor.newInstance(objArr);
            Intrinsics.delta(newInstance, "newInstance(...)");
            return (PayPaymentSessionRequest.GooglePay) newInstance;
        }
        throw Util.missingProperty("source", "source", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable PayPaymentSessionRequest.GooglePay value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("googlepay_metadata");
            this.f4883b.toJson(writer, (JsonWriter) value_.getMetadata());
            writer.name("session_metadata");
            this.f4884c.toJson(writer, (JsonWriter) value_.getSessionMetaData());
            writer.name("configuration_overrides");
            this.f4885d.toJson(writer, (JsonWriter) value_.getConfigurationOverrides());
            writer.name("source");
            this.e.toJson(writer, (JsonWriter) value_.getSource());
            writer.name(Constants.KEY_TYPE);
            this.f4886f.toJson(writer, (JsonWriter) value_.getType());
            writer.name("risk");
            this.f4887g.toJson(writer, (JsonWriter) value_.getRisk());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
