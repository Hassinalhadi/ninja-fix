package Tf;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ac extends r {
    public final /* synthetic */ int teal = 0;
    public final Closeable white;

    public ac(boolean z2, RandomAccessFile randomAccessFile) {
        super(z2);
        this.white = randomAccessFile;
    }

    private final synchronized void azure() {
        ((RandomAccessFile) this.white).close();
    }

    private final synchronized void beige() {
        ((FileChannel) this.white).close();
    }

    private final synchronized void blue() {
        ((RandomAccessFile) this.white).getFD().sync();
    }

    private final synchronized void crimson() {
        ((FileChannel) this.white).force(true);
    }

    private final synchronized int gray(long j5, byte[] array, int i4, int i5) {
        Intrinsics.echo(array, "array");
        ((RandomAccessFile) this.white).seek(j5);
        int i10 = 0;
        while (true) {
            if (i10 >= i5) {
                break;
            }
            int read = ((RandomAccessFile) this.white).read(array, i4, i5 - i10);
            if (read == -1) {
                if (i10 == 0) {
                    return -1;
                }
            } else {
                i10 += read;
            }
        }
        return i10;
    }

    private final synchronized int green(long j5, byte[] array, int i4, int i5) {
        Intrinsics.echo(array, "array");
        ((FileChannel) this.white).position(j5);
        ByteBuffer wrap = ByteBuffer.wrap(array, i4, i5);
        int i10 = 0;
        while (true) {
            if (i10 >= i5) {
                break;
            }
            int read = ((FileChannel) this.white).read(wrap);
            if (read == -1) {
                if (i10 == 0) {
                    return -1;
                }
            } else {
                i10 += read;
            }
        }
        return i10;
    }

    private final synchronized long indigo() {
        return ((RandomAccessFile) this.white).length();
    }

    private final synchronized long jade() {
        return ((FileChannel) this.white).size();
    }

    private final synchronized void magenta(long j5, byte[] array, int i4, int i5) {
        Intrinsics.echo(array, "array");
        ((RandomAccessFile) this.white).seek(j5);
        ((RandomAccessFile) this.white).write(array, i4, i5);
    }

    private final synchronized void navy(long j5, byte[] array, int i4, int i5) {
        Intrinsics.echo(array, "array");
        ((FileChannel) this.white).position(j5);
        ((FileChannel) this.white).write(ByteBuffer.wrap(array, i4, i5));
    }

    @Override // Tf.r
    public final synchronized void charlie() {
        switch (this.teal) {
            case 0:
                azure();
                return;
            default:
                beige();
                return;
        }
    }

    @Override // Tf.r
    public final synchronized void echo() {
        switch (this.teal) {
            case 0:
                blue();
                return;
            default:
                crimson();
                return;
        }
    }

    @Override // Tf.r
    public final synchronized int foxtrot(long j5, byte[] bArr, int i4, int i5) {
        switch (this.teal) {
            case 0:
                return gray(j5, bArr, i4, i5);
            default:
                return green(j5, bArr, i4, i5);
        }
    }

    @Override // Tf.r
    public final synchronized long golf() {
        switch (this.teal) {
            case 0:
                return indigo();
            default:
                return jade();
        }
    }

    @Override // Tf.r
    public final synchronized void juliet(long j5, byte[] bArr, int i4, int i5) {
        switch (this.teal) {
            case 0:
                magenta(j5, bArr, i4, i5);
                return;
            default:
                navy(j5, bArr, i4, i5);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(boolean z2, FileChannel fileChannel) {
        super(z2);
        Intrinsics.echo(fileChannel, "fileChannel");
        this.white = fileChannel;
    }
}
