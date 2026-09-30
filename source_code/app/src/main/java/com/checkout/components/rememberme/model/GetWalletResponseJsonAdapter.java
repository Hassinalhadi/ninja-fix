package com.checkout.components.rememberme.model;

import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.checkout.components.rememberme.AbstractC0924a;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/rememberme/model/GetWalletResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/rememberme/model/GetWalletResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/rememberme/model/GetWalletResponse;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/rememberme/model/GetWalletResponse;)V", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetWalletResponseJsonAdapter extends JsonAdapter<GetWalletResponse> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f6049a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f6050b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f6051c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f6052d;
    private final JsonAdapter e;

    /* renamed from: f, reason: collision with root package name */
    private final JsonAdapter f6053f;

    public GetWalletResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of(Constants.KEY_ID, "first_name", "last_name", "email", "phone", "email_verified", "phone_verified", "payment_methods", "shipping_addresses");
        Intrinsics.delta(of2, "of(...)");
        this.f6049a = of2;
        this.f6050b = AbstractC0924a.a(moshi, String.class, Constants.KEY_ID, "adapter(...)");
        this.f6051c = AbstractC0924a.a(moshi, PhoneNetworkEntity.class, "phone", "adapter(...)");
        this.f6052d = AbstractC0924a.a(moshi, Boolean.TYPE, "emailVerified", "adapter(...)");
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, PaymentMethod.class);
        u uVar = u.alpha;
        JsonAdapter adapter = moshi.adapter(newParameterizedType, uVar, "paymentMethods");
        Intrinsics.delta(adapter, "adapter(...)");
        this.e = adapter;
        JsonAdapter adapter2 = moshi.adapter(Types.newParameterizedType(List.class, ShippingAddress.class), uVar, "shippingAddresses");
        Intrinsics.delta(adapter2, "adapter(...)");
        this.f6053f = adapter2;
    }

    @NotNull
    public final String toString() {
        return j.india(39, "GeneratedJsonAdapter(GetWalletResponse)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x003b. Please report as an issue. */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final GetWalletResponse fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        PhoneNetworkEntity phoneNetworkEntity = null;
        List list = null;
        List list2 = null;
        while (true) {
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            String str5 = str;
            if (reader.hasNext()) {
                String str6 = str2;
                switch (reader.selectName(this.f6049a)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        bool = bool3;
                        bool2 = bool4;
                        str2 = str6;
                        str = str5;
                    case 0:
                        str = (String) this.f6050b.fromJson(reader);
                        bool = bool3;
                        bool2 = bool4;
                        str2 = str6;
                    case 1:
                        str2 = (String) this.f6050b.fromJson(reader);
                        bool = bool3;
                        bool2 = bool4;
                        str = str5;
                    case 2:
                        str3 = (String) this.f6050b.fromJson(reader);
                        bool = bool3;
                        bool2 = bool4;
                        str2 = str6;
                        str = str5;
                    case 3:
                        str4 = (String) this.f6050b.fromJson(reader);
                        bool = bool3;
                        bool2 = bool4;
                        str2 = str6;
                        str = str5;
                    case 4:
                        phoneNetworkEntity = (PhoneNetworkEntity) this.f6051c.fromJson(reader);
                        bool = bool3;
                        bool2 = bool4;
                        str2 = str6;
                        str = str5;
                    case 5:
                        bool = (Boolean) this.f6052d.fromJson(reader);
                        if (bool == null) {
                            throw Util.unexpectedNull("emailVerified", "email_verified", reader);
                        }
                        bool2 = bool4;
                        str2 = str6;
                        str = str5;
                    case 6:
                        bool2 = (Boolean) this.f6052d.fromJson(reader);
                        if (bool2 == null) {
                            throw Util.unexpectedNull("phoneVerified", "phone_verified", reader);
                        }
                        bool = bool3;
                        str2 = str6;
                        str = str5;
                    case 7:
                        list = (List) this.e.fromJson(reader);
                        if (list == null) {
                            throw Util.unexpectedNull("paymentMethods", "payment_methods", reader);
                        }
                        bool = bool3;
                        bool2 = bool4;
                        str2 = str6;
                        str = str5;
                    case 8:
                        list2 = (List) this.f6053f.fromJson(reader);
                        if (list2 == null) {
                            throw Util.unexpectedNull("shippingAddresses", "shipping_addresses", reader);
                        }
                        bool = bool3;
                        bool2 = bool4;
                        str2 = str6;
                        str = str5;
                    default:
                        bool = bool3;
                        bool2 = bool4;
                        str2 = str6;
                        str = str5;
                }
            } else {
                String str7 = str2;
                reader.endObject();
                if (bool3 != null) {
                    boolean booleanValue = bool3.booleanValue();
                    if (bool4 != null) {
                        boolean booleanValue2 = bool4.booleanValue();
                        if (list == null) {
                            throw Util.missingProperty("paymentMethods", "payment_methods", reader);
                        }
                        if (list2 != null) {
                            return new GetWalletResponse(str5, str7, str3, str4, phoneNetworkEntity, booleanValue, booleanValue2, list, list2);
                        }
                        throw Util.missingProperty("shippingAddresses", "shipping_addresses", reader);
                    }
                    throw Util.missingProperty("phoneVerified", "phone_verified", reader);
                }
                throw Util.missingProperty("emailVerified", "email_verified", reader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable GetWalletResponse value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name(Constants.KEY_ID);
            this.f6050b.toJson(writer, (JsonWriter) value_.getId());
            writer.name("first_name");
            this.f6050b.toJson(writer, (JsonWriter) value_.getFirstName());
            writer.name("last_name");
            this.f6050b.toJson(writer, (JsonWriter) value_.getLastName());
            writer.name("email");
            this.f6050b.toJson(writer, (JsonWriter) value_.getEmail());
            writer.name("phone");
            this.f6051c.toJson(writer, (JsonWriter) value_.getPhone());
            writer.name("email_verified");
            this.f6052d.toJson(writer, (JsonWriter) Boolean.valueOf(value_.getEmailVerified()));
            writer.name("phone_verified");
            this.f6052d.toJson(writer, (JsonWriter) Boolean.valueOf(value_.getPhoneVerified()));
            writer.name("payment_methods");
            this.e.toJson(writer, (JsonWriter) value_.getPaymentMethods());
            writer.name("shipping_addresses");
            this.f6053f.toJson(writer, (JsonWriter) value_.getShippingAddresses());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
