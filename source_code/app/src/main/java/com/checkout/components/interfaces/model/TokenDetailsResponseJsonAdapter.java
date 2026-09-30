package com.checkout.components.interfaces.model;

import com.checkout.components.interfaces.a;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/model/TokenDetailsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/interfaces/model/TokenDetailsResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/interfaces/model/TokenDetailsResponse;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/interfaces/model/TokenDetailsResponse;)V", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TokenDetailsResponseJsonAdapter extends JsonAdapter<TokenDetailsResponse> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f5468a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f5469b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f5470c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f5471d;
    private final JsonAdapter e;

    /* renamed from: f, reason: collision with root package name */
    private final JsonAdapter f5472f;

    /* renamed from: g, reason: collision with root package name */
    private volatile Constructor f5473g;

    public TokenDetailsResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("expiry_month", "expiry_year", "last4", "bin", Constants.KEY_TYPE, "token", "expires_on", "scheme", "scheme_local", "card_type", "card_category", "issuer", "issuer_country", "product_id", "product_type", "billing_address", "phone", "name");
        Intrinsics.delta(of2, "of(...)");
        this.f5468a = of2;
        this.f5469b = a.a(moshi, Integer.TYPE, "expiryMonth", "adapter(...)");
        this.f5470c = a.a(moshi, String.class, "last4", "adapter(...)");
        this.f5471d = a.a(moshi, String.class, "scheme", "adapter(...)");
        this.e = a.a(moshi, BillingAddressNetworkEntity.class, "billingAddress", "adapter(...)");
        this.f5472f = a.a(moshi, PhoneNetworkEntity.class, "phone", "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return j.india(42, "GeneratedJsonAdapter(TokenDetailsResponse)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x007f. Please report as an issue. */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final TokenDetailsResponse fromJson(@NotNull JsonReader reader) {
        char c3;
        int i4;
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        int i5 = -1;
        Integer num = null;
        Integer num2 = null;
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
        String str12 = null;
        String str13 = null;
        BillingAddressNetworkEntity billingAddressNetworkEntity = null;
        PhoneNetworkEntity phoneNetworkEntity = null;
        String str14 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.f5468a)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                case 0:
                    num = (Integer) this.f5469b.fromJson(reader);
                    if (num == null) {
                        throw Util.unexpectedNull("expiryMonth", "expiry_month", reader);
                    }
                case 1:
                    num2 = (Integer) this.f5469b.fromJson(reader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("expiryYear", "expiry_year", reader);
                    }
                case 2:
                    str = (String) this.f5470c.fromJson(reader);
                    if (str == null) {
                        throw Util.unexpectedNull("last4", "last4", reader);
                    }
                case 3:
                    str2 = (String) this.f5470c.fromJson(reader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("bin", "bin", reader);
                    }
                case 4:
                    str3 = (String) this.f5470c.fromJson(reader);
                    if (str3 == null) {
                        throw Util.unexpectedNull(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
                    }
                case 5:
                    str4 = (String) this.f5470c.fromJson(reader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("token", "token", reader);
                    }
                case 6:
                    str5 = (String) this.f5470c.fromJson(reader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("expiresOn", "expires_on", reader);
                    }
                case 7:
                    str6 = (String) this.f5471d.fromJson(reader);
                    i5 &= -129;
                case 8:
                    str7 = (String) this.f5471d.fromJson(reader);
                    i5 &= -257;
                case 9:
                    str8 = (String) this.f5471d.fromJson(reader);
                    i5 &= -513;
                case 10:
                    str9 = (String) this.f5471d.fromJson(reader);
                    i5 &= -1025;
                case 11:
                    str10 = (String) this.f5471d.fromJson(reader);
                    i5 &= -2049;
                case 12:
                    str11 = (String) this.f5471d.fromJson(reader);
                    i5 &= -4097;
                case 13:
                    str12 = (String) this.f5471d.fromJson(reader);
                    i5 &= -8193;
                case 14:
                    str13 = (String) this.f5471d.fromJson(reader);
                    i5 &= -16385;
                case 15:
                    billingAddressNetworkEntity = (BillingAddressNetworkEntity) this.e.fromJson(reader);
                    i4 = -32769;
                    i5 &= i4;
                case 16:
                    phoneNetworkEntity = (PhoneNetworkEntity) this.f5472f.fromJson(reader);
                    i4 = -65537;
                    i5 &= i4;
                case 17:
                    str14 = (String) this.f5471d.fromJson(reader);
                    i4 = -131073;
                    i5 &= i4;
            }
        }
        reader.endObject();
        if (i5 == -262017) {
            if (num != null) {
                int intValue = num.intValue();
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    if (str == null) {
                        throw Util.missingProperty("last4", "last4", reader);
                    }
                    if (str2 == null) {
                        throw Util.missingProperty("bin", "bin", reader);
                    }
                    if (str3 == null) {
                        throw Util.missingProperty(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
                    }
                    if (str4 == null) {
                        throw Util.missingProperty("token", "token", reader);
                    }
                    if (str5 != null) {
                        return new TokenDetailsResponse(intValue, intValue2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, billingAddressNetworkEntity, phoneNetworkEntity, str14);
                    }
                    throw Util.missingProperty("expiresOn", "expires_on", reader);
                }
                throw Util.missingProperty("expiryYear", "expiry_year", reader);
            }
            throw Util.missingProperty("expiryMonth", "expiry_month", reader);
        }
        Constructor constructor = this.f5473g;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class[] clsArr = {cls, cls, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, BillingAddressNetworkEntity.class, PhoneNetworkEntity.class, String.class, cls, Util.DEFAULT_CONSTRUCTOR_MARKER};
            c3 = 6;
            constructor = TokenDetailsResponse.class.getDeclaredConstructor(clsArr);
            this.f5473g = constructor;
            Intrinsics.delta(constructor, "also(...)");
        } else {
            c3 = 6;
        }
        if (num == null) {
            throw Util.missingProperty("expiryMonth", "expiry_month", reader);
        }
        if (num2 == null) {
            throw Util.missingProperty("expiryYear", "expiry_year", reader);
        }
        if (str == null) {
            throw Util.missingProperty("last4", "last4", reader);
        }
        if (str2 == null) {
            throw Util.missingProperty("bin", "bin", reader);
        }
        if (str3 == null) {
            throw Util.missingProperty(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
        }
        if (str4 == null) {
            throw Util.missingProperty("token", "token", reader);
        }
        if (str5 != null) {
            Integer valueOf = Integer.valueOf(i5);
            Object[] objArr = new Object[20];
            objArr[0] = num;
            objArr[1] = num2;
            objArr[2] = str;
            objArr[3] = str2;
            objArr[4] = str3;
            objArr[5] = str4;
            objArr[c3] = str5;
            objArr[7] = str6;
            objArr[8] = str7;
            objArr[9] = str8;
            objArr[10] = str9;
            objArr[11] = str10;
            objArr[12] = str11;
            objArr[13] = str12;
            objArr[14] = str13;
            objArr[15] = billingAddressNetworkEntity;
            objArr[16] = phoneNetworkEntity;
            objArr[17] = str14;
            objArr[18] = valueOf;
            objArr[19] = null;
            Object newInstance = constructor.newInstance(objArr);
            Intrinsics.delta(newInstance, "newInstance(...)");
            return (TokenDetailsResponse) newInstance;
        }
        throw Util.missingProperty("expiresOn", "expires_on", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable TokenDetailsResponse value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("expiry_month");
            this.f5469b.toJson(writer, (JsonWriter) Integer.valueOf(value_.getExpiryMonth()));
            writer.name("expiry_year");
            this.f5469b.toJson(writer, (JsonWriter) Integer.valueOf(value_.getExpiryYear()));
            writer.name("last4");
            this.f5470c.toJson(writer, (JsonWriter) value_.getLast4());
            writer.name("bin");
            this.f5470c.toJson(writer, (JsonWriter) value_.getBin());
            writer.name(Constants.KEY_TYPE);
            this.f5470c.toJson(writer, (JsonWriter) value_.getType());
            writer.name("token");
            this.f5470c.toJson(writer, (JsonWriter) value_.getToken());
            writer.name("expires_on");
            this.f5470c.toJson(writer, (JsonWriter) value_.getExpiresOn());
            writer.name("scheme");
            this.f5471d.toJson(writer, (JsonWriter) value_.getScheme());
            writer.name("scheme_local");
            this.f5471d.toJson(writer, (JsonWriter) value_.getSchemeLocal());
            writer.name("card_type");
            this.f5471d.toJson(writer, (JsonWriter) value_.getCardType());
            writer.name("card_category");
            this.f5471d.toJson(writer, (JsonWriter) value_.getCardCategory());
            writer.name("issuer");
            this.f5471d.toJson(writer, (JsonWriter) value_.getIssuer());
            writer.name("issuer_country");
            this.f5471d.toJson(writer, (JsonWriter) value_.getIssuerCountry());
            writer.name("product_id");
            this.f5471d.toJson(writer, (JsonWriter) value_.getProductId());
            writer.name("product_type");
            this.f5471d.toJson(writer, (JsonWriter) value_.getProductType());
            writer.name("billing_address");
            this.e.toJson(writer, (JsonWriter) value_.getBillingAddress());
            writer.name("phone");
            this.f5472f.toJson(writer, (JsonWriter) value_.getPhone());
            writer.name("name");
            this.f5471d.toJson(writer, (JsonWriter) value_.getName());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
