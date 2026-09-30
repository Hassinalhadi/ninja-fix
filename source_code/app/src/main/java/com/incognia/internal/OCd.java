package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class OCd extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final OCd f9289b = new OCd();

    public OCd() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        sD sDVar = (sD) obj;
        String str = nGc.f10943b;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(nGc.f10943b, sDVar.f11281b);
        jSONObject.put(nGc.f10942W, sDVar.f11280W);
        Long l10 = sDVar.f11282f9;
        if (l10 != null) {
            jSONObject.put(nGc.f10944f9, l10);
        }
        return jSONObject;
    }
}
