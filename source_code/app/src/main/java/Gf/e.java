package Gf;

import A0.z;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements i, AutoCloseable {
    public final c alpha;
    public boolean purple;
    public final a red = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [Gf.a, java.lang.Object] */
    public e(c cVar) {
        this.alpha = cVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.purple) {
            return;
        }
        this.purple = true;
        this.alpha.teal = true;
        a aVar = this.red;
        aVar.india(aVar.red);
    }

    @Override // Gf.i
    public final a delta() {
        return this.red;
    }

    @Override // Gf.d
    public final long h(a sink, long j5) {
        Intrinsics.echo(sink, "sink");
        if (!this.purple) {
            if (j5 >= 0) {
                a aVar = this.red;
                if (aVar.red == 0 && this.alpha.h(aVar, 8192L) == -1) {
                    return -1L;
                }
                return aVar.h(sink, Math.min(j5, aVar.red));
            }
            throw new IllegalArgumentException(z.india(j5, "byteCount: ").toString());
        }
        throw new IllegalStateException("Source is closed.");
    }

    @Override // Gf.i
    public final boolean hotel() {
        if (!this.purple) {
            a aVar = this.red;
            if (aVar.hotel() && this.alpha.h(aVar, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Source is closed.");
    }

    @Override // Gf.i
    public final void kilo(long j5) {
        if (request(j5)) {
        } else {
            throw new EOFException(com.google.android.material.datepicker.j.kilo("Source doesn't contain required number of bytes (", j5, ")."));
        }
    }

    @Override // Gf.i
    public final e peek() {
        if (!this.purple) {
            return new e(new c(this));
        }
        throw new IllegalStateException("Source is closed.");
    }

    @Override // Gf.i
    public final byte readByte() {
        kilo(1L);
        return this.red.readByte();
    }

    @Override // Gf.i
    public final boolean request(long j5) {
        a aVar;
        if (!this.purple) {
            if (j5 < 0) {
                throw new IllegalArgumentException(z.india(j5, "byteCount: ").toString());
            }
            do {
                aVar = this.red;
                if (aVar.red >= j5) {
                    return true;
                }
            } while (this.alpha.h(aVar, 8192L) != -1);
            return false;
        }
        throw new IllegalStateException("Source is closed.");
    }

    public final String toString() {
        return "buffered(" + this.alpha + ')';
    }
}
