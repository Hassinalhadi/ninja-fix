package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1426u {
    public static int alpha(byte[] bArr, int i4, C1425t c1425t) {
        int juliet = juliet(bArr, i4, c1425t);
        int i5 = c1425t.alpha;
        if (i5 >= 0) {
            if (i5 <= bArr.length - juliet) {
                if (i5 == 0) {
                    c1425t.charlie = AbstractC1431z.purple;
                    return juliet;
                }
                c1425t.charlie = AbstractC1431z.victor(bArr, juliet, i5);
                return juliet + i5;
            }
            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static String bravo(AbstractC1431z abstractC1431z) {
        StringBuilder sb2 = new StringBuilder(abstractC1431z.hotel());
        for (int i4 = 0; i4 < abstractC1431z.hotel(); i4++) {
            byte alpha = abstractC1431z.alpha(i4);
            if (alpha != 34) {
                if (alpha != 39) {
                    if (alpha != 92) {
                        switch (alpha) {
                            case 7:
                                sb2.append("\\a");
                                break;
                            case 8:
                                sb2.append("\\b");
                                break;
                            case 9:
                                sb2.append("\\t");
                                break;
                            case 10:
                                sb2.append("\\n");
                                break;
                            case 11:
                                sb2.append("\\v");
                                break;
                            case 12:
                                sb2.append("\\f");
                                break;
                            case 13:
                                sb2.append("\\r");
                                break;
                            default:
                                if (alpha >= 32 && alpha <= 126) {
                                    sb2.append((char) alpha);
                                    break;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((alpha >>> 6) & 3) + 48));
                                    sb2.append((char) (((alpha >>> 3) & 7) + 48));
                                    sb2.append((char) ((alpha & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    public static int charlie(int i4) {
        return (i4 >>> 1) ^ (-(i4 & 1));
    }

    public static int delta(int i4, byte[] bArr) {
        int i5 = bArr[i4] & 255;
        int i10 = bArr[i4 + 1] & 255;
        int i11 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i10 << 8) | i5 | (i11 << 16);
    }

    public static int echo(M m4, byte[] bArr, int i4, int i5, C1425t c1425t) {
        Object alpha = m4.alpha();
        int oscar = oscar(alpha, m4, bArr, i4, i5, c1425t);
        m4.bravo(alpha);
        c1425t.charlie = alpha;
        return oscar;
    }

    public static boolean foxtrot(byte b2) {
        if (b2 > -65) {
            return true;
        }
        return false;
    }

    public static int golf(M m4, int i4, byte[] bArr, int i5, int i10, as asVar, C1425t c1425t) {
        int echo = echo(m4, bArr, i5, i10, c1425t);
        asVar.add(c1425t.charlie);
        while (echo < i10) {
            int juliet = juliet(bArr, echo, c1425t);
            if (i4 != c1425t.alpha) {
                break;
            }
            echo = echo(m4, bArr, juliet, i10, c1425t);
            asVar.add(c1425t.charlie);
        }
        return echo;
    }

    public static int hotel(byte[] bArr, int i4, as asVar, C1425t c1425t) {
        an anVar = (an) asVar;
        int juliet = juliet(bArr, i4, c1425t);
        int i5 = c1425t.alpha + juliet;
        while (juliet < i5) {
            juliet = juliet(bArr, juliet, c1425t);
            anVar.delta(c1425t.alpha);
        }
        if (juliet == i5) {
            return juliet;
        }
        throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int india(int i4, byte[] bArr, int i5, int i10, Q q4, C1425t c1425t) {
        if ((i4 >>> 3) != 0) {
            int i11 = i4 & 7;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 5) {
                                q4.charlie(i4, Integer.valueOf(delta(i5, bArr)));
                                return i5 + 4;
                            }
                            throw new zzer("Protocol message contained an invalid tag (zero).");
                        }
                        int i12 = (i4 & (-8)) | 4;
                        Q bravo = Q.bravo();
                        int i13 = c1425t.echo + 1;
                        c1425t.echo = i13;
                        if (i13 < 100) {
                            int i14 = 0;
                            while (true) {
                                if (i5 >= i10) {
                                    break;
                                }
                                int juliet = juliet(bArr, i5, c1425t);
                                int i15 = c1425t.alpha;
                                if (i15 == i12) {
                                    i14 = i15;
                                    i5 = juliet;
                                    break;
                                }
                                i5 = india(i15, bArr, juliet, i10, bravo, c1425t);
                                i14 = i15;
                            }
                            c1425t.echo--;
                            if (i5 <= i10 && i14 == i12) {
                                q4.charlie(i4, bravo);
                                return i5;
                            }
                            throw new zzer("Failed to parse the message.");
                        }
                        throw new zzer("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    int juliet2 = juliet(bArr, i5, c1425t);
                    int i16 = c1425t.alpha;
                    if (i16 >= 0) {
                        if (i16 <= bArr.length - juliet2) {
                            if (i16 == 0) {
                                q4.charlie(i4, AbstractC1431z.purple);
                            } else {
                                q4.charlie(i4, AbstractC1431z.victor(bArr, juliet2, i16));
                            }
                            return juliet2 + i16;
                        }
                        throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                q4.charlie(i4, Long.valueOf(quebec(i5, bArr)));
                return i5 + 8;
            }
            int mike = mike(bArr, i5, c1425t);
            q4.charlie(i4, Long.valueOf(c1425t.bravo));
            return mike;
        }
        throw new zzer("Protocol message contained an invalid tag (zero).");
    }

    public static int juliet(byte[] bArr, int i4, C1425t c1425t) {
        int i5 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c1425t.alpha = b2;
            return i5;
        }
        return kilo(b2, bArr, i5, c1425t);
    }

    public static int kilo(int i4, byte[] bArr, int i5, C1425t c1425t) {
        byte b2 = bArr[i5];
        int i10 = i5 + 1;
        int i11 = i4 & 127;
        if (b2 >= 0) {
            c1425t.alpha = i11 | (b2 << 7);
            return i10;
        }
        int i12 = i11 | ((b2 & Byte.MAX_VALUE) << 7);
        int i13 = i5 + 2;
        byte b4 = bArr[i10];
        if (b4 >= 0) {
            c1425t.alpha = i12 | (b4 << 14);
            return i13;
        }
        int i14 = i12 | ((b4 & Byte.MAX_VALUE) << 14);
        int i15 = i5 + 3;
        byte b6 = bArr[i13];
        if (b6 >= 0) {
            c1425t.alpha = i14 | (b6 << 21);
            return i15;
        }
        int i16 = i14 | ((b6 & Byte.MAX_VALUE) << 21);
        int i17 = i5 + 4;
        byte b10 = bArr[i15];
        if (b10 >= 0) {
            c1425t.alpha = i16 | (b10 << 28);
            return i17;
        }
        int i18 = i16 | ((b10 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] < 0) {
                i17 = i19;
            } else {
                c1425t.alpha = i18;
                return i19;
            }
        }
    }

    public static int lima(int i4, byte[] bArr, int i5, int i10, as asVar, C1425t c1425t) {
        an anVar = (an) asVar;
        int juliet = juliet(bArr, i5, c1425t);
        anVar.delta(c1425t.alpha);
        while (juliet < i10) {
            int juliet2 = juliet(bArr, juliet, c1425t);
            if (i4 != c1425t.alpha) {
                break;
            }
            juliet = juliet(bArr, juliet2, c1425t);
            anVar.delta(c1425t.alpha);
        }
        return juliet;
    }

    public static int mike(byte[] bArr, int i4, C1425t c1425t) {
        long j5 = bArr[i4];
        int i5 = i4 + 1;
        if (j5 >= 0) {
            c1425t.bravo = j5;
            return i5;
        }
        int i10 = i4 + 2;
        byte b2 = bArr[i5];
        long j6 = (j5 & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i11 = 7;
        while (b2 < 0) {
            int i12 = i10 + 1;
            i11 += 7;
            j6 |= (r10 & Byte.MAX_VALUE) << i11;
            b2 = bArr[i10];
            i10 = i12;
        }
        c1425t.bravo = j6;
        return i10;
    }

    public static int november(Object obj, M m4, byte[] bArr, int i4, int i5, int i10, C1425t c1425t) {
        E e = (E) m4;
        int i11 = c1425t.echo + 1;
        c1425t.echo = i11;
        if (i11 < 100) {
            int tango = e.tango(obj, bArr, i4, i5, i10, c1425t);
            c1425t.echo--;
            c1425t.charlie = obj;
            return tango;
        }
        throw new zzer("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static int oscar(Object obj, M m4, byte[] bArr, int i4, int i5, C1425t c1425t) {
        int i10 = i4 + 1;
        int i11 = bArr[i4];
        if (i11 < 0) {
            i10 = kilo(i11, bArr, i10, c1425t);
            i11 = c1425t.alpha;
        }
        int i12 = i10;
        if (i11 >= 0 && i11 <= i5 - i12) {
            int i13 = c1425t.echo + 1;
            c1425t.echo = i13;
            if (i13 < 100) {
                int i14 = i12 + i11;
                m4.echo(obj, bArr, i12, i14, c1425t);
                c1425t.echo--;
                c1425t.charlie = obj;
                return i14;
            }
            throw new zzer("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int papa(int i4, byte[] bArr, int i5, int i10, C1425t c1425t) {
        if ((i4 >>> 3) != 0) {
            int i11 = i4 & 7;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 5) {
                                return i5 + 4;
                            }
                            throw new zzer("Protocol message contained an invalid tag (zero).");
                        }
                        int i12 = (i4 & (-8)) | 4;
                        int i13 = 0;
                        while (i5 < i10) {
                            i5 = juliet(bArr, i5, c1425t);
                            i13 = c1425t.alpha;
                            if (i13 == i12) {
                                break;
                            }
                            i5 = papa(i13, bArr, i5, i10, c1425t);
                        }
                        if (i5 <= i10 && i13 == i12) {
                            return i5;
                        }
                        throw new zzer("Failed to parse the message.");
                    }
                    return juliet(bArr, i5, c1425t) + c1425t.alpha;
                }
                return i5 + 8;
            }
            return mike(bArr, i5, c1425t);
        }
        throw new zzer("Protocol message contained an invalid tag (zero).");
    }

    public static long quebec(int i4, byte[] bArr) {
        return (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48) | ((bArr[i4 + 7] & 255) << 56);
    }
}
