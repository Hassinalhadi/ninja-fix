package com.checkout.components.interfaces.model;

import com.checkout.components.interfaces.a;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;)V", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BillingAddressNetworkEntityJsonAdapter extends JsonAdapter<BillingAddressNetworkEntity> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f5379a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f5380b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Constructor f5381c;

    public BillingAddressNetworkEntityJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("address_line1", "address_line2", "city", "state", "zip", "country");
        Intrinsics.delta(of2, "of(...)");
        this.f5379a = of2;
        this.f5380b = a.a(moshi, String.class, "addressLine1", "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return j.india(49, "GeneratedJsonAdapter(BillingAddressNetworkEntity)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final BillingAddressNetworkEntity fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        int i4 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.f5379a)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.f5380b.fromJson(reader);
                    i4 &= -2;
                    break;
                case 1:
                    str2 = (String) this.f5380b.fromJson(reader);
                    i4 &= -3;
                    break;
                case 2:
                    str3 = (String) this.f5380b.fromJson(reader);
                    i4 &= -5;
                    break;
                case 3:
                    str4 = (String) this.f5380b.fromJson(reader);
                    i4 &= -9;
                    break;
                case 4:
                    str5 = (String) this.f5380b.fromJson(reader);
                    i4 &= -17;
                    break;
                case 5:
                    str6 = (String) this.f5380b.fromJson(reader);
                    i4 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i4 == -64) {
            return new BillingAddressNetworkEntity(str, str2, str3, str4, str5, str6);
        }
        Constructor constructor = this.f5381c;
        if (constructor == null) {
            constructor = BillingAddressNetworkEntity.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.f5381c = constructor;
            Intrinsics.delta(constructor, "also(...)");
        }
        Object newInstance = constructor.newInstance(str, str2, str3, str4, str5, str6, Integer.valueOf(i4), null);
        Intrinsics.delta(newInstance, "newInstance(...)");
        return (BillingAddressNetworkEntity) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable BillingAddressNetworkEntity value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("address_line1");
            this.f5380b.toJson(writer, (JsonWriter) value_.getAddressLine1());
            writer.name("address_line2");
            this.f5380b.toJson(writer, (JsonWriter) value_.getAddressLine2());
            writer.name("city");
            this.f5380b.toJson(writer, (JsonWriter) value_.getCity());
            writer.name("state");
            this.f5380b.toJson(writer, (JsonWriter) value_.getState());
            writer.name("zip");
            this.f5380b.toJson(writer, (JsonWriter) value_.getZip());
            writer.name("country");
            this.f5380b.toJson(writer, (JsonWriter) value_.getCountry());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
