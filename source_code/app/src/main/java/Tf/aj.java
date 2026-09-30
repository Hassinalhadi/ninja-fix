package Tf;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class aj implements l, AutoCloseable {
    public final ao alpha;
    public final k purple;
    public boolean red;

    /* JADX WARN: Type inference failed for: r2v1, types: [Tf.k, java.lang.Object] */
    public aj(ao sink) {
        Intrinsics.echo(sink, "sink");
        this.alpha = sink;
        this.purple = new Object();
    }

    @Override // Tf.l
    public final l black(int i4) {
        if (!this.red) {
            this.purple.pink(i4);
            cyan();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.ao, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ao aoVar = this.alpha;
        if (!this.red) {
            try {
                k kVar = this.purple;
                long j5 = kVar.purple;
                if (j5 > 0) {
                    aoVar.write(kVar, j5);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                aoVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.red = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // Tf.l
    public final l coral(n byteString) {
        Intrinsics.echo(byteString, "byteString");
        if (!this.red) {
            this.purple.navy(byteString);
            cyan();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.l
    public final l cyan() {
        if (!this.red) {
            k kVar = this.purple;
            long foxtrot = kVar.foxtrot();
            if (foxtrot > 0) {
                this.alpha.write(kVar, foxtrot);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.l
    public final k delta() {
        return this.purple;
    }

    @Override // Tf.l
    public final long f(ap source) {
        Intrinsics.echo(source, "source");
        long j5 = 0;
        while (true) {
            long read = source.read(this.purple, 8192L);
            if (read != -1) {
                j5 += read;
                cyan();
            } else {
                return j5;
            }
        }
    }

    @Override // Tf.l, Tf.ao, java.io.Flushable
    public final void flush() {
        if (!this.red) {
            k kVar = this.purple;
            long j5 = kVar.purple;
            ao aoVar = this.alpha;
            if (j5 > 0) {
                aoVar.write(kVar, j5);
            }
            aoVar.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.red;
    }

    @Override // Tf.l
    public final l lavender(String string) {
        Intrinsics.echo(string, "string");
        if (!this.red) {
            this.purple.n(string);
            cyan();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.l
    public final l m(byte[] source) {
        Intrinsics.echo(source, "source");
        if (!this.red) {
            this.purple.olive(source);
            cyan();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.l
    public final l ochre(byte[] source, int i4, int i5) {
        Intrinsics.echo(source, "source");
        if (!this.red) {
            this.purple.peach(source, i4, i5);
            cyan();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.l
    public final l orange(long j5) {
        if (!this.red) {
            this.purple.silver(j5);
            cyan();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.l
    public final l romeo() {
        if (!this.red) {
            k kVar = this.purple;
            long j5 = kVar.purple;
            if (j5 > 0) {
                this.alpha.write(kVar, j5);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.l
    public final l sierra(int i4) {
        if (!this.red) {
            this.purple.d(i4);
            cyan();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.l
    public final l tango(int i4) {
        if (!this.red) {
            this.purple.p(i4);
            cyan();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.l
    public final l teal(int i4, int i5, String string) {
        Intrinsics.echo(string, "string");
        if (!this.red) {
            this.purple.l(i4, i5, string);
            cyan();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.ao
    public final as timeout() {
        return this.alpha.timeout();
    }

    public final String toString() {
        return "buffer(" + this.alpha + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.echo(source, "source");
        if (!this.red) {
            int write = this.purple.write(source);
            cyan();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.l
    public final l xray(int i4) {
        if (!this.red) {
            this.purple.white(i4);
            cyan();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.l
    public final l y(long j5) {
        if (!this.red) {
            this.purple.purple(j5);
            cyan();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.l
    public final OutputStream z() {
        return new j(this, 1);
    }

    @Override // Tf.ao
    public final void write(k source, long j5) {
        Intrinsics.echo(source, "source");
        if (!this.red) {
            this.purple.write(source, j5);
            cyan();
            return;
        }
        throw new IllegalStateException("closed");
    }
}
