package com.squareup.moshi;

import com.google.maps.android.BuildConfig;
import com.squareup.moshi.JsonReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class y extends JsonReader {
    public static final Object purple = new Object();
    public Object[] alpha;

    @Override // com.squareup.moshi.JsonReader
    public final void beginArray() {
        List list = (List) foxtrot(List.class, JsonReader.Token.BEGIN_ARRAY);
        x xVar = new x(JsonReader.Token.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.alpha;
        int i4 = this.stackSize;
        objArr[i4 - 1] = xVar;
        this.scopes[i4 - 1] = 1;
        this.pathIndices[i4 - 1] = 0;
        if (xVar.hasNext()) {
            charlie(xVar.next());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void beginObject() {
        Map map = (Map) foxtrot(Map.class, JsonReader.Token.BEGIN_OBJECT);
        x xVar = new x(JsonReader.Token.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.alpha;
        int i4 = this.stackSize;
        objArr[i4 - 1] = xVar;
        this.scopes[i4 - 1] = 3;
        if (xVar.hasNext()) {
            charlie(xVar.next());
        }
    }

    public final void charlie(Object obj) {
        int i4 = this.stackSize;
        if (i4 == this.alpha.length) {
            if (i4 != 256) {
                int[] iArr = this.scopes;
                this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.pathNames;
                this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.pathIndices;
                this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
                Object[] objArr = this.alpha;
                this.alpha = Arrays.copyOf(objArr, objArr.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
        }
        Object[] objArr2 = this.alpha;
        int i5 = this.stackSize;
        this.stackSize = i5 + 1;
        objArr2[i5] = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Arrays.fill(this.alpha, 0, this.stackSize, (Object) null);
        this.alpha[0] = purple;
        this.scopes[0] = 8;
        this.stackSize = 1;
    }

    public final void echo() {
        int i4 = this.stackSize;
        int i5 = i4 - 1;
        this.stackSize = i5;
        Object[] objArr = this.alpha;
        objArr[i5] = null;
        this.scopes[i5] = 0;
        if (i5 > 0) {
            int[] iArr = this.pathIndices;
            int i10 = i4 - 2;
            iArr[i10] = iArr[i10] + 1;
            Object obj = objArr[i4 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    charlie(it.next());
                }
            }
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endArray() {
        JsonReader.Token token = JsonReader.Token.END_ARRAY;
        x xVar = (x) foxtrot(x.class, token);
        if (xVar.alpha == token && !xVar.hasNext()) {
            echo();
            return;
        }
        throw typeMismatch(xVar, token);
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endObject() {
        JsonReader.Token token = JsonReader.Token.END_OBJECT;
        x xVar = (x) foxtrot(x.class, token);
        if (xVar.alpha == token && !xVar.hasNext()) {
            this.pathNames[this.stackSize - 1] = null;
            echo();
            return;
        }
        throw typeMismatch(xVar, token);
    }

    public final Object foxtrot(Class cls, JsonReader.Token token) {
        Object obj;
        int i4 = this.stackSize;
        if (i4 != 0) {
            obj = this.alpha[i4 - 1];
        } else {
            obj = null;
        }
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && token == JsonReader.Token.NULL) {
            return null;
        }
        if (obj == purple) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw typeMismatch(obj, token);
    }

    @Override // com.squareup.moshi.JsonReader
    public final boolean hasNext() {
        int i4 = this.stackSize;
        if (i4 == 0) {
            return false;
        }
        Object obj = this.alpha[i4 - 1];
        if ((obj instanceof Iterator) && !((Iterator) obj).hasNext()) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.moshi.JsonReader
    public final boolean nextBoolean() {
        Boolean bool = (Boolean) foxtrot(Boolean.class, JsonReader.Token.BOOLEAN);
        echo();
        return bool.booleanValue();
    }

    @Override // com.squareup.moshi.JsonReader
    public final double nextDouble() {
        double parseDouble;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object foxtrot = foxtrot(Object.class, token);
        if (foxtrot instanceof Number) {
            parseDouble = ((Number) foxtrot).doubleValue();
        } else if (foxtrot instanceof String) {
            try {
                parseDouble = Double.parseDouble((String) foxtrot);
            } catch (NumberFormatException unused) {
                throw typeMismatch(foxtrot, JsonReader.Token.NUMBER);
            }
        } else {
            throw typeMismatch(foxtrot, token);
        }
        if (!this.lenient && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        }
        echo();
        return parseDouble;
    }

    @Override // com.squareup.moshi.JsonReader
    public final int nextInt() {
        int intValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object foxtrot = foxtrot(Object.class, token);
        if (foxtrot instanceof Number) {
            intValueExact = ((Number) foxtrot).intValue();
        } else if (foxtrot instanceof String) {
            try {
                try {
                    intValueExact = Integer.parseInt((String) foxtrot);
                } catch (NumberFormatException unused) {
                    throw typeMismatch(foxtrot, JsonReader.Token.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                intValueExact = new BigDecimal((String) foxtrot).intValueExact();
            }
        } else {
            throw typeMismatch(foxtrot, token);
        }
        echo();
        return intValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public final long nextLong() {
        long longValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object foxtrot = foxtrot(Object.class, token);
        if (foxtrot instanceof Number) {
            longValueExact = ((Number) foxtrot).longValue();
        } else if (foxtrot instanceof String) {
            try {
                try {
                    longValueExact = Long.parseLong((String) foxtrot);
                } catch (NumberFormatException unused) {
                    throw typeMismatch(foxtrot, JsonReader.Token.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                longValueExact = new BigDecimal((String) foxtrot).longValueExact();
            }
        } else {
            throw typeMismatch(foxtrot, token);
        }
        echo();
        return longValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public final String nextName() {
        JsonReader.Token token = JsonReader.Token.NAME;
        Map.Entry entry = (Map.Entry) foxtrot(Map.Entry.class, token);
        Object key = entry.getKey();
        if (key instanceof String) {
            String str = (String) key;
            this.alpha[this.stackSize - 1] = entry.getValue();
            this.pathNames[this.stackSize - 2] = str;
            return str;
        }
        throw typeMismatch(key, token);
    }

    @Override // com.squareup.moshi.JsonReader
    public final Object nextNull() {
        foxtrot(Void.class, JsonReader.Token.NULL);
        echo();
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Tf.m, Tf.l, java.lang.Object] */
    @Override // com.squareup.moshi.JsonReader
    public final Tf.m nextSource() {
        Object readJsonValue = readJsonValue();
        ?? obj = new Object();
        JsonWriter of2 = JsonWriter.of(obj);
        try {
            of2.jsonValue(readJsonValue);
            of2.close();
            return obj;
        } catch (Throwable th) {
            if (of2 != null) {
                try {
                    of2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final String nextString() {
        Object obj;
        int i4 = this.stackSize;
        if (i4 != 0) {
            obj = this.alpha[i4 - 1];
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            echo();
            return (String) obj;
        }
        if (obj instanceof Number) {
            echo();
            return obj.toString();
        }
        if (obj == purple) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw typeMismatch(obj, JsonReader.Token.STRING);
    }

    @Override // com.squareup.moshi.JsonReader
    public final JsonReader.Token peek() {
        int i4 = this.stackSize;
        if (i4 == 0) {
            return JsonReader.Token.END_DOCUMENT;
        }
        Object obj = this.alpha[i4 - 1];
        if (obj instanceof x) {
            return ((x) obj).alpha;
        }
        if (obj instanceof List) {
            return JsonReader.Token.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return JsonReader.Token.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return JsonReader.Token.NAME;
        }
        if (obj instanceof String) {
            return JsonReader.Token.STRING;
        }
        if (obj instanceof Boolean) {
            return JsonReader.Token.BOOLEAN;
        }
        if (obj instanceof Number) {
            return JsonReader.Token.NUMBER;
        }
        if (obj == null) {
            return JsonReader.Token.NULL;
        }
        if (obj == purple) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw typeMismatch(obj, "a JSON value");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.moshi.JsonReader, com.squareup.moshi.y] */
    @Override // com.squareup.moshi.JsonReader
    public final JsonReader peekJson() {
        ?? jsonReader = new JsonReader(this);
        jsonReader.alpha = (Object[]) this.alpha.clone();
        for (int i4 = 0; i4 < jsonReader.stackSize; i4++) {
            Object[] objArr = jsonReader.alpha;
            Object obj = objArr[i4];
            if (obj instanceof x) {
                x xVar = (x) obj;
                objArr[i4] = new x(xVar.alpha, xVar.purple, xVar.red);
            }
        }
        return jsonReader;
    }

    @Override // com.squareup.moshi.JsonReader
    public final void promoteNameToValue() {
        if (hasNext()) {
            charlie(nextName());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final int selectName(JsonReader.Options options) {
        JsonReader.Token token = JsonReader.Token.NAME;
        Map.Entry entry = (Map.Entry) foxtrot(Map.Entry.class, token);
        Object key = entry.getKey();
        if (key instanceof String) {
            String str = (String) key;
            int length = options.strings.length;
            for (int i4 = 0; i4 < length; i4++) {
                if (options.strings[i4].equals(str)) {
                    this.alpha[this.stackSize - 1] = entry.getValue();
                    this.pathNames[this.stackSize - 2] = str;
                    return i4;
                }
            }
            return -1;
        }
        throw typeMismatch(key, token);
    }

    @Override // com.squareup.moshi.JsonReader
    public final int selectString(JsonReader.Options options) {
        Object obj;
        int i4 = this.stackSize;
        if (i4 != 0) {
            obj = this.alpha[i4 - 1];
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            if (obj != purple) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = options.strings.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (options.strings[i5].equals(str)) {
                echo();
                return i5;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public final void skipName() {
        if (!this.failOnUnknown) {
            this.alpha[this.stackSize - 1] = ((Map.Entry) foxtrot(Map.Entry.class, JsonReader.Token.NAME)).getValue();
            this.pathNames[this.stackSize - 2] = BuildConfig.TRAVIS;
        } else {
            JsonReader.Token peek = peek();
            nextName();
            throw new JsonDataException("Cannot skip unexpected " + peek + " at " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void skipValue() {
        Object obj;
        if (!this.failOnUnknown) {
            int i4 = this.stackSize;
            if (i4 > 1) {
                this.pathNames[i4 - 2] = BuildConfig.TRAVIS;
            }
            if (i4 != 0) {
                obj = this.alpha[i4 - 1];
            } else {
                obj = null;
            }
            if (!(obj instanceof x)) {
                if (obj instanceof Map.Entry) {
                    Object[] objArr = this.alpha;
                    objArr[i4 - 1] = ((Map.Entry) objArr[i4 - 1]).getValue();
                    return;
                } else {
                    if (i4 > 0) {
                        echo();
                        return;
                    }
                    throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                }
            }
            throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
        }
        throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
    }
}
