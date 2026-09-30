package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.internal.Util;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Moshi {
    static final List<JsonAdapter.Factory> BUILT_IN_FACTORIES;
    private final List<JsonAdapter.Factory> factories;
    private final int lastOffset;
    private final ThreadLocal<al> lookupChainThreadLocal = new ThreadLocal<>();
    private final Map<Object, JsonAdapter<?>> adapterCache = new LinkedHashMap();

    /* loaded from: classes2.dex */
    public static final class Builder {
        final List<JsonAdapter.Factory> factories = new ArrayList();
        int lastOffset = 0;

        public <T> Builder add(Type type, JsonAdapter<T> jsonAdapter) {
            return add(Moshi.newAdapterFactory(type, jsonAdapter));
        }

        public <T> Builder addLast(Type type, JsonAdapter<T> jsonAdapter) {
            return addLast(Moshi.newAdapterFactory(type, jsonAdapter));
        }

        public Moshi build() {
            return new Moshi(this);
        }

        public <T> Builder add(Type type, Class<? extends Annotation> cls, JsonAdapter<T> jsonAdapter) {
            return add(Moshi.newAdapterFactory(type, cls, jsonAdapter));
        }

        public <T> Builder addLast(Type type, Class<? extends Annotation> cls, JsonAdapter<T> jsonAdapter) {
            return addLast(Moshi.newAdapterFactory(type, cls, jsonAdapter));
        }

        public Builder add(JsonAdapter.Factory factory) {
            if (factory != null) {
                List<JsonAdapter.Factory> list = this.factories;
                int i4 = this.lastOffset;
                this.lastOffset = i4 + 1;
                list.add(i4, factory);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        public Builder addLast(JsonAdapter.Factory factory) {
            if (factory != null) {
                this.factories.add(factory);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        public Builder add(Object obj) {
            if (obj != null) {
                return add((JsonAdapter.Factory) f.bravo(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        public Builder addLast(Object obj) {
            if (obj != null) {
                return addLast((JsonAdapter.Factory) f.bravo(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        BUILT_IN_FACTORIES = arrayList;
        arrayList.add(at.alpha);
        arrayList.add(q.bravo);
        arrayList.add(ah.charlie);
        arrayList.add(h.charlie);
        arrayList.add(an.alpha);
        arrayList.add(n.delta);
    }

    public Moshi(Builder builder) {
        int size = builder.factories.size();
        List<JsonAdapter.Factory> list = BUILT_IN_FACTORIES;
        ArrayList arrayList = new ArrayList(list.size() + size);
        arrayList.addAll(builder.factories);
        arrayList.addAll(list);
        this.factories = Collections.unmodifiableList(arrayList);
        this.lastOffset = builder.lastOffset;
    }

    private Object cacheKey(Type type, Set<? extends Annotation> set) {
        if (set.isEmpty()) {
            return type;
        }
        return Arrays.asList(type, set);
    }

    public static <T> JsonAdapter.Factory newAdapterFactory(Type type, JsonAdapter<T> jsonAdapter) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        }
        if (jsonAdapter != null) {
            return new ai(type, jsonAdapter);
        }
        throw new IllegalArgumentException("jsonAdapter == null");
    }

    public <T> JsonAdapter<T> adapter(Type type) {
        return adapter(type, Util.NO_ANNOTATIONS);
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        int i4 = this.lastOffset;
        for (int i5 = 0; i5 < i4; i5++) {
            builder.add(this.factories.get(i5));
        }
        int size = this.factories.size() - BUILT_IN_FACTORIES.size();
        for (int i10 = this.lastOffset; i10 < size; i10++) {
            builder.addLast(this.factories.get(i10));
        }
        return builder;
    }

    public <T> JsonAdapter<T> nextAdapter(JsonAdapter.Factory factory, Type type, Set<? extends Annotation> set) {
        if (set != null) {
            Type removeSubtypeWildcard = Util.removeSubtypeWildcard(Util.canonicalize(type));
            int indexOf = this.factories.indexOf(factory);
            if (indexOf != -1) {
                int size = this.factories.size();
                for (int i4 = indexOf + 1; i4 < size; i4++) {
                    JsonAdapter<T> jsonAdapter = (JsonAdapter<T>) this.factories.get(i4).create(removeSubtypeWildcard, set, this);
                    if (jsonAdapter != null) {
                        return jsonAdapter;
                    }
                }
                throw new IllegalArgumentException("No next JsonAdapter for " + Util.typeAnnotatedWithAnnotations(removeSubtypeWildcard, set));
            }
            throw new IllegalArgumentException("Unable to skip past unknown factory " + factory);
        }
        throw new NullPointerException("annotations == null");
    }

    public <T> JsonAdapter<T> adapter(Class<T> cls) {
        return adapter(cls, Util.NO_ANNOTATIONS);
    }

    public <T> JsonAdapter<T> adapter(Type type, Class<? extends Annotation> cls) {
        if (cls != null) {
            return adapter(type, Collections.singleton(Types.createJsonQualifierImplementation(cls)));
        }
        throw new NullPointerException("annotationType == null");
    }

    public static <T> JsonAdapter.Factory newAdapterFactory(Type type, Class<? extends Annotation> cls, JsonAdapter<T> jsonAdapter) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        }
        if (cls == null) {
            throw new IllegalArgumentException("annotation == null");
        }
        if (jsonAdapter != null) {
            if (cls.isAnnotationPresent(JsonQualifier.class)) {
                if (cls.getDeclaredMethods().length <= 0) {
                    return new aj(type, cls, jsonAdapter);
                }
                throw new IllegalArgumentException("Use JsonAdapter.Factory for annotations with elements");
            }
            throw new IllegalArgumentException(cls + " does not have @JsonQualifier");
        }
        throw new IllegalArgumentException("jsonAdapter == null");
    }

    public <T> JsonAdapter<T> adapter(Type type, Class<? extends Annotation>... clsArr) {
        if (clsArr.length == 1) {
            return adapter(type, clsArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(clsArr.length);
        for (Class<? extends Annotation> cls : clsArr) {
            linkedHashSet.add(Types.createJsonQualifierImplementation(cls));
        }
        return adapter(type, Collections.unmodifiableSet(linkedHashSet));
    }

    public <T> JsonAdapter<T> adapter(Type type, Set<? extends Annotation> set) {
        return adapter(type, set, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.squareup.moshi.JsonAdapter] */
    public <T> JsonAdapter<T> adapter(Type type, Set<? extends Annotation> set, String str) {
        ak akVar;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set != null) {
            Type removeSubtypeWildcard = Util.removeSubtypeWildcard(Util.canonicalize(type));
            Object cacheKey = cacheKey(removeSubtypeWildcard, set);
            synchronized (this.adapterCache) {
                try {
                    JsonAdapter<T> jsonAdapter = (JsonAdapter) this.adapterCache.get(cacheKey);
                    if (jsonAdapter != null) {
                        return jsonAdapter;
                    }
                    al alVar = this.lookupChainThreadLocal.get();
                    if (alVar == null) {
                        alVar = new al(this);
                        this.lookupChainThreadLocal.set(alVar);
                    }
                    ArrayList arrayList = alVar.alpha;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        ArrayDeque arrayDeque = alVar.bravo;
                        if (i4 < size) {
                            akVar = (ak) arrayList.get(i4);
                            if (akVar.charlie.equals(cacheKey)) {
                                arrayDeque.add(akVar);
                                ?? r12 = akVar.delta;
                                if (r12 != 0) {
                                    akVar = r12;
                                }
                            } else {
                                i4++;
                            }
                        } else {
                            ak akVar2 = new ak(removeSubtypeWildcard, str, cacheKey);
                            arrayList.add(akVar2);
                            arrayDeque.add(akVar2);
                            akVar = null;
                            break;
                        }
                    }
                    try {
                        if (akVar != null) {
                            return akVar;
                        }
                        try {
                            int size2 = this.factories.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                JsonAdapter<T> jsonAdapter2 = (JsonAdapter<T>) this.factories.get(i5).create(removeSubtypeWildcard, set, this);
                                if (jsonAdapter2 != null) {
                                    ((ak) alVar.bravo.getLast()).delta = jsonAdapter2;
                                    alVar.bravo(true);
                                    return jsonAdapter2;
                                }
                            }
                            throw new IllegalArgumentException("No JsonAdapter for " + Util.typeAnnotatedWithAnnotations(removeSubtypeWildcard, set));
                        } catch (IllegalArgumentException e) {
                            throw alVar.alpha(e);
                        }
                    } finally {
                        alVar.bravo(false);
                    }
                } finally {
                }
            }
        }
        throw new NullPointerException("annotations == null");
    }
}
