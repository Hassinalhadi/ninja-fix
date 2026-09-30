package com.incognia.internal;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class mTX {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10903b = ICR.b(new byte[]{-25, -64, 126, 29, 6, 5, -81, -23, -98, -69, -39, -92, 22, -21, -113, 95, -23, 39, -118, 116, 45, -57, -75, 97, 25, 35, -31, -11, 114, -23, -60, 35});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10902W = ICR.b(new byte[]{123, -82, 13, -45, 118, 57, -81, 69, 88, -87, -89, 122, 74, -6, -9, -55, 21, -103, -92, -39, -121, -69, -10, -125, -118, -64, 69, 68, -59, -50, -83, 25});

    public static JSONObject b(uK uKVar) {
        JSONObject jSONObject = new JSONObject();
        Boolean bool = uKVar.f11458b;
        if (bool != null) {
            jSONObject.put(f10903b, bool.booleanValue());
        }
        VXt vXt = uKVar.f11457W;
        if (vXt != null) {
            String str = f10902W;
            String str2 = Dih.f8558b;
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = vXt.f9780b;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                fZ fZVar = (fZ) obj;
                String str3 = F3.f8639b;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(F3.f8639b, fZVar.f10427b);
                jSONObject3.put(F3.f8638W, fZVar.f10426W);
                jSONArray.put(jSONObject3);
            }
            jSONObject2.put(Dih.f8558b, jSONArray);
            jSONObject2.put(Dih.f8557W, vXt.f9779W);
            jSONObject2.put(Dih.f8559f9, vXt.f9781f9);
            jSONObject2.put(Dih.sVU, vXt.sVU);
            jSONObject.put(str, jSONObject2);
        }
        return jSONObject;
    }
}
