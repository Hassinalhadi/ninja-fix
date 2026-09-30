package com.squareup.moshi.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;

/* loaded from: classes2.dex */
public final class b extends JsonAdapter {
    public final /* synthetic */ Object alpha;
    public final /* synthetic */ PolymorphicJsonAdapterFactory bravo;

    public b(PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactory, Object obj) {
        this.bravo = polymorphicJsonAdapterFactory;
        this.alpha = obj;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.skipValue();
        return this.alpha;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        throw new IllegalArgumentException("Expected one of " + this.bravo.subtypes + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
    }
}
