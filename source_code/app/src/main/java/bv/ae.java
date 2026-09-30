package bv;

import com.clevertap.android.sdk.Constants;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ae {
    public long[] alpha = au.alpha;
    public long[] bravo = t.alpha;
    public int charlie;
    public int delta;
    public int echo;

    public ae(int i4) {
        if (i4 >= 0) {
            charlie(au.delta(i4));
        } else {
            bw.a.charlie("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean alpha(long j5) {
        int i4;
        int i5 = ((int) (j5 ^ (j5 >>> 32))) * (-862048943);
        int i10 = i5 ^ (i5 << 16);
        int i11 = i10 & 127;
        int i12 = this.charlie;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.alpha;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j6 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j7 = (i11 * 72340172838076673L) ^ j6;
            long j10 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i4 = ((Long.numberOfTrailingZeros(j10) >> 3) + i13) & i12;
                if (this.bravo[i4] == j5) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (i4 < 0) {
            return false;
        }
        return true;
    }

    public final int bravo(int i4) {
        int i5 = this.charlie;
        int i10 = i4 & i5;
        int i11 = 0;
        while (true) {
            long[] jArr = this.alpha;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j5 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j6 = j5 & ((~j5) << 7) & (-9187201950435737472L);
            if (j6 != 0) {
                return (i10 + (Long.numberOfTrailingZeros(j6) >> 3)) & i5;
            }
            i11 += 8;
            i10 = (i10 + i11) & i5;
        }
    }

    public final void charlie(int i4) {
        int i5;
        long[] jArr;
        if (i4 > 0) {
            i5 = Math.max(7, au.charlie(i4));
        } else {
            i5 = 0;
        }
        this.charlie = i5;
        if (i5 == 0) {
            jArr = au.alpha;
        } else {
            jArr = new long[((i5 + 15) & (-8)) >> 3];
            ArraysKt.cyan(jArr, -9187201950435737472L);
        }
        this.alpha = jArr;
        int i10 = i5 >> 3;
        long j5 = 255 << ((i5 & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j5)) | j5;
        this.echo = au.alpha(this.charlie) - this.delta;
        this.bravo = new long[i5];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        if (aeVar.delta != this.delta) {
            return false;
        }
        long[] jArr = this.bravo;
        long[] jArr2 = this.alpha;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr2[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128 && !aeVar.alpha(jArr[(i4 << 3) + i10])) {
                            return false;
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.bravo;
        long[] jArr2 = this.alpha;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            long j5 = jArr2[i4];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i4 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j5) < 128) {
                        long j6 = jArr[(i4 << 3) + i11];
                        i5 += (int) (j6 ^ (j6 >>> 32));
                    }
                    j5 >>= 8;
                }
                if (i10 != 8) {
                    return i5;
                }
            }
            if (i4 != length) {
                i4++;
            } else {
                return i5;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) Constants.AES_PREFIX);
        long[] jArr = this.bravo;
        long[] jArr2 = this.alpha;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j5 = jArr2[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j5) < 128) {
                            long j6 = jArr[(i4 << 3) + i11];
                            if (i5 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i5 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append(j6);
                            i5++;
                        }
                        j5 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        sb2.append((CharSequence) Constants.AES_SUFFIX);
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
