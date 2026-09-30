package com.squareup.moshi;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class h extends JsonAdapter {
    public static final g charlie = new Object();
    public final Class alpha;
    public final JsonAdapter bravo;

    public h(Class cls, JsonAdapter jsonAdapter) {
        this.alpha = cls;
        this.bravo = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.bravo.fromJson(jsonReader));
        }
        jsonReader.endArray();
        Object newInstance = Array.newInstance((Class<?>) this.alpha, arrayList.size());
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            Array.set(newInstance, i4, arrayList.get(i4));
        }
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i4 = 0; i4 < length; i4++) {
            this.bravo.toJson(jsonWriter, (JsonWriter) Array.get(obj, i4));
        }
        jsonWriter.endArray();
    }

    public final String toString() {
        return this.bravo + ".array()";
    }
}
