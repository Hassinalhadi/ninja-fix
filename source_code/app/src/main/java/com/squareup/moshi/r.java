package com.squareup.moshi;

/* loaded from: classes2.dex */
public final class r extends JsonAdapter {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ JsonAdapter bravo;

    public /* synthetic */ r(JsonAdapter jsonAdapter, int i4) {
        this.alpha = i4;
        this.bravo = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        switch (this.alpha) {
            case 0:
                return this.bravo.fromJson(jsonReader);
            case 1:
                boolean isLenient = jsonReader.isLenient();
                jsonReader.setLenient(true);
                try {
                    return this.bravo.fromJson(jsonReader);
                } finally {
                    jsonReader.setLenient(isLenient);
                }
            default:
                boolean failOnUnknown = jsonReader.failOnUnknown();
                jsonReader.setFailOnUnknown(true);
                try {
                    return this.bravo.fromJson(jsonReader);
                } finally {
                    jsonReader.setFailOnUnknown(failOnUnknown);
                }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final boolean isLenient() {
        switch (this.alpha) {
            case 0:
                return this.bravo.isLenient();
            case 1:
                return true;
            default:
                return this.bravo.isLenient();
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        switch (this.alpha) {
            case 0:
                boolean serializeNulls = jsonWriter.getSerializeNulls();
                jsonWriter.setSerializeNulls(true);
                try {
                    this.bravo.toJson(jsonWriter, (JsonWriter) obj);
                    return;
                } finally {
                    jsonWriter.setSerializeNulls(serializeNulls);
                }
            case 1:
                boolean isLenient = jsonWriter.isLenient();
                jsonWriter.setLenient(true);
                try {
                    this.bravo.toJson(jsonWriter, (JsonWriter) obj);
                    return;
                } finally {
                    jsonWriter.setLenient(isLenient);
                }
            default:
                this.bravo.toJson(jsonWriter, (JsonWriter) obj);
                return;
        }
    }

    public final String toString() {
        switch (this.alpha) {
            case 0:
                return this.bravo + ".serializeNulls()";
            case 1:
                return this.bravo + ".lenient()";
            default:
                return this.bravo + ".failOnUnknown()";
        }
    }
}
