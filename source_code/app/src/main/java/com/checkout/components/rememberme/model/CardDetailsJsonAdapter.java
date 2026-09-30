package com.checkout.components.rememberme.model;

import com.checkout.components.rememberme.AbstractC0924a;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/rememberme/model/CardDetailsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/rememberme/model/CardDetails;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/rememberme/model/CardDetails;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/rememberme/model/CardDetails;)V", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardDetailsJsonAdapter extends JsonAdapter<CardDetails> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f6023a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f6024b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f6025c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f6026d;

    public CardDetailsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("scheme", "scheme_local", "last4", "expiry_month", "expiry_year", "card_type", "card_category", "issuer", "issuer_country", "name", "bin", "product_id", "product_type");
        Intrinsics.delta(of2, "of(...)");
        this.f6023a = of2;
        this.f6024b = AbstractC0924a.a(moshi, String.class, "scheme", "adapter(...)");
        this.f6025c = AbstractC0924a.a(moshi, String.class, "last4", "adapter(...)");
        this.f6026d = AbstractC0924a.a(moshi, Integer.class, "expiryMonth", "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return j.india(33, "GeneratedJsonAdapter(CardDetails)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final CardDetails fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        Integer num2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.f6023a)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.f6024b.fromJson(reader);
                    break;
                case 1:
                    str2 = (String) this.f6024b.fromJson(reader);
                    break;
                case 2:
                    str3 = (String) this.f6025c.fromJson(reader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("last4", "last4", reader);
                    }
                    break;
                case 3:
                    num = (Integer) this.f6026d.fromJson(reader);
                    break;
                case 4:
                    num2 = (Integer) this.f6026d.fromJson(reader);
                    break;
                case 5:
                    str4 = (String) this.f6024b.fromJson(reader);
                    break;
                case 6:
                    str5 = (String) this.f6024b.fromJson(reader);
                    break;
                case 7:
                    str6 = (String) this.f6024b.fromJson(reader);
                    break;
                case 8:
                    str7 = (String) this.f6024b.fromJson(reader);
                    break;
                case 9:
                    str8 = (String) this.f6024b.fromJson(reader);
                    break;
                case 10:
                    str9 = (String) this.f6024b.fromJson(reader);
                    break;
                case 11:
                    str10 = (String) this.f6024b.fromJson(reader);
                    break;
                case 12:
                    str11 = (String) this.f6024b.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str3 != null) {
            return new CardDetails(str, str2, str3, num, num2, str4, str5, str6, str7, str8, str9, str10, str11);
        }
        throw Util.missingProperty("last4", "last4", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable CardDetails value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("scheme");
            this.f6024b.toJson(writer, (JsonWriter) value_.getScheme());
            writer.name("scheme_local");
            this.f6024b.toJson(writer, (JsonWriter) value_.getSchemeLocal());
            writer.name("last4");
            this.f6025c.toJson(writer, (JsonWriter) value_.getLast4());
            writer.name("expiry_month");
            this.f6026d.toJson(writer, (JsonWriter) value_.getExpiryMonth());
            writer.name("expiry_year");
            this.f6026d.toJson(writer, (JsonWriter) value_.getExpiryYear());
            writer.name("card_type");
            this.f6024b.toJson(writer, (JsonWriter) value_.getCardType());
            writer.name("card_category");
            this.f6024b.toJson(writer, (JsonWriter) value_.getCardCategory());
            writer.name("issuer");
            this.f6024b.toJson(writer, (JsonWriter) value_.getIssuer());
            writer.name("issuer_country");
            this.f6024b.toJson(writer, (JsonWriter) value_.getIssuerCountry());
            writer.name("name");
            this.f6024b.toJson(writer, (JsonWriter) value_.getName());
            writer.name("bin");
            this.f6024b.toJson(writer, (JsonWriter) value_.getBin());
            writer.name("product_id");
            this.f6024b.toJson(writer, (JsonWriter) value_.getProductId());
            writer.name("product_type");
            this.f6024b.toJson(writer, (JsonWriter) value_.getProductType());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
