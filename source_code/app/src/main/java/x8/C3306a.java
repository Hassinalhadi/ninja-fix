package x8;

import C8.p;
import C8.r;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import pe.AbstractC2327c;

/* renamed from: x8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3306a extends InputStream implements AutoCloseable {
    public final InputStream alpha;
    public final v8.d purple;
    public final Timer red;
    public long teal;
    public long silver = -1;
    public long white = -1;

    public C3306a(InputStream inputStream, v8.d dVar, Timer timer) {
        this.red = timer;
        this.alpha = inputStream;
        this.purple = dVar;
        this.teal = ((r) dVar.silver.purple).indigo();
    }

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.alpha.available();
        } catch (IOException e) {
            long charlie = this.red.charlie();
            v8.d dVar = this.purple;
            dVar.kilo(charlie);
            g.charlie(dVar);
            throw e;
        }
    }

    public final void charlie(long j5) {
        long j6 = this.silver;
        if (j6 == -1) {
            this.silver = j5;
        } else {
            this.silver = j6 + j5;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v8.d dVar = this.purple;
        Timer timer = this.red;
        long charlie = timer.charlie();
        if (this.white == -1) {
            this.white = charlie;
        }
        try {
            this.alpha.close();
            long j5 = this.silver;
            if (j5 != -1) {
                dVar.juliet(j5);
            }
            long j6 = this.teal;
            if (j6 != -1) {
                p pVar = dVar.silver;
                pVar.india();
                r.zulu((r) pVar.purple, j6);
            }
            dVar.kilo(this.white);
            dVar.delta();
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i4) {
        this.alpha.mark(i4);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.alpha.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        Timer timer = this.red;
        v8.d dVar = this.purple;
        try {
            int read = this.alpha.read();
            long charlie = timer.charlie();
            if (this.teal == -1) {
                this.teal = charlie;
            }
            if (read == -1 && this.white == -1) {
                this.white = charlie;
                dVar.kilo(charlie);
                dVar.delta();
                return read;
            }
            charlie(1L);
            dVar.juliet(this.silver);
            return read;
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        try {
            this.alpha.reset();
        } catch (IOException e) {
            long charlie = this.red.charlie();
            v8.d dVar = this.purple;
            dVar.kilo(charlie);
            g.charlie(dVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j5) {
        Timer timer = this.red;
        v8.d dVar = this.purple;
        try {
            long skip = this.alpha.skip(j5);
            long charlie = timer.charlie();
            if (this.teal == -1) {
                this.teal = charlie;
            }
            if (skip == 0 && j5 != 0 && this.white == -1) {
                this.white = charlie;
                dVar.kilo(charlie);
                return skip;
            }
            charlie(skip);
            dVar.juliet(this.silver);
            return skip;
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        Timer timer = this.red;
        v8.d dVar = this.purple;
        try {
            int read = this.alpha.read(bArr, i4, i5);
            long charlie = timer.charlie();
            if (this.teal == -1) {
                this.teal = charlie;
            }
            if (read == -1 && this.white == -1) {
                this.white = charlie;
                dVar.kilo(charlie);
                dVar.delta();
                return read;
            }
            charlie(read);
            dVar.juliet(this.silver);
            return read;
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        Timer timer = this.red;
        v8.d dVar = this.purple;
        try {
            int read = this.alpha.read(bArr);
            long charlie = timer.charlie();
            if (this.teal == -1) {
                this.teal = charlie;
            }
            if (read == -1 && this.white == -1) {
                this.white = charlie;
                dVar.kilo(charlie);
                dVar.delta();
                return read;
            }
            charlie(read);
            dVar.juliet(this.silver);
            return read;
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }
}
