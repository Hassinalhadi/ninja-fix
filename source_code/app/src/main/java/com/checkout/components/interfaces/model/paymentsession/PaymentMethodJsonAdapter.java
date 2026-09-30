package com.checkout.components.interfaces.model.paymentsession;

import com.checkout.components.interfaces.a;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/model/paymentsession/PaymentMethodJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentMethod;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/interfaces/model/paymentsession/PaymentMethod;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/interfaces/model/paymentsession/PaymentMethod;)V", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentMethodJsonAdapter extends JsonAdapter<PaymentMethod> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f5525a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f5526b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f5527c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f5528d;
    private final JsonAdapter e;

    /* renamed from: f, reason: collision with root package name */
    private final JsonAdapter f5529f;

    /* renamed from: g, reason: collision with root package name */
    private final JsonAdapter f5530g;

    /* renamed from: h, reason: collision with root package name */
    private final JsonAdapter f5531h;

    /* renamed from: i, reason: collision with root package name */
    private final JsonAdapter f5532i;

    /* renamed from: j, reason: collision with root package name */
    private final JsonAdapter f5533j;

    /* renamed from: k, reason: collision with root package name */
    private volatile Constructor f5534k;

    public PaymentMethodJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of(Constants.KEY_TYPE, "card_schemes", "scheme_choice_enabled", "stored_payment_details", "display_name", "country_code", "currency_code", "merchant_capabilities", "supported_networks", "country_calling_codes", "total", "merchant", "transaction_info", "card_parameters", "email", "name", "phone");
        Intrinsics.delta(of2, "of(...)");
        this.f5525a = of2;
        this.f5526b = a.a(moshi, String.class, Constants.KEY_TYPE, "adapter(...)");
        JsonAdapter adapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), u.alpha, "cardSchemes");
        Intrinsics.delta(adapter, "adapter(...)");
        this.f5527c = adapter;
        this.f5528d = a.a(moshi, Boolean.class, "schemeChoiceEnabled", "adapter(...)");
        this.e = a.a(moshi, String.class, "storePaymentDetails", "adapter(...)");
        this.f5529f = a.a(moshi, Total.class, "total", "adapter(...)");
        this.f5530g = a.a(moshi, Merchant.class, "merchant", "adapter(...)");
        this.f5531h = a.a(moshi, TransactionInfo.class, "transactionInfo", "adapter(...)");
        this.f5532i = a.a(moshi, CardParameters.class, "cardParameters", "adapter(...)");
        this.f5533j = a.a(moshi, PhoneNetworkEntity.class, "phone", "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return j.india(35, "GeneratedJsonAdapter(PaymentMethod)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0067. Please report as an issue. */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final PaymentMethod fromJson(@NotNull JsonReader reader) {
        char c3;
        int i4;
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        int i5 = -1;
        String str = null;
        List list = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        Total total = null;
        Merchant merchant = null;
        TransactionInfo transactionInfo = null;
        CardParameters cardParameters = null;
        String str6 = null;
        String str7 = null;
        PhoneNetworkEntity phoneNetworkEntity = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.f5525a)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                case 0:
                    str = (String) this.f5526b.fromJson(reader);
                    if (str == null) {
                        throw Util.unexpectedNull(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
                    }
                case 1:
                    i4 = -3;
                    list = (List) this.f5527c.fromJson(reader);
                    i5 &= i4;
                case 2:
                    i4 = -5;
                    bool = (Boolean) this.f5528d.fromJson(reader);
                    i5 &= i4;
                case 3:
                    i4 = -9;
                    str2 = (String) this.e.fromJson(reader);
                    i5 &= i4;
                case 4:
                    i4 = -17;
                    str3 = (String) this.e.fromJson(reader);
                    i5 &= i4;
                case 5:
                    i4 = -33;
                    str4 = (String) this.e.fromJson(reader);
                    i5 &= i4;
                case 6:
                    i4 = -65;
                    str5 = (String) this.e.fromJson(reader);
                    i5 &= i4;
                case 7:
                    i4 = -129;
                    list2 = (List) this.f5527c.fromJson(reader);
                    i5 &= i4;
                case 8:
                    i4 = -257;
                    list3 = (List) this.f5527c.fromJson(reader);
                    i5 &= i4;
                case 9:
                    i4 = -513;
                    list4 = (List) this.f5527c.fromJson(reader);
                    i5 &= i4;
                case 10:
                    i4 = -1025;
                    total = (Total) this.f5529f.fromJson(reader);
                    i5 &= i4;
                case 11:
                    i4 = -2049;
                    merchant = (Merchant) this.f5530g.fromJson(reader);
                    i5 &= i4;
                case 12:
                    i4 = -4097;
                    transactionInfo = (TransactionInfo) this.f5531h.fromJson(reader);
                    i5 &= i4;
                case 13:
                    i4 = -8193;
                    cardParameters = (CardParameters) this.f5532i.fromJson(reader);
                    i5 &= i4;
                case 14:
                    i4 = -16385;
                    str6 = (String) this.e.fromJson(reader);
                    i5 &= i4;
                case 15:
                    i4 = -32769;
                    str7 = (String) this.e.fromJson(reader);
                    i5 &= i4;
                case 16:
                    i4 = -65537;
                    phoneNetworkEntity = (PhoneNetworkEntity) this.f5533j.fromJson(reader);
                    i5 &= i4;
            }
        }
        reader.endObject();
        if (i5 == -131071) {
            if (str != null) {
                return new PaymentMethod(str, list, bool, str2, str3, str4, str5, list2, list3, list4, total, merchant, transactionInfo, cardParameters, str6, str7, phoneNetworkEntity);
            }
            throw Util.missingProperty(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
        }
        Constructor constructor = this.f5534k;
        if (constructor == null) {
            c3 = 14;
            constructor = PaymentMethod.class.getDeclaredConstructor(String.class, List.class, Boolean.class, String.class, String.class, String.class, String.class, List.class, List.class, List.class, Total.class, Merchant.class, TransactionInfo.class, CardParameters.class, String.class, String.class, PhoneNetworkEntity.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.f5534k = constructor;
            Intrinsics.delta(constructor, "also(...)");
        } else {
            c3 = 14;
        }
        if (str != null) {
            Integer valueOf = Integer.valueOf(i5);
            Object[] objArr = new Object[19];
            objArr[0] = str;
            objArr[1] = list;
            objArr[2] = bool;
            objArr[3] = str2;
            objArr[4] = str3;
            objArr[5] = str4;
            objArr[6] = str5;
            objArr[7] = list2;
            objArr[8] = list3;
            objArr[9] = list4;
            objArr[10] = total;
            objArr[11] = merchant;
            objArr[12] = transactionInfo;
            objArr[13] = cardParameters;
            objArr[c3] = str6;
            objArr[15] = str7;
            objArr[16] = phoneNetworkEntity;
            objArr[17] = valueOf;
            objArr[18] = null;
            Object newInstance = constructor.newInstance(objArr);
            Intrinsics.delta(newInstance, "newInstance(...)");
            return (PaymentMethod) newInstance;
        }
        throw Util.missingProperty(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable PaymentMethod value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name(Constants.KEY_TYPE);
            this.f5526b.toJson(writer, (JsonWriter) value_.getType());
            writer.name("card_schemes");
            this.f5527c.toJson(writer, (JsonWriter) value_.getCardSchemes());
            writer.name("scheme_choice_enabled");
            this.f5528d.toJson(writer, (JsonWriter) value_.getSchemeChoiceEnabled());
            writer.name("stored_payment_details");
            this.e.toJson(writer, (JsonWriter) value_.getStorePaymentDetails());
            writer.name("display_name");
            this.e.toJson(writer, (JsonWriter) value_.getDisplayName());
            writer.name("country_code");
            this.e.toJson(writer, (JsonWriter) value_.getCountryCode());
            writer.name("currency_code");
            this.e.toJson(writer, (JsonWriter) value_.getCurrencyCode());
            writer.name("merchant_capabilities");
            this.f5527c.toJson(writer, (JsonWriter) value_.getMerchantCapabilities());
            writer.name("supported_networks");
            this.f5527c.toJson(writer, (JsonWriter) value_.getSupportedNetworks());
            writer.name("country_calling_codes");
            this.f5527c.toJson(writer, (JsonWriter) value_.getCountryCallingCodes());
            writer.name("total");
            this.f5529f.toJson(writer, (JsonWriter) value_.getTotal());
            writer.name("merchant");
            this.f5530g.toJson(writer, (JsonWriter) value_.getMerchant());
            writer.name("transaction_info");
            this.f5531h.toJson(writer, (JsonWriter) value_.getTransactionInfo());
            writer.name("card_parameters");
            this.f5532i.toJson(writer, (JsonWriter) value_.getCardParameters());
            writer.name("email");
            this.e.toJson(writer, (JsonWriter) value_.getEmail());
            writer.name("name");
            this.e.toJson(writer, (JsonWriter) value_.getName());
            writer.name("phone");
            this.f5533j.toJson(writer, (JsonWriter) value_.getPhone());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
