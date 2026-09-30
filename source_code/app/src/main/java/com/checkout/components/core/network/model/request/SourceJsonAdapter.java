package com.checkout.components.core.network.model.request;

import com.checkout.components.core.B;
import com.checkout.components.core.C;
import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/core/network/model/request/SourceJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/core/network/model/request/Source;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/core/network/model/request/Source;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/core/network/model/request/Source;)V", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SourceJsonAdapter extends JsonAdapter<Source> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f4927a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f4928b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f4929c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f4930d;
    private volatile Constructor e;

    public SourceJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("token", "billing_address", "phone");
        Intrinsics.delta(of2, "of(...)");
        this.f4927a = of2;
        this.f4928b = C.a(moshi, String.class, "token", "adapter(...)");
        this.f4929c = C.a(moshi, BillingAddressNetworkEntity.class, "billingAddress", "adapter(...)");
        this.f4930d = C.a(moshi, PhoneNetworkEntity.class, "phone", "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return B.a(28, "GeneratedJsonAdapter(Source)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final Source fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        String str = null;
        BillingAddressNetworkEntity billingAddressNetworkEntity = null;
        PhoneNetworkEntity phoneNetworkEntity = null;
        int i4 = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.f4927a);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.f4928b.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull("token", "token", reader);
                }
            } else if (selectName == 1) {
                billingAddressNetworkEntity = (BillingAddressNetworkEntity) this.f4929c.fromJson(reader);
                i4 &= -3;
            } else if (selectName == 2) {
                phoneNetworkEntity = (PhoneNetworkEntity) this.f4930d.fromJson(reader);
                i4 &= -5;
            }
        }
        reader.endObject();
        if (i4 == -7) {
            if (str != null) {
                return new Source(str, billingAddressNetworkEntity, phoneNetworkEntity);
            }
            throw Util.missingProperty("token", "token", reader);
        }
        Constructor constructor = this.e;
        if (constructor == null) {
            constructor = Source.class.getDeclaredConstructor(String.class, BillingAddressNetworkEntity.class, PhoneNetworkEntity.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.e = constructor;
            Intrinsics.delta(constructor, "also(...)");
        }
        if (str != null) {
            Object newInstance = constructor.newInstance(str, billingAddressNetworkEntity, phoneNetworkEntity, Integer.valueOf(i4), null);
            Intrinsics.delta(newInstance, "newInstance(...)");
            return (Source) newInstance;
        }
        throw Util.missingProperty("token", "token", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable Source value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("token");
            this.f4928b.toJson(writer, (JsonWriter) value_.getToken());
            writer.name("billing_address");
            this.f4929c.toJson(writer, (JsonWriter) value_.getBillingAddress());
            writer.name("phone");
            this.f4930d.toJson(writer, (JsonWriter) value_.getPhone());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
