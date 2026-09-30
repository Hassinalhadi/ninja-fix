package Tf;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o implements ao, AutoCloseable {
    public final aj alpha;
    public final Deflater purple;
    public boolean red;

    public o(aj ajVar, Deflater deflater) {
        this.alpha = ajVar;
        this.purple = deflater;
    }

    public final void charlie(boolean z2) {
        al magenta;
        int deflate;
        aj ajVar = this.alpha;
        k kVar = ajVar.purple;
        while (true) {
            magenta = kVar.magenta(1);
            Deflater deflater = this.purple;
            byte[] bArr = magenta.alpha;
            if (z2) {
                try {
                    int i4 = magenta.charlie;
                    deflate = deflater.deflate(bArr, i4, 8192 - i4, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                int i5 = magenta.charlie;
                deflate = deflater.deflate(bArr, i5, 8192 - i5);
            }
            if (deflate > 0) {
                magenta.charlie += deflate;
                kVar.purple += deflate;
                ajVar.cyan();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (magenta.bravo == magenta.charlie) {
            kVar.alpha = magenta.alpha();
            am.alpha(magenta);
        }
    }

    @Override // Tf.ao, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.purple;
        if (!this.red) {
            try {
                deflater.finish();
                charlie(false);
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                deflater.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.alpha.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.red = true;
            if (th == null) {
            } else {
                throw th;
            }
        }
    }

    @Override // Tf.ao, java.io.Flushable
    public final void flush() {
        charlie(true);
        this.alpha.flush();
    }

    @Override // Tf.ao
    public final as timeout() {
        return this.alpha.alpha.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.alpha + ')';
    }

    @Override // Tf.ao
    public final void write(k source, long j5) {
        Intrinsics.echo(source, "source");
        b.echo(source.purple, 0L, j5);
        while (true) {
            Deflater deflater = this.purple;
            if (j5 > 0) {
                al alVar = source.alpha;
                Intrinsics.checkNotNull(alVar);
                int min = (int) Math.min(j5, alVar.charlie - alVar.bravo);
                deflater.setInput(alVar.alpha, alVar.bravo, min);
                charlie(false);
                long j6 = min;
                source.purple -= j6;
                int i4 = alVar.bravo + min;
                alVar.bravo = i4;
                if (i4 == alVar.charlie) {
                    source.alpha = alVar.alpha();
                    am.alpha(alVar);
                }
                j5 -= j6;
            } else {
                deflater.setInput(Uf.b.bravo, 0, 0);
                return;
            }
        }
    }
}
