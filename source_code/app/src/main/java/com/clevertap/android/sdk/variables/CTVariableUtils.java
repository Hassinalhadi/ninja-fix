package com.clevertap.android.sdk.variables;

import ao.ad;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class CTVariableUtils {
    public static final String BOOLEAN = "boolean";
    public static final String DICTIONARY = "group";
    public static final String FILE = "file";
    public static final String NUMBER = "number";
    public static final String STRING = "string";
    public static final String VARS = "vars";

    public static Map<String, Object> convertFlatMapToNestedMaps(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.contains(".")) {
                String[] nameComponents = getNameComponents(key);
                int length = nameComponents.length - 1;
                Map map2 = hashMap;
                for (int i4 = 0; i4 < nameComponents.length; i4++) {
                    String str = nameComponents[i4];
                    if (i4 == length) {
                        map2.put(str, entry.getValue());
                    } else if (!(map2.get(str) instanceof Map)) {
                        HashMap hashMap2 = new HashMap();
                        map2.put(str, hashMap2);
                        map2 = hashMap2;
                    } else {
                        map2 = (Map) JsonUtil.uncheckedCast(map2.get(str));
                    }
                }
            } else {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    public static void convertNestedMapsToFlatMap(String str, Map<String, Object> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                convertNestedMapsToFlatMap(ad.amber(str, key, "."), (Map) JsonUtil.uncheckedCast(value), map2);
            } else {
                map2.put(str + key, value);
            }
        }
    }

    public static Map<Object, Object> deepCopyMap(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                hashMap.put(key, deepCopyMap((Map) JsonUtil.uncheckedCast(value)));
            } else {
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    public static JSONObject getFlatVarsJson(Map<String, Object> map, Map<String, String> map2) {
        String kindFromValue;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.KEY_TYPE, Constants.variablePayloadType);
            JSONObject jSONObject2 = new JSONObject();
            for (String str : map.keySet()) {
                String str2 = map2.get(str);
                Object obj = map.get(str);
                if (obj instanceof Map) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(str, obj);
                    HashMap hashMap2 = new HashMap();
                    convertNestedMapsToFlatMap("", hashMap, hashMap2);
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        String str3 = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (FILE.equals(map2.get(str3))) {
                            kindFromValue = FILE;
                        } else {
                            kindFromValue = kindFromValue(value);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(Constants.KEY_TYPE, kindFromValue);
                        jSONObject3.put("defaultValue", value);
                        jSONObject2.put(str3, jSONObject3);
                    }
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(Constants.KEY_TYPE, str2);
                    jSONObject4.put("defaultValue", obj);
                    jSONObject2.put(str, jSONObject4);
                }
            }
            jSONObject.put("vars", jSONObject2);
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            return new JSONObject();
        }
    }

    public static String[] getNameComponents(String str) {
        try {
            return str.split("\\.");
        } catch (Throwable th) {
            th.printStackTrace();
            return new String[0];
        }
    }

    public static <T> String kindFromValue(T t5) {
        if ((t5 instanceof Integer) || (t5 instanceof Long) || (t5 instanceof Short) || (t5 instanceof Character) || (t5 instanceof Byte) || (t5 instanceof BigInteger) || (t5 instanceof Float) || (t5 instanceof Double) || (t5 instanceof BigDecimal)) {
            return NUMBER;
        }
        if (t5 instanceof String) {
            return STRING;
        }
        if (t5 instanceof Map) {
            return DICTIONARY;
        }
        if (t5 instanceof Boolean) {
            return BOOLEAN;
        }
        return null;
    }

    private static void log(String str) {
        Logger.d("variables", str);
    }

    public static Object mergeHelper(Object obj, Object obj2) {
        Iterable iterable;
        Iterable iterable2;
        Map map;
        Map map2;
        Object obj3;
        Object obj4;
        if (obj2 == null) {
            return obj;
        }
        if (!(obj2 instanceof Number) && !(obj2 instanceof Boolean) && !(obj2 instanceof String) && !(obj2 instanceof Character) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof String)) {
            if (obj instanceof Character) {
                return obj2;
            }
            boolean z2 = obj2 instanceof Map;
            if (z2) {
                iterable = ((Map) obj2).keySet();
            } else {
                iterable = (Iterable) obj2;
            }
            boolean z10 = obj instanceof Map;
            if (z10) {
                iterable2 = ((Map) obj).keySet();
            } else {
                iterable2 = (Iterable) obj;
            }
            if (z2) {
                map = (Map) obj2;
            } else {
                map = null;
            }
            if (z10) {
                map2 = (Map) obj;
            } else {
                map2 = null;
            }
            if (!z10 && !z2) {
                return null;
            }
            HashMap hashMap = new HashMap();
            if (iterable2 != null) {
                for (Object obj5 : iterable2) {
                    if (map != null && map2 != null) {
                        Object obj6 = map.get(obj5);
                        Object obj7 = map2.get(obj5);
                        if (obj6 == null && obj7 != null) {
                            hashMap.put(obj5, obj7);
                        }
                    }
                }
            }
            for (Object obj8 : iterable) {
                if (map != null) {
                    obj3 = map.get(obj8);
                } else {
                    obj3 = null;
                }
                if (map2 != null) {
                    obj4 = map2.get(obj8);
                } else {
                    obj4 = null;
                }
                hashMap.put(obj8, mergeHelper(obj4, obj3));
            }
            return hashMap;
        }
        return obj2;
    }

    public static Object traverse(Object obj, Object obj2, boolean z2) {
        Object obj3 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            Map map = (Map) JsonUtil.uncheckedCast(obj);
            obj3 = map.get(obj2);
            if (z2 && obj3 == null && (obj2 instanceof String)) {
                HashMap hashMap = new HashMap();
                map.put(obj2, hashMap);
                return hashMap;
            }
        }
        return obj3;
    }

    public static void updateValuesAndKinds(String str, String[] strArr, Object obj, String str2, Map<String, Object> map, Map<String, String> map2) {
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            Object obj2 = map;
            while (i4 < strArr.length - 1) {
                Object traverse = traverse(obj2, strArr[i4], true);
                i4++;
                obj2 = traverse;
            }
            if (obj2 instanceof Map) {
                Map map3 = (Map) JsonUtil.uncheckedCast(obj2);
                Object obj3 = map3.get(strArr[strArr.length - 1]);
                if ((obj3 instanceof Map) && (obj instanceof Map)) {
                    obj = mergeHelper(obj, obj3);
                } else if (obj3 != null && obj3.equals(obj)) {
                    log(String.format("Variable with name %s will override value: %s, with new value: %s.", str, obj3, obj));
                }
                map3.put(strArr[strArr.length - 1], obj);
            }
        }
        if (map2 != null) {
            map2.put(str, str2);
        }
    }
}
