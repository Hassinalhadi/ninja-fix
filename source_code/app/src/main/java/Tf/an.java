package Tf;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class an extends n {
    public final transient byte[][] teal;
    public final transient int[] white;

    public an(byte[][] bArr, int[] iArr) {
        super(n.silver.alpha);
        this.teal = bArr;
        this.white = iArr;
    }

    @Override // Tf.n
    public final String alpha() {
        return uniform().alpha();
    }

    @Override // Tf.n
    public final n charlie(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.teal;
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int[] iArr = this.white;
            int i10 = iArr[length + i4];
            int i11 = iArr[i4];
            messageDigest.update(bArr[i4], i10, i11 - i5);
            i4++;
            i5 = i11;
        }
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNull(digest);
        return new n(digest);
    }

    @Override // Tf.n
    public final int delta() {
        return this.white[this.teal.length - 1];
    }

    @Override // Tf.n
    public final String echo() {
        return uniform().echo();
    }

    @Override // Tf.n
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                if (nVar.delta() == delta() && mike(0, nVar, delta())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // Tf.n
    public final int foxtrot(int i4, byte[] other) {
        Intrinsics.echo(other, "other");
        return uniform().foxtrot(i4, other);
    }

    @Override // Tf.n
    public final int hashCode() {
        int i4 = this.purple;
        if (i4 != 0) {
            return i4;
        }
        byte[][] bArr = this.teal;
        int length = bArr.length;
        int i5 = 0;
        int i10 = 1;
        int i11 = 0;
        while (i5 < length) {
            int[] iArr = this.white;
            int i12 = iArr[length + i5];
            int i13 = iArr[i5];
            byte[] bArr2 = bArr[i5];
            int i14 = (i13 - i11) + i12;
            while (i12 < i14) {
                i10 = (i10 * 31) + bArr2[i12];
                i12++;
            }
            i5++;
            i11 = i13;
        }
        this.purple = i10;
        return i10;
    }

    @Override // Tf.n
    public final byte[] hotel() {
        return tango();
    }

    @Override // Tf.n
    public final byte india(int i4) {
        int i5;
        byte[][] bArr = this.teal;
        int length = bArr.length - 1;
        int[] iArr = this.white;
        b.echo(iArr[length], i4, 1L);
        int delta = Uf.b.delta(this, i4);
        if (delta == 0) {
            i5 = 0;
        } else {
            i5 = iArr[delta - 1];
        }
        return bArr[delta][(i4 - i5) + iArr[bArr.length + delta]];
    }

    @Override // Tf.n
    public final int juliet(byte[] other) {
        Intrinsics.echo(other, "other");
        return uniform().juliet(other);
    }

    @Override // Tf.n
    public final boolean lima(int i4, int i5, int i10, byte[] other) {
        int i11;
        Intrinsics.echo(other, "other");
        if (i4 < 0 || i4 > delta() - i10 || i5 < 0 || i5 > other.length - i10) {
            return false;
        }
        int i12 = i10 + i4;
        int delta = Uf.b.delta(this, i4);
        while (i4 < i12) {
            int[] iArr = this.white;
            if (delta == 0) {
                i11 = 0;
            } else {
                i11 = iArr[delta - 1];
            }
            int i13 = iArr[delta] - i11;
            byte[][] bArr = this.teal;
            int i14 = iArr[bArr.length + delta];
            int min = Math.min(i12, i13 + i11) - i4;
            if (!b.alpha((i4 - i11) + i14, i5, min, bArr[delta], other)) {
                return false;
            }
            i5 += min;
            i4 += min;
            delta++;
        }
        return true;
    }

    @Override // Tf.n
    public final boolean mike(int i4, n other, int i5) {
        int i10;
        Intrinsics.echo(other, "other");
        if (i4 >= 0 && i4 <= delta() - i5) {
            int i11 = i5 + i4;
            int delta = Uf.b.delta(this, i4);
            int i12 = 0;
            while (i4 < i11) {
                int[] iArr = this.white;
                if (delta == 0) {
                    i10 = 0;
                } else {
                    i10 = iArr[delta - 1];
                }
                int i13 = iArr[delta] - i10;
                byte[][] bArr = this.teal;
                int i14 = iArr[bArr.length + delta];
                int min = Math.min(i11, i13 + i10) - i4;
                if (other.lima(i12, (i4 - i10) + i14, min, bArr[delta])) {
                    i12 += min;
                    i4 += min;
                    delta++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // Tf.n
    public final String november(Charset charset) {
        Intrinsics.echo(charset, "charset");
        return uniform().november(charset);
    }

    @Override // Tf.n
    public final n oscar(int i4, int i5) {
        if (i5 == -1234567890) {
            i5 = delta();
        }
        if (i4 >= 0) {
            if (i5 <= delta()) {
                int i10 = i5 - i4;
                if (i10 >= 0) {
                    if (i4 == 0 && i5 == delta()) {
                        return this;
                    }
                    if (i4 == i5) {
                        return n.silver;
                    }
                    int delta = Uf.b.delta(this, i4);
                    int delta2 = Uf.b.delta(this, i5 - 1);
                    byte[][] bArr = this.teal;
                    byte[][] bArr2 = (byte[][]) ArraysKt.blue(delta, bArr, delta2 + 1);
                    int[] iArr = new int[bArr2.length * 2];
                    int i11 = 0;
                    int[] iArr2 = this.white;
                    if (delta <= delta2) {
                        int i12 = delta;
                        int i13 = 0;
                        while (true) {
                            iArr[i13] = Math.min(iArr2[i12] - i4, i10);
                            int i14 = i13 + 1;
                            iArr[i13 + bArr2.length] = iArr2[bArr.length + i12];
                            if (i12 == delta2) {
                                break;
                            }
                            i12++;
                            i13 = i14;
                        }
                    }
                    if (delta != 0) {
                        i11 = iArr2[delta - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i4 - i11) + iArr[length];
                    return new an(bArr2, iArr);
                }
                throw new IllegalArgumentException(A0.z.juliet("endIndex=", i5, i4, " < beginIndex=").toString());
            }
            StringBuilder sierra = Q0.c.sierra(i5, "endIndex=", " > length(");
            sierra.append(delta());
            sierra.append(')');
            throw new IllegalArgumentException(sierra.toString().toString());
        }
        throw new IllegalArgumentException(av.q.delta(i4, "beginIndex=", " < 0").toString());
    }

    @Override // Tf.n
    public final n quebec() {
        return uniform().quebec();
    }

    @Override // Tf.n
    public final void sierra(int i4, k buffer) {
        int i5;
        Intrinsics.echo(buffer, "buffer");
        int delta = Uf.b.delta(this, 0);
        int i10 = 0;
        while (i10 < i4) {
            int[] iArr = this.white;
            if (delta == 0) {
                i5 = 0;
            } else {
                i5 = iArr[delta - 1];
            }
            int i11 = iArr[delta] - i5;
            byte[][] bArr = this.teal;
            int i12 = iArr[bArr.length + delta];
            int min = Math.min(i4, i11 + i5) - i10;
            int i13 = (i10 - i5) + i12;
            al alVar = new al(bArr[delta], i13, i13 + min, true, false);
            al alVar2 = buffer.alpha;
            if (alVar2 == null) {
                alVar.golf = alVar;
                alVar.foxtrot = alVar;
                buffer.alpha = alVar;
            } else {
                Intrinsics.checkNotNull(alVar2);
                al alVar3 = alVar2.golf;
                Intrinsics.checkNotNull(alVar3);
                alVar3.bravo(alVar);
            }
            i10 += min;
            delta++;
        }
        buffer.purple += i4;
    }

    public final byte[] tango() {
        byte[] bArr = new byte[delta()];
        byte[][] bArr2 = this.teal;
        int length = bArr2.length;
        int i4 = 0;
        int i5 = 0;
        int i10 = 0;
        while (i4 < length) {
            int[] iArr = this.white;
            int i11 = iArr[length + i4];
            int i12 = iArr[i4];
            int i13 = i12 - i5;
            ArraysKt.xray(i10, i11, i11 + i13, bArr2[i4], bArr);
            i10 += i13;
            i4++;
            i5 = i12;
        }
        return bArr;
    }

    @Override // Tf.n
    public final String toString() {
        return uniform().toString();
    }

    public final n uniform() {
        return new n(tango());
    }
}
