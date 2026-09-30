package com.airbnb.lottie.parser.moshi;

import Tf.ag;
import Tf.b;
import Tf.l;
import Tf.m;
import Tf.n;
import ao.ad;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class JsonReader implements Closeable {
    private static final String[] REPLACEMENT_CHARS = new String[128];
    boolean failOnUnknown;
    boolean lenient;
    int stackSize;
    int[] scopes = new int[32];
    String[] pathNames = new String[32];
    int[] pathIndices = new int[32];

    /* loaded from: classes3.dex */
    public static final class Options {
        final ag doubleQuoteSuffix;
        final String[] strings;

        private Options(String[] strArr, ag agVar) {
            this.strings = strArr;
            this.doubleQuoteSuffix = agVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Tf.l, Tf.k, java.lang.Object] */
        public static Options of(String... strArr) {
            try {
                n[] nVarArr = new n[strArr.length];
                ?? obj = new Object();
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    JsonReader.string(obj, strArr[i4]);
                    obj.readByte();
                    nVarArr[i4] = obj.november(obj.purple);
                }
                return new Options((String[]) strArr.clone(), b.foxtrot(nVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* loaded from: classes3.dex */
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

    static {
        for (int i4 = 0; i4 <= 31; i4++) {
            REPLACEMENT_CHARS[i4] = String.format("\\u%04x", Integer.valueOf(i4));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static JsonReader of(m mVar) {
        return new JsonUtf8Reader(mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void string(l lVar, String str) throws IOException {
        String str2;
        String[] strArr = REPLACEMENT_CHARS;
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

    public abstract void beginArray() throws IOException;

    public abstract void beginObject() throws IOException;

    public abstract void endArray() throws IOException;

    public abstract void endObject() throws IOException;

    public final String getPath() {
        return JsonScope.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    public abstract boolean hasNext() throws IOException;

    public abstract boolean nextBoolean() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract String nextName() throws IOException;

    public abstract String nextString() throws IOException;

    public abstract Token peek() throws IOException;

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

    public abstract int selectName(Options options) throws IOException;

    public abstract void skipName() throws IOException;

    public abstract void skipValue() throws IOException;

    public final JsonEncodingException syntaxError(String str) throws JsonEncodingException {
        StringBuilder beige = ad.beige(str, " at path ");
        beige.append(getPath());
        throw new JsonEncodingException(beige.toString());
    }
}
