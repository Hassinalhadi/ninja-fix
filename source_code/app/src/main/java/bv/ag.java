package bv;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ag {
    public long[] alpha;
    public Object[] bravo;
    public int[] charlie;
    public int delta;
    public int echo;
    public int foxtrot;

    public ag(int i4) {
        this.alpha = au.alpha;
        this.bravo = bw.a.charlie;
        this.charlie = p.alpha;
        if (i4 >= 0) {
            foxtrot(au.delta(i4));
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
        ArraysKt.coral(0, this.delta, null, this.bravo);
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

    public final int charlie(Object obj) {
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
                int bravo = bravo(i15);
                long j14 = 255;
                if (this.foxtrot != 0 || ((this.alpha[bravo >> 3] >> ((bravo & 7) << 3)) & 255) == 254) {
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
                            int[] iArr = this.charlie;
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
                            long j17 = 72057594037927935L;
                            jArr4[i32] = (jArr4[i32] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[green] = jArr4[0];
                            int i33 = 0;
                            while (i33 != i28) {
                                int i34 = i33 >> 3;
                                int i35 = (i33 & 7) << 3;
                                long j18 = (jArr4[i34] >> i35) & j5;
                                if (j18 == 128 || j18 != 254) {
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
                                    int bravo2 = bravo(i37);
                                    int i38 = i37 & i28;
                                    long j19 = j17;
                                    if (((bravo2 - i38) & i28) / 8 == ((i33 - i38) & i28) / i31) {
                                        jArr4[i34] = ((r8 & 127) << i35) | (jArr4[i34] & (~(j5 << i35)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j19) | Long.MIN_VALUE;
                                        i33++;
                                        j17 = j19;
                                        i31 = i31;
                                    } else {
                                        int i39 = i31;
                                        int i40 = bravo2 >> 3;
                                        long j20 = jArr4[i40];
                                        int i41 = (bravo2 & 7) << 3;
                                        if (((j20 >> i41) & j5) == 128) {
                                            i11 = i28;
                                            objArr = objArr2;
                                            jArr4[i40] = ((~(j5 << i41)) & j20) | ((r8 & 127) << i41);
                                            jArr4[i34] = (jArr4[i34] & (~(j5 << i35))) | (128 << i35);
                                            objArr[bravo2] = objArr[i33];
                                            objArr[i33] = null;
                                            iArr[bravo2] = iArr[i33];
                                            iArr[i33] = 0;
                                        } else {
                                            i11 = i28;
                                            objArr = objArr2;
                                            jArr4[i40] = ((r8 & 127) << i41) | ((~(j5 << i41)) & j20);
                                            Object obj3 = objArr[bravo2];
                                            objArr[bravo2] = objArr[i33];
                                            objArr[i33] = obj3;
                                            int i42 = iArr[bravo2];
                                            iArr[bravo2] = iArr[i33];
                                            iArr[i33] = i42;
                                            i33--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j19) | Long.MIN_VALUE;
                                        i33++;
                                        i28 = i11;
                                        j17 = j19;
                                        i31 = i39;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            this.foxtrot = au.alpha(this.delta) - this.echo;
                            bravo = bravo(i15);
                        }
                    }
                    j5 = 255;
                    j6 = j11;
                    j7 = 128;
                    int bravo3 = au.bravo(this.delta);
                    long[] jArr5 = this.alpha;
                    Object[] objArr3 = this.bravo;
                    int[] iArr2 = this.charlie;
                    int i43 = this.delta;
                    foxtrot(bravo3);
                    long[] jArr6 = this.alpha;
                    Object[] objArr4 = this.bravo;
                    int[] iArr3 = this.charlie;
                    int i44 = this.delta;
                    int i45 = 0;
                    while (i45 < i43) {
                        if (((jArr5[i45 >> 3] >> ((i45 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i45];
                            if (obj4 != null) {
                                i5 = obj4.hashCode();
                            } else {
                                i5 = 0;
                            }
                            int i46 = i5 * i25;
                            int i47 = i46 ^ (i46 << 16);
                            int bravo4 = bravo(i47 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j21 = i47 & 127;
                            int i48 = bravo4 >> 3;
                            int i49 = (bravo4 & 7) << 3;
                            long j22 = (jArr[i48] & (~(255 << i49))) | (j21 << i49);
                            jArr[i48] = j22;
                            jArr[(((bravo4 - 7) & i44) + (i44 & 7)) >> 3] = j22;
                            objArr4[bravo4] = obj4;
                            iArr3[bravo4] = iArr2[i45];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i45++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    bravo = bravo(i15);
                }
                this.echo++;
                int i50 = this.foxtrot;
                long[] jArr7 = this.alpha;
                int i51 = bravo >> 3;
                long j23 = jArr7[i51];
                int i52 = (bravo & 7) << 3;
                if (((j23 >> i52) & j5) == j7) {
                    i23 = 1;
                }
                this.foxtrot = i50 - i23;
                int i53 = this.delta;
                long j24 = (j23 & (~(j5 << i52))) | (j6 << i52);
                jArr7[i51] = j24;
                jArr7[(((bravo - 7) & i53) + (i53 & 7)) >> 3] = j24;
                return ~bravo;
            }
            i19 += 8;
            i18 = (i18 + i19) & i17;
            i16 = i22;
            i12 = i25;
        }
    }

    public final int delta(Object obj) {
        int i4;
        int i5 = 0;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * (-862048943);
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.delta;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.alpha;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j5 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j6 = (i12 * 72340172838076673L) ^ j5;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.bravo[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i14 = i15 + i5;
        }
    }

    public final int echo(Object obj) {
        int delta = delta(obj);
        if (delta >= 0) {
            return this.charlie[delta];
        }
        bw.a.echo("There is no key " + obj + " in the map");
        throw null;
    }

    public final boolean equals(Object obj) {
        boolean z2;
        boolean z10;
        boolean z11 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        if (agVar.echo != this.echo) {
            return false;
        }
        Object[] objArr = this.bravo;
        int[] iArr = this.charlie;
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
                        Object obj2 = objArr[i11];
                        int i12 = iArr[i11];
                        int delta = agVar.delta(obj2);
                        if (delta < 0) {
                            break loop0;
                        }
                        z10 = z11;
                        if (i12 != agVar.charlie[delta]) {
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
        this.bravo = new Object[i5];
        this.charlie = new int[i5];
    }

    public final void golf(int i4) {
        this.echo--;
        long[] jArr = this.alpha;
        int i5 = this.delta;
        int i10 = i4 >> 3;
        int i11 = (i4 & 7) << 3;
        long j5 = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        jArr[i10] = j5;
        jArr[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j5;
        this.bravo[i4] = null;
    }

    public final int hashCode() {
        int i4;
        Object[] objArr = this.bravo;
        int[] iArr = this.charlie;
        long[] jArr = this.alpha;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i5 = 0;
        int i10 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i5 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j5) < 128) {
                        int i13 = (i5 << 3) + i12;
                        Object obj = objArr[i13];
                        int i14 = iArr[i13];
                        if (obj != null) {
                            i4 = obj.hashCode();
                        } else {
                            i4 = 0;
                        }
                        i10 += i14 ^ i4;
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

    public final void hotel(int i4, Object obj) {
        int charlie = charlie(obj);
        if (charlie < 0) {
            charlie = ~charlie;
        }
        this.bravo[charlie] = obj;
        this.charlie[charlie] = i4;
    }

    public final String toString() {
        if (this.echo == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.bravo;
        int[] iArr = this.charlie;
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
                            int i13 = iArr[i12];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(i13);
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

    public /* synthetic */ ag() {
        this(6);
    }
}
