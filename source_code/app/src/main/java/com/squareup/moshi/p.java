package com.squareup.moshi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class p extends q {
    public final /* synthetic */ int charlie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(JsonAdapter jsonAdapter, int i4) {
        super(jsonAdapter);
        this.charlie = i4;
    }

    public final Collection alpha() {
        switch (this.charlie) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        switch (this.charlie) {
            case 0:
                Collection alpha = alpha();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ((ArrayList) alpha).add(this.alpha.fromJson(jsonReader));
                }
                jsonReader.endArray();
                return alpha;
            default:
                Collection alpha2 = alpha();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    alpha2.add(this.alpha.fromJson(jsonReader));
                }
                jsonReader.endArray();
                return alpha2;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        switch (this.charlie) {
            case 0:
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    this.alpha.toJson(jsonWriter, (JsonWriter) it.next());
                }
                jsonWriter.endArray();
                return;
            default:
                jsonWriter.beginArray();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    this.alpha.toJson(jsonWriter, (JsonWriter) it2.next());
                }
                jsonWriter.endArray();
                return;
        }
    }
}
