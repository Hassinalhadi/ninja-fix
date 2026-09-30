package com.google.gson.internal;

import ao.ad;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import com.google.maps.android.BuildConfig;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class f {
    public static final Type[] alpha = new Type[0];

    public static Type alpha(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new c(alpha(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new d(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new c(((GenericArrayType) type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            return new e(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    public static void bravo(boolean z2) {
        if (z2) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void charlie(Type type) {
        boolean z2;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            z2 = false;
        } else {
            z2 = true;
        }
        bravo(z2);
    }

    public static void delta(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static boolean echo(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return echo(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    public static void foxtrot(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
        } else {
            throw ad.yankee(it);
        }
    }

    public static Type golf(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i4 = 0; i4 < length; i4++) {
                Class<?> cls3 = interfaces[i4];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i4];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return golf(cls.getGenericInterfaces()[i4], interfaces[i4], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return golf(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class hotel(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            bravo(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) hotel(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return hotel(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = BuildConfig.TRAVIS;
        } else {
            name = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    public static com.google.gson.q india(S8.a aVar) {
        boolean z2;
        try {
            try {
                aVar.white();
                z2 = false;
            } catch (EOFException e) {
                e = e;
                z2 = true;
            }
            try {
                return (com.google.gson.q) com.google.gson.internal.bind.l.zulu.read(aVar);
            } catch (EOFException e4) {
                e = e4;
                if (z2) {
                    return com.google.gson.r.alpha;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e5) {
            throw new JsonSyntaxException(e5);
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        } catch (NumberFormatException e11) {
            throw new JsonSyntaxException(e11);
        }
    }

    public static BigDecimal juliet(String str) {
        delta(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0143, code lost:
    
        if (r3 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0145, code lost:
    
        r13.put(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0148, code lost:
    
        return r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0143 A[EDGE_INSN: B:24:0x0143->B:25:0x0143 BREAK  A[LOOP:0: B:2:0x0004->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0004->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.google.gson.internal.e] */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.google.gson.internal.e] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type kilo(Type type, Class cls, Type type2, HashMap hashMap) {
        Type[] typeArr;
        Type[] typeArr2;
        Type dVar;
        Class cls2;
        TypeVariable typeVariable = null;
        while (true) {
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = type2;
                Type type3 = (Type) hashMap.get(typeVariable2);
                Class cls3 = Void.TYPE;
                if (type3 != null) {
                    if (type3 == cls3) {
                        return type2;
                    }
                    return type3;
                }
                hashMap.put(typeVariable2, cls3);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type golf = golf(type, cls, cls2);
                    if (golf instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        for (int i4 = 0; i4 < length; i4++) {
                            if (typeVariable2.equals(typeParameters[i4])) {
                                type2 = ((ParameterizedType) golf).getActualTypeArguments()[i4];
                                if (type2 != typeVariable2) {
                                    break;
                                }
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable2;
                if (type2 != typeVariable2) {
                }
            } else {
                if (type2 instanceof Class) {
                    Class cls4 = type2;
                    if (cls4.isArray()) {
                        Class<?> componentType = cls4.getComponentType();
                        Type kilo = kilo(type, cls, componentType, hashMap);
                        if (Objects.equals(componentType, kilo)) {
                            type2 = cls4;
                        } else {
                            dVar = new c(kilo);
                            type2 = dVar;
                        }
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type kilo2 = kilo(type, cls, genericComponentType, hashMap);
                    if (!Objects.equals(genericComponentType, kilo2)) {
                        dVar = new c(kilo2);
                        type2 = dVar;
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type kilo3 = kilo(type, cls, ownerType, hashMap);
                    boolean equals = Objects.equals(kilo3, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    Type[] typeArr3 = actualTypeArguments;
                    boolean z2 = false;
                    for (int i5 = 0; i5 < length2; i5++) {
                        Type kilo4 = kilo(type, cls, typeArr3[i5], hashMap);
                        if (!Objects.equals(kilo4, typeArr3[i5])) {
                            if (!z2) {
                                typeArr3 = (Type[]) typeArr3.clone();
                                z2 = true;
                            }
                            typeArr3[i5] = kilo4;
                        }
                    }
                    if (!equals || z2) {
                        dVar = new d(kilo3, (Class) type2.getRawType(), typeArr3);
                        type2 = dVar;
                    }
                } else if (type2 instanceof WildcardType) {
                    type2 = (WildcardType) type2;
                    Type[] lowerBounds = type2.getLowerBounds();
                    Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type kilo5 = kilo(type, cls, lowerBounds[0], hashMap);
                        if (kilo5 != lowerBounds[0]) {
                            if (kilo5 instanceof WildcardType) {
                                typeArr2 = ((WildcardType) kilo5).getLowerBounds();
                            } else {
                                typeArr2 = new Type[]{kilo5};
                            }
                            type2 = new e(new Type[]{Object.class}, typeArr2);
                        }
                    } else if (upperBounds.length == 1) {
                        Type kilo6 = kilo(type, cls, upperBounds[0], hashMap);
                        if (kilo6 != upperBounds[0]) {
                            if (kilo6 instanceof WildcardType) {
                                typeArr = ((WildcardType) kilo6).getUpperBounds();
                            } else {
                                typeArr = new Type[]{kilo6};
                            }
                            type2 = new e(typeArr, alpha);
                        }
                    }
                }
            }
        }
    }

    public static String lima(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public static Class mike(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Void.TYPE) {
            return Void.class;
        }
        return cls;
    }
}
