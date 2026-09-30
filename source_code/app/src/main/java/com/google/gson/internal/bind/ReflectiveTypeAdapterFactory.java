package com.google.gson.internal.bind;

import androidx.appcompat.widget.P0;
import av.q;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.n;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import s6.AbstractC2726n7;

/* loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements ae {
    private final com.google.gson.internal.b constructorConstructor;
    private final Excluder excluder;
    private final com.google.gson.j fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    private final List<Object> reflectionFilters;

    /* loaded from: classes2.dex */
    public static abstract class Adapter<T, A> extends ad {
        private final j fieldsData;

        public Adapter(j jVar) {
            this.fieldsData = jVar;
        }

        public abstract A createAccumulator();

        public abstract T finalize(A a6);

        @Override // com.google.gson.ad
        public T read(S8.a aVar) throws IOException {
            if (aVar.white() == S8.b.f2049b) {
                aVar.peach();
                return null;
            }
            A createAccumulator = createAccumulator();
            Map map = this.fieldsData.alpha;
            try {
                aVar.echo();
                while (aVar.blue()) {
                    i iVar = (i) map.get(aVar.navy());
                    if (iVar == null) {
                        aVar.p();
                    } else {
                        readField(createAccumulator, aVar, iVar);
                    }
                }
                aVar.papa();
                return finalize(createAccumulator);
            } catch (IllegalAccessException e) {
                AbstractC2726n7 abstractC2726n7 = R8.c.alpha;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            } catch (IllegalStateException e4) {
                throw new JsonSyntaxException(e4);
            }
        }

        public abstract void readField(A a6, S8.a aVar, i iVar) throws IllegalAccessException, IOException;

        @Override // com.google.gson.ad
        public void write(S8.c cVar, T t5) throws IOException {
            if (t5 == null) {
                cVar.azure();
                return;
            }
            cVar.foxtrot();
            try {
                Iterator it = this.fieldsData.bravo.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).alpha(cVar, t5);
                }
                cVar.papa();
            } catch (IllegalAccessException e) {
                AbstractC2726n7 abstractC2726n7 = R8.c.alpha;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {
        private final n constructor;

        public FieldReflectionAdapter(n nVar, j jVar) {
            super(jVar);
            this.constructor = nVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T createAccumulator() {
            return (T) this.constructor.delta();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T finalize(T t5) {
            return t5;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public void readField(T t5, S8.a aVar, i iVar) throws IllegalAccessException, IOException {
            h hVar = (h) iVar;
            Object read = hVar.golf.read(aVar);
            if (read == null && hVar.hotel) {
                return;
            }
            boolean z2 = hVar.delta;
            Field field = hVar.bravo;
            if (z2) {
                ReflectiveTypeAdapterFactory.checkAccessible(t5, field);
            } else if (hVar.india) {
                throw new JsonIOException(q.echo("Cannot set value of 'static final' ", R8.c.delta(field, false)));
            }
            field.set(t5, read);
        }
    }

    /* loaded from: classes2.dex */
    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {
        static final Map<Class<?>, Object> PRIMITIVE_DEFAULTS = primitiveDefaults();
        private final Map<String, Integer> componentIndices;
        private final Constructor<T> constructor;
        private final Object[] constructorArgsDefaults;

        public RecordAdapter(Class<T> cls, j jVar, boolean z2) {
            super(jVar);
            this.componentIndices = new HashMap();
            AbstractC2726n7 abstractC2726n7 = R8.c.alpha;
            Constructor<T> charlie = abstractC2726n7.charlie(cls);
            this.constructor = charlie;
            if (z2) {
                ReflectiveTypeAdapterFactory.checkAccessible(null, charlie);
            } else {
                R8.c.foxtrot(charlie);
            }
            String[] delta = abstractC2726n7.delta(cls);
            for (int i4 = 0; i4 < delta.length; i4++) {
                this.componentIndices.put(delta[i4], Integer.valueOf(i4));
            }
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            this.constructorArgsDefaults = new Object[parameterTypes.length];
            for (int i5 = 0; i5 < parameterTypes.length; i5++) {
                this.constructorArgsDefaults[i5] = PRIMITIVE_DEFAULTS.get(parameterTypes[i5]);
            }
        }

        private static Map<Class<?>, Object> primitiveDefaults() {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            return hashMap;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public Object[] createAccumulator() {
            return (Object[]) this.constructorArgsDefaults.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T finalize(Object[] objArr) {
            try {
                return this.constructor.newInstance(objArr);
            } catch (IllegalAccessException e) {
                AbstractC2726n7 abstractC2726n7 = R8.c.alpha;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            } catch (IllegalArgumentException e4) {
                e = e4;
                throw new RuntimeException("Failed to invoke constructor '" + R8.c.bravo(this.constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e5) {
                e = e5;
                throw new RuntimeException("Failed to invoke constructor '" + R8.c.bravo(this.constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to invoke constructor '" + R8.c.bravo(this.constructor) + "' with args " + Arrays.toString(objArr), e10.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public void readField(Object[] objArr, S8.a aVar, i iVar) throws IOException {
            Integer num = this.componentIndices.get(iVar.charlie);
            if (num != null) {
                int intValue = num.intValue();
                h hVar = (h) iVar;
                Object read = hVar.golf.read(aVar);
                if (read == null && hVar.hotel) {
                    throw new JsonParseException("null is not allowed as value for record component '" + hVar.charlie + "' of primitive type; at path " + aVar.uniform());
                }
                objArr[intValue] = read;
                return;
            }
            StringBuilder sb2 = new StringBuilder("Could not find the index in the constructor '");
            sb2.append(R8.c.bravo(this.constructor));
            sb2.append("' for field with name '");
            throw new IllegalStateException(P0.gold(sb2, iVar.charlie, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."));
        }
    }

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.b bVar, com.google.gson.j jVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<Object> list) {
        this.constructorConstructor = bVar;
        this.fieldNamingPolicy = jVar;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        this.reflectionFilters = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <M extends AccessibleObject & Member> void checkAccessible(Object obj, M m4) {
        if (Modifier.isStatic(m4.getModifiers())) {
            obj = null;
        }
        if (com.google.gson.internal.q.alpha.alpha(obj, m4)) {
        } else {
            throw new JsonIOException(P0.crimson(R8.c.delta(m4, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    private i createBoundField(com.google.gson.l lVar, Field field, Method method, String str, TypeToken<?> typeToken, boolean z2, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        com.google.gson.l lVar2;
        ad adVar;
        ad adVar2;
        ad typeAdapterRuntimeTypeWrapper;
        Class<? super Object> rawType = typeToken.getRawType();
        boolean z14 = false;
        if (rawType != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && rawType.isPrimitive()) {
            z12 = true;
        } else {
            z12 = false;
        }
        int modifiers = field.getModifiers();
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z13 = true;
        } else {
            z13 = false;
        }
        P8.b bVar = (P8.b) field.getAnnotation(P8.b.class);
        if (bVar != null) {
            lVar2 = lVar;
            adVar = this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, lVar2, typeToken, bVar, false);
        } else {
            lVar2 = lVar;
            adVar = null;
        }
        if (adVar != null) {
            z14 = true;
        }
        if (adVar == null) {
            adVar = lVar2.foxtrot(typeToken);
        }
        ad adVar3 = adVar;
        if (z2) {
            if (z14) {
                typeAdapterRuntimeTypeWrapper = adVar3;
            } else {
                typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(lVar2, adVar3, typeToken.getType());
            }
            adVar2 = typeAdapterRuntimeTypeWrapper;
        } else {
            adVar2 = adVar3;
        }
        return new h(str, field, z10, method, adVar2, adVar3, z12, z13);
    }

    private static IllegalArgumentException createDuplicateFieldException(Class<?> cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + R8.c.charlie(field) + " and " + R8.c.charlie(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private j getBoundFields(com.google.gson.l lVar, TypeToken<?> typeToken, Class<?> cls, boolean z2, boolean z10) {
        boolean z11;
        boolean z12;
        Method method;
        String str;
        boolean z13;
        int i4;
        i iVar;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        if (cls.isInterface()) {
            return j.charlie;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        TypeToken<?> typeToken2 = typeToken;
        boolean z14 = z2;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            boolean z15 = false;
            if (cls2 != cls && declaredFields.length > 0) {
                com.google.gson.internal.f.foxtrot(reflectiveTypeAdapterFactory.reflectionFilters);
                z11 = false;
            } else {
                z11 = z14;
            }
            int length = declaredFields.length;
            int i5 = 0;
            while (i5 < length) {
                Field field = declaredFields[i5];
                boolean includeField = reflectiveTypeAdapterFactory.includeField(field, true);
                boolean includeField2 = reflectiveTypeAdapterFactory.includeField(field, z15);
                if (!includeField && !includeField2) {
                    i4 = i5;
                    z13 = z15;
                } else {
                    Method method2 = null;
                    if (z10) {
                        if (Modifier.isStatic(field.getModifiers())) {
                            method = null;
                            z12 = z15;
                            if (!z11 && method == null) {
                                R8.c.foxtrot(field);
                            }
                            Type kilo = com.google.gson.internal.f.kilo(typeToken2.getType(), cls2, field.getGenericType(), new HashMap());
                            List<String> fieldNames = reflectiveTypeAdapterFactory.getFieldNames(field);
                            str = fieldNames.get(0);
                            z13 = false;
                            i4 = i5;
                            i createBoundField = reflectiveTypeAdapterFactory.createBoundField(lVar, field, method, str, TypeToken.get(kilo), includeField, z11);
                            if (z12) {
                                for (String str2 : fieldNames) {
                                    i iVar2 = (i) linkedHashMap.put(str2, createBoundField);
                                    if (iVar2 != null) {
                                        throw createDuplicateFieldException(cls, str2, iVar2.bravo, field);
                                    }
                                }
                            }
                            if (includeField && (iVar = (i) linkedHashMap2.put(str, createBoundField)) != null) {
                                throw createDuplicateFieldException(cls, str, iVar.bravo, field);
                            }
                        } else {
                            method2 = R8.c.alpha.bravo(cls2, field);
                            if (!z11) {
                                R8.c.foxtrot(method2);
                            }
                            if (method2.getAnnotation(P8.c.class) != null && field.getAnnotation(P8.c.class) == null) {
                                throw new JsonIOException(ao.ad.gray("@SerializedName on ", R8.c.delta(method2, z15), " is not supported"));
                            }
                        }
                    }
                    z12 = includeField2;
                    method = method2;
                    if (!z11) {
                        R8.c.foxtrot(field);
                    }
                    Type kilo2 = com.google.gson.internal.f.kilo(typeToken2.getType(), cls2, field.getGenericType(), new HashMap());
                    List<String> fieldNames2 = reflectiveTypeAdapterFactory.getFieldNames(field);
                    str = fieldNames2.get(0);
                    z13 = false;
                    i4 = i5;
                    i createBoundField2 = reflectiveTypeAdapterFactory.createBoundField(lVar, field, method, str, TypeToken.get(kilo2), includeField, z11);
                    if (z12) {
                    }
                    if (includeField) {
                        throw createDuplicateFieldException(cls, str, iVar.bravo, field);
                    }
                    continue;
                }
                i5 = i4 + 1;
                reflectiveTypeAdapterFactory = this;
                z15 = z13;
            }
            typeToken2 = TypeToken.get(com.google.gson.internal.f.kilo(typeToken2.getType(), cls2, cls2.getGenericSuperclass(), new HashMap()));
            cls2 = typeToken2.getRawType();
            reflectiveTypeAdapterFactory = this;
            z14 = z11;
        }
        return new j(new ArrayList(linkedHashMap2.values()), linkedHashMap);
    }

    private List<String> getFieldNames(Field field) {
        String value;
        List asList;
        P8.c cVar = (P8.c) field.getAnnotation(P8.c.class);
        if (cVar == null) {
            value = this.fieldNamingPolicy.alpha(field);
            ((com.google.gson.i) this.fieldNamingPolicy).getClass();
            asList = Collections.EMPTY_LIST;
        } else {
            value = cVar.value();
            asList = Arrays.asList(cVar.alternate());
        }
        if (asList.isEmpty()) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(asList.size() + 1);
        arrayList.add(value);
        arrayList.addAll(asList);
        return arrayList;
    }

    private boolean includeField(Field field, boolean z2) {
        return !this.excluder.excludeField(field, z2);
    }

    @Override // com.google.gson.ae
    public <T> ad create(com.google.gson.l lVar, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        AbstractC2726n7 abstractC2726n7 = R8.c.alpha;
        if (!Modifier.isStatic(rawType.getModifiers()) && (rawType.isAnonymousClass() || rawType.isLocalClass())) {
            return new ad() { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
                @Override // com.google.gson.ad
                public T read(S8.a aVar) throws IOException {
                    aVar.p();
                    return null;
                }

                public String toString() {
                    return "AnonymousOrNonStaticLocalClassAdapter";
                }

                @Override // com.google.gson.ad
                public void write(S8.c cVar, T t5) throws IOException {
                    cVar.azure();
                }
            };
        }
        com.google.gson.internal.f.foxtrot(this.reflectionFilters);
        if (R8.c.alpha.echo(rawType)) {
            return new RecordAdapter(rawType, getBoundFields(lVar, typeToken, rawType, false, true), false);
        }
        return new FieldReflectionAdapter(this.constructorConstructor.bravo(typeToken, true), getBoundFields(lVar, typeToken, rawType, false, false));
    }
}
