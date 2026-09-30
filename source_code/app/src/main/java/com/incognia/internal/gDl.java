package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class gDl extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final gDl f10467b = new gDl();

    public gDl() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        JSONObject jSONObject = (JSONObject) obj;
        String str2 = wJ.f11740b;
        if (!jSONObject.isNull(str2)) {
            int i4 = jSONObject.getInt(str2);
            String str3 = wJ.f11739W;
            if (!jSONObject.isNull(str3)) {
                long j5 = jSONObject.getLong(str3);
                String str4 = wJ.f11741f9;
                if (!jSONObject.isNull(str4)) {
                    str = jSONObject.getString(str4);
                } else {
                    str = null;
                }
                return new sh(i4, j5, str);
            }
            throw new IllegalArgumentException("Non-nullable field missing in JSON.");
        }
        throw new IllegalArgumentException("Non-nullable field missing in JSON.");
    }
}
