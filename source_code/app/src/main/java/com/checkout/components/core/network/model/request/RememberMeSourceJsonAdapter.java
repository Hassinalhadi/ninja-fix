package com.checkout.components.core.network.model.request;

import com.checkout.components.core.B;
import com.checkout.components.core.C;
import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.rememberme.utils.Constants;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/core/network/model/request/RememberMeSourceJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/core/network/model/request/RememberMeSource;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/core/network/model/request/RememberMeSource;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/core/network/model/request/RememberMeSource;)V", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RememberMeSourceJsonAdapter extends JsonAdapter<RememberMeSource> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f4910a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f4911b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f4912c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f4913d;
    private final JsonAdapter e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Constructor f4914f;

    public RememberMeSourceJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("token", "token_reference", "store_for_future_use", "billingAddress", Constants.CVV_TYPE);
        Intrinsics.delta(of2, "of(...)");
        this.f4910a = of2;
        this.f4911b = C.a(moshi, String.class, "token", "adapter(...)");
        this.f4912c = C.a(moshi, Boolean.TYPE, "storeForFutureUse", "adapter(...)");
        this.f4913d = C.a(moshi, BillingAddressNetworkEntity.class, "billingAddress", "adapter(...)");
        this.e = C.a(moshi, String.class, "cvvToken", "adapter(...)");
    }

    @NotNull
    public final String toString() {
        return B.a(38, "GeneratedJsonAdapter(RememberMeSource)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final RememberMeSource fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        int i4 = -1;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        BillingAddressNetworkEntity billingAddressNetworkEntity = null;
        String str3 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.f4910a);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.f4911b.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull("token", "token", reader);
                }
            } else if (selectName == 1) {
                str2 = (String) this.f4911b.fromJson(reader);
                if (str2 == null) {
                    throw Util.unexpectedNull("tokenReference", "token_reference", reader);
                }
            } else if (selectName == 2) {
                bool = (Boolean) this.f4912c.fromJson(reader);
                if (bool == null) {
                    throw Util.unexpectedNull("storeForFutureUse", "store_for_future_use", reader);
                }
            } else if (selectName == 3) {
                billingAddressNetworkEntity = (BillingAddressNetworkEntity) this.f4913d.fromJson(reader);
                i4 &= -9;
            } else if (selectName == 4) {
                str3 = (String) this.e.fromJson(reader);
                i4 &= -17;
            }
        }
        reader.endObject();
        if (i4 == -25) {
            Boolean bool2 = bool;
            if (str == null) {
                throw Util.missingProperty("token", "token", reader);
            }
            if (str2 == null) {
                throw Util.missingProperty("tokenReference", "token_reference", reader);
            }
            if (bool2 != null) {
                return new RememberMeSource(str, str2, bool2.booleanValue(), billingAddressNetworkEntity, str3);
            }
            throw Util.missingProperty("storeForFutureUse", "store_for_future_use", reader);
        }
        Boolean bool3 = bool;
        Constructor constructor = this.f4914f;
        if (constructor == null) {
            constructor = RememberMeSource.class.getDeclaredConstructor(String.class, String.class, Boolean.TYPE, BillingAddressNetworkEntity.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.f4914f = constructor;
            Intrinsics.delta(constructor, "also(...)");
        }
        if (str == null) {
            throw Util.missingProperty("token", "token", reader);
        }
        if (str2 == null) {
            throw Util.missingProperty("tokenReference", "token_reference", reader);
        }
        if (bool3 != null) {
            Object newInstance = constructor.newInstance(str, str2, bool3, billingAddressNetworkEntity, str3, Integer.valueOf(i4), null);
            Intrinsics.delta(newInstance, "newInstance(...)");
            return (RememberMeSource) newInstance;
        }
        throw Util.missingProperty("storeForFutureUse", "store_for_future_use", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable RememberMeSource value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("token");
            this.f4911b.toJson(writer, (JsonWriter) value_.getToken());
            writer.name("token_reference");
            this.f4911b.toJson(writer, (JsonWriter) value_.getTokenReference());
            writer.name("store_for_future_use");
            this.f4912c.toJson(writer, (JsonWriter) Boolean.valueOf(value_.getStoreForFutureUse()));
            writer.name("billingAddress");
            this.f4913d.toJson(writer, (JsonWriter) value_.getBillingAddress());
            writer.name(Constants.CVV_TYPE);
            this.e.toJson(writer, (JsonWriter) value_.getCvvToken());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
