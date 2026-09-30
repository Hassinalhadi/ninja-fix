package Tf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public class n implements Serializable, Comparable {
    public static final n silver = new n(new byte[0]);
    public final byte[] alpha;
    public transient int purple;
    public transient String red;

    public n(byte[] data) {
        Intrinsics.echo(data, "data");
        this.alpha = data;
    }

    public static int golf(n nVar, n other) {
        nVar.getClass();
        Intrinsics.echo(other, "other");
        return nVar.foxtrot(0, other.alpha);
    }

    public static int kilo(n nVar, n other) {
        nVar.getClass();
        Intrinsics.echo(other, "other");
        return nVar.juliet(other.alpha);
    }

    public static /* synthetic */ n papa(n nVar, int i4, int i5, int i10) {
        if ((i10 & 1) != 0) {
            i4 = 0;
        }
        if ((i10 & 2) != 0) {
            i5 = -1234567890;
        }
        return nVar.oscar(i4, i5);
    }

    public String alpha() {
        byte[] map = a.alpha;
        byte[] bArr = this.alpha;
        Intrinsics.echo(bArr, "<this>");
        Intrinsics.echo(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            byte b2 = bArr[i4];
            int i10 = i4 + 2;
            byte b4 = bArr[i4 + 1];
            i4 += 3;
            byte b6 = bArr[i10];
            bArr2[i5] = map[(b2 & 255) >> 2];
            bArr2[i5 + 1] = map[((b2 & 3) << 4) | ((b4 & 255) >> 4)];
            int i11 = i5 + 3;
            bArr2[i5 + 2] = map[((b4 & 15) << 2) | ((b6 & 255) >> 6)];
            i5 += 4;
            bArr2[i11] = map[b6 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i12 = i4 + 1;
                byte b10 = bArr[i4];
                byte b11 = bArr[i12];
                bArr2[i5] = map[(b10 & 255) >> 2];
                bArr2[i5 + 1] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
                bArr2[i5 + 2] = map[(b11 & 15) << 2];
                bArr2[i5 + 3] = 61;
            }
        } else {
            byte b12 = bArr[i4];
            bArr2[i5] = map[(b12 & 255) >> 2];
            bArr2[i5 + 1] = map[(b12 & 3) << 4];
            bArr2[i5 + 2] = 61;
            bArr2[i5 + 3] = 61;
        }
        return new String(bArr2, kotlin.text.a.alpha);
    }

    @Override // java.lang.Comparable
    /* renamed from: bravo, reason: merged with bridge method [inline-methods] */
    public final int compareTo(n other) {
        Intrinsics.echo(other, "other");
        int delta = delta();
        int delta2 = other.delta();
        int min = Math.min(delta, delta2);
        for (int i4 = 0; i4 < min; i4++) {
            int india = india(i4) & 255;
            int india2 = other.india(i4) & 255;
            if (india != india2) {
                if (india < india2) {
                    return -1;
                }
                return 1;
            }
        }
        if (delta == delta2) {
            return 0;
        }
        if (delta < delta2) {
            return -1;
        }
        return 1;
    }

    public n charlie(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.alpha, 0, delta());
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNull(digest);
        return new n(digest);
    }

    public int delta() {
        return this.alpha.length;
    }

    public String echo() {
        byte[] bArr = this.alpha;
        char[] cArr = new char[bArr.length * 2];
        int i4 = 0;
        for (byte b2 : bArr) {
            int i5 = i4 + 1;
            char[] cArr2 = Uf.b.alpha;
            cArr[i4] = cArr2[(b2 >> 4) & 15];
            i4 += 2;
            cArr[i5] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                int delta = nVar.delta();
                byte[] bArr = this.alpha;
                if (delta == bArr.length && nVar.lima(0, 0, bArr.length, bArr)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int foxtrot(int i4, byte[] other) {
        Intrinsics.echo(other, "other");
        byte[] bArr = this.alpha;
        int length = bArr.length - other.length;
        int max = Math.max(i4, 0);
        if (max <= length) {
            while (!b.alpha(max, 0, other.length, bArr, other)) {
                if (max != length) {
                    max++;
                } else {
                    return -1;
                }
            }
            return max;
        }
        return -1;
    }

    public int hashCode() {
        int i4 = this.purple;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = Arrays.hashCode(this.alpha);
        this.purple = hashCode;
        return hashCode;
    }

    public byte[] hotel() {
        return this.alpha;
    }

    public byte india(int i4) {
        return this.alpha[i4];
    }

    public int juliet(byte[] other) {
        Intrinsics.echo(other, "other");
        int delta = delta();
        byte[] bArr = this.alpha;
        for (int min = Math.min(delta, bArr.length - other.length); -1 < min; min--) {
            if (b.alpha(min, 0, other.length, bArr, other)) {
                return min;
            }
        }
        return -1;
    }

    public boolean lima(int i4, int i5, int i10, byte[] other) {
        Intrinsics.echo(other, "other");
        if (i4 >= 0) {
            byte[] bArr = this.alpha;
            if (i4 <= bArr.length - i10 && i5 >= 0 && i5 <= other.length - i10 && b.alpha(i4, i5, i10, bArr, other)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean mike(int i4, n other, int i5) {
        Intrinsics.echo(other, "other");
        return other.lima(0, i4, i5, this.alpha);
    }

    public String november(Charset charset) {
        Intrinsics.echo(charset, "charset");
        return new String(this.alpha, charset);
    }

    public n oscar(int i4, int i5) {
        if (i5 == -1234567890) {
            i5 = delta();
        }
        if (i4 >= 0) {
            byte[] bArr = this.alpha;
            if (i5 <= bArr.length) {
                if (i5 - i4 >= 0) {
                    if (i4 == 0 && i5 == bArr.length) {
                        return this;
                    }
                    return new n(ArraysKt.copyOfRange(bArr, i4, i5));
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(Q0.c.quebec(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public n quebec() {
        int i4 = 0;
        while (true) {
            byte[] bArr = this.alpha;
            if (i4 < bArr.length) {
                byte b2 = bArr[i4];
                if (b2 >= 65 && b2 <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    Intrinsics.delta(copyOf, "copyOf(...)");
                    copyOf[i4] = (byte) (b2 + 32);
                    for (int i5 = i4 + 1; i5 < copyOf.length; i5++) {
                        byte b4 = copyOf[i5];
                        if (b4 >= 65 && b4 <= 90) {
                            copyOf[i5] = (byte) (b4 + 32);
                        }
                    }
                    return new n(copyOf);
                }
                i4++;
            } else {
                return this;
            }
        }
    }

    public final String romeo() {
        String str = this.red;
        if (str == null) {
            byte[] hotel = hotel();
            Intrinsics.echo(hotel, "<this>");
            String str2 = new String(hotel, kotlin.text.a.alpha);
            this.red = str2;
            return str2;
        }
        return str;
    }

    public void sierra(int i4, k buffer) {
        Intrinsics.echo(buffer, "buffer");
        buffer.peach(this.alpha, 0, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00ee, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0128, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x012c, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ce, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x016b, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0172, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0164, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01a2, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01a5, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01a8, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0138, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01ab, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008e, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bc, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007d, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f6, code lost:
    
        if (r6 == 64) goto L183;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        n nVar;
        int i4;
        byte b2;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        byte[] bArr = this.alpha;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        loop0: while (true) {
            if (i14 >= length) {
                break;
            }
            byte b4 = bArr[i14];
            if (b4 >= 0) {
                int i17 = i16 + 1;
                if (i16 == 64) {
                    break;
                }
                if ((b4 != 10 && b4 != 13 && ((b4 >= 0 && b4 < 32) || (Byte.MAX_VALUE <= b4 && b4 < 160))) || b4 == 65533) {
                    break;
                }
                if (b4 < 65536) {
                    i4 = 1;
                } else {
                    i4 = 2;
                }
                i15 += i4;
                i14++;
                while (true) {
                    i16 = i17;
                    if (i14 < length && (b2 = bArr[i14]) >= 0) {
                        i14++;
                        i17 = i16 + 1;
                        if (i16 == 64) {
                            break loop0;
                        }
                        if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                            break loop0;
                        }
                        if (b2 < 65536) {
                            i5 = 1;
                        } else {
                            i5 = 2;
                        }
                        i15 += i5;
                    }
                }
            } else if ((b4 >> 5) == -2) {
                int i18 = i14 + 1;
                if (length > i18) {
                    byte b6 = bArr[i18];
                    if ((b6 & 192) == 128) {
                        int i19 = (b6 ^ 3968) ^ (b4 << 6);
                        if (i19 >= 128) {
                            i10 = i16 + 1;
                            if (i16 == 64) {
                                break;
                            }
                            if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                break;
                            }
                            if (i19 < 65536) {
                                i13 = 1;
                            } else {
                                i13 = 2;
                            }
                            i15 += i13;
                            i14 += 2;
                            i16 = i10;
                        }
                    }
                }
            } else if ((b4 >> 4) == -2) {
                int i20 = i14 + 2;
                if (length > i20) {
                    byte b10 = bArr[i14 + 1];
                    if ((b10 & 192) == 128) {
                        byte b11 = bArr[i20];
                        if ((b11 & 192) == 128) {
                            int i21 = ((b11 ^ (-123008)) ^ (b10 << 6)) ^ (b4 << 12);
                            if (i21 >= 2048) {
                                if (55296 > i21 || i21 >= 57344) {
                                    i10 = i16 + 1;
                                    if (i16 == 64) {
                                        break;
                                    }
                                    if ((i21 != 10 && i21 != 13 && ((i21 >= 0 && i21 < 32) || (127 <= i21 && i21 < 160))) || i21 == 65533) {
                                        break;
                                    }
                                    if (i21 < 65536) {
                                        i12 = 1;
                                    } else {
                                        i12 = 2;
                                    }
                                    i15 += i12;
                                    i14 += 3;
                                    i16 = i10;
                                }
                            }
                        }
                    }
                }
            } else if ((b4 >> 3) == -2) {
                int i22 = i14 + 3;
                if (length > i22) {
                    byte b12 = bArr[i14 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i14 + 2];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i22];
                            if ((b14 & 192) == 128) {
                                int i23 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b4 << 18);
                                if (i23 <= 1114111) {
                                    if (55296 > i23 || i23 >= 57344) {
                                        if (i23 >= 65536) {
                                            i10 = i16 + 1;
                                            if (i16 == 64) {
                                                break;
                                            }
                                            if ((i23 != 10 && i23 != 13 && ((i23 >= 0 && i23 < 32) || (127 <= i23 && i23 < 160))) || i23 == 65533) {
                                                break;
                                            }
                                            if (i23 < 65536) {
                                                i11 = 1;
                                            } else {
                                                i11 = 2;
                                            }
                                            i15 += i11;
                                            i14 += 4;
                                            i16 = i10;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i15 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + echo() + ']';
            }
            StringBuilder sb2 = new StringBuilder("[size=");
            sb2.append(bArr.length);
            sb2.append(" hex=");
            if (64 <= bArr.length) {
                if (64 == bArr.length) {
                    nVar = this;
                } else {
                    nVar = new n(ArraysKt.copyOfRange(bArr, 0, 64));
                }
                sb2.append(nVar.echo());
                sb2.append("…]");
                return sb2.toString();
            }
            throw new IllegalArgumentException(Q0.c.quebec(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        String romeo = romeo();
        String substring = romeo.substring(0, i15);
        Intrinsics.delta(substring, "substring(...)");
        String oscar = kotlin.text.r.oscar(kotlin.text.r.oscar(kotlin.text.r.oscar(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i15 < romeo.length()) {
            return "[size=" + bArr.length + " text=" + oscar + "…]";
        }
        return AbstractC2327c.victor(']', "[text=", oscar);
    }
}
