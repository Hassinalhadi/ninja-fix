package com.incognia.internal;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class AMm {

    /* renamed from: b, reason: collision with root package name */
    public static final String f8358b = ICR.b(new byte[]{1, -113, 84, -24, 99, 31, -114, 64, -58, -119, -37, 44, 60, -81, 117, 2, 116, 36, -60, 43, 10, 123, 16, 116, -116, 50, 73, 51, 27, Byte.MIN_VALUE, -76, 57});

    /* renamed from: W, reason: collision with root package name */
    public static final String f8357W = ICR.b(new byte[]{-33, 54, 97, -110, -91, -107, -36, 30, -42, -123, -5, -88, -60, -28, -105, 99, 106, -4, 24, -30, -9, 80, -90, 80, 27, 67, 17, -7, -58, Byte.MIN_VALUE, -101, -44});

    public static JSONObject b(ORV orv) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = orv.f9307b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((Number) it.next()).intValue());
        }
        jSONObject.put(f8358b, jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = orv.f9306W.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((Number) it2.next()).intValue());
        }
        jSONObject.put(f8357W, jSONArray2);
        return jSONObject;
    }
}
