package com.checkout.components.card.operations.tokenisation.network.model;

import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/card/operations/tokenisation/network/model/ShippingJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/card/operations/tokenisation/network/model/Shipping;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/card/operations/tokenisation/network/model/Shipping;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/card/operations/tokenisation/network/model/Shipping;)V", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShippingJsonAdapter extends JsonAdapter<Shipping> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f4334a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f4335b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f4336c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f4337d;
    private volatile Constructor e;

    public ShippingJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("first_name", "last_name", "company_name", "phone", "address");
        Intrinsics.delta(of2, "of(...)");
        this.f4334a = of2;
        u uVar = u.alpha;
        JsonAdapter adapter = moshi.adapter(String.class, uVar, "firstName");
        Intrinsics.delta(adapter, "adapter(...)");
        this.f4335b = adapter;
        JsonAdapter adapter2 = moshi.adapter(PhoneNetworkEntity.class, uVar, "phone");
        Intrinsics.delta(adapter2, "adapter(...)");
        this.f4336c = adapter2;
        JsonAdapter adapter3 = moshi.adapter(BillingAddressNetworkEntity.class, uVar, "address");
        Intrinsics.delta(adapter3, "adapter(...)");
        this.f4337d = adapter3;
    }

    @NotNull
    public final String toString() {
        return j.india(30, "GeneratedJsonAdapter(Shipping)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final Shipping fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        PhoneNetworkEntity phoneNetworkEntity = null;
        BillingAddressNetworkEntity billingAddressNetworkEntity = null;
        int i4 = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.f4334a);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.f4335b.fromJson(reader);
                i4 &= -2;
            } else if (selectName == 1) {
                str2 = (String) this.f4335b.fromJson(reader);
                i4 &= -3;
            } else if (selectName == 2) {
                str3 = (String) this.f4335b.fromJson(reader);
                i4 &= -5;
            } else if (selectName == 3) {
                phoneNetworkEntity = (PhoneNetworkEntity) this.f4336c.fromJson(reader);
            } else if (selectName == 4) {
                billingAddressNetworkEntity = (BillingAddressNetworkEntity) this.f4337d.fromJson(reader);
            }
        }
        reader.endObject();
        if (i4 == -8) {
            return new Shipping(str, str2, str3, phoneNetworkEntity, billingAddressNetworkEntity);
        }
        Constructor constructor = this.e;
        if (constructor == null) {
            constructor = Shipping.class.getDeclaredConstructor(String.class, String.class, String.class, PhoneNetworkEntity.class, BillingAddressNetworkEntity.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.e = constructor;
            Intrinsics.delta(constructor, "also(...)");
        }
        Object newInstance = constructor.newInstance(str, str2, str3, phoneNetworkEntity, billingAddressNetworkEntity, Integer.valueOf(i4), null);
        Intrinsics.delta(newInstance, "newInstance(...)");
        return (Shipping) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable Shipping value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("first_name");
            this.f4335b.toJson(writer, (JsonWriter) value_.getFirstName());
            writer.name("last_name");
            this.f4335b.toJson(writer, (JsonWriter) value_.getLastName());
            writer.name("company_name");
            this.f4335b.toJson(writer, (JsonWriter) value_.getCompanyName());
            writer.name("phone");
            this.f4336c.toJson(writer, (JsonWriter) value_.getPhone());
            writer.name("address");
            this.f4337d.toJson(writer, (JsonWriter) value_.getAddress());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
