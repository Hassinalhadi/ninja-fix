package com.google.protobuf;

/* loaded from: classes2.dex */
public abstract class az {
    public static final ax alpha = new Object();
    public static final ay bravo = new Object();

    public static String bravo(C1502e c1502e) {
        StringBuilder sb2 = new StringBuilder(c1502e.size());
        for (int i4 = 0; i4 < c1502e.size(); i4++) {
            byte alpha2 = c1502e.alpha(i4);
            if (alpha2 != 34) {
                if (alpha2 != 39) {
                    if (alpha2 != 92) {
                        switch (alpha2) {
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
                                if (alpha2 >= 32 && alpha2 <= 126) {
                                    sb2.append((char) alpha2);
                                    break;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((alpha2 >>> 6) & 3) + 48));
                                    sb2.append((char) (((alpha2 >>> 3) & 7) + 48));
                                    sb2.append((char) ((alpha2 & 7) + 48));
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

    public abstract int alpha(String str, byte[] bArr, int i4, int i5);

    public abstract int charlie(byte[] bArr, int i4, int i5);
}
