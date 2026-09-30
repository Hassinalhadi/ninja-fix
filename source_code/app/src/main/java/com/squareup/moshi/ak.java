package com.squareup.moshi;

import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class ak extends JsonAdapter {
    public final Type alpha;
    public final String bravo;
    public final Object charlie;
    public JsonAdapter delta;

    public ak(Type type, String str, Object obj) {
        this.alpha = type;
        this.bravo = str;
        this.charlie = obj;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        JsonAdapter jsonAdapter = this.delta;
        if (jsonAdapter != null) {
            return jsonAdapter.fromJson(jsonReader);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        JsonAdapter jsonAdapter = this.delta;
        if (jsonAdapter != null) {
            jsonAdapter.toJson(jsonWriter, (JsonWriter) obj);
            return;
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    public final String toString() {
        JsonAdapter jsonAdapter = this.delta;
        if (jsonAdapter != null) {
            return jsonAdapter.toString();
        }
        return super.toString();
    }
}
