package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class e {
    public final Type alpha;
    public final Set bravo;
    public final Object charlie;
    public final Method delta;
    public final int echo;
    public final JsonAdapter[] foxtrot;
    public final boolean golf;

    public e(Type type, Set set, Object obj, Method method, int i4, int i5, boolean z2) {
        this.alpha = Util.canonicalize(type);
        this.bravo = set;
        this.charlie = obj;
        this.delta = method;
        this.echo = i5;
        this.foxtrot = new JsonAdapter[i4 - i5];
        this.golf = z2;
    }

    public void alpha(Moshi moshi, f fVar) {
        JsonAdapter adapter;
        JsonAdapter[] jsonAdapterArr = this.foxtrot;
        if (jsonAdapterArr.length > 0) {
            Method method = this.delta;
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length = genericParameterTypes.length;
            int i4 = this.echo;
            for (int i5 = i4; i5 < length; i5++) {
                Type type = ((ParameterizedType) genericParameterTypes[i5]).getActualTypeArguments()[0];
                Set<? extends Annotation> jsonAnnotations = Util.jsonAnnotations(parameterAnnotations[i5]);
                int i10 = i5 - i4;
                if (Types.equals(this.alpha, type) && this.bravo.equals(jsonAnnotations)) {
                    adapter = moshi.nextAdapter(fVar, type, jsonAnnotations);
                } else {
                    adapter = moshi.adapter(type, jsonAnnotations);
                }
                jsonAdapterArr[i10] = adapter;
            }
        }
    }

    public Object bravo(JsonReader jsonReader) {
        throw new AssertionError();
    }

    public final Object charlie(Object obj) {
        JsonAdapter[] jsonAdapterArr = this.foxtrot;
        Object[] objArr = new Object[jsonAdapterArr.length + 1];
        objArr[0] = obj;
        System.arraycopy(jsonAdapterArr, 0, objArr, 1, jsonAdapterArr.length);
        try {
            return this.delta.invoke(this.charlie, objArr);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public void delta(JsonWriter jsonWriter, Object obj) {
        throw new AssertionError();
    }
}
