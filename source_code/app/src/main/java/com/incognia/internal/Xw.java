package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class Xw extends kotlin.jvm.internal.i implements Function1 {
    public Xw(Object obj) {
        super(1, 0, ozT.class, obj, "deserializeFromJson", "deserializeFromJson(Lorg/json/JSONObject;)Ljava/util/List;");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JSONArray jSONArray;
        JSONObject jSONObject = (JSONObject) obj;
        ozT ozt = (ozT) this.receiver;
        if (jSONObject != null) {
            jSONArray = jSONObject.optJSONArray(ozt.f11043f9);
        } else {
            ozt.getClass();
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            arrayList.add(ozt.f11041W.invoke(jSONArray.getJSONObject(i4)));
        }
        return arrayList;
    }
}
