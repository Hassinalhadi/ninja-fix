package Tf;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k implements m, l, Cloneable, ByteChannel, AutoCloseable {
    public al alpha;
    public long purple;

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d A[EDGE_INSN: B:40:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Type inference failed for: r0v7, types: [Tf.k, java.lang.Object] */
    @Override // Tf.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long A() {
        int i4;
        if (this.purple != 0) {
            int i5 = 0;
            boolean z2 = false;
            long j5 = 0;
            do {
                al alVar = this.alpha;
                Intrinsics.checkNotNull(alVar);
                byte[] bArr = alVar.alpha;
                int i10 = alVar.bravo;
                int i11 = alVar.charlie;
                while (i10 < i11) {
                    byte b2 = bArr[i10];
                    if (b2 >= 48 && b2 <= 57) {
                        i4 = b2 - 48;
                    } else if (b2 >= 97 && b2 <= 102) {
                        i4 = b2 - 87;
                    } else if (b2 >= 65 && b2 <= 70) {
                        i4 = b2 - 55;
                    } else if (i5 != 0) {
                        z2 = true;
                        if (i10 != i11) {
                            this.alpha = alVar.alpha();
                            am.alpha(alVar);
                        } else {
                            alVar.bravo = i10;
                        }
                        if (!z2) {
                            break;
                        }
                    } else {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(b.lima(b2)));
                    }
                    if (((-1152921504606846976L) & j5) == 0) {
                        j5 = (j5 << 4) | i4;
                        i10++;
                        i5++;
                    } else {
                        ?? obj = new Object();
                        obj.silver(j5);
                        obj.pink(b2);
                        throw new NumberFormatException("Number too large: ".concat(obj.green()));
                    }
                }
                if (i10 != i11) {
                }
                if (!z2) {
                }
            } while (this.alpha != null);
            this.purple -= i5;
            return j5;
        }
        throw new EOFException();
    }

    @Override // Tf.m
    public final InputStream C() {
        return new Hd.b(1, this);
    }

    @Override // Tf.m
    public final void a(k sink, long j5) {
        Intrinsics.echo(sink, "sink");
        long j6 = this.purple;
        if (j6 >= j5) {
            sink.write(this, j5);
        } else {
            sink.write(this, j6);
            throw new EOFException();
        }
    }

    @Override // Tf.m
    public final byte[] amber() {
        return blue(this.purple);
    }

    public final int azure(byte[] sink, int i4, int i5) {
        Intrinsics.echo(sink, "sink");
        b.echo(sink.length, i4, i5);
        al alVar = this.alpha;
        if (alVar == null) {
            return -1;
        }
        int min = Math.min(i5, alVar.charlie - alVar.bravo);
        int i10 = alVar.bravo;
        ArraysKt.xray(i4, i10, i10 + min, alVar.alpha, sink);
        int i11 = alVar.bravo + min;
        alVar.bravo = i11;
        this.purple -= min;
        if (i11 == alVar.charlie) {
            this.alpha = alVar.alpha();
            am.alpha(alVar);
        }
        return min;
    }

    public final i beige(i unsafeCursor) {
        Intrinsics.echo(unsafeCursor, "unsafeCursor");
        byte[] bArr = Uf.a.alpha;
        if (unsafeCursor == b.alpha) {
            unsafeCursor = new i();
        }
        if (unsafeCursor.alpha == null) {
            unsafeCursor.alpha = this;
            unsafeCursor.purple = true;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @Override // Tf.l
    public final /* bridge */ /* synthetic */ l black(int i4) {
        pink(i4);
        return this;
    }

    public final byte[] blue(long j5) {
        if (j5 >= 0 && j5 <= 2147483647L) {
            if (this.purple >= j5) {
                byte[] bArr = new byte[(int) j5];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(A0.z.india(j5, "byteCount: ").toString());
    }

    @Override // Tf.m
    public final int c(ag options) {
        Intrinsics.echo(options, "options");
        int delta = Uf.a.delta(this, options, false);
        if (delta == -1) {
            return -1;
        }
        india(options.alpha[delta].delta());
        return delta;
    }

    public final void charlie() {
        india(this.purple);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, Tf.ao
    public final void close() {
    }

    @Override // Tf.l
    public final /* bridge */ /* synthetic */ l coral(n nVar) {
        navy(nVar);
        return this;
    }

    public final short crimson() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // Tf.l
    public final l cyan() {
        return this;
    }

    public final void d(int i4) {
        al magenta = magenta(2);
        int i5 = magenta.charlie;
        byte[] bArr = magenta.alpha;
        bArr[i5] = (byte) ((i4 >>> 8) & 255);
        bArr[i5 + 1] = (byte) (i4 & 255);
        magenta.charlie = i5 + 2;
        this.purple += 2;
    }

    @Override // Tf.m
    public final k delta() {
        return this;
    }

    @Override // Tf.m
    public final String e() {
        return fuchsia(Long.MAX_VALUE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Tf.k, java.lang.Object] */
    /* renamed from: echo, reason: merged with bridge method [inline-methods] */
    public final k clone() {
        ?? obj = new Object();
        if (this.purple == 0) {
            return obj;
        }
        al alVar = this.alpha;
        Intrinsics.checkNotNull(alVar);
        al charlie = alVar.charlie();
        obj.alpha = charlie;
        charlie.golf = charlie;
        charlie.foxtrot = charlie;
        for (al alVar2 = alVar.foxtrot; alVar2 != alVar; alVar2 = alVar2.foxtrot) {
            al alVar3 = charlie.golf;
            Intrinsics.checkNotNull(alVar3);
            Intrinsics.checkNotNull(alVar2);
            alVar3.bravo(alVar2.charlie());
        }
        obj.purple = this.purple;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        r3 = r19.purple - r1;
        r19.purple = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
    
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r3 == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
    
        r1 = ao.ad.beige(r1, " but was 0x");
        r1.append(Tf.b.lima(juliet(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cd, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Type inference failed for: r1v15, types: [Tf.k, java.lang.Object] */
    @Override // Tf.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long emerald() {
        long j5;
        byte b2;
        long j6 = 0;
        if (this.purple != 0) {
            int i4 = 0;
            boolean z2 = false;
            long j7 = 0;
            long j10 = -7;
            boolean z10 = false;
            loop0: while (true) {
                al alVar = this.alpha;
                Intrinsics.checkNotNull(alVar);
                byte[] bArr = alVar.alpha;
                int i5 = alVar.bravo;
                int i10 = alVar.charlie;
                while (i5 < i10) {
                    b2 = bArr[i5];
                    if (b2 >= 48 && b2 <= 57) {
                        int i11 = 48 - b2;
                        if (j7 < -922337203685477580L) {
                            break loop0;
                        }
                        j5 = j6;
                        if (j7 == -922337203685477580L && i11 < j10) {
                            break loop0;
                        }
                        j7 = (j7 * 10) + i11;
                    } else {
                        j5 = j6;
                        if (b2 == 45 && i4 == 0) {
                            j10--;
                            z2 = true;
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    i5++;
                    i4++;
                    j6 = j5;
                }
                j5 = j6;
                if (i5 == i10) {
                    this.alpha = alVar.alpha();
                    am.alpha(alVar);
                } else {
                    alVar.bravo = i5;
                }
                if (z10 || this.alpha == null) {
                    break;
                }
                j6 = j5;
            }
            ?? obj = new Object();
            obj.purple(j7);
            obj.pink(b2);
            if (!z2) {
                obj.readByte();
            }
            throw new NumberFormatException("Number too large: ".concat(obj.green()));
        }
        throw new EOFException();
    }

    public final boolean equals(Object obj) {
        boolean z2 = true;
        if (this == obj) {
            return true;
        }
        boolean z10 = false;
        if (!(obj instanceof k)) {
            return false;
        }
        long j5 = this.purple;
        k kVar = (k) obj;
        if (j5 != kVar.purple) {
            return false;
        }
        if (j5 == 0) {
            return true;
        }
        al alVar = this.alpha;
        Intrinsics.checkNotNull(alVar);
        al alVar2 = kVar.alpha;
        Intrinsics.checkNotNull(alVar2);
        int i4 = alVar.bravo;
        int i5 = alVar2.bravo;
        long j6 = 0;
        while (j6 < this.purple) {
            long min = Math.min(alVar.charlie - i4, alVar2.charlie - i5);
            long j7 = 0;
            while (j7 < min) {
                int i10 = i4 + 1;
                boolean z11 = z2;
                byte b2 = alVar.alpha[i4];
                int i11 = i5 + 1;
                boolean z12 = z10;
                if (b2 != alVar2.alpha[i5]) {
                    return z12;
                }
                j7++;
                i5 = i11;
                i4 = i10;
                z2 = z11;
                z10 = z12;
            }
            boolean z13 = z2;
            boolean z14 = z10;
            if (i4 == alVar.charlie) {
                al alVar3 = alVar.foxtrot;
                Intrinsics.checkNotNull(alVar3);
                i4 = alVar3.bravo;
                alVar = alVar3;
            }
            if (i5 == alVar2.charlie) {
                alVar2 = alVar2.foxtrot;
                Intrinsics.checkNotNull(alVar2);
                i5 = alVar2.bravo;
            }
            j6 += min;
            z2 = z13;
            z10 = z14;
        }
        return z2;
    }

    @Override // Tf.l
    public final long f(ap source) {
        Intrinsics.echo(source, "source");
        long j5 = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read != -1) {
                j5 += read;
            } else {
                return j5;
            }
        }
    }

    @Override // Tf.l, Tf.ao, java.io.Flushable
    public final void flush() {
    }

    public final long foxtrot() {
        long j5 = this.purple;
        if (j5 == 0) {
            return 0L;
        }
        al alVar = this.alpha;
        Intrinsics.checkNotNull(alVar);
        al alVar2 = alVar.golf;
        Intrinsics.checkNotNull(alVar2);
        if (alVar2.charlie < 8192 && alVar2.echo) {
            return j5 - (r3 - alVar2.bravo);
        }
        return j5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [Tf.k, java.lang.Object] */
    @Override // Tf.m
    public final String fuchsia(long j5) {
        if (j5 >= 0) {
            long j6 = Long.MAX_VALUE;
            if (j5 != Long.MAX_VALUE) {
                j6 = j5 + 1;
            }
            long j7 = j6;
            long papa = papa((byte) 10, 0L, j7);
            if (papa != -1) {
                return Uf.a.charlie(this, papa);
            }
            if (j7 < this.purple && juliet(j7 - 1) == 13 && juliet(j7) == 10) {
                return Uf.a.charlie(this, j7);
            }
            ?? obj = new Object();
            golf(0L, obj, Math.min(32, this.purple));
            throw new EOFException("\\n not found: limit=" + Math.min(this.purple, j5) + " content=" + obj.november(obj.purple).echo() + (char) 8230);
        }
        throw new IllegalArgumentException(A0.z.india(j5, "limit < 0: ").toString());
    }

    @Override // Tf.m
    public final long g(l sink) {
        Intrinsics.echo(sink, "sink");
        long j5 = this.purple;
        if (j5 > 0) {
            sink.write(this, j5);
        }
        return j5;
    }

    public final void golf(long j5, k out, long j6) {
        Intrinsics.echo(out, "out");
        long j7 = j5;
        b.echo(this.purple, j7, j6);
        if (j6 != 0) {
            out.purple += j6;
            al alVar = this.alpha;
            while (true) {
                Intrinsics.checkNotNull(alVar);
                long j10 = alVar.charlie - alVar.bravo;
                if (j7 < j10) {
                    break;
                }
                j7 -= j10;
                alVar = alVar.foxtrot;
            }
            al alVar2 = alVar;
            long j11 = j6;
            while (j11 > 0) {
                Intrinsics.checkNotNull(alVar2);
                al charlie = alVar2.charlie();
                int i4 = charlie.bravo + ((int) j7);
                charlie.bravo = i4;
                charlie.charlie = Math.min(i4 + ((int) j11), charlie.charlie);
                al alVar3 = out.alpha;
                if (alVar3 == null) {
                    charlie.golf = charlie;
                    charlie.foxtrot = charlie;
                    out.alpha = charlie;
                } else {
                    Intrinsics.checkNotNull(alVar3);
                    al alVar4 = alVar3.golf;
                    Intrinsics.checkNotNull(alVar4);
                    alVar4.bravo(charlie);
                }
                j11 -= charlie.charlie - charlie.bravo;
                alVar2 = alVar2.foxtrot;
                j7 = 0;
            }
        }
    }

    public final String gray(long j5, Charset charset) {
        Intrinsics.echo(charset, "charset");
        if (j5 >= 0 && j5 <= 2147483647L) {
            if (this.purple >= j5) {
                if (j5 == 0) {
                    return "";
                }
                al alVar = this.alpha;
                Intrinsics.checkNotNull(alVar);
                int i4 = alVar.bravo;
                if (i4 + j5 > alVar.charlie) {
                    return new String(blue(j5), charset);
                }
                int i5 = (int) j5;
                String str = new String(alVar.alpha, i4, i5, charset);
                int i10 = alVar.bravo + i5;
                alVar.bravo = i10;
                this.purple -= j5;
                if (i10 == alVar.charlie) {
                    this.alpha = alVar.alpha();
                    am.alpha(alVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(A0.z.india(j5, "byteCount: ").toString());
    }

    public final String green() {
        return gray(this.purple, kotlin.text.a.alpha);
    }

    public final int hashCode() {
        al alVar = this.alpha;
        if (alVar == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i5 = alVar.charlie;
            for (int i10 = alVar.bravo; i10 < i5; i10++) {
                i4 = (i4 * 31) + alVar.alpha[i10];
            }
            alVar = alVar.foxtrot;
            Intrinsics.checkNotNull(alVar);
        } while (alVar != this.alpha);
        return i4;
    }

    @Override // Tf.m
    public final boolean hotel() {
        if (this.purple == 0) {
            return true;
        }
        return false;
    }

    @Override // Tf.m
    public final long i(n targetBytes) {
        Intrinsics.echo(targetBytes, "targetBytes");
        return quebec(0L, targetBytes);
    }

    @Override // Tf.m
    public final void india(long j5) {
        while (j5 > 0) {
            al alVar = this.alpha;
            if (alVar != null) {
                int min = (int) Math.min(j5, alVar.charlie - alVar.bravo);
                long j6 = min;
                this.purple -= j6;
                j5 -= j6;
                int i4 = alVar.bravo + min;
                alVar.bravo = i4;
                if (i4 == alVar.charlie) {
                    this.alpha = alVar.alpha();
                    am.alpha(alVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final int indigo() {
        int i4;
        int i5;
        int i10;
        if (this.purple != 0) {
            byte juliet = juliet(0L);
            if ((juliet & 128) == 0) {
                i4 = juliet & Byte.MAX_VALUE;
                i10 = 0;
                i5 = 1;
            } else if ((juliet & 224) == 192) {
                i4 = juliet & 31;
                i5 = 2;
                i10 = 128;
            } else if ((juliet & 240) == 224) {
                i4 = juliet & 15;
                i5 = 3;
                i10 = 2048;
            } else if ((juliet & 248) == 240) {
                i4 = juliet & 7;
                i5 = 4;
                i10 = 65536;
            } else {
                india(1L);
                return 65533;
            }
            long j5 = i5;
            if (this.purple >= j5) {
                for (int i11 = 1; i11 < i5; i11++) {
                    long j6 = i11;
                    byte juliet2 = juliet(j6);
                    if ((juliet2 & 192) == 128) {
                        i4 = (i4 << 6) | (juliet2 & 63);
                    } else {
                        india(j6);
                        return 65533;
                    }
                }
                india(j5);
                if (i4 > 1114111) {
                    return 65533;
                }
                if ((55296 <= i4 && i4 < 57344) || i4 < i10) {
                    return 65533;
                }
                return i4;
            }
            StringBuilder sierra = Q0.c.sierra(i5, "size < ", ": ");
            sierra.append(this.purple);
            sierra.append(" (to read code point prefixed 0x");
            sierra.append(b.lima(juliet));
            sierra.append(')');
            throw new EOFException(sierra.toString());
        }
        throw new EOFException();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j(String str, int i4, int i5, Charset charset) {
        Intrinsics.echo(charset, "charset");
        if (i4 >= 0) {
            if (i5 >= i4) {
                if (i5 <= str.length()) {
                    if (Intrinsics.areEqual(charset, kotlin.text.a.alpha)) {
                        l(i4, i5, str);
                        return;
                    }
                    String substring = str.substring(i4, i5);
                    Intrinsics.delta(substring, "substring(...)");
                    byte[] bytes = substring.getBytes(charset);
                    Intrinsics.delta(bytes, "getBytes(...)");
                    peach(bytes, 0, bytes.length);
                    return;
                }
                StringBuilder sierra = Q0.c.sierra(i5, "endIndex > string.length: ", " > ");
                sierra.append(str.length());
                throw new IllegalArgumentException(sierra.toString().toString());
            }
            throw new IllegalArgumentException(A0.z.juliet("endIndex < beginIndex: ", i5, i4, " < ").toString());
        }
        throw new IllegalArgumentException(ao.ad.zulu(i4, "beginIndex < 0: ").toString());
    }

    public final n jade(int i4) {
        if (i4 == 0) {
            return n.silver;
        }
        b.echo(this.purple, 0L, i4);
        al alVar = this.alpha;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i4) {
            Intrinsics.checkNotNull(alVar);
            int i12 = alVar.charlie;
            int i13 = alVar.bravo;
            if (i12 != i13) {
                i10 += i12 - i13;
                i11++;
                alVar = alVar.foxtrot;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i11];
        int[] iArr = new int[i11 * 2];
        al alVar2 = this.alpha;
        int i14 = 0;
        while (i5 < i4) {
            Intrinsics.checkNotNull(alVar2);
            bArr[i14] = alVar2.alpha;
            i5 += alVar2.charlie - alVar2.bravo;
            iArr[i14] = Math.min(i5, i4);
            iArr[i14 + i11] = alVar2.bravo;
            alVar2.delta = true;
            i14++;
            alVar2 = alVar2.foxtrot;
        }
        return new an(bArr, iArr);
    }

    public final byte juliet(long j5) {
        b.echo(this.purple, j5, 1L);
        al alVar = this.alpha;
        if (alVar != null) {
            long j6 = this.purple;
            if (j6 - j5 < j5) {
                while (j6 > j5) {
                    alVar = alVar.golf;
                    Intrinsics.checkNotNull(alVar);
                    j6 -= alVar.charlie - alVar.bravo;
                }
                Intrinsics.checkNotNull(alVar);
                return alVar.alpha[(int) ((alVar.bravo + j5) - j6)];
            }
            long j7 = 0;
            while (true) {
                long j10 = (alVar.charlie - alVar.bravo) + j7;
                if (j10 <= j5) {
                    alVar = alVar.foxtrot;
                    Intrinsics.checkNotNull(alVar);
                    j7 = j10;
                } else {
                    Intrinsics.checkNotNull(alVar);
                    return alVar.alpha[(int) ((alVar.bravo + j5) - j7)];
                }
            }
        } else {
            Intrinsics.checkNotNull(null);
            throw null;
        }
    }

    @Override // Tf.m
    public final void kilo(long j5) {
        if (this.purple >= j5) {
        } else {
            throw new EOFException();
        }
    }

    public final void l(int i4, int i5, String string) {
        char charAt;
        char c3;
        Intrinsics.echo(string, "string");
        if (i4 >= 0) {
            if (i5 >= i4) {
                if (i5 <= string.length()) {
                    while (i4 < i5) {
                        char charAt2 = string.charAt(i4);
                        if (charAt2 < 128) {
                            al magenta = magenta(1);
                            int i10 = magenta.charlie - i4;
                            int min = Math.min(i5, 8192 - i10);
                            int i11 = i4 + 1;
                            byte[] bArr = magenta.alpha;
                            bArr[i4 + i10] = (byte) charAt2;
                            while (true) {
                                i4 = i11;
                                if (i4 >= min || (charAt = string.charAt(i4)) >= 128) {
                                    break;
                                }
                                i11 = i4 + 1;
                                bArr[i4 + i10] = (byte) charAt;
                            }
                            int i12 = magenta.charlie;
                            int i13 = (i10 + i4) - i12;
                            magenta.charlie = i12 + i13;
                            this.purple += i13;
                        } else {
                            if (charAt2 < 2048) {
                                al magenta2 = magenta(2);
                                int i14 = magenta2.charlie;
                                byte[] bArr2 = magenta2.alpha;
                                bArr2[i14] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i14 + 1] = (byte) ((charAt2 & '?') | 128);
                                magenta2.charlie = i14 + 2;
                                this.purple += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i15 = i4 + 1;
                                if (i15 < i5) {
                                    c3 = string.charAt(i15);
                                } else {
                                    c3 = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c3 && c3 < 57344) {
                                    int i16 = (((charAt2 & 1023) << 10) | (c3 & 1023)) + 65536;
                                    al magenta3 = magenta(4);
                                    int i17 = magenta3.charlie;
                                    byte[] bArr3 = magenta3.alpha;
                                    bArr3[i17] = (byte) ((i16 >> 18) | 240);
                                    bArr3[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                                    bArr3[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                                    bArr3[i17 + 3] = (byte) ((i16 & 63) | 128);
                                    magenta3.charlie = i17 + 4;
                                    this.purple += 4;
                                    i4 += 2;
                                } else {
                                    pink(63);
                                    i4 = i15;
                                }
                            } else {
                                al magenta4 = magenta(3);
                                int i18 = magenta4.charlie;
                                byte[] bArr4 = magenta4.alpha;
                                bArr4[i18] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i18 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i18 + 2] = (byte) ((charAt2 & '?') | 128);
                                magenta4.charlie = i18 + 3;
                                this.purple += 3;
                            }
                            i4++;
                        }
                    }
                    return;
                }
                StringBuilder sierra = Q0.c.sierra(i5, "endIndex > string.length: ", " > ");
                sierra.append(string.length());
                throw new IllegalArgumentException(sierra.toString().toString());
            }
            throw new IllegalArgumentException(A0.z.juliet("endIndex < beginIndex: ", i5, i4, " < ").toString());
        }
        throw new IllegalArgumentException(ao.ad.zulu(i4, "beginIndex < 0: ").toString());
    }

    @Override // Tf.l
    public final /* bridge */ /* synthetic */ l lavender(String str) {
        n(str);
        return this;
    }

    @Override // Tf.l
    public final /* bridge */ /* synthetic */ l m(byte[] bArr) {
        olive(bArr);
        return this;
    }

    public final al magenta(int i4) {
        if (i4 >= 1 && i4 <= 8192) {
            al alVar = this.alpha;
            if (alVar == null) {
                al bravo = am.bravo();
                this.alpha = bravo;
                bravo.golf = bravo;
                bravo.foxtrot = bravo;
                return bravo;
            }
            Intrinsics.checkNotNull(alVar);
            al alVar2 = alVar.golf;
            Intrinsics.checkNotNull(alVar2);
            if (alVar2.charlie + i4 <= 8192 && alVar2.echo) {
                return alVar2;
            }
            al bravo2 = am.bravo();
            alVar2.bravo(bravo2);
            return bravo2;
        }
        throw new IllegalArgumentException("unexpected capacity");
    }

    @Override // Tf.m
    public final String maroon(Charset charset) {
        Intrinsics.echo(charset, "charset");
        return gray(this.purple, charset);
    }

    @Override // Tf.m
    public final k mike() {
        return this;
    }

    public final void n(String string) {
        Intrinsics.echo(string, "string");
        l(0, string.length(), string);
    }

    public final void navy(n byteString) {
        Intrinsics.echo(byteString, "byteString");
        byteString.sierra(byteString.delta(), this);
    }

    @Override // Tf.m
    public final n november(long j5) {
        if (j5 >= 0 && j5 <= 2147483647L) {
            if (this.purple >= j5) {
                if (j5 >= 4096) {
                    n jade = jade((int) j5);
                    india(j5);
                    return jade;
                }
                return new n(blue(j5));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(A0.z.india(j5, "byteCount: ").toString());
    }

    @Override // Tf.l
    public final /* bridge */ /* synthetic */ l ochre(byte[] bArr, int i4, int i5) {
        peach(bArr, i4, i5);
        return this;
    }

    public final void olive(byte[] source) {
        Intrinsics.echo(source, "source");
        peach(source, 0, source.length);
    }

    @Override // Tf.l
    public final /* bridge */ /* synthetic */ l orange(long j5) {
        silver(j5);
        return this;
    }

    public final void p(int i4) {
        if (i4 < 128) {
            pink(i4);
            return;
        }
        if (i4 < 2048) {
            al magenta = magenta(2);
            int i5 = magenta.charlie;
            byte[] bArr = magenta.alpha;
            bArr[i5] = (byte) ((i4 >> 6) | 192);
            bArr[i5 + 1] = (byte) ((i4 & 63) | 128);
            magenta.charlie = i5 + 2;
            this.purple += 2;
            return;
        }
        if (55296 <= i4 && i4 < 57344) {
            pink(63);
            return;
        }
        if (i4 < 65536) {
            al magenta2 = magenta(3);
            int i10 = magenta2.charlie;
            byte[] bArr2 = magenta2.alpha;
            bArr2[i10] = (byte) ((i4 >> 12) | 224);
            bArr2[i10 + 1] = (byte) (((i4 >> 6) & 63) | 128);
            bArr2[i10 + 2] = (byte) ((i4 & 63) | 128);
            magenta2.charlie = i10 + 3;
            this.purple += 3;
            return;
        }
        if (i4 <= 1114111) {
            al magenta3 = magenta(4);
            int i11 = magenta3.charlie;
            byte[] bArr3 = magenta3.alpha;
            bArr3[i11] = (byte) ((i4 >> 18) | 240);
            bArr3[i11 + 1] = (byte) (((i4 >> 12) & 63) | 128);
            bArr3[i11 + 2] = (byte) (((i4 >> 6) & 63) | 128);
            bArr3[i11 + 3] = (byte) ((i4 & 63) | 128);
            magenta3.charlie = i11 + 4;
            this.purple += 4;
            return;
        }
        throw new IllegalArgumentException("Unexpected code point: 0x".concat(b.mike(i4)));
    }

    public final long papa(byte b2, long j5, long j6) {
        al alVar;
        long j7 = 0;
        if (0 <= j5 && j5 <= j6) {
            long j10 = this.purple;
            if (j6 > j10) {
                j6 = j10;
            }
            if (j5 != j6 && (alVar = this.alpha) != null) {
                if (j10 - j5 < j5) {
                    while (j10 > j5) {
                        alVar = alVar.golf;
                        Intrinsics.checkNotNull(alVar);
                        j10 -= alVar.charlie - alVar.bravo;
                    }
                    while (j10 < j6) {
                        byte[] bArr = alVar.alpha;
                        int min = (int) Math.min(alVar.charlie, (alVar.bravo + j6) - j10);
                        for (int i4 = (int) ((alVar.bravo + j5) - j10); i4 < min; i4++) {
                            if (bArr[i4] == b2) {
                                return (i4 - alVar.bravo) + j10;
                            }
                        }
                        j10 += alVar.charlie - alVar.bravo;
                        alVar = alVar.foxtrot;
                        Intrinsics.checkNotNull(alVar);
                        j5 = j10;
                    }
                    return -1L;
                }
                while (true) {
                    long j11 = (alVar.charlie - alVar.bravo) + j7;
                    if (j11 > j5) {
                        break;
                    }
                    alVar = alVar.foxtrot;
                    Intrinsics.checkNotNull(alVar);
                    j7 = j11;
                }
                while (j7 < j6) {
                    byte[] bArr2 = alVar.alpha;
                    int min2 = (int) Math.min(alVar.charlie, (alVar.bravo + j6) - j7);
                    for (int i5 = (int) ((alVar.bravo + j5) - j7); i5 < min2; i5++) {
                        if (bArr2[i5] == b2) {
                            return (i5 - alVar.bravo) + j7;
                        }
                    }
                    j7 += alVar.charlie - alVar.bravo;
                    alVar = alVar.foxtrot;
                    Intrinsics.checkNotNull(alVar);
                    j5 = j7;
                }
                return -1L;
            }
            return -1L;
        }
        StringBuilder sb2 = new StringBuilder("size=");
        sb2.append(this.purple);
        Q0.c.amber(sb2, " fromIndex=", j5, " toIndex=");
        sb2.append(j6);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final void peach(byte[] source, int i4, int i5) {
        Intrinsics.echo(source, "source");
        long j5 = i5;
        b.echo(source.length, i4, j5);
        int i10 = i5 + i4;
        while (i4 < i10) {
            al magenta = magenta(1);
            int min = Math.min(i10 - i4, 8192 - magenta.charlie);
            int i11 = i4 + min;
            ArraysKt.xray(magenta.charlie, i4, i11, source, magenta.alpha);
            magenta.charlie += min;
            i4 = i11;
        }
        this.purple += j5;
    }

    @Override // Tf.m
    public final ak peek() {
        return b.charlie(new ai(this));
    }

    public final void pink(int i4) {
        al magenta = magenta(1);
        int i5 = magenta.charlie;
        magenta.charlie = i5 + 1;
        magenta.alpha[i5] = (byte) i4;
        this.purple++;
    }

    @Override // Tf.m
    public final n plum() {
        return november(this.purple);
    }

    public final void purple(long j5) {
        boolean z2;
        byte[] bArr;
        if (j5 == 0) {
            pink(48);
            return;
        }
        int i4 = 0;
        if (j5 < 0) {
            j5 = -j5;
            if (j5 < 0) {
                n("-9223372036854775808");
                return;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        byte[] bArr2 = Uf.a.alpha;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j5)) * 10) >>> 5;
        if (j5 > Uf.a.bravo[numberOfLeadingZeros]) {
            i4 = 1;
        }
        int i5 = numberOfLeadingZeros + i4;
        if (z2) {
            i5++;
        }
        al magenta = magenta(i5);
        int i10 = magenta.charlie + i5;
        while (true) {
            bArr = magenta.alpha;
            if (j5 == 0) {
                break;
            }
            long j6 = 10;
            i10--;
            bArr[i10] = Uf.a.alpha[(int) (j5 % j6)];
            j5 /= j6;
        }
        if (z2) {
            bArr[i10 - 1] = 45;
        }
        magenta.charlie += i5;
        this.purple += i5;
    }

    public final long quebec(long j5, n targetBytes) {
        Intrinsics.echo(targetBytes, "targetBytes");
        long j6 = 0;
        if (j5 >= 0) {
            al alVar = this.alpha;
            if (alVar == null) {
                return -1L;
            }
            long j7 = this.purple;
            if (j7 - j5 < j5) {
                while (j7 > j5) {
                    alVar = alVar.golf;
                    Intrinsics.checkNotNull(alVar);
                    j7 -= alVar.charlie - alVar.bravo;
                }
                if (targetBytes.delta() == 2) {
                    byte india = targetBytes.india(0);
                    byte india2 = targetBytes.india(1);
                    while (j7 < this.purple) {
                        byte[] bArr = alVar.alpha;
                        int i4 = alVar.charlie;
                        for (int i5 = (int) ((alVar.bravo + j5) - j7); i5 < i4; i5++) {
                            byte b2 = bArr[i5];
                            if (b2 == india || b2 == india2) {
                                return (i5 - alVar.bravo) + j7;
                            }
                        }
                        j7 += alVar.charlie - alVar.bravo;
                        alVar = alVar.foxtrot;
                        Intrinsics.checkNotNull(alVar);
                        j5 = j7;
                    }
                } else {
                    byte[] hotel = targetBytes.hotel();
                    while (j7 < this.purple) {
                        byte[] bArr2 = alVar.alpha;
                        int i10 = alVar.charlie;
                        for (int i11 = (int) ((alVar.bravo + j5) - j7); i11 < i10; i11++) {
                            byte b4 = bArr2[i11];
                            for (byte b6 : hotel) {
                                if (b4 == b6) {
                                    return (i11 - alVar.bravo) + j7;
                                }
                            }
                        }
                        j7 += alVar.charlie - alVar.bravo;
                        alVar = alVar.foxtrot;
                        Intrinsics.checkNotNull(alVar);
                        j5 = j7;
                    }
                }
                return -1L;
            }
            while (true) {
                long j10 = (alVar.charlie - alVar.bravo) + j6;
                if (j10 > j5) {
                    break;
                }
                alVar = alVar.foxtrot;
                Intrinsics.checkNotNull(alVar);
                j6 = j10;
            }
            if (targetBytes.delta() == 2) {
                byte india3 = targetBytes.india(0);
                byte india4 = targetBytes.india(1);
                while (j6 < this.purple) {
                    byte[] bArr3 = alVar.alpha;
                    int i12 = alVar.charlie;
                    for (int i13 = (int) ((alVar.bravo + j5) - j6); i13 < i12; i13++) {
                        byte b10 = bArr3[i13];
                        if (b10 == india3 || b10 == india4) {
                            return (i13 - alVar.bravo) + j6;
                        }
                    }
                    j6 += alVar.charlie - alVar.bravo;
                    alVar = alVar.foxtrot;
                    Intrinsics.checkNotNull(alVar);
                    j5 = j6;
                }
            } else {
                byte[] hotel2 = targetBytes.hotel();
                while (j6 < this.purple) {
                    byte[] bArr4 = alVar.alpha;
                    int i14 = alVar.charlie;
                    for (int i15 = (int) ((alVar.bravo + j5) - j6); i15 < i14; i15++) {
                        byte b11 = bArr4[i15];
                        for (byte b12 : hotel2) {
                            if (b11 == b12) {
                                return (i15 - alVar.bravo) + j6;
                            }
                        }
                    }
                    j6 += alVar.charlie - alVar.bravo;
                    alVar = alVar.foxtrot;
                    Intrinsics.checkNotNull(alVar);
                    j5 = j6;
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(A0.z.india(j5, "fromIndex < 0: ").toString());
    }

    @Override // Tf.ap
    public final long read(k sink, long j5) {
        Intrinsics.echo(sink, "sink");
        if (j5 >= 0) {
            long j6 = this.purple;
            if (j6 == 0) {
                return -1L;
            }
            if (j5 > j6) {
                j5 = j6;
            }
            sink.write(this, j5);
            return j5;
        }
        throw new IllegalArgumentException(A0.z.india(j5, "byteCount < 0: ").toString());
    }

    @Override // Tf.m
    public final byte readByte() {
        if (this.purple != 0) {
            al alVar = this.alpha;
            Intrinsics.checkNotNull(alVar);
            int i4 = alVar.bravo;
            int i5 = alVar.charlie;
            int i10 = i4 + 1;
            byte b2 = alVar.alpha[i4];
            this.purple--;
            if (i10 == i5) {
                this.alpha = alVar.alpha();
                am.alpha(alVar);
                return b2;
            }
            alVar.bravo = i10;
            return b2;
        }
        throw new EOFException();
    }

    @Override // Tf.m
    public final void readFully(byte[] sink) {
        Intrinsics.echo(sink, "sink");
        int i4 = 0;
        while (i4 < sink.length) {
            int azure = azure(sink, i4, sink.length - i4);
            if (azure != -1) {
                i4 += azure;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // Tf.m
    public final int readInt() {
        if (this.purple >= 4) {
            al alVar = this.alpha;
            Intrinsics.checkNotNull(alVar);
            int i4 = alVar.bravo;
            int i5 = alVar.charlie;
            if (i5 - i4 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = alVar.alpha;
            int i10 = i4 + 3;
            int i11 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 2] & 255) << 8);
            int i12 = i4 + 4;
            int i13 = i11 | (bArr[i10] & 255);
            this.purple -= 4;
            if (i12 == i5) {
                this.alpha = alVar.alpha();
                am.alpha(alVar);
                return i13;
            }
            alVar.bravo = i12;
            return i13;
        }
        throw new EOFException();
    }

    @Override // Tf.m
    public final long readLong() {
        if (this.purple >= 8) {
            al alVar = this.alpha;
            Intrinsics.checkNotNull(alVar);
            int i4 = alVar.bravo;
            int i5 = alVar.charlie;
            if (i5 - i4 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = alVar.alpha;
            int i10 = i4 + 7;
            long j5 = ((bArr[i4 + 3] & 255) << 32) | ((bArr[i4] & 255) << 56) | ((bArr[i4 + 1] & 255) << 48) | ((bArr[i4 + 2] & 255) << 40) | ((bArr[i4 + 4] & 255) << 24) | ((bArr[i4 + 5] & 255) << 16) | ((bArr[i4 + 6] & 255) << 8);
            int i11 = i4 + 8;
            long j6 = j5 | (bArr[i10] & 255);
            this.purple -= 8;
            if (i11 == i5) {
                this.alpha = alVar.alpha();
                am.alpha(alVar);
                return j6;
            }
            alVar.bravo = i11;
            return j6;
        }
        throw new EOFException();
    }

    @Override // Tf.m
    public final short readShort() {
        if (this.purple >= 2) {
            al alVar = this.alpha;
            Intrinsics.checkNotNull(alVar);
            int i4 = alVar.bravo;
            int i5 = alVar.charlie;
            if (i5 - i4 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            int i10 = i4 + 1;
            byte[] bArr = alVar.alpha;
            int i11 = (bArr[i4] & 255) << 8;
            int i12 = i4 + 2;
            int i13 = (bArr[i10] & 255) | i11;
            this.purple -= 2;
            if (i12 == i5) {
                this.alpha = alVar.alpha();
                am.alpha(alVar);
            } else {
                alVar.bravo = i12;
            }
            return (short) i13;
        }
        throw new EOFException();
    }

    @Override // Tf.m
    public final boolean request(long j5) {
        if (this.purple >= j5) {
            return true;
        }
        return false;
    }

    @Override // Tf.l
    public final l romeo() {
        return this;
    }

    @Override // Tf.l
    public final /* bridge */ /* synthetic */ l sierra(int i4) {
        d(i4);
        return this;
    }

    public final void silver(long j5) {
        if (j5 == 0) {
            pink(48);
            return;
        }
        long j6 = (j5 >>> 1) | j5;
        long j7 = j6 | (j6 >>> 2);
        long j10 = j7 | (j7 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i4 = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + 3) / 4);
        al magenta = magenta(i4);
        int i5 = magenta.charlie;
        for (int i10 = (i5 + i4) - 1; i10 >= i5; i10--) {
            magenta.alpha[i10] = Uf.a.alpha[(int) (15 & j5)];
            j5 >>>= 4;
        }
        magenta.charlie += i4;
        this.purple += i4;
    }

    @Override // Tf.l
    public final /* bridge */ /* synthetic */ l tango(int i4) {
        p(i4);
        return this;
    }

    @Override // Tf.l
    public final /* bridge */ /* synthetic */ l teal(int i4, int i5, String str) {
        l(i4, i5, str);
        return this;
    }

    @Override // Tf.ap
    public final as timeout() {
        return as.NONE;
    }

    public final String toString() {
        long j5 = this.purple;
        if (j5 <= 2147483647L) {
            return jade((int) j5).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.purple).toString());
    }

    public final boolean uniform(int i4, n bytes, long j5) {
        Intrinsics.echo(bytes, "bytes");
        if (i4 >= 0 && j5 >= 0 && i4 + j5 <= this.purple && i4 <= bytes.delta()) {
            if (i4 == 0 || Uf.a.alpha(this, bytes, j5, j5 + 1, i4) != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // Tf.m
    public final long v(long j5, n bytes) {
        Intrinsics.echo(bytes, "bytes");
        byte[] bArr = Uf.a.alpha;
        return Uf.a.alpha(this, bytes, 0L, j5, bytes.delta());
    }

    @Override // Tf.m
    public final long victor(n bytes) {
        Intrinsics.echo(bytes, "bytes");
        return v(Long.MAX_VALUE, bytes);
    }

    @Override // Tf.m
    public final boolean whiskey(long j5, n bytes) {
        Intrinsics.echo(bytes, "bytes");
        return uniform(bytes.delta(), bytes, j5);
    }

    public final void white(int i4) {
        al magenta = magenta(4);
        int i5 = magenta.charlie;
        byte[] bArr = magenta.alpha;
        bArr[i5] = (byte) ((i4 >>> 24) & 255);
        bArr[i5 + 1] = (byte) ((i4 >>> 16) & 255);
        bArr[i5 + 2] = (byte) ((i4 >>> 8) & 255);
        bArr[i5 + 3] = (byte) (i4 & 255);
        magenta.charlie = i5 + 4;
        this.purple += 4;
    }

    @Override // Tf.ao
    public final void write(k source, long j5) {
        al alVar;
        al bravo;
        Intrinsics.echo(source, "source");
        if (source != this) {
            b.echo(source.purple, 0L, j5);
            while (j5 > 0) {
                al alVar2 = source.alpha;
                Intrinsics.checkNotNull(alVar2);
                int i4 = alVar2.charlie;
                al alVar3 = source.alpha;
                Intrinsics.checkNotNull(alVar3);
                long j6 = i4 - alVar3.bravo;
                int i5 = 0;
                if (j5 < j6) {
                    al alVar4 = this.alpha;
                    if (alVar4 != null) {
                        Intrinsics.checkNotNull(alVar4);
                        alVar = alVar4.golf;
                    } else {
                        alVar = null;
                    }
                    if (alVar != null && alVar.echo) {
                        if ((alVar.charlie + j5) - (alVar.delta ? 0 : alVar.bravo) <= 8192) {
                            al alVar5 = source.alpha;
                            Intrinsics.checkNotNull(alVar5);
                            alVar5.delta(alVar, (int) j5);
                            source.purple -= j5;
                            this.purple += j5;
                            return;
                        }
                    }
                    al alVar6 = source.alpha;
                    Intrinsics.checkNotNull(alVar6);
                    int i10 = (int) j5;
                    if (i10 <= 0) {
                        alVar6.getClass();
                    } else if (i10 <= alVar6.charlie - alVar6.bravo) {
                        if (i10 >= 1024) {
                            bravo = alVar6.charlie();
                        } else {
                            bravo = am.bravo();
                            int i11 = alVar6.bravo;
                            ArraysKt.xray(0, i11, i11 + i10, alVar6.alpha, bravo.alpha);
                        }
                        bravo.charlie = bravo.bravo + i10;
                        alVar6.bravo += i10;
                        al alVar7 = alVar6.golf;
                        Intrinsics.checkNotNull(alVar7);
                        alVar7.bravo(bravo);
                        source.alpha = bravo;
                    }
                    throw new IllegalArgumentException("byteCount out of range");
                }
                al alVar8 = source.alpha;
                Intrinsics.checkNotNull(alVar8);
                long j7 = alVar8.charlie - alVar8.bravo;
                source.alpha = alVar8.alpha();
                al alVar9 = this.alpha;
                if (alVar9 == null) {
                    this.alpha = alVar8;
                    alVar8.golf = alVar8;
                    alVar8.foxtrot = alVar8;
                } else {
                    Intrinsics.checkNotNull(alVar9);
                    al alVar10 = alVar9.golf;
                    Intrinsics.checkNotNull(alVar10);
                    alVar10.bravo(alVar8);
                    al alVar11 = alVar8.golf;
                    if (alVar11 != alVar8) {
                        Intrinsics.checkNotNull(alVar11);
                        if (alVar11.echo) {
                            int i12 = alVar8.charlie - alVar8.bravo;
                            al alVar12 = alVar8.golf;
                            Intrinsics.checkNotNull(alVar12);
                            int i13 = 8192 - alVar12.charlie;
                            al alVar13 = alVar8.golf;
                            Intrinsics.checkNotNull(alVar13);
                            if (!alVar13.delta) {
                                al alVar14 = alVar8.golf;
                                Intrinsics.checkNotNull(alVar14);
                                i5 = alVar14.bravo;
                            }
                            if (i12 <= i13 + i5) {
                                al alVar15 = alVar8.golf;
                                Intrinsics.checkNotNull(alVar15);
                                alVar8.delta(alVar15, i12);
                                alVar8.alpha();
                                am.alpha(alVar8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                source.purple -= j7;
                this.purple += j7;
                j5 -= j7;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // Tf.l
    public final /* bridge */ /* synthetic */ l xray(int i4) {
        white(i4);
        return this;
    }

    @Override // Tf.l
    public final /* bridge */ /* synthetic */ l y(long j5) {
        purple(j5);
        return this;
    }

    public final void yellow(long j5) {
        al magenta = magenta(8);
        int i4 = magenta.charlie;
        byte[] bArr = magenta.alpha;
        bArr[i4] = (byte) ((j5 >>> 56) & 255);
        bArr[i4 + 1] = (byte) ((j5 >>> 48) & 255);
        bArr[i4 + 2] = (byte) ((j5 >>> 40) & 255);
        bArr[i4 + 3] = (byte) ((j5 >>> 32) & 255);
        bArr[i4 + 4] = (byte) ((j5 >>> 24) & 255);
        bArr[i4 + 5] = (byte) ((j5 >>> 16) & 255);
        bArr[i4 + 6] = (byte) ((j5 >>> 8) & 255);
        bArr[i4 + 7] = (byte) (j5 & 255);
        magenta.charlie = i4 + 8;
        this.purple += 8;
    }

    @Override // Tf.l
    public final OutputStream z() {
        return new j(this, 0);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.echo(sink, "sink");
        al alVar = this.alpha;
        if (alVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), alVar.charlie - alVar.bravo);
        sink.put(alVar.alpha, alVar.bravo, min);
        int i4 = alVar.bravo + min;
        alVar.bravo = i4;
        this.purple -= min;
        if (i4 == alVar.charlie) {
            this.alpha = alVar.alpha();
            am.alpha(alVar);
        }
        return min;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.echo(source, "source");
        int remaining = source.remaining();
        int i4 = remaining;
        while (i4 > 0) {
            al magenta = magenta(1);
            int min = Math.min(i4, 8192 - magenta.charlie);
            source.get(magenta.alpha, magenta.charlie, min);
            i4 -= min;
            magenta.charlie += min;
        }
        this.purple += remaining;
        return remaining;
    }
}
