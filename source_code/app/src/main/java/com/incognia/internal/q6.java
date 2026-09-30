package com.incognia.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class q6 extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V2 f11127b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(V2 v22) {
        super(0);
        this.f11127b = v22;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean booleanValue = ((Boolean) this.f11127b.gmP.f10741V.getValue()).booleanValue();
        S0A s0a = this.f11127b.f9753W;
        boolean z2 = true;
        boolean optBoolean = ((JSONObject) s0a.f9574b.get()).optBoolean(V2.f9749E, true);
        if (!booleanValue || !optBoolean) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
