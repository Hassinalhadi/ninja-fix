package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class eIC extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final eIC f10358b = new eIC();

    public eIC() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long l10;
        JSONObject jSONObject = (JSONObject) obj;
        String str = nGc.f10943b;
        if (!jSONObject.isNull(str)) {
            String string = jSONObject.getString(str);
            String str2 = nGc.f10942W;
            if (!jSONObject.isNull(str2)) {
                long j5 = jSONObject.getLong(str2);
                String str3 = nGc.f10944f9;
                if (!jSONObject.isNull(str3)) {
                    l10 = Long.valueOf(jSONObject.getLong(str3));
                } else {
                    l10 = null;
                }
                return new sD(string, j5, l10);
            }
            throw new IllegalArgumentException("Non-nullable field missing in JSON.");
        }
        throw new IllegalArgumentException("Non-nullable field missing in JSON.");
    }
}
