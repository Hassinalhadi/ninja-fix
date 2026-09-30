package io.getunleash.android.data;

import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.adapters.Rfc3339DateJsonAdapter;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import io.getunleash.android.metrics.MetricsPayload;
import io.getunleash.android.polling.ProxyResponse;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0012"}, d2 = {"Lio/getunleash/android/data/Parser;", "", "<init>", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "proxyResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getunleash/android/polling/ProxyResponse;", "getProxyResponseAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "metricsBodyAdapter", "Lio/getunleash/android/metrics/MetricsPayload;", "getMetricsBodyAdapter", "DefaultOnNullAdapterFactory", "DefaultOnNull", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Parser {

    @NotNull
    public static final Parser INSTANCE = new Parser();

    @NotNull
    private static final JsonAdapter<MetricsPayload> metricsBodyAdapter;

    @NotNull
    private static final Moshi moshi;

    @NotNull
    private static final JsonAdapter<ProxyResponse> proxyResponseAdapter;

    @Target({ElementType.TYPE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lio/getunleash/android/data/Parser$DefaultOnNull;", "", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface DefaultOnNull {
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lio/getunleash/android/data/Parser$DefaultOnNullAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", "create", "Lcom/squareup/moshi/JsonAdapter;", Constants.KEY_TYPE, "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultOnNullAdapterFactory implements JsonAdapter.Factory {
        @Override // com.squareup.moshi.JsonAdapter.Factory
        @Nullable
        public JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
            Intrinsics.echo(type, "type");
            Intrinsics.echo(annotations, "annotations");
            Intrinsics.echo(moshi, "moshi");
            final Class<?> rawType = Types.getRawType(type);
            if (rawType.isAnnotationPresent(DefaultOnNull.class)) {
                final JsonAdapter nextAdapter = moshi.nextAdapter(this, type, annotations);
                return new JsonAdapter<Object>() { // from class: io.getunleash.android.data.Parser$DefaultOnNullAdapterFactory$create$1
                    @Override // com.squareup.moshi.JsonAdapter
                    public Object fromJson(JsonReader reader) {
                        Intrinsics.echo(reader, "reader");
                        if (reader.peek() == JsonReader.Token.NULL) {
                            reader.nextNull();
                            return rawType.getDeclaredConstructor(null).newInstance(null);
                        }
                        return nextAdapter.fromJson(reader);
                    }

                    @Override // com.squareup.moshi.JsonAdapter
                    public void toJson(JsonWriter writer, Object value) {
                        Intrinsics.echo(writer, "writer");
                        nextAdapter.toJson(writer, (JsonWriter) value);
                    }
                };
            }
            return null;
        }
    }

    static {
        Moshi build = new Moshi.Builder().add((JsonAdapter.Factory) new KotlinJsonAdapterFactory()).add(Date.class, new Rfc3339DateJsonAdapter().nullSafe()).build();
        Intrinsics.delta(build, "build(...)");
        moshi = build;
        JsonAdapter<ProxyResponse> adapter = build.adapter(ProxyResponse.class);
        Intrinsics.delta(adapter, "adapter(...)");
        proxyResponseAdapter = adapter;
        JsonAdapter<MetricsPayload> adapter2 = build.adapter(MetricsPayload.class);
        Intrinsics.delta(adapter2, "adapter(...)");
        metricsBodyAdapter = adapter2;
    }

    private Parser() {
    }

    @NotNull
    public final JsonAdapter<MetricsPayload> getMetricsBodyAdapter() {
        return metricsBodyAdapter;
    }

    @NotNull
    public final Moshi getMoshi() {
        return moshi;
    }

    @NotNull
    public final JsonAdapter<ProxyResponse> getProxyResponseAdapter() {
        return proxyResponseAdapter;
    }
}
