package bv;

import com.clevertap.android.sdk.Constants;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class am {
    public long[] alpha;
    public Object[] bravo;
    public int charlie;
    public int delta;
    public int echo;

    public am(int i4) {
        this.alpha = au.alpha;
        this.bravo = bw.a.charlie;
        if (i4 >= 0) {
            foxtrot(au.delta(i4));
        } else {
            bw.a.charlie("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean alpha(Object obj) {
        int i4 = this.delta;
        this.bravo[delta(obj)] = obj;
        if (this.delta != i4) {
            return true;
        }
        return false;
    }

    public final void bravo() {
        this.delta = 0;
        long[] jArr = this.alpha;
        if (jArr != au.alpha) {
            ArraysKt.cyan(jArr, -9187201950435737472L);
            long[] jArr2 = this.alpha;
            int i4 = this.charlie;
            int i5 = i4 >> 3;
            long j5 = 255 << ((i4 & 7) << 3);
            jArr2[i5] = (jArr2[i5] & (~j5)) | j5;
        }
        ArraysKt.coral(0, this.charlie, null, this.bravo);
        this.echo = au.alpha(this.charlie) - this.delta;
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
        int i13 = this.charlie;
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
        long j5;
        long j6;
        long j7;
        long[] jArr;
        long[] jArr2;
        int i5;
        int i10;
        int i11;
        Object[] objArr;
        int i12;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = -862048943;
        int i14 = i4 * (-862048943);
        int i15 = i14 ^ (i14 << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.charlie;
        int i19 = i16 & i18;
        int i20 = 0;
        while (true) {
            long[] jArr3 = this.alpha;
            int i21 = i19 >> 3;
            int i22 = (i19 & 7) << 3;
            long j10 = ((jArr3[i21 + 1] << (64 - i22)) & ((-i22) >> 63)) | (jArr3[i21] >>> i22);
            long j11 = i17;
            int i23 = i17;
            int i24 = 0;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int numberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j13) >> 3)) & i18;
                int i25 = i13;
                if (Intrinsics.areEqual(this.bravo[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i13 = i25;
            }
            int i26 = i13;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int echo = echo(i16);
                long j14 = 255;
                if (this.echo != 0 || ((this.alpha[echo >> 3] >> ((echo & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    j6 = j11;
                    j7 = 128;
                } else {
                    int i27 = this.charlie;
                    if (i27 > 8) {
                        int i28 = 8;
                        if (Long.compare((this.delta * 32) ^ Long.MIN_VALUE, (i27 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.alpha;
                            int i29 = this.charlie;
                            Object[] objArr2 = this.bravo;
                            int i30 = (i29 + 7) >> 3;
                            int i31 = 0;
                            j7 = 128;
                            while (i31 < i30) {
                                long j15 = j14;
                                long j16 = jArr4[i31] & (-9187201950435737472L);
                                jArr4[i31] = (-72340172838076674L) & ((~j16) + (j16 >>> 7));
                                i31++;
                                i28 = i28;
                                j11 = j11;
                                j14 = j15;
                            }
                            j5 = j14;
                            j6 = j11;
                            int i32 = i28;
                            int green = ArraysKt.green(jArr4);
                            int i33 = green - 1;
                            long j17 = 72057594037927935L;
                            jArr4[i33] = (jArr4[i33] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[green] = jArr4[0];
                            int i34 = 0;
                            while (i34 != i29) {
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                long j18 = (jArr4[i35] >> i36) & j5;
                                if (j18 == 128 || j18 != 254) {
                                    i34++;
                                } else {
                                    Object obj2 = objArr2[i34];
                                    if (obj2 != null) {
                                        i10 = obj2.hashCode();
                                    } else {
                                        i10 = 0;
                                    }
                                    int i37 = i10 * i26;
                                    int i38 = (i37 ^ (i37 << 16)) >>> 7;
                                    int echo2 = echo(i38);
                                    int i39 = i38 & i29;
                                    if (((echo2 - i39) & i29) / i32 == ((i34 - i39) & i29) / i32) {
                                        long j19 = j17;
                                        jArr4[i35] = ((r7 & 127) << i36) | ((~(j5 << i36)) & jArr4[i35]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j19) | Long.MIN_VALUE;
                                        i34++;
                                        j17 = j19;
                                    } else {
                                        long j20 = j17;
                                        int i40 = echo2 >> 3;
                                        long j21 = jArr4[i40];
                                        int i41 = (echo2 & 7) << 3;
                                        if (((j21 >> i41) & j5) == 128) {
                                            i12 = i32;
                                            i11 = i29;
                                            objArr = objArr2;
                                            jArr4[i40] = ((~(j5 << i41)) & j21) | ((r7 & 127) << i41);
                                            jArr4[i35] = (jArr4[i35] & (~(j5 << i36))) | (128 << i36);
                                            objArr[echo2] = objArr[i34];
                                            objArr[i34] = null;
                                        } else {
                                            i11 = i29;
                                            objArr = objArr2;
                                            i12 = i32;
                                            jArr4[i40] = ((r7 & 127) << i41) | ((~(j5 << i41)) & j21);
                                            Object obj3 = objArr[echo2];
                                            objArr[echo2] = objArr[i34];
                                            objArr[i34] = obj3;
                                            i34--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j20) | Long.MIN_VALUE;
                                        i34++;
                                        j17 = j20;
                                        i32 = i12;
                                        i29 = i11;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            this.echo = au.alpha(this.charlie) - this.delta;
                            echo = echo(i16);
                        }
                    }
                    j5 = 255;
                    j6 = j11;
                    j7 = 128;
                    int bravo = au.bravo(this.charlie);
                    long[] jArr5 = this.alpha;
                    Object[] objArr3 = this.bravo;
                    int i42 = this.charlie;
                    foxtrot(bravo);
                    long[] jArr6 = this.alpha;
                    Object[] objArr4 = this.bravo;
                    int i43 = this.charlie;
                    int i44 = 0;
                    while (i44 < i42) {
                        if (((jArr5[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i44];
                            if (obj4 != null) {
                                i5 = obj4.hashCode();
                            } else {
                                i5 = 0;
                            }
                            int i45 = i5 * i26;
                            int i46 = i45 ^ (i45 << 16);
                            int echo3 = echo(i46 >>> 7);
                            long j22 = i46 & 127;
                            int i47 = echo3 >> 3;
                            int i48 = (echo3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j23 = (jArr6[i47] & (~(255 << i48))) | (j22 << i48);
                            jArr[i47] = j23;
                            jArr[(((echo3 - 7) & i43) + (i43 & 7)) >> 3] = j23;
                            objArr4[echo3] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i44++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    echo = echo(i16);
                }
                this.delta++;
                int i49 = this.echo;
                long[] jArr7 = this.alpha;
                int i50 = echo >> 3;
                long j24 = jArr7[i50];
                int i51 = (echo & 7) << 3;
                if (((j24 >> i51) & j5) == j7) {
                    i24 = 1;
                }
                this.echo = i49 - i24;
                int i52 = this.charlie;
                long j25 = (j24 & (~(j5 << i51))) | (j6 << i51);
                jArr7[i50] = j25;
                jArr7[(((echo - 7) & i52) + (i52 & 7)) >> 3] = j25;
                return echo;
            }
            i20 += 8;
            i19 = (i19 + i20) & i18;
            i17 = i23;
            i13 = i26;
        }
    }

    public final int echo(int i4) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        if (amVar.delta != this.delta) {
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
                        if ((255 & j5) < 128 && !amVar.charlie(objArr[(i4 << 3) + i10])) {
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
        if (i5 == 0) {
            objArr = bw.a.charlie;
        } else {
            objArr = new Object[i5];
        }
        this.bravo = objArr;
    }

    public final boolean golf() {
        if (this.delta == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5 = (this.charlie * 31) + this.delta;
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

    public final boolean hotel() {
        if (this.delta != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void india(Object obj) {
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
        int i14 = this.charlie;
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
                } else {
                    j7 &= j7 - 1;
                }
            }
            i10 += 8;
            i15 = i16 + i10;
        }
        if (i5 >= 0) {
            mike(i5);
        }
    }

    public final void juliet(am elements) {
        Intrinsics.echo(elements, "elements");
        Object[] objArr = elements.bravo;
        long[] jArr = elements.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128) {
                            kilo(objArr[(i4 << 3) + i10]);
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        return;
                    }
                }
                if (i4 != length) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public final void kilo(Object obj) {
        this.bravo[delta(obj)] = obj;
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
    public final boolean lima(Object obj) {
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
        int i13 = this.charlie;
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
            mike(i5);
        }
        return z2;
    }

    public final void mike(int i4) {
        this.delta--;
        long[] jArr = this.alpha;
        int i5 = this.charlie;
        int i10 = i4 >> 3;
        int i11 = (i4 & 7) << 3;
        long j5 = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        jArr[i10] = j5;
        jArr[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j5;
        this.bravo[i4] = null;
    }

    public final String toString() {
        A0.p pVar = new A0.p(29, this);
        StringBuilder sb2 = new StringBuilder(Constants.AES_PREFIX);
        Object[] objArr = this.bravo;
        long[] jArr = this.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j5) < 128) {
                            Object obj = objArr[(i4 << 3) + i11];
                            if (i5 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i5 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append((CharSequence) pVar.invoke(obj));
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
            String sb3 = sb2.toString();
            Intrinsics.delta(sb3, "toString(...)");
            return sb3;
        }
        sb2.append((CharSequence) Constants.AES_SUFFIX);
        String sb32 = sb2.toString();
        Intrinsics.delta(sb32, "toString(...)");
        return sb32;
    }

    public /* synthetic */ am() {
        this(6);
    }
}
