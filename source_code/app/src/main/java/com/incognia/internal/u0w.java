package com.incognia.internal;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class u0w extends kotlin.jvm.internal.i implements Function1 {
    public u0w(cFV cfv) {
        super(1, 0, cFV.class, cfv, "isLocationAccurate", "isLocationAccurate(Lcom/incognia/internal/os/location/Location;)Z");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        ((cFV) this.receiver).getClass();
        if (((BGx) obj).f8410f9 <= cFV.f10229H) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
