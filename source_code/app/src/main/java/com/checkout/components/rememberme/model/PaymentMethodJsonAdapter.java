package com.checkout.components.rememberme.model;

import com.checkout.components.rememberme.AbstractC0924a;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/rememberme/model/PaymentMethodJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/rememberme/model/PaymentMethod;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/rememberme/model/PaymentMethod;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/rememberme/model/PaymentMethod;)V", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentMethodJsonAdapter extends JsonAdapter<PaymentMethod> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f6059a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f6060b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f6061c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f6062d;
    private final JsonAdapter e;

    /* renamed from: f, reason: collision with root package name */
    private final JsonAdapter f6063f;

    public PaymentMethodJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of(Constants.KEY_ID, Constants.KEY_TYPE, "card_details", "is_default_payment_method", "is_verified_payment_method", "billing_address");
        Intrinsics.delta(of2, "of(...)");
        this.f6059a = of2;
        this.f6060b = AbstractC0924a.a(moshi, String.class, Constants.KEY_ID, "adapter(...)");
        this.f6061c = AbstractC0924a.a(moshi, Integer.TYPE, Constants.KEY_TYPE, "adapter(...)");
        this.f6062d = AbstractC0924a.a(moshi, CardDetails.class, "cardDetails", "adapter(...)");
        this.e = AbstractC0924a.a(moshi, Boolean.TYPE, "isDefaultPaymentMethod", "adapter(...)");
        this.f6063f = AbstractC0924a.a(moshi, BillingAddress.class, "billingAddress", "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return j.india(35, "GeneratedJsonAdapter(PaymentMethod)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0030. Please report as an issue. */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final PaymentMethod fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Boolean bool = null;
        String str = null;
        Boolean bool2 = null;
        CardDetails cardDetails = null;
        BillingAddress billingAddress = null;
        while (true) {
            Integer num2 = num;
            if (reader.hasNext()) {
                switch (reader.selectName(this.f6059a)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        num = num2;
                    case 0:
                        str = (String) this.f6060b.fromJson(reader);
                        if (str == null) {
                            throw Util.unexpectedNull(Constants.KEY_ID, Constants.KEY_ID, reader);
                        }
                        num = num2;
                    case 1:
                        Integer num3 = (Integer) this.f6061c.fromJson(reader);
                        if (num3 == null) {
                            throw Util.unexpectedNull(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
                        }
                        num = num3;
                    case 2:
                        cardDetails = (CardDetails) this.f6062d.fromJson(reader);
                        if (cardDetails == null) {
                            throw Util.unexpectedNull("cardDetails", "card_details", reader);
                        }
                        num = num2;
                    case 3:
                        bool = (Boolean) this.e.fromJson(reader);
                        if (bool == null) {
                            throw Util.unexpectedNull("isDefaultPaymentMethod", "is_default_payment_method", reader);
                        }
                        num = num2;
                    case 4:
                        bool2 = (Boolean) this.e.fromJson(reader);
                        if (bool2 == null) {
                            throw Util.unexpectedNull("isVerifiedPaymentMethod", "is_verified_payment_method", reader);
                        }
                        num = num2;
                    case 5:
                        billingAddress = (BillingAddress) this.f6063f.fromJson(reader);
                        num = num2;
                    default:
                        num = num2;
                }
            } else {
                reader.endObject();
                Boolean bool3 = bool;
                if (str == null) {
                    throw Util.missingProperty(Constants.KEY_ID, Constants.KEY_ID, reader);
                }
                if (num2 != null) {
                    int intValue = num2.intValue();
                    if (cardDetails == null) {
                        throw Util.missingProperty("cardDetails", "card_details", reader);
                    }
                    if (bool3 != null) {
                        boolean booleanValue = bool3.booleanValue();
                        if (bool2 != null) {
                            return new PaymentMethod(str, intValue, cardDetails, booleanValue, bool2.booleanValue(), billingAddress);
                        }
                        throw Util.missingProperty("isVerifiedPaymentMethod", "is_verified_payment_method", reader);
                    }
                    throw Util.missingProperty("isDefaultPaymentMethod", "is_default_payment_method", reader);
                }
                throw Util.missingProperty(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable PaymentMethod value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name(Constants.KEY_ID);
            this.f6060b.toJson(writer, (JsonWriter) value_.getId());
            writer.name(Constants.KEY_TYPE);
            this.f6061c.toJson(writer, (JsonWriter) Integer.valueOf(value_.getType()));
            writer.name("card_details");
            this.f6062d.toJson(writer, (JsonWriter) value_.getCardDetails());
            writer.name("is_default_payment_method");
            this.e.toJson(writer, (JsonWriter) Boolean.valueOf(value_.isDefaultPaymentMethod()));
            writer.name("is_verified_payment_method");
            this.e.toJson(writer, (JsonWriter) Boolean.valueOf(value_.isVerifiedPaymentMethod()));
            writer.name("billing_address");
            this.f6063f.toJson(writer, (JsonWriter) value_.getBillingAddress());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
