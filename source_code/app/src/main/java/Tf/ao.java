package Tf;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes3.dex */
public interface ao extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    as timeout();

    void write(k kVar, long j5);
}
