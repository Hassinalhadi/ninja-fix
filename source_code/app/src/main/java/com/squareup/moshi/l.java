package com.squareup.moshi;

import androidx.appcompat.widget.P0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.internal.Util;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import s6.AbstractC2665h0;

/* loaded from: classes2.dex */
public final class l implements JsonAdapter.Factory {
    public static void alpha(Type type, Class cls) {
        Class<?> rawType = Types.getRawType(type);
        if (!cls.isAssignableFrom(rawType)) {
            return;
        }
        throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + rawType.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        AbstractC2665h0 iVar;
        Json json;
        Type type2 = type;
        int i4 = 0;
        if ((type2 instanceof Class) || (type2 instanceof ParameterizedType)) {
            Class<?> rawType = Types.getRawType(type2);
            if (!rawType.isInterface() && !rawType.isEnum() && set.isEmpty()) {
                if (Util.isPlatformType(rawType)) {
                    alpha(type2, List.class);
                    alpha(type2, Set.class);
                    alpha(type2, Map.class);
                    alpha(type2, Collection.class);
                    String str = "Platform " + rawType;
                    if (type2 instanceof ParameterizedType) {
                        str = str + " in " + type2;
                    }
                    throw new IllegalArgumentException(P0.crimson(str, " requires explicit JsonAdapter to be registered"));
                }
                if (!rawType.isAnonymousClass()) {
                    if (!rawType.isLocalClass()) {
                        if (rawType.getEnclosingClass() != null && !Modifier.isStatic(rawType.getModifiers())) {
                            throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(rawType.getName()));
                        }
                        if (!Modifier.isAbstract(rawType.getModifiers())) {
                            if (!Util.isKotlin(rawType)) {
                                try {
                                    try {
                                        try {
                                            try {
                                                Constructor<?> declaredConstructor = rawType.getDeclaredConstructor(null);
                                                declaredConstructor.setAccessible(true);
                                                iVar = new i(declaredConstructor, rawType);
                                            } catch (NoSuchMethodException unused) {
                                                Class<?> cls = Class.forName("sun.misc.Unsafe");
                                                Field declaredField = cls.getDeclaredField("theUnsafe");
                                                declaredField.setAccessible(true);
                                                iVar = new j(cls.getMethod("allocateInstance", Class.class), declaredField.get(null), rawType);
                                            }
                                        } catch (Exception unused2) {
                                            throw new IllegalArgumentException("cannot construct instances of ".concat(rawType.getName()));
                                        }
                                    } catch (IllegalAccessException unused3) {
                                        throw new AssertionError();
                                    } catch (NoSuchMethodException unused4) {
                                        Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                                        declaredMethod.setAccessible(true);
                                        iVar = new i(declaredMethod, rawType);
                                    } catch (InvocationTargetException e) {
                                        throw Util.rethrowCause(e);
                                    }
                                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                                    declaredMethod2.setAccessible(true);
                                    int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                                    Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                                    declaredMethod3.setAccessible(true);
                                    iVar = new k(declaredMethod3, rawType, intValue);
                                } catch (IllegalAccessException unused6) {
                                    throw new AssertionError();
                                }
                                TreeMap treeMap = new TreeMap();
                                while (type2 != Object.class) {
                                    Class<?> rawType2 = Types.getRawType(type2);
                                    boolean isPlatformType = Util.isPlatformType(rawType2);
                                    Field[] declaredFields = rawType2.getDeclaredFields();
                                    int length = declaredFields.length;
                                    for (int i5 = i4; i5 < length; i5++) {
                                        Field field = declaredFields[i5];
                                        int modifiers = field.getModifiers();
                                        if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && ((Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !isPlatformType) && ((json = (Json) field.getAnnotation(Json.class)) == null || !json.ignore()))) {
                                            Type resolve = Util.resolve(type2, rawType2, field.getGenericType());
                                            Set<? extends Annotation> jsonAnnotations = Util.jsonAnnotations(field);
                                            String name = field.getName();
                                            JsonAdapter adapter = moshi.adapter(resolve, jsonAnnotations, name);
                                            field.setAccessible(true);
                                            String jsonName = Util.jsonName(name, json);
                                            m mVar = (m) treeMap.put(jsonName, new m(jsonName, field, adapter));
                                            if (mVar != null) {
                                                throw new IllegalArgumentException("Conflicting fields:\n    " + mVar.bravo + "\n    " + field);
                                            }
                                        }
                                    }
                                    type2 = Types.getGenericSuperclass(type2);
                                    i4 = 0;
                                }
                                return new n(iVar, treeMap).nullSafe();
                            }
                            throw new IllegalArgumentException("Cannot serialize Kotlin type " + rawType.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                        }
                        throw new IllegalArgumentException("Cannot serialize abstract class ".concat(rawType.getName()));
                    }
                    throw new IllegalArgumentException("Cannot serialize local class ".concat(rawType.getName()));
                }
                throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(rawType.getName()));
            }
        }
        return null;
    }
}
