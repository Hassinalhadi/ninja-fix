package com.squareup.moshi;

import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ah extends JsonAdapter {
    public static final ag charlie = new Object();
    public final JsonAdapter alpha;
    public final JsonAdapter bravo;

    public ah(Moshi moshi, Type type, Type type2) {
        this.alpha = moshi.adapter(type);
        this.bravo = moshi.adapter(type2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        af afVar = new af();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            jsonReader.promoteNameToValue();
            Object fromJson = this.alpha.fromJson(jsonReader);
            Object fromJson2 = this.bravo.fromJson(jsonReader);
            Object put = afVar.put(fromJson, fromJson2);
            if (put != null) {
                throw new JsonDataException("Map key '" + fromJson + "' has multiple values at path " + jsonReader.getPath() + ": " + put + " and " + fromJson2);
            }
        }
        jsonReader.endObject();
        return afVar;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (entry.getKey() != null) {
                jsonWriter.promoteValueToName();
                this.alpha.toJson(jsonWriter, (JsonWriter) entry.getKey());
                this.bravo.toJson(jsonWriter, (JsonWriter) entry.getValue());
            } else {
                throw new JsonDataException("Map key is null at " + jsonWriter.getPath());
            }
        }
        jsonWriter.endObject();
    }

    public final String toString() {
        return "JsonAdapter(" + this.alpha + "=" + this.bravo + ")";
    }
}
