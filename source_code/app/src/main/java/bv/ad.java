package bv;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ad {
    public long[] alpha = au.alpha;
    public long[] bravo = t.alpha;
    public Object[] charlie = bw.a.charlie;
    public int delta;
    public int echo;
    public int foxtrot;

    public ad(int i4) {
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
        ArraysKt.coral(0, this.delta, null, this.charlie);
        this.foxtrot = au.alpha(this.delta) - this.echo;
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
    public final boolean bravo(long j5) {
        int i4;
        int i5 = ((int) (j5 ^ (j5 >>> 32))) * (-862048943);
        int i10 = i5 ^ (i5 << 16);
        int i11 = i10 & 127;
        int i12 = this.delta;
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

    public final int charlie(int i4) {
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delta(long j5) {
        int i4;
        int i5 = ((int) ((j5 >>> 32) ^ j5)) * (-862048943);
        int i10 = i5 ^ (i5 << 16);
        int i11 = i10 & 127;
        int i12 = this.delta;
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
        if (i4 >= 0) {
            return this.charlie[i4];
        }
        return null;
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
        this.bravo = new long[i5];
        this.charlie = new Object[i5];
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z2;
        long[] jArr;
        boolean z10;
        long[] jArr2;
        boolean z11 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        if (adVar.echo != this.echo) {
            return false;
        }
        long[] jArr3 = this.bravo;
        Object[] objArr = this.charlie;
        long[] jArr4 = this.alpha;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i4 = 0;
        loop0: while (true) {
            long j5 = jArr4[i4];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i5) {
                    if ((255 & j5) < 128) {
                        int i11 = (i4 << 3) + i10;
                        z10 = z11;
                        jArr2 = jArr3;
                        long j6 = jArr2[i11];
                        Object obj2 = objArr[i11];
                        if (obj2 == null) {
                            if (adVar.delta(j6) != null || !adVar.bravo(j6)) {
                                break loop0;
                            }
                        } else if (!Intrinsics.areEqual(obj2, adVar.delta(j6))) {
                            return false;
                        }
                    } else {
                        z10 = z11;
                        jArr2 = jArr3;
                    }
                    j5 >>= 8;
                    i10++;
                    z11 = z10;
                    jArr3 = jArr2;
                }
                z2 = z11;
                jArr = jArr3;
                if (i5 != 8) {
                    return z2;
                }
            } else {
                z2 = z11;
                jArr = jArr3;
            }
            if (i4 != length) {
                i4++;
                z11 = z2;
                jArr3 = jArr;
            } else {
                return z2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object foxtrot(long j5) {
        int i4;
        int i5 = ((int) ((j5 >>> 32) ^ j5)) * (-862048943);
        int i10 = i5 ^ (i5 << 16);
        int i11 = i10 & 127;
        int i12 = this.delta;
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
            return null;
        }
        this.echo--;
        long[] jArr2 = this.alpha;
        int i17 = this.delta;
        int i18 = i4 >> 3;
        int i19 = (i4 & 7) << 3;
        long j11 = (jArr2[i18] & (~(255 << i19))) | (254 << i19);
        jArr2[i18] = j11;
        jArr2[(((i4 - 7) & i17) + (i17 & 7)) >> 3] = j11;
        Object[] objArr = this.charlie;
        Object obj = objArr[i4];
        objArr[i4] = null;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        r1 = charlie(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        if (r40.foxtrot != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        if (((r40.alpha[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
    
        r1 = r40.delta;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        r8 = 8;
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c8, code lost:
    
        if (java.lang.Long.compare((r40.echo * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ca, code lost:
    
        r1 = r40.alpha;
        r2 = r40.delta;
        r3 = r40.bravo;
        r5 = r40.charlie;
        r6 = (r2 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d7, code lost:
    
        if (r7 >= r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
    
        r10 = r8;
        r8 = r1[r7] & r11;
        r1[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r8 = r10;
        r9 = r9;
        r11 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f8, code lost:
    
        r12 = r8;
        r31 = r9;
        r6 = kotlin.collections.ArraysKt.green(r1);
        r7 = r6 - 1;
        r10 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[0];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0114, code lost:
    
        if (r6 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0116, code lost:
    
        r7 = r6 >> 3;
        r19 = (r6 & 7) << 3;
        r8 = (r1[r7] >> r19) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0124, code lost:
    
        if (r8 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012b, code lost:
    
        if (r8 == 254) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012e, code lost:
    
        r8 = r3[r6];
        r8 = ((int) (r8 ^ (r8 >>> r13))) * r20;
        r9 = (r8 ^ (r8 << 16)) >>> 7;
        r29 = charlie(r9);
        r9 = r9 & r2;
        r33 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014d, code lost:
    
        if ((((r29 - r9) & r2) / 8) != (((r6 - r9) & r2) / r12)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0174, code lost:
    
        r35 = r12;
        r30 = r13;
        r9 = r29 >> 3;
        r10 = r1[r9];
        r12 = (r29 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0186, code lost:
    
        if (((r10 >> r12) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0188, code lost:
    
        r36 = r15;
        r37 = r14;
        r1[r9] = (r10 & (~(255 << r12))) | ((r8 & 127) << r12);
        r1[r7] = (r1[r7] & (~(255 << r19))) | (128 << r19);
        r3[r29] = r3[r6];
        r3[r6] = 0;
        r5[r29] = r5[r6];
        r5[r6] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d5, code lost:
    
        r1[r1.length - 1] = (r1[r36] & r33) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r13 = r30;
        r10 = r33;
        r12 = r35;
        r15 = r36;
        r14 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b4, code lost:
    
        r37 = r14;
        r36 = r15;
        r1[r9] = ((r8 & 127) << r12) | (r10 & (~(255 << r12)));
        r7 = r3[r29];
        r3[r29] = r3[r6];
        r3[r6] = r7;
        r7 = r5[r29];
        r5[r29] = r5[r6];
        r5[r6] = r7;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014f, code lost:
    
        r1[r7] = ((r8 & 127) << r19) | (r1[r7] & (~(255 << r19)));
        r1[r1.length - r14] = (r1[r15] & r33) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r13 = r13;
        r10 = r33;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0126, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ee, code lost:
    
        r37 = r14;
        r36 = r15;
        r40.foxtrot = bv.au.alpha(r40.delta) - r40.echo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0280, code lost:
    
        r1 = charlie(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0284, code lost:
    
        r17 = r1;
        r40.echo++;
        r1 = r40.foxtrot;
        r2 = r40.alpha;
        r3 = r17 >> 3;
        r4 = r2[r3];
        r6 = (r17 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x029e, code lost:
    
        if (((r4 >> r6) & 255) != r23) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02a0, code lost:
    
        r7 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02a5, code lost:
    
        r40.foxtrot = r1 - r7;
        r1 = r40.delta;
        r4 = (r4 & (~(255 << r6))) | (r31 << r6);
        r2[r3] = r4;
        r2[(((r17 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02a3, code lost:
    
        r7 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ff, code lost:
    
        r31 = r9;
        r37 = 1;
        r36 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x020d, code lost:
    
        r1 = bv.au.bravo(r40.delta);
        r2 = r40.alpha;
        r3 = r40.bravo;
        r5 = r40.charlie;
        r6 = r40.delta;
        echo(r1);
        r1 = r40.alpha;
        r7 = r40.bravo;
        r8 = r40.charlie;
        r9 = r40.delta;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0228, code lost:
    
        if (r10 >= r6) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0237, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r23) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0239, code lost:
    
        r11 = r3[r10];
        r13 = ((int) ((r11 >>> r13) ^ r11)) * r20;
        r13 = r13 ^ (r13 << 16);
        r14 = charlie(r13 >>> 7);
        r17 = r1;
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r18 = (r14 & 7) << 3;
        r1 = (r17[r13] & (~(255 << r18))) | (r1 << r18);
        r17[r13] = r1;
        r17[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x027a, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0277, code lost:
    
        r17 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0208, code lost:
    
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x009d, code lost:
    
        r31 = r9;
        r37 = 1;
        r36 = 0;
        r23 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void golf(long j5, Object obj) {
        int i4;
        int i5;
        char c3 = ' ';
        int i10 = -862048943;
        int i11 = ((int) (j5 ^ (j5 >>> 32))) * (-862048943);
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.delta;
        int i16 = i13 & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.alpha;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            int i20 = 1;
            int i21 = i17;
            int i22 = 0;
            long j6 = (((-i19) >> 63) & (jArr[i18 + 1] << (64 - i19))) | (jArr[i18] >>> i19);
            long j7 = i14;
            char c4 = c3;
            int i23 = i14;
            long j10 = j6 ^ (j7 * 72340172838076673L);
            long j11 = -9187201950435737472L;
            long j12 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                i5 = (i16 + (Long.numberOfTrailingZeros(j12) >> 3)) & i15;
                int i24 = i10;
                if (this.bravo[i5] == j5) {
                    break loop0;
                }
                j12 &= j12 - 1;
                i10 = i24;
            }
            i17 = i21 + 8;
            i16 = (i16 + i17) & i15;
            i14 = i23;
            i10 = i4;
            c3 = c4;
        }
        this.bravo[i5] = j5;
        this.charlie[i5] = obj;
    }

    public final int hashCode() {
        int i4;
        long[] jArr = this.bravo;
        Object[] objArr = this.charlie;
        long[] jArr2 = this.alpha;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i5 = 0;
        int i10 = 0;
        while (true) {
            long j5 = jArr2[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i5 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j5) < 128) {
                        int i13 = (i5 << 3) + i12;
                        long j6 = jArr[i13];
                        Object obj = objArr[i13];
                        int i14 = (int) (j6 ^ (j6 >>> 32));
                        if (obj != null) {
                            i4 = obj.hashCode();
                        } else {
                            i4 = 0;
                        }
                        i10 += i4 ^ i14;
                    }
                    j5 >>= 8;
                }
                if (i11 != 8) {
                    return i10;
                }
            }
            if (i5 != length) {
                i5++;
            } else {
                return i10;
            }
        }
    }

    public final String toString() {
        int i4;
        int i5;
        if (this.echo == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.bravo;
        Object[] objArr = this.charlie;
        long[] jArr2 = this.alpha;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j5 = jArr2[i10];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j5) < 128) {
                            int i14 = (i10 << 3) + i13;
                            i5 = i10;
                            long j6 = jArr[i14];
                            Object obj = objArr[i14];
                            sb2.append(j6);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i11++;
                            if (i11 < this.echo) {
                                sb2.append(", ");
                            }
                        } else {
                            i5 = i10;
                        }
                        j5 >>= 8;
                        i13++;
                        i10 = i5;
                    }
                    int i15 = i10;
                    if (i12 != 8) {
                        break;
                    }
                    i4 = i15;
                } else {
                    i4 = i10;
                }
                if (i4 == length) {
                    break;
                }
                i10 = i4 + 1;
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
