package Gf;

import A0.z;
import av.q;
import java.io.EOFException;
import java.io.Flushable;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements i, AutoCloseable, Flushable {
    public g alpha;
    public g purple;
    public long red;

    public final void azure(a source, long j5) {
        g bravo;
        int i4;
        Intrinsics.echo(source, "source");
        if (source != this) {
            long j6 = source.red;
            if (0 <= j6 && j6 >= j5 && j5 >= 0) {
                while (j5 > 0) {
                    Intrinsics.checkNotNull(source.alpha);
                    int i5 = 0;
                    if (j5 < r0.bravo()) {
                        g gVar = this.purple;
                        if (gVar != null && gVar.echo) {
                            long j7 = gVar.charlie + j5;
                            k kVar = gVar.delta;
                            if (kVar != null && ((f) kVar).bravo > 0) {
                                i4 = 0;
                            } else {
                                i4 = gVar.bravo;
                            }
                            if (j7 - i4 <= 8192) {
                                g gVar2 = source.alpha;
                                Intrinsics.checkNotNull(gVar2);
                                gVar2.golf(gVar, (int) j5);
                                source.red -= j5;
                                this.red += j5;
                                return;
                            }
                        }
                        g gVar3 = source.alpha;
                        Intrinsics.checkNotNull(gVar3);
                        int i10 = (int) j5;
                        if (i10 > 0) {
                            if (i10 <= gVar3.charlie - gVar3.bravo) {
                                if (i10 >= 1024) {
                                    bravo = gVar3.foxtrot();
                                } else {
                                    bravo = h.bravo();
                                    int i11 = gVar3.bravo;
                                    ArraysKt.xray(0, i11, i11 + i10, gVar3.alpha, bravo.alpha);
                                }
                                bravo.charlie = bravo.bravo + i10;
                                gVar3.bravo += i10;
                                g gVar4 = gVar3.golf;
                                if (gVar4 != null) {
                                    Intrinsics.checkNotNull(gVar4);
                                    gVar4.echo(bravo);
                                } else {
                                    bravo.foxtrot = gVar3;
                                    gVar3.golf = bravo;
                                }
                                source.alpha = bravo;
                            }
                        } else {
                            gVar3.getClass();
                        }
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                    g gVar5 = source.alpha;
                    Intrinsics.checkNotNull(gVar5);
                    long bravo2 = gVar5.bravo();
                    g delta = gVar5.delta();
                    source.alpha = delta;
                    if (delta == null) {
                        source.purple = null;
                    }
                    if (this.alpha == null) {
                        this.alpha = gVar5;
                        this.purple = gVar5;
                    } else {
                        g gVar6 = this.purple;
                        Intrinsics.checkNotNull(gVar6);
                        gVar6.echo(gVar5);
                        g gVar7 = gVar5.golf;
                        if (gVar7 != null) {
                            Intrinsics.checkNotNull(gVar7);
                            if (gVar7.echo) {
                                int i12 = gVar5.charlie - gVar5.bravo;
                                g gVar8 = gVar5.golf;
                                Intrinsics.checkNotNull(gVar8);
                                int i13 = 8192 - gVar8.charlie;
                                g gVar9 = gVar5.golf;
                                Intrinsics.checkNotNull(gVar9);
                                k kVar2 = gVar9.delta;
                                if (kVar2 == null || ((f) kVar2).bravo <= 0) {
                                    g gVar10 = gVar5.golf;
                                    Intrinsics.checkNotNull(gVar10);
                                    i5 = gVar10.bravo;
                                }
                                if (i12 <= i13 + i5) {
                                    g gVar11 = gVar5.golf;
                                    Intrinsics.checkNotNull(gVar11);
                                    gVar5.golf(gVar11, i12);
                                    if (gVar5.delta() == null) {
                                        h.alpha(gVar5);
                                        gVar5 = gVar11;
                                    } else {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                }
                            }
                            this.purple = gVar5;
                            Intrinsics.checkNotNull(gVar5);
                            if (gVar5.golf == null) {
                                this.alpha = this.purple;
                            }
                        } else {
                            throw new IllegalStateException("cannot compact");
                        }
                    }
                    source.red -= bravo2;
                    this.red += bravo2;
                    j5 -= bravo2;
                }
                return;
            }
            throw new IllegalArgumentException(Q0.c.mike(j6, "))", Q0.c.uniform("offset (0) and byteCount (", j5, ") are not within the range [0..size(")));
        }
        throw new IllegalArgumentException("source == this");
    }

    public final void beige(byte b2) {
        g quebec = quebec(1);
        int i4 = quebec.charlie;
        quebec.charlie = i4 + 1;
        quebec.alpha[i4] = b2;
        this.red++;
    }

    public final int charlie(byte[] bArr, int i4, int i5) {
        k.alpha(bArr.length, i4, i5);
        g gVar = this.alpha;
        if (gVar == null) {
            return -1;
        }
        int min = Math.min(i5 - i4, gVar.bravo());
        int i10 = (i4 + min) - i4;
        int i11 = gVar.bravo;
        ArraysKt.xray(i4, i11, i11 + i10, gVar.alpha, bArr);
        gVar.bravo += i10;
        this.red -= min;
        if (k.charlie(gVar)) {
            foxtrot();
        }
        return min;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // Gf.i
    public final a delta() {
        return this;
    }

    public final void echo(a sink, long j5) {
        Intrinsics.echo(sink, "sink");
        if (j5 >= 0) {
            long j6 = this.red;
            if (j6 >= j5) {
                sink.azure(this, j5);
                return;
            } else {
                sink.azure(this, j6);
                throw new EOFException(Q0.c.mike(this.red, " bytes were written.", Q0.c.uniform("Buffer exhausted before writing ", j5, " bytes. Only ")));
            }
        }
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.kilo("byteCount (", j5, ") < 0").toString());
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    public final void foxtrot() {
        g gVar = this.alpha;
        Intrinsics.checkNotNull(gVar);
        g gVar2 = gVar.foxtrot;
        this.alpha = gVar2;
        if (gVar2 == null) {
            this.purple = null;
        } else {
            gVar2.golf = null;
        }
        gVar.foxtrot = null;
        h.alpha(gVar);
    }

    public final /* synthetic */ void golf() {
        g gVar = this.purple;
        Intrinsics.checkNotNull(gVar);
        g gVar2 = gVar.golf;
        this.purple = gVar2;
        if (gVar2 == null) {
            this.alpha = null;
        } else {
            gVar2.foxtrot = null;
        }
        gVar.golf = null;
        h.alpha(gVar);
    }

    @Override // Gf.d
    public final long h(a sink, long j5) {
        Intrinsics.echo(sink, "sink");
        if (j5 >= 0) {
            long j6 = this.red;
            if (j6 == 0) {
                return -1L;
            }
            if (j5 > j6) {
                j5 = j6;
            }
            sink.azure(this, j5);
            return j5;
        }
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.kilo("byteCount (", j5, ") < 0").toString());
    }

    @Override // Gf.i
    public final boolean hotel() {
        if (this.red == 0) {
            return true;
        }
        return false;
    }

    public final void india(long j5) {
        if (j5 >= 0) {
            long j6 = j5;
            while (j6 > 0) {
                g gVar = this.alpha;
                if (gVar != null) {
                    int min = (int) Math.min(j6, gVar.charlie - gVar.bravo);
                    long j7 = min;
                    this.red -= j7;
                    j6 -= j7;
                    int i4 = gVar.bravo + min;
                    gVar.bravo = i4;
                    if (i4 == gVar.charlie) {
                        foxtrot();
                    }
                } else {
                    throw new EOFException(com.google.android.material.datepicker.j.kilo("Buffer exhausted before skipping ", j5, " bytes."));
                }
            }
            return;
        }
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.kilo("byteCount (", j5, ") < 0").toString());
    }

    public final long juliet(d source) {
        Intrinsics.echo(source, "source");
        long j5 = 0;
        while (true) {
            long h4 = source.h(this, 8192L);
            if (h4 != -1) {
                j5 += h4;
            } else {
                return j5;
            }
        }
    }

    @Override // Gf.i
    public final void kilo(long j5) {
        if (j5 >= 0) {
            if (this.red >= j5) {
                return;
            }
            throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.red + ", required: " + j5 + ')');
        }
        throw new IllegalArgumentException(z.india(j5, "byteCount: ").toString());
    }

    public final long papa(a sink) {
        Intrinsics.echo(sink, "sink");
        long j5 = this.red;
        if (j5 > 0) {
            sink.azure(this, j5);
        }
        return j5;
    }

    @Override // Gf.i
    public final e peek() {
        return new e(new c(this));
    }

    public final /* synthetic */ g quebec(int i4) {
        if (i4 >= 1 && i4 <= 8192) {
            g gVar = this.purple;
            if (gVar == null) {
                g bravo = h.bravo();
                this.alpha = bravo;
                this.purple = bravo;
                return bravo;
            }
            Intrinsics.checkNotNull(gVar);
            if (gVar.charlie + i4 <= 8192 && gVar.echo) {
                return gVar;
            }
            g bravo2 = h.bravo();
            gVar.echo(bravo2);
            this.purple = bravo2;
            return bravo2;
        }
        throw new IllegalArgumentException(q.delta(i4, "unexpected capacity (", "), should be in range [1, 8192]").toString());
    }

    @Override // Gf.i
    public final byte readByte() {
        g gVar = this.alpha;
        if (gVar != null) {
            int bravo = gVar.bravo();
            if (bravo == 0) {
                foxtrot();
                return readByte();
            }
            int i4 = gVar.bravo;
            gVar.bravo = i4 + 1;
            byte b2 = gVar.alpha[i4];
            this.red--;
            if (bravo == 1) {
                foxtrot();
            }
            return b2;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.red + ", required: 1)");
    }

    @Override // Gf.i
    public final boolean request(long j5) {
        if (j5 >= 0) {
            if (this.red >= j5) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException(com.google.android.material.datepicker.j.kilo("byteCount: ", j5, " < 0").toString());
    }

    public final String toString() {
        int i4;
        long j5 = this.red;
        if (j5 == 0) {
            return "Buffer(size=0)";
        }
        long j6 = 64;
        int min = (int) Math.min(j6, j5);
        int i5 = min * 2;
        if (this.red > j6) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        StringBuilder sb2 = new StringBuilder(i5 + i4);
        int i10 = 0;
        for (g gVar = this.alpha; gVar != null; gVar = gVar.foxtrot) {
            int i11 = 0;
            while (i10 < min && i11 < gVar.bravo()) {
                int i12 = i11 + 1;
                byte charlie = gVar.charlie(i11);
                i10++;
                char[] cArr = k.alpha;
                sb2.append(cArr[(charlie >> 4) & 15]);
                sb2.append(cArr[charlie & 15]);
                i11 = i12;
            }
        }
        if (this.red > j6) {
            sb2.append((char) 8230);
        }
        return "Buffer(size=" + this.red + " hex=" + ((Object) sb2) + ')';
    }

    public final void uniform(int i4, byte[] source) {
        Intrinsics.echo(source, "source");
        int i5 = 0;
        k.alpha(source.length, 0, i4);
        while (i5 < i4) {
            g quebec = quebec(1);
            int min = Math.min(i4 - i5, quebec.alpha()) + i5;
            ArraysKt.xray(quebec.charlie, i5, min, source, quebec.alpha);
            quebec.charlie = (min - i5) + quebec.charlie;
            i5 = min;
        }
        this.red += i4;
    }
}
