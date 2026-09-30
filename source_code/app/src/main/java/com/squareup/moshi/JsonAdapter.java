package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class JsonAdapter<T> {

    /* loaded from: classes2.dex */
    public interface Factory {
        JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi);
    }

    public final JsonAdapter<T> failOnUnknown() {
        return new r(this, 2);
    }

    public final T fromJson(Tf.m mVar) throws IOException {
        return fromJson(JsonReader.of(mVar));
    }

    public abstract T fromJson(JsonReader jsonReader) throws IOException;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.moshi.JsonReader, com.squareup.moshi.y] */
    public final T fromJsonValue(Object obj) {
        ?? jsonReader = new JsonReader();
        int[] iArr = jsonReader.scopes;
        int i4 = jsonReader.stackSize;
        iArr[i4] = 7;
        Object[] objArr = new Object[32];
        jsonReader.alpha = objArr;
        jsonReader.stackSize = i4 + 1;
        objArr[i4] = obj;
        try {
            return fromJson((JsonReader) jsonReader);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public JsonAdapter<T> indent(String str) {
        if (str != null) {
            return new s(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    public boolean isLenient() {
        return false;
    }

    public final JsonAdapter<T> lenient() {
        return new r(this, 1);
    }

    public final JsonAdapter<T> nonNull() {
        if (this instanceof NonNullJsonAdapter) {
            return this;
        }
        return new NonNullJsonAdapter(this);
    }

    public final JsonAdapter<T> nullSafe() {
        if (this instanceof NullSafeJsonAdapter) {
            return this;
        }
        return new NullSafeJsonAdapter(this);
    }

    public final JsonAdapter<T> serializeNulls() {
        return new r(this, 0);
    }

    public final void toJson(Tf.l lVar, T t5) throws IOException {
        toJson(JsonWriter.of(lVar), (JsonWriter) t5);
    }

    public abstract void toJson(JsonWriter jsonWriter, T t5) throws IOException;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.moshi.ab, com.squareup.moshi.JsonWriter] */
    public final Object toJsonValue(T t5) {
        ?? jsonWriter = new JsonWriter();
        jsonWriter.alpha = new Object[32];
        jsonWriter.pushScope(6);
        try {
            toJson((JsonWriter) jsonWriter, t5);
            int i4 = jsonWriter.stackSize;
            if (i4 <= 1 && (i4 != 1 || jsonWriter.scopes[i4 - 1] == 7)) {
                return jsonWriter.alpha[0];
            }
            throw new IllegalStateException("Incomplete document");
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Tf.m, Tf.k, java.lang.Object] */
    public final T fromJson(String str) throws IOException {
        ?? obj = new Object();
        obj.n(str);
        JsonReader of2 = JsonReader.of(obj);
        T fromJson = fromJson(of2);
        if (isLenient() || of2.peek() == JsonReader.Token.END_DOCUMENT) {
            return fromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Tf.l, Tf.k, java.lang.Object] */
    public final String toJson(T t5) {
        ?? obj = new Object();
        try {
            toJson((Tf.l) obj, t5);
            return obj.green();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
