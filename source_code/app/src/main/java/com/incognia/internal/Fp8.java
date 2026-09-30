package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Fp8 extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Fp8 f8736b = new Fp8();

    public Fp8() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return SM.b((JSONObject) obj);
    }
}
