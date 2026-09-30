package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class jSM extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final jSM f10688b = new jSM();

    public jSM() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Am am2 = (Am) obj;
        String str = SM.f9592b;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SM.f9592b, am2.f8380b);
        jSONObject.put(SM.f9591W, am2.f8379W);
        jSONObject.put(SM.f9593f9, am2.f8381f9);
        return jSONObject;
    }
}
