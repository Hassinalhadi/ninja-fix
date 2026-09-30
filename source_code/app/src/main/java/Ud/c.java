package Ud;

import A0.z;
import androidx.appcompat.widget.P0;
import ao.ad;
import com.airbnb.lottie.compose.LottieConstants;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2743p6;

/* loaded from: classes2.dex */
public class c {
    public static final a foxtrot;
    public static final byte[] golf;
    public static final c hotel;
    public final boolean alpha;
    public final boolean bravo;
    public final int charlie;
    public final b delta;
    public final int echo;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ud.a, Ud.c] */
    static {
        b bVar = b.alpha;
        foxtrot = new c(false, false, -1, bVar);
        golf = new byte[]{13, 10};
        hotel = new c(true, false, -1, bVar);
        new c(false, true, 76, bVar);
        new c(false, true, 64, bVar);
    }

    public c(boolean z2, boolean z10, int i4, b bVar) {
        this.alpha = z2;
        this.bravo = z10;
        this.charlie = i4;
        this.delta = bVar;
        if (z2 && z10) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.echo = i4 / 4;
    }

    public static byte[] alpha(c cVar, String source) {
        int i4;
        int i5;
        int[] iArr;
        b bVar;
        int i10;
        int i11;
        int i12;
        c cVar2 = cVar;
        int length = source.length();
        cVar2.getClass();
        Intrinsics.echo(source, "source");
        int i13 = 0;
        ab.charlie(0, length, source.length());
        String substring = source.substring(0, length);
        Intrinsics.delta(substring, "substring(...)");
        byte[] bytes = substring.getBytes(kotlin.text.a.delta);
        Intrinsics.delta(bytes, "getBytes(...)");
        int length2 = bytes.length;
        ab.charlie(0, length2, bytes.length);
        int i14 = 8;
        int i15 = -2;
        int i16 = 1;
        boolean z2 = cVar2.bravo;
        if (length2 == 0) {
            i5 = 0;
        } else if (length2 != 1) {
            if (z2) {
                i4 = length2;
                int i17 = 0;
                while (true) {
                    if (i17 >= length2) {
                        break;
                    }
                    int i18 = d.bravo[bytes[i17] & 255];
                    if (i18 < 0) {
                        if (i18 == -2) {
                            i4 -= length2 - i17;
                            break;
                        }
                        i4--;
                    }
                    i17++;
                }
            } else if (bytes[length2 - 1] == 61) {
                i4 = length2 - 1;
                if (bytes[length2 - 2] == 61) {
                    i4 = length2 - 2;
                }
            } else {
                i4 = length2;
            }
            i5 = (int) ((i4 * 6) / 8);
        } else {
            throw new IllegalArgumentException(ad.zulu(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
        }
        byte[] bArr = new byte[i5];
        if (cVar2.alpha) {
            iArr = d.delta;
        } else {
            iArr = d.bravo;
        }
        int i19 = -8;
        int i20 = 0;
        int i21 = 0;
        int i22 = -8;
        while (true) {
            int i23 = i16;
            bVar = cVar2.delta;
            int i24 = i14;
            if (i20 < length2) {
                if (i22 == i19 && (i12 = i20 + 3) < length2) {
                    int i25 = i20 + 4;
                    int i26 = (iArr[bytes[i20 + 2] & 255] << 6) | (iArr[bytes[i20] & 255] << 18) | (iArr[bytes[i20 + 1] & 255] << 12) | iArr[bytes[i12] & 255];
                    if (i26 >= 0) {
                        bArr[i13] = (byte) (i26 >> 16);
                        int i27 = i13 + 2;
                        bArr[i13 + 1] = (byte) (i26 >> 8);
                        i13 += 3;
                        bArr[i27] = (byte) i26;
                        cVar2 = cVar;
                        i16 = i23;
                        i14 = i24;
                        i20 = i25;
                        i15 = -2;
                        i19 = -8;
                    }
                }
                int i28 = bytes[i20] & 255;
                int i29 = iArr[i28];
                if (i29 < 0) {
                    if (i29 == -2) {
                        if (i22 != -8) {
                            if (i22 != -6) {
                                if (i22 != -4) {
                                    if (i22 != -2) {
                                        throw new IllegalStateException("Unreachable");
                                    }
                                } else if (bVar != b.purple) {
                                    int i30 = i20 + 1;
                                    if (z2) {
                                        while (i30 < length2) {
                                            if (d.bravo[bytes[i30] & 255] != -1) {
                                                break;
                                            }
                                            i30++;
                                        }
                                    }
                                    if (i30 != length2 && bytes[i30] == 61) {
                                        i20 = i30 + 1;
                                        i11 = i23;
                                        i10 = -2;
                                    } else {
                                        throw new IllegalArgumentException(ad.zulu(i30, "Missing one pad character at index "));
                                    }
                                } else {
                                    throw new IllegalArgumentException(ad.zulu(i20, "The padding option is set to ABSENT, but the input has a pad character at index "));
                                }
                            } else if (bVar == b.purple) {
                                throw new IllegalArgumentException(ad.zulu(i20, "The padding option is set to ABSENT, but the input has a pad character at index "));
                            }
                            i20++;
                            i11 = i23;
                            i10 = -2;
                        } else {
                            throw new IllegalArgumentException(ad.zulu(i20, "Redundant pad character at index "));
                        }
                    } else if (z2) {
                        i20++;
                        cVar2 = cVar;
                        i16 = i23;
                        i14 = i24;
                    } else {
                        StringBuilder sb2 = new StringBuilder("Invalid symbol '");
                        sb2.append((char) i28);
                        sb2.append("'(");
                        AbstractC2743p6.alpha(i24);
                        String num = Integer.toString(i28, i24);
                        Intrinsics.delta(num, "toString(...)");
                        sb2.append(num);
                        sb2.append(") at index ");
                        sb2.append(i20);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                } else {
                    i20++;
                    i21 = (i21 << 6) | i29;
                    int i31 = i22 + 6;
                    if (i31 >= 0) {
                        bArr[i13] = (byte) (i21 >>> i31);
                        i21 &= (i23 << i31) - 1;
                        i22 -= 2;
                        i13++;
                        i16 = i23;
                        i14 = 8;
                        i15 = -2;
                        i19 = -8;
                        cVar2 = cVar;
                    } else {
                        cVar2 = cVar;
                        i22 = i31;
                        i16 = i23;
                        i14 = 8;
                    }
                }
                i15 = -2;
                i19 = -8;
            } else {
                i10 = i15;
                i11 = 0;
                break;
            }
        }
        if (i22 != i10) {
            if (i22 != -8 && i11 == 0 && bVar == b.alpha) {
                throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
            }
            if (i21 == 0) {
                if (z2) {
                    while (i20 < length2) {
                        if (d.bravo[bytes[i20] & 255] != -1) {
                            break;
                        }
                        i20++;
                    }
                }
                if (i20 >= length2) {
                    if (i13 == i5) {
                        return bArr;
                    }
                    throw new IllegalStateException("Check failed.");
                }
                int i32 = bytes[i20] & 255;
                StringBuilder sb3 = new StringBuilder("Symbol '");
                sb3.append((char) i32);
                sb3.append("'(");
                AbstractC2743p6.alpha(8);
                String num2 = Integer.toString(i32, 8);
                Intrinsics.delta(num2, "toString(...)");
                sb3.append(num2);
                sb3.append(") at index ");
                throw new IllegalArgumentException(P0.cyan(sb3, i20 - 1, " is prohibited after the pad character"));
            }
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        throw new IllegalArgumentException("The last unit of input does not have enough bits");
    }

    public static String bravo(c cVar, byte[] bArr) {
        byte[] bArr2;
        int i4;
        int i5;
        int length = bArr.length;
        cVar.getClass();
        ab.charlie(0, length, bArr.length);
        int charlie = cVar.charlie(length);
        byte[] bArr3 = new byte[charlie];
        ab.charlie(0, length, bArr.length);
        int charlie2 = cVar.charlie(length);
        if (charlie >= 0) {
            if (charlie2 >= 0 && charlie2 <= charlie) {
                if (cVar.alpha) {
                    bArr2 = d.charlie;
                } else {
                    bArr2 = d.alpha;
                }
                if (cVar.bravo) {
                    i4 = cVar.echo;
                } else {
                    i4 = LottieConstants.IterateForever;
                }
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    i5 = i10 + 2;
                    if (i5 >= length) {
                        break;
                    }
                    int min = Math.min((length - i10) / 3, i4);
                    for (int i12 = 0; i12 < min; i12++) {
                        int i13 = bArr[i10] & 255;
                        int i14 = i10 + 2;
                        int i15 = bArr[i10 + 1] & 255;
                        i10 += 3;
                        int i16 = (i15 << 8) | (i13 << 16) | (bArr[i14] & 255);
                        bArr3[i11] = bArr2[i16 >>> 18];
                        bArr3[i11 + 1] = bArr2[(i16 >>> 12) & 63];
                        int i17 = i11 + 3;
                        bArr3[i11 + 2] = bArr2[(i16 >>> 6) & 63];
                        i11 += 4;
                        bArr3[i17] = bArr2[i16 & 63];
                    }
                    if (min == i4 && i10 != length) {
                        int i18 = i11 + 1;
                        byte[] bArr4 = golf;
                        bArr3[i11] = bArr4[0];
                        i11 += 2;
                        bArr3[i18] = bArr4[1];
                    }
                }
                int i19 = length - i10;
                b bVar = cVar.delta;
                if (i19 != 1) {
                    if (i19 == 2) {
                        int i20 = ((bArr[i10 + 1] & 255) << 2) | ((bArr[i10] & 255) << 10);
                        bArr3[i11] = bArr2[i20 >>> 12];
                        int i21 = i11 + 2;
                        bArr3[i11 + 1] = bArr2[(i20 >>> 6) & 63];
                        int i22 = i11 + 3;
                        bArr3[i21] = bArr2[i20 & 63];
                        if (bVar == b.alpha || bVar == b.red) {
                            bArr3[i22] = 61;
                        }
                        i10 = i5;
                    }
                } else {
                    int i23 = i10 + 1;
                    int i24 = (bArr[i10] & 255) << 4;
                    bArr3[i11] = bArr2[i24 >>> 6];
                    int i25 = i11 + 2;
                    bArr3[i11 + 1] = bArr2[i24 & 63];
                    if (bVar == b.alpha || bVar == b.red) {
                        bArr3[i25] = 61;
                        bArr3[i11 + 3] = 61;
                    }
                    i10 = i23;
                }
                if (i10 == length) {
                    return new String(bArr3, kotlin.text.a.delta);
                }
                throw new IllegalStateException("Check failed.");
            }
            throw new IndexOutOfBoundsException(z.juliet("The destination array does not have enough capacity, destination offset: 0, destination size: ", charlie, charlie2, ", capacity needed: "));
        }
        throw new IndexOutOfBoundsException(ad.zulu(charlie, "destination offset: 0, destination size: "));
    }

    public final int charlie(int i4) {
        int i5 = i4 / 3;
        int i10 = i4 % 3;
        int i11 = 4;
        int i12 = i5 * 4;
        if (i10 != 0) {
            b bVar = b.alpha;
            b bVar2 = this.delta;
            if (bVar2 != bVar && bVar2 != b.red) {
                i11 = i10 + 1;
            }
            i12 += i11;
        }
        if (i12 >= 0) {
            if (this.bravo) {
                i12 = P0.zulu(i12 - 1, this.charlie, 2, i12);
            }
            if (i12 >= 0) {
                return i12;
            }
            throw new IllegalArgumentException("Input is too big");
        }
        throw new IllegalArgumentException("Input is too big");
    }
}
