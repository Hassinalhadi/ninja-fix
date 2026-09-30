package Gf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class b implements d, AutoCloseable {
    public final InputStream alpha;

    public b(InputStream input) {
        Intrinsics.echo(input, "input");
        this.alpha = input;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.alpha.close();
    }

    @Override // Gf.d
    public final long h(a sink, long j5) {
        boolean z2;
        int i4;
        Intrinsics.echo(sink, "sink");
        if (j5 == 0) {
            return 0L;
        }
        if (j5 >= 0) {
            boolean z10 = false;
            try {
                g quebec = sink.quebec(1);
                long read = this.alpha.read(quebec.alpha, quebec.charlie, (int) Math.min(j5, r4.length - r5));
                if (read == -1) {
                    i4 = 0;
                } else {
                    i4 = (int) read;
                }
                if (i4 == 1) {
                    quebec.charlie += i4;
                    sink.red += i4;
                    return read;
                }
                if (i4 >= 0 && i4 <= quebec.alpha()) {
                    if (i4 != 0) {
                        quebec.charlie += i4;
                        sink.red += i4;
                        return read;
                    }
                    if (k.charlie(quebec)) {
                        sink.golf();
                        return read;
                    }
                    return read;
                }
                throw new IllegalStateException(("Invalid number of bytes written: " + i4 + ". Should be in 0.." + quebec.alpha()).toString());
            } catch (AssertionError e) {
                if (e.getCause() != null) {
                    String message = e.getMessage();
                    if (message != null) {
                        z2 = StringsKt.beige(message, "getsockname failed", false);
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        z10 = true;
                    }
                }
                if (z10) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.kilo("byteCount (", j5, ") < 0").toString());
    }

    public final String toString() {
        return "RawSource(" + this.alpha + ')';
    }
}
