package com.squareup.moshi;

import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class ao extends JsonAdapter {
    public final /* synthetic */ int alpha;

    public /* synthetic */ ao(int i4) {
        this.alpha = i4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        switch (this.alpha) {
            case 0:
                return jsonReader.nextString();
            case 1:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 2:
                return Byte.valueOf((byte) at.alpha(jsonReader, "a byte", -128, 255));
            case 3:
                String nextString = jsonReader.nextString();
                if (nextString.length() <= 1) {
                    return Character.valueOf(nextString.charAt(0));
                }
                throw new JsonDataException(av.q.foxtrot("Expected a char but was ", AbstractC2327c.victor('\"', "\"", nextString), " at path ", jsonReader.getPath()));
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                float nextDouble = (float) jsonReader.nextDouble();
                if (!jsonReader.isLenient() && Float.isInfinite(nextDouble)) {
                    throw new JsonDataException("JSON forbids NaN and infinities: " + nextDouble + " at path " + jsonReader.getPath());
                }
                return Float.valueOf(nextDouble);
            case 6:
                return Integer.valueOf(jsonReader.nextInt());
            case 7:
                return Long.valueOf(jsonReader.nextLong());
            default:
                return Short.valueOf((short) at.alpha(jsonReader, "a short", -32768, 32767));
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        switch (this.alpha) {
            case 0:
                jsonWriter.value((String) obj);
                return;
            case 1:
                jsonWriter.value(((Boolean) obj).booleanValue());
                return;
            case 2:
                jsonWriter.value(((Byte) obj).intValue() & 255);
                return;
            case 3:
                jsonWriter.value(((Character) obj).toString());
                return;
            case 4:
                jsonWriter.value(((Double) obj).doubleValue());
                return;
            case 5:
                Float f5 = (Float) obj;
                f5.getClass();
                jsonWriter.value(f5);
                return;
            case 6:
                jsonWriter.value(((Integer) obj).intValue());
                return;
            case 7:
                jsonWriter.value(((Long) obj).longValue());
                return;
            default:
                jsonWriter.value(((Short) obj).intValue());
                return;
        }
    }

    public final String toString() {
        switch (this.alpha) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
