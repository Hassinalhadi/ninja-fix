package Tf;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ab implements ap, AutoCloseable {
    public final ak alpha;
    public final Inflater purple;
    public int red;
    public boolean silver;

    public ab(ak akVar, Inflater inflater) {
        this.alpha = akVar;
        this.purple = inflater;
    }

    public final long charlie(k sink, long j5) {
        Inflater inflater = this.purple;
        Intrinsics.echo(sink, "sink");
        if (j5 >= 0) {
            if (!this.silver) {
                if (j5 != 0) {
                    try {
                        al magenta = sink.magenta(1);
                        int min = (int) Math.min(j5, 8192 - magenta.charlie);
                        boolean needsInput = inflater.needsInput();
                        ak akVar = this.alpha;
                        if (needsInput && !akVar.hotel()) {
                            al alVar = akVar.purple.alpha;
                            Intrinsics.checkNotNull(alVar);
                            int i4 = alVar.charlie;
                            int i5 = alVar.bravo;
                            int i10 = i4 - i5;
                            this.red = i10;
                            inflater.setInput(alVar.alpha, i5, i10);
                        }
                        int inflate = inflater.inflate(magenta.alpha, magenta.charlie, min);
                        int i11 = this.red;
                        if (i11 != 0) {
                            int remaining = i11 - inflater.getRemaining();
                            this.red -= remaining;
                            akVar.india(remaining);
                        }
                        if (inflate > 0) {
                            magenta.charlie += inflate;
                            long j6 = inflate;
                            sink.purple += j6;
                            return j6;
                        }
                        if (magenta.bravo == magenta.charlie) {
                            sink.alpha = magenta.alpha();
                            am.alpha(magenta);
                        }
                    } catch (DataFormatException e) {
                        throw new IOException(e);
                    }
                }
                return 0L;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(A0.z.india(j5, "byteCount < 0: ").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.silver) {
            return;
        }
        this.purple.end();
        this.silver = true;
        this.alpha.close();
    }

    @Override // Tf.ap
    public final long read(k sink, long j5) {
        Intrinsics.echo(sink, "sink");
        do {
            long charlie = charlie(sink, j5);
            if (charlie > 0) {
                return charlie;
            }
            Inflater inflater = this.purple;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.alpha.hotel());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // Tf.ap
    public final as timeout() {
        return this.alpha.alpha.timeout();
    }
}
