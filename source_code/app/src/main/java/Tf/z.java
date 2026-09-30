package Tf;

import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z implements ao, AutoCloseable {
    public final aj alpha;
    public final Deflater purple;
    public final o red;
    public boolean silver;
    public final CRC32 teal;

    public z(l sink) {
        Intrinsics.echo(sink, "sink");
        aj ajVar = new aj(sink);
        this.alpha = ajVar;
        Deflater deflater = new Deflater(-1, true);
        this.purple = deflater;
        this.red = new o(ajVar, deflater);
        this.teal = new CRC32();
        k kVar = ajVar.purple;
        kVar.d(8075);
        kVar.pink(8);
        kVar.pink(0);
        kVar.white(0);
        kVar.pink(0);
        kVar.pink(0);
    }

    @Override // Tf.ao, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int value;
        Deflater deflater = this.purple;
        aj ajVar = this.alpha;
        if (!this.silver) {
            try {
                o oVar = this.red;
                oVar.purple.finish();
                oVar.charlie(false);
                value = (int) this.teal.getValue();
            } catch (Throwable th) {
                th = th;
            }
            if (!ajVar.red) {
                int golf = b.golf(value);
                k kVar = ajVar.purple;
                kVar.white(golf);
                ajVar.cyan();
                int bytesRead = (int) deflater.getBytesRead();
                if (!ajVar.red) {
                    kVar.white(b.golf(bytesRead));
                    ajVar.cyan();
                    th = null;
                    try {
                        deflater.end();
                    } catch (Throwable th2) {
                        if (th == null) {
                            th = th2;
                        }
                    }
                    try {
                        ajVar.close();
                    } catch (Throwable th3) {
                        if (th == null) {
                            th = th3;
                        }
                    }
                    this.silver = true;
                    if (th == null) {
                        return;
                    } else {
                        throw th;
                    }
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalStateException("closed");
        }
    }

    @Override // Tf.ao, java.io.Flushable
    public final void flush() {
        this.red.flush();
    }

    @Override // Tf.ao
    public final as timeout() {
        return this.alpha.alpha.timeout();
    }

    @Override // Tf.ao
    public final void write(k source, long j5) {
        Intrinsics.echo(source, "source");
        if (j5 >= 0) {
            if (j5 == 0) {
                return;
            }
            al alVar = source.alpha;
            Intrinsics.checkNotNull(alVar);
            long j6 = j5;
            while (j6 > 0) {
                int min = (int) Math.min(j6, alVar.charlie - alVar.bravo);
                this.teal.update(alVar.alpha, alVar.bravo, min);
                j6 -= min;
                alVar = alVar.foxtrot;
                Intrinsics.checkNotNull(alVar);
            }
            this.red.write(source, j5);
            return;
        }
        throw new IllegalArgumentException(A0.z.india(j5, "byteCount < 0: ").toString());
    }
}
