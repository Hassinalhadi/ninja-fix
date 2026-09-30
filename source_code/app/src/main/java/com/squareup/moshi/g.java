package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes2.dex */
public final class g implements JsonAdapter.Factory {
    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        Type arrayComponentType = Types.arrayComponentType(type);
        if (arrayComponentType == null || !set.isEmpty()) {
            return null;
        }
        return new h(Types.getRawType(arrayComponentType), moshi.adapter(arrayComponentType)).nullSafe();
    }
}
