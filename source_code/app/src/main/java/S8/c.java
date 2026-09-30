package S8;

import com.clevertap.android.sdk.Constants;
import com.google.gson.k;
import com.google.maps.android.BuildConfig;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class c implements Closeable, Flushable, AutoCloseable {
    public static final Pattern e = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f2052f = new String[128];

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2053g;

    /* renamed from: a, reason: collision with root package name */
    public int f2054a;
    public final Writer alpha;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2055b;

    /* renamed from: c, reason: collision with root package name */
    public String f2056c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2057d;
    public int[] purple;
    public int red;
    public k silver;
    public String teal;
    public String white;
    public boolean yellow;

    static {
        for (int i4 = 0; i4 <= 31; i4++) {
            f2052f[i4] = String.format("\\u%04x", Integer.valueOf(i4));
        }
        String[] strArr = f2052f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f2053g = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.purple = iArr;
        this.red = 0;
        if (iArr.length == 0) {
            this.purple = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.purple;
        int i4 = this.red;
        this.red = i4 + 1;
        iArr2[i4] = 6;
        this.f2054a = 2;
        this.f2057d = true;
        Objects.requireNonNull(writer, "out == null");
        this.alpha = writer;
        blue(k.delta);
    }

    public c azure() {
        if (this.f2056c != null) {
            if (this.f2057d) {
                peach();
            } else {
                this.f2056c = null;
                return this;
            }
        }
        charlie();
        this.alpha.write(BuildConfig.TRAVIS);
        return this;
    }

    public final int beige() {
        int i4 = this.red;
        if (i4 != 0) {
            return this.purple[i4 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void blue(k kVar) {
        boolean z2;
        Objects.requireNonNull(kVar);
        this.silver = kVar;
        this.white = Constants.SEPARATOR_COMMA;
        if (kVar.charlie) {
            this.teal = ": ";
            if (kVar.alpha.isEmpty()) {
                this.white = ", ";
            }
        } else {
            this.teal = ":";
        }
        if (this.silver.alpha.isEmpty() && this.silver.bravo.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.yellow = z2;
    }

    public final void charlie() {
        int beige = beige();
        if (beige != 1) {
            Writer writer = this.alpha;
            if (beige != 2) {
                if (beige != 4) {
                    if (beige != 6) {
                        if (beige == 7) {
                            if (this.f2054a != 1) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.purple[this.red - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.teal);
                this.purple[this.red - 1] = 5;
                return;
            }
            writer.append((CharSequence) this.white);
            uniform();
            return;
        }
        this.purple[this.red - 1] = 2;
        uniform();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.alpha.close();
        int i4 = this.red;
        if (i4 <= 1 && (i4 != 1 || this.purple[i4 - 1] == 7)) {
            this.red = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void crimson(int i4) {
        if (i4 != 0) {
            this.f2054a = i4;
            return;
        }
        throw null;
    }

    public void echo() {
        peach();
        charlie();
        int i4 = this.red;
        int[] iArr = this.purple;
        if (i4 == iArr.length) {
            this.purple = Arrays.copyOf(iArr, i4 * 2);
        }
        int[] iArr2 = this.purple;
        int i5 = this.red;
        this.red = i5 + 1;
        iArr2[i5] = 1;
        this.alpha.write(91);
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.red != 0) {
            this.alpha.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void foxtrot() {
        peach();
        charlie();
        int i4 = this.red;
        int[] iArr = this.purple;
        if (i4 == iArr.length) {
            this.purple = Arrays.copyOf(iArr, i4 * 2);
        }
        int[] iArr2 = this.purple;
        int i5 = this.red;
        this.red = i5 + 1;
        iArr2[i5] = 3;
        this.alpha.write(123);
    }

    public final void golf(char c3, int i4, int i5) {
        int beige = beige();
        if (beige != i5 && beige != i4) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f2056c == null) {
            this.red--;
            if (beige == i5) {
                uniform();
            }
            this.alpha.write(c3);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.f2056c);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gray(String str) {
        String[] strArr;
        String str2;
        if (this.f2055b) {
            strArr = f2053g;
        } else {
            strArr = f2052f;
        }
        Writer writer = this.alpha;
        writer.write(34);
        int length = str.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i4 < i5) {
                    writer.write(str, i4, i5 - i4);
                }
                writer.write(str2);
                i4 = i5 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i4 < i5) {
                }
                writer.write(str2);
                i4 = i5 + 1;
            }
        }
        if (i4 < length) {
            writer.write(str, i4, length - i4);
        }
        writer.write(34);
    }

    public void green(double d4) {
        peach();
        if (this.f2054a != 1 && (Double.isNaN(d4) || Double.isInfinite(d4))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d4);
        }
        charlie();
        this.alpha.append((CharSequence) Double.toString(d4));
    }

    public void indigo(long j5) {
        peach();
        charlie();
        this.alpha.write(Long.toString(j5));
    }

    public void jade(Boolean bool) {
        String str;
        if (bool == null) {
            azure();
            return;
        }
        peach();
        charlie();
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        this.alpha.write(str);
    }

    public void juliet() {
        golf(']', 1, 2);
    }

    public void magenta(Number number) {
        if (number == null) {
            azure();
            return;
        }
        peach();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                if (cls != Float.class && cls != Double.class && !e.matcher(obj).matches()) {
                    throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
                }
            } else if (this.f2054a != 1) {
                throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
            }
        }
        charlie();
        this.alpha.append((CharSequence) obj);
    }

    public void navy(String str) {
        if (str == null) {
            azure();
            return;
        }
        peach();
        charlie();
        gray(str);
    }

    public void olive(boolean z2) {
        String str;
        peach();
        charlie();
        if (z2) {
            str = "true";
        } else {
            str = "false";
        }
        this.alpha.write(str);
    }

    public void papa() {
        golf('}', 3, 5);
    }

    public final void peach() {
        if (this.f2056c != null) {
            int beige = beige();
            if (beige == 5) {
                this.alpha.write(this.white);
            } else if (beige != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            uniform();
            this.purple[this.red - 1] = 4;
            gray(this.f2056c);
            this.f2056c = null;
        }
    }

    public void quebec(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f2056c == null) {
            int beige = beige();
            if (beige != 3 && beige != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            this.f2056c = str;
            return;
        }
        throw new IllegalStateException("Already wrote a name, expecting a value.");
    }

    public final void uniform() {
        if (!this.yellow) {
            String str = this.silver.alpha;
            Writer writer = this.alpha;
            writer.write(str);
            int i4 = this.red;
            for (int i5 = 1; i5 < i4; i5++) {
                writer.write(this.silver.bravo);
            }
        }
    }
}
