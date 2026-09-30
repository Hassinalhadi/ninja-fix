package com.checkout.components.core.network.model.request;

import com.checkout.components.core.B;
import com.checkout.components.core.C;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/core/network/model/request/ConfigurationOverridesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/core/network/model/request/ConfigurationOverrides;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/core/network/model/request/ConfigurationOverrides;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/core/network/model/request/ConfigurationOverrides;)V", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfigurationOverridesJsonAdapter extends JsonAdapter<ConfigurationOverrides> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f4847a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f4848b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f4849c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Constructor f4850d;

    public ConfigurationOverridesJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("amount", "currency");
        Intrinsics.delta(of2, "of(...)");
        this.f4847a = of2;
        this.f4848b = C.a(moshi, Integer.TYPE, "amount", "adapter(...)");
        this.f4849c = C.a(moshi, String.class, "currency", "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return B.a(44, "GeneratedJsonAdapter(ConfigurationOverrides)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final ConfigurationOverrides fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        Integer num = null;
        String str = null;
        int i4 = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.f4847a);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                num = (Integer) this.f4848b.fromJson(reader);
                if (num == null) {
                    throw Util.unexpectedNull("amount", "amount", reader);
                }
            } else if (selectName == 1) {
                str = (String) this.f4849c.fromJson(reader);
                i4 = -3;
            }
        }
        reader.endObject();
        if (i4 == -3) {
            if (num != null) {
                return new ConfigurationOverrides(num.intValue(), str);
            }
            throw Util.missingProperty("amount", "amount", reader);
        }
        Constructor constructor = this.f4850d;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = ConfigurationOverrides.class.getDeclaredConstructor(cls, String.class, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.f4850d = constructor;
            Intrinsics.delta(constructor, "also(...)");
        }
        if (num != null) {
            Object newInstance = constructor.newInstance(num, str, Integer.valueOf(i4), null);
            Intrinsics.delta(newInstance, "newInstance(...)");
            return (ConfigurationOverrides) newInstance;
        }
        throw Util.missingProperty("amount", "amount", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable ConfigurationOverrides value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("amount");
            this.f4848b.toJson(writer, (JsonWriter) Integer.valueOf(value_.getAmount()));
            writer.name("currency");
            this.f4849c.toJson(writer, (JsonWriter) value_.getCurrency());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
