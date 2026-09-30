package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ab extends JsonWriter {
    public Object[] alpha;
    public String purple;

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter beginArray() {
        if (!this.promoteValueToName) {
            int i4 = this.stackSize;
            int i5 = this.flattenStackSize;
            if (i4 == i5 && this.scopes[i4 - 1] == 1) {
                this.flattenStackSize = ~i5;
                return this;
            }
            checkStack();
            ArrayList arrayList = new ArrayList();
            charlie(arrayList);
            Object[] objArr = this.alpha;
            int i10 = this.stackSize;
            objArr[i10] = arrayList;
            this.pathIndices[i10] = 0;
            pushScope(1);
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter beginObject() {
        if (!this.promoteValueToName) {
            int i4 = this.stackSize;
            int i5 = this.flattenStackSize;
            if (i4 == i5 && this.scopes[i4 - 1] == 3) {
                this.flattenStackSize = ~i5;
                return this;
            }
            checkStack();
            af afVar = new af();
            charlie(afVar);
            this.alpha[this.stackSize] = afVar;
            pushScope(3);
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    public final void charlie(Object obj) {
        String str;
        Object put;
        int peekScope = peekScope();
        int i4 = this.stackSize;
        if (i4 == 1) {
            if (peekScope == 6) {
                int i5 = i4 - 1;
                this.scopes[i5] = 7;
                this.alpha[i5] = obj;
                return;
            }
            throw new IllegalStateException("JSON must have only one top-level value.");
        }
        if (peekScope == 3 && (str = this.purple) != null) {
            if ((obj == null && !this.serializeNulls) || (put = ((Map) this.alpha[i4 - 1]).put(str, obj)) == null) {
                this.purple = null;
                return;
            }
            throw new IllegalArgumentException("Map key '" + this.purple + "' has multiple values at path " + getPath() + ": " + put + " and " + obj);
        }
        if (peekScope == 1) {
            ((List) this.alpha[i4 - 1]).add(obj);
        } else {
            if (peekScope == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            throw new IllegalStateException("Nesting problem.");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i4 = this.stackSize;
        if (i4 <= 1 && (i4 != 1 || this.scopes[i4 - 1] == 7)) {
            this.stackSize = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter endArray() {
        if (peekScope() == 1) {
            int i4 = this.stackSize;
            int i5 = this.flattenStackSize;
            if (i4 == (~i5)) {
                this.flattenStackSize = ~i5;
                return this;
            }
            int i10 = i4 - 1;
            this.stackSize = i10;
            this.alpha[i10] = null;
            int[] iArr = this.pathIndices;
            int i11 = i4 - 2;
            iArr[i11] = iArr[i11] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter endObject() {
        if (peekScope() == 3) {
            if (this.purple == null) {
                int i4 = this.stackSize;
                int i5 = this.flattenStackSize;
                if (i4 == (~i5)) {
                    this.flattenStackSize = ~i5;
                    return this;
                }
                this.promoteValueToName = false;
                int i10 = i4 - 1;
                this.stackSize = i10;
                this.alpha[i10] = null;
                this.pathNames[i10] = null;
                int[] iArr = this.pathIndices;
                int i11 = i4 - 2;
                iArr[i11] = iArr[i11] + 1;
                return this;
            }
            throw new IllegalStateException("Dangling name: " + this.purple);
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.stackSize != 0) {
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter name(String str) {
        if (str != null) {
            if (this.stackSize != 0) {
                if (peekScope() == 3 && this.purple == null && !this.promoteValueToName) {
                    this.purple = str;
                    this.pathNames[this.stackSize - 1] = str;
                    return this;
                }
                throw new IllegalStateException("Nesting problem.");
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new NullPointerException("name == null");
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter nullValue() {
        if (!this.promoteValueToName) {
            charlie(null);
            int[] iArr = this.pathIndices;
            int i4 = this.stackSize - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(String str) {
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            name(str);
            return this;
        }
        charlie(str);
        int[] iArr = this.pathIndices;
        int i4 = this.stackSize - 1;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Tf.k, java.lang.Object] */
    @Override // com.squareup.moshi.JsonWriter
    public final Tf.l valueSink() {
        if (!this.promoteValueToName) {
            if (peekScope() != 9) {
                pushScope(9);
                ?? obj = new Object();
                return Tf.b.bravo(new aa(this, obj, obj));
            }
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(boolean z2) {
        if (!this.promoteValueToName) {
            charlie(Boolean.valueOf(z2));
            int[] iArr = this.pathIndices;
            int i4 = this.stackSize - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(Boolean bool) {
        if (!this.promoteValueToName) {
            charlie(bool);
            int[] iArr = this.pathIndices;
            int i4 = this.stackSize - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(double d4) {
        if (!this.lenient && (Double.isNaN(d4) || d4 == Double.NEGATIVE_INFINITY || d4 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d4);
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            name(Double.toString(d4));
            return this;
        }
        charlie(Double.valueOf(d4));
        int[] iArr = this.pathIndices;
        int i4 = this.stackSize - 1;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(long j5) {
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            name(Long.toString(j5));
            return this;
        }
        charlie(Long.valueOf(j5));
        int[] iArr = this.pathIndices;
        int i4 = this.stackSize - 1;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(Number number) {
        if (!(number instanceof Byte) && !(number instanceof Short) && !(number instanceof Integer) && !(number instanceof Long)) {
            if ((number instanceof Float) || (number instanceof Double)) {
                value(number.doubleValue());
                return this;
            }
            if (number == null) {
                nullValue();
                return this;
            }
            BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
            if (this.promoteValueToName) {
                this.promoteValueToName = false;
                name(bigDecimal.toString());
                return this;
            }
            charlie(bigDecimal);
            int[] iArr = this.pathIndices;
            int i4 = this.stackSize - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        value(number.longValue());
        return this;
    }
}
