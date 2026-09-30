package t6;

import androidx.datastore.preferences.protobuf.C0599f;

/* loaded from: classes2.dex */
public abstract class C3 {
    public static String alpha(C0599f c0599f) {
        StringBuilder sb2 = new StringBuilder(c0599f.size());
        for (int i4 = 0; i4 < c0599f.size(); i4++) {
            byte alpha = c0599f.alpha(i4);
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

    public static byte bravo(Boolean bool) {
        if (bool != null) {
            if (!bool.booleanValue()) {
                return (byte) 0;
            }
            return (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean charlie(byte b2) {
        if (b2 != 0) {
            if (b2 != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
