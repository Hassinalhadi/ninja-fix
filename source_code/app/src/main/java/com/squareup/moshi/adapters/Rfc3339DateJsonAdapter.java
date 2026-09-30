package com.squareup.moshi.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.util.Date;

/* loaded from: classes2.dex */
public final class Rfc3339DateJsonAdapter extends JsonAdapter<Date> {
    @Override // com.squareup.moshi.JsonAdapter
    public synchronized Date fromJson(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonReader.Token.NULL) {
            return (Date) jsonReader.nextNull();
        }
        return a.delta(jsonReader.nextString());
    }

    @Override // com.squareup.moshi.JsonAdapter
    public synchronized void toJson(JsonWriter jsonWriter, Date date) throws IOException {
        try {
            if (date == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(a.bravo(date));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
