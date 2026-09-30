package com.incognia.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h5 extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XKr f10521b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(XKr xKr) {
        super(1);
        this.f10521b = xKr;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JSONObject jSONObject;
        List list = (List) obj;
        ozT ozt = this.f10521b.f9911b;
        ozt.getClass();
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(ozt.f11042b.invoke(it.next()));
            }
            jSONObject = new JSONObject().put(ozt.f11043f9, jSONArray);
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }
}
