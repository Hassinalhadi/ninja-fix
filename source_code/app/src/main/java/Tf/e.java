package Tf;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements ao, AutoCloseable {
    public final /* synthetic */ int alpha = 0;
    public final Object purple;
    public final Object red;

    public e(OutputStream out, as asVar) {
        Intrinsics.echo(out, "out");
        this.purple = out;
        this.red = asVar;
    }

    @Override // Tf.ao, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.alpha) {
            case 0:
                ao aoVar = (ao) this.red;
                g gVar = (g) this.purple;
                gVar.enter();
                try {
                    aoVar.close();
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
                ((OutputStream) this.purple).close();
                return;
        }
    }

    @Override // Tf.ao, java.io.Flushable
    public final void flush() {
        switch (this.alpha) {
            case 0:
                ao aoVar = (ao) this.red;
                g gVar = (g) this.purple;
                gVar.enter();
                try {
                    aoVar.flush();
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
                ((OutputStream) this.purple).flush();
                return;
        }
    }

    @Override // Tf.ao
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
                return "AsyncTimeout.sink(" + ((ao) this.red) + ')';
            default:
                return "sink(" + ((OutputStream) this.purple) + ')';
        }
    }

    @Override // Tf.ao
    public final void write(k source, long j5) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(source, "source");
                b.echo(source.purple, 0L, j5);
                long j6 = j5;
                while (true) {
                    long j7 = 0;
                    if (j6 > 0) {
                        al alVar = source.alpha;
                        Intrinsics.checkNotNull(alVar);
                        while (true) {
                            if (j7 < 65536) {
                                j7 += alVar.charlie - alVar.bravo;
                                if (j7 >= j6) {
                                    j7 = j6;
                                } else {
                                    alVar = alVar.foxtrot;
                                    Intrinsics.checkNotNull(alVar);
                                }
                            }
                        }
                        ao aoVar = (ao) this.red;
                        g gVar = (g) this.purple;
                        gVar.enter();
                        try {
                            try {
                                aoVar.write(source, j7);
                                if (!gVar.exit()) {
                                    j6 -= j7;
                                } else {
                                    throw gVar.access$newTimeoutException(null);
                                }
                            } catch (IOException e) {
                                if (!gVar.exit()) {
                                    throw e;
                                }
                                throw gVar.access$newTimeoutException(e);
                            }
                        } catch (Throwable th) {
                            gVar.exit();
                            throw th;
                        }
                    } else {
                        return;
                    }
                }
            default:
                Intrinsics.echo(source, "source");
                b.echo(source.purple, 0L, j5);
                while (j5 > 0) {
                    ((as) this.red).throwIfReached();
                    al alVar2 = source.alpha;
                    Intrinsics.checkNotNull(alVar2);
                    int min = (int) Math.min(j5, alVar2.charlie - alVar2.bravo);
                    ((OutputStream) this.purple).write(alVar2.alpha, alVar2.bravo, min);
                    int i4 = alVar2.bravo + min;
                    alVar2.bravo = i4;
                    long j10 = min;
                    j5 -= j10;
                    source.purple -= j10;
                    if (i4 == alVar2.charlie) {
                        source.alpha = alVar2.alpha();
                        am.alpha(alVar2);
                    }
                }
                return;
        }
    }

    public e(g gVar, ao aoVar) {
        this.purple = gVar;
        this.red = aoVar;
    }
}
