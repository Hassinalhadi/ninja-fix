package com.squareup.moshi;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b extends e {
    public final /* synthetic */ int hotel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Type type, Set set, Object obj, Method method, int i4, int i5, boolean z2, int i10) {
        super(type, set, obj, method, i4, i5, z2);
        this.hotel = i10;
    }

    @Override // com.squareup.moshi.e
    public Object bravo(JsonReader jsonReader) {
        switch (this.hotel) {
            case 1:
                return charlie(jsonReader);
            default:
                return super.bravo(jsonReader);
        }
    }

    @Override // com.squareup.moshi.e
    public void delta(JsonWriter jsonWriter, Object obj) {
        switch (this.hotel) {
            case 0:
                JsonAdapter[] jsonAdapterArr = this.foxtrot;
                Object[] objArr = new Object[jsonAdapterArr.length + 2];
                objArr[0] = jsonWriter;
                objArr[1] = obj;
                System.arraycopy(jsonAdapterArr, 0, objArr, 2, jsonAdapterArr.length);
                try {
                    this.delta.invoke(this.charlie, objArr);
                    return;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                }
            default:
                super.delta(jsonWriter, obj);
                return;
        }
    }
}
