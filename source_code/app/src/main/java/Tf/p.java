package Tf;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p implements ao, AutoCloseable {
    public final r alpha;
    public long purple;
    public boolean red;

    public p(r fileHandle) {
        Intrinsics.echo(fileHandle, "fileHandle");
        this.alpha = fileHandle;
        this.purple = 0L;
    }

    @Override // Tf.ao, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // Tf.ao, java.io.Flushable
    public final void flush() {
        if (!this.red) {
            this.alpha.echo();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.ao
    public final as timeout() {
        return as.NONE;
    }

    @Override // Tf.ao
    public final void write(k source, long j5) {
        Intrinsics.echo(source, "source");
        if (!this.red) {
            long j6 = this.purple;
            r rVar = this.alpha;
            rVar.getClass();
            b.echo(source.purple, 0L, j5);
            long j7 = j6 + j5;
            long j10 = j6;
            while (j10 < j7) {
                al alVar = source.alpha;
                Intrinsics.checkNotNull(alVar);
                int min = (int) Math.min(j7 - j10, alVar.charlie - alVar.bravo);
                rVar.juliet(j10, alVar.alpha, alVar.bravo, min);
                int i4 = alVar.bravo + min;
                alVar.bravo = i4;
                long j11 = min;
                j10 += j11;
                source.purple -= j11;
                if (i4 == alVar.charlie) {
                    source.alpha = alVar.alpha();
                    am.alpha(alVar);
                }
            }
            this.purple += j5;
            return;
        }
        throw new IllegalStateException("closed");
    }
}
