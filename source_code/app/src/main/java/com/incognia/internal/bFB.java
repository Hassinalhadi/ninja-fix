package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class bFB extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final bFB f10165b = new bFB();

    public bFB() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        JSONObject jSONObject = (JSONObject) obj;
        String str = XTA.f9930b;
        if (!jSONObject.isNull(str)) {
            long j5 = jSONObject.getLong(str);
            String str2 = XTA.f9929W;
            if (!jSONObject.isNull(str2)) {
                int i4 = jSONObject.getInt(str2);
                String str3 = XTA.f9931f9;
                if (!jSONObject.isNull(str3)) {
                    arrayList = new ArrayList();
                    JSONArray jSONArray = jSONObject.getJSONArray(str3);
                    int length = jSONArray.length();
                    for (int i5 = 0; i5 < length; i5++) {
                        arrayList.add(jSONArray.getString(i5));
                    }
                } else {
                    arrayList = null;
                }
                return new M39(j5, i4, arrayList);
            }
            throw new IllegalArgumentException("Non-nullable field missing in JSON.");
        }
        throw new IllegalArgumentException("Non-nullable field missing in JSON.");
    }
}
