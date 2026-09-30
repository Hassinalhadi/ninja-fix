package com.google.gson.reflect;

import com.google.gson.internal.c;
import com.google.gson.internal.d;
import com.google.gson.internal.f;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class TypeToken<T> {
    private final int hashCode;
    private final Class<? super T> rawType;
    private final Type type;

    public TypeToken() {
        Type typeTokenTypeArgument = getTypeTokenTypeArgument();
        this.type = typeTokenTypeArgument;
        this.rawType = f.hotel(typeTokenTypeArgument);
        this.hashCode = typeTokenTypeArgument.hashCode();
    }

    private static IllegalArgumentException buildUnsupportedTypeException(Type type, Class<?>... clsArr) {
        StringBuilder sb2 = new StringBuilder("Unsupported type, expected one of: ");
        for (Class<?> cls : clsArr) {
            sb2.append(cls.getName());
            sb2.append(", ");
        }
        sb2.append("but got: ");
        sb2.append(type.getClass().getName());
        sb2.append(", for type token: ");
        sb2.append(type.toString());
        return new IllegalArgumentException(sb2.toString());
    }

    public static TypeToken<?> get(Type type) {
        return new TypeToken<>(type);
    }

    public static TypeToken<?> getArray(Type type) {
        return new TypeToken<>(new c(type));
    }

    public static TypeToken<?> getParameterized(Type type, Type... typeArr) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(typeArr);
        boolean z2 = type instanceof Class;
        if (z2) {
            Class cls = (Class) type;
            TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
            int length = typeParameters.length;
            int length2 = typeArr.length;
            if (length2 == length) {
                if (typeArr.length == 0) {
                    return get(cls);
                }
                if (z2) {
                    Class cls2 = (Class) type;
                    if (!Modifier.isStatic(cls2.getModifiers()) && cls2.getDeclaringClass() != null) {
                        throw new IllegalArgumentException("Raw type " + cls.getName() + " is not supported because it requires specifying an owner type");
                    }
                }
                for (int i4 = 0; i4 < length; i4++) {
                    Type type2 = typeArr[i4];
                    Objects.requireNonNull(type2, "Type argument must not be null");
                    Type type3 = type2;
                    Class<?> hotel = f.hotel(type3);
                    TypeVariable<Class<T>> typeVariable = typeParameters[i4];
                    for (Type type4 : typeVariable.getBounds()) {
                        if (!f.hotel(type4).isAssignableFrom(hotel)) {
                            throw new IllegalArgumentException("Type argument " + type3 + " does not satisfy bounds for type variable " + typeVariable + " declared by " + type);
                        }
                    }
                }
                return new TypeToken<>(new d(null, cls, typeArr));
            }
            throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        throw new IllegalArgumentException("rawType must be of type Class, but was " + type);
    }

    private Type getTypeTokenTypeArgument() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == TypeToken.class) {
                Type alpha = f.alpha(parameterizedType.getActualTypeArguments()[0]);
                if (isCapturingTypeVariablesForbidden()) {
                    verifyNoTypeVariable(alpha);
                }
                return alpha;
            }
        } else if (genericSuperclass == TypeToken.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    private static boolean isCapturingTypeVariablesForbidden() {
        return !Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true");
    }

    private static boolean matches(Type type, Type type2, Map<String, Type> map) {
        if (!type2.equals(type)) {
            if (!(type instanceof TypeVariable) || !type2.equals(map.get(((TypeVariable) type).getName()))) {
                return false;
            }
            return true;
        }
        return true;
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i4 = 0; i4 < actualTypeArguments.length; i4++) {
            if (!matches(actualTypeArguments[i4], actualTypeArguments2[i4], map)) {
                return false;
            }
        }
        return true;
    }

    private static void verifyNoTypeVariable(Type type) {
        if (!(type instanceof TypeVariable)) {
            if (type instanceof GenericArrayType) {
                verifyNoTypeVariable(((GenericArrayType) type).getGenericComponentType());
                return;
            }
            int i4 = 0;
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType != null) {
                    verifyNoTypeVariable(ownerType);
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                while (i4 < length) {
                    verifyNoTypeVariable(actualTypeArguments[i4]);
                    i4++;
                }
                return;
            }
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                for (Type type2 : wildcardType.getLowerBounds()) {
                    verifyNoTypeVariable(type2);
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                int length2 = upperBounds.length;
                while (i4 < length2) {
                    verifyNoTypeVariable(upperBounds[i4]);
                    i4++;
                }
                return;
            }
            if (type != null) {
                return;
            } else {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
        }
        TypeVariable typeVariable = (TypeVariable) type;
        throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof TypeToken) && f.echo(this.type, ((TypeToken) obj).type)) {
            return true;
        }
        return false;
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    public final String toString() {
        return f.lima(this.type);
    }

    public static <T> TypeToken<T> get(Class<T> cls) {
        return new TypeToken<>(cls);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type) {
        if (type == null) {
            return false;
        }
        if (this.type.equals(type)) {
            return true;
        }
        Type type2 = this.type;
        if (type2 instanceof Class) {
            return this.rawType.isAssignableFrom(f.hotel(type));
        }
        if (type2 instanceof ParameterizedType) {
            return isAssignableFrom(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            return this.rawType.isAssignableFrom(f.hotel(type)) && isAssignableFrom(type, (GenericArrayType) this.type);
        }
        throw buildUnsupportedTypeException(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    private TypeToken(Type type) {
        Objects.requireNonNull(type);
        Type alpha = f.alpha(type);
        this.type = alpha;
        this.rawType = f.hotel(alpha);
        this.hashCode = alpha.hashCode();
    }

    @Deprecated
    public boolean isAssignableFrom(TypeToken<?> typeToken) {
        return isAssignableFrom(typeToken.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static boolean isAssignableFrom(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType) type).getGenericComponentType();
        } else if (type instanceof Class) {
            type = (Class) type;
            while (type.isArray()) {
                type = type.getComponentType();
            }
        }
        return isAssignableFrom(type, (ParameterizedType) genericComponentType, new HashMap());
    }

    private static boolean isAssignableFrom(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class hotel = f.hotel(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<T>>[] typeParameters = hotel.getTypeParameters();
            for (int i4 = 0; i4 < actualTypeArguments.length; i4++) {
                Type type2 = actualTypeArguments[i4];
                TypeVariable<Class<T>> typeVariable = typeParameters[i4];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (typeEquals(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : hotel.getGenericInterfaces()) {
            if (isAssignableFrom(type3, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return isAssignableFrom(hotel.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }
}
