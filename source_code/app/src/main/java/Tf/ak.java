package Tf;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ak implements m, AutoCloseable {
    public final ap alpha;
    public final k purple;
    public boolean red;

    /* JADX WARN: Type inference failed for: r2v1, types: [Tf.k, java.lang.Object] */
    public ak(ap source) {
        Intrinsics.echo(source, "source");
        this.alpha = source;
        this.purple = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        s6.AbstractC2743p6.alpha(16);
        r1 = java.lang.Integer.toString(r2, 16);
        kotlin.jvm.internal.Intrinsics.delta(r1, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // Tf.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long A() {
        k kVar;
        kilo(1L);
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            boolean request = request(i5);
            kVar = this.purple;
            if (!request) {
                break;
            }
            byte juliet = kVar.juliet(i4);
            if ((juliet < 48 || juliet > 57) && ((juliet < 97 || juliet > 102) && (juliet < 65 || juliet > 70))) {
                break;
            }
            i4 = i5;
        }
        return kVar.A();
    }

    @Override // Tf.m
    public final InputStream C() {
        return new Hd.b(2, this);
    }

    @Override // Tf.m
    public final void a(k sink, long j5) {
        k kVar = this.purple;
        Intrinsics.echo(sink, "sink");
        try {
            kilo(j5);
            kVar.a(sink, j5);
        } catch (EOFException e) {
            sink.f(kVar);
            throw e;
        }
    }

    @Override // Tf.m
    public final byte[] amber() {
        ap apVar = this.alpha;
        k kVar = this.purple;
        kVar.f(apVar);
        return kVar.blue(kVar.purple);
    }

    @Override // Tf.m
    public final int c(ag options) {
        Intrinsics.echo(options, "options");
        if (this.red) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            k kVar = this.purple;
            int delta = Uf.a.delta(kVar, options, true);
            if (delta != -2) {
                if (delta != -1) {
                    kVar.india(options.alpha[delta].delta());
                    return delta;
                }
            } else if (this.alpha.read(kVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    public final long charlie(byte b2, long j5, long j6) {
        if (!this.red) {
            if (0 <= j6) {
                long j7 = 0;
                while (j7 < j6) {
                    k kVar = this.purple;
                    byte b4 = b2;
                    long j10 = j6;
                    long papa = kVar.papa(b4, j7, j10);
                    if (papa != -1) {
                        return papa;
                    }
                    long j11 = kVar.purple;
                    if (j11 >= j10 || this.alpha.read(kVar, 8192L) == -1) {
                        break;
                    }
                    j7 = Math.max(j7, j11);
                    b2 = b4;
                    j6 = j10;
                }
                return -1L;
            }
            throw new IllegalArgumentException(A0.z.india(j6, "fromIndex=0 toIndex=").toString());
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.red) {
            this.red = true;
            this.alpha.close();
            this.purple.charlie();
        }
    }

    @Override // Tf.m
    public final k delta() {
        return this.purple;
    }

    @Override // Tf.m
    public final String e() {
        return fuchsia(Long.MAX_VALUE);
    }

    public final int echo() {
        kilo(4L);
        return b.golf(this.purple.readInt());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        s6.AbstractC2743p6.alpha(16);
        r1 = java.lang.Integer.toString(r8, 16);
        kotlin.jvm.internal.Intrinsics.delta(r1, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r1));
     */
    @Override // Tf.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long emerald() {
        k kVar;
        kilo(1L);
        long j5 = 0;
        while (true) {
            long j6 = j5 + 1;
            boolean request = request(j6);
            kVar = this.purple;
            if (!request) {
                break;
            }
            byte juliet = kVar.juliet(j5);
            if ((juliet < 48 || juliet > 57) && !(j5 == 0 && juliet == 45)) {
                break;
            }
            j5 = j6;
        }
        return kVar.emerald();
    }

    public final long foxtrot() {
        kilo(8L);
        long readLong = this.purple.readLong();
        return ((readLong & 255) << 56) | (((-72057594037927936L) & readLong) >>> 56) | ((71776119061217280L & readLong) >>> 40) | ((280375465082880L & readLong) >>> 24) | ((1095216660480L & readLong) >>> 8) | ((4278190080L & readLong) << 8) | ((16711680 & readLong) << 24) | ((65280 & readLong) << 40);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [Tf.k, java.lang.Object] */
    @Override // Tf.m
    public final String fuchsia(long j5) {
        long j6;
        if (j5 >= 0) {
            if (j5 == Long.MAX_VALUE) {
                j6 = Long.MAX_VALUE;
            } else {
                j6 = j5 + 1;
            }
            long charlie = charlie((byte) 10, 0L, j6);
            k kVar = this.purple;
            if (charlie != -1) {
                return Uf.a.charlie(kVar, charlie);
            }
            if (j6 < Long.MAX_VALUE && request(j6) && kVar.juliet(j6 - 1) == 13 && request(j6 + 1) && kVar.juliet(j6) == 10) {
                return Uf.a.charlie(kVar, j6);
            }
            ?? obj = new Object();
            kVar.golf(0L, obj, Math.min(32, kVar.purple));
            throw new EOFException("\\n not found: limit=" + Math.min(kVar.purple, j5) + " content=" + obj.november(obj.purple).echo() + (char) 8230);
        }
        throw new IllegalArgumentException(A0.z.india(j5, "limit < 0: ").toString());
    }

    @Override // Tf.m
    public final long g(l sink) {
        k kVar;
        Intrinsics.echo(sink, "sink");
        long j5 = 0;
        while (true) {
            kVar = this.purple;
            if (this.alpha.read(kVar, 8192L) == -1) {
                break;
            }
            long foxtrot = kVar.foxtrot();
            if (foxtrot > 0) {
                j5 += foxtrot;
                sink.write(kVar, foxtrot);
            }
        }
        long j6 = kVar.purple;
        if (j6 > 0) {
            long j7 = j5 + j6;
            sink.write(kVar, j6);
            return j7;
        }
        return j5;
    }

    public final short golf() {
        kilo(2L);
        return this.purple.crimson();
    }

    @Override // Tf.m
    public final boolean hotel() {
        if (!this.red) {
            k kVar = this.purple;
            if (kVar.hotel() && this.alpha.read(kVar, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.m
    public final long i(n targetBytes) {
        Intrinsics.echo(targetBytes, "targetBytes");
        if (!this.red) {
            long j5 = 0;
            while (true) {
                k kVar = this.purple;
                long quebec = kVar.quebec(j5, targetBytes);
                if (quebec != -1) {
                    return quebec;
                }
                long j6 = kVar.purple;
                if (this.alpha.read(kVar, 8192L) == -1) {
                    return -1L;
                }
                j5 = Math.max(j5, j6);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // Tf.m
    public final void india(long j5) {
        if (!this.red) {
            while (j5 > 0) {
                k kVar = this.purple;
                if (kVar.purple == 0 && this.alpha.read(kVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j5, kVar.purple);
                kVar.india(min);
                j5 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.red;
    }

    public final String juliet(long j5) {
        kilo(j5);
        k kVar = this.purple;
        kVar.getClass();
        return kVar.gray(j5, kotlin.text.a.alpha);
    }

    @Override // Tf.m
    public final void kilo(long j5) {
        if (request(j5)) {
        } else {
            throw new EOFException();
        }
    }

    @Override // Tf.m
    public final String maroon(Charset charset) {
        Intrinsics.echo(charset, "charset");
        ap apVar = this.alpha;
        k kVar = this.purple;
        kVar.f(apVar);
        return kVar.maroon(charset);
    }

    @Override // Tf.m
    public final k mike() {
        return this.purple;
    }

    @Override // Tf.m
    public final n november(long j5) {
        kilo(j5);
        return this.purple.november(j5);
    }

    @Override // Tf.m
    public final ak peek() {
        return b.charlie(new ai(this));
    }

    @Override // Tf.m
    public final n plum() {
        ap apVar = this.alpha;
        k kVar = this.purple;
        kVar.f(apVar);
        return kVar.november(kVar.purple);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.echo(sink, "sink");
        k kVar = this.purple;
        if (kVar.purple == 0 && this.alpha.read(kVar, 8192L) == -1) {
            return -1;
        }
        return kVar.read(sink);
    }

    @Override // Tf.m
    public final byte readByte() {
        kilo(1L);
        return this.purple.readByte();
    }

    @Override // Tf.m
    public final void readFully(byte[] sink) {
        k kVar = this.purple;
        Intrinsics.echo(sink, "sink");
        try {
            kilo(sink.length);
            kVar.readFully(sink);
        } catch (EOFException e) {
            int i4 = 0;
            while (true) {
                long j5 = kVar.purple;
                if (j5 > 0) {
                    int azure = kVar.azure(sink, i4, (int) j5);
                    if (azure != -1) {
                        i4 += azure;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // Tf.m
    public final int readInt() {
        kilo(4L);
        return this.purple.readInt();
    }

    @Override // Tf.m
    public final long readLong() {
        kilo(8L);
        return this.purple.readLong();
    }

    @Override // Tf.m
    public final short readShort() {
        kilo(2L);
        return this.purple.readShort();
    }

    @Override // Tf.m
    public final boolean request(long j5) {
        k kVar;
        if (j5 >= 0) {
            if (this.red) {
                throw new IllegalStateException("closed");
            }
            do {
                kVar = this.purple;
                if (kVar.purple >= j5) {
                    return true;
                }
            } while (this.alpha.read(kVar, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(A0.z.india(j5, "byteCount < 0: ").toString());
    }

    @Override // Tf.ap
    public final as timeout() {
        return this.alpha.timeout();
    }

    public final String toString() {
        return "buffer(" + this.alpha + ')';
    }

    @Override // Tf.m
    public final long v(long j5, n bytes) {
        Intrinsics.echo(bytes, "bytes");
        return Uf.b.charlie(this, bytes, bytes.delta(), 0L, j5);
    }

    @Override // Tf.m
    public final long victor(n bytes) {
        Intrinsics.echo(bytes, "bytes");
        return v(Long.MAX_VALUE, bytes);
    }

    @Override // Tf.m
    public final boolean whiskey(long j5, n bytes) {
        Intrinsics.echo(bytes, "bytes");
        int delta = bytes.delta();
        if (!this.red) {
            if (delta >= 0 && j5 >= 0 && delta <= bytes.delta()) {
                if (delta == 0 || Uf.b.charlie(this, bytes, delta, j5, j5 + 1) != -1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.ap
    public final long read(k sink, long j5) {
        Intrinsics.echo(sink, "sink");
        if (j5 >= 0) {
            if (!this.red) {
                k kVar = this.purple;
                if (kVar.purple == 0) {
                    if (j5 == 0) {
                        return 0L;
                    }
                    if (this.alpha.read(kVar, 8192L) == -1) {
                        return -1L;
                    }
                }
                return kVar.read(sink, Math.min(j5, kVar.purple));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(A0.z.india(j5, "byteCount < 0: ").toString());
    }
}
