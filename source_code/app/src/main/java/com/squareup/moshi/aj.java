package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes2.dex */
public final class aj implements JsonAdapter.Factory {
    public final /* synthetic */ Type alpha;
    public final /* synthetic */ Class bravo;
    public final /* synthetic */ JsonAdapter charlie;

    public aj(Type type, Class cls, JsonAdapter jsonAdapter) {
        this.alpha = type;
        this.bravo = cls;
        this.charlie = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        if (Util.typesMatch(this.alpha, type) && set.size() == 1 && Util.isAnnotationPresent(set, this.bravo)) {
            return this.charlie;
        }
        return null;
    }
}
