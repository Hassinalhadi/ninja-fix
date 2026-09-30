package androidx.datastore.preferences.protobuf;

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
import t6.C3;

/* loaded from: classes3.dex */
public abstract class ai {
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
            C0599f c0599f = C0599f.red;
            sb2.append(C3.alpha(new C0599f(((String) obj).getBytes(u.alpha))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof C0599f) {
            sb2.append(": \"");
            sb2.append(C3.alpha((C0599f) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof s) {
            sb2.append(" {");
            charlie((s) obj, sb2, i4 + 2);
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
    public static void charlie(s sVar, StringBuilder sb2, int i4) {
        int i5;
        int i10;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = sVar.getClass().getDeclaredMethods();
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
                    bravo(sb2, i4, substring.substring(0, substring.length() - 4), s.delta(method2, sVar, new Object[0]));
                    i5 = i10;
                }
            } else {
                i10 = i5;
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                bravo(sb2, i4, substring.substring(0, substring.length() - 3), s.delta(method, sVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object delta = s.delta(method4, sVar, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (delta instanceof Boolean) {
                            equals = !((Boolean) delta).booleanValue();
                        } else if (!(delta instanceof Integer)) {
                            if (!(delta instanceof Float)) {
                                if (!(delta instanceof Double)) {
                                    if (delta instanceof String) {
                                        equals = delta.equals("");
                                    } else if (delta instanceof C0599f) {
                                        equals = delta.equals(C0599f.red);
                                    } else {
                                        equals = !(delta instanceof ah) ? false : false;
                                    }
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) s.delta(method5, sVar, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        bravo(sb2, i4, substring, delta);
                    }
                }
            }
            i5 = i10;
        }
        ax axVar = sVar.unknownFields;
        if (axVar != null) {
            for (int i12 = 0; i12 < axVar.alpha; i12++) {
                bravo(sb2, i4, String.valueOf(axVar.bravo[i12] >>> 3), axVar.charlie[i12]);
            }
        }
    }
}
