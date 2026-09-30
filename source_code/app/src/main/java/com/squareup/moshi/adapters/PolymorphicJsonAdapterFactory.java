package com.squareup.moshi.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class PolymorphicJsonAdapterFactory<T> implements JsonAdapter.Factory {
    final Class<T> baseType;
    final JsonAdapter<Object> fallbackJsonAdapter;
    final String labelKey;
    final List<String> labels;
    final List<Type> subtypes;

    public PolymorphicJsonAdapterFactory(Class<T> cls, String str, List<String> list, List<Type> list2, JsonAdapter<Object> jsonAdapter) {
        this.baseType = cls;
        this.labelKey = str;
        this.labels = list;
        this.subtypes = list2;
        this.fallbackJsonAdapter = jsonAdapter;
    }

    private JsonAdapter<Object> buildFallbackJsonAdapter(T t5) {
        return new b(this, t5);
    }

    public static <T> PolymorphicJsonAdapterFactory<T> of(Class<T> cls, String str) {
        if (cls != null) {
            if (str != null) {
                List list = Collections.EMPTY_LIST;
                return new PolymorphicJsonAdapterFactory<>(cls, str, list, list, null);
            }
            throw new NullPointerException("labelKey == null");
        }
        throw new NullPointerException("baseType == null");
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi) {
        if (Types.getRawType(type) == this.baseType && set.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.subtypes.size());
            int size = this.subtypes.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(moshi.adapter(this.subtypes.get(i4)));
            }
            return new c(this.labelKey, this.labels, this.subtypes, arrayList, this.fallbackJsonAdapter).nullSafe();
        }
        return null;
    }

    public PolymorphicJsonAdapterFactory<T> withDefaultValue(T t5) {
        return withFallbackJsonAdapter(buildFallbackJsonAdapter(t5));
    }

    public PolymorphicJsonAdapterFactory<T> withFallbackJsonAdapter(JsonAdapter<Object> jsonAdapter) {
        return new PolymorphicJsonAdapterFactory<>(this.baseType, this.labelKey, this.labels, this.subtypes, jsonAdapter);
    }

    public PolymorphicJsonAdapterFactory<T> withSubtype(Class<? extends T> cls, String str) {
        if (cls != null) {
            if (str != null) {
                if (!this.labels.contains(str)) {
                    ArrayList arrayList = new ArrayList(this.labels);
                    arrayList.add(str);
                    ArrayList arrayList2 = new ArrayList(this.subtypes);
                    arrayList2.add(cls);
                    return new PolymorphicJsonAdapterFactory<>(this.baseType, this.labelKey, arrayList, arrayList2, this.fallbackJsonAdapter);
                }
                throw new IllegalArgumentException("Labels must be unique.");
            }
            throw new NullPointerException("label == null");
        }
        throw new NullPointerException("subtype == null");
    }
}
