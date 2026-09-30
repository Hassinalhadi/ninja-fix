package com.incognia.internal;

import G6.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class bkG extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k8E f10198b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkG(k8E k8e) {
        super(0);
        this.f10198b = k8e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z2 = true;
        if (!((Boolean) this.f10198b.f10741V.getValue()).booleanValue() || !k8E.b(this.f10198b, Integer.TYPE, a.class)) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
