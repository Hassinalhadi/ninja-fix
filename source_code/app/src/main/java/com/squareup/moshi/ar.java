package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.Util;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ar extends JsonAdapter {
    public final Class alpha;
    public final String[] bravo;
    public final Enum[] charlie;
    public final JsonReader.Options delta;

    public ar(Class cls) {
        this.alpha = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.charlie = enumArr;
            this.bravo = new String[enumArr.length];
            int i4 = 0;
            while (true) {
                Enum[] enumArr2 = this.charlie;
                if (i4 < enumArr2.length) {
                    String name = enumArr2[i4].name();
                    this.bravo[i4] = Util.jsonName(name, cls.getField(name));
                    i4++;
                } else {
                    this.delta = JsonReader.Options.of(this.bravo);
                    return;
                }
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e);
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        int selectString = jsonReader.selectString(this.delta);
        if (selectString != -1) {
            return this.charlie[selectString];
        }
        String path = jsonReader.getPath();
        throw new JsonDataException("Expected one of " + Arrays.asList(this.bravo) + " but was " + jsonReader.nextString() + " at path " + path);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        jsonWriter.value(this.bravo[((Enum) obj).ordinal()]);
    }

    public final String toString() {
        return "JsonAdapter(" + this.alpha.getName() + ")";
    }
}
