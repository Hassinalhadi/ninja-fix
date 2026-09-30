package com.google.gson.internal;

import androidx.appcompat.widget.P0;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import s6.AbstractC2726n7;

/* loaded from: classes2.dex */
public final class b {
    public final Map alpha;
    public final boolean bravo;
    public final List charlie;

    public b(Map map, boolean z2, List list) {
        this.alpha = map;
        this.bravo = z2;
        this.charlie = list;
    }

    public static String alpha(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
    
        if (com.google.gson.internal.f.hotel(r5[0]) != java.lang.String.class) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n bravo(TypeToken typeToken, boolean z2) {
        n nVar;
        String str;
        n uVar;
        int i4 = 4;
        int i5 = 3;
        int i10 = 2;
        final int i11 = 0;
        final int i12 = 1;
        final Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        Map map = this.alpha;
        if (map.get(type) == null) {
            if (map.get(rawType) == null) {
                com.google.firebase.messaging.l lVar = null;
                if (EnumSet.class.isAssignableFrom(rawType)) {
                    nVar = new n() { // from class: com.google.gson.internal.a
                        @Override // com.google.gson.internal.n
                        public final Object delta() {
                            switch (i11) {
                                case 0:
                                    Type type2 = type;
                                    if (type2 instanceof ParameterizedType) {
                                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                                        if (type3 instanceof Class) {
                                            return EnumSet.noneOf((Class) type3);
                                        }
                                        throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
                                    }
                                    throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
                                default:
                                    Type type4 = type;
                                    if (type4 instanceof ParameterizedType) {
                                        Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                                        if (type5 instanceof Class) {
                                            return new EnumMap((Class) type5);
                                        }
                                        throw new JsonIOException("Invalid EnumMap type: " + type4.toString());
                                    }
                                    throw new JsonIOException("Invalid EnumMap type: " + type4.toString());
                            }
                        }
                    };
                } else if (rawType == EnumMap.class) {
                    nVar = new n() { // from class: com.google.gson.internal.a
                        @Override // com.google.gson.internal.n
                        public final Object delta() {
                            switch (i12) {
                                case 0:
                                    Type type2 = type;
                                    if (type2 instanceof ParameterizedType) {
                                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                                        if (type3 instanceof Class) {
                                            return EnumSet.noneOf((Class) type3);
                                        }
                                        throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
                                    }
                                    throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
                                default:
                                    Type type4 = type;
                                    if (type4 instanceof ParameterizedType) {
                                        Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                                        if (type5 instanceof Class) {
                                            return new EnumMap((Class) type5);
                                        }
                                        throw new JsonIOException("Invalid EnumMap type: " + type4.toString());
                                    }
                                    throw new JsonIOException("Invalid EnumMap type: " + type4.toString());
                            }
                        }
                    };
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    return nVar;
                }
                f.foxtrot(this.charlie);
                if (!Modifier.isAbstract(rawType.getModifiers())) {
                    try {
                        Constructor declaredConstructor = rawType.getDeclaredConstructor(null);
                        AbstractC2726n7 abstractC2726n7 = R8.c.alpha;
                        try {
                            declaredConstructor.setAccessible(true);
                            str = null;
                        } catch (Exception e) {
                            str = "Failed making constructor '" + R8.c.bravo(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + R8.c.echo(e);
                        }
                        if (str != null) {
                            uVar = new com.clevertap.android.sdk.inbox.c(str, 2);
                        } else {
                            uVar = new a4.u(22, declaredConstructor);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (uVar == null) {
                        return uVar;
                    }
                    if (Collection.class.isAssignableFrom(rawType)) {
                        if (rawType.isAssignableFrom(ArrayList.class)) {
                            lVar = new com.google.firebase.messaging.l(7);
                        } else if (rawType.isAssignableFrom(LinkedHashSet.class)) {
                            lVar = new com.google.firebase.messaging.l(8);
                        } else if (rawType.isAssignableFrom(TreeSet.class)) {
                            lVar = new com.google.firebase.messaging.l(9);
                        } else if (rawType.isAssignableFrom(ArrayDeque.class)) {
                            lVar = new com.google.firebase.messaging.l(10);
                        }
                    } else if (Map.class.isAssignableFrom(rawType)) {
                        if (rawType.isAssignableFrom(m.class)) {
                            if (type instanceof ParameterizedType) {
                                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                                if (actualTypeArguments.length != 0) {
                                }
                            }
                            lVar = new com.google.firebase.messaging.l(i10);
                        }
                        if (rawType.isAssignableFrom(LinkedHashMap.class)) {
                            lVar = new com.google.firebase.messaging.l(i5);
                        } else if (rawType.isAssignableFrom(TreeMap.class)) {
                            lVar = new com.google.firebase.messaging.l(i4);
                        } else if (rawType.isAssignableFrom(ConcurrentHashMap.class)) {
                            lVar = new com.google.firebase.messaging.l(5);
                        } else if (rawType.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            lVar = new com.google.firebase.messaging.l(6);
                        }
                    }
                    if (lVar != null) {
                        return lVar;
                    }
                    String alpha = alpha(rawType);
                    if (alpha != null) {
                        return new com.clevertap.android.sdk.inbox.c(alpha, 1);
                    }
                    if (!z2) {
                        return new com.clevertap.android.sdk.inbox.c("Unable to create instance of " + rawType + "; Register an InstanceCreator or a TypeAdapter for this type.", 3);
                    }
                    if (this.bravo) {
                        return new a4.u(23, rawType);
                    }
                    String str2 = "Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
                    if (rawType.getDeclaredConstructors().length == 0) {
                        str2 = P0.crimson(str2, " Or adjust your R8 configuration to keep the no-args constructor of the class.");
                    }
                    return new com.clevertap.android.sdk.inbox.c(str2, 4);
                }
                uVar = null;
                if (uVar == null) {
                }
            } else {
                throw new ClassCastException();
            }
        } else {
            throw new ClassCastException();
        }
    }

    public final String toString() {
        return this.alpha.toString();
    }
}
