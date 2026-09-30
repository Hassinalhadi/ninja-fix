package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ocM extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final ocM f11026b = new ocM();

    public ocM() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        sh shVar = (sh) obj;
        String str = wJ.f11740b;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(wJ.f11740b, shVar.f11317b);
        jSONObject.put(wJ.f11739W, shVar.f11316W);
        String str2 = shVar.f11318f9;
        if (str2 != null) {
            jSONObject.put(wJ.f11741f9, str2);
        }
        return jSONObject;
    }
}
