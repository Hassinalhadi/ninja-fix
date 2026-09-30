package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ag implements JsonAdapter.Factory {
    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        Class<?> rawType;
        if (!set.isEmpty() || (rawType = Types.getRawType(type)) != Map.class) {
            return null;
        }
        Type[] mapKeyAndValueTypes = Types.mapKeyAndValueTypes(type, rawType);
        return new ah(moshi, mapKeyAndValueTypes[0], mapKeyAndValueTypes[1]).nullSafe();
    }
}
