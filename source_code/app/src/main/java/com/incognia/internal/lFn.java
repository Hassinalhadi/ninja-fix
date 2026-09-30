package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class lFn extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final lFn f10815b = new lFn();

    public lFn() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JSONObject jSONObject;
        Long l10;
        byte[] bArr = (byte[]) obj;
        Long l11 = null;
        if (bArr.length == 0) {
            return null;
        }
        String str = hEG.f10529b;
        JSONObject b2 = xFC.b(bArr);
        String str2 = hEG.f10529b;
        if (!b2.isNull(str2)) {
            jSONObject = b2.getJSONObject(str2);
        } else {
            jSONObject = null;
        }
        String str3 = hEG.f10528W;
        if (!b2.isNull(str3)) {
            l10 = Long.valueOf(b2.getLong(str3));
        } else {
            l10 = null;
        }
        String str4 = hEG.f10530f9;
        if (!b2.isNull(str4)) {
            l11 = Long.valueOf(b2.getLong(str4));
        }
        return new JMS(jSONObject, l10, l11);
    }
}
