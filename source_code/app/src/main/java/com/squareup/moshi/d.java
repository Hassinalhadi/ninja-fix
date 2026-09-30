package com.squareup.moshi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes2.dex */
public final class d extends e {
    public JsonAdapter hotel;
    public final /* synthetic */ Type[] india;
    public final /* synthetic */ Type juliet;
    public final /* synthetic */ Set kilo;
    public final /* synthetic */ Set lima;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Type type, Set set, Object obj, Method method, int i4, boolean z2, Type[] typeArr, Type type2, Set set2, Set set3) {
        super(type, set, obj, method, i4, 1, z2);
        this.india = typeArr;
        this.juliet = type2;
        this.kilo = set2;
        this.lima = set3;
    }

    @Override // com.squareup.moshi.e
    public final void alpha(Moshi moshi, f fVar) {
        JsonAdapter adapter;
        super.alpha(moshi, fVar);
        Type[] typeArr = this.india;
        boolean equals = Types.equals(typeArr[0], this.juliet);
        Set<? extends Annotation> set = this.kilo;
        if (equals && set.equals(this.lima)) {
            adapter = moshi.nextAdapter(fVar, typeArr[0], set);
        } else {
            adapter = moshi.adapter(typeArr[0], set);
        }
        this.hotel = adapter;
    }

    @Override // com.squareup.moshi.e
    public final Object bravo(JsonReader jsonReader) {
        return charlie(this.hotel.fromJson(jsonReader));
    }
}
