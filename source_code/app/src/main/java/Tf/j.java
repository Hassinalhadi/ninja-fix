package Tf;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j extends OutputStream implements AutoCloseable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ l purple;

    public /* synthetic */ j(l lVar, int i4) {
        this.alpha = i4;
        this.purple = lVar;
    }

    private final void charlie() {
    }

    private final void echo() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.alpha) {
            case 0:
                return;
            default:
                ((aj) this.purple).close();
                return;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.alpha) {
            case 0:
                return;
            default:
                aj ajVar = (aj) this.purple;
                if (!ajVar.red) {
                    ajVar.flush();
                    return;
                }
                return;
        }
    }

    public final String toString() {
        switch (this.alpha) {
            case 0:
                return ((k) this.purple) + ".outputStream()";
            default:
                return ((aj) this.purple) + ".outputStream()";
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i4) {
        switch (this.alpha) {
            case 0:
                ((k) this.purple).pink(i4);
                return;
            default:
                aj ajVar = (aj) this.purple;
                if (!ajVar.red) {
                    ajVar.purple.pink((byte) i4);
                    ajVar.cyan();
                    return;
                }
                throw new IOException("closed");
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i4, int i5) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(data, "data");
                ((k) this.purple).peach(data, i4, i5);
                return;
            default:
                Intrinsics.echo(data, "data");
                aj ajVar = (aj) this.purple;
                if (!ajVar.red) {
                    ajVar.purple.peach(data, i4, i5);
                    ajVar.cyan();
                    return;
                }
                throw new IOException("closed");
        }
    }
}
