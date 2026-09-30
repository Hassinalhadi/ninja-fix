package com.incognia.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class i8U extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k8E f10609b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8U(k8E k8e) {
        super(0);
        this.f10609b = k8e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z2;
        if (((Boolean) this.f10609b.gmP.getValue()).booleanValue() && k8E.b(this.f10609b, "com.google.android.gms.appset.AppSetIdClient")) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
