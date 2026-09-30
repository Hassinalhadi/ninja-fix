package bv;

import com.airbnb.lottie.compose.LottieConstants;
import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ai {
    public long[] alpha = au.alpha;
    public Object[] bravo = bw.a.charlie;
    public long[] charlie = v.bravo;
    public int delta = LottieConstants.IterateForever;
    public int echo = LottieConstants.IterateForever;
    public int foxtrot;
    public int golf;
    public int hotel;

    public ai(int i4) {
        if (i4 >= 0) {
            foxtrot(au.delta(i4));
        } else {
            bw.a.charlie("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean alpha(Object obj) {
        int i4 = this.golf;
        int delta = delta(obj);
        this.bravo[delta] = obj;
        long[] jArr = this.charlie;
        int i5 = this.delta;
        jArr[delta] = (i5 & 2147483647L) | 4611686016279904256L;
        if (i5 != Integer.MAX_VALUE) {
            jArr[i5] = ((2147483647L & delta) << 31) | (jArr[i5] & (-4611686016279904257L));
        }
        this.delta = delta;
        if (this.echo == Integer.MAX_VALUE) {
            this.echo = delta;
        }
        if (this.golf != i4) {
            return true;
        }
        return false;
    }

    public final void bravo() {
        this.golf = 0;
        long[] jArr = this.alpha;
        if (jArr != au.alpha) {
            ArraysKt.cyan(jArr, -9187201950435737472L);
            long[] jArr2 = this.alpha;
            int i4 = this.foxtrot;
            int i5 = i4 >> 3;
            long j5 = 255 << ((i4 & 7) << 3);
            jArr2[i5] = (jArr2[i5] & (~j5)) | j5;
        }
        ArraysKt.coral(0, this.foxtrot, null, this.bravo);
        ArraysKt.cyan(this.charlie, 4611686018427387903L);
        this.delta = LottieConstants.IterateForever;
        this.echo = LottieConstants.IterateForever;
        this.hotel = au.alpha(this.foxtrot) - this.golf;
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
        int i13 = this.foxtrot;
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

    public final int delta(Object obj) {
        int i4;
        int i5;
        long j5;
        long j6;
        long j7;
        char c3;
        int i10;
        int i11;
        long[] jArr;
        long[] jArr2;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = -862048943;
        int i17 = i4 * (-862048943);
        int i18 = i17 ^ (i17 << 16);
        int i19 = i18 >>> 7;
        int i20 = i18 & 127;
        int i21 = this.foxtrot;
        int i22 = i19 & i21;
        int i23 = 0;
        while (true) {
            long[] jArr3 = this.alpha;
            int i24 = i22 >> 3;
            int i25 = (i22 & 7) << 3;
            long j11 = ((jArr3[i24 + 1] << (64 - i25)) & ((-i25) >> 63)) | (jArr3[i24] >>> i25);
            long j12 = i20;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (j13 - 72340172838076673L) & (~j13) & (-9187201950435737472L);
            while (j14 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i22) & i21;
                int i26 = i16;
                if (Intrinsics.areEqual(this.bravo[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i16 = i26;
            }
            int i27 = i16;
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                int echo = echo(i19);
                long j15 = 255;
                if (this.hotel != 0 || ((this.alpha[echo >> 3] >> ((echo & 7) << 3)) & 255) == 254) {
                    i5 = 0;
                    j5 = j12;
                    j6 = 255;
                    j7 = 128;
                } else {
                    int i28 = this.foxtrot;
                    if (i28 > 8) {
                        c3 = 31;
                        j7 = 128;
                        if (Long.compare((this.golf * 32) ^ Long.MIN_VALUE, (i28 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.alpha;
                            if (jArr4 == null) {
                                i5 = 0;
                                j5 = j12;
                                j6 = 255;
                            } else {
                                int i29 = this.foxtrot;
                                Object[] objArr = this.bravo;
                                long[] jArr5 = this.charlie;
                                long[] jArr6 = new long[i29];
                                Arrays.fill(jArr6, 0, i29, 9223372034707292159L);
                                i5 = 0;
                                int i30 = (i29 + 7) >> 3;
                                int i31 = 0;
                                while (i31 < i30) {
                                    long j16 = j15;
                                    long j17 = jArr4[i31] & (-9187201950435737472L);
                                    int i32 = i31;
                                    jArr4[i32] = ((~j17) + (j17 >>> 7)) & (-72340172838076674L);
                                    i31 = i32 + 1;
                                    j15 = j16;
                                }
                                j6 = j15;
                                int length = jArr4.length;
                                int i33 = length - 1;
                                int i34 = length - 2;
                                jArr4[i34] = (jArr4[i34] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i33] = jArr4[0];
                                int i35 = 0;
                                while (i35 != i29) {
                                    int i36 = i35 >> 3;
                                    int i37 = (i35 & 7) << 3;
                                    long j18 = (jArr4[i36] >> i37) & j6;
                                    if (j18 == 128 || j18 != 254) {
                                        i35++;
                                    } else {
                                        Object obj2 = objArr[i35];
                                        if (obj2 != null) {
                                            i15 = obj2.hashCode();
                                        } else {
                                            i15 = 0;
                                        }
                                        int i38 = i15 * i27;
                                        int i39 = (i38 ^ (i38 << 16)) >>> 7;
                                        int echo2 = echo(i39);
                                        int i40 = i39 & i29;
                                        if (((echo2 - i40) & i29) / 8 == ((i35 - i40) & i29) / 8) {
                                            int i41 = i29;
                                            Object[] objArr2 = objArr;
                                            jArr4[i36] = (jArr4[i36] & (~(j6 << i37))) | ((r17 & 127) << i37);
                                            if (jArr6[i35] == 9223372034707292159L) {
                                                long j19 = i35;
                                                jArr6[i35] = j19 | (j19 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i35++;
                                            i29 = i41;
                                            objArr = objArr2;
                                        } else {
                                            int i42 = i29;
                                            Object[] objArr3 = objArr;
                                            int i43 = echo2 >> 3;
                                            long j20 = jArr4[i43];
                                            int i44 = (echo2 & 7) << 3;
                                            if (((j20 >> i44) & j6) == 128) {
                                                jArr4[i43] = (j20 & (~(j6 << i44))) | ((r17 & 127) << i44);
                                                jArr4[i36] = (jArr4[i36] & (~(j6 << i37))) | (128 << i37);
                                                objArr3[echo2] = objArr3[i35];
                                                objArr3[i35] = null;
                                                jArr5[echo2] = jArr5[i35];
                                                jArr5[i35] = 4611686018427387903L;
                                                int i45 = (int) ((jArr6[i35] >> 32) & 4294967295L);
                                                int i46 = LottieConstants.IterateForever;
                                                if (i45 != Integer.MAX_VALUE) {
                                                    j10 = j12;
                                                    jArr6[i45] = echo2 | (jArr6[i45] & (-4294967296L));
                                                    jArr6[i35] = (jArr6[i35] & 4294967295L) | (-4294967296L);
                                                    i46 = LottieConstants.IterateForever;
                                                } else {
                                                    j10 = j12;
                                                    jArr6[i35] = (LottieConstants.IterateForever << 32) | echo2;
                                                }
                                                jArr6[echo2] = (i35 << 32) | i46;
                                            } else {
                                                j10 = j12;
                                                jArr4[i43] = ((r17 & 127) << i44) | (j20 & (~(j6 << i44)));
                                                Object obj3 = objArr3[echo2];
                                                objArr3[echo2] = objArr3[i35];
                                                objArr3[i35] = obj3;
                                                long j21 = jArr5[echo2];
                                                jArr5[echo2] = jArr5[i35];
                                                jArr5[i35] = j21;
                                                int i47 = (int) ((jArr6[i35] >> 32) & 4294967295L);
                                                if (i47 != Integer.MAX_VALUE) {
                                                    long j22 = echo2;
                                                    jArr6[i47] = (jArr6[i47] & (-4294967296L)) | j22;
                                                    jArr6[i35] = (jArr6[i35] & 4294967295L) | (j22 << 32);
                                                } else {
                                                    long j23 = echo2;
                                                    jArr6[i35] = j23 | (j23 << 32);
                                                    i47 = i35;
                                                }
                                                jArr6[echo2] = (i47 << 32) | i35;
                                                i35--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i35++;
                                            i29 = i42;
                                            objArr = objArr3;
                                            j12 = j10;
                                        }
                                    }
                                }
                                j5 = j12;
                                this.hotel = au.alpha(this.foxtrot) - this.golf;
                                long[] jArr7 = this.charlie;
                                int length2 = jArr7.length;
                                for (int i48 = 0; i48 < length2; i48++) {
                                    long j24 = jArr7[i48];
                                    int i49 = (int) ((j24 >> 31) & 2147483647L);
                                    int i50 = (int) (j24 & 2147483647L);
                                    long j25 = j24 & (-4611686018427387904L);
                                    if (i49 == Integer.MAX_VALUE) {
                                        i13 = Integer.MAX_VALUE;
                                    } else {
                                        i13 = (int) (jArr6[i49] & 4294967295L);
                                    }
                                    long j26 = (j25 | i13) << 31;
                                    if (i50 == Integer.MAX_VALUE) {
                                        i14 = LottieConstants.IterateForever;
                                    } else {
                                        i14 = (int) (jArr6[i50] & 4294967295L);
                                    }
                                    jArr7[i48] = j26 | i14;
                                }
                                int i51 = this.delta;
                                if (i51 != Integer.MAX_VALUE) {
                                    this.delta = (int) (jArr6[i51] & 4294967295L);
                                }
                                int i52 = this.echo;
                                if (i52 != Integer.MAX_VALUE) {
                                    this.echo = (int) (jArr6[i52] & 4294967295L);
                                }
                            }
                            echo = echo(i19);
                        }
                    } else {
                        c3 = 31;
                        j7 = 128;
                    }
                    i5 = 0;
                    j5 = j12;
                    j6 = 255;
                    int bravo = au.bravo(this.foxtrot);
                    long[] jArr8 = this.alpha;
                    Object[] objArr4 = this.bravo;
                    long[] jArr9 = this.charlie;
                    int i53 = this.foxtrot;
                    int[] iArr = new int[i53];
                    foxtrot(bravo);
                    long[] jArr10 = this.alpha;
                    Object[] objArr5 = this.bravo;
                    long[] jArr11 = this.charlie;
                    int i54 = this.foxtrot;
                    int i55 = 0;
                    while (i55 < i53) {
                        if (((jArr8[i55 >> 3] >> ((i55 & 7) << 3)) & 255) < j7) {
                            Object obj4 = objArr4[i55];
                            if (obj4 != null) {
                                i12 = obj4.hashCode();
                            } else {
                                i12 = 0;
                            }
                            int i56 = i12 * i27;
                            int i57 = i56 ^ (i56 << 16);
                            int echo3 = echo(i57 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j27 = i57 & 127;
                            int i58 = echo3 >> 3;
                            int i59 = (echo3 & 7) << 3;
                            long j28 = (jArr[i58] & (~(255 << i59))) | (j27 << i59);
                            jArr[i58] = j28;
                            jArr[(((echo3 - 7) & i54) + (i54 & 7)) >> 3] = j28;
                            objArr5[echo3] = obj4;
                            jArr11[echo3] = jArr9[i55];
                            iArr[i55] = echo3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i55++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.charlie;
                    int length3 = jArr12.length;
                    for (int i60 = 0; i60 < length3; i60++) {
                        long j29 = jArr12[i60];
                        int i61 = (int) ((j29 >> c3) & 2147483647L);
                        int i62 = (int) (j29 & 2147483647L);
                        long j30 = j29 & (-4611686018427387904L);
                        if (i61 == Integer.MAX_VALUE) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = iArr[i61];
                        }
                        long j31 = (j30 | i10) << c3;
                        if (i62 == Integer.MAX_VALUE) {
                            i11 = Integer.MAX_VALUE;
                        } else {
                            i11 = iArr[i62];
                        }
                        jArr12[i60] = j31 | i11;
                    }
                    int i63 = this.delta;
                    if (i63 != Integer.MAX_VALUE) {
                        this.delta = iArr[i63];
                    }
                    int i64 = this.echo;
                    if (i64 != Integer.MAX_VALUE) {
                        this.echo = iArr[i64];
                    }
                    echo = echo(i19);
                }
                this.golf++;
                int i65 = this.hotel;
                long[] jArr13 = this.alpha;
                int i66 = echo >> 3;
                long j32 = jArr13[i66];
                int i67 = (echo & 7) << 3;
                if (((j32 >> i67) & j6) == j7) {
                    i5 = 1;
                }
                this.hotel = i65 - i5;
                int i68 = this.foxtrot;
                long j33 = (j32 & (~(j6 << i67))) | (j5 << i67);
                jArr13[i66] = j33;
                jArr13[(((echo - 7) & i68) + (i68 & 7)) >> 3] = j33;
                return echo;
            }
            i23 += 8;
            i22 = (i22 + i23) & i21;
            i16 = i27;
        }
    }

    public final int echo(int i4) {
        int i5 = this.foxtrot;
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
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        if (aiVar.golf != this.golf) {
            return false;
        }
        Object[] objArr = this.bravo;
        long[] jArr = this.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128 && !aiVar.charlie(objArr[(i4 << 3) + i10])) {
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

    public final void foxtrot(int i4) {
        int i5;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        if (i4 > 0) {
            i5 = Math.max(7, au.charlie(i4));
        } else {
            i5 = 0;
        }
        this.foxtrot = i5;
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
        this.hotel = au.alpha(this.foxtrot) - this.golf;
        if (i5 == 0) {
            objArr = bw.a.charlie;
        } else {
            objArr = new Object[i5];
        }
        this.bravo = objArr;
        if (i5 == 0) {
            jArr2 = v.bravo;
        } else {
            jArr2 = new long[i5];
            ArraysKt.cyan(jArr2, 4611686018427387903L);
        }
        this.charlie = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean golf(Object obj) {
        int i4;
        int i5;
        boolean z2 = false;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * (-862048943);
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.foxtrot;
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
        if (i5 >= 0) {
            z2 = true;
        }
        if (z2) {
            hotel(i5);
        }
        return z2;
    }

    public final int hashCode() {
        int i4;
        int i5 = (this.foxtrot * 31) + this.golf;
        Object[] objArr = this.bravo;
        long[] jArr = this.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j5 = jArr[i10];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j5) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (!Intrinsics.areEqual(obj, this)) {
                                if (obj != null) {
                                    i4 = obj.hashCode();
                                } else {
                                    i4 = 0;
                                }
                                i5 += i4;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i11 != 8) {
                        return i5;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return i5;
    }

    public final void hotel(int i4) {
        this.golf--;
        long[] jArr = this.alpha;
        int i5 = this.foxtrot;
        int i10 = i4 >> 3;
        int i11 = (i4 & 7) << 3;
        long j5 = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        jArr[i10] = j5;
        jArr[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j5;
        this.bravo[i4] = null;
        long[] jArr2 = this.charlie;
        long j6 = jArr2[i4];
        int i12 = (int) ((j6 >> 31) & 2147483647L);
        int i13 = (int) (j6 & 2147483647L);
        if (i12 != Integer.MAX_VALUE) {
            jArr2[i12] = (jArr2[i12] & (-2147483648L)) | (i13 & 2147483647L);
        } else {
            this.delta = i13;
        }
        if (i13 != Integer.MAX_VALUE) {
            jArr2[i13] = ((i12 & 2147483647L) << 31) | (jArr2[i13] & (-4611686016279904257L));
        } else {
            this.echo = i12;
        }
        jArr2[i4] = 4611686018427387903L;
    }

    public final boolean india(Collection elements) {
        Intrinsics.echo(elements, "elements");
        Object[] objArr = this.bravo;
        int i4 = this.golf;
        long[] jArr = this.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j5) < 128) {
                            int i12 = (i5 << 3) + i11;
                            if (!CollectionsKt.bronze(elements, objArr[i12])) {
                                hotel(i12);
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        if (i4 == this.golf) {
            return false;
        }
        return true;
    }

    public final String toString() {
        A0.p pVar = new A0.p(28, this);
        StringBuilder sb2 = new StringBuilder(Constants.AES_PREFIX);
        Object[] objArr = this.bravo;
        long[] jArr = this.charlie;
        int i4 = this.echo;
        int i5 = 0;
        while (true) {
            if (i4 != Integer.MAX_VALUE) {
                int i10 = (int) ((jArr[i4] >> 31) & 2147483647L);
                Object obj = objArr[i4];
                if (i5 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i5 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append((CharSequence) pVar.invoke(obj));
                i5++;
                i4 = i10;
            } else {
                sb2.append((CharSequence) Constants.AES_SUFFIX);
                break;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
