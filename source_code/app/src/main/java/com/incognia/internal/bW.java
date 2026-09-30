package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class bW extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final bW f10183b = new bW();

    public bW() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = HhA.f8863b;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = ((TOS) obj).f9672b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            jSONArray.put((JSONObject) obj2);
        }
        jSONObject.put(HhA.f8863b, jSONArray);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.echo(jSONObject2, "<this>");
        byte[] bytes = jSONObject2.getBytes(a.alpha);
        Intrinsics.delta(bytes, "getBytes(...)");
        return bytes;
    }
}
