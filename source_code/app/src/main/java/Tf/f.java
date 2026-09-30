package Tf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements ap, AutoCloseable {
    public final /* synthetic */ int alpha = 0;
    public final Object purple;
    public final Object red;

    public f(InputStream input, as timeout) {
        Intrinsics.echo(input, "input");
        Intrinsics.echo(timeout, "timeout");
        this.purple = input;
        this.red = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj = this.purple;
        switch (this.alpha) {
            case 0:
                ap apVar = (ap) this.red;
                g gVar = (g) obj;
                gVar.enter();
                try {
                    apVar.close();
                    if (!gVar.exit()) {
                        return;
                    } else {
                        throw gVar.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!gVar.exit()) {
                        throw e;
                    }
                    throw gVar.access$newTimeoutException(e);
                } finally {
                    gVar.exit();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // Tf.ap
    public final long read(k sink, long j5) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(sink, "sink");
                ap apVar = (ap) this.red;
                g gVar = (g) this.purple;
                gVar.enter();
                try {
                    long read = apVar.read(sink, j5);
                    if (!gVar.exit()) {
                        return read;
                    }
                    throw gVar.access$newTimeoutException(null);
                } catch (IOException e) {
                    if (!gVar.exit()) {
                        throw e;
                    }
                    throw gVar.access$newTimeoutException(e);
                } finally {
                    gVar.exit();
                }
            default:
                Intrinsics.echo(sink, "sink");
                if (j5 == 0) {
                    return 0L;
                }
                if (j5 >= 0) {
                    try {
                        ((as) this.red).throwIfReached();
                        al magenta = sink.magenta(1);
                        int read2 = ((InputStream) this.purple).read(magenta.alpha, magenta.charlie, (int) Math.min(j5, 8192 - magenta.charlie));
                        if (read2 == -1) {
                            if (magenta.bravo == magenta.charlie) {
                                sink.alpha = magenta.alpha();
                                am.alpha(magenta);
                            }
                            return -1L;
                        }
                        magenta.charlie += read2;
                        long j6 = read2;
                        sink.purple += j6;
                        return j6;
                    } catch (AssertionError e4) {
                        if (Uf.n.alpha(e4)) {
                            throw new IOException(e4);
                        }
                        throw e4;
                    }
                }
                throw new IllegalArgumentException(A0.z.india(j5, "byteCount < 0: ").toString());
        }
    }

    @Override // Tf.ap
    public final as timeout() {
        switch (this.alpha) {
            case 0:
                return (g) this.purple;
            default:
                return (as) this.red;
        }
    }

    public final String toString() {
        switch (this.alpha) {
            case 0:
                return "AsyncTimeout.source(" + ((ap) this.red) + ')';
            default:
                return "source(" + ((InputStream) this.purple) + ')';
        }
    }

    public f(g gVar, ap apVar) {
        this.purple = gVar;
        this.red = apVar;
    }
}
