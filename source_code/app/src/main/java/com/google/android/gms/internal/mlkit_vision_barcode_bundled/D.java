package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
public abstract class D {
    public static final char[] alpha;

    static {
        char[] cArr = new char[80];
        alpha = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void alpha(StringBuilder sb2, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                alpha(sb2, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                alpha(sb2, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        bravo(i4, sb2);
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
            sb2.append(AbstractC1426u.bravo(new C1430y(((String) obj).getBytes(at.alpha))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC1431z) {
            sb2.append(": \"");
            sb2.append(AbstractC1426u.bravo((AbstractC1431z) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof am) {
            sb2.append(" {");
            charlie((am) obj, sb2, i4 + 2);
            sb2.append("\n");
            bravo(i4, sb2);
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            int i10 = i4 + 2;
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            alpha(sb2, i10, Constants.KEY_KEY, entry.getKey());
            alpha(sb2, i10, "value", entry.getValue());
            sb2.append("\n");
            bravo(i4, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    public static void bravo(int i4, StringBuilder sb2) {
        while (i4 > 0) {
            int i5 = 80;
            if (i4 <= 80) {
                i5 = i4;
            }
            sb2.append(alpha, 0, i5);
            i4 -= i5;
        }
    }

    public static void charlie(am amVar, StringBuilder sb2, int i4) {
        int i5;
        int i10;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = amVar.getClass().getDeclaredMethods();
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
                    alpha(sb2, i4, substring.substring(0, substring.length() - 4), am.foxtrot(method2, amVar, new Object[0]));
                    i5 = i10;
                }
            } else {
                i10 = i5;
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                alpha(sb2, i4, substring.substring(0, substring.length() - 3), am.foxtrot(method, amVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object foxtrot = am.foxtrot(method4, amVar, new Object[0]);
                    if (method5 == null) {
                        if (foxtrot instanceof Boolean) {
                            if (!((Boolean) foxtrot).booleanValue()) {
                            }
                            alpha(sb2, i4, substring, foxtrot);
                        } else if (foxtrot instanceof Integer) {
                            if (((Integer) foxtrot).intValue() == 0) {
                            }
                            alpha(sb2, i4, substring, foxtrot);
                        } else if (foxtrot instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) foxtrot).floatValue()) == 0) {
                            }
                            alpha(sb2, i4, substring, foxtrot);
                        } else if (foxtrot instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) foxtrot).doubleValue()) == 0) {
                            }
                            alpha(sb2, i4, substring, foxtrot);
                        } else {
                            if (foxtrot instanceof String) {
                                equals = foxtrot.equals("");
                            } else if (foxtrot instanceof AbstractC1431z) {
                                equals = foxtrot.equals(AbstractC1431z.purple);
                            } else if (foxtrot instanceof B) {
                                if (foxtrot == ((am) ((am) ((B) foxtrot)).mike(6, null))) {
                                }
                                alpha(sb2, i4, substring, foxtrot);
                            } else {
                                if ((foxtrot instanceof Enum) && ((Enum) foxtrot).ordinal() == 0) {
                                }
                                alpha(sb2, i4, substring, foxtrot);
                            }
                            if (equals) {
                            }
                            alpha(sb2, i4, substring, foxtrot);
                        }
                    } else {
                        if (!((Boolean) am.foxtrot(method5, amVar, new Object[0])).booleanValue()) {
                        }
                        alpha(sb2, i4, substring, foxtrot);
                    }
                }
            }
            i5 = i10;
        }
        if (amVar instanceof aj) {
            Iterator charlie = ((aj) amVar).zzb.charlie();
            while (charlie.hasNext()) {
                Map.Entry entry2 = (Map.Entry) charlie.next();
                ((ak) entry2.getKey()).getClass();
                alpha(sb2, i4, av.q.delta(0, Constants.AES_PREFIX, Constants.AES_SUFFIX), entry2.getValue());
            }
        }
        Q q4 = amVar.zzc;
        if (q4 != null) {
            for (int i12 = 0; i12 < q4.alpha; i12++) {
                alpha(sb2, i4, String.valueOf(q4.bravo[i12] >>> 3), q4.charlie[i12]);
            }
        }
    }
}
