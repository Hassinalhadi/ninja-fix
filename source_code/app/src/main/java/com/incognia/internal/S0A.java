package com.incognia.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class S0A {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f9574b;

    public S0A(JSONObject jSONObject) {
        this.f9574b = new AtomicReference(jSONObject == null ? new JSONObject() : jSONObject);
    }

    public final List b(String str, List list) {
        JSONArray optJSONArray = ((JSONObject) this.f9574b.get()).optJSONArray(str);
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            try {
                int length = optJSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    String string = optJSONArray.getString(i4);
                    if (string.length() > 0) {
                        arrayList.add(string);
                    }
                }
                return arrayList;
            } catch (JSONException unused) {
            }
        }
        return list;
    }
}
