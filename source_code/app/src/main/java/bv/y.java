package bv;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y {
    public long[] alpha;
    public int[] bravo;
    public int[] charlie;
    public int delta;
    public int echo;
    public int foxtrot;

    public y(int i4) {
        this.alpha = au.alpha;
        int[] iArr = p.alpha;
        this.bravo = iArr;
        this.charlie = iArr;
        if (i4 >= 0) {
            echo(au.delta(i4));
        } else {
            bw.a.charlie("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void alpha() {
        this.echo = 0;
        long[] jArr = this.alpha;
        if (jArr != au.alpha) {
            ArraysKt.cyan(jArr, -9187201950435737472L);
            long[] jArr2 = this.alpha;
            int i4 = this.delta;
            int i5 = i4 >> 3;
            long j5 = 255 << ((i4 & 7) << 3);
            jArr2[i5] = (jArr2[i5] & (~j5)) | j5;
        }
        this.foxtrot = au.alpha(this.delta) - this.echo;
    }

    public final int bravo(int i4) {
        int i5 = this.delta;
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

    public final int charlie(int i4) {
        int i5 = (-862048943) * i4;
        int i10 = i5 ^ (i5 << 16);
        int i11 = i10 & 127;
        int i12 = this.delta;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.alpha;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j5 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j6 = (i11 * 72340172838076673L) ^ j5;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i13) & i12;
                if (this.bravo[numberOfTrailingZeros] == i4) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final int delta(int i4) {
        int charlie = charlie(i4);
        if (charlie >= 0) {
            return this.charlie[charlie];
        }
        return -1;
    }

    public final void echo(int i4) {
        int i5;
        long[] jArr;
        if (i4 > 0) {
            i5 = Math.max(7, au.charlie(i4));
        } else {
            i5 = 0;
        }
        this.delta = i5;
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
        this.foxtrot = au.alpha(this.delta) - this.echo;
        this.bravo = new int[i5];
        this.charlie = new int[i5];
    }

    public final boolean equals(Object obj) {
        boolean z2;
        boolean z10;
        boolean z11 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (yVar.echo != this.echo) {
            return false;
        }
        int[] iArr = this.bravo;
        int[] iArr2 = this.charlie;
        long[] jArr = this.alpha;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i4 = 0;
        loop0: while (true) {
            long j5 = jArr[i4];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i5) {
                    if ((255 & j5) < 128) {
                        int i11 = (i4 << 3) + i10;
                        int i12 = iArr[i11];
                        int i13 = iArr2[i11];
                        int charlie = yVar.charlie(i12);
                        if (charlie < 0) {
                            break loop0;
                        }
                        z10 = z11;
                        if (i13 != yVar.charlie[charlie]) {
                            break loop0;
                        }
                    } else {
                        z10 = z11;
                    }
                    j5 >>= 8;
                    i10++;
                    z11 = z10;
                }
                z2 = z11;
                if (i5 != 8) {
                    return z2;
                }
            } else {
                z2 = z11;
            }
            if (i4 != length) {
                i4++;
                z11 = z2;
            } else {
                return z2;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        r20 = r11;
        r3 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (((((~r7) << 6) & r7) & r20) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        r2 = bravo(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r37.foxtrot != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (((r37.alpha[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        r2 = r37.delta;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (r2 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        r22 = 128;
        r24 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (java.lang.Long.compare((r37.echo * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        r2 = r37.alpha;
        r5 = r37.delta;
        r6 = r37.bravo;
        r7 = r37.charlie;
        r8 = (r5 + 7) >> 3;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        if (r11 >= r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d4, code lost:
    
        r17 = r13;
        r13 = r2[r11] & r20;
        r2[r11] = ((~r13) + (r13 >>> 7)) & (-72340172838076674L);
        r11 = r11 + 1;
        r14 = r14;
        r13 = r17;
        r4 = r4;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
    
        r28 = r4;
        r17 = r13;
        r12 = r14;
        r3 = kotlin.collections.ArraysKt.green(r2);
        r4 = r3 - 1;
        r2[r4] = (r2[r4] & 72057594037927935L) | (-72057594037927936L);
        r2[r3] = r2[0];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0116, code lost:
    
        if (r3 == r5) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0118, code lost:
    
        r4 = r3 >> 3;
        r8 = (r3 & 7) << 3;
        r13 = (r2[r4] >> r8) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0125, code lost:
    
        if (r13 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012c, code lost:
    
        if (r13 == 254) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012f, code lost:
    
        r11 = r6[r3] * r17;
        r13 = (r11 ^ (r11 << 16)) >>> 7;
        r14 = bravo(r13);
        r13 = r13 & r5;
        r31 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014a, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r3 - r13) & r5) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014c, code lost:
    
        r2[r4] = ((~(255 << r8)) & r2[r4]) | ((r11 & 127) << r8);
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016a, code lost:
    
        r12 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016d, code lost:
    
        r30 = r3;
        r3 = r14 >> 3;
        r12 = r2[r3];
        r4 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017f, code lost:
    
        if (((r12 >> r4) & 255) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0181, code lost:
    
        r2[r3] = ((~(255 << r4)) & r12) | ((r11 & 127) << r4);
        r2[r4] = (r2[r4] & (~(255 << r8))) | (128 << r8);
        r6[r14] = r6[r30];
        r6[r30] = 0;
        r7[r14] = r7[r30];
        r7[r30] = 0;
        r3 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d1, code lost:
    
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ad, code lost:
    
        r2[r3] = ((~(255 << r4)) & r12) | ((r11 & 127) << r4);
        r3 = r6[r14];
        r6[r14] = r6[r30];
        r6[r30] = r3;
        r3 = r7[r14];
        r7[r14] = r7[r30];
        r7[r30] = r3;
        r3 = r30 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0127, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01df, code lost:
    
        r31 = r12;
        r37.foxtrot = bv.au.alpha(r37.delta) - r37.echo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x026e, code lost:
    
        r2 = bravo(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0272, code lost:
    
        r37.echo++;
        r1 = r37.foxtrot;
        r3 = r37.alpha;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x028a, code lost:
    
        if (((r5 >> r7) & r24) != r22) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x028d, code lost:
    
        r31 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x028f, code lost:
    
        r37.foxtrot = r1 - r31;
        r1 = r37.delta;
        r5 = (r5 & (~(r24 << r7))) | (r9 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f0, code lost:
    
        r28 = r4;
        r31 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01fe, code lost:
    
        r2 = bv.au.bravo(r37.delta);
        r3 = r37.alpha;
        r4 = r37.bravo;
        r5 = r37.charlie;
        r6 = r37.delta;
        echo(r2);
        r2 = r37.alpha;
        r7 = r37.bravo;
        r8 = r37.charlie;
        r11 = r37.delta;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0218, code lost:
    
        if (r12 >= r6) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0228, code lost:
    
        if (((r3[r12 >> 3] >> ((r12 & 7) << 3)) & r24) >= r22) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x022a, code lost:
    
        r13 = r4[r12];
        r14 = r13 * r13;
        r14 = r14 ^ (r14 << 16);
        r15 = bravo(r14 >>> 7);
        r19 = r2;
        r1 = r14 & 127;
        r14 = r15 >> 3;
        r20 = (r15 & 7) << 3;
        r1 = (r19[r14] & (~(r24 << r20))) | (r1 << r20);
        r19[r14] = r1;
        r19[(((r15 - 7) & r11) + (r11 & 7)) >> 3] = r1;
        r7[r15] = r13;
        r8[r15] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0266, code lost:
    
        r12 = r12 + 1;
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0264, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f7, code lost:
    
        r24 = 255;
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0099, code lost:
    
        r24 = 255;
        r31 = 1;
        r22 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void foxtrot(int i4, int i5) {
        int i10;
        int i11 = i4;
        int i12 = -862048943;
        int i13 = i11 * (-862048943);
        int i14 = i13 ^ (i13 << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.delta;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr = this.alpha;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            int i23 = i19;
            long j5 = (((-i21) >> 63) & (jArr[i20 + 1] << (64 - i21))) | (jArr[i20] >>> i21);
            long j6 = i16;
            int i24 = i12;
            int i25 = i16;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j10 = -9187201950435737472L;
            long j11 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j11) >> 3)) & i17;
                long j12 = j10;
                if (this.bravo[numberOfTrailingZeros] == i11) {
                    i10 = numberOfTrailingZeros;
                    break loop0;
                } else {
                    j11 &= j11 - 1;
                    j10 = j12;
                }
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i12 = i24;
            i16 = i25;
            i11 = i4;
        }
        if (i10 < 0) {
            i10 = ~i10;
        }
        this.bravo[i10] = i4;
        this.charlie[i10] = i5;
    }

    public final int hashCode() {
        int[] iArr = this.bravo;
        int[] iArr2 = this.charlie;
        long[] jArr = this.alpha;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            long j5 = jArr[i4];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i4 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j5) < 128) {
                        int i12 = (i4 << 3) + i11;
                        i5 += iArr2[i12] ^ iArr[i12];
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
        if (this.echo == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.bravo;
        int[] iArr2 = this.charlie;
        long[] jArr = this.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j5) < 128) {
                            int i12 = (i4 << 3) + i11;
                            int i13 = iArr[i12];
                            int i14 = iArr2[i12];
                            sb2.append(i13);
                            sb2.append("=");
                            sb2.append(i14);
                            i5++;
                            if (i5 < this.echo) {
                                sb2.append(", ");
                            }
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
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }

    public /* synthetic */ y() {
        this(6);
    }
}
