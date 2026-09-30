package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class pXB extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ cFV f11078W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11079b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pXB(cFV cfv, boolean z2) {
        super(1);
        this.f11079b = z2;
        this.f11078W = cfv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        BGx bGx = (BGx) obj;
        if (this.f11079b) {
            jk jkVar = this.f11078W.f10235J;
            BGx R10 = cFV.R();
            if (R10 != null && bGx != null && R10.gmP == bGx.gmP && R10.f8409b == bGx.f8409b && R10.f8408W == bGx.f8408W && R10.f8410f9 == bGx.f8410f9 && R10.sVU == bGx.sVU && Intrinsics.areEqual(R10.IB, bGx.IB)) {
                z2 = false;
                return Boolean.valueOf(z2);
            }
        }
        z2 = true;
        return Boolean.valueOf(z2);
    }
}
