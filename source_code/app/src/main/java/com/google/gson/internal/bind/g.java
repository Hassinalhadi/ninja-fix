package com.google.gson.internal.bind;

import androidx.appcompat.widget.P0;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g extends S8.c {

    /* renamed from: k, reason: collision with root package name */
    public static final f f8310k = new f();

    /* renamed from: l, reason: collision with root package name */
    public static final t f8311l = new t("closed");

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f8312h;

    /* renamed from: i, reason: collision with root package name */
    public String f8313i;

    /* renamed from: j, reason: collision with root package name */
    public q f8314j;

    public g() {
        super(f8310k);
        this.f8312h = new ArrayList();
        this.f8314j = r.alpha;
    }

    @Override // S8.c
    public final S8.c azure() {
        silver(r.alpha);
        return this;
    }

    @Override // S8.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f8312h;
        if (arrayList.isEmpty()) {
            arrayList.add(f8311l);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // S8.c
    public final void echo() {
        n nVar = new n();
        silver(nVar);
        this.f8312h.add(nVar);
    }

    @Override // S8.c, java.io.Flushable
    public final void flush() {
    }

    @Override // S8.c
    public final void foxtrot() {
        s sVar = new s();
        silver(sVar);
        this.f8312h.add(sVar);
    }

    @Override // S8.c
    public final void green(double d4) {
        if (this.f2054a == 1 || (!Double.isNaN(d4) && !Double.isInfinite(d4))) {
            silver(new t(Double.valueOf(d4)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d4);
        }
    }

    @Override // S8.c
    public final void indigo(long j5) {
        silver(new t(Long.valueOf(j5)));
    }

    @Override // S8.c
    public final void jade(Boolean bool) {
        if (bool == null) {
            silver(r.alpha);
        } else {
            silver(new t(bool));
        }
    }

    @Override // S8.c
    public final void juliet() {
        ArrayList arrayList = this.f8312h;
        if (!arrayList.isEmpty() && this.f8313i == null) {
            if (purple() instanceof n) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // S8.c
    public final void magenta(Number number) {
        if (number == null) {
            silver(r.alpha);
            return;
        }
        if (this.f2054a != 1) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        silver(new t(number));
    }

    @Override // S8.c
    public final void navy(String str) {
        if (str == null) {
            silver(r.alpha);
        } else {
            silver(new t(str));
        }
    }

    @Override // S8.c
    public final void olive(boolean z2) {
        silver(new t(Boolean.valueOf(z2)));
    }

    @Override // S8.c
    public final void papa() {
        ArrayList arrayList = this.f8312h;
        if (!arrayList.isEmpty() && this.f8313i == null) {
            if (purple() instanceof s) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final q pink() {
        ArrayList arrayList = this.f8312h;
        if (arrayList.isEmpty()) {
            return this.f8314j;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final q purple() {
        return (q) P0.amber(1, this.f8312h);
    }

    @Override // S8.c
    public final void quebec(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!this.f8312h.isEmpty() && this.f8313i == null) {
            if (purple() instanceof s) {
                this.f8313i = str;
                return;
            }
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        throw new IllegalStateException("Did not expect a name");
    }

    public final void silver(q qVar) {
        if (this.f8313i != null) {
            if (!(qVar instanceof r) || this.f2057d) {
                s sVar = (s) purple();
                String str = this.f8313i;
                sVar.getClass();
                sVar.alpha.put(str, qVar);
            }
            this.f8313i = null;
            return;
        }
        if (this.f8312h.isEmpty()) {
            this.f8314j = qVar;
            return;
        }
        q purple = purple();
        if (purple instanceof n) {
            n nVar = (n) purple;
            nVar.getClass();
            nVar.alpha.add(qVar);
            return;
        }
        throw new IllegalStateException();
    }
}
