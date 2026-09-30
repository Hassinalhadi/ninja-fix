package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;
import s6.AbstractC2665h0;

/* loaded from: classes2.dex */
public final class n extends JsonAdapter {
    public static final l delta = new Object();
    public final AbstractC2665h0 alpha;
    public final m[] bravo;
    public final JsonReader.Options charlie;

    public n(AbstractC2665h0 abstractC2665h0, TreeMap treeMap) {
        this.alpha = abstractC2665h0;
        this.bravo = (m[]) treeMap.values().toArray(new m[treeMap.size()]);
        this.charlie = JsonReader.Options.of((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        try {
            Object bravo = this.alpha.bravo();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    int selectName = jsonReader.selectName(this.charlie);
                    if (selectName == -1) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else {
                        m mVar = this.bravo[selectName];
                        mVar.bravo.set(bravo, mVar.charlie.fromJson(jsonReader));
                    }
                }
                jsonReader.endObject();
                return bravo;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e4) {
            throw Util.rethrowCause(e4);
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        try {
            jsonWriter.beginObject();
            for (m mVar : this.bravo) {
                jsonWriter.name(mVar.alpha);
                mVar.charlie.toJson(jsonWriter, (JsonWriter) mVar.bravo.get(obj));
            }
            jsonWriter.endObject();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.alpha + ")";
    }
}
