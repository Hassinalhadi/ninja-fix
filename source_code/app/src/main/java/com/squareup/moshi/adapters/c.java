package com.squareup.moshi.adapters;

import androidx.appcompat.widget.P0;
import av.q;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c extends JsonAdapter {
    public final String alpha;
    public final List bravo;
    public final List charlie;
    public final ArrayList delta;
    public final JsonAdapter echo;
    public final JsonReader.Options foxtrot;
    public final JsonReader.Options golf;

    public c(String str, List list, List list2, ArrayList arrayList, JsonAdapter jsonAdapter) {
        this.alpha = str;
        this.bravo = list;
        this.charlie = list2;
        this.delta = arrayList;
        this.echo = jsonAdapter;
        this.foxtrot = JsonReader.Options.of(str);
        this.golf = JsonReader.Options.of((String[]) list.toArray(new String[0]));
    }

    public final int alpha(JsonReader jsonReader) {
        jsonReader.beginObject();
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            String str = this.alpha;
            if (hasNext) {
                if (jsonReader.selectName(this.foxtrot) == -1) {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                } else {
                    int selectString = jsonReader.selectString(this.golf);
                    if (selectString == -1 && this.echo == null) {
                        throw new JsonDataException("Expected one of " + this.bravo + " for key '" + str + "' but found '" + jsonReader.nextString() + "'. Register a subtype for this label.");
                    }
                    return selectString;
                }
            } else {
                throw new JsonDataException(q.echo("Missing label for ", str));
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        JsonReader peekJson = jsonReader.peekJson();
        peekJson.setFailOnUnknown(false);
        try {
            int alpha = alpha(peekJson);
            peekJson.close();
            if (alpha == -1) {
                return this.echo.fromJson(jsonReader);
            }
            return ((JsonAdapter) this.delta.get(alpha)).fromJson(jsonReader);
        } catch (Throwable th) {
            peekJson.close();
            throw th;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        JsonAdapter jsonAdapter;
        Class<?> cls = obj.getClass();
        List list = this.charlie;
        int indexOf = list.indexOf(cls);
        JsonAdapter jsonAdapter2 = this.echo;
        if (indexOf == -1) {
            if (jsonAdapter2 != null) {
                jsonAdapter = jsonAdapter2;
            } else {
                throw new IllegalArgumentException("Expected one of " + list + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
            }
        } else {
            jsonAdapter = (JsonAdapter) this.delta.get(indexOf);
        }
        jsonWriter.beginObject();
        if (jsonAdapter != jsonAdapter2) {
            jsonWriter.name(this.alpha).value((String) this.bravo.get(indexOf));
        }
        int beginFlatten = jsonWriter.beginFlatten();
        jsonAdapter.toJson(jsonWriter, (JsonWriter) obj);
        jsonWriter.endFlatten(beginFlatten);
        jsonWriter.endObject();
    }

    public final String toString() {
        return P0.gold(new StringBuilder("PolymorphicJsonAdapter("), this.alpha, ")");
    }
}
