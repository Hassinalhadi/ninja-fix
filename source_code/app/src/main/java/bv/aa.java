package bv;

import kotlin.collections.ArraysKt;

/* loaded from: classes3.dex */
public final class aa extends n {
    public int foxtrot;

    public aa(int i4) {
        this.alpha = au.alpha;
        this.bravo = p.alpha;
        this.charlie = bw.a.charlie;
        if (i4 >= 0) {
            foxtrot(au.delta(i4));
        } else {
            bw.a.charlie("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void charlie() {
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

    public final int delta(int i4) {
        long j5;
        int i5;
        long j6;
        int i10;
        long[] jArr;
        long[] jArr2;
        long j7;
        int i11;
        int i12;
        int i13 = -862048943;
        int i14 = i4 * (-862048943);
        int i15 = i14 ^ (i14 << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.delta;
        int i19 = i16 & i18;
        int i20 = 0;
        while (true) {
            long[] jArr3 = this.alpha;
            int i21 = i19 >> 3;
            int i22 = (i19 & 7) << 3;
            int i23 = 1;
            int i24 = i20;
            long j10 = (((-i22) >> 63) & (jArr3[i21 + 1] << (64 - i22))) | (jArr3[i21] >>> i22);
            long j11 = i17;
            int i25 = i13;
            int i26 = i17;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = -9187201950435737472L;
            long j14 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int numberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j14) >> 3)) & i18;
                long j15 = j13;
                if (this.bravo[numberOfTrailingZeros] == i4) {
                    return numberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                j13 = j15;
            }
            long j16 = j13;
            if ((((~j10) << 6) & j10 & j16) != 0) {
                int echo = echo(i16);
                long j17 = 255;
                if (this.foxtrot != 0 || ((this.alpha[echo >> 3] >> ((echo & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    i5 = 1;
                    j6 = 128;
                } else {
                    int i27 = this.delta;
                    if (i27 > 8) {
                        j6 = 128;
                        if (Long.compare((this.echo * 32) ^ Long.MIN_VALUE, (i27 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.alpha;
                            int i28 = this.delta;
                            int[] iArr = this.bravo;
                            Object[] objArr = this.charlie;
                            int i29 = (i28 + 7) >> 3;
                            int i30 = 0;
                            while (i30 < i29) {
                                long j18 = j17;
                                long j19 = jArr4[i30] & j16;
                                jArr4[i30] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i30++;
                                i23 = i23;
                                i25 = i25;
                                j17 = j18;
                            }
                            j5 = j17;
                            int i31 = i25;
                            int i32 = i23;
                            int green = ArraysKt.green(jArr4);
                            int i33 = green - 1;
                            long j20 = 72057594037927935L;
                            jArr4[i33] = (jArr4[i33] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[green] = jArr4[0];
                            int i34 = 0;
                            while (i34 != i28) {
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                long j21 = (jArr4[i35] >> i36) & j5;
                                if (j21 == 128 || j21 != 254) {
                                    i34++;
                                } else {
                                    int i37 = iArr[i34] * i31;
                                    int i38 = (i37 ^ (i37 << 16)) >>> 7;
                                    int echo2 = echo(i38);
                                    int i39 = i38 & i28;
                                    int i40 = i32;
                                    if (((echo2 - i39) & i28) / 8 == ((i34 - i39) & i28) / 8) {
                                        j7 = j20;
                                        jArr4[i35] = ((r11 & 127) << i36) | (jArr4[i35] & (~(j5 << i36)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j7) | Long.MIN_VALUE;
                                        i34++;
                                    } else {
                                        j7 = j20;
                                        int i41 = echo2 >> 3;
                                        long j22 = jArr4[i41];
                                        int i42 = (echo2 & 7) << 3;
                                        if (((j22 >> i42) & j5) == 128) {
                                            i11 = i28;
                                            int i43 = i34;
                                            jArr4[i41] = ((~(j5 << i42)) & j22) | ((r11 & 127) << i42);
                                            jArr4[i35] = (jArr4[i35] & (~(j5 << i36))) | (128 << i36);
                                            iArr[echo2] = iArr[i43];
                                            iArr[i43] = 0;
                                            objArr[echo2] = objArr[i43];
                                            objArr[i43] = null;
                                            i12 = i43;
                                        } else {
                                            i11 = i28;
                                            int i44 = i34;
                                            jArr4[i41] = ((~(j5 << i42)) & j22) | ((r11 & 127) << i42);
                                            int i45 = iArr[echo2];
                                            iArr[echo2] = iArr[i44];
                                            iArr[i44] = i45;
                                            Object obj = objArr[echo2];
                                            objArr[echo2] = objArr[i44];
                                            objArr[i44] = obj;
                                            i12 = i44 - 1;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j7) | Long.MIN_VALUE;
                                        i34 = i12 + 1;
                                        i28 = i11;
                                    }
                                    i32 = i40;
                                    j20 = j7;
                                }
                            }
                            i5 = i32;
                            this.foxtrot = au.alpha(this.delta) - this.echo;
                            echo = echo(i16);
                        }
                    } else {
                        j6 = 128;
                    }
                    j5 = 255;
                    i5 = 1;
                    int bravo = au.bravo(this.delta);
                    long[] jArr5 = this.alpha;
                    int[] iArr2 = this.bravo;
                    Object[] objArr2 = this.charlie;
                    int i46 = this.delta;
                    foxtrot(bravo);
                    long[] jArr6 = this.alpha;
                    int[] iArr3 = this.bravo;
                    Object[] objArr3 = this.charlie;
                    int i47 = this.delta;
                    int i48 = 0;
                    while (i48 < i46) {
                        if (((jArr5[i48 >> 3] >> ((i48 & 7) << 3)) & 255) < j6) {
                            int i49 = iArr2[i48];
                            int i50 = i49 * i25;
                            int i51 = i50 ^ (i50 << 16);
                            int echo3 = echo(i51 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j23 = i51 & 127;
                            int i52 = echo3 >> 3;
                            int i53 = (echo3 & 7) << 3;
                            long j24 = (jArr[i52] & (~(255 << i53))) | (j23 << i53);
                            jArr[i52] = j24;
                            jArr[(((echo3 - 7) & i47) + (i47 & 7)) >> 3] = j24;
                            iArr3[echo3] = i49;
                            objArr3[echo3] = objArr2[i48];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i48++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    echo = echo(i16);
                }
                this.echo++;
                int i54 = this.foxtrot;
                long[] jArr7 = this.alpha;
                int i55 = echo >> 3;
                long j25 = jArr7[i55];
                int i56 = (echo & 7) << 3;
                if (((j25 >> i56) & j5) == j6) {
                    i10 = i5;
                } else {
                    i10 = 0;
                }
                this.foxtrot = i54 - i10;
                int i57 = this.delta;
                long j26 = (j25 & (~(j5 << i56))) | (j11 << i56);
                jArr7[i55] = j26;
                jArr7[(((echo - 7) & i57) + (i57 & 7)) >> 3] = j26;
                return echo;
            }
            i20 = i24 + 8;
            i19 = (i19 + i20) & i18;
            i17 = i26;
            i13 = i25;
        }
    }

    public final int echo(int i4) {
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

    public final void foxtrot(int i4) {
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
        this.charlie = new Object[i5];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object golf(int i4) {
        int i5;
        int i10 = (-862048943) * i4;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.delta;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.alpha;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j5 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j6 = (i12 * 72340172838076673L) ^ j5;
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                i5 = ((Long.numberOfTrailingZeros(j7) >> 3) + i14) & i13;
                if (this.bravo[i5] == i4) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (i5 < 0) {
            return null;
        }
        this.echo--;
        long[] jArr2 = this.alpha;
        int i18 = this.delta;
        int i19 = i5 >> 3;
        int i20 = (i5 & 7) << 3;
        long j10 = (jArr2[i19] & (~(255 << i20))) | (254 << i20);
        jArr2[i19] = j10;
        jArr2[(((i5 - 7) & i18) + (i18 & 7)) >> 3] = j10;
        Object[] objArr = this.charlie;
        Object obj = objArr[i5];
        objArr[i5] = null;
        return obj;
    }

    public final void hotel(int i4, Object obj) {
        int delta = delta(i4);
        this.bravo[delta] = i4;
        this.charlie[delta] = obj;
    }

    public /* synthetic */ aa() {
        this(6);
    }
}
