package bv;

import com.clevertap.android.sdk.Constants;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ab {
    public long[] alpha;
    public int[] bravo;
    public int charlie;
    public int delta;
    public int echo;

    public ab(int i4) {
        this.alpha = au.alpha;
        this.bravo = p.alpha;
        if (i4 >= 0) {
            delta(au.delta(i4));
        } else {
            bw.a.charlie("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        r21 = r12;
        r4 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        if (((((~r8) << 6) & r8) & r21) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        r3 = charlie(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        if (r38.echo != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        if (((r38.alpha[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        r3 = r38.charlie;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (r3 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        r23 = 128;
        r25 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
    
        if (java.lang.Long.compare((r38.delta * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        r3 = r38.alpha;
        r6 = r38.charlie;
        r7 = r38.bravo;
        r8 = (r6 + 7) >> 3;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        if (r9 >= r8) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        r12 = r3[r9] & r21;
        r3[r9] = (-72340172838076674L) & ((~r12) + (r12 >>> 7));
        r9 = r9 + 1;
        r15 = r15;
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f3, code lost:
    
        r29 = r14;
        r18 = r15;
        r8 = kotlin.collections.ArraysKt.green(r3);
        r9 = r8 - 1;
        r14 = 72057594037927935L;
        r3[r9] = (r3[r9] & 72057594037927935L) | (-72057594037927936L);
        r3[r8] = r3[0];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0111, code lost:
    
        if (r8 == r6) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0113, code lost:
    
        r9 = r8 >> 3;
        r21 = (r8 & 7) << 3;
        r12 = (r3[r9] >> r21) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0121, code lost:
    
        if (r12 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0128, code lost:
    
        if (r12 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012b, code lost:
    
        r12 = r7[r8] * r29;
        r13 = (r12 ^ (r12 << 16)) >>> 7;
        r22 = charlie(r13);
        r13 = r13 & r6;
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0146, code lost:
    
        if ((((r22 - r13) & r6) / 8) != (((r8 - r13) & r6) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0148, code lost:
    
        r34 = r14;
        r3[r9] = ((r12 & 127) << r21) | (r3[r9] & (~(255 << r21)));
        r3[r3.length - 1] = (r3[0] & r34) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r4 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0168, code lost:
    
        r14 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016b, code lost:
    
        r34 = r14;
        r4 = r22 >> 3;
        r13 = r3[r4];
        r15 = (r22 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017b, code lost:
    
        if (((r13 >> r15) & 255) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017d, code lost:
    
        r30 = r6;
        r32 = r7;
        r3[r4] = ((~(255 << r15)) & r13) | ((r12 & 127) << r15);
        r3[r9] = (r3[r9] & (~(255 << r21))) | (128 << r21);
        r32[r22] = r32[r8];
        r32[r8] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01bd, code lost:
    
        r3[r3.length - 1] = (r3[0] & r34) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r6 = r30;
        r4 = r31;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a1, code lost:
    
        r30 = r6;
        r32 = r7;
        r3[r4] = ((~(255 << r15)) & r13) | ((r12 & 127) << r15);
        r4 = r32[r22];
        r32[r22] = r32[r8];
        r32[r8] = r4;
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0123, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d1, code lost:
    
        r38.echo = bv.au.alpha(r38.charlie) - r38.delta;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0254, code lost:
    
        r3 = charlie(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0258, code lost:
    
        r38.delta++;
        r4 = r38.echo;
        r5 = r38.alpha;
        r6 = r3 >> 3;
        r7 = r5[r6];
        r9 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0270, code lost:
    
        if (((r7 >> r9) & r25) != r23) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0272, code lost:
    
        r12 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0277, code lost:
    
        r38.echo = r4 - r12;
        r4 = r38.charlie;
        r7 = (r7 & (~(r25 << r9))) | (r10 << r9);
        r5[r6] = r7;
        r5[(((r3 - 7) & r4) + (r4 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0275, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01de, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ea, code lost:
    
        r3 = bv.au.bravo(r38.charlie);
        r4 = r38.alpha;
        r6 = r38.bravo;
        r7 = r38.charlie;
        delta(r3);
        r3 = r38.alpha;
        r8 = r38.bravo;
        r9 = r38.charlie;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0201, code lost:
    
        if (r12 >= r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0210, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & r25) >= r23) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0212, code lost:
    
        r13 = r6[r12];
        r14 = r13 * r14;
        r14 = r14 ^ (r14 << 16);
        r15 = charlie(r14 >>> 7);
        r20 = r3;
        r19 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r21 = (r15 & 7) << 3;
        r3 = (r20[r14] & (~(r25 << r21))) | (r3 << r21);
        r20[r14] = r3;
        r20[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x024d, code lost:
    
        r12 = r12 + 1;
        r4 = r19;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0249, code lost:
    
        r20 = r3;
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e3, code lost:
    
        r25 = 255;
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009e, code lost:
    
        r25 = 255;
        r18 = true;
        r23 = 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [int] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean alpha(int i4) {
        int charlie;
        boolean z2;
        int i5 = this.delta;
        int i10 = -862048943;
        int i11 = i4 * (-862048943);
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.charlie;
        int i16 = i13 & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.alpha;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            boolean z10 = true;
            int i20 = i17;
            long j5 = (((-i19) >> 63) & (jArr[i18 + 1] << (64 - i19))) | (jArr[i18] >>> i19);
            long j6 = i14;
            int i21 = i10;
            int i22 = i14;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j10 = -9187201950435737472L;
            long j11 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j11) >> 3)) & i15;
                long j12 = j10;
                if (this.bravo[numberOfTrailingZeros] == i4) {
                    charlie = numberOfTrailingZeros;
                    z2 = true;
                    break loop0;
                }
                j11 &= j11 - 1;
                j10 = j12;
            }
            i17 = i20 + 8;
            i16 = (i16 + i17) & i15;
            i14 = i22;
            i10 = i21;
        }
        this.bravo[charlie] = i4;
        if (this.delta == i5) {
            return false;
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean bravo(int i4) {
        int i5;
        int i10 = (-862048943) * i4;
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
                if (this.bravo[i5] == i4) {
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

    public final int charlie(int i4) {
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

    public final void delta(int i4) {
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
        this.bravo = new int[i5];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean echo(int i4) {
        int i5;
        int i10 = (-862048943) * i4;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.charlie;
        int i14 = (i11 >>> 7) & i13;
        boolean z2 = false;
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
        if (i5 >= 0) {
            z2 = true;
        }
        if (z2) {
            foxtrot(i5);
        }
        return z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        if (abVar.delta != this.delta) {
            return false;
        }
        int[] iArr = this.bravo;
        long[] jArr = this.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128 && !abVar.bravo(iArr[(i4 << 3) + i10])) {
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
        this.delta--;
        long[] jArr = this.alpha;
        int i5 = this.charlie;
        int i10 = i4 >> 3;
        int i11 = (i4 & 7) << 3;
        long j5 = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        jArr[i10] = j5;
        jArr[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j5;
    }

    public final int hashCode() {
        int[] iArr = this.bravo;
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
                        i5 += iArr[(i4 << 3) + i11];
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
        int[] iArr = this.bravo;
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
                            int i12 = iArr[(i4 << 3) + i11];
                            if (i5 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i5 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append(i12);
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

    public /* synthetic */ ab() {
        this(6);
    }
}
