package com.checkout.components.rememberme.model;

import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.checkout.components.rememberme.AbstractC0924a;
import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/rememberme/model/BillingAddressJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/rememberme/model/BillingAddress;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/rememberme/model/BillingAddress;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/rememberme/model/BillingAddress;)V", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BillingAddressJsonAdapter extends JsonAdapter<BillingAddress> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f6007a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f6008b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f6009c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f6010d;

    public BillingAddressJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("first_name", "last_name", "phone", "address");
        Intrinsics.delta(of2, "of(...)");
        this.f6007a = of2;
        this.f6008b = AbstractC0924a.a(moshi, String.class, "firstName", "adapter(...)");
        this.f6009c = AbstractC0924a.a(moshi, PhoneNetworkEntity.class, "phone", "adapter(...)");
        this.f6010d = AbstractC0924a.a(moshi, BillingAddressNetworkEntity.class, "address", "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return j.india(36, "GeneratedJsonAdapter(BillingAddress)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final BillingAddress fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        PhoneNetworkEntity phoneNetworkEntity = null;
        BillingAddressNetworkEntity billingAddressNetworkEntity = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.f6007a);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.f6008b.fromJson(reader);
            } else if (selectName == 1) {
                str2 = (String) this.f6008b.fromJson(reader);
            } else if (selectName == 2) {
                phoneNetworkEntity = (PhoneNetworkEntity) this.f6009c.fromJson(reader);
            } else if (selectName == 3) {
                billingAddressNetworkEntity = (BillingAddressNetworkEntity) this.f6010d.fromJson(reader);
            }
        }
        reader.endObject();
        return new BillingAddress(str, str2, phoneNetworkEntity, billingAddressNetworkEntity);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable BillingAddress value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("first_name");
            this.f6008b.toJson(writer, (JsonWriter) value_.getFirstName());
            writer.name("last_name");
            this.f6008b.toJson(writer, (JsonWriter) value_.getLastName());
            writer.name("phone");
            this.f6009c.toJson(writer, (JsonWriter) value_.getPhone());
            writer.name("address");
            this.f6010d.toJson(writer, (JsonWriter) value_.getAddress());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
