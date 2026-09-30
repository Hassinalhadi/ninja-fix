package com.google.crypto.tink.shaded.protobuf;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public abstract class ap {
    public static void alpha(byte b2, byte b4, byte b6, byte b10, char[] cArr, int i4) {
        if (!uniform(b4)) {
            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !uniform(b6) && !uniform(b10)) {
                int i5 = ((b2 & 7) << 18) | ((b4 & 63) << 12) | ((b6 & 63) << 6) | (b10 & 63);
                cArr[i4] = (char) ((i5 >>> 10) + 55232);
                cArr[i4 + 1] = (char) ((i5 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static void bravo(byte b2, byte b4, char[] cArr, int i4) {
        if (b2 >= -62 && !uniform(b4)) {
            cArr[i4] = (char) (((b2 & 31) << 6) | (b4 & 63));
            return;
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static void charlie(byte b2, byte b4, byte b6, char[] cArr, int i4) {
        if (!uniform(b4) && ((b2 != -32 || b4 >= -96) && ((b2 != -19 || b4 < -96) && !uniform(b6)))) {
            cArr[i4] = (char) (((b2 & 15) << 12) | ((b4 & 63) << 6) | (b6 & 63));
            return;
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static final String delta(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    public static int echo(byte[] bArr, int i4, C5.b bVar) {
        int papa = papa(bArr, i4, bVar);
        int i5 = bVar.alpha;
        if (i5 >= 0) {
            if (i5 <= bArr.length - papa) {
                if (i5 == 0) {
                    bVar.charlie = AbstractC1490h.purple;
                    return papa;
                }
                bVar.charlie = AbstractC1490h.delta(bArr, papa, i5);
                return papa + i5;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public static int foxtrot(int i4, byte[] bArr) {
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    public static long golf(int i4, byte[] bArr) {
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    public static int hotel(A a6, byte[] bArr, int i4, int i5, int i10, C5.b bVar) {
        aq aqVar = (aq) a6;
        Object charlie = aqVar.charlie();
        int bronze = aqVar.bronze(charlie, bArr, i4, i5, i10, bVar);
        aqVar.alpha(charlie);
        bVar.charlie = charlie;
        return bronze;
    }

    public static int india(A a6, byte[] bArr, int i4, int i5, C5.b bVar) {
        int i10 = i4 + 1;
        int i11 = bArr[i4];
        if (i11 < 0) {
            i10 = oscar(i11, bArr, i10, bVar);
            i11 = bVar.alpha;
        }
        int i12 = i10;
        if (i11 >= 0 && i11 <= i5 - i12) {
            Object charlie = a6.charlie();
            int i13 = i12 + i11;
            a6.delta(charlie, bArr, i12, i13, bVar);
            a6.alpha(charlie);
            bVar.charlie = charlie;
            return i13;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int juliet(A a6, int i4, byte[] bArr, int i5, int i10, aa aaVar, C5.b bVar) {
        int india = india(a6, bArr, i5, i10, bVar);
        aaVar.add(bVar.charlie);
        while (india < i10) {
            int papa = papa(bArr, india, bVar);
            if (i4 != bVar.alpha) {
                break;
            }
            india = india(a6, bArr, papa, i10, bVar);
            aaVar.add(bVar.charlie);
        }
        return india;
    }

    public static int kilo(byte[] bArr, int i4, C5.b bVar) {
        int papa = papa(bArr, i4, bVar);
        int i5 = bVar.alpha;
        if (i5 >= 0) {
            if (i5 == 0) {
                bVar.charlie = "";
                return papa;
            }
            bVar.charlie = new String(bArr, papa, i5, ab.alpha);
            return papa + i5;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public static int lima(byte[] bArr, int i4, C5.b bVar) {
        int papa = papa(bArr, i4, bVar);
        int i5 = bVar.alpha;
        if (i5 >= 0) {
            if (i5 == 0) {
                bVar.charlie = "";
                return papa;
            }
            bVar.charlie = O.alpha.november(bArr, papa, i5);
            return papa + i5;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public static int mike(int i4, byte[] bArr, int i5, int i10, D d4, C5.b bVar) {
        if ((i4 >>> 3) != 0) {
            int i11 = i4 & 7;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 5) {
                                d4.charlie(i4, Integer.valueOf(foxtrot(i5, bArr)));
                                return i5 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        D bravo = D.bravo();
                        int i12 = (i4 & (-8)) | 4;
                        int i13 = 0;
                        while (true) {
                            if (i5 >= i10) {
                                break;
                            }
                            int papa = papa(bArr, i5, bVar);
                            i13 = bVar.alpha;
                            if (i13 == i12) {
                                i5 = papa;
                                break;
                            }
                            i5 = mike(i13, bArr, papa, i10, bravo, bVar);
                        }
                        if (i5 <= i10 && i13 == i12) {
                            d4.charlie(i4, bravo);
                            return i5;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    int papa2 = papa(bArr, i5, bVar);
                    int i14 = bVar.alpha;
                    if (i14 >= 0) {
                        if (i14 <= bArr.length - papa2) {
                            if (i14 == 0) {
                                d4.charlie(i4, AbstractC1490h.purple);
                            } else {
                                d4.charlie(i4, AbstractC1490h.delta(bArr, papa2, i14));
                            }
                            return papa2 + i14;
                        }
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    throw InvalidProtocolBufferException.negativeSize();
                }
                d4.charlie(i4, Long.valueOf(golf(i5, bArr)));
                return i5 + 8;
            }
            int romeo = romeo(bArr, i5, bVar);
            d4.charlie(i4, Long.valueOf(bVar.bravo));
            return romeo;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public static int oscar(int i4, byte[] bArr, int i5, C5.b bVar) {
        int i10 = i4 & 127;
        int i11 = i5 + 1;
        byte b2 = bArr[i5];
        if (b2 >= 0) {
            bVar.alpha = i10 | (b2 << 7);
            return i11;
        }
        int i12 = i10 | ((b2 & Byte.MAX_VALUE) << 7);
        int i13 = i5 + 2;
        byte b4 = bArr[i11];
        if (b4 >= 0) {
            bVar.alpha = i12 | (b4 << 14);
            return i13;
        }
        int i14 = i12 | ((b4 & Byte.MAX_VALUE) << 14);
        int i15 = i5 + 3;
        byte b6 = bArr[i13];
        if (b6 >= 0) {
            bVar.alpha = i14 | (b6 << 21);
            return i15;
        }
        int i16 = i14 | ((b6 & Byte.MAX_VALUE) << 21);
        int i17 = i5 + 4;
        byte b10 = bArr[i15];
        if (b10 >= 0) {
            bVar.alpha = i16 | (b10 << 28);
            return i17;
        }
        int i18 = i16 | ((b10 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] < 0) {
                i17 = i19;
            } else {
                bVar.alpha = i18;
                return i19;
            }
        }
    }

    public static int papa(byte[] bArr, int i4, C5.b bVar) {
        int i5 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            bVar.alpha = b2;
            return i5;
        }
        return oscar(b2, bArr, i5, bVar);
    }

    public static int quebec(int i4, byte[] bArr, int i5, int i10, aa aaVar, C5.b bVar) {
        y yVar = (y) aaVar;
        int papa = papa(bArr, i5, bVar);
        yVar.bravo(bVar.alpha);
        while (papa < i10) {
            int papa2 = papa(bArr, papa, bVar);
            if (i4 != bVar.alpha) {
                break;
            }
            papa = papa(bArr, papa2, bVar);
            yVar.bravo(bVar.alpha);
        }
        return papa;
    }

    public static int romeo(byte[] bArr, int i4, C5.b bVar) {
        int i5 = i4 + 1;
        long j5 = bArr[i4];
        if (j5 >= 0) {
            bVar.bravo = j5;
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
        bVar.bravo = j6;
        return i10;
    }

    public static String tango(AbstractC1490h abstractC1490h) {
        StringBuilder sb2 = new StringBuilder(abstractC1490h.size());
        for (int i4 = 0; i4 < abstractC1490h.size(); i4++) {
            byte alpha = abstractC1490h.alpha(i4);
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

    public static boolean uniform(byte b2) {
        if (b2 > -65) {
            return true;
        }
        return false;
    }

    public static final void xray(StringBuilder sb2, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                xray(sb2, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                xray(sb2, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i5 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            C1489g c1489g = AbstractC1490h.purple;
            sb2.append(tango(new C1489g(((String) obj).getBytes(ab.alpha))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC1490h) {
            sb2.append(": \"");
            sb2.append(tango((AbstractC1490h) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof x) {
            sb2.append(" {");
            yankee((x) obj, sb2, i4 + 2);
            sb2.append("\n");
            while (i5 < i4) {
                sb2.append(' ');
                i5++;
            }
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i11 = i4 + 2;
            xray(sb2, i11, Constants.KEY_KEY, entry.getKey());
            xray(sb2, i11, "value", entry.getValue());
            sb2.append("\n");
            while (i5 < i4) {
                sb2.append(' ');
                i5++;
            }
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ad, code lost:
    
        if (((java.lang.Integer) r4).intValue() == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01af, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c1, code lost:
    
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d3, code lost:
    
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void yankee(x xVar, StringBuilder sb2, int i4) {
        String str;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : xVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.startsWith("get")) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            boolean z2 = true;
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String str3 = str.substring(0, 1).toLowerCase() + str.substring(1, str.length() - 4);
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    xray(sb2, i4, delta(str3), x.golf(method2, xVar, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String str4 = str.substring(0, 1).toLowerCase() + str.substring(1, str.length() - 3);
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    xray(sb2, i4, delta(str4), x.golf(method3, xVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(str))) != null) {
                if (str.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + str.substring(0, str.length() - 5))) {
                    }
                }
                String str5 = str.substring(0, 1).toLowerCase() + str.substring(1);
                Method method4 = (Method) hashMap.get("get".concat(str));
                Method method5 = (Method) hashMap.get("has".concat(str));
                if (method4 != null) {
                    Object golf = x.golf(method4, xVar, new Object[0]);
                    if (method5 == null) {
                        if (golf instanceof Boolean) {
                            equals = !((Boolean) golf).booleanValue();
                        } else if (!(golf instanceof Integer)) {
                            if (!(golf instanceof Float)) {
                                if (!(golf instanceof Double)) {
                                    if (golf instanceof String) {
                                        equals = golf.equals("");
                                    } else if (golf instanceof AbstractC1490h) {
                                        equals = golf.equals(AbstractC1490h.purple);
                                    } else {
                                        equals = !(golf instanceof ao) ? false : false;
                                    }
                                }
                            }
                        }
                        if (equals) {
                            z2 = false;
                        }
                    } else {
                        z2 = ((Boolean) x.golf(method5, xVar, new Object[0])).booleanValue();
                    }
                    if (z2) {
                        xray(sb2, i4, delta(str5), golf);
                    }
                }
            }
        }
        D d4 = xVar.unknownFields;
        if (d4 != null) {
            for (int i5 = 0; i5 < d4.alpha; i5++) {
                xray(sb2, i4, String.valueOf(d4.bravo[i5] >>> 3), d4.charlie[i5]);
            }
        }
    }

    public abstract String november(byte[] bArr, int i4, int i5);

    public abstract int sierra(String str, byte[] bArr, int i4, int i5);

    public boolean victor(byte[] bArr, int i4, int i5) {
        if (whiskey(bArr, i4, i5) == 0) {
            return true;
        }
        return false;
    }

    public abstract int whiskey(byte[] bArr, int i4, int i5);
}
