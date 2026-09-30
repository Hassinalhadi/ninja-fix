package com.checkout.components.interfaces.model.paymentsession;

import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/model/paymentsession/CardParametersJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;)V", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardParametersJsonAdapter extends JsonAdapter<CardParameters> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f5497a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f5498b;

    public CardParametersJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("allowed_auth_methods", "allowed_card_networks");
        Intrinsics.delta(of2, "of(...)");
        this.f5497a = of2;
        JsonAdapter adapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), u.alpha, "allowedAuthMethods");
        Intrinsics.delta(adapter, "adapter(...)");
        this.f5498b = adapter;
    }

    @NotNull
    public final String toString() {
        return j.india(36, "GeneratedJsonAdapter(CardParameters)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public final CardParameters fromJson(@NotNull JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        List list = null;
        List list2 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.f5497a);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                list = (List) this.f5498b.fromJson(reader);
                if (list == null) {
                    throw Util.unexpectedNull("allowedAuthMethods", "allowed_auth_methods", reader);
                }
            } else if (selectName == 1 && (list2 = (List) this.f5498b.fromJson(reader)) == null) {
                throw Util.unexpectedNull("allowedCardNetworks", "allowed_card_networks", reader);
            }
        }
        reader.endObject();
        if (list == null) {
            throw Util.missingProperty("allowedAuthMethods", "allowed_auth_methods", reader);
        }
        if (list2 != null) {
            return new CardParameters(list, list2);
        }
        throw Util.missingProperty("allowedCardNetworks", "allowed_card_networks", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(@NotNull JsonWriter writer, @Nullable CardParameters value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("allowed_auth_methods");
            this.f5498b.toJson(writer, (JsonWriter) value_.getAllowedAuthMethods());
            writer.name("allowed_card_networks");
            this.f5498b.toJson(writer, (JsonWriter) value_.getAllowedCardNetworks());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
