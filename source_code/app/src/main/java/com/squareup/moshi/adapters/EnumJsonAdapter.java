package com.squareup.moshi.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.Enum;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {
    final T[] constants;
    final Class<T> enumType;
    final T fallbackValue;
    final String[] nameStrings;
    final JsonReader.Options options;
    final boolean useFallbackValue;

    public EnumJsonAdapter(Class<T> cls, T t5, boolean z2) {
        this.enumType = cls;
        this.fallbackValue = t5;
        this.useFallbackValue = z2;
        try {
            T[] enumConstants = cls.getEnumConstants();
            this.constants = enumConstants;
            this.nameStrings = new String[enumConstants.length];
            int i4 = 0;
            while (true) {
                T[] tArr = this.constants;
                if (i4 < tArr.length) {
                    String name = tArr[i4].name();
                    this.nameStrings[i4] = Util.jsonName(name, cls.getField(name));
                    i4++;
                } else {
                    this.options = JsonReader.Options.of(this.nameStrings);
                    return;
                }
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e);
        }
    }

    public static <T extends Enum<T>> EnumJsonAdapter<T> create(Class<T> cls) {
        return new EnumJsonAdapter<>(cls, null, false);
    }

    public String toString() {
        return "EnumJsonAdapter(" + this.enumType.getName() + ")";
    }

    public EnumJsonAdapter<T> withUnknownFallback(T t5) {
        return new EnumJsonAdapter<>(this.enumType, t5, true);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(JsonReader jsonReader) throws IOException {
        int selectString = jsonReader.selectString(this.options);
        if (selectString != -1) {
            return this.constants[selectString];
        }
        String path = jsonReader.getPath();
        if (this.useFallbackValue) {
            if (jsonReader.peek() == JsonReader.Token.STRING) {
                jsonReader.skipValue();
                return this.fallbackValue;
            }
            throw new JsonDataException("Expected a string but was " + jsonReader.peek() + " at path " + path);
        }
        throw new JsonDataException("Expected one of " + Arrays.asList(this.nameStrings) + " but was " + jsonReader.nextString() + " at path " + path);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, T t5) throws IOException {
        if (t5 != null) {
            jsonWriter.value(this.nameStrings[t5.ordinal()]);
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }
}
