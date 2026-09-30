package Tf;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public abstract class r implements Closeable, AutoCloseable {
    public final boolean alpha;
    public boolean purple;
    public int red;
    public final ReentrantLock silver = new ReentrantLock();

    public r(boolean z2) {
        this.alpha = z2;
    }

    public static p papa(r rVar) {
        if (rVar.alpha) {
            ReentrantLock reentrantLock = rVar.silver;
            reentrantLock.lock();
            try {
                if (!rVar.purple) {
                    rVar.red++;
                    reentrantLock.unlock();
                    return new p(rVar);
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    public abstract void charlie();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.silver;
        reentrantLock.lock();
        try {
            if (this.purple) {
                return;
            }
            this.purple = true;
            if (this.red != 0) {
                return;
            }
            reentrantLock.unlock();
            charlie();
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract void echo();

    public final void flush() {
        if (this.alpha) {
            ReentrantLock reentrantLock = this.silver;
            reentrantLock.lock();
            try {
                if (!this.purple) {
                    reentrantLock.unlock();
                    echo();
                    return;
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    public abstract int foxtrot(long j5, byte[] bArr, int i4, int i5);

    public abstract long golf();

    public abstract void juliet(long j5, byte[] bArr, int i4, int i5);

    public final long quebec() {
        ReentrantLock reentrantLock = this.silver;
        reentrantLock.lock();
        try {
            if (!this.purple) {
                reentrantLock.unlock();
                return golf();
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final q uniform(long j5) {
        ReentrantLock reentrantLock = this.silver;
        reentrantLock.lock();
        try {
            if (!this.purple) {
                this.red++;
                reentrantLock.unlock();
                return new q(this, j5);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
