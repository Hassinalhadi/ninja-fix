package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class HZ0 extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final HZ0 f8848b = new HZ0();

    public HZ0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String str = AMm.f8358b;
        if (!jSONObject.isNull(str)) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i4)));
            }
            String str2 = AMm.f8357W;
            if (!jSONObject.isNull(str2)) {
                ArrayList arrayList2 = new ArrayList();
                JSONArray jSONArray2 = jSONObject.getJSONArray(str2);
                int length2 = jSONArray2.length();
                for (int i5 = 0; i5 < length2; i5++) {
                    arrayList2.add(Integer.valueOf(jSONArray2.getInt(i5)));
                }
                return new ORV(arrayList, arrayList2);
            }
            throw new IllegalArgumentException("Non-nullable field missing in JSON.");
        }
        throw new IllegalArgumentException("Non-nullable field missing in JSON.");
    }
}
