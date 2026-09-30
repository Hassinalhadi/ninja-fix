package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class as extends JsonAdapter {
    public final Moshi alpha;
    public final JsonAdapter bravo;
    public final JsonAdapter charlie;
    public final JsonAdapter delta;
    public final JsonAdapter echo;
    public final JsonAdapter foxtrot;

    public as(Moshi moshi) {
        this.alpha = moshi;
        this.bravo = moshi.adapter(List.class);
        this.charlie = moshi.adapter(Map.class);
        this.delta = moshi.adapter(String.class);
        this.echo = moshi.adapter(Double.class);
        this.foxtrot = moshi.adapter(Boolean.class);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        switch (ap.alpha[jsonReader.peek().ordinal()]) {
            case 1:
                return this.bravo.fromJson(jsonReader);
            case 2:
                return this.charlie.fromJson(jsonReader);
            case 3:
                return this.delta.fromJson(jsonReader);
            case 4:
                return this.echo.fromJson(jsonReader);
            case 5:
                return this.foxtrot.fromJson(jsonReader);
            case 6:
                return jsonReader.nextNull();
            default:
                throw new IllegalStateException("Expected a value but was " + jsonReader.peek() + " at path " + jsonReader.getPath());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r1.isAssignableFrom(r0) != false) goto L8;
     */
    @Override // com.squareup.moshi.JsonAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Class<?> cls = obj.getClass();
        if (cls == Object.class) {
            jsonWriter.beginObject();
            jsonWriter.endObject();
            return;
        }
        Class<?> cls2 = Map.class;
        if (!cls2.isAssignableFrom(cls)) {
            cls2 = Collection.class;
        }
        cls = cls2;
        this.alpha.adapter(cls, Util.NO_ANNOTATIONS).toJson(jsonWriter, (JsonWriter) obj);
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }
}
