package com.checkout.components.card.operations.tokenisation.network.model;

import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;)V", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TokenRequestJsonAdapter extends JsonAdapter<TokenRequest> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f4346a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f4347b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f4348c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter f4349d;
    private final JsonAdapter e;

    /* renamed from: f, reason: collision with root package name */
    private final JsonAdapter f4350f;

    /* renamed from: g, reason: collision with root package name */
    private final JsonAdapter f4351g;

    /* renamed from: h, reason: collision with root package name */
    private volatile Constructor f4352h;

    public TokenRequestJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of(Constants.KEY_TYPE, CTVariableUtils.NUMBER, "expiry_month", "expiry_year", "name", com.checkout.components.rememberme.utils.Constants.CVV_TYPE, "billing_address", "phone", "consumer_wallet");
        Intrinsics.delta(of2, "of(...)");
        this.f4346a = of2;
        u uVar = u.alpha;
        JsonAdapter adapter = moshi.adapter(String.class, uVar, Constants.KEY_TYPE);
        Intrinsics.delta(adapter, "adapter(...)");
        this.f4347b = adapter;
        JsonAdapter adapter2 = moshi.adapter(Integer.TYPE, uVar, "expiryMonth");
        Intrinsics.delta(adapter2, "adapter(...)");
        this.f4348c = adapter2;
        JsonAdapter adapter3 = moshi.adapter(String.class, uVar, "name");
        Intrinsics.delta(adapter3, "adapter(...)");
        this.f4349d = adapter3;
        JsonAdapter adapter4 = moshi.adapter(BillingAddressNetworkEntity.class, uVar, "billingAddress");
        Intrinsics.delta(adapter4, "adapter(...)");
        this.e = adapter4;
        JsonAdapter adapter5 = moshi.adapter(PhoneNetworkEntity.class, uVar, "phone");
        Intrinsics.delta(adapter5, "adapter(...)");
        this.f4350f = adapter5;
        JsonAdapter adapter6 = moshi.adapter(ConsumerWallet.class, uVar, "consumerWallet");
        Intrinsics.delta(adapter6, "adapter(...)");
        this.f4351g = adapter6;
    }

    @NotNull
    public final String toString() {
        return j.india(34, "GeneratedJsonAdapter(TokenRequest)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final TokenRequest fromJson(@NotNull JsonReader reader) {
        char c3;
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        int i4 = -1;
        Integer num = null;
        String str = null;
        String str2 = null;
        Integer num2 = null;
        String str3 = null;
        String str4 = null;
        BillingAddressNetworkEntity billingAddressNetworkEntity = null;
        PhoneNetworkEntity phoneNetworkEntity = null;
        ConsumerWallet consumerWallet = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.f4346a)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.f4347b.fromJson(reader);
                    if (str == null) {
                        throw Util.unexpectedNull(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
                    }
                    break;
                case 1:
                    str2 = (String) this.f4347b.fromJson(reader);
                    if (str2 == null) {
                        throw Util.unexpectedNull(CTVariableUtils.NUMBER, CTVariableUtils.NUMBER, reader);
                    }
                    break;
                case 2:
                    num = (Integer) this.f4348c.fromJson(reader);
                    if (num == null) {
                        throw Util.unexpectedNull("expiryMonth", "expiry_month", reader);
                    }
                    break;
                case 3:
                    num2 = (Integer) this.f4348c.fromJson(reader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("expiryYear", "expiry_year", reader);
                    }
                    break;
                case 4:
                    str3 = (String) this.f4349d.fromJson(reader);
                    i4 &= -17;
                    break;
                case 5:
                    str4 = (String) this.f4349d.fromJson(reader);
                    i4 &= -33;
                    break;
                case 6:
                    billingAddressNetworkEntity = (BillingAddressNetworkEntity) this.e.fromJson(reader);
                    i4 &= -65;
                    break;
                case 7:
                    phoneNetworkEntity = (PhoneNetworkEntity) this.f4350f.fromJson(reader);
                    i4 &= -129;
                    break;
                case 8:
                    consumerWallet = (ConsumerWallet) this.f4351g.fromJson(reader);
                    i4 &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i4 == -497) {
            Integer num3 = num;
            if (str == null) {
                throw Util.missingProperty(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
            }
            if (str2 == null) {
                throw Util.missingProperty(CTVariableUtils.NUMBER, CTVariableUtils.NUMBER, reader);
            }
            if (num3 != null) {
                Integer num4 = num2;
                int intValue = num3.intValue();
                if (num4 != null) {
                    return new TokenRequest(str, str2, intValue, num4.intValue(), str3, str4, billingAddressNetworkEntity, phoneNetworkEntity, consumerWallet);
                }
                throw Util.missingProperty("expiryYear", "expiry_year", reader);
            }
            throw Util.missingProperty("expiryMonth", "expiry_month", reader);
        }
        Integer num5 = num;
        Integer num6 = num2;
        Constructor constructor = this.f4352h;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            c3 = 2;
            constructor = TokenRequest.class.getDeclaredConstructor(String.class, String.class, cls, cls, String.class, String.class, BillingAddressNetworkEntity.class, PhoneNetworkEntity.class, ConsumerWallet.class, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.f4352h = constructor;
            Intrinsics.delta(constructor, "also(...)");
        } else {
            c3 = 2;
        }
        if (str == null) {
            throw Util.missingProperty(Constants.KEY_TYPE, Constants.KEY_TYPE, reader);
        }
        if (str2 == null) {
            throw Util.missingProperty(CTVariableUtils.NUMBER, CTVariableUtils.NUMBER, reader);
        }
        if (num5 == null) {
            throw Util.missingProperty("expiryMonth", "expiry_month", reader);
        }
        if (num6 != null) {
            Integer valueOf = Integer.valueOf(i4);
            Object[] objArr = new Object[11];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[c3] = num5;
            objArr[3] = num6;
            objArr[4] = str3;
            objArr[5] = str4;
            objArr[6] = billingAddressNetworkEntity;
            objArr[7] = phoneNetworkEntity;
            objArr[8] = consumerWallet;
            objArr[9] = valueOf;
            objArr[10] = null;
            Object newInstance = constructor.newInstance(objArr);
            Intrinsics.delta(newInstance, "newInstance(...)");
            return (TokenRequest) newInstance;
        }
        throw Util.missingProperty("expiryYear", "expiry_year", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable TokenRequest value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name(Constants.KEY_TYPE);
            this.f4347b.toJson(writer, (JsonWriter) value_.getType());
            writer.name(CTVariableUtils.NUMBER);
            this.f4347b.toJson(writer, (JsonWriter) value_.getNumber());
            writer.name("expiry_month");
            this.f4348c.toJson(writer, (JsonWriter) Integer.valueOf(value_.getExpiryMonth()));
            writer.name("expiry_year");
            this.f4348c.toJson(writer, (JsonWriter) Integer.valueOf(value_.getExpiryYear()));
            writer.name("name");
            this.f4349d.toJson(writer, (JsonWriter) value_.getName());
            writer.name(com.checkout.components.rememberme.utils.Constants.CVV_TYPE);
            this.f4349d.toJson(writer, (JsonWriter) value_.getCvv());
            writer.name("billing_address");
            this.e.toJson(writer, (JsonWriter) value_.getBillingAddress());
            writer.name("phone");
            this.f4350f.toJson(writer, (JsonWriter) value_.getPhone());
            writer.name("consumer_wallet");
            this.f4351g.toJson(writer, (JsonWriter) value_.getConsumerWallet());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
