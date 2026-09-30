package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ai implements JsonAdapter.Factory {
    public final /* synthetic */ Type alpha;
    public final /* synthetic */ JsonAdapter bravo;

    public ai(Type type, JsonAdapter jsonAdapter) {
        this.alpha = type;
        this.bravo = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        if (set.isEmpty() && Util.typesMatch(this.alpha, type)) {
            return this.bravo;
        }
        return null;
    }
}
