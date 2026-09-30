package com.incognia.internal;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class sb extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final sb f11307b = new sb();

    public sb() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        M39 m39 = (M39) obj;
        String str = XTA.f9930b;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(XTA.f9930b, m39.f9097b);
        jSONObject.put(XTA.f9929W, m39.f9096W);
        if (m39.f9098f9 != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = m39.f9098f9.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            jSONObject.put(XTA.f9931f9, jSONArray);
        }
        return jSONObject;
    }
}
