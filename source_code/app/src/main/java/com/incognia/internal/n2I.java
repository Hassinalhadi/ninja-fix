package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class n2I extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ long f10928W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cFV f10929b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2I(cFV cfv, long j5) {
        super(1);
        this.f10929b = cfv;
        this.f10928W = j5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        this.f10929b.f10238V.getClass();
        if (System.currentTimeMillis() - ((BGx) obj).sVU <= this.f10928W) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
