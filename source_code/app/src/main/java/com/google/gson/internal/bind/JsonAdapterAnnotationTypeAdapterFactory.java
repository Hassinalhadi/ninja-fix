package com.google.gson.internal.bind;

import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements ae {
    private static final ae TREE_TYPE_CLASS_DUMMY_FACTORY;
    private static final ae TREE_TYPE_FIELD_DUMMY_FACTORY;
    private final ConcurrentMap<Class<?>, ae> adapterFactoryMap = new ConcurrentHashMap();
    private final com.google.gson.internal.b constructorConstructor;

    /* loaded from: classes2.dex */
    public static class DummyTypeAdapterFactory implements ae {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.ae
        public <T> ad create(com.google.gson.l lVar, TypeToken<T> typeToken) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        TREE_TYPE_CLASS_DUMMY_FACTORY = new DummyTypeAdapterFactory();
        TREE_TYPE_FIELD_DUMMY_FACTORY = new DummyTypeAdapterFactory();
    }

    public JsonAdapterAnnotationTypeAdapterFactory(com.google.gson.internal.b bVar) {
        this.constructorConstructor = bVar;
    }

    private static Object createAdapter(com.google.gson.internal.b bVar, Class<?> cls) {
        return bVar.bravo(TypeToken.get((Class) cls), true).delta();
    }

    private static P8.b getAnnotation(Class<?> cls) {
        return (P8.b) cls.getAnnotation(P8.b.class);
    }

    private ae putFactoryAndGetCurrent(Class<?> cls, ae aeVar) {
        ae putIfAbsent = this.adapterFactoryMap.putIfAbsent(cls, aeVar);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        return aeVar;
    }

    @Override // com.google.gson.ae
    public <T> ad create(com.google.gson.l lVar, TypeToken<T> typeToken) {
        P8.b annotation = getAnnotation(typeToken.getRawType());
        if (annotation == null) {
            return null;
        }
        return getTypeAdapter(this.constructorConstructor, lVar, typeToken, annotation, true);
    }

    public ad getTypeAdapter(com.google.gson.internal.b bVar, com.google.gson.l lVar, TypeToken<?> typeToken, P8.b bVar2, boolean z2) {
        v vVar;
        ae aeVar;
        ad adVar;
        Object createAdapter = createAdapter(bVar, bVar2.value());
        boolean nullSafe = bVar2.nullSafe();
        if (createAdapter instanceof ad) {
            adVar = (ad) createAdapter;
        } else if (createAdapter instanceof ae) {
            ae aeVar2 = (ae) createAdapter;
            if (z2) {
                aeVar2 = putFactoryAndGetCurrent(typeToken.getRawType(), aeVar2);
            }
            adVar = aeVar2.create(lVar, typeToken);
        } else {
            boolean z10 = createAdapter instanceof v;
            if (!z10 && !(createAdapter instanceof p)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + createAdapter.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            p pVar = null;
            if (z10) {
                vVar = (v) createAdapter;
            } else {
                vVar = null;
            }
            if (createAdapter instanceof p) {
                pVar = (p) createAdapter;
            }
            p pVar2 = pVar;
            if (z2) {
                aeVar = TREE_TYPE_CLASS_DUMMY_FACTORY;
            } else {
                aeVar = TREE_TYPE_FIELD_DUMMY_FACTORY;
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(vVar, pVar2, lVar, typeToken, aeVar, nullSafe);
            nullSafe = false;
            adVar = treeTypeAdapter;
        }
        if (adVar != null && nullSafe) {
            return adVar.nullSafe();
        }
        return adVar;
    }

    public boolean isClassJsonAdapterFactory(TypeToken<?> typeToken, ae aeVar) {
        Objects.requireNonNull(typeToken);
        Objects.requireNonNull(aeVar);
        if (aeVar == TREE_TYPE_CLASS_DUMMY_FACTORY) {
            return true;
        }
        Class<? super Object> rawType = typeToken.getRawType();
        ae aeVar2 = this.adapterFactoryMap.get(rawType);
        if (aeVar2 != null) {
            if (aeVar2 == aeVar) {
                return true;
            }
            return false;
        }
        P8.b annotation = getAnnotation(rawType);
        if (annotation == null) {
            return false;
        }
        Class value = annotation.value();
        if (ae.class.isAssignableFrom(value) && putFactoryAndGetCurrent(rawType, (ae) createAdapter(this.constructorConstructor, value)) == aeVar) {
            return true;
        }
        return false;
    }
}
