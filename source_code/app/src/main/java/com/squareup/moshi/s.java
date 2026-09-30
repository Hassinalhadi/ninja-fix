package com.squareup.moshi;

import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public final class s extends JsonAdapter {
    public final /* synthetic */ JsonAdapter alpha;
    public final /* synthetic */ String bravo;

    public s(JsonAdapter jsonAdapter, String str) {
        this.alpha = jsonAdapter;
        this.bravo = str;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        return this.alpha.fromJson(jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final boolean isLenient() {
        return this.alpha.isLenient();
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        String indent = jsonWriter.getIndent();
        jsonWriter.setIndent(this.bravo);
        try {
            this.alpha.toJson(jsonWriter, (JsonWriter) obj);
        } finally {
            jsonWriter.setIndent(indent);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.alpha);
        sb2.append(".indent(\"");
        return P0.gold(sb2, this.bravo, "\")");
    }
}
