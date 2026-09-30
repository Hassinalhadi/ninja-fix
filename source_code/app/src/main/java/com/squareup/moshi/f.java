package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.internal.Util;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class f implements JsonAdapter.Factory {
    public final ArrayList alpha;
    public final ArrayList bravo;

    public f(ArrayList arrayList, ArrayList arrayList2) {
        this.alpha = arrayList;
        this.bravo = arrayList2;
    }

    public static e alpha(ArrayList arrayList, Type type, Set set) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = (e) arrayList.get(i4);
            if (Types.equals(eVar.alpha, type) && eVar.bravo.equals(set)) {
                return eVar;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f bravo(Object obj) {
        Class<?> cls;
        Object obj2;
        Type type;
        ?? r22;
        String str;
        String str2;
        Class cls2;
        char c3;
        int i4;
        Class cls3;
        e eVar;
        e alpha;
        String str3;
        e eVar2;
        boolean z2;
        e alpha2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Class<?> cls4 = obj.getClass();
        while (cls4 != Object.class) {
            Method[] declaredMethods = cls4.getDeclaredMethods();
            int length = declaredMethods.length;
            int i5 = 0;
            Object[] objArr = declaredMethods;
            while (i5 < length) {
                Method method = objArr[i5];
                boolean isAnnotationPresent = method.isAnnotationPresent(ToJson.class);
                Class cls5 = Void.TYPE;
                if (isAnnotationPresent) {
                    method.setAccessible(true);
                    Type genericReturnType = method.getGenericReturnType();
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    c3 = 0;
                    if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == JsonWriter.class && genericReturnType == cls5) {
                        int length2 = genericParameterTypes.length;
                        int i10 = 2;
                        Object obj3 = objArr;
                        while (i10 < length2) {
                            cls = cls4;
                            Type type2 = genericParameterTypes[i10];
                            obj2 = obj3;
                            if ((type2 instanceof ParameterizedType) && ((ParameterizedType) type2).getRawType() == JsonAdapter.class) {
                                i10++;
                                cls4 = cls;
                                obj3 = obj2;
                            }
                        }
                        cls = cls4;
                        obj2 = obj3;
                        str3 = "Unexpected signature for ";
                        str = "\n    ";
                        type = JsonAdapter.class;
                        z2 = true;
                        eVar2 = new b(genericParameterTypes[1], Util.jsonAnnotations(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true, 0);
                        cls2 = cls5;
                        alpha2 = alpha(arrayList, eVar2.alpha, eVar2.bravo);
                        if (alpha2 != null) {
                            arrayList.add(eVar2);
                            str2 = str3;
                            r22 = z2;
                        } else {
                            throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + alpha2.delta + str + eVar2.delta);
                        }
                    } else {
                        cls = cls4;
                        obj2 = objArr;
                    }
                    type = JsonAdapter.class;
                    str = "\n    ";
                    str3 = "Unexpected signature for ";
                    z2 = true;
                    if (genericParameterTypes.length == 1 && genericReturnType != cls5) {
                        Set<? extends Annotation> jsonAnnotations = Util.jsonAnnotations(method);
                        Set<? extends Annotation> jsonAnnotations2 = Util.jsonAnnotations(parameterAnnotations[0]);
                        cls2 = cls5;
                        eVar2 = new c(genericParameterTypes[0], jsonAnnotations2, obj, method, genericParameterTypes.length, Util.hasNullable(parameterAnnotations[0]), genericParameterTypes, genericReturnType, jsonAnnotations2, jsonAnnotations);
                        alpha2 = alpha(arrayList, eVar2.alpha, eVar2.bravo);
                        if (alpha2 != null) {
                        }
                    } else {
                        throw new IllegalArgumentException(str3 + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
                    }
                } else {
                    cls = cls4;
                    obj2 = objArr;
                    type = JsonAdapter.class;
                    r22 = 1;
                    str = "\n    ";
                    str2 = "Unexpected signature for ";
                    cls2 = cls5;
                    c3 = 0;
                }
                if (method.isAnnotationPresent(FromJson.class)) {
                    method.setAccessible(r22);
                    Type genericReturnType2 = method.getGenericReturnType();
                    Set<? extends Annotation> jsonAnnotations3 = Util.jsonAnnotations(method);
                    Type[] genericParameterTypes2 = method.getGenericParameterTypes();
                    Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
                    if (genericParameterTypes2.length >= r22 && genericParameterTypes2[c3] == JsonReader.class) {
                        cls3 = cls2;
                        if (genericReturnType2 != cls3) {
                            int length3 = genericParameterTypes2.length;
                            int i11 = r22;
                            while (i11 < length3) {
                                Type type3 = genericParameterTypes2[i11];
                                i4 = length;
                                if ((type3 instanceof ParameterizedType) && ((ParameterizedType) type3).getRawType() == type) {
                                    i11++;
                                    length = i4;
                                }
                            }
                            i4 = length;
                            eVar = new b(genericReturnType2, jsonAnnotations3, obj, method, genericParameterTypes2.length, 1, true, 1);
                            alpha = alpha(arrayList2, eVar.alpha, eVar.bravo);
                            if (alpha != null) {
                                arrayList2.add(eVar);
                            } else {
                                throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + alpha.delta + str + eVar.delta);
                            }
                        } else {
                            i4 = length;
                        }
                    } else {
                        i4 = length;
                        cls3 = cls2;
                    }
                    if (genericParameterTypes2.length == 1 && genericReturnType2 != cls3) {
                        eVar = new d(genericReturnType2, jsonAnnotations3, obj, method, genericParameterTypes2.length, Util.hasNullable(parameterAnnotations2[c3]), genericParameterTypes2, genericReturnType2, Util.jsonAnnotations(parameterAnnotations2[c3]), jsonAnnotations3);
                        alpha = alpha(arrayList2, eVar.alpha, eVar.bravo);
                        if (alpha != null) {
                        }
                    } else {
                        throw new IllegalArgumentException(str2 + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
                    }
                } else {
                    i4 = length;
                }
                i5++;
                cls4 = cls;
                objArr = obj2;
                length = i4;
            }
            cls4 = cls4.getSuperclass();
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on ".concat(obj.getClass().getName()));
        }
        return new f(arrayList, arrayList2);
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        String str;
        e alpha = alpha(this.alpha, type, set);
        e alpha2 = alpha(this.bravo, type, set);
        JsonAdapter jsonAdapter = null;
        if (alpha == null && alpha2 == null) {
            return null;
        }
        if (alpha == null || alpha2 == null) {
            try {
                jsonAdapter = moshi.nextAdapter(this, type, set);
            } catch (IllegalArgumentException e) {
                if (alpha == null) {
                    str = "@ToJson";
                } else {
                    str = "@FromJson";
                }
                StringBuilder victor = Q0.c.victor("No ", str, " adapter for ");
                victor.append(Util.typeAnnotatedWithAnnotations(type, set));
                throw new IllegalArgumentException(victor.toString(), e);
            }
        }
        JsonAdapter jsonAdapter2 = jsonAdapter;
        if (alpha != null) {
            alpha.alpha(moshi, this);
        }
        if (alpha2 != null) {
            alpha2.alpha(moshi, this);
        }
        return new a(alpha, jsonAdapter2, moshi, alpha2, set, type);
    }
}
