package com.checkout.components.rememberme.model;

import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/rememberme/model/ShippingAddressJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/rememberme/model/ShippingAddress;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/rememberme/model/ShippingAddress;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/rememberme/model/ShippingAddress;)V", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShippingAddressJsonAdapter extends JsonAdapter<ShippingAddress> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f6088a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f6089b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f6090c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f6091d;
    private final JsonAdapter e;

    /* renamed from: f, reason: collision with root package name */
    private final JsonAdapter f6092f;

    public ShippingAddressJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of(Constants.KEY_ID, "first_name", "last_name", "company_name", "phone", "address", "is_default_shipping_address");
        Intrinsics.delta(of2, "of(...)");
        this.f6088a = of2;
        this.f6089b = AbstractC0924a.a(moshi, String.class, Constants.KEY_ID, "adapter(...)");
        this.f6090c = AbstractC0924a.a(moshi, String.class, "companyName", "adapter(...)");
        this.f6091d = AbstractC0924a.a(moshi, PhoneNetworkEntity.class, "phone", "adapter(...)");
        this.e = AbstractC0924a.a(moshi, BillingAddressNetworkEntity.class, "address", "adapter(...)");
        this.f6092f = AbstractC0924a.a(moshi, Boolean.TYPE, "isDefaultShippingAddress", "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return j.india(37, "GeneratedJsonAdapter(ShippingAddress)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0039. Please report as an issue. */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final ShippingAddress fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        PhoneNetworkEntity phoneNetworkEntity = null;
        BillingAddressNetworkEntity billingAddressNetworkEntity = null;
        while (true) {
            Boolean bool2 = bool;
            String str5 = str;
            if (reader.hasNext()) {
                String str6 = str2;
                switch (reader.selectName(this.f6088a)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        bool = bool2;
                        str2 = str6;
                        str = str5;
                    case 0:
                        str = (String) this.f6089b.fromJson(reader);
                        if (str == null) {
                            throw Util.unexpectedNull(Constants.KEY_ID, Constants.KEY_ID, reader);
                        }
                        bool = bool2;
                        str2 = str6;
                    case 1:
                        str2 = (String) this.f6089b.fromJson(reader);
                        if (str2 == null) {
                            throw Util.unexpectedNull("firstName", "first_name", reader);
                        }
                        bool = bool2;
                        str = str5;
                    case 2:
                        str3 = (String) this.f6089b.fromJson(reader);
                        if (str3 == null) {
                            throw Util.unexpectedNull("lastName", "last_name", reader);
                        }
                        bool = bool2;
                        str2 = str6;
                        str = str5;
                    case 3:
                        str4 = (String) this.f6090c.fromJson(reader);
                        bool = bool2;
                        str2 = str6;
                        str = str5;
                    case 4:
                        phoneNetworkEntity = (PhoneNetworkEntity) this.f6091d.fromJson(reader);
                        if (phoneNetworkEntity == null) {
                            throw Util.unexpectedNull("phone", "phone", reader);
                        }
                        bool = bool2;
                        str2 = str6;
                        str = str5;
                    case 5:
                        billingAddressNetworkEntity = (BillingAddressNetworkEntity) this.e.fromJson(reader);
                        if (billingAddressNetworkEntity == null) {
                            throw Util.unexpectedNull("address", "address", reader);
                        }
                        bool = bool2;
                        str2 = str6;
                        str = str5;
                    case 6:
                        bool = (Boolean) this.f6092f.fromJson(reader);
                        if (bool == null) {
                            throw Util.unexpectedNull("isDefaultShippingAddress", "is_default_shipping_address", reader);
                        }
                        str2 = str6;
                        str = str5;
                    default:
                        bool = bool2;
                        str2 = str6;
                        str = str5;
                }
            } else {
                String str7 = str2;
                reader.endObject();
                if (str5 == null) {
                    throw Util.missingProperty(Constants.KEY_ID, Constants.KEY_ID, reader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("firstName", "first_name", reader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("lastName", "last_name", reader);
                }
                if (phoneNetworkEntity == null) {
                    throw Util.missingProperty("phone", "phone", reader);
                }
                if (billingAddressNetworkEntity == null) {
                    throw Util.missingProperty("address", "address", reader);
                }
                if (bool2 != null) {
                    return new ShippingAddress(str5, str7, str3, str4, phoneNetworkEntity, billingAddressNetworkEntity, bool2.booleanValue());
                }
                throw Util.missingProperty("isDefaultShippingAddress", "is_default_shipping_address", reader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable ShippingAddress value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name(Constants.KEY_ID);
            this.f6089b.toJson(writer, (JsonWriter) value_.getId());
            writer.name("first_name");
            this.f6089b.toJson(writer, (JsonWriter) value_.getFirstName());
            writer.name("last_name");
            this.f6089b.toJson(writer, (JsonWriter) value_.getLastName());
            writer.name("company_name");
            this.f6090c.toJson(writer, (JsonWriter) value_.getCompanyName());
            writer.name("phone");
            this.f6091d.toJson(writer, (JsonWriter) value_.getPhone());
            writer.name("address");
            this.e.toJson(writer, (JsonWriter) value_.getAddress());
            writer.name("is_default_shipping_address");
            this.f6092f.toJson(writer, (JsonWriter) Boolean.valueOf(value_.isDefaultShippingAddress()));
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
