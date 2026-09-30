package androidx.datastore.preferences.protobuf;

import ge.InterfaceC1772d;
import ge.InterfaceC1773e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class E {
    public final /* synthetic */ int alpha;

    public static final Ed.a alpha(Ed.a aVar) {
        Intrinsics.echo(aVar, "<this>");
        ge.w wVar = aVar.bravo;
        Intrinsics.checkNotNull(wVar);
        ge.w wVar2 = ((ge.z) wVar.delta().get(0)).bravo;
        Intrinsics.checkNotNull(wVar2);
        InterfaceC1773e foxtrot = wVar2.foxtrot();
        Intrinsics.charlie(foxtrot, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        return new Ed.a((InterfaceC1772d) foxtrot, wVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r27 + r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int bravo(String str, byte[] bArr, int i4, int i5) {
        int i10;
        int i11;
        char charAt;
        long j5;
        long j6;
        long j7;
        int i12;
        char charAt2;
        switch (this.alpha) {
            case 0:
                int length = str.length();
                int i13 = i5 + i4;
                int i14 = 0;
                while (i14 < length && (i11 = i14 + i4) < i13 && (charAt = str.charAt(i14)) < 128) {
                    bArr[i11] = (byte) charAt;
                    i14++;
                }
                int i15 = i4 + i14;
                while (i14 < length) {
                    char charAt3 = str.charAt(i14);
                    if (charAt3 < 128 && i15 < i13) {
                        bArr[i15] = (byte) charAt3;
                        i15++;
                    } else if (charAt3 < 2048 && i15 <= i13 - 2) {
                        int i16 = i15 + 1;
                        bArr[i15] = (byte) ((charAt3 >>> 6) | 960);
                        i15 += 2;
                        bArr[i16] = (byte) ((charAt3 & '?') | 128);
                    } else if ((charAt3 < 55296 || 57343 < charAt3) && i15 <= i13 - 3) {
                        bArr[i15] = (byte) ((charAt3 >>> '\f') | 480);
                        int i17 = i15 + 2;
                        bArr[i15 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i15 += 3;
                        bArr[i17] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if (i15 <= i13 - 4) {
                            int i18 = i14 + 1;
                            if (i18 != str.length()) {
                                char charAt4 = str.charAt(i18);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i19 = i15 + 3;
                                    bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i15 += 4;
                                    bArr[i19] = (byte) ((codePoint & 63) | 128);
                                    i14 = i18;
                                } else {
                                    i14 = i18;
                                }
                            }
                            throw new Utf8$UnpairedSurrogateException(i14 - 1, length);
                        }
                        if (55296 <= charAt3 && charAt3 <= 57343 && ((i10 = i14 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i10)))) {
                            throw new Utf8$UnpairedSurrogateException(i14, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i15);
                    }
                    i14++;
                }
                return i15;
            default:
                long j10 = i4;
                long j11 = i5 + j10;
                int length2 = str.length();
                if (length2 <= i5 && bArr.length - i5 >= i4) {
                    int i20 = 0;
                    while (true) {
                        j5 = 1;
                        if (i20 < length2 && (charAt2 = str.charAt(i20)) < 128) {
                            D.juliet(bArr, j10, (byte) charAt2);
                            i20++;
                            j10 = 1 + j10;
                        }
                    }
                    if (i20 != length2) {
                        while (i20 < length2) {
                            char charAt5 = str.charAt(i20);
                            if (charAt5 < 128 && j10 < j11) {
                                D.juliet(bArr, j10, (byte) charAt5);
                                j7 = j11;
                                j6 = j5;
                                j10 += j5;
                            } else if (charAt5 < 2048 && j10 <= j11 - 2) {
                                j6 = j5;
                                long j12 = j10 + j6;
                                D.juliet(bArr, j10, (byte) ((charAt5 >>> 6) | 960));
                                j10 += 2;
                                D.juliet(bArr, j12, (byte) ((charAt5 & '?') | 128));
                                j7 = j11;
                            } else {
                                j6 = j5;
                                if ((charAt5 >= 55296 && 57343 >= charAt5) || j10 > j11 - 3) {
                                    j7 = j11;
                                    if (j10 <= j7 - 4) {
                                        int i21 = i20 + 1;
                                        if (i21 != length2) {
                                            char charAt6 = str.charAt(i21);
                                            if (Character.isSurrogatePair(charAt5, charAt6)) {
                                                int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                                D.juliet(bArr, j10, (byte) ((codePoint2 >>> 18) | 240));
                                                D.juliet(bArr, j10 + j6, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                long j13 = j10 + 3;
                                                D.juliet(bArr, j10 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                j10 += 4;
                                                D.juliet(bArr, j13, (byte) ((codePoint2 & 63) | 128));
                                                i20 = i21;
                                            } else {
                                                i20 = i21;
                                            }
                                        }
                                        throw new Utf8$UnpairedSurrogateException(i20 - 1, length2);
                                    }
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i12 = i20 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i12)))) {
                                        throw new Utf8$UnpairedSurrogateException(i20, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j10);
                                }
                                D.juliet(bArr, j10, (byte) ((charAt5 >>> '\f') | 480));
                                j7 = j11;
                                long j14 = j10 + 2;
                                D.juliet(bArr, j10 + j6, (byte) (((charAt5 >>> 6) & 63) | 128));
                                j10 += 3;
                                D.juliet(bArr, j14, (byte) ((charAt5 & '?') | 128));
                            }
                            i20++;
                            j5 = j6;
                            j11 = j7;
                        }
                    }
                    return (int) j10;
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i4 + i5));
        }
    }
}
