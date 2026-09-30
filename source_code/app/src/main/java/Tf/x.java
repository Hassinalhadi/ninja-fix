package Tf;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class x implements ap, AutoCloseable {

    @NotNull
    private final ap delegate;

    public x(ap delegate) {
        Intrinsics.echo(delegate, "delegate");
        this.delegate = delegate;
    }

    @kotlin.c
    @NotNull
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final ap m8deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @NotNull
    public final ap delegate() {
        return this.delegate;
    }

    @Override // Tf.ap
    public long read(@NotNull k sink, long j5) throws IOException {
        Intrinsics.echo(sink, "sink");
        return this.delegate.read(sink, j5);
    }

    @Override // Tf.ap
    @NotNull
    public as timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
