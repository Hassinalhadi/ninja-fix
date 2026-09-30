package com.google.gson.internal.bind;

import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.stream.MalformedJsonException;
import com.google.gson.t;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e extends S8.a {

    /* renamed from: m, reason: collision with root package name */
    public static final d f8304m = new d();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f8305n = new Object();

    /* renamed from: i, reason: collision with root package name */
    public Object[] f8306i;

    /* renamed from: j, reason: collision with root package name */
    public int f8307j;

    /* renamed from: k, reason: collision with root package name */
    public String[] f8308k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f8309l;

    public e(q qVar) {
        super(f8304m);
        this.f8306i = new Object[32];
        this.f8307j = 0;
        this.f8308k = new String[32];
        this.f8309l = new int[32];
        E(qVar);
    }

    public final Object B() {
        return this.f8306i[this.f8307j - 1];
    }

    public final Object D() {
        Object[] objArr = this.f8306i;
        int i4 = this.f8307j - 1;
        this.f8307j = i4;
        Object obj = objArr[i4];
        objArr[i4] = null;
        return obj;
    }

    public final void E(Object obj) {
        int i4 = this.f8307j;
        Object[] objArr = this.f8306i;
        if (i4 == objArr.length) {
            int i5 = i4 * 2;
            this.f8306i = Arrays.copyOf(objArr, i5);
            this.f8309l = Arrays.copyOf(this.f8309l, i5);
            this.f8308k = (String[]) Arrays.copyOf(this.f8308k, i5);
        }
        Object[] objArr2 = this.f8306i;
        int i10 = this.f8307j;
        this.f8307j = i10 + 1;
        objArr2[i10] = obj;
    }

    @Override // S8.a
    public final String beige() {
        return u(true);
    }

    @Override // S8.a
    public final boolean blue() {
        S8.b white = white();
        if (white != S8.b.silver && white != S8.b.purple && white != S8.b.f2050c) {
            return true;
        }
        return false;
    }

    @Override // S8.a
    public final void charlie() {
        t(S8.b.alpha);
        E(((n) B()).alpha.iterator());
        this.f8309l[this.f8307j - 1] = 0;
    }

    @Override // S8.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8306i = new Object[]{f8305n};
        this.f8307j = 1;
    }

    @Override // S8.a
    public final void echo() {
        t(S8.b.red);
        E(((com.google.gson.internal.j) ((s) B()).alpha.entrySet()).iterator());
    }

    @Override // S8.a
    public final boolean green() {
        t(S8.b.f2048a);
        boolean india = ((t) D()).india();
        int i4 = this.f8307j;
        if (i4 > 0) {
            int[] iArr = this.f8309l;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return india;
    }

    @Override // S8.a
    public final double indigo() {
        S8.b white = white();
        S8.b bVar = S8.b.yellow;
        if (white != bVar && white != S8.b.white) {
            throw new IllegalStateException("Expected " + bVar + " but was " + white + w());
        }
        double kilo = ((t) B()).kilo();
        if (this.f2047h == 1 || (!Double.isNaN(kilo) && !Double.isInfinite(kilo))) {
            D();
            int i4 = this.f8307j;
            if (i4 > 0) {
                int[] iArr = this.f8309l;
                int i5 = i4 - 1;
                iArr[i5] = iArr[i5] + 1;
            }
            return kilo;
        }
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + kilo);
    }

    @Override // S8.a
    public final int jade() {
        S8.b white = white();
        S8.b bVar = S8.b.yellow;
        if (white != bVar && white != S8.b.white) {
            throw new IllegalStateException("Expected " + bVar + " but was " + white + w());
        }
        int alpha = ((t) B()).alpha();
        D();
        int i4 = this.f8307j;
        if (i4 > 0) {
            int[] iArr = this.f8309l;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return alpha;
    }

    @Override // S8.a
    public final void juliet() {
        t(S8.b.purple);
        D();
        D();
        int i4 = this.f8307j;
        if (i4 > 0) {
            int[] iArr = this.f8309l;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    @Override // S8.a
    public final long magenta() {
        long parseLong;
        S8.b white = white();
        S8.b bVar = S8.b.yellow;
        if (white != bVar && white != S8.b.white) {
            throw new IllegalStateException("Expected " + bVar + " but was " + white + w());
        }
        t tVar = (t) B();
        if (tVar.alpha instanceof Number) {
            parseLong = tVar.lima().longValue();
        } else {
            parseLong = Long.parseLong(tVar.delta());
        }
        D();
        int i4 = this.f8307j;
        if (i4 > 0) {
            int[] iArr = this.f8309l;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return parseLong;
    }

    @Override // S8.a
    public final String navy() {
        return x(false);
    }

    @Override // S8.a
    public final void p() {
        int ordinal = white().ordinal();
        if (ordinal != 1) {
            if (ordinal != 9) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        D();
                        int i4 = this.f8307j;
                        if (i4 > 0) {
                            int[] iArr = this.f8309l;
                            int i5 = i4 - 1;
                            iArr[i5] = iArr[i5] + 1;
                            return;
                        }
                        return;
                    }
                    x(true);
                    return;
                }
                papa();
                return;
            }
            return;
        }
        juliet();
    }

    @Override // S8.a
    public final void papa() {
        t(S8.b.silver);
        this.f8308k[this.f8307j - 1] = null;
        D();
        D();
        int i4 = this.f8307j;
        if (i4 > 0) {
            int[] iArr = this.f8309l;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    @Override // S8.a
    public final void peach() {
        t(S8.b.f2049b);
        D();
        int i4 = this.f8307j;
        if (i4 > 0) {
            int[] iArr = this.f8309l;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    @Override // S8.a
    public final String purple() {
        S8.b white = white();
        S8.b bVar = S8.b.white;
        if (white != bVar && white != S8.b.yellow) {
            throw new IllegalStateException("Expected " + bVar + " but was " + white + w());
        }
        String delta = ((t) D()).delta();
        int i4 = this.f8307j;
        if (i4 > 0) {
            int[] iArr = this.f8309l;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return delta;
    }

    public final void t(S8.b bVar) {
        if (white() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + white() + w());
    }

    @Override // S8.a
    public final String toString() {
        return e.class.getSimpleName() + w();
    }

    public final String u(boolean z2) {
        StringBuilder sb2 = new StringBuilder("$");
        int i4 = 0;
        while (true) {
            int i5 = this.f8307j;
            if (i4 < i5) {
                Object[] objArr = this.f8306i;
                Object obj = objArr[i4];
                if (obj instanceof n) {
                    i4++;
                    if (i4 < i5 && (objArr[i4] instanceof Iterator)) {
                        int i10 = this.f8309l[i4];
                        if (z2 && i10 > 0 && (i4 == i5 - 1 || i4 == i5 - 2)) {
                            i10--;
                        }
                        sb2.append('[');
                        sb2.append(i10);
                        sb2.append(']');
                    }
                } else if ((obj instanceof s) && (i4 = i4 + 1) < i5 && (objArr[i4] instanceof Iterator)) {
                    sb2.append('.');
                    String str = this.f8308k[i4];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
                i4++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override // S8.a
    public final String uniform() {
        return u(false);
    }

    public final String w() {
        return " at path " + u(false);
    }

    @Override // S8.a
    public final S8.b white() {
        if (this.f8307j == 0) {
            return S8.b.f2050c;
        }
        Object B = B();
        if (B instanceof Iterator) {
            boolean z2 = this.f8306i[this.f8307j - 2] instanceof s;
            Iterator it = (Iterator) B;
            if (it.hasNext()) {
                if (z2) {
                    return S8.b.teal;
                }
                E(it.next());
                return white();
            }
            if (z2) {
                return S8.b.silver;
            }
            return S8.b.purple;
        }
        if (B instanceof s) {
            return S8.b.red;
        }
        if (B instanceof n) {
            return S8.b.alpha;
        }
        if (B instanceof t) {
            Serializable serializable = ((t) B).alpha;
            if (serializable instanceof String) {
                return S8.b.white;
            }
            if (serializable instanceof Boolean) {
                return S8.b.f2048a;
            }
            if (serializable instanceof Number) {
                return S8.b.yellow;
            }
            throw new AssertionError();
        }
        if (B instanceof r) {
            return S8.b.f2049b;
        }
        if (B == f8305n) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + B.getClass().getName() + " is not supported");
    }

    public final String x(boolean z2) {
        String str;
        t(S8.b.teal);
        Map.Entry entry = (Map.Entry) ((Iterator) B()).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.f8308k;
        int i4 = this.f8307j - 1;
        if (z2) {
            str = "<skipped>";
        } else {
            str = str2;
        }
        strArr[i4] = str;
        E(entry.getValue());
        return str2;
    }
}
