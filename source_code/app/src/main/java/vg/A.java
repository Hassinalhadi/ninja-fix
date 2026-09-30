package vg;

import androidx.recyclerview.widget.RecyclerView;
import com.google.maps.android.BuildConfig;
import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import m6.AbstractC2105f;
import pe.AbstractC2327c;
import s6.E;
import s6.J6;
import vf.C3207k;

/* loaded from: classes2.dex */
public abstract class A {
    public static final Type[] alpha = new Type[0];
    public static boolean bravo = true;
    public static Constructor charlie;

    public static final Object bravo(d dVar, Nd.c cVar) {
        C3207k c3207k = new C3207k(1, J6.delta(cVar));
        c3207k.tango();
        c3207k.victor(new u(dVar, 0));
        dVar.o(new Ff.b(c3207k, 2));
        Object sierra = c3207k.sierra();
        Od.a aVar = Od.a.alpha;
        return sierra;
    }

    public static final Object charlie(d dVar, Nd.c cVar) {
        C3207k c3207k = new C3207k(1, J6.delta(cVar));
        c3207k.tango();
        c3207k.victor(new u(dVar, 1));
        dVar.o(new O9.c(c3207k));
        Object sierra = c3207k.sierra();
        Od.a aVar = Od.a.alpha;
        return sierra;
    }

    public static void delta(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean echo(Type type, Type type2) {
        boolean z2;
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
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (ownerType != ownerType2 && (ownerType == null || !ownerType.equals(ownerType2))) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean equals = parameterizedType.getRawType().equals(parameterizedType2.getRawType());
            boolean equals2 = Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            if (z2 && equals && equals2) {
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
        if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    public static Type foxtrot(Type type, Class cls, Class cls2) {
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
                    return foxtrot(cls.getGenericInterfaces()[i4], interfaces[i4], cls2);
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
                    return foxtrot(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type golf(int i4, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i4 >= 0 && i4 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i4];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        StringBuilder sierra = Q0.c.sierra(i4, "Index ", " not in range [0,");
        sierra.append(actualTypeArguments.length);
        sierra.append(") for ");
        sierra.append(parameterizedType);
        throw new IllegalArgumentException(sierra.toString());
    }

    public static Class hotel(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
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
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type india(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return quebec(type, cls, foxtrot(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static boolean juliet(Type type) {
        String name;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (juliet(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return juliet(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        if (type == null) {
            name = BuildConfig.TRAVIS;
        } else {
            name = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    public static Object kilo(Method method, Class cls, Object obj, Object[] objArr) {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor constructor = charlie;
        if (constructor == null) {
            constructor = AbstractC2105f.november().getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
            charlie = constructor;
        }
        unreflectSpecial = AbstractC2105f.tango(constructor.newInstance(cls, -1)).unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }

    public static boolean lima(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static boolean mike(Type type) {
        if (!bravo || type != Unit.class) {
            return false;
        }
        return true;
    }

    public static IllegalArgumentException november(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder beige = ao.ad.beige(String.format(str, objArr), "\n    for method ");
        beige.append(method.getDeclaringClass().getSimpleName());
        beige.append(".");
        beige.append(method.getName());
        return new IllegalArgumentException(beige.toString(), exc);
    }

    public static IllegalArgumentException oscar(Method method, int i4, String str, Object... objArr) {
        return november(method, null, AbstractC2327c.xray(str, " (", aj.bravo.delta(method, i4), ")"), objArr);
    }

    public static IllegalArgumentException papa(Method method, Exception exc, int i4, String str, Object... objArr) {
        return november(method, exc, AbstractC2327c.xray(str, " (", aj.bravo.delta(method, i4), ")"), objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[LOOP:0: B:2:0x0002->B:19:0x0044, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type quebec(Type type, Class cls, Type type2) {
        boolean z2;
        Class cls2;
        Type type3;
        Type type4 = type2;
        while (type4 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type4;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            if (genericDeclaration instanceof Class) {
                cls2 = (Class) genericDeclaration;
            } else {
                cls2 = null;
            }
            if (cls2 != null) {
                Type foxtrot = foxtrot(type, cls, cls2);
                if (foxtrot instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    for (int i4 = 0; i4 < typeParameters.length; i4++) {
                        if (typeVariable.equals(typeParameters[i4])) {
                            type3 = ((ParameterizedType) foxtrot).getActualTypeArguments()[i4];
                            if (type3 != typeVariable) {
                                return type3;
                            }
                            type4 = type3;
                        }
                    }
                    throw new NoSuchElementException();
                }
            }
            type3 = typeVariable;
            if (type3 != typeVariable) {
            }
        }
        if (type4 instanceof Class) {
            Class cls3 = (Class) type4;
            if (cls3.isArray()) {
                Class<?> componentType = cls3.getComponentType();
                Type quebec = quebec(type, cls, componentType);
                if (componentType == quebec) {
                    return cls3;
                }
                return new ax(quebec);
            }
        }
        if (type4 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type4;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type quebec2 = quebec(type, cls, genericComponentType);
            if (genericComponentType == quebec2) {
                return genericArrayType;
            }
            return new ax(quebec2);
        }
        if (type4 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type4;
            Type ownerType = parameterizedType.getOwnerType();
            Type quebec3 = quebec(type, cls, ownerType);
            if (quebec3 != ownerType) {
                z2 = true;
            } else {
                z2 = false;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i5 = 0; i5 < length; i5++) {
                Type quebec4 = quebec(type, cls, actualTypeArguments[i5]);
                if (quebec4 != actualTypeArguments[i5]) {
                    if (!z2) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z2 = true;
                    }
                    actualTypeArguments[i5] = quebec4;
                }
            }
            if (z2) {
                return new ay(quebec3, parameterizedType.getRawType(), actualTypeArguments);
            }
            return parameterizedType;
        }
        boolean z10 = type4 instanceof WildcardType;
        Type type5 = type4;
        if (z10) {
            WildcardType wildcardType = (WildcardType) type4;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type quebec5 = quebec(type, cls, lowerBounds[0]);
                type5 = wildcardType;
                if (quebec5 != lowerBounds[0]) {
                    return new az(new Type[]{Object.class}, new Type[]{quebec5});
                }
            } else {
                type5 = wildcardType;
                if (upperBounds.length == 1) {
                    Type quebec6 = quebec(type, cls, upperBounds[0]);
                    type5 = wildcardType;
                    if (quebec6 != upperBounds[0]) {
                        return new az(new Type[]{quebec6}, alpha);
                    }
                }
            }
        }
        return type5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void romeo(Nd.c cVar, Throwable th) {
        v vVar;
        int i4;
        if (cVar instanceof v) {
            v vVar2 = (v) cVar;
            int i5 = vVar2.purple;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                vVar2.purple = i5 - RecyclerView.UNDEFINED_DURATION;
                vVar = vVar2;
                Object obj = vVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = vVar.purple;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2327c.amber(obj);
                }
                ResultKt.alpha(obj);
                vVar.purple = 1;
                vf.ao.alpha.beige(vVar.getContext(), new E(20, vVar, th));
                return;
            }
        }
        vVar = new Pd.c(cVar);
        Object obj2 = vVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = vVar.purple;
        if (i4 == 0) {
        }
    }

    public static void sierra(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                } else {
                    throw ((LinkageError) th);
                }
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }

    public static String tango(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public abstract void alpha(an anVar, Object obj);
}
