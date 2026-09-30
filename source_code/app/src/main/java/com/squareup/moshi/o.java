package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class o implements JsonAdapter.Factory {
    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        Class<?> rawType = Types.getRawType(type);
        if (set.isEmpty()) {
            if (rawType != List.class && rawType != Collection.class) {
                if (rawType == Set.class) {
                    return new p(moshi.adapter(Types.collectionElementType(type, Collection.class)), 1).nullSafe();
                }
                return null;
            }
            return new p(moshi.adapter(Types.collectionElementType(type, Collection.class)), 0).nullSafe();
        }
        return null;
    }
}
