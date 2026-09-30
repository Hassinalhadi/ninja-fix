package Tf;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q implements ap, AutoCloseable {
    public final r alpha;
    public long purple;
    public boolean red;

    public q(r fileHandle, long j5) {
        Intrinsics.echo(fileHandle, "fileHandle");
        this.alpha = fileHandle;
        this.purple = j5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.red) {
            return;
        }
        this.red = true;
        r rVar = this.alpha;
        ReentrantLock reentrantLock = rVar.silver;
        reentrantLock.lock();
        try {
            int i4 = rVar.red - 1;
            rVar.red = i4;
            if (i4 == 0) {
                if (rVar.purple) {
                    reentrantLock.unlock();
                    rVar.charlie();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // Tf.ap
    public final long read(k sink, long j5) {
        long j6;
        long j7;
        Intrinsics.echo(sink, "sink");
        if (!this.red) {
            long j10 = this.purple;
            r rVar = this.alpha;
            rVar.getClass();
            if (j5 >= 0) {
                long j11 = j5 + j10;
                long j12 = j10;
                while (true) {
                    if (j12 < j11) {
                        al magenta = sink.magenta(1);
                        j6 = -1;
                        long j13 = j11;
                        int foxtrot = rVar.foxtrot(j12, magenta.alpha, magenta.charlie, (int) Math.min(j11 - j12, 8192 - r10));
                        if (foxtrot == -1) {
                            if (magenta.bravo == magenta.charlie) {
                                sink.alpha = magenta.alpha();
                                am.alpha(magenta);
                            }
                            if (j10 == j12) {
                                j7 = -1;
                            }
                        } else {
                            magenta.charlie += foxtrot;
                            long j14 = foxtrot;
                            j12 += j14;
                            sink.purple += j14;
                            j11 = j13;
                        }
                    } else {
                        j6 = -1;
                        break;
                    }
                }
                j7 = j12 - j10;
                if (j7 != j6) {
                    this.purple += j7;
                }
                return j7;
            }
            throw new IllegalArgumentException(A0.z.india(j5, "byteCount < 0: ").toString());
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.ap
    public final as timeout() {
        return as.NONE;
    }
}
