package com.squareup.moshi;

import com.google.maps.android.BuildConfig;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class w extends JsonWriter {
    public static final String[] silver = new String[128];
    public final Tf.l alpha;
    public String purple = ":";
    public String red;

    static {
        for (int i4 = 0; i4 <= 31; i4++) {
            silver[i4] = String.format("\\u%04x", Integer.valueOf(i4));
        }
        String[] strArr = silver;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public w(Tf.l lVar) {
        if (lVar != null) {
            this.alpha = lVar;
            pushScope(6);
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void juliet(Tf.l lVar, String str) {
        String str2;
        String[] strArr = silver;
        lVar.black(34);
        int length = str.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i4 < i5) {
                    lVar.teal(i4, i5, str);
                }
                lVar.lavender(str2);
                i4 = i5 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i4 < i5) {
                }
                lVar.lavender(str2);
                i4 = i5 + 1;
            }
        }
        if (i4 < length) {
            lVar.teal(i4, length, str);
        }
        lVar.black(34);
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter beginArray() {
        if (!this.promoteValueToName) {
            papa();
            golf('[', 1, 2);
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter beginObject() {
        if (!this.promoteValueToName) {
            papa();
            golf('{', 3, 5);
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    public final void charlie() {
        int peekScope = peekScope();
        int i4 = 2;
        if (peekScope != 1) {
            Tf.l lVar = this.alpha;
            if (peekScope != 2) {
                if (peekScope != 4) {
                    if (peekScope != 9) {
                        i4 = 7;
                        if (peekScope != 6) {
                            if (peekScope == 7) {
                                if (!this.lenient) {
                                    throw new IllegalStateException("JSON must have only one top-level value.");
                                }
                            } else {
                                throw new IllegalStateException("Nesting problem.");
                            }
                        }
                    } else {
                        throw new IllegalStateException("Sink from valueSink() was not closed");
                    }
                } else {
                    lVar.lavender(this.purple);
                    i4 = 5;
                }
                replaceTop(i4);
            }
            lVar.black(44);
        }
        foxtrot();
        replaceTop(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.alpha.close();
        int i4 = this.stackSize;
        if (i4 <= 1 && (i4 != 1 || this.scopes[i4 - 1] == 7)) {
            this.stackSize = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void echo(char c3, int i4, int i5) {
        int peekScope = peekScope();
        if (peekScope != i5 && peekScope != i4) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.red == null) {
            int i10 = this.stackSize;
            int i11 = ~this.flattenStackSize;
            if (i10 == i11) {
                this.flattenStackSize = i11;
                return;
            }
            int i12 = i10 - 1;
            this.stackSize = i12;
            this.pathNames[i12] = null;
            int[] iArr = this.pathIndices;
            int i13 = i10 - 2;
            iArr[i13] = iArr[i13] + 1;
            if (peekScope == i5) {
                foxtrot();
            }
            this.alpha.black(c3);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.red);
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter endArray() {
        echo(']', 1, 2);
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter endObject() {
        this.promoteValueToName = false;
        echo('}', 3, 5);
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.stackSize != 0) {
            this.alpha.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void foxtrot() {
        if (this.indent != null) {
            Tf.l lVar = this.alpha;
            lVar.black(10);
            int i4 = this.stackSize;
            for (int i5 = 1; i5 < i4; i5++) {
                lVar.lavender(this.indent);
            }
        }
    }

    public final void golf(char c3, int i4, int i5) {
        int i10;
        int i11 = this.stackSize;
        int i12 = this.flattenStackSize;
        if (i11 == i12 && ((i10 = this.scopes[i11 - 1]) == i4 || i10 == i5)) {
            this.flattenStackSize = ~i12;
            return;
        }
        charlie();
        checkStack();
        pushScope(i4);
        this.pathIndices[this.stackSize - 1] = 0;
        this.alpha.black(c3);
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter name(String str) {
        if (str != null) {
            if (this.stackSize != 0) {
                int peekScope = peekScope();
                if ((peekScope == 3 || peekScope == 5) && this.red == null && !this.promoteValueToName) {
                    this.red = str;
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
            if (this.red != null) {
                if (this.serializeNulls) {
                    papa();
                } else {
                    this.red = null;
                    return this;
                }
            }
            charlie();
            this.alpha.lavender(BuildConfig.TRAVIS);
            int[] iArr = this.pathIndices;
            int i4 = this.stackSize - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
    }

    public final void papa() {
        if (this.red != null) {
            int peekScope = peekScope();
            Tf.l lVar = this.alpha;
            if (peekScope == 5) {
                lVar.black(44);
            } else if (peekScope != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            foxtrot();
            replaceTop(4);
            juliet(lVar, this.red);
            this.red = null;
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public final void setIndent(String str) {
        String str2;
        super.setIndent(str);
        if (!str.isEmpty()) {
            str2 = ": ";
        } else {
            str2 = ":";
        }
        this.purple = str2;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(String str) {
        if (str == null) {
            nullValue();
            return this;
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            name(str);
            return this;
        }
        papa();
        charlie();
        juliet(this.alpha, str);
        int[] iArr = this.pathIndices;
        int i4 = this.stackSize - 1;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final Tf.l valueSink() {
        if (!this.promoteValueToName) {
            papa();
            charlie();
            pushScope(9);
            return Tf.b.bravo(new v(this));
        }
        throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(boolean z2) {
        if (!this.promoteValueToName) {
            papa();
            charlie();
            this.alpha.lavender(z2 ? "true" : "false");
            int[] iArr = this.pathIndices;
            int i4 = this.stackSize - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(Boolean bool) {
        if (bool == null) {
            nullValue();
            return this;
        }
        value(bool.booleanValue());
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(double d4) {
        if (!this.lenient && (Double.isNaN(d4) || Double.isInfinite(d4))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d4);
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            name(Double.toString(d4));
            return this;
        }
        papa();
        charlie();
        this.alpha.lavender(Double.toString(d4));
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
        papa();
        charlie();
        this.alpha.lavender(Long.toString(j5));
        int[] iArr = this.pathIndices;
        int i4 = this.stackSize - 1;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final JsonWriter value(Number number) {
        if (number == null) {
            nullValue();
            return this;
        }
        String obj = number.toString();
        if (!this.lenient && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            name(obj);
            return this;
        }
        papa();
        charlie();
        this.alpha.lavender(obj);
        int[] iArr = this.pathIndices;
        int i4 = this.stackSize - 1;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }
}
