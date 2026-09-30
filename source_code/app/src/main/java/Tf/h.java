package Tf;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h implements ao, AutoCloseable {
    @Override // Tf.ao, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // Tf.ao, java.io.Flushable
    public final void flush() {
    }

    @Override // Tf.ao
    public final as timeout() {
        return as.NONE;
    }

    @Override // Tf.ao
    public final void write(k source, long j5) {
        Intrinsics.echo(source, "source");
        source.india(j5);
    }
}
