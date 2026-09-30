package Tf;

import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements Closeable, AutoCloseable {
    public k alpha;
    public boolean purple;
    public al red;
    public byte[] teal;
    public long silver = -1;
    public int white = -1;
    public int yellow = -1;

    public final void charlie(long j5) {
        k kVar = this.alpha;
        if (kVar != null) {
            if (this.purple) {
                long j6 = kVar.purple;
                if (j5 <= j6) {
                    if (j5 >= 0) {
                        long j7 = j6 - j5;
                        while (true) {
                            if (j7 <= 0) {
                                break;
                            }
                            al alVar = kVar.alpha;
                            Intrinsics.checkNotNull(alVar);
                            al alVar2 = alVar.golf;
                            Intrinsics.checkNotNull(alVar2);
                            int i4 = alVar2.charlie;
                            long j10 = i4 - alVar2.bravo;
                            if (j10 <= j7) {
                                kVar.alpha = alVar2.alpha();
                                am.alpha(alVar2);
                                j7 -= j10;
                            } else {
                                alVar2.charlie = i4 - ((int) j7);
                                break;
                            }
                        }
                        this.red = null;
                        this.silver = j5;
                        this.teal = null;
                        this.white = -1;
                        this.yellow = -1;
                    } else {
                        throw new IllegalArgumentException(A0.z.india(j5, "newSize < 0: ").toString());
                    }
                } else if (j5 > j6) {
                    long j11 = j5 - j6;
                    int i5 = 1;
                    boolean z2 = true;
                    for (long j12 = 0; j11 > j12; j12 = 0) {
                        al magenta = kVar.magenta(i5);
                        int min = (int) Math.min(j11, 8192 - magenta.charlie);
                        int i10 = magenta.charlie + min;
                        magenta.charlie = i10;
                        j11 -= min;
                        if (z2) {
                            this.red = magenta;
                            this.silver = j6;
                            this.teal = magenta.alpha;
                            this.white = i10 - min;
                            this.yellow = i10;
                            z2 = false;
                        }
                        i5 = 1;
                    }
                }
                kVar.purple = j5;
                return;
            }
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        throw new IllegalStateException("not attached to a buffer");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.alpha != null) {
            this.alpha = null;
            this.red = null;
            this.silver = -1L;
            this.teal = null;
            this.white = -1;
            this.yellow = -1;
            return;
        }
        throw new IllegalStateException("not attached to a buffer");
    }

    public final int echo(long j5) {
        al alVar;
        k kVar = this.alpha;
        if (kVar != null) {
            if (j5 >= -1) {
                long j6 = kVar.purple;
                if (j5 <= j6) {
                    if (j5 != -1 && j5 != j6) {
                        al alVar2 = kVar.alpha;
                        al alVar3 = this.red;
                        long j7 = 0;
                        if (alVar3 != null) {
                            long j10 = this.silver;
                            int i4 = this.white;
                            Intrinsics.checkNotNull(alVar3);
                            long j11 = j10 - (i4 - alVar3.bravo);
                            if (j11 > j5) {
                                alVar = alVar2;
                                alVar2 = this.red;
                                j6 = j11;
                            } else {
                                alVar = this.red;
                                j7 = j11;
                            }
                        } else {
                            alVar = alVar2;
                        }
                        if (j6 - j5 > j5 - j7) {
                            while (true) {
                                Intrinsics.checkNotNull(alVar);
                                long j12 = (alVar.charlie - alVar.bravo) + j7;
                                if (j5 < j12) {
                                    break;
                                }
                                alVar = alVar.foxtrot;
                                j7 = j12;
                            }
                        } else {
                            while (j6 > j5) {
                                Intrinsics.checkNotNull(alVar2);
                                alVar2 = alVar2.golf;
                                Intrinsics.checkNotNull(alVar2);
                                j6 -= alVar2.charlie - alVar2.bravo;
                            }
                            alVar = alVar2;
                            j7 = j6;
                        }
                        if (this.purple) {
                            Intrinsics.checkNotNull(alVar);
                            if (alVar.delta) {
                                byte[] bArr = alVar.alpha;
                                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                                Intrinsics.delta(copyOf, "copyOf(...)");
                                al alVar4 = new al(copyOf, alVar.bravo, alVar.charlie, false, true);
                                if (kVar.alpha == alVar) {
                                    kVar.alpha = alVar4;
                                }
                                alVar.bravo(alVar4);
                                al alVar5 = alVar4.golf;
                                Intrinsics.checkNotNull(alVar5);
                                alVar5.alpha();
                                alVar = alVar4;
                            }
                        }
                        this.red = alVar;
                        this.silver = j5;
                        Intrinsics.checkNotNull(alVar);
                        this.teal = alVar.alpha;
                        int i5 = alVar.bravo + ((int) (j5 - j7));
                        this.white = i5;
                        int i10 = alVar.charlie;
                        this.yellow = i10;
                        return i10 - i5;
                    }
                    this.red = null;
                    this.silver = j5;
                    this.teal = null;
                    this.white = -1;
                    this.yellow = -1;
                    return -1;
                }
            }
            StringBuilder uniform = Q0.c.uniform("offset=", j5, " > size=");
            uniform.append(kVar.purple);
            throw new ArrayIndexOutOfBoundsException(uniform.toString());
        }
        throw new IllegalStateException("not attached to a buffer");
    }
}
