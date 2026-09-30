package Uf;

import A0.z;
import Tf.ag;
import Tf.al;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {
    public static final byte[] alpha;
    public static final long[] bravo;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(kotlin.text.a.alpha);
        Intrinsics.delta(bytes, "getBytes(...)");
        alpha = bytes;
        bravo = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long alpha(Tf.k kVar, Tf.n bytes, long j5, long j6, int i4) {
        al alVar;
        byte[] bArr;
        long j7 = j5;
        long j10 = j6;
        Intrinsics.echo(kVar, "<this>");
        Intrinsics.echo(bytes, "bytes");
        long j11 = i4;
        Tf.b.echo(bytes.delta(), 0, j11);
        if (i4 > 0) {
            long j12 = 0;
            if (j7 >= 0) {
                if (j7 <= j10) {
                    long j13 = kVar.purple;
                    if (j10 > j13) {
                        j10 = j13;
                    }
                    if (j7 != j10 && (alVar = kVar.alpha) != null) {
                        if (j13 - j7 < j7) {
                            while (j13 > j7) {
                                alVar = alVar.golf;
                                Intrinsics.checkNotNull(alVar);
                                j13 -= alVar.charlie - alVar.bravo;
                            }
                            byte[] hotel = bytes.hotel();
                            byte b2 = hotel[0];
                            byte[] bArr2 = hotel;
                            long min = Math.min(j10, (kVar.purple - j11) + 1);
                            while (j13 < min) {
                                byte[] bArr3 = alVar.alpha;
                                int min2 = (int) Math.min(alVar.charlie, (alVar.bravo + min) - j13);
                                int i5 = (int) ((alVar.bravo + j7) - j13);
                                while (i5 < min2) {
                                    if (bArr3[i5] == b2) {
                                        bArr = bArr2;
                                        if (bravo(alVar, i5 + 1, bArr, 1, i4)) {
                                            return (i5 - alVar.bravo) + j13;
                                        }
                                    } else {
                                        bArr = bArr2;
                                    }
                                    i5++;
                                    bArr2 = bArr;
                                }
                                j13 += alVar.charlie - alVar.bravo;
                                alVar = alVar.foxtrot;
                                Intrinsics.checkNotNull(alVar);
                                j7 = j13;
                            }
                            return -1L;
                        }
                        while (true) {
                            long j14 = (alVar.charlie - alVar.bravo) + j12;
                            if (j14 > j7) {
                                break;
                            }
                            alVar = alVar.foxtrot;
                            Intrinsics.checkNotNull(alVar);
                            j12 = j14;
                        }
                        byte[] hotel2 = bytes.hotel();
                        byte b4 = hotel2[0];
                        long min3 = Math.min(j10, (kVar.purple - j11) + 1);
                        while (j12 < min3) {
                            byte[] bArr4 = alVar.alpha;
                            int min4 = (int) Math.min(alVar.charlie, (alVar.bravo + min3) - j12);
                            for (int i10 = (int) ((alVar.bravo + j7) - j12); i10 < min4; i10++) {
                                if (bArr4[i10] == b4 && bravo(alVar, i10 + 1, hotel2, 1, i4)) {
                                    return (i10 - alVar.bravo) + j12;
                                }
                            }
                            j12 += alVar.charlie - alVar.bravo;
                            alVar = alVar.foxtrot;
                            Intrinsics.checkNotNull(alVar);
                            j7 = j12;
                        }
                        return -1L;
                    }
                    return -1L;
                }
                StringBuilder uniform = Q0.c.uniform("fromIndex > toIndex: ", j7, " > ");
                uniform.append(j10);
                throw new IllegalArgumentException(uniform.toString().toString());
            }
            throw new IllegalArgumentException(z.india(j7, "fromIndex < 0: ").toString());
        }
        throw new IllegalArgumentException("byteCount == 0");
    }

    public static final boolean bravo(al alVar, int i4, byte[] bArr, int i5, int i10) {
        int i11 = alVar.charlie;
        byte[] bArr2 = alVar.alpha;
        while (i5 < i10) {
            if (i4 == i11) {
                alVar = alVar.foxtrot;
                Intrinsics.checkNotNull(alVar);
                byte[] bArr3 = alVar.alpha;
                bArr2 = bArr3;
                i4 = alVar.bravo;
                i11 = alVar.charlie;
            }
            if (bArr2[i4] != bArr[i5]) {
                return false;
            }
            i4++;
            i5++;
        }
        return true;
    }

    public static final String charlie(Tf.k kVar, long j5) {
        Intrinsics.echo(kVar, "<this>");
        if (j5 > 0) {
            long j6 = j5 - 1;
            if (kVar.juliet(j6) == 13) {
                String gray = kVar.gray(j6, kotlin.text.a.alpha);
                kVar.india(2L);
                return gray;
            }
        }
        String gray2 = kVar.gray(j5, kotlin.text.a.alpha);
        kVar.india(1L);
        return gray2;
    }

    public static final int delta(Tf.k kVar, ag options, boolean z2) {
        int i4;
        byte[] bArr;
        int i5;
        int i10;
        boolean z10;
        al alVar;
        byte[] bArr2;
        int i11;
        Intrinsics.echo(kVar, "<this>");
        Intrinsics.echo(options, "options");
        al alVar2 = kVar.alpha;
        if (alVar2 == null) {
            if (!z2) {
                return -1;
            }
            return -2;
        }
        int i12 = alVar2.bravo;
        int i13 = alVar2.charlie;
        byte[] bArr3 = alVar2.alpha;
        al alVar3 = alVar2;
        int i14 = -1;
        int i15 = 0;
        loop0: while (true) {
            int i16 = i15 + 1;
            int[] iArr = options.purple;
            int i17 = iArr[i15];
            int i18 = i15 + 2;
            int i19 = iArr[i16];
            if (i19 != -1) {
                i14 = i19;
            }
            if (alVar3 == null) {
                break;
            }
            if (i17 < 0) {
                int i20 = (i17 * (-1)) + i18;
                while (true) {
                    int i21 = i12 + 1;
                    int i22 = i18 + 1;
                    if ((bArr3[i12] & 255) != iArr[i18]) {
                        break loop0;
                    }
                    if (i22 == i20) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i21 == i13) {
                        Intrinsics.checkNotNull(alVar3);
                        al alVar4 = alVar3.foxtrot;
                        Intrinsics.checkNotNull(alVar4);
                        i11 = alVar4.bravo;
                        int i23 = alVar4.charlie;
                        bArr2 = alVar4.alpha;
                        if (alVar4 == alVar2) {
                            if (!z10) {
                                break loop0;
                            }
                            i13 = i23;
                            alVar = null;
                        } else {
                            alVar = alVar4;
                            i13 = i23;
                        }
                    } else {
                        alVar = alVar3;
                        bArr2 = bArr3;
                        i11 = i21;
                    }
                    if (z10) {
                        i4 = iArr[i22];
                        int i24 = i11;
                        i5 = i13;
                        i10 = i24;
                        byte[] bArr4 = bArr2;
                        alVar3 = alVar;
                        bArr = bArr4;
                        break;
                    }
                    i12 = i11;
                    bArr3 = bArr2;
                    alVar3 = alVar;
                    i18 = i22;
                }
            } else {
                int i25 = i12 + 1;
                int i26 = bArr3[i12] & 255;
                int i27 = i18 + i17;
                while (i18 != i27) {
                    if (i26 == iArr[i18]) {
                        i4 = iArr[i18 + i17];
                        if (i25 == i13) {
                            alVar3 = alVar3.foxtrot;
                            Intrinsics.checkNotNull(alVar3);
                            i10 = alVar3.bravo;
                            i5 = alVar3.charlie;
                            bArr = alVar3.alpha;
                            if (alVar3 == alVar2) {
                                alVar3 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i5 = i13;
                            i10 = i25;
                        }
                        if (i4 >= 0) {
                            return i4;
                        }
                        byte[] bArr5 = bArr;
                        i15 = -i4;
                        i12 = i10;
                        i13 = i5;
                        bArr3 = bArr5;
                    } else {
                        i18++;
                    }
                }
                break loop0;
            }
        }
        if (z2) {
            return -2;
        }
        return i14;
    }
}
