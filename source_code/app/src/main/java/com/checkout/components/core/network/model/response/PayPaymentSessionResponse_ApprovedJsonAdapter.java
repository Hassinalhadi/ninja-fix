package com.checkout.components.core.network.model.response;

import com.checkout.components.core.B;
import com.checkout.components.core.C;
import com.checkout.components.core.network.model.response.PayPaymentSessionResponse;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse_ApprovedJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse$Approved;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse$Approved;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse$Approved;)V", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayPaymentSessionResponse_ApprovedJsonAdapter extends JsonAdapter<PayPaymentSessionResponse.Approved> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f4955a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f4956b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f4957c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f4958d;

    public PayPaymentSessionResponse_ApprovedJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of(Constants.KEY_ID, Constants.KEY_TYPE, "status");
        Intrinsics.delta(of2, "of(...)");
        this.f4955a = of2;
        this.f4956b = C.a(moshi, String.class, Constants.KEY_ID, "adapter(...)");
        this.f4957c = C.a(moshi, PaymentMethodName.class, Constants.KEY_TYPE, "adapter(...)");
        this.f4958d = C.a(moshi, PaymentStatus.class, "status", "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return B.a(56, "GeneratedJsonAdapter(PayPaymentSessionResponse.Approved)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final PayPaymentSessionResponse.Approved fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        String str = null;
        PaymentMethodName paymentMethodName = null;
        PaymentStatus paymentStatus = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.f4955a);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.f4956b.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull(Constants.KEY_ID, Constants.KEY_ID, reader);
                }
            } else if (selectName == 1) {
                paymentMethodName = (PaymentMethodName) this.f4957c.fromJson(reader);
                if (paymentMethodName == null) {
                    throw Util.unexpectedNull(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
                }
            } else if (selectName == 2 && (paymentStatus = (PaymentStatus) this.f4958d.fromJson(reader)) == null) {
                throw Util.unexpectedNull("status", "status", reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw Util.missingProperty(Constants.KEY_ID, Constants.KEY_ID, reader);
        }
        if (paymentMethodName == null) {
            throw Util.missingProperty(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
        }
        if (paymentStatus != null) {
            return new PayPaymentSessionResponse.Approved(str, paymentMethodName, paymentStatus);
        }
        throw Util.missingProperty("status", "status", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable PayPaymentSessionResponse.Approved value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name(Constants.KEY_ID);
            this.f4956b.toJson(writer, (JsonWriter) value_.getId());
            writer.name(Constants.KEY_TYPE);
            this.f4957c.toJson(writer, (JsonWriter) value_.getType());
            writer.name("status");
            this.f4958d.toJson(writer, (JsonWriter) value_.getStatus());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
