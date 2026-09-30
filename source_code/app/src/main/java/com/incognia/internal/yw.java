package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class yw {
    public static XD b(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        String str = XD.f9900J;
        String string = jSONObject2.getString(str);
        jSONObject2.remove(str);
        String str2 = XD.PqK;
        String string2 = jSONObject2.getString(str2);
        jSONObject2.remove(str2);
        String str3 = XD.f9901V;
        long j5 = jSONObject2.getLong(str3);
        jSONObject2.remove(str3);
        String str4 = XD.olU;
        String string3 = jSONObject2.getString(str4);
        jSONObject2.remove(str4);
        return new XD(string, jSONObject2, j5, string3, string2);
    }
}
