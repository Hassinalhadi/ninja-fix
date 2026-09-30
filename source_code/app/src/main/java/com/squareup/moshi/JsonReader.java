package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import s6.AbstractC2674i0;

/* loaded from: classes2.dex */
public abstract class JsonReader implements Closeable {
    boolean failOnUnknown;
    boolean lenient;
    int[] pathIndices;
    String[] pathNames;
    int[] scopes;
    int stackSize;
    private Map<Class<?>, Object> tags;

    /* loaded from: classes2.dex */
    public static final class Options {
        final Tf.ag doubleQuoteSuffix;
        final String[] strings;

        private Options(String[] strArr, Tf.ag agVar) {
            this.strings = strArr;
            this.doubleQuoteSuffix = agVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Tf.l, Tf.k, java.lang.Object] */
        public static Options of(String... strArr) {
            try {
                Tf.n[] nVarArr = new Tf.n[strArr.length];
                ?? obj = new Object();
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    w.juliet(obj, strArr[i4]);
                    obj.readByte();
                    nVarArr[i4] = obj.november(obj.purple);
                }
                return new Options((String[]) strArr.clone(), Tf.b.foxtrot(nVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public List<String> strings() {
            return Collections.unmodifiableList(Arrays.asList(this.strings));
        }
    }

    /* loaded from: classes2.dex */
    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public JsonReader() {
        this.scopes = new int[32];
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
    }

    public static JsonReader of(Tf.m mVar) {
        return new u(mVar);
    }

    public abstract void beginArray() throws IOException;

    public abstract void beginObject() throws IOException;

    public abstract void endArray() throws IOException;

    public abstract void endObject() throws IOException;

    public final boolean failOnUnknown() {
        return this.failOnUnknown;
    }

    public final String getPath() {
        return AbstractC2674i0.alpha(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    public abstract boolean hasNext() throws IOException;

    public final boolean isLenient() {
        return this.lenient;
    }

    public abstract boolean nextBoolean() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract long nextLong() throws IOException;

    public abstract String nextName() throws IOException;

    public abstract <T> T nextNull() throws IOException;

    public abstract Tf.m nextSource() throws IOException;

    public abstract String nextString() throws IOException;

    public abstract Token peek() throws IOException;

    public abstract JsonReader peekJson();

    public abstract void promoteNameToValue() throws IOException;

    public final void pushScope(int i4) {
        int i5 = this.stackSize;
        int[] iArr = this.scopes;
        if (i5 == iArr.length) {
            if (i5 != 256) {
                this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.pathNames;
                this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.pathIndices;
                this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.scopes;
        int i10 = this.stackSize;
        this.stackSize = i10 + 1;
        iArr3[i10] = i4;
    }

    public final Object readJsonValue() throws IOException {
        switch (t.alpha[peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                beginArray();
                while (hasNext()) {
                    arrayList.add(readJsonValue());
                }
                endArray();
                return arrayList;
            case 2:
                af afVar = new af();
                beginObject();
                while (hasNext()) {
                    String nextName = nextName();
                    Object readJsonValue = readJsonValue();
                    Object put = afVar.put(nextName, readJsonValue);
                    if (put != null) {
                        StringBuilder victor = Q0.c.victor("Map key '", nextName, "' has multiple values at path ");
                        victor.append(getPath());
                        victor.append(": ");
                        victor.append(put);
                        victor.append(" and ");
                        victor.append(readJsonValue);
                        throw new JsonDataException(victor.toString());
                    }
                }
                endObject();
                return afVar;
            case 3:
                return nextString();
            case 4:
                return Double.valueOf(nextDouble());
            case 5:
                return Boolean.valueOf(nextBoolean());
            case 6:
                return nextNull();
            default:
                throw new IllegalStateException("Expected a value but was " + peek() + " at path " + getPath());
        }
    }

    public abstract int selectName(Options options) throws IOException;

    public abstract int selectString(Options options) throws IOException;

    public final void setFailOnUnknown(boolean z2) {
        this.failOnUnknown = z2;
    }

    public final void setLenient(boolean z2) {
        this.lenient = z2;
    }

    public final <T> void setTag(Class<T> cls, T t5) {
        if (cls.isAssignableFrom(t5.getClass())) {
            if (this.tags == null) {
                this.tags = new LinkedHashMap();
            }
            this.tags.put(cls, t5);
            return;
        }
        throw new IllegalArgumentException("Tag value must be of type ".concat(cls.getName()));
    }

    public abstract void skipName() throws IOException;

    public abstract void skipValue() throws IOException;

    public final JsonEncodingException syntaxError(String str) throws JsonEncodingException {
        StringBuilder beige = ao.ad.beige(str, " at path ");
        beige.append(getPath());
        throw new JsonEncodingException(beige.toString());
    }

    public final <T> T tag(Class<T> cls) {
        Map<Class<?>, Object> map = this.tags;
        if (map == null) {
            return null;
        }
        return (T) map.get(cls);
    }

    public final JsonDataException typeMismatch(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + getPath());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + getPath());
    }

    public JsonReader(JsonReader jsonReader) {
        this.stackSize = jsonReader.stackSize;
        this.scopes = (int[]) jsonReader.scopes.clone();
        this.pathNames = (String[]) jsonReader.pathNames.clone();
        this.pathIndices = (int[]) jsonReader.pathIndices.clone();
        this.lenient = jsonReader.lenient;
        this.failOnUnknown = jsonReader.failOnUnknown;
    }
}
