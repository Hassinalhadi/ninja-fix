package bv;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class al {
    public long[] alpha;
    public Object[] bravo;
    public Object[] charlie;
    public int delta;
    public int echo;
    public int foxtrot;

    public al(int i4) {
        this.alpha = au.alpha;
        Object[] objArr = bw.a.charlie;
        this.bravo = objArr;
        this.charlie = objArr;
        if (i4 >= 0) {
            hotel(au.delta(i4));
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
        ArraysKt.coral(0, this.delta, null, this.bravo);
        this.foxtrot = au.alpha(this.delta) - this.echo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean bravo(Object obj) {
        int i4;
        int i5;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * (-862048943);
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
                if (Intrinsics.areEqual(this.bravo[i5], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (i5 < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean charlie(Object obj) {
        int i4;
        int i5;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * (-862048943);
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
                if (Intrinsics.areEqual(this.bravo[i5], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (i5 < 0) {
            return false;
        }
        return true;
    }

    public final boolean delta(Object obj) {
        Object[] objArr = this.charlie;
        long[] jArr = this.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128 && Intrinsics.areEqual(obj, objArr[(i4 << 3) + i10])) {
                            return true;
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
        return false;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        if (alVar.echo != this.echo) {
            return false;
        }
        Object[] objArr = this.bravo;
        Object[] objArr2 = this.charlie;
        long[] jArr = this.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            loop0: while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128) {
                            int i11 = (i4 << 3) + i10;
                            Object obj2 = objArr[i11];
                            Object obj3 = objArr2[i11];
                            if (obj3 == null) {
                                if (alVar.golf(obj2) != null || !alVar.charlie(obj2)) {
                                    break loop0;
                                }
                            } else if (!Intrinsics.areEqual(obj3, alVar.golf(obj2))) {
                                return false;
                            }
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
            return false;
        }
        return true;
    }

    public final int foxtrot(Object obj) {
        int i4;
        long j5;
        long j6;
        long j7;
        long[] jArr;
        long[] jArr2;
        int i5;
        int i10;
        int i11;
        Object[] objArr;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = -862048943;
        int i13 = i4 * (-862048943);
        int i14 = i13 ^ (i13 << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.delta;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr3 = this.alpha;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            long j10 = ((jArr3[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr3[i20] >>> i21);
            long j11 = i16;
            int i22 = i16;
            int i23 = 0;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int numberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j13) >> 3)) & i17;
                int i24 = i12;
                if (Intrinsics.areEqual(this.bravo[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i12 = i24;
            }
            int i25 = i12;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int echo = echo(i15);
                long j14 = 255;
                if (this.foxtrot != 0 || ((this.alpha[echo >> 3] >> ((echo & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    j6 = j11;
                    j7 = 128;
                } else {
                    int i26 = this.delta;
                    if (i26 > 8) {
                        int i27 = 8;
                        if (Long.compare((this.echo * 32) ^ Long.MIN_VALUE, (i26 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.alpha;
                            int i28 = this.delta;
                            Object[] objArr2 = this.bravo;
                            Object[] objArr3 = this.charlie;
                            j7 = 128;
                            int i29 = (i28 + 7) >> 3;
                            int i30 = 0;
                            while (i30 < i29) {
                                long j15 = j14;
                                long j16 = jArr4[i30] & (-9187201950435737472L);
                                jArr4[i30] = (-72340172838076674L) & ((~j16) + (j16 >>> 7));
                                i30++;
                                i27 = i27;
                                j11 = j11;
                                j14 = j15;
                            }
                            j5 = j14;
                            j6 = j11;
                            int i31 = i27;
                            int green = ArraysKt.green(jArr4);
                            int i32 = green - 1;
                            jArr4[i32] = (jArr4[i32] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[green] = jArr4[0];
                            int i33 = 0;
                            while (i33 != i28) {
                                int i34 = i33 >> 3;
                                int i35 = (i33 & 7) << 3;
                                long j17 = (jArr4[i34] >> i35) & j5;
                                if (j17 == 128 || j17 != 254) {
                                    i33++;
                                } else {
                                    Object obj2 = objArr2[i33];
                                    if (obj2 != null) {
                                        i10 = obj2.hashCode();
                                    } else {
                                        i10 = 0;
                                    }
                                    int i36 = i10 * i25;
                                    int i37 = (i36 ^ (i36 << 16)) >>> 7;
                                    int echo2 = echo(i37);
                                    int i38 = i37 & i28;
                                    if (((echo2 - i38) & i28) / i31 == ((i33 - i38) & i28) / i31) {
                                        jArr4[i34] = ((r8 & 127) << i35) | (jArr4[i34] & (~(j5 << i35)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i33++;
                                        i31 = i31;
                                    } else {
                                        int i39 = i31;
                                        int i40 = echo2 >> 3;
                                        long j18 = jArr4[i40];
                                        int i41 = (echo2 & 7) << 3;
                                        if (((j18 >> i41) & j5) == 128) {
                                            i11 = i28;
                                            objArr = objArr2;
                                            jArr4[i40] = ((~(j5 << i41)) & j18) | ((r8 & 127) << i41);
                                            jArr4[i34] = (jArr4[i34] & (~(j5 << i35))) | (128 << i35);
                                            objArr[echo2] = objArr[i33];
                                            objArr[i33] = null;
                                            objArr3[echo2] = objArr3[i33];
                                            objArr3[i33] = null;
                                        } else {
                                            i11 = i28;
                                            objArr = objArr2;
                                            jArr4[i40] = ((r8 & 127) << i41) | ((~(j5 << i41)) & j18);
                                            Object obj3 = objArr[echo2];
                                            objArr[echo2] = objArr[i33];
                                            objArr[i33] = obj3;
                                            Object obj4 = objArr3[echo2];
                                            objArr3[echo2] = objArr3[i33];
                                            objArr3[i33] = obj4;
                                            i33--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i33++;
                                        i31 = i39;
                                        i28 = i11;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            this.foxtrot = au.alpha(this.delta) - this.echo;
                            echo = echo(i15);
                        }
                    }
                    j5 = 255;
                    j6 = j11;
                    j7 = 128;
                    int bravo = au.bravo(this.delta);
                    long[] jArr5 = this.alpha;
                    Object[] objArr4 = this.bravo;
                    Object[] objArr5 = this.charlie;
                    int i42 = this.delta;
                    hotel(bravo);
                    long[] jArr6 = this.alpha;
                    Object[] objArr6 = this.bravo;
                    Object[] objArr7 = this.charlie;
                    int i43 = this.delta;
                    int i44 = 0;
                    while (i44 < i42) {
                        if (((jArr5[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i44];
                            if (obj5 != null) {
                                i5 = obj5.hashCode();
                            } else {
                                i5 = 0;
                            }
                            int i45 = i5 * i25;
                            int i46 = i45 ^ (i45 << 16);
                            int echo3 = echo(i46 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j19 = i46 & 127;
                            int i47 = echo3 >> 3;
                            int i48 = (echo3 & 7) << 3;
                            long j20 = (jArr[i47] & (~(255 << i48))) | (j19 << i48);
                            jArr[i47] = j20;
                            jArr[(((echo3 - 7) & i43) + (i43 & 7)) >> 3] = j20;
                            objArr6[echo3] = obj5;
                            objArr7[echo3] = objArr5[i44];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i44++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    echo = echo(i15);
                }
                this.echo++;
                int i49 = this.foxtrot;
                long[] jArr7 = this.alpha;
                int i50 = echo >> 3;
                long j21 = jArr7[i50];
                int i51 = (echo & 7) << 3;
                if (((j21 >> i51) & j5) == j7) {
                    i23 = 1;
                }
                this.foxtrot = i49 - i23;
                int i52 = this.delta;
                long j22 = (j21 & (~(j5 << i51))) | (j6 << i51);
                jArr7[i50] = j22;
                jArr7[(((echo - 7) & i52) + (i52 & 7)) >> 3] = j22;
                return ~echo;
            }
            i19 += 8;
            i18 = (i18 + i19) & i17;
            i16 = i22;
            i12 = i25;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object golf(Object obj) {
        int i4;
        int i5;
        int i10 = 0;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = i4 * (-862048943);
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.delta;
        int i15 = i12 >>> 7;
        loop0: while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.alpha;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j5 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j6 = (i13 * 72340172838076673L) ^ j5;
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                i5 = ((Long.numberOfTrailingZeros(j7) >> 3) + i16) & i14;
                if (Intrinsics.areEqual(this.bravo[i5], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i10 += 8;
            i15 = i16 + i10;
        }
        if (i5 >= 0) {
            return this.charlie[i5];
        }
        return null;
    }

    public final int hashCode() {
        int i4;
        int i5;
        Object[] objArr = this.bravo;
        Object[] objArr2 = this.charlie;
        long[] jArr = this.alpha;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j5 = jArr[i10];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j5) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr[i14];
                        Object obj2 = objArr2[i14];
                        if (obj != null) {
                            i4 = obj.hashCode();
                        } else {
                            i4 = 0;
                        }
                        if (obj2 != null) {
                            i5 = obj2.hashCode();
                        } else {
                            i5 = 0;
                        }
                        i11 += i5 ^ i4;
                    }
                    j5 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 != length) {
                i10++;
            } else {
                return i11;
            }
        }
    }

    public final void hotel(int i4) {
        int i5;
        long[] jArr;
        Object[] objArr;
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
            int i10 = i5 >> 3;
            long j5 = 255 << ((i5 & 7) << 3);
            jArr[i10] = (jArr[i10] & (~j5)) | j5;
        }
        this.alpha = jArr;
        this.foxtrot = au.alpha(this.delta) - this.echo;
        Object[] objArr2 = bw.a.charlie;
        if (i5 == 0) {
            objArr = objArr2;
        } else {
            objArr = new Object[i5];
        }
        this.bravo = objArr;
        if (i5 != 0) {
            objArr2 = new Object[i5];
        }
        this.charlie = objArr2;
    }

    public final boolean india() {
        if (this.echo == 0) {
            return true;
        }
        return false;
    }

    public final boolean juliet() {
        if (this.echo != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object kilo(Object obj) {
        int i4;
        int i5;
        int i10 = 0;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = i4 * (-862048943);
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.delta;
        int i15 = i12 >>> 7;
        loop0: while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.alpha;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j5 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j6 = (i13 * 72340172838076673L) ^ j5;
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                i5 = ((Long.numberOfTrailingZeros(j7) >> 3) + i16) & i14;
                if (Intrinsics.areEqual(this.bravo[i5], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i10 += 8;
            i15 = i16 + i10;
        }
        if (i5 >= 0) {
            return lima(i5);
        }
        return null;
    }

    public final Object lima(int i4) {
        this.echo--;
        long[] jArr = this.alpha;
        int i5 = this.delta;
        int i10 = i4 >> 3;
        int i11 = (i4 & 7) << 3;
        long j5 = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        jArr[i10] = j5;
        jArr[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j5;
        this.bravo[i4] = null;
        Object[] objArr = this.charlie;
        Object obj = objArr[i4];
        objArr[i4] = null;
        return obj;
    }

    public final void mike(Object obj, Object obj2) {
        int foxtrot = foxtrot(obj);
        if (foxtrot < 0) {
            foxtrot = ~foxtrot;
        }
        this.bravo[foxtrot] = obj;
        this.charlie[foxtrot] = obj2;
    }

    public final String toString() {
        if (india()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.bravo;
        Object[] objArr2 = this.charlie;
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
                            Object obj = objArr[i12];
                            Object obj2 = objArr2[i12];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb2.append(obj2);
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

    public /* synthetic */ al() {
        this(6);
    }
}
