package com.checkout.components.card.operations.tokenisation.network.model;

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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWalletJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;)V", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConsumerWalletJsonAdapter extends JsonAdapter<ConsumerWallet> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f4326a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f4327b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f4328c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Constructor f4329d;

    public ConsumerWalletJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("set_as_default_payment_method", "shipping");
        Intrinsics.delta(of2, "of(...)");
        this.f4326a = of2;
        u uVar = u.alpha;
        JsonAdapter adapter = moshi.adapter(Boolean.TYPE, uVar, "setAsDefaultPaymentMethod");
        Intrinsics.delta(adapter, "adapter(...)");
        this.f4327b = adapter;
        JsonAdapter adapter2 = moshi.adapter(Shipping.class, uVar, "shipping");
        Intrinsics.delta(adapter2, "adapter(...)");
        this.f4328c = adapter2;
    }

    @NotNull
    public final String toString() {
        return j.india(36, "GeneratedJsonAdapter(ConsumerWallet)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final ConsumerWallet fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Shipping shipping = null;
        int i4 = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.f4326a);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                bool = (Boolean) this.f4327b.fromJson(reader);
                if (bool == null) {
                    throw Util.unexpectedNull("setAsDefaultPaymentMethod", "set_as_default_payment_method", reader);
                }
            } else if (selectName == 1) {
                shipping = (Shipping) this.f4328c.fromJson(reader);
                i4 = -3;
            }
        }
        reader.endObject();
        if (i4 == -3) {
            if (bool != null) {
                return new ConsumerWallet(bool.booleanValue(), shipping);
            }
            throw Util.missingProperty("setAsDefaultPaymentMethod", "set_as_default_payment_method", reader);
        }
        Constructor constructor = this.f4329d;
        if (constructor == null) {
            constructor = ConsumerWallet.class.getDeclaredConstructor(Boolean.TYPE, Shipping.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.f4329d = constructor;
            Intrinsics.delta(constructor, "also(...)");
        }
        if (bool != null) {
            Object newInstance = constructor.newInstance(bool, shipping, Integer.valueOf(i4), null);
            Intrinsics.delta(newInstance, "newInstance(...)");
            return (ConsumerWallet) newInstance;
        }
        throw Util.missingProperty("setAsDefaultPaymentMethod", "set_as_default_payment_method", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable ConsumerWallet value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("set_as_default_payment_method");
            this.f4327b.toJson(writer, (JsonWriter) Boolean.valueOf(value_.getSetAsDefaultPaymentMethod()));
            writer.name("shipping");
            this.f4328c.toJson(writer, (JsonWriter) value_.getShipping());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
