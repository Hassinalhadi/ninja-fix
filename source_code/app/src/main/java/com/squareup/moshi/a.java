package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a extends JsonAdapter {
    public final /* synthetic */ e alpha;
    public final /* synthetic */ JsonAdapter bravo;
    public final /* synthetic */ e charlie;
    public final /* synthetic */ Set delta;
    public final /* synthetic */ Type echo;

    public a(e eVar, JsonAdapter jsonAdapter, Moshi moshi, e eVar2, Set set, Type type) {
        this.alpha = eVar;
        this.bravo = jsonAdapter;
        this.charlie = eVar2;
        this.delta = set;
        this.echo = type;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        e eVar = this.charlie;
        if (eVar == null) {
            return this.bravo.fromJson(jsonReader);
        }
        if (!eVar.golf && jsonReader.peek() == JsonReader.Token.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return eVar.bravo(jsonReader);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new JsonDataException(cause + " at " + jsonReader.getPath(), cause);
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        e eVar = this.alpha;
        if (eVar == null) {
            this.bravo.toJson(jsonWriter, (JsonWriter) obj);
            return;
        }
        if (!eVar.golf && obj == null) {
            jsonWriter.nullValue();
            return;
        }
        try {
            eVar.delta(jsonWriter, obj);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new JsonDataException(cause + " at " + jsonWriter.getPath(), cause);
        }
    }

    public final String toString() {
        return "JsonAdapter" + this.delta + "(" + this.echo + ")";
    }
}
