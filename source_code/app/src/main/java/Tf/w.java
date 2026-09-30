package Tf;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class w implements ao, AutoCloseable {

    @NotNull
    private final ao delegate;

    public w(ao delegate) {
        Intrinsics.echo(delegate, "delegate");
        this.delegate = delegate;
    }

    @kotlin.c
    @NotNull
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final ao m7deprecated_delegate() {
        return this.delegate;
    }

    @Override // Tf.ao, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @NotNull
    public final ao delegate() {
        return this.delegate;
    }

    @Override // Tf.ao, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // Tf.ao
    @NotNull
    public as timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // Tf.ao
    public void write(@NotNull k source, long j5) throws IOException {
        Intrinsics.echo(source, "source");
        this.delegate.write(source, j5);
    }
}
