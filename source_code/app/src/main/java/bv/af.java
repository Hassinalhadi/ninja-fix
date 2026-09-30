package bv;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class af {
    public long[] alpha = au.alpha;
    public Object[] bravo = bw.a.charlie;
    public float[] charlie = i.alpha;
    public int delta;
    public int echo;
    public int foxtrot;

    public af(int i4) {
        if (i4 >= 0) {
            charlie(au.delta(i4));
        } else {
            bw.a.charlie("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int alpha(int i4) {
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

    public final int bravo(Object obj) {
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

    public final void charlie(int i4) {
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
        this.charlie = new float[i5];
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        r2 = alpha(r5);
        r9 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r36.foxtrot != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        if (((r36.alpha[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        r2 = r36.delta;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        if (r2 <= 8) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
    
        if (java.lang.Long.compare((r36.echo * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        r2 = r36.alpha;
        r3 = r36.delta;
        r4 = r36.bravo;
        r6 = r36.charlie;
        r7 = (r3 + 7) >> 3;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
    
        if (r8 >= r7) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
    
        r29 = r9;
        r9 = r2[r8] & r13;
        r2[r8] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r8 = r8 + 1;
        r9 = r29;
        r13 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f8, code lost:
    
        r29 = r9;
        r7 = kotlin.collections.ArraysKt.green(r2);
        r8 = r7 - 1;
        r13 = 72057594037927935L;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0113, code lost:
    
        if (r7 == r3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0115, code lost:
    
        r8 = r7 >> 3;
        r19 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r19) & r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0123, code lost:
    
        if (r9 != 128) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012a, code lost:
    
        if (r9 == 254) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012d, code lost:
    
        r9 = r4[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012f, code lost:
    
        if (r9 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0131, code lost:
    
        r9 = r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0137, code lost:
    
        r9 = r9 * r20;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r27 = alpha(r10);
        r10 = r10 & r3;
        r31 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0150, code lost:
    
        if ((((r27 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0152, code lost:
    
        r28 = r3;
        r33 = r4;
        r2[r8] = ((~(r29 << r19)) & r2[r8]) | ((r9 & 127) << r19);
        r2[r2.length - 1] = (r2[0] & r31) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016f, code lost:
    
        r7 = r7 + 1;
        r3 = r28;
        r13 = r31;
        r4 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0178, code lost:
    
        r28 = r3;
        r33 = r4;
        r3 = r27 >> 3;
        r13 = r2[r3];
        r4 = (r27 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018a, code lost:
    
        if (((r13 >> r4) & r29) != 128) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x018c, code lost:
    
        r2[r3] = ((~(r29 << r4)) & r13) | ((r9 & 127) << r4);
        r2[r8] = (r2[r8] & (~(r29 << r19))) | (128 << r19);
        r33[r27] = r33[r7];
        r33[r7] = null;
        r6[r27] = r6[r7];
        r6[r7] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01d8, code lost:
    
        r2[r2.length - 1] = (r2[0] & r31) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b6, code lost:
    
        r2[r3] = ((r9 & 127) << r4) | ((~(r29 << r4)) & r13);
        r3 = r33[r27];
        r33[r27] = r33[r7];
        r33[r7] = r3;
        r3 = r6[r27];
        r6[r27] = r6[r7];
        r6[r7] = r3;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0136, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0125, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e4, code lost:
    
        r36.foxtrot = bv.au.alpha(r36.delta) - r36.echo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0273, code lost:
    
        r2 = alpha(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0277, code lost:
    
        r36.echo++;
        r1 = r36.foxtrot;
        r3 = r36.alpha;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x028f, code lost:
    
        if (((r5 >> r7) & r29) != r23) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0292, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0294, code lost:
    
        r36.foxtrot = r1 - r16;
        r1 = r36.delta;
        r5 = (r5 & (~(r29 << r7))) | (r11 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f1, code lost:
    
        r29 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f9, code lost:
    
        r2 = bv.au.bravo(r36.delta);
        r3 = r36.alpha;
        r4 = r36.bravo;
        r6 = r36.charlie;
        r7 = r36.delta;
        charlie(r2);
        r2 = r36.alpha;
        r8 = r36.bravo;
        r9 = r36.charlie;
        r10 = r36.delta;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0213, code lost:
    
        if (r13 >= r7) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0223, code lost:
    
        if (((r3[r13 >> 3] >> ((r13 & 7) << 3)) & 255) >= r23) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0225, code lost:
    
        r14 = r4[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0227, code lost:
    
        if (r14 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0229, code lost:
    
        r17 = r14.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0230, code lost:
    
        r17 = r17 * r20;
        r17 = r17 ^ (r17 << 16);
        r15 = alpha(r17 >>> 7);
        r1 = r17 & 127;
        r17 = r2;
        r19 = r15 >> 3;
        r22 = (r15 & 7) << 3;
        r1 = (r17[r19] & (~(255 << r22))) | (r1 << r22);
        r17[r19] = r1;
        r17[(((r15 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r15] = r14;
        r9[r15] = r6[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x026b, code lost:
    
        r13 = r13 + 1;
        r2 = r17;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x022e, code lost:
    
        r17 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0269, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f4, code lost:
    
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a3, code lost:
    
        r29 = 255;
        r23 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void delta(String str, float f5) {
        int i4;
        int i5;
        int i10;
        String str2 = str;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = -862048943;
        int i12 = i4 * (-862048943);
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.delta;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.alpha;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            long j5 = ((jArr[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr[i19] >>> i20);
            long j6 = i15;
            int i22 = i15;
            int i23 = 0;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j10 = -9187201950435737472L;
            long j11 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j11) >> 3)) & i16;
                int i24 = i11;
                if (Intrinsics.areEqual(this.bravo[numberOfTrailingZeros], str2)) {
                    i10 = numberOfTrailingZeros;
                    break loop0;
                } else {
                    j11 &= j11 - 1;
                    i11 = i24;
                }
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            str2 = str;
            i15 = i22;
            i11 = i5;
        }
        if (i10 < 0) {
            i10 = ~i10;
        }
        this.bravo[i10] = str;
        this.charlie[i10] = f5;
    }

    public final boolean equals(Object obj) {
        boolean z2;
        boolean z10;
        boolean z11 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        if (afVar.echo != this.echo) {
            return false;
        }
        Object[] objArr = this.bravo;
        float[] fArr = this.charlie;
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
                        float f5 = fArr[i11];
                        int bravo = afVar.bravo(obj2);
                        if (bravo < 0) {
                            break loop0;
                        }
                        z10 = z11;
                        if (f5 != afVar.charlie[bravo]) {
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

    public final int hashCode() {
        int i4;
        Object[] objArr = this.bravo;
        float[] fArr = this.charlie;
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
                        float f5 = fArr[i13];
                        if (obj != null) {
                            i4 = obj.hashCode();
                        } else {
                            i4 = 0;
                        }
                        i10 += Float.floatToIntBits(f5) ^ i4;
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
        if (this.echo == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.bravo;
        float[] fArr = this.charlie;
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
                            float f5 = fArr[i12];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(f5);
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
}
