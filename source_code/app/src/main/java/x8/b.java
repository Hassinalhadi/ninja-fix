package x8;

import C8.p;
import C8.r;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class b extends OutputStream implements AutoCloseable {
    public final OutputStream alpha;
    public final Timer purple;
    public final v8.d red;
    public long silver = -1;

    public b(OutputStream outputStream, v8.d dVar, Timer timer) {
        this.alpha = outputStream;
        this.red = dVar;
        this.purple = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j5 = this.silver;
        v8.d dVar = this.red;
        if (j5 != -1) {
            dVar.golf(j5);
        }
        Timer timer = this.purple;
        long charlie = timer.charlie();
        p pVar = dVar.silver;
        pVar.india();
        r.yankee((r) pVar.purple, charlie);
        try {
            this.alpha.close();
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            this.alpha.flush();
        } catch (IOException e) {
            long charlie = this.purple.charlie();
            v8.d dVar = this.red;
            dVar.kilo(charlie);
            g.charlie(dVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i4) {
        v8.d dVar = this.red;
        try {
            this.alpha.write(i4);
            long j5 = this.silver + 1;
            this.silver = j5;
            dVar.golf(j5);
        } catch (IOException e) {
            AbstractC2327c.black(this.purple, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        v8.d dVar = this.red;
        try {
            this.alpha.write(bArr);
            long length = this.silver + bArr.length;
            this.silver = length;
            dVar.golf(length);
        } catch (IOException e) {
            AbstractC2327c.black(this.purple, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i4, int i5) {
        v8.d dVar = this.red;
        try {
            this.alpha.write(bArr, i4, i5);
            long j5 = this.silver + i5;
            this.silver = j5;
            dVar.golf(j5);
        } catch (IOException e) {
            AbstractC2327c.black(this.purple, dVar, dVar);
            throw e;
        }
    }
}
