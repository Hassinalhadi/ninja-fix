package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Ob extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Ob f9321b = new Ob();

    public Ob() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long l10;
        JSONObject jSONObject = (JSONObject) obj;
        String str = u24.f11439b;
        Long l11 = null;
        if (!jSONObject.isNull(str)) {
            l10 = Long.valueOf(jSONObject.getLong(str));
        } else {
            l10 = null;
        }
        String str2 = u24.f11438W;
        if (!jSONObject.isNull(str2)) {
            l11 = Long.valueOf(jSONObject.getLong(str2));
        }
        return new SO(l10, l11);
    }
}
