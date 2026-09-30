package com.checkout.components.card.operations.network.model;

import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/card/operations/network/model/CardMetaDataResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/card/operations/network/model/CardMetaDataResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/card/operations/network/model/CardMetaDataResponse;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/card/operations/network/model/CardMetaDataResponse;)V", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardMetaDataResponseJsonAdapter extends JsonAdapter<CardMetaDataResponse> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f4298a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f4299b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f4300c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f4301d;
    private final JsonAdapter e;

    public CardMetaDataResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("scheme", "scheme_local", "card_type", "card_category", "currency", "issuer", "issuer_country", "issuer_country_name", "product_id", "sub_product_id", "product_type", "regulated_indicator", "bin", "bin_max", "local_schemes");
        Intrinsics.delta(of2, "of(...)");
        this.f4298a = of2;
        u uVar = u.alpha;
        JsonAdapter adapter = moshi.adapter(String.class, uVar, "scheme");
        Intrinsics.delta(adapter, "adapter(...)");
        this.f4299b = adapter;
        JsonAdapter adapter2 = moshi.adapter(String.class, uVar, "schemeLocal");
        Intrinsics.delta(adapter2, "adapter(...)");
        this.f4300c = adapter2;
        JsonAdapter adapter3 = moshi.adapter(Boolean.class, uVar, "regulatedIndicator");
        Intrinsics.delta(adapter3, "adapter(...)");
        this.f4301d = adapter3;
        JsonAdapter adapter4 = moshi.adapter(Types.newParameterizedType(List.class, String.class), uVar, "localSchemes");
        Intrinsics.delta(adapter4, "adapter(...)");
        this.e = adapter4;
    }

    @NotNull
    public final String toString() {
        return j.india(42, "GeneratedJsonAdapter(CardMetaDataResponse)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0033. Please report as an issue. */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final CardMetaDataResponse fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        Boolean bool = null;
        String str12 = null;
        String str13 = null;
        List list = null;
        while (reader.hasNext()) {
            String str14 = str;
            switch (reader.selectName(this.f4298a)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    str = str14;
                case 0:
                    str = (String) this.f4299b.fromJson(reader);
                    if (str == null) {
                        throw Util.unexpectedNull("scheme", "scheme", reader);
                    }
                case 1:
                    str2 = (String) this.f4300c.fromJson(reader);
                    str = str14;
                case 2:
                    str3 = (String) this.f4300c.fromJson(reader);
                    str = str14;
                case 3:
                    str4 = (String) this.f4300c.fromJson(reader);
                    str = str14;
                case 4:
                    str5 = (String) this.f4300c.fromJson(reader);
                    str = str14;
                case 5:
                    str6 = (String) this.f4300c.fromJson(reader);
                    str = str14;
                case 6:
                    str7 = (String) this.f4300c.fromJson(reader);
                    str = str14;
                case 7:
                    str8 = (String) this.f4300c.fromJson(reader);
                    str = str14;
                case 8:
                    str9 = (String) this.f4300c.fromJson(reader);
                    str = str14;
                case 9:
                    str10 = (String) this.f4300c.fromJson(reader);
                    str = str14;
                case 10:
                    str11 = (String) this.f4300c.fromJson(reader);
                    str = str14;
                case 11:
                    bool = (Boolean) this.f4301d.fromJson(reader);
                    str = str14;
                case 12:
                    str12 = (String) this.f4299b.fromJson(reader);
                    if (str12 == null) {
                        throw Util.unexpectedNull("bin", "bin", reader);
                    }
                    str = str14;
                case 13:
                    str13 = (String) this.f4300c.fromJson(reader);
                    str = str14;
                case 14:
                    list = (List) this.e.fromJson(reader);
                    str = str14;
                default:
                    str = str14;
            }
        }
        String str15 = str;
        reader.endObject();
        if (str15 == null) {
            throw Util.missingProperty("scheme", "scheme", reader);
        }
        if (str12 != null) {
            return new CardMetaDataResponse(str15, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, bool, str12, str13, list);
        }
        throw Util.missingProperty("bin", "bin", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable CardMetaDataResponse value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("scheme");
            this.f4299b.toJson(writer, (JsonWriter) value_.getScheme());
            writer.name("scheme_local");
            this.f4300c.toJson(writer, (JsonWriter) value_.getSchemeLocal());
            writer.name("card_type");
            this.f4300c.toJson(writer, (JsonWriter) value_.getCardType());
            writer.name("card_category");
            this.f4300c.toJson(writer, (JsonWriter) value_.getCardCategory());
            writer.name("currency");
            this.f4300c.toJson(writer, (JsonWriter) value_.getCurrency());
            writer.name("issuer");
            this.f4300c.toJson(writer, (JsonWriter) value_.getIssuer());
            writer.name("issuer_country");
            this.f4300c.toJson(writer, (JsonWriter) value_.getIssuerCountry());
            writer.name("issuer_country_name");
            this.f4300c.toJson(writer, (JsonWriter) value_.getIssuerCountryName());
            writer.name("product_id");
            this.f4300c.toJson(writer, (JsonWriter) value_.getProductId());
            writer.name("sub_product_id");
            this.f4300c.toJson(writer, (JsonWriter) value_.getSubProductId());
            writer.name("product_type");
            this.f4300c.toJson(writer, (JsonWriter) value_.getProductType());
            writer.name("regulated_indicator");
            this.f4301d.toJson(writer, (JsonWriter) value_.getRegulatedIndicator());
            writer.name("bin");
            this.f4299b.toJson(writer, (JsonWriter) value_.getBin());
            writer.name("bin_max");
            this.f4300c.toJson(writer, (JsonWriter) value_.getBinMax());
            writer.name("local_schemes");
            this.e.toJson(writer, (JsonWriter) value_.getLocalSchemes());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
