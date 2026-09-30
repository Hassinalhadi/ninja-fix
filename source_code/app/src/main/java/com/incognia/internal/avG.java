package com.incognia.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class avG extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final avG f10125b = new avG();

    public avG() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String str = GbW.f8794b;
        if (!jSONObject.isNull(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                linkedHashMap.put(next, Long.valueOf(jSONObject2.getLong(next)));
            }
            return new P6(linkedHashMap);
        }
        throw new IllegalArgumentException("Non-nullable field missing in JSON.");
    }
}
