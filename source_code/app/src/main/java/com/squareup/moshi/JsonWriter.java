package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import s6.AbstractC2674i0;

/* loaded from: classes2.dex */
public abstract class JsonWriter implements Closeable, Flushable {
    String indent;
    boolean lenient;
    boolean promoteValueToName;
    boolean serializeNulls;
    private Map<Class<?>, Object> tags;
    int stackSize = 0;
    int[] scopes = new int[32];
    String[] pathNames = new String[32];
    int[] pathIndices = new int[32];
    int flattenStackSize = -1;

    public static JsonWriter of(Tf.l lVar) {
        return new w(lVar);
    }

    public abstract JsonWriter beginArray() throws IOException;

    public final int beginFlatten() {
        int peekScope = peekScope();
        if (peekScope != 5 && peekScope != 3 && peekScope != 2 && peekScope != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i4 = this.flattenStackSize;
        this.flattenStackSize = this.stackSize;
        return i4;
    }

    public abstract JsonWriter beginObject() throws IOException;

    public final boolean checkStack() {
        int i4 = this.stackSize;
        int[] iArr = this.scopes;
        if (i4 != iArr.length) {
            return false;
        }
        if (i4 != 256) {
            this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.pathNames;
            this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.pathIndices;
            this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (this instanceof ab) {
                ab abVar = (ab) this;
                Object[] objArr = abVar.alpha;
                abVar.alpha = Arrays.copyOf(objArr, objArr.length * 2);
                return true;
            }
            return true;
        }
        throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
    }

    public abstract JsonWriter endArray() throws IOException;

    public final void endFlatten(int i4) {
        this.flattenStackSize = i4;
    }

    public abstract JsonWriter endObject() throws IOException;

    public final String getIndent() {
        String str = this.indent;
        if (str != null) {
            return str;
        }
        return "";
    }

    public final String getPath() {
        return AbstractC2674i0.alpha(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final boolean isLenient() {
        return this.lenient;
    }

    public final JsonWriter jsonValue(Object obj) throws IOException {
        String concat;
        if (obj instanceof Map) {
            beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    if (key == null) {
                        concat = "Map keys must be non-null";
                    } else {
                        concat = "Map keys must be of type String: ".concat(key.getClass().getName());
                    }
                    throw new IllegalArgumentException(concat);
                }
                name((String) key);
                jsonValue(entry.getValue());
            }
            endObject();
            return this;
        }
        if (obj instanceof List) {
            beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jsonValue(it.next());
            }
            endArray();
            return this;
        }
        if (obj instanceof String) {
            value((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            value(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Double) {
            value(((Double) obj).doubleValue());
            return this;
        }
        if (obj instanceof Long) {
            value(((Long) obj).longValue());
            return this;
        }
        if (obj instanceof Number) {
            value((Number) obj);
            return this;
        }
        if (obj == null) {
            nullValue();
            return this;
        }
        throw new IllegalArgumentException("Unsupported type: ".concat(obj.getClass().getName()));
    }

    public abstract JsonWriter name(String str) throws IOException;

    public abstract JsonWriter nullValue() throws IOException;

    public final int peekScope() {
        int i4 = this.stackSize;
        if (i4 != 0) {
            return this.scopes[i4 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void promoteValueToName() throws IOException {
        int peekScope = peekScope();
        if (peekScope != 5 && peekScope != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.promoteValueToName = true;
    }

    public final void pushScope(int i4) {
        int[] iArr = this.scopes;
        int i5 = this.stackSize;
        this.stackSize = i5 + 1;
        iArr[i5] = i4;
    }

    public final void replaceTop(int i4) {
        this.scopes[this.stackSize - 1] = i4;
    }

    public void setIndent(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.indent = str;
    }

    public final void setLenient(boolean z2) {
        this.lenient = z2;
    }

    public final void setSerializeNulls(boolean z2) {
        this.serializeNulls = z2;
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

    public final <T> T tag(Class<T> cls) {
        Map<Class<?>, Object> map = this.tags;
        if (map == null) {
            return null;
        }
        return (T) map.get(cls);
    }

    public abstract JsonWriter value(double d4) throws IOException;

    public abstract JsonWriter value(long j5) throws IOException;

    public final JsonWriter value(Tf.m mVar) throws IOException {
        if (!this.promoteValueToName) {
            Tf.l valueSink = valueSink();
            try {
                mVar.g(valueSink);
                if (valueSink != null) {
                    valueSink.close();
                }
                return this;
            } catch (Throwable th) {
                if (valueSink != null) {
                    try {
                        valueSink.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IllegalStateException("BufferedSource cannot be used as a map key in JSON at path " + getPath());
    }

    public abstract JsonWriter value(Boolean bool) throws IOException;

    public abstract JsonWriter value(Number number) throws IOException;

    public abstract JsonWriter value(String str) throws IOException;

    public abstract JsonWriter value(boolean z2) throws IOException;

    public abstract Tf.l valueSink() throws IOException;
}
