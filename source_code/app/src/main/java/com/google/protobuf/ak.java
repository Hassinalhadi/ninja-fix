package com.google.protobuf;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class ak {
    public static final char[] alpha;

    static {
        char[] cArr = new char[80];
        alpha = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void alpha(int i4, StringBuilder sb2) {
        while (i4 > 0) {
            int i5 = 80;
            if (i4 <= 80) {
                i5 = i4;
            }
            sb2.append(alpha, 0, i5);
            i4 -= i5;
        }
    }

    public static void bravo(StringBuilder sb2, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                bravo(sb2, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                bravo(sb2, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        alpha(i4, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i5 = 1; i5 < str.length(); i5++) {
                char charAt = str.charAt(i5);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            C1502e c1502e = C1502e.red;
            sb2.append(az.bravo(new C1502e(((String) obj).getBytes(AbstractC1517u.alpha))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof C1502e) {
            sb2.append(": \"");
            sb2.append(az.bravo((C1502e) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC1513p) {
            sb2.append(" {");
            charlie((AbstractC1513p) obj, sb2, i4 + 2);
            sb2.append("\n");
            alpha(i4, sb2);
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i10 = i4 + 2;
            bravo(sb2, i10, Constants.KEY_KEY, entry.getKey());
            bravo(sb2, i10, "value", entry.getValue());
            sb2.append("\n");
            alpha(i4, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x019a, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019c, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01af, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c5, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void charlie(AbstractC1513p abstractC1513p, StringBuilder sb2, int i4) {
        int i5;
        int i10;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC1513p.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            i5 = 3;
            if (i11 >= length) {
                break;
            }
            Method method3 = declaredMethods[i11];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i11++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i5);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null) {
                i10 = i5;
                if (method2.getReturnType().equals(List.class)) {
                    bravo(sb2, i4, substring.substring(0, substring.length() - 4), AbstractC1513p.lima(method2, abstractC1513p, new Object[0]));
                    i5 = i10;
                }
            } else {
                i10 = i5;
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                bravo(sb2, i4, substring.substring(0, substring.length() - 3), AbstractC1513p.lima(method, abstractC1513p, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object lima = AbstractC1513p.lima(method4, abstractC1513p, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (lima instanceof Boolean) {
                            equals = !((Boolean) lima).booleanValue();
                        } else if (!(lima instanceof Integer)) {
                            if (!(lima instanceof Float)) {
                                if (!(lima instanceof Double)) {
                                    if (lima instanceof String) {
                                        equals = lima.equals("");
                                    } else if (lima instanceof C1502e) {
                                        equals = lima.equals(C1502e.red);
                                    } else {
                                        equals = !(lima instanceof aj) ? false : false;
                                    }
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) AbstractC1513p.lima(method5, abstractC1513p, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        bravo(sb2, i4, substring, lima);
                    }
                }
            }
            i5 = i10;
        }
        C c3 = abstractC1513p.unknownFields;
        if (c3 != null) {
            for (int i12 = 0; i12 < c3.alpha; i12++) {
                bravo(sb2, i4, String.valueOf(c3.bravo[i12] >>> 3), c3.charlie[i12]);
            }
        }
    }
}
