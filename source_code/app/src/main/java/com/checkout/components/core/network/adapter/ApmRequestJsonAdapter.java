package com.checkout.components.core.network.adapter;

import com.checkout.components.core.network.model.request.PayPaymentSessionRequest;
import com.checkout.components.core.network.model.request.Risk;
import com.checkout.components.core.network.model.request.SessionMetaData;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/core/network/adapter/ApmRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", "create", "Lcom/squareup/moshi/JsonAdapter;", Constants.KEY_TYPE, "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "Companion", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApmRequestJsonAdapter implements JsonAdapter.Factory {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a */
    private static final Set f4838a = ArraysKt.g(new String[]{Constants.KEY_TYPE, "session_metadata", "risk"});

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/checkout/components/core/network/adapter/ApmRequestJsonAdapter$Companion;", "", "", "", "RESERVED_KEYS", "Ljava/util/Set;", "getRESERVED_KEYS$core_standardRelease", "()Ljava/util/Set;", "getRESERVED_KEYS$core_standardRelease$annotations", "()V", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ void getRESERVED_KEYS$core_standardRelease$annotations() {
        }

        @NotNull
        public final Set<String> getRESERVED_KEYS$core_standardRelease() {
            return ApmRequestJsonAdapter.f4838a;
        }
    }

    public static final /* synthetic */ Set access$getRESERVED_KEYS$cp() {
        return f4838a;
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    @Nullable
    public final JsonAdapter<?> create(@NotNull Type r32, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
        Intrinsics.echo(r32, "type");
        Intrinsics.echo(annotations, "annotations");
        Intrinsics.echo(moshi, "moshi");
        if (!Intrinsics.areEqual(r32, PayPaymentSessionRequest.Apm.class)) {
            return null;
        }
        final JsonAdapter adapter = moshi.adapter(SessionMetaData.class);
        final JsonAdapter adapter2 = moshi.adapter(Risk.class);
        final JsonAdapter adapter3 = moshi.adapter(Object.class, u.alpha);
        return new JsonAdapter<PayPaymentSessionRequest.Apm>() { // from class: com.checkout.components.core.network.adapter.ApmRequestJsonAdapter$create$1
            @Override // com.squareup.moshi.JsonAdapter
            public final /* bridge */ /* synthetic */ PayPaymentSessionRequest.Apm fromJson(JsonReader jsonReader) {
                fromJson(jsonReader);
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.moshi.JsonAdapter
            public final PayPaymentSessionRequest.Apm fromJson(JsonReader reader) {
                Intrinsics.echo(reader, "reader");
                throw new UnsupportedOperationException("Deserialization of Apm requests is not supported");
            }

            @Override // com.squareup.moshi.JsonAdapter
            public final void toJson(JsonWriter writer, PayPaymentSessionRequest.Apm value) {
                Intrinsics.echo(writer, "writer");
                if (value == null) {
                    writer.nullValue();
                    return;
                }
                writer.beginObject();
                writer.name(Constants.KEY_TYPE).value(value.getType());
                SessionMetaData sessionMetaData = value.getSessionMetaData();
                if (sessionMetaData != null) {
                    JsonAdapter jsonAdapter = adapter;
                    writer.name("session_metadata");
                    jsonAdapter.toJson(writer, (JsonWriter) sessionMetaData);
                }
                Risk risk = value.getRisk();
                if (risk != null) {
                    JsonAdapter jsonAdapter2 = adapter2;
                    writer.name("risk");
                    jsonAdapter2.toJson(writer, (JsonWriter) risk);
                }
                for (Map.Entry<String, Object> entry : value.getFields().entrySet()) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    writer.name(key);
                    JsonAdapter.this.toJson(writer, (JsonWriter) value2);
                }
                writer.endObject();
            }
        };
    }
}
