package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Wiq extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Wiq f9865b = new Wiq();

    public Wiq() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String str = Kdw.f9016b;
        if (!jSONObject.isNull(str)) {
            int i4 = jSONObject.getInt(str);
            String str2 = Kdw.f9015W;
            if (!jSONObject.isNull(str2)) {
                return new s0(i4, jSONObject.getLong(str2));
            }
            throw new IllegalArgumentException("Non-nullable field missing in JSON.");
        }
        throw new IllegalArgumentException("Non-nullable field missing in JSON.");
    }
}
