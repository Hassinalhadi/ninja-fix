package com.incognia.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class se extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k8E f11313b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(k8E k8e) {
        super(0);
        this.f11313b = k8e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z2;
        if (((Boolean) this.f11313b.gmP.getValue()).booleanValue() && k8E.b(this.f11313b, "com.google.android.gms.location.FusedLocationProviderClient")) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
